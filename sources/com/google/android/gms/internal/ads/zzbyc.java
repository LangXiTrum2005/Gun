package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
final class zzbyc extends zzbyj {
    private final Clock zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;

    public /* synthetic */ zzbyc(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyi zzbyiVar, zzbyd zzbydVar) {
        this.zzb = clock;
        zzher zzherVarZza = zzhes.zza(context);
        this.zzc = zzherVarZza;
        zzher zzherVarZza2 = zzhes.zza(zzgVar);
        this.zzd = zzherVarZza2;
        this.zze = zzheq.zzc(new zzbxw(zzherVarZza, zzherVarZza2));
        zzher zzherVarZza3 = zzhes.zza(clock);
        this.zzf = zzherVarZza3;
        zzher zzherVarZza4 = zzhes.zza(zzbyiVar);
        this.zzg = zzherVarZza4;
        zzhfa zzhfaVarZzc = zzheq.zzc(new zzbxy(zzherVarZza3, zzherVarZza2, zzherVarZza4));
        this.zzh = zzhfaVarZzc;
        zzbya zzbyaVar = new zzbya(zzherVarZza3, zzhfaVarZzc);
        this.zzi = zzbyaVar;
        this.zzj = zzheq.zzc(new zzbyo(zzherVarZza, zzbyaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzbxv zza() {
        return (zzbxv) this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzbxz zzb() {
        return new zzbxz(this.zzb, (zzbxx) this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzbyn zzc() {
        return (zzbyn) this.zzj.zzb();
    }
}
