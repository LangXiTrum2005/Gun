package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepe implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzepe(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeoj(zzerq.zza(), ((Long) zzbea.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzffh.zzc(), (zzdrw) this.zzb.zzb());
    }
}
