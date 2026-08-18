package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdr implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzbdr(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbdq zzb() {
        return new zzbdq((ScheduledExecutorService) this.zza.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zzo) this.zzb.zzb(), (com.google.android.gms.ads.nonagon.signalgeneration.zzf) this.zzc.zzb(), (zzdsb) this.zzd.zzb());
    }
}
