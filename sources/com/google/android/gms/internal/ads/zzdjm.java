package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjm implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdjm(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjl(((zzdhi) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
