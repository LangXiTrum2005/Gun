package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeer implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzeer(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeeq zzb() {
        return new zzeeq((zzcpq) this.zza.zzb(), ((zzedy) this.zzb).zzb(), (zzcvv) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzffh.zzc(), (zzdrq) this.zze.zzb());
    }
}
