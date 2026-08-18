package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcsm implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzcsm(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzchv) this.zzb).zzb().zzc((Clock) this.zza.zzb(), ((zzcvk) this.zzc).zza().zzf);
    }
}
