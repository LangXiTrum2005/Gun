package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;

    public zzeyb(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7, zzhfj zzhfjVar8) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar5;
        this.zzf = zzhfjVar6;
        this.zzg = zzhfjVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeya((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (com.google.android.gms.ads.internal.client.zzs) this.zzc.zzb(), (zzcgx) this.zzd.zzb(), (zzekn) this.zze.zzb(), (zzekr) this.zzf.zzb(), new zzfch(), (zzdar) this.zzg.zzb());
    }
}
