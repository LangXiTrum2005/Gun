package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzfqw;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzf {
    public static final Handler zza = new zzfqw(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    private final JSONArray zzA(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzB(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzB(JSONArray jSONArray, @Nullable Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzi((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(zzA((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(zzh((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzC(JSONObject jSONObject, String str, @Nullable Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzo)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzi((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), zzA((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, zzA(Arrays.asList((Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i < length) {
                    numArr2[i] = Integer.valueOf(iArr[i]);
                    i++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, zzh(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i < length2) {
                    dArr3[i] = Double.valueOf(dArr2[i]);
                    i++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, zzh(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i < length3) {
                    lArr2[i] = Long.valueOf(jArr[i]);
                    i++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, zzh(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i < length4) {
                boolArr2[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, zzh(boolArr));
    }

    private static final void zzD(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, @Nullable String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int iZzx = zzx(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzsVar.zzf - iZzx, zzsVar.zzc - iZzx, 17));
        viewGroup.addView(frameLayout, zzsVar.zzf, zzsVar.zzc);
    }

    public static int zza(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return i == i2 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    @Nullable
    public static ActivityManager.MemoryInfo zzc(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
        } catch (NullPointerException unused) {
            zzo.zzj("Error retrieving the memory information.");
        }
        return memoryInfo;
    }

    public static AdSize zzd(Context context, int i, int i2, int i3) {
        int iRound;
        int iZza = zza(context, i3);
        if (iZza == -1) {
            return AdSize.INVALID;
        }
        int iMin = Math.min(90, Math.round(iZza * 0.15f));
        if (i > 655) {
            iRound = Math.round((i / 728.0f) * 90.0f);
        } else if (i > 632) {
            iRound = 81;
        } else if (i > 526) {
            iRound = Math.round((i / 468.0f) * 60.0f);
        } else {
            iRound = i > 432 ? 68 : Math.round((i / 320.0f) * 50.0f);
        }
        return new AdSize(i, Math.max(Math.min(iRound, iMin), 50));
    }

    public static String zze() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    @Nullable
    public static String zzf(String str) {
        return zzz(str, SameMD5.TAG);
    }

    @Nullable
    public static String zzg(String str) {
        return zzz(str, "SHA-256");
    }

    @VisibleForTesting
    public static boolean zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbeu.zzd.zze());
    }

    public static final int zzp(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    @Nullable
    @VisibleForTesting
    public static final String zzq(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className2) || zzc.equalsIgnoreCase(className2) || zzd.equalsIgnoreCase(className2) || zze.equalsIgnoreCase(className2) || zzf.equalsIgnoreCase(className2) || zzg.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i2].getClassName();
                break;
            }
            i = i2;
        }
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean zzr() {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().zza(zzbcl.zzlm)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzs(Context context, int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    public static final boolean zzt(Context context) {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
        return iIsGooglePlayServicesAvailable == 0 || iIsGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzu() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzv(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final void zzw(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(bc.x, Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = AbstractC3950lJ.n(GoogleApiAvailabilityLight.getInstance().getApkVersion(context), ".244410000");
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int zzx(Context context, int i) {
        return zzp(context.getResources().getDisplayMetrics(), i);
    }

    @Nullable
    public static final String zzy(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzr()) {
            string = "emulator";
        }
        return zzz(string, SameMD5.TAG);
    }

    @Nullable
    private static String zzz(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final int zzb(Context context, int i) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                try {
                    if (this.zzh < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.zzh = displayMetrics.density;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Math.round(i / this.zzh);
    }

    @VisibleForTesting
    public final JSONArray zzh(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzB(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject zzi(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzC(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzj(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzC(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final JSONObject zzk(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzi(bundle);
        } catch (JSONException e) {
            zzo.zzh("Error converting Bundle to JSON", e);
            return null;
        }
    }

    public final void zzl(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzo.zzj(str2);
        }
        zzD(viewGroup, zzsVar, str, SupportMenu.CATEGORY_MASK, ViewCompat.MEASURED_STATE_MASK);
    }

    public final void zzm(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, @Nullable String str) {
        zzD(viewGroup, zzsVar, "Ads by Google", ViewCompat.MEASURED_STATE_MASK, -1);
    }

    public final void zzn(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        zzw(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzc
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final zzt zza(String str3) {
                new zzd(this.zza, str3).start();
                return zzt.SUCCESS;
            }
        });
    }
}
