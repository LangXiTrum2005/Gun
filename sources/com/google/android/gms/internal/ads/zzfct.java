package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfct implements zzgcd {
    final /* synthetic */ zzcex zza;
    final /* synthetic */ zzcmk zzb;
    final /* synthetic */ zzfja zzc;
    final /* synthetic */ zzebk zzd;

    public zzfct(zzcex zzcexVar, zzcmk zzcmkVar, zzfja zzfjaVar, zzebk zzebkVar) {
        this.zza = zzcexVar;
        this.zzb = zzcmkVar;
        this.zzc = zzfjaVar;
        this.zzd = zzebkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzfbo zzfboVarZzD = this.zza.zzD();
        if (zzfboVarZzD != null && !zzfboVarZzD.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfboVarZzD.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() && this.zzb != null && zzcmk.zzj(str)) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzbc.zze(), zzvVar);
                return;
            } else {
                this.zzc.zzd(str, zzvVar, null);
                return;
            }
        }
        zzfbr zzfbrVarZzR = this.zza.zzR();
        if (zzfbrVarZzR == null) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        boolean zZzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza.getContext());
        boolean z = false;
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgd)).booleanValue() && zzfboVarZzD != null && zzfboVarZzD.zzS;
        if (zzfboVarZzD != null && zzfboVarZzD.zzad != null) {
            z = true;
        }
        this.zzd.zzd(new zzebm(jCurrentTimeMillis, zzfbrVarZzR.zzb, str, (zZzA || z2 || z) ? 2 : 1));
    }
}
