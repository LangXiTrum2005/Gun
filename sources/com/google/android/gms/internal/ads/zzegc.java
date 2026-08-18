package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegc implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzegc(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar4;
        this.zzd = zzhfjVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzega zzb() {
        return new zzega(zzffh.zzc(), (ScheduledExecutorService) this.zza.zzb(), (zzcrc) this.zzb.zzb(), (zzegq) this.zzc.zzb(), (zzfiv) this.zzd.zzb());
    }
}
