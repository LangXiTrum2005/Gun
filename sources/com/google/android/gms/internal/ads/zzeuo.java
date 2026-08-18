package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeuo implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzeuo(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar4;
        this.zzd = zzhfjVar5;
        this.zze = zzhfjVar6;
        this.zzf = zzhfjVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeul(((zzchb) this.zza).zzb(), ((zzche) this.zzb).zza(), zzffh.zzc(), (ScheduledExecutorService) this.zzc.zzb(), ((zzecv) this.zzd).zzb(), ((zzcvk) this.zze).zza(), ((zzchs) this.zzf).zza());
    }
}
