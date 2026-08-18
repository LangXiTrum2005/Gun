package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzr(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzo(((zzche) this.zza).zza(), (zzdsb) this.zzb.zzb(), zzffh.zzc());
    }
}
