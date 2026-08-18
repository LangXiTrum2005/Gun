package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdku implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdku(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkt((com.google.android.gms.ads.internal.util.zzbo) this.zza.zzb(), (Clock) this.zzb.zzb(), zzffh.zzc());
    }
}
