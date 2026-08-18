package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzcir implements zzeyd {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final String zzc;
    private final zzcih zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;

    public /* synthetic */ zzcir(zzcih zzcihVar, Context context, String str, com.google.android.gms.ads.internal.client.zzs zzsVar, zzcjm zzcjmVar) {
        this.zzd = zzcihVar;
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        zzher zzherVarZza = zzhes.zza(context);
        this.zze = zzherVarZza;
        zzher zzherVarZza2 = zzhes.zza(zzsVar);
        this.zzf = zzherVarZza2;
        zzhfa zzhfaVarZzc = zzheq.zzc(new zzeko(zzcihVar.zzM));
        this.zzg = zzhfaVarZzc;
        zzhfa zzhfaVarZzc2 = zzheq.zzc(zzekt.zza());
        this.zzh = zzhfaVarZzc2;
        zzhfa zzhfaVarZzc3 = zzheq.zzc(zzdat.zza());
        this.zzi = zzhfaVarZzc3;
        this.zzj = zzheq.zzc(new zzeyb(zzherVarZza, zzcihVar.zzc, zzherVarZza2, zzcihVar.zzS, zzhfaVarZzc, zzhfaVarZzc2, zzfcl.zza(), zzhfaVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzeyd
    public final zzejt zza() {
        return new zzejt(this.zza, this.zzb, this.zzc, (zzeya) this.zzj.zzb(), (zzekn) this.zzg.zzb(), zzchs.zzc(this.zzd.zza), (zzdrw) this.zzd.zzM.zzb());
    }
}
