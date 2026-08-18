package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdev implements zzher {
    private final zzhfj zza;

    public zzdev(zzdeu zzdeuVar, zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzddk((zzcuo) this.zza.zzb(), zzbzw.zzg));
        zzhez.zzb(setSingleton);
        return setSingleton;
    }
}
