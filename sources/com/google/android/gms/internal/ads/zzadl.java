package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzadl implements zzadm {
    private final long zza;
    private final zzadk zzb;

    public zzadl(long j, long j2) {
        this.zza = j;
        zzadn zzadnVar = j2 == 0 ? zzadn.zza : new zzadn(0L, j2);
        this.zzb = new zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return false;
    }
}
