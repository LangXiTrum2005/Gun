package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqc {
    private final zzch[] zza;
    private final zzqu zzb;
    private final zzck zzc;

    public zzqc(zzch... zzchVarArr) {
        zzqu zzquVar = new zzqu();
        zzck zzckVar = new zzck();
        zzch[] zzchVarArr2 = {zzquVar, zzckVar};
        this.zza = zzchVarArr2;
        System.arraycopy(zzchVarArr, 0, zzchVarArr2, 0, 0);
        this.zzb = zzquVar;
        this.zzc = zzckVar;
    }

    public final long zza(long j) {
        return this.zzc.zzg() ? this.zzc.zzi(j) : j;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbe zzc(zzbe zzbeVar) {
        this.zzc.zzk(zzbeVar.zzb);
        this.zzc.zzj(zzbeVar.zzc);
        return zzbeVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzch[] zze() {
        return this.zza;
    }
}
