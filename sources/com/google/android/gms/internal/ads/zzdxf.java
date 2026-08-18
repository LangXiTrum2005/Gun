package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzdxf(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar5;
        this.zze = zzhfjVar6;
        this.zzf = zzhfjVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxe(((zzche) this.zza).zza(), ((zzcvk) this.zzb).zza(), ((zzdwh) this.zzc).zzb(), zzffh.zzc(), (ScheduledExecutorService) this.zzd.zzb(), (zzeag) this.zze.zzb(), (zzfhh) this.zzf.zzb());
    }
}
