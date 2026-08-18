package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamf implements zzamj {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzdx zzc = new zzdx(new byte[7], 7);
    private final zzdy zzd = new zzdy(Arrays.copyOf(zza, 10));

    @Nullable
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzadt zzh;
    private zzadt zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzadt zzv;
    private long zzw;

    public zzamf(boolean z, @Nullable String str, int i) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = C.TIME_UNSET;
        this.zzu = C.TIME_UNSET;
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzadt zzadtVar, long j, int i, int i2) {
        this.zzj = 4;
        this.zzk = i;
        this.zzv = zzadtVar;
        this.zzw = j;
        this.zzt = i2;
    }

    private final boolean zzk(zzdy zzdyVar, byte[] bArr, int i) {
        int iMin = Math.min(zzdyVar.zzb(), i - this.zzk);
        zzdyVar.zzH(bArr, this.zzk, iMin);
        int i2 = this.zzk + iMin;
        this.zzk = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzdy zzdyVar, byte[] bArr, int i) {
        if (zzdyVar.zzb() < i) {
            return false;
        }
        zzdyVar.zzH(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x028d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0291  */
    /* JADX WARN: Code duplicated, block: B:112:0x0295  */
    /* JADX WARN: Code duplicated, block: B:114:0x0299  */
    /* JADX WARN: Code duplicated, block: B:116:0x029d  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:157:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0218  */
    /* JADX WARN: Code duplicated, block: B:75:0x0228  */
    /* JADX WARN: Code duplicated, block: B:77:0x0233  */
    /* JADX WARN: Code duplicated, block: B:79:0x0237  */
    /* JADX WARN: Code duplicated, block: B:81:0x023a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0249  */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) throws zzbc {
        int i;
        int i2;
        int i3;
        int iZzd;
        byte[] bArrZzN;
        int iZze;
        int i4;
        byte b;
        int i5;
        int i6;
        int i7;
        byte b2;
        int i8 = 0;
        int i9 = 2;
        this.zzh.getClass();
        int i10 = zzei.zza;
        while (zzdyVar.zzb() > 0) {
            int i11 = this.zzj;
            int i12 = 13;
            if (i11 == 0) {
                byte[] bArrZzN2 = zzdyVar.zzN();
                int iZzd2 = zzdyVar.zzd();
                int iZze2 = zzdyVar.zze();
                while (true) {
                    if (iZzd2 < iZze2) {
                        int i13 = iZzd2 + 1;
                        byte b3 = bArrZzN2[iZzd2];
                        int i14 = b3 & 255;
                        if (this.zzl == 512 && zzl((byte) -1, (byte) i14)) {
                            if (!this.zzn) {
                                int i15 = iZzd2 - 1;
                                zzdyVar.zzL(iZzd2);
                                if (zzm(zzdyVar, this.zzc.zza, 1)) {
                                    this.zzc.zzl(4);
                                    int iZzd3 = this.zzc.zzd(1);
                                    int i16 = this.zzo;
                                    if (i16 == -1 || iZzd3 == i16) {
                                        if (this.zzp == -1) {
                                            if (zzm(zzdyVar, this.zzc.zza, 4)) {
                                                this.zzc.zzl(14);
                                                iZzd = this.zzc.zzd(i12);
                                                if (iZzd >= 7) {
                                                    bArrZzN = zzdyVar.zzN();
                                                    iZze = zzdyVar.zze();
                                                    i4 = i15 + iZzd;
                                                    if (i4 >= iZze) {
                                                        b = bArrZzN[i4];
                                                        if (b == -1) {
                                                            i7 = i4 + 1;
                                                            if (i7 != iZze) {
                                                                b2 = bArrZzN[i7];
                                                                if (zzl((byte) -1, b2) || ((b2 & 8) >> 3) != iZzd3) {
                                                                }
                                                            }
                                                        } else if (b == 73 || ((i5 = i4 + 1) != iZze && (bArrZzN[i5] != 68 || ((i6 = i4 + 2) != iZze && bArrZzN[i6] != 51)))) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (zzm(zzdyVar, this.zzc.zza, 1)) {
                                            this.zzc.zzl(i9);
                                            if (this.zzc.zzd(4) == this.zzp) {
                                                zzdyVar.zzL(iZzd2 + 1);
                                                if (zzm(zzdyVar, this.zzc.zza, 4)) {
                                                    this.zzc.zzl(14);
                                                    iZzd = this.zzc.zzd(i12);
                                                    if (iZzd >= 7) {
                                                        bArrZzN = zzdyVar.zzN();
                                                        iZze = zzdyVar.zze();
                                                        i4 = i15 + iZzd;
                                                        if (i4 >= iZze) {
                                                            b = bArrZzN[i4];
                                                            if (b == -1) {
                                                                i7 = i4 + 1;
                                                                if (i7 != iZze) {
                                                                    b2 = bArrZzN[i7];
                                                                    if (zzl((byte) -1, b2)) {
                                                                    }
                                                                }
                                                            } else if (b == 73) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = this.zzl;
                                i2 = i | i14;
                                if (i2 != 329) {
                                    i3 = 768;
                                } else if (i2 != 511) {
                                    if (i2 != 836) {
                                        i3 = 1024;
                                    } else if (i2 != 1075) {
                                        this.zzj = 2;
                                        this.zzk = 3;
                                        this.zzt = 0;
                                        this.zzd.zzL(0);
                                        zzdyVar.zzL(i13);
                                    } else if (i != 256) {
                                        this.zzl = 256;
                                    } else {
                                        iZzd2 = i13;
                                    }
                                    i12 = 13;
                                    i9 = 2;
                                } else {
                                    i3 = 512;
                                }
                                this.zzl = i3;
                                iZzd2 = i13;
                                i12 = 13;
                                i9 = 2;
                            }
                            this.zzq = (b3 & 8) >> 3;
                            this.zzm = 1 == ((b3 & 1) ^ 1);
                            if (this.zzn) {
                                zzi();
                            } else {
                                this.zzj = 1;
                                this.zzk = 0;
                            }
                            zzdyVar.zzL(i13);
                        } else {
                            i = this.zzl;
                            i2 = i | i14;
                            if (i2 != 329) {
                                i3 = 768;
                            } else if (i2 != 511) {
                                if (i2 != 836) {
                                    i3 = 1024;
                                } else if (i2 != 1075) {
                                    this.zzj = 2;
                                    this.zzk = 3;
                                    this.zzt = 0;
                                    this.zzd.zzL(0);
                                    zzdyVar.zzL(i13);
                                } else if (i != 256) {
                                    this.zzl = 256;
                                } else {
                                    iZzd2 = i13;
                                }
                                i12 = 13;
                                i9 = 2;
                            } else {
                                i3 = 512;
                            }
                            this.zzl = i3;
                            iZzd2 = i13;
                            i12 = 13;
                            i9 = 2;
                        }
                    } else {
                        zzdyVar.zzL(iZzd2);
                    }
                    i8 = 0;
                    i9 = 2;
                }
            } else if (i11 != 1) {
                if (i11 != i9) {
                    if (i11 != 3) {
                        int iMin = Math.min(zzdyVar.zzb(), this.zzt - this.zzk);
                        this.zzv.zzr(zzdyVar, iMin);
                        int i17 = this.zzk + iMin;
                        this.zzk = i17;
                        if (i17 == this.zzt) {
                            zzcw.zzf(this.zzu != C.TIME_UNSET);
                            this.zzv.zzt(this.zzu, 1, this.zzt, 0, null);
                            this.zzu += this.zzw;
                            zzh();
                        }
                    } else {
                        if (zzk(zzdyVar, this.zzc.zza, true != this.zzm ? 5 : 7)) {
                            this.zzc.zzl(i8);
                            if (this.zzr) {
                                this.zzc.zzn(10);
                            } else {
                                int iZzd4 = this.zzc.zzd(i9) + 1;
                                if (iZzd4 != i9) {
                                    zzdo.zzf("AdtsReader", "Detected audio object type: " + iZzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzn(5);
                                int iZzd5 = this.zzc.zzd(3);
                                int i18 = this.zzp;
                                byte[] bArr = new byte[i9];
                                bArr[i8] = (byte) (((i18 >> 1) & 7) | 16);
                                bArr[1] = (byte) (((iZzd5 << 3) & 120) | ((i18 << 7) & 128));
                                zzabi zzabiVarZza = zzabk.zza(bArr);
                                zzz zzzVar = new zzz();
                                zzzVar.zzM(this.zzg);
                                zzzVar.zzaa(MimeTypes.AUDIO_AAC);
                                zzzVar.zzA(zzabiVarZza.zzc);
                                zzzVar.zzz(zzabiVarZza.zzb);
                                zzzVar.zzab(zzabiVarZza.zza);
                                zzzVar.zzN(Collections.singletonList(bArr));
                                zzzVar.zzQ(this.zze);
                                zzzVar.zzY(this.zzf);
                                zzab zzabVarZzag = zzzVar.zzag();
                                this.zzs = 1024000000 / ((long) zzabVarZzag.zzE);
                                this.zzh.zzm(zzabVarZzag);
                                this.zzr = true;
                            }
                            this.zzc.zzn(4);
                            int iZzd6 = this.zzc.zzd(13);
                            zzj(this.zzh, this.zzs, 0, this.zzm ? iZzd6 - 9 : iZzd6 - 7);
                        }
                    }
                } else if (zzk(zzdyVar, this.zzd.zzN(), 10)) {
                    this.zzi.zzr(this.zzd, 10);
                    this.zzd.zzL(6);
                    zzj(this.zzi, 0L, 10, this.zzd.zzl() + 10);
                }
            } else if (zzdyVar.zzb() != 0) {
                zzdx zzdxVar = this.zzc;
                zzdxVar.zza[i8] = zzdyVar.zzN()[zzdyVar.zzd()];
                zzdxVar.zzl(i9);
                int iZzd7 = this.zzc.zzd(4);
                int i19 = this.zzp;
                if (i19 == -1 || iZzd7 == i19) {
                    if (!this.zzn) {
                        this.zzn = true;
                        this.zzo = this.zzq;
                        this.zzp = iZzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzg = zzanxVar.zzb();
        zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 1);
        this.zzh = zzadtVarZzw;
        this.zzv = zzadtVarZzw;
        if (!this.zzb) {
            this.zzi = new zzaci();
            return;
        }
        zzanxVar.zzc();
        zzadt zzadtVarZzw2 = zzacqVar.zzw(zzanxVar.zza(), 5);
        this.zzi = zzadtVarZzw2;
        zzz zzzVar = new zzz();
        zzzVar.zzM(zzanxVar.zzb());
        zzzVar.zzaa(MimeTypes.APPLICATION_ID3);
        zzadtVarZzw2.zzm(zzzVar.zzag());
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzu = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzu = C.TIME_UNSET;
        zzg();
    }
}
