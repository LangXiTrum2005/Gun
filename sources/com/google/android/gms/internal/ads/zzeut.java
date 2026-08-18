package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeut implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzeut(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar5;
        this.zzd = zzhfjVar6;
        this.zze = zzhfjVar7;
    }

    public static zzeur zza(zzbzd zzbzdVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new zzeur(zzbzdVar, context, scheduledExecutorService, executor, i, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeur(zzckt.zza(), ((zzche) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzffh.zzc(), ((zzevz) this.zzc).zzb().intValue(), ((zzewa) this.zzd).zzb().booleanValue(), ((zzewc) this.zze).zzb().booleanValue());
    }
}
