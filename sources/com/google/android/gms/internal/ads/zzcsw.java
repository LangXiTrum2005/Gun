package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcsw implements zzher {
    private final zzhfj zza;

    public zzcsw(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
    }

    public static zzddk zza(zzcmw zzcmwVar, Executor executor) {
        return new zzddk(zzcmwVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzcmw) this.zza.zzb(), zzffh.zzc());
    }
}
