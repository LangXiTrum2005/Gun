package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeha implements zzher {
    private final zzegz zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzeha(zzegz zzegzVar, zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzegzVar;
        this.zzb = zzhfjVar;
        this.zzc = zzhfjVar2;
        this.zzd = zzhfjVar3;
        this.zze = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        return this.zza.zza((Clock) this.zzb.zzb(), ((zzegt) this.zzc).zzb(), (zzedb) this.zzd.zzb(), (zzfja) this.zze.zzb());
    }
}
