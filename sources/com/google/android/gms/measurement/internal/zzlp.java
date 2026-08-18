package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.umeng.analytics.pro.bg;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlp extends zzgx {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private Integer zzf;

    public zzlp(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = null;
        this.zzd = new AtomicLong(0L);
    }

    public static MessageDigest zzF() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList zzH(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.zza);
            bundle.putString("origin", zzacVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzacVar.zzd);
            bundle.putString("name", zzacVar.zzc.zzb);
            zzgz.zzb(bundle, Preconditions.checkNotNull(zzacVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzau zzauVar = zzacVar.zzg;
            if (zzauVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzauVar.zza);
                zzas zzasVar = zzauVar.zzb;
                if (zzasVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzasVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzacVar.zzh);
            zzau zzauVar2 = zzacVar.zzi;
            if (zzauVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzauVar2.zza);
                zzas zzasVar2 = zzauVar2.zzb;
                if (zzasVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzasVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzacVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzacVar.zzj);
            zzau zzauVar3 = zzacVar.zzk;
            if (zzauVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzauVar3.zza);
                zzas zzasVar3 = zzauVar3.zzb;
                if (zzasVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzasVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    public static void zzK(zzir zzirVar, Bundle bundle, boolean z) {
        if (bundle != null && zzirVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzirVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzirVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzirVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzirVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzaj(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzak(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzal(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zzam(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 24 ? zzav(context, "com.google.android.gms.measurement.AppMeasurementJobService") : zzav(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean zzan(String str) {
        return !zzb[0].equals(str);
    }

    public static final boolean zzaq(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    @VisibleForTesting
    public static final boolean zzar(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int zzas(String str) {
        if ("_ldl".equals(str)) {
            this.zzt.zzf();
            return 2048;
        }
        if (bg.d.equals(str)) {
            this.zzt.zzf();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.zzt.zzf();
            return 100;
        }
        this.zzt.zzf();
        return 36;
    }

    private final Object zzat(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzD(obj.toString(), i, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleZzt = zzt((Bundle) parcelable);
                if (!bundleZzt.isEmpty()) {
                    arrayList.add(bundleZzt);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean zzau(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzln.zza(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzav(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @VisibleForTesting
    public static long zzp(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public final Object zzA(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.zzt.zzf();
            return zzat(256, obj, true, true);
        }
        if (zzaj(str)) {
            this.zzt.zzf();
        } else {
            this.zzt.zzf();
            i = 100;
        }
        return zzat(i, obj, false, true);
    }

    public final Object zzB(String str, Object obj) {
        return "_ldl".equals(str) ? zzat(zzas(str), obj, true, false) : zzat(zzas(str), obj, false, false);
    }

    public final String zzC() {
        byte[] bArr = new byte[16];
        zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzD(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final URL zzE(long j, String str, String str2, long j2) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v79000." + zzm()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + j2;
            if (str.equals(this.zzt.zzf().zzm())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e) {
            e = e;
            this.zzt.zzaA().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            this.zzt.zzaA().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @WorkerThread
    public final SecureRandom zzG() {
        zzg();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    @WorkerThread
    public final void zzI(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.zzt.zzaA().zzk().zzb("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void zzJ(Bundle bundle, int i, String str, String str2, Object obj) {
        if (zzaq(bundle, i)) {
            this.zzt.zzf();
            bundle.putString("_ev", zzD(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void zzL(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzt.zzv().zzP(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzM(Parcelable[] parcelableArr, int i, boolean z) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzak(str) && !zzau(str, zzhd.zzd) && (i2 = i2 + 1) > i) {
                    if (z) {
                        this.zzt.zzaA().zze().zzc(AbstractC5044xl.g("Param can't contain more than ", i, " item-scoped custom parameters"), this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 28);
                    } else {
                        this.zzt.zzaA().zze().zzc("Param cannot contain item-scoped custom parameters", this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final void zzN(zzeu zzeuVar, int i) {
        int i2 = 0;
        for (String str : new TreeSet(zzeuVar.zzd.keySet())) {
            if (zzak(str) && (i2 = i2 + 1) > i) {
                this.zzt.zzaA().zze().zzc(AbstractC5044xl.g("Event can't contain more than ", i, " params"), this.zzt.zzj().zzd(zzeuVar.zza), this.zzt.zzj().zzb(zzeuVar.zzd));
                zzaq(zzeuVar.zzd, 5);
                zzeuVar.zzd.remove(str);
            }
        }
    }

    public final void zzO(zzlo zzloVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zzaq(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        zzloVar.zza(str, "_err", bundle);
    }

    public final void zzP(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzt.zzaA().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzt.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning string value to wrapper", e);
        }
    }

    public final void zzX(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        int iZza;
        int i2;
        String str4;
        if (bundle == null) {
            return;
        }
        zzag zzagVarZzf = this.zzt.zzf();
        zzpq.zzc();
        String str5 = null;
        int i3 = (zzagVarZzf.zzt.zzf().zzs(null, zzeg.zzaz) && zzagVarZzf.zzt.zzv().zzai(231100000, true)) ? 35 : 0;
        int i4 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str6)) {
                int iZzj = !z ? zzj(str6) : 0;
                if (iZzj == 0) {
                    iZzj = zzi(str6);
                }
                i = iZzj;
            } else {
                i = 0;
            }
            if (i != 0) {
                zzJ(bundle, i, str6, str6, i == 3 ? str6 : str5);
                bundle.remove(str6);
                i2 = i3;
                str4 = str5;
            } else {
                if (zzag(bundle.get(str6))) {
                    this.zzt.zzaA().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    iZza = 22;
                } else {
                    iZza = zza(str, str2, str6, bundle.get(str6), bundle, list, z, false);
                }
                if (iZza != 0 && !"_ev".equals(str6)) {
                    zzJ(bundle, iZza, str6, str6, bundle.get(str6));
                    bundle.remove(str6);
                } else if (zzak(str6) && !zzau(str6, zzhd.zzd)) {
                    int i5 = i4 + 1;
                    if (zzai(231100000, true)) {
                        i2 = i3;
                        if (i5 > i2) {
                            zzpq.zzc();
                            str4 = null;
                            if (this.zzt.zzf().zzs(null, zzeg.zzaz)) {
                                this.zzt.zzaA().zze().zzc(AbstractC5044xl.g("Item can't contain more than ", i2, " item-scoped custom params"), this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                zzaq(bundle, 28);
                                bundle.remove(str6);
                            } else {
                                this.zzt.zzaA().zze().zzc("Item cannot contain custom parameters", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                zzaq(bundle, 23);
                                bundle.remove(str6);
                            }
                        }
                        i4 = i5;
                    } else {
                        this.zzt.zzaA().zze().zzc("Item array not supported on client's version of Google Play Services (Android Only)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                        bundle.remove(str6);
                        i2 = i3;
                    }
                    str4 = null;
                    i4 = i5;
                }
                i2 = i3;
                str4 = null;
            }
            i3 = i2;
            str5 = str4;
        }
    }

    public final boolean zzY(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzar(str)) {
                return true;
            }
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzet.zzn(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (zzar(str2)) {
            return true;
        }
        this.zzt.zzaA().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzet.zzn(str2));
        return false;
    }

    public final boolean zzZ(String str, int i, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        this.zzt.zzaA().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    @WorkerThread
    public final int zza(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        zzg();
        if (!zzag(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!zzau(str3, zzhd.zzc)) {
                return 20;
            }
            zzjz zzjzVarZzt = this.zzt.zzt();
            zzjzVarZzt.zzg();
            zzjzVarZzt.zza();
            if (zzjzVarZzt.zzN() && zzjzVarZzt.zzt.zzv().zzm() < 200900) {
                return 25;
            }
            this.zzt.zzf();
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                this.zzt.zzaA().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                this.zzt.zzf();
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (zzaj(str2) || zzaj(str3)) {
            this.zzt.zzf();
            i2 = 256;
        } else {
            this.zzt.zzf();
            i2 = 100;
        }
        if (zzab("param", str3, i2, obj)) {
            return i;
        }
        if (!z2) {
            return 4;
        }
        if (obj instanceof Bundle) {
            zzX(str, str2, str3, (Bundle) obj, list, z);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    this.zzt.zzaA().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                    return 4;
                }
                zzX(str, str2, str3, (Bundle) parcelable, list, z);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Object obj2 = arrayList2.get(i3);
                if (!(obj2 instanceof Bundle)) {
                    this.zzt.zzaA().zzl().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                    return 4;
                }
                zzX(str, str2, str3, (Bundle) obj2, list, z);
            }
        }
        return i;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    @WorkerThread
    public final void zzaC() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                DM.C(this.zzt, "Utils falling back to Random for random id");
            }
        }
        this.zzd.set(jNextLong);
    }

    public final boolean zzaa(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zza;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.zzt.zzaA().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzau(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzau(str2, strArr2)) {
            return true;
        }
        this.zzt.zzaA().zze().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzab(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i) {
                this.zzt.zzaA().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean zzac(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.zzt.zzaA().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzad(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.zzt.zzaA().zze().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @WorkerThread
    public final boolean zzae(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzt.zzaw()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzt.zzaA().zzc().zzb("Permission not granted", str);
        return false;
    }

    public final boolean zzaf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strZzl = this.zzt.zzf().zzl();
        this.zzt.zzay();
        return strZzl.equals(str);
    }

    public final boolean zzag(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    public final boolean zzah(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.zzt.zzaA().zzd().zzb("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.zzt.zzaA().zzd().zzb("Error obtaining certificate", e2);
            return true;
        }
    }

    public final boolean zzai(int i, boolean z) {
        Boolean boolZzj = this.zzt.zzt().zzj();
        if (zzm() < i / 1000) {
            return (boolZzj == null || boolZzj.booleanValue()) ? false : true;
        }
        return true;
    }

    public final boolean zzao(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public final byte[] zzap(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final int zzd(String str, Object obj) {
        return "_ldl".equals(str) ? zzab("user property referrer", str, zzas(str), obj) : zzab("user property", str, zzas(str), obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final boolean zzf() {
        return true;
    }

    public final int zzh(String str) {
        if (!zzac(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!zzaa(NotificationCompat.CATEGORY_EVENT, zzhc.zza, zzhc.zzb, str)) {
            return 13;
        }
        this.zzt.zzf();
        return !zzZ(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    public final int zzi(String str) {
        if (!zzac("event param", str)) {
            return 3;
        }
        if (!zzaa("event param", null, null, str)) {
            return 14;
        }
        this.zzt.zzf();
        return !zzZ("event param", 40, str) ? 3 : 0;
    }

    public final int zzj(String str) {
        if (!zzad("event param", str)) {
            return 3;
        }
        if (!zzaa("event param", null, null, str)) {
            return 14;
        }
        this.zzt.zzf();
        return !zzZ("event param", 40, str) ? 3 : 0;
    }

    public final int zzl(String str) {
        if (!zzac("user property", str)) {
            return 6;
        }
        if (!zzaa("user property", zzhe.zza, null, str)) {
            return 15;
        }
        this.zzt.zzf();
        return !zzZ("user property", 24, str) ? 6 : 0;
    }

    public final int zzm() {
        if (this.zzf == null) {
            this.zzf = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzt.zzaw()) / 1000);
        }
        return this.zzf.intValue();
    }

    public final int zzo(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzt.zzaw(), 12451000);
    }

    public final long zzq() {
        long andIncrement;
        long j;
        if (this.zzd.get() != 0) {
            synchronized (this.zzd) {
                this.zzd.compareAndSet(-1L, 1L);
                andIncrement = this.zzd.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzd) {
            long jNextLong = new Random(System.nanoTime() ^ this.zzt.zzax().currentTimeMillis()).nextLong();
            int i = this.zze + 1;
            this.zze = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final long zzr(long j, long j2) {
        return ((j2 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j) / 86400000;
    }

    public final Bundle zzs(Uri uri, boolean z) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("utm_id");
                queryParameter6 = uri.getQueryParameter("dclid");
                queryParameter7 = uri.getQueryParameter("srsltid");
                queryParameter8 = z ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && (!z || TextUtils.isEmpty(queryParameter8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(MBInterstitialActivity.INTENT_CAMAPIGN, queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter9 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("term", queryParameter9);
            }
            String queryParameter10 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("content", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("aclid", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("cp1", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("anid", queryParameter13);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("campaign_id", queryParameter5);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("dclid", queryParameter6);
            }
            String queryParameter14 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("source_platform", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("creative_format", queryParameter15);
            }
            String queryParameter16 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("marketing_tactic", queryParameter16);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("srsltid", queryParameter7);
            }
            if (z && !TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("sfmc_id", queryParameter8);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            this.zzt.zzaA().zzk().zzb("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    public final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objZzA = zzA(str, bundle.get(str));
                if (objZzA == null) {
                    this.zzt.zzaA().zzl().zzb("Param value can't be null", this.zzt.zzj().zze(str));
                } else {
                    zzP(bundle2, str, objZzA);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[SYNTHETIC] */
    public final Bundle zzu(String str, String str2, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str3;
        int i3;
        boolean zZzau = zzau(str2, zzhc.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iZzc = this.zzt.zzf().zzc();
        int i4 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                int iZzj = !z ? zzj(str4) : 0;
                if (iZzj == 0) {
                    iZzj = zzi(str4);
                }
                i = iZzj;
            } else {
                i = 0;
            }
            if (i != 0) {
                zzJ(bundle2, i, str4, str4, i == 3 ? str4 : null);
                bundle2.remove(str4);
                i2 = iZzc;
            } else {
                i2 = iZzc;
                int iZza = zza(str, str2, str4, bundle.get(str4), bundle2, list, z, zZzau);
                if (iZza == 17) {
                    zzJ(bundle2, 17, str4, str4, Boolean.FALSE);
                } else {
                    if (iZza != 0) {
                        str3 = str4;
                        if (!"_ev".equals(str3)) {
                            zzJ(bundle2, iZza, iZza == 21 ? str2 : str3, str3, bundle.get(str3));
                            bundle2.remove(str3);
                        }
                    }
                    if (!zzak(str3)) {
                        i3 = i4 + 1;
                        if (i3 > i2) {
                            this.zzt.zzaA().zze().zzc(AbstractC5044xl.g("Event can't contain more than ", i2, " params"), this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                            zzaq(bundle2, 5);
                            bundle2.remove(str3);
                        }
                        i4 = i3;
                    }
                }
                str3 = str4;
                if (!zzak(str3)) {
                    i3 = i4 + 1;
                    if (i3 > i2) {
                        this.zzt.zzaA().zze().zzc(AbstractC5044xl.g("Event can't contain more than ", i2, " params"), this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i4 = i3;
                }
            }
            iZzc = i2;
        }
        return bundle2;
    }

    public final zzau zzz(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional property event name", this.zzt.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleZzu = zzu(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            bundleZzu = zzt(bundleZzu);
        }
        Preconditions.checkNotNull(bundleZzu);
        return new zzau(str2, new zzas(bundleZzu), str3, j);
    }
}
