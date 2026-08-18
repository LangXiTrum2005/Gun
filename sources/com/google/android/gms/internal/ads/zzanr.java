package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzanr implements zzank {
    final /* synthetic */ zzant zza;
    private final zzdx zzb = new zzdx(new byte[4], 4);

    public zzanr(zzant zzantVar) {
        this.zza = zzantVar;
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zza(zzdy zzdyVar) {
        if (zzdyVar.zzm() == 0 && (zzdyVar.zzm() & 128) != 0) {
            zzdyVar.zzM(6);
            int iZzb = zzdyVar.zzb() / 4;
            for (int i = 0; i < iZzb; i++) {
                zzdyVar.zzG(this.zzb, 4);
                zzdx zzdxVar = this.zzb;
                int iZzd = zzdxVar.zzd(16);
                zzdxVar.zzn(3);
                if (iZzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzg.get(iZzd2) == null) {
                        zzant zzantVar = this.zza;
                        zzantVar.zzg.put(iZzd2, new zzanl(new zzans(zzantVar, iZzd2)));
                        this.zza.zzm++;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zzb(zzef zzefVar, zzacq zzacqVar, zzanx zzanxVar) {
    }
}
