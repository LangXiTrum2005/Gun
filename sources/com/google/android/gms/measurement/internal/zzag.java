package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzag extends zzgw {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    public zzag(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzb = new zzaf() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.zzaf
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzeg.zzD.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.zzt.zzaA().zzd().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.zzt.zzaA().zzd().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            this.zzt.zzaA().zzd().zzb("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.zzt.zzaA().zzd().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzeg.zzd.zza(null)).longValue();
    }

    @WorkerThread
    public final double zza(String str, zzef zzefVar) {
        if (str == null) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
        String strZza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzefVar.zza(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzefVar.zza(null)).doubleValue();
        }
    }

    public final int zzb(@Size(min = 1) String str) {
        return zzf(str, zzeg.zzH, 500, 2000);
    }

    public final int zzc() {
        return this.zzt.zzv().zzai(201500000, true) ? 100 : 25;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzf(str, zzeg.zzI, 25, 100);
    }

    @WorkerThread
    public final int zze(String str, zzef zzefVar) {
        if (str == null) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
        String strZza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzefVar.zza(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzefVar.zza(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzf(String str, zzef zzefVar, int i, int i2) {
        return Math.max(Math.min(zze(str, zzefVar), i2), i);
    }

    public final long zzh() {
        this.zzt.zzay();
        return 79000L;
    }

    @WorkerThread
    public final long zzi(String str, zzef zzefVar) {
        if (str == null) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
        String strZza = this.zzb.zza(str, zzefVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzefVar.zza(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzefVar.zza(null)).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzt.zzaw().getPackageManager() == null) {
                this.zzt.zzaA().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzt.zzaw()).getApplicationInfo(this.zzt.zzaw().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzt.zzaA().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.zzt.zzaA().zzd().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzj = zzj();
        if (bundleZzj == null) {
            DM.w(this.zzt, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzj.containsKey(str)) {
            return Boolean.valueOf(bundleZzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    public final String zzn() {
        this.zzt.zzay();
        return "FA";
    }

    @WorkerThread
    public final String zzo(String str, zzef zzefVar) {
        return str == null ? (String) zzefVar.zza(null) : (String) zzefVar.zza(this.zzb.zza(str, zzefVar.zzb()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: NotFoundException -> 0x0040, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0040, blocks: (B:11:0x0026, B:14:0x003b), top: B:19:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    public final List zzp(@Size(min = 1) String str) {
        Integer numValueOf;
        String[] stringArray;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleZzj = zzj();
        if (bundleZzj != null) {
            if (bundleZzj.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleZzj.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.zzt.zzaw().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e) {
                    this.zzt.zzaA().zzd().zzb("Failed to load string array from metadata: resource not found", e);
                }
            }
            return null;
        }
        DM.w(this.zzt, "Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.zzt.zzaw().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean boolZzk = zzk("google_analytics_adid_collection_enabled");
        return boolZzk == null || boolZzk.booleanValue();
    }

    @WorkerThread
    public final boolean zzs(String str, zzef zzefVar) {
        if (str == null) {
            return ((Boolean) zzefVar.zza(null)).booleanValue();
        }
        String strZza = this.zzb.zza(str, zzefVar.zzb());
        return TextUtils.isEmpty(strZza) ? ((Boolean) zzefVar.zza(null)).booleanValue() : ((Boolean) zzefVar.zza(Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolZzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return boolZzk == null || boolZzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzt.zzay();
        Boolean boolZzk = zzk("firebase_analytics_collection_deactivated");
        return boolZzk != null && boolZzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    public final boolean zzx() {
        if (this.zza == null) {
            Boolean boolZzk = zzk("app_measurement_lite");
            this.zza = boolZzk;
            if (boolZzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzt.zzN();
    }

    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                try {
                    if (this.zzc == null) {
                        ApplicationInfo applicationInfo = this.zzt.zzaw().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z = false;
                            if (str != null && str.equals(myProcessName)) {
                                z = true;
                            }
                            this.zzc = Boolean.valueOf(z);
                        }
                        if (this.zzc == null) {
                            this.zzc = Boolean.TRUE;
                            this.zzt.zzaA().zzd().zza("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
