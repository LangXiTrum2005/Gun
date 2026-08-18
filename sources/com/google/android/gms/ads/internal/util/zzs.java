package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.efs.sdk.base.Constants;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzceo;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzfbo;
import com.google.android.gms.internal.ads.zzfbr;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzhfk;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.ccg.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs {
    public static final zzfqw zza = new zzf(Looper.getMainLooper());

    @GuardedBy("userAgentLock")
    private String zzh;
    private volatile String zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    private boolean zzf = true;
    private final Object zzg = new Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    @Nullable
    public static final zzbr zzA(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzB(Context context, String str) {
        Context contextZza = zzbvu.zza(context);
        return Wrappers.packageManager(contextZza).checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean zzC(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzD(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeY)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfa);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeZ);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzE(Context context) {
        KeyguardManager keyguardManagerZzY;
        return (context == null || (keyguardManagerZzY = zzY(context)) == null || !keyguardManagerZzY.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzF(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzG() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzH(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        try {
            Bundle bundleZzZ = zzZ(context);
            return TextUtils.isEmpty(zzaa(bundleZzZ)) && !TextUtils.isEmpty(bundleZzZ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    public static final boolean zzJ(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzK(View view, int i, MotionEvent motionEvent) {
        String strZza;
        int i2;
        int iHeight;
        int iWidth;
        String str;
        zzfbo zzfboVarZzD;
        zzfbr zzfbrVarZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof zzdoz) {
                childAt = ((zzdoz) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzj) || (childAt instanceof NativeAdView)) {
                strZza = "NATIVE";
                i2 = 1;
            } else {
                strZza = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            long jZzx = zzx(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            boolean z = childAt instanceof zzcga;
            String str2 = Constants.CP_NONE;
            if (!z || (zzfbrVarZzR = ((zzcga) childAt).zzR()) == null) {
                str = Constants.CP_NONE;
            } else {
                str = zzfbrVarZzR.zzb;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof zzceo) && (zzfboVarZzD = ((zzceo) childAt).zzD()) != null) {
                strZza = zzfbo.zza(zzfboVarZzD.zzb);
                i2 = zzfboVarZzD.zze;
                str2 = zzfboVarZzD.zzE;
            }
            Locale locale = Locale.US;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str2 + ", gwsQueryId=" + str + ", format=" + strZza + ", impType=" + i2 + ", class=" + childAt.getClass().getName() + ", x=" + i3 + ", y=" + i4 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jZzx + ", state=" + Integer.toString(i, 2) + ">");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzL(Context context) {
        com.google.android.gms.ads.internal.zzv.zzr();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzM(Context context, String str, String str2) {
        new zzbw(context, str, str2, null, null).zzb();
    }

    public static final void zzN(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) zzbeu.zzb.zze()).booleanValue()) {
                CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final int zzO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    @Nullable
    public static final Map zzP(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzp)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] zzQ(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? zzv() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzR(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrZzv = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? zzv() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzv[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzv[1])};
    }

    public static final boolean zzS(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzv.zzq().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long jZzx = zzx(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbu)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkv)).booleanValue()) {
                    return true;
                }
                if (jZzx >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkx)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzT(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkS)).booleanValue()) {
            zzad(context, intent);
            return;
        }
        try {
            zzad(context, intent);
        } catch (SecurityException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzU(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzp(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            com.google.android.gms.ads.internal.util.client.zzo.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzV(Activity activity) {
        int[] iArrZzQ = zzQ(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzQ[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzQ[1])};
    }

    public static final boolean zzW(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzS(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzY(context));
    }

    public static final void zzX(Context context, Intent intent, @Nullable zzdrw zzdrwVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmU)).booleanValue() || !(context instanceof zzcgq)) {
            zzT(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmW))) {
                    ((zzcgq) context).zzc(intent, 236);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmV)).booleanValue() || zzdrwVar == null) {
                        return;
                    }
                    zzdrv zzdrvVarZza = zzdrwVar.zza();
                    zzdrvVarZza.zzb(a.w, "hila");
                    zzdrvVarZza.zzb("gqi", zzfve.zzc(str));
                    zzdrvVarZza.zzf();
                    return;
                }
            }
            zzT(context, intent);
        } catch (ActivityNotFoundException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
            zzT(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
            zzT(context, intent);
        } catch (Exception e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "AdUtil.startActivityForResult");
            zzT(context, intent);
        }
    }

    @Nullable
    private static KeyguardManager zzY(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @Nullable
    private static Bundle zzZ(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    }

    private static String zzaa(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static boolean zzab(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzac(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void zzad(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String zzae(final Context context, String str) {
        String strZzr;
        String str2;
        if (str == null) {
            return zzr();
        }
        try {
            zzcg zzcgVarZza = zzcg.zza();
            if (TextUtils.isEmpty(zzcgVarZza.zza)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str2 = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzce
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    str2 = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                zze.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                zze.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                zze.zza("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context3);
                                if (z) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    zze.zza("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                zzcgVarZza.zza = str2;
            }
            strZzr = zzcgVarZza.zza;
        } catch (Exception unused) {
            strZzr = null;
        }
        if (TextUtils.isEmpty(strZzr)) {
            strZzr = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strZzr)) {
            strZzr = zzr();
        }
        String strI = DM.i(strZzr, " (Mobile; ", str);
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                strI = strI + ";aia";
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getUserAgent");
        }
        return strI.concat(")");
    }

    public static List zzd() {
        zzbcc zzbccVar = zzbcl.zza;
        List listZzb = com.google.android.gms.ads.internal.client.zzbe.zza().zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfvc.zzb(zzfty.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbzw.zza.execute(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean zzo(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void zzp(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzq(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzaa(zzZ(context));
    }

    public static final String zzr() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzs() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : DM.i(str, " ", str2);
    }

    @Nullable
    public static final Integer zzt(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzu(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzv() {
        return new int[]{0, 0};
    }

    public static final Map zzw(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzx(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    @Nullable
    public static final WebResourceResponse zzy(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", C.UTF8_NAME, new ByteArrayInputStream(str3.getBytes(C.UTF8_NAME)));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzz() {
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        return resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.s7) : "Test Ad";
    }

    public final AI zzb(final Uri uri) {
        return zzgch.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfqw zzfqwVar = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                return zzs.zzP(uri);
            }
        }, this.zzl);
    }

    public final String zzc(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzle)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzae(context, str);
            return this.zzi;
        }
        synchronized (this.zzg) {
            try {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String strZzae = zzae(context, str);
                this.zzh = strZzae;
                return strZzae;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iZza = zza(i);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final /* synthetic */ void zzg(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzad.zzb(context, str));
    }

    public final void zzi(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzv.zzq();
        bundle.putString("device", zzs());
        zzbcc zzbccVar = zzbcl.zza;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().zza()));
        if (bundle.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkt);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzad.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.zzg(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        com.google.android.gms.ads.internal.util.client.zzf.zzw(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                zzfqw zzfqwVar = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                zzs.zzM(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzj(String str) {
        return zzab(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzao));
    }

    public final boolean zzk(String str) {
        return zzab(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzap));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbcl.zza(context);
        zzr zzrVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, zzrVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, zzrVar), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzm(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbcl.zza(context);
        zzr zzrVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzq(this, zzrVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, zzrVar), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    public final int zzn(Context context, Uri uri) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zzac(context, uri);
            return 2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeG)).booleanValue()) {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder(com.google.android.gms.ads.internal.zzv.zzf().zza()).build();
            customTabsIntentBuild.intent.setPackage(zzhfk.zza(context));
            customTabsIntentBuild.launchUrl(context, uri);
            return 5;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeE)).booleanValue()) {
            zzac(context, uri);
            return 9;
        }
        zzbdm zzbdmVar = new zzbdm();
        zzbdmVar.zze(new zzo(this, zzbdmVar, context, uri));
        zzbdmVar.zzb((Activity) context);
        return 5;
    }
}
