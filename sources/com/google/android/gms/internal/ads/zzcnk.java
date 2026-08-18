package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnk implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcnk(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet = ((JSONObject) this.zzb.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzddk((zzcnh) this.zza.zzb(), zzffh.zzc()));
        zzhez.zzb(setEmptySet);
        return setEmptySet;
    }
}
