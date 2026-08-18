package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzqr;

/* JADX INFO: loaded from: classes3.dex */
final class zzhy implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ zzik zzb;

    public zzhy(zzik zzikVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zzikVar;
        this.zza = zzcfVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        zzkp zzkpVarZzu = this.zzb.zzt.zzu();
        zzqr.zzc();
        if (!zzkpVarZzu.zzt.zzf().zzs(null, zzeg.zzau)) {
            zzkpVarZzu.zzt.zzaA().zzl().zza("getSessionId has been disabled.");
        } else {
            if (zzkpVarZzu.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
                if (!zzkpVarZzu.zzt.zzm().zzk(zzkpVarZzu.zzt.zzax().currentTimeMillis()) && zzkpVarZzu.zzt.zzm().zzk.zza() != 0) {
                    lValueOf = Long.valueOf(zzkpVarZzu.zzt.zzm().zzk.zza());
                }
                if (lValueOf != null) {
                    this.zzb.zzt.zzv().zzV(this.zza, lValueOf.longValue());
                }
                try {
                    this.zza.zze(null);
                } catch (RemoteException e) {
                    this.zzb.zzt.zzaA().zzd().zzb("getSessionId failed with exception", e);
                    return;
                }
            }
            zzkpVarZzu.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get session id");
        }
        lValueOf = null;
        if (lValueOf != null) {
            this.zzb.zzt.zzv().zzV(this.zza, lValueOf.longValue());
        } else {
            this.zza.zze(null);
        }
    }
}
