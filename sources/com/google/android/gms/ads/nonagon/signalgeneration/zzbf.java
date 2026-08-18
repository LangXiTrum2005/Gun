package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzddk;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzbf(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj = (zzw) this.zza.zzb();
        zzbm zzbmVar = (zzbm) this.zzb.zzb();
        zzgcs zzgcsVarZzc = zzffh.zzc();
        if (((Integer) this.zzc.zzb()).intValue() == 2) {
            obj = zzbmVar;
        }
        return new zzddk(obj, zzgcsVarZzc);
    }
}
