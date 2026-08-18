package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdqg implements zzher {
    private final zzhfj zza;

    public zzdqg(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgcs zzgcsVarZzc = zzffh.zzc();
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeW)).booleanValue() ? Collections.singleton(new zzddk(((zzdqz) this.zza).zzb(), zzgcsVarZzc)) : Collections.emptySet();
        zzhez.zzb(setSingleton);
        return setSingleton;
    }
}
