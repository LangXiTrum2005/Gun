package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamh implements zzamj {
    private final zzdy zza;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadt zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzab zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = C.TIME_UNSET;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzamh(@Nullable String str, int i, int i2) {
        this.zza = new zzdy(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final void zzf(zzack zzackVar) {
        int i;
        int i2 = zzackVar.zzb;
        if (i2 == -2147483647 || (i = zzackVar.zzc) == -1) {
            return;
        }
        zzab zzabVar = this.zzk;
        if (zzabVar != null && i == zzabVar.zzD && i2 == zzabVar.zzE && Objects.equals(zzackVar.zza, zzabVar.zzo)) {
            return;
        }
        zzab zzabVar2 = this.zzk;
        zzz zzzVar = zzabVar2 == null ? new zzz() : zzabVar2.zzb();
        zzzVar.zzM(this.zze);
        zzzVar.zzaa(zzackVar.zza);
        zzzVar.zzz(zzackVar.zzc);
        zzzVar.zzab(zzackVar.zzb);
        zzzVar.zzQ(this.zzc);
        zzzVar.zzY(this.zzd);
        zzab zzabVarZzag = zzzVar.zzag();
        this.zzk = zzabVarZzag;
        this.zzf.zzm(zzabVarZzag);
    }

    private final boolean zzg(zzdy zzdyVar, byte[] bArr, int i) {
        int iMin = Math.min(zzdyVar.zzb(), i - this.zzh);
        zzdyVar.zzH(bArr, this.zzh, iMin);
        int i2 = this.zzh + iMin;
        this.zzh = i2;
        return i2 == i;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01de  */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) throws zzbc {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        int i7;
        zzcw.zzb(this.zzf);
        while (zzdyVar.zzb() > 0) {
            int i8 = this.zzg;
            if (i8 == 0) {
                while (zzdyVar.zzb() > 0) {
                    int i9 = this.zzi << 8;
                    this.zzi = i9;
                    int iZzm = i9 | zzdyVar.zzm();
                    this.zzi = iZzm;
                    if (iZzm == 2147385345 || iZzm == -25230976 || iZzm == 536864768 || iZzm == -14745368) {
                        i7 = 1;
                    } else if (iZzm == 1683496997 || iZzm == 622876772) {
                        i7 = 2;
                    } else if (iZzm == 1078008818 || iZzm == -233094848) {
                        i7 = 3;
                    } else {
                        i7 = (iZzm == 1908687592 || iZzm == -398277519) ? 4 : 0;
                    }
                    this.zzm = i7;
                    if (i7 != 0) {
                        byte[] bArrZzN = this.zza.zzN();
                        int i10 = this.zzi;
                        bArrZzN[0] = (byte) ((i10 >> 24) & 255);
                        bArrZzN[1] = (byte) ((i10 >> 16) & 255);
                        bArrZzN[2] = (byte) ((i10 >> 8) & 255);
                        bArrZzN[3] = (byte) (i10 & 255);
                        this.zzh = 4;
                        this.zzi = 0;
                        if (i7 != 3 && i7 != 4) {
                            if (i7 != 1) {
                                this.zzg = 2;
                                break;
                            } else {
                                this.zzg = 1;
                                break;
                            }
                        }
                        this.zzg = 4;
                        break;
                    }
                }
            } else if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                int iMin = Math.min(zzdyVar.zzb(), this.zzl - this.zzh);
                                this.zzf.zzr(zzdyVar, iMin);
                                int i11 = this.zzh + iMin;
                                this.zzh = i11;
                                if (i11 == this.zzl) {
                                    zzcw.zzf(this.zzp != C.TIME_UNSET);
                                    this.zzf.zzt(this.zzp, this.zzm == 4 ? 0 : 1, this.zzl, 0, null);
                                    this.zzp += this.zzj;
                                    this.zzg = 0;
                                }
                            } else if (zzg(zzdyVar, this.zza.zzN(), this.zzo)) {
                                zzack zzackVarZze = zzacm.zze(this.zza.zzN(), this.zzb);
                                if (this.zzm == 3) {
                                    zzf(zzackVarZze);
                                }
                                this.zzl = zzackVarZze.zzd;
                                long j = zzackVarZze.zze;
                                this.zzj = j != C.TIME_UNSET ? j : 0L;
                                this.zza.zzL(0);
                                this.zzf.zzr(this.zza, this.zzo);
                                this.zzg = 6;
                            }
                        } else if (zzg(zzdyVar, this.zza.zzN(), 6)) {
                            int iZzb = zzacm.zzb(this.zza.zzN());
                            this.zzo = iZzb;
                            int i12 = this.zzh;
                            if (i12 > iZzb) {
                                int i13 = i12 - iZzb;
                                this.zzh = i12 - i13;
                                zzdyVar.zzL(zzdyVar.zzd() - i13);
                            }
                            this.zzg = 5;
                        }
                    } else if (zzg(zzdyVar, this.zza.zzN(), this.zzn)) {
                        zzack zzackVarZzd = zzacm.zzd(this.zza.zzN());
                        zzf(zzackVarZzd);
                        this.zzl = zzackVarZzd.zzd;
                        long j2 = zzackVarZzd.zze;
                        this.zzj = j2 != C.TIME_UNSET ? j2 : 0L;
                        this.zza.zzL(0);
                        this.zzf.zzr(this.zza, this.zzn);
                        this.zzg = 6;
                    }
                } else if (zzg(zzdyVar, this.zza.zzN(), 7)) {
                    this.zzn = zzacm.zza(this.zza.zzN());
                    this.zzg = 3;
                }
            } else if (zzg(zzdyVar, this.zza.zzN(), 18)) {
                byte[] bArrZzN2 = this.zza.zzN();
                if (this.zzk == null) {
                    zzab zzabVarZzc = zzacm.zzc(bArrZzN2, this.zze, this.zzc, this.zzd, null);
                    this.zzk = zzabVarZzc;
                    this.zzf.zzm(zzabVarZzc);
                }
                byte b4 = bArrZzN2[0];
                if (b4 != -2) {
                    if (b4 == -1) {
                        i6 = ((bArrZzN2[7] & 3) << 12) | ((bArrZzN2[6] & 255) << 4) | ((bArrZzN2[9] & 60) >> 2);
                    } else if (b4 != 31) {
                        i = (bArrZzN2[5] & 3) << 12;
                        i2 = (bArrZzN2[6] & 255) << 4;
                        b = bArrZzN2[7];
                    } else {
                        i6 = ((bArrZzN2[8] & 60) >> 2) | ((3 & bArrZzN2[6]) << 12) | ((bArrZzN2[7] & 255) << 4);
                    }
                    i3 = i6 + 1;
                    z = true;
                    if (z) {
                        i3 = (i3 * 16) / 14;
                    }
                    this.zzl = i3;
                    if (b4 != -2) {
                        if (b4 != -1) {
                            i4 = (bArrZzN2[4] & 7) << 4;
                            b3 = bArrZzN2[7];
                        } else if (b4 != 31) {
                            i4 = (bArrZzN2[4] & 1) << 6;
                            b2 = bArrZzN2[5];
                        } else {
                            i4 = (bArrZzN2[5] & 7) << 4;
                            b3 = bArrZzN2[6];
                        }
                        i5 = b3 & 60;
                        this.zzj = zzgaq.zzb(zzei.zzt((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzE));
                        this.zza.zzL(0);
                        this.zzf.zzr(this.zza, 18);
                        this.zzg = 6;
                    } else {
                        i4 = (bArrZzN2[5] & 1) << 6;
                        b2 = bArrZzN2[4];
                    }
                    i5 = b2 & 252;
                    this.zzj = zzgaq.zzb(zzei.zzt((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzE));
                    this.zza.zzL(0);
                    this.zzf.zzr(this.zza, 18);
                    this.zzg = 6;
                } else {
                    i = (bArrZzN2[4] & 3) << 12;
                    i2 = (bArrZzN2[7] & 255) << 4;
                    b = bArrZzN2[6];
                }
                i3 = (i | i2 | ((b & 240) >> 4)) + 1;
                z = false;
                if (z) {
                    i3 = (i3 * 16) / 14;
                }
                this.zzl = i3;
                if (b4 != -2) {
                    if (b4 != -1) {
                        i4 = (bArrZzN2[4] & 7) << 4;
                        b3 = bArrZzN2[7];
                    } else if (b4 != 31) {
                        i4 = (bArrZzN2[4] & 1) << 6;
                        b2 = bArrZzN2[5];
                    } else {
                        i4 = (bArrZzN2[5] & 7) << 4;
                        b3 = bArrZzN2[6];
                    }
                    i5 = b3 & 60;
                    this.zzj = zzgaq.zzb(zzei.zzt((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzE));
                    this.zza.zzL(0);
                    this.zzf.zzr(this.zza, 18);
                    this.zzg = 6;
                } else {
                    i4 = (bArrZzN2[5] & 1) << 6;
                    b2 = bArrZzN2[4];
                }
                i5 = b2 & 252;
                this.zzj = zzgaq.zzb(zzei.zzt((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzE));
                this.zza.zzL(0);
                this.zzf.zzr(this.zza, 18);
                this.zzg = 6;
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
        this.zzp = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = C.TIME_UNSET;
        this.zzb.set(0);
    }
}
