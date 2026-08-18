package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzek extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzek(zzgd zzgdVar, long j) {
        super(zzgdVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00df  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:40:0x0127  */
    /* JADX WARN: Code duplicated, block: B:41:0x012f  */
    /* JADX WARN: Code duplicated, block: B:42:0x013f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0151  */
    /* JADX WARN: Code duplicated, block: B:48:0x0171  */
    /* JADX WARN: Code duplicated, block: B:49:0x0172  */
    /* JADX WARN: Code duplicated, block: B:52:0x017b A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x0159, B:50:0x0173, B:52:0x017b, B:56:0x0199, B:55:0x0195, B:60:0x01a6, B:62:0x01bc, B:64:0x01c1, B:63:0x01bf), top: B:85:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0194  */
    /* JADX WARN: Code duplicated, block: B:55:0x0195 A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x0159, B:50:0x0173, B:52:0x017b, B:56:0x0199, B:55:0x0195, B:60:0x01a6, B:62:0x01bc, B:64:0x01c1, B:63:0x01bf), top: B:85:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6 A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x0159, B:50:0x0173, B:52:0x017b, B:56:0x0199, B:55:0x0195, B:60:0x01a6, B:62:0x01bc, B:64:0x01c1, B:63:0x01bf), top: B:85:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bc A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x0159, B:50:0x0173, B:52:0x017b, B:56:0x0199, B:55:0x0195, B:60:0x01a6, B:62:0x01bc, B:64:0x01c1, B:63:0x01bf), top: B:85:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01bf A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x0159, B:50:0x0173, B:52:0x017b, B:56:0x0199, B:55:0x0195, B:60:0x01a6, B:62:0x01bc, B:64:0x01c1, B:63:0x01bf), top: B:85:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:76:0x020f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0224  */
    /* JADX WARN: Code duplicated, block: B:81:0x0228  */
    /* JADX WARN: Code duplicated, block: B:83:0x0235  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224 A[SYNTHETIC] */
    @Override // com.google.android.gms.measurement.internal.zzf
    @WorkerThread
    public final void zzd() {
        String str;
        String string;
        boolean z;
        int iZza;
        List listZzp;
        Iterator it;
        String strZzc;
        String str2;
        Context contextZzaw;
        String strZzz;
        String packageName = this.zzt.zzaw().getPackageName();
        PackageManager packageManager = this.zzt.zzaw().getPackageManager();
        int i = Integer.MIN_VALUE;
        String str3 = "";
        String str4 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzt.zzaA().zzd().zzb("Error retrieving app installer package name. appId", zzet.zzn(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzt.zzaw().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str4 = packageInfo.versionName;
                            i = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str4;
                            str4 = string;
                            this.zzt.zzaA().zzd().zzc("Error retrieving package info. appId, appName", zzet.zzn(packageName), str4);
                            string = str4;
                            str4 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str4;
                this.zzc = i;
                this.zze = string;
                this.zzf = 0L;
                if (TextUtils.isEmpty(this.zzt.zzw()) && "am".equals(this.zzt.zzx())) {
                    z = true;
                } else {
                    z = false;
                }
                iZza = this.zzt.zza();
                switch (iZza) {
                    case 0:
                        AbstractC3888ke0.p(this.zzt, "App measurement collection enabled");
                        break;
                    case 1:
                        this.zzt.zzaA().zzi().zza("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        AbstractC3888ke0.p(this.zzt, "App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.zzt.zzaA().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.zzt.zzaA().zzi().zza("App measurement disabled via the manifest");
                        break;
                    case 5:
                        AbstractC3888ke0.p(this.zzt, "App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.zzt.zzaA().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.zzt.zzaA().zzi().zza("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.zzt.zzaA().zzi().zza("App measurement disabled due to denied storage consent");
                        break;
                }
                this.zzk = "";
                this.zzl = "";
                this.zzt.zzay();
                if (z) {
                    this.zzl = this.zzt.zzw();
                }
                strZzc = zziq.zzc(this.zzt.zzaw(), "google_app_id", this.zzt.zzz());
                if (TextUtils.isEmpty(strZzc)) {
                    str3 = strZzc;
                }
                this.zzk = str3;
                if (!TextUtils.isEmpty(strZzc)) {
                    contextZzaw = this.zzt.zzaw();
                    strZzz = this.zzt.zzz();
                    Preconditions.checkNotNull(contextZzaw);
                    Resources resources = contextZzaw.getResources();
                    if (!TextUtils.isEmpty(strZzz)) {
                        strZzz = zzfv.zza(contextZzaw);
                    }
                    this.zzl = zzfv.zzb("admob_app_id", resources, strZzz);
                }
                if (iZza == 0) {
                    zzer zzerVarZzj = this.zzt.zzaA().zzj();
                    String str5 = this.zza;
                    if (TextUtils.isEmpty(this.zzk)) {
                        str2 = this.zzl;
                    } else {
                        str2 = this.zzk;
                    }
                    zzerVarZzj.zzc("App measurement enabled for app package, google app id", str5, str2);
                }
                this.zzh = null;
                this.zzt.zzay();
                listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
                if (listZzp != null) {
                    this.zzh = listZzp;
                } else if (listZzp.isEmpty()) {
                    this.zzt.zzaA().zzl().zza("Safelisted event list is empty. Ignoring");
                } else {
                    it = listZzp.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzh = listZzp;
                        }
                    } while (this.zzt.zzv().zzac("safelisted event", (String) it.next()));
                }
                if (packageManager != null) {
                    this.zzj = InstantApps.isInstantApp(this.zzt.zzaw()) ? 1 : 0;
                } else {
                    this.zzj = 0;
                }
            }
            this.zzt.zzaA().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzet.zzn(packageName));
            strZzc = zziq.zzc(this.zzt.zzaw(), "google_app_id", this.zzt.zzz());
            if (TextUtils.isEmpty(strZzc)) {
                str3 = strZzc;
            }
            this.zzk = str3;
            if (!TextUtils.isEmpty(strZzc)) {
                contextZzaw = this.zzt.zzaw();
                strZzz = this.zzt.zzz();
                Preconditions.checkNotNull(contextZzaw);
                Resources resources2 = contextZzaw.getResources();
                if (!TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfv.zza(contextZzaw);
                }
                this.zzl = zzfv.zzb("admob_app_id", resources2, strZzz);
            }
            if (iZza == 0) {
                zzer zzerVarZzj2 = this.zzt.zzaA().zzj();
                String str6 = this.zza;
                if (TextUtils.isEmpty(this.zzk)) {
                    str2 = this.zzl;
                } else {
                    str2 = this.zzk;
                }
                zzerVarZzj2.zzc("App measurement enabled for app package, google app id", str6, str2);
            }
        } catch (IllegalStateException e) {
            this.zzt.zzaA().zzd().zzc("Fetching Google App Id failed with exception. appId", zzet.zzn(packageName), e);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str4;
        this.zzc = i;
        this.zze = string;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzt.zzw())) {
            z = false;
        } else {
            z = false;
        }
        iZza = this.zzt.zza();
        switch (iZza) {
            case 0:
                AbstractC3888ke0.p(this.zzt, "App measurement collection enabled");
                break;
            case 1:
                this.zzt.zzaA().zzi().zza("App measurement deactivated via the manifest");
                break;
            case 2:
                AbstractC3888ke0.p(this.zzt, "App measurement deactivated via the init parameters");
                break;
            case 3:
                this.zzt.zzaA().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                this.zzt.zzaA().zzi().zza("App measurement disabled via the manifest");
                break;
            case 5:
                AbstractC3888ke0.p(this.zzt, "App measurement disabled via the init parameters");
                break;
            case 6:
                this.zzt.zzaA().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                this.zzt.zzaA().zzi().zza("App measurement disabled via the global data collection setting");
                break;
            default:
                this.zzt.zzaA().zzi().zza("App measurement disabled due to denied storage consent");
                break;
        }
        this.zzk = "";
        this.zzl = "";
        this.zzt.zzay();
        if (z) {
            this.zzl = this.zzt.zzw();
        }
        this.zzh = null;
        this.zzt.zzay();
        listZzp = this.zzt.zzf().zzp("analytics.safelisted_events");
        if (listZzp != null) {
            this.zzh = listZzp;
        } else if (listZzp.isEmpty()) {
            this.zzt.zzaA().zzl().zza("Safelisted event list is empty. Ignoring");
        } else {
            it = listZzp.iterator();
            do {
                if (it.hasNext()) {
                    this.zzh = listZzp;
                }
            } while (this.zzt.zzv().zzac("safelisted event", (String) it.next()));
        }
        if (packageManager != null) {
            this.zzj = InstantApps.isInstantApp(this.zzt.zzaw()) ? 1 : 0;
        } else {
            this.zzj = 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    @WorkerThread
    public final int zzh() {
        zza();
        return this.zzj;
    }

    @WorkerThread
    public final int zzi() {
        zza();
        return this.zzc;
    }

    @WorkerThread
    public final zzq zzj(String str) {
        String str2;
        String str3;
        long j;
        int i;
        long j2;
        zzg();
        String strZzl = zzl();
        String strZzm = zzm();
        zza();
        String str4 = this.zzb;
        zza();
        long j3 = this.zzc;
        zza();
        Preconditions.checkNotNull(this.zzd);
        String str5 = this.zzd;
        this.zzt.zzf().zzh();
        zza();
        zzg();
        long j4 = this.zzf;
        if (j4 == 0) {
            zzlp zzlpVarZzv = this.zzt.zzv();
            Context contextZzaw = this.zzt.zzaw();
            String packageName = this.zzt.zzaw().getPackageName();
            zzlpVarZzv.zzg();
            Preconditions.checkNotNull(contextZzaw);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzaw.getPackageManager();
            MessageDigest messageDigestZzF = zzlp.zzF();
            long jZzp = -1;
            if (messageDigestZzF == null) {
                DM.w(zzlpVarZzv.zzt, "Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (zzlpVarZzv.zzah(contextZzaw, packageName)) {
                            jZzp = 0;
                        } else {
                            Signature[] signatureArr = Wrappers.packageManager(contextZzaw).getPackageInfo(zzlpVarZzv.zzt.zzaw().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                zzlpVarZzv.zzt.zzaA().zzk().zza("Could not get signatures");
                            } else {
                                jZzp = zzlp.zzp(messageDigestZzF.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        zzlpVarZzv.zzt.zzaA().zzd().zzb("Package name not found", e);
                        j4 = 0;
                    }
                }
                j4 = 0;
                this.zzf = j4;
            }
            j4 = jZzp;
            this.zzf = j4;
        }
        long j5 = j4;
        boolean zZzJ = this.zzt.zzJ();
        boolean z = !this.zzt.zzm().zzl;
        zzg();
        if (this.zzt.zzJ()) {
            zzrj.zzc();
            if (this.zzt.zzf().zzs(null, zzeg.zzac)) {
                AbstractC3888ke0.p(this.zzt, "Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = this.zzt.zzaw().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzt.zzaw());
                            if (objInvoke == null) {
                                str2 = null;
                            } else {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    this.zzt.zzaA().zzl().zza("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.zzt.zzaA().zzm().zza("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzgd zzgdVar = this.zzt;
        long jZza = zzgdVar.zzm().zzc.zza();
        long jMin = jZza == 0 ? zzgdVar.zzc : Math.min(zzgdVar.zzc, jZza);
        zza();
        int i2 = this.zzj;
        boolean zZzr = this.zzt.zzf().zzr();
        zzfi zzfiVarZzm = this.zzt.zzm();
        zzfiVarZzm.zzg();
        boolean z2 = zzfiVarZzm.zza().getBoolean("deferred_analytics_collection", false);
        zza();
        String str6 = this.zzl;
        Boolean boolZzk = this.zzt.zzf().zzk("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolZzk == null ? null : Boolean.valueOf(!boolZzk.booleanValue());
        long j6 = this.zzg;
        List list = this.zzh;
        String strZzi = this.zzt.zzm().zzc().zzi();
        if (this.zzi == null) {
            this.zzi = this.zzt.zzv().zzC();
        }
        String str7 = this.zzi;
        zzqu.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzan)) {
            zzg();
            if (this.zzn != 0) {
                long jCurrentTimeMillis = this.zzt.zzax().currentTimeMillis() - this.zzn;
                if (this.zzm != null && jCurrentTimeMillis > 86400000 && this.zzo == null) {
                    zzo();
                }
            }
            if (this.zzm == null) {
                zzo();
            }
            str3 = this.zzm;
        } else {
            str3 = null;
        }
        zzag zzagVarZzf = this.zzt.zzf();
        zzgd zzgdVar2 = zzagVarZzf.zzt;
        Boolean boolZzk2 = zzagVarZzf.zzk("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolZzk2 == null ? false : boolZzk2.booleanValue();
        zzpz.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzaD)) {
            zzlp zzlpVarZzv2 = this.zzt.zzv();
            String strZzl2 = zzl();
            if (zzlpVarZzv2.zzt.zzaw().getPackageManager() == null) {
                j2 = 0;
            } else {
                try {
                    try {
                        ApplicationInfo applicationInfo = Wrappers.packageManager(zzlpVarZzv2.zzt.zzaw()).getApplicationInfo(strZzl2, 0);
                        i = applicationInfo != null ? applicationInfo.targetSdkVersion : 0;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        zzlpVarZzv2.zzt.zzay();
                        zzlpVarZzv2.zzt.zzaA().zzi().zzb("PackageManager failed to find running app: app_id", strZzl2);
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                }
                j2 = i;
            }
            j = j2;
        } else {
            j = 0;
        }
        return new zzq(strZzl, strZzm, str4, j3, str5, 79000L, j5, str, zZzJ, z, str2, 0L, jMin, i2, zZzr, z2, str6, boolValueOf, j6, list, (String) null, strZzi, str7, str3, zBooleanValue, j);
    }

    @WorkerThread
    public final String zzk() {
        zza();
        return this.zzl;
    }

    @WorkerThread
    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    @WorkerThread
    public final List zzn() {
        return this.zzh;
    }

    @WorkerThread
    public final void zzo() {
        String str;
        zzg();
        if (this.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.zzt.zzv().zzG().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.zzt.zzaA().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        }
        this.zzt.zzaA().zzc().zza("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.zzm = str;
        this.zzn = this.zzt.zzax().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
