package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanl implements zzany {
    private final zzank zza;
    private final zzdy zzb = new zzdy(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzanl(zzank zzankVar) {
        this.zza = zzankVar;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzdy zzdyVar, int i) {
        int iZzd;
        int i2 = i & 1;
        if (i2 != 0) {
            iZzd = zzdyVar.zzd() + zzdyVar.zzm();
        } else {
            iZzd = -1;
        }
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzdyVar.zzL(iZzd);
            this.zzd = 0;
        }
        while (zzdyVar.zzb() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iZzm = zzdyVar.zzm();
                    zzdyVar.zzL(zzdyVar.zzd() - 1);
                    if (iZzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzdyVar.zzb(), 3 - this.zzd);
                zzdyVar.zzH(this.zzb.zzN(), this.zzd, iMin);
                int i4 = this.zzd + iMin;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    zzdy zzdyVar2 = this.zzb;
                    int iZzm2 = zzdyVar2.zzm();
                    boolean z = (iZzm2 & 128) != 0;
                    int iZzm3 = zzdyVar2.zzm();
                    this.zze = z;
                    this.zzc = (iZzm3 | ((iZzm2 & 15) << 8)) + 3;
                    int iZzc = this.zzb.zzc();
                    int i5 = this.zzc;
                    if (iZzc < i5) {
                        int iZzc2 = this.zzb.zzc();
                        this.zzb.zzF(Math.min(4098, Math.max(i5, iZzc2 + iZzc2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzdyVar.zzb(), this.zzc - i3);
                zzdyVar.zzH(this.zzb.zzN(), this.zzd, iMin2);
                int i6 = this.zzd + iMin2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzK(i7);
                    } else {
                        if (zzei.zzf(this.zzb.zzN(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzK(this.zzc - 4);
                    }
                    this.zzb.zzL(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzef zzefVar, zzacq zzacqVar, zzanx zzanxVar) {
        this.zza.zzb(zzefVar, zzacqVar, zzanxVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzc() {
        this.zzf = true;
    }
}
