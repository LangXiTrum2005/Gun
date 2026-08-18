package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzctq implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzctq(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddk((zzdac) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
