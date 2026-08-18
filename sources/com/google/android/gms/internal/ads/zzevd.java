package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevd implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzevd(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar4;
    }

    public static zzevb zza(String str, zzbam zzbamVar, zzbzm zzbzmVar, ScheduledExecutorService scheduledExecutorService, zzgcs zzgcsVar) {
        return new zzevb(str, zzbamVar, zzbzmVar, scheduledExecutorService, zzgcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevb(((zzevy) this.zza).zza(), zzckl.zza(), (zzbzm) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzffh.zzc());
    }
}
