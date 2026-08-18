package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdub implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;

    public zzdub(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7, zzhfj zzhfjVar8, zzhfj zzhfjVar9, zzhfj zzhfjVar10) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar5;
        this.zze = zzhfjVar6;
        this.zzf = zzhfjVar7;
        this.zzg = zzhfjVar8;
        this.zzh = zzhfjVar9;
        this.zzi = zzhfjVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdua((Executor) this.zza.zzb(), ((zzche) this.zzb).zza(), ((zzchf) this.zzc).zza(), zzffh.zzc(), (zzdpm) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdsh) this.zzf.zzb(), ((zzchs) this.zzg).zza(), ((zzdcs) this.zzh).zzb(), (zzfhk) this.zzi.zzb());
    }
}
