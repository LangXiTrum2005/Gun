package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamw implements zzamj {
    private String zze;
    private zzadt zzf;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzn;
    private int zzo;
    private int zzs;
    private boolean zzu;
    private int zzd = 0;
    private final zzdy zza = new zzdy(new byte[15], 2);
    private final zzdx zzb = new zzdx();
    private final zzdy zzc = new zzdy();
    private final zzamx zzp = new zzamx();
    private int zzq = -2147483647;
    private int zzr = -1;
    private long zzt = -1;
    private boolean zzj = true;
    private boolean zzm = true;
    private double zzg = -9.223372036854776E18d;
    private double zzh = -9.223372036854776E18d;

    private static final void zzf(zzdy zzdyVar, zzdy zzdyVar2, boolean z) {
        int iZzd = zzdyVar.zzd();
        int iMin = Math.min(zzdyVar.zzb(), zzdyVar2.zzb());
        zzdyVar.zzH(zzdyVar2.zzN(), zzdyVar2.zzd(), iMin);
        zzdyVar2.zzM(iMin);
        if (z) {
            zzdyVar.zzL(iZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) throws zzbc {
        int i;
        int iZzd;
        zzcw.zzb(this.zzf);
        while (zzdyVar.zzb() > 0) {
            int i2 = this.zzd;
            if (i2 == 0) {
                int i3 = this.zzk;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (zzdyVar.zzb() > 0) {
                            int i4 = this.zzl << 8;
                            this.zzl = i4;
                            int iZzm = i4 | zzdyVar.zzm();
                            this.zzl = iZzm;
                            if ((iZzm & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzdyVar.zzL(zzdyVar.zzd() - 3);
                                this.zzl = 0;
                            }
                        }
                    }
                    this.zzd = 1;
                    break;
                }
                zzdyVar.zzL(zzdyVar.zze());
            } else if (i2 != 1) {
                int i5 = this.zzp.zza;
                if (i5 == 1 || i5 == 17) {
                    zzf(zzdyVar, this.zzc, true);
                }
                int iMin = Math.min(zzdyVar.zzb(), this.zzp.zzc - this.zzn);
                this.zzf.zzr(zzdyVar, iMin);
                int i6 = this.zzn + iMin;
                this.zzn = i6;
                zzamx zzamxVar = this.zzp;
                if (i6 == zzamxVar.zzc) {
                    int i7 = zzamxVar.zza;
                    if (i7 == 1) {
                        byte[] bArrZzN = this.zzc.zzN();
                        zzamy zzamyVarZza = zzana.zza(new zzdx(bArrZzN, bArrZzN.length));
                        this.zzq = zzamyVarZza.zzb;
                        this.zzr = zzamyVarZza.zzc;
                        long j = this.zzt;
                        long j2 = this.zzp.zzb;
                        if (j != j2) {
                            this.zzt = j2;
                            int i8 = zzamyVarZza.zza;
                            String strConcat = i8 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i8))) : "mhm1";
                            byte[] bArr = zzamyVarZza.zzd;
                            zzfxn zzfxnVarZzp = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfxnVarZzp = zzfxn.zzp(zzei.zzf, bArr);
                            }
                            zzz zzzVar = new zzz();
                            zzzVar.zzM(this.zze);
                            zzzVar.zzaa("audio/mhm1");
                            zzzVar.zzab(this.zzq);
                            zzzVar.zzA(strConcat);
                            zzzVar.zzN(zzfxnVarZzp);
                            this.zzf.zzm(zzzVar.zzag());
                        }
                        this.zzu = true;
                    } else if (i7 == 17) {
                        byte[] bArrZzN2 = this.zzc.zzN();
                        zzdx zzdxVar = new zzdx(bArrZzN2, bArrZzN2.length);
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(2);
                            iZzd = zzdxVar.zzd(13);
                        } else {
                            iZzd = 0;
                        }
                        this.zzs = iZzd;
                    } else if (i7 == 2) {
                        if (this.zzu) {
                            this.zzj = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i9 = this.zzr - this.zzs;
                        double d = this.zzq;
                        long jRound = Math.round(this.zzg);
                        if (this.zzi) {
                            this.zzi = false;
                            this.zzg = this.zzh;
                        } else {
                            this.zzg += (((double) i9) * 1000000.0d) / d;
                        }
                        this.zzf.zzt(jRound, i, this.zzo, 0, null);
                        this.zzu = false;
                        this.zzs = 0;
                        this.zzo = 0;
                    }
                    this.zzd = 1;
                }
            } else {
                zzf(zzdyVar, this.zza, false);
                zzdy zzdyVar2 = this.zza;
                if (zzdyVar2.zzb() == 0) {
                    zzdx zzdxVar2 = this.zzb;
                    int iZze = zzdyVar2.zze();
                    zzdxVar2.zzk(zzdyVar2.zzN(), iZze);
                    if (zzana.zzb(this.zzb, this.zzp)) {
                        this.zzn = 0;
                        this.zzo = this.zzp.zzc + iZze + this.zzo;
                        this.zza.zzL(0);
                        zzadt zzadtVar = this.zzf;
                        zzdy zzdyVar3 = this.zza;
                        zzadtVar.zzr(zzdyVar3, zzdyVar3.zze());
                        this.zza.zzI(2);
                        this.zzc.zzI(this.zzp.zzc);
                        this.zzm = true;
                        this.zzd = 2;
                    } else {
                        zzdy zzdyVar4 = this.zza;
                        if (zzdyVar4.zze() < 15) {
                            zzdyVar4.zzK(zzdyVar4.zze() + 1);
                        }
                    }
                }
                this.zzm = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zze = zzanxVar.zzb();
        this.zzf = zzacqVar.zzw(zzanxVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzk = i;
        if (!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if (j != C.TIME_UNSET) {
            double d = j;
            if (this.zzi) {
                this.zzh = d;
            } else {
                this.zzg = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzd = 0;
        this.zzl = 0;
        this.zza.zzI(2);
        this.zzn = 0;
        this.zzo = 0;
        this.zzq = -2147483647;
        this.zzr = -1;
        this.zzs = 0;
        this.zzt = -1L;
        this.zzu = false;
        this.zzi = false;
        this.zzm = true;
        this.zzj = true;
        this.zzg = -9.223372036854776E18d;
        this.zzh = -9.223372036854776E18d;
    }
}
