package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzcim implements zzewp {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;

    public /* synthetic */ zzcim(zzcih zzcihVar, Context context, String str, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
        zzher zzherVarZza = zzhes.zza(context);
        this.zzb = zzherVarZza;
        zzher zzherVarZza2 = zzhes.zza(str);
        this.zzc = zzherVarZza2;
        zzezh zzezhVar = new zzezh(zzherVarZza, zzcihVar.zzbh, zzcihVar.zzbi);
        this.zzd = zzezhVar;
        zzhfa zzhfaVarZzc = zzheq.zzc(new zzexn(zzcihVar.zzbh));
        this.zze = zzhfaVarZzc;
        zzhfa zzhfaVarZzc2 = zzheq.zzc(new zzexp(zzherVarZza, zzcihVar.zzc, zzcihVar.zzS, zzezhVar, zzhfaVarZzc, zzfcl.zza(), zzcihVar.zzl));
        this.zzf = zzhfaVarZzc2;
        this.zzg = zzheq.zzc(new zzexv(zzcihVar.zzS, zzherVarZza, zzherVarZza2, zzhfaVarZzc2, zzhfaVarZzc, zzcihVar.zzl, zzcihVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzewp
    public final zzexu zza() {
        return (zzexu) this.zzg.zzb();
    }
}
