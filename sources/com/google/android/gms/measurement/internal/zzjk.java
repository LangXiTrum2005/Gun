package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class zzjk implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjz zzd;

    public zzjk(zzjz zzjzVar, zzau zzauVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjzVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        byte[] bArrZzu = null;
        try {
            try {
                zzjz zzjzVar = this.zzd;
                zzej zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzgdVar = this.zzd.zzt;
                } else {
                    bArrZzu = zzejVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzgdVar = this.zzd.zzt;
                }
            } catch (RemoteException e) {
                this.zzd.zzt.zzaA().zzd().zzb("Failed to send event to the service to bundle", e);
                zzgdVar = this.zzd.zzt;
            }
            zzlp zzlpVarZzv = zzgdVar.zzv();
        } finally {
            this.zzd.zzt.zzv().zzT(this.zzc, bArrZzu);
        }
    }
}
