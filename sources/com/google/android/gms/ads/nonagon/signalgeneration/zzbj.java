package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdxa;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbj implements zzher {
    private final zzhfj zza;

    public zzbj(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbi zzb() {
        return new zzbi(zzffh.zzc(), ((zzdxa) this.zza).zzb());
    }
}
