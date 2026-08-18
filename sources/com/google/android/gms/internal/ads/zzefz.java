package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzefz implements zzgcd {
    final /* synthetic */ zzfbo zza;
    final /* synthetic */ zzega zzb;

    public zzefz(zzega zzegaVar, zzfbo zzfboVar) {
        this.zza = zzfboVar;
        this.zzb = zzegaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            try {
                this.zzb.zzh.zzb(th, this.zza);
                zzfbo zzfboVarZza = this.zzb.zzh.zza();
                if (this.zza.zzav) {
                    while (zzfboVarZza != null) {
                        this.zzb.zze(zzfboVarZza);
                        zzfboVarZza = this.zzb.zzh.zza();
                    }
                } else if (zzfboVarZza != null) {
                    this.zzb.zze(zzfboVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegr zzegrVar = (zzegr) obj;
        synchronized (this.zzb) {
            try {
                this.zzb.zzh.zzc(zzegrVar, this.zza);
                zzfbo zzfboVarZza = this.zzb.zzh.zza();
                if (zzfboVarZza != null) {
                    this.zzb.zze(zzfboVarZza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
