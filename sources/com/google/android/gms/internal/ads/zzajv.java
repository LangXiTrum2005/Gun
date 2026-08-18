package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzajv extends zzajt {

    @Nullable
    private zzaju zza;
    private int zzb;
    private boolean zzc;

    @Nullable
    private zzady zzd;

    @Nullable
    private zzadw zze;

    @Override // com.google.android.gms.internal.ads.zzajt
    public final long zza(zzdy zzdyVar) {
        if ((zzdyVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzdyVar.zzN()[0];
        zzaju zzajuVar = this.zza;
        zzcw.zzb(zzajuVar);
        int i = !zzajuVar.zzd[(b >> 1) & (255 >>> (8 - zzajuVar.zze))].zza ? zzajuVar.zza.zze : zzajuVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzdyVar.zzc() < zzdyVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzdyVar.zzN(), zzdyVar.zze() + 4);
            zzdyVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzdyVar.zzK(zzdyVar.zze() + 4);
        }
        long j = i2;
        byte[] bArrZzN = zzdyVar.zzN();
        bArrZzN[zzdyVar.zze() - 4] = (byte) (j & 255);
        bArrZzN[zzdyVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzN[zzdyVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzN[zzdyVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03bd  */
    @Override // com.google.android.gms.internal.ads.zzajt
    public final boolean zzc(zzdy zzdyVar, long j, zzajq zzajqVar) throws IOException {
        zzaju zzajuVar;
        int i;
        int iZzb;
        int i2;
        int i3;
        if (this.zza != null) {
            zzajqVar.zza.getClass();
            return false;
        }
        zzady zzadyVar = this.zzd;
        int i4 = 4;
        if (zzadyVar != null) {
            zzadw zzadwVar = this.zze;
            if (zzadwVar == null) {
                this.zze = zzadz.zzc(zzdyVar, true, true);
            } else {
                byte[] bArr = new byte[zzdyVar.zze()];
                System.arraycopy(zzdyVar.zzN(), 0, bArr, 0, zzdyVar.zze());
                int i5 = zzadyVar.zza;
                int i6 = 5;
                zzadz.zzd(5, zzdyVar, false);
                int iZzm = zzdyVar.zzm() + 1;
                zzadv zzadvVar = new zzadv(zzdyVar.zzN());
                zzadvVar.zzc(zzdyVar.zzd() * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iZzm) {
                        zzady zzadyVar2 = zzadyVar;
                        int i10 = 6;
                        int iZzb2 = zzadvVar.zzb(6) + 1;
                        for (int i11 = 0; i11 < iZzb2; i11++) {
                            if (zzadvVar.zzb(16) != 0) {
                                throw zzbc.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i12 = 1;
                        int iZzb3 = zzadvVar.zzb(6) + 1;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iZzb3) {
                                int i15 = 1;
                                int iZzb4 = zzadvVar.zzb(i10) + 1;
                                int i16 = 0;
                                while (i16 < iZzb4) {
                                    if (zzadvVar.zzb(16) > 2) {
                                        throw zzbc.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzadvVar.zzc(24);
                                    zzadvVar.zzc(24);
                                    zzadvVar.zzc(24);
                                    int iZzb5 = zzadvVar.zzb(i10) + i15;
                                    int i17 = 8;
                                    zzadvVar.zzc(8);
                                    int[] iArr = new int[iZzb5];
                                    for (int i18 = 0; i18 < iZzb5; i18++) {
                                        iArr[i18] = ((zzadvVar.zzd() ? zzadvVar.zzb(5) : 0) * 8) + zzadvVar.zzb(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iZzb5) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr[i19] & (1 << i20)) != 0) {
                                                zzadvVar.zzc(i17);
                                            }
                                            i20++;
                                            i17 = 8;
                                        }
                                        i19++;
                                        i17 = 8;
                                    }
                                    i16++;
                                    i10 = 6;
                                    i15 = 1;
                                }
                                int iZzb6 = zzadvVar.zzb(i10) + 1;
                                for (int i21 = 0; i21 < iZzb6; i21++) {
                                    int iZzb7 = zzadvVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        zzdo.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb7);
                                    } else {
                                        if (zzadvVar.zzd()) {
                                            i = 1;
                                            iZzb = zzadvVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzadvVar.zzd()) {
                                            int iZzb8 = zzadvVar.zzb(8) + i;
                                            for (int i22 = 0; i22 < iZzb8; i22++) {
                                                int i23 = i5 - 1;
                                                zzadvVar.zzc(zzadz.zza(i23));
                                                zzadvVar.zzc(zzadz.zza(i23));
                                            }
                                        }
                                        if (zzadvVar.zzb(2) != 0) {
                                            throw zzbc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i24 = 0; i24 < i5; i24++) {
                                                zzadvVar.zzc(4);
                                            }
                                        }
                                        for (int i25 = 0; i25 < iZzb; i25++) {
                                            zzadvVar.zzc(8);
                                            zzadvVar.zzc(8);
                                            zzadvVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzadvVar.zzb(6);
                                int i26 = iZzb9 + 1;
                                zzadx[] zzadxVarArr = new zzadx[i26];
                                for (int i27 = 0; i27 < i26; i27++) {
                                    zzadxVarArr[i27] = new zzadx(zzadvVar.zzd(), zzadvVar.zzb(16), zzadvVar.zzb(16), zzadvVar.zzb(8));
                                }
                                if (!zzadvVar.zzd()) {
                                    throw zzbc.zza("framing bit after modes not set as expected", null);
                                }
                                zzajuVar = new zzaju(zzadyVar2, zzadwVar, bArr, zzadxVarArr, zzadz.zza(iZzb9));
                                break;
                            }
                            int iZzb10 = zzadvVar.zzb(i9);
                            if (iZzb10 == 0) {
                                i2 = iZzb3;
                                int i28 = 8;
                                zzadvVar.zzc(8);
                                zzadvVar.zzc(16);
                                zzadvVar.zzc(16);
                                zzadvVar.zzc(6);
                                zzadvVar.zzc(8);
                                int iZzb11 = zzadvVar.zzb(4) + 1;
                                int i29 = 0;
                                while (i29 < iZzb11) {
                                    zzadvVar.zzc(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            } else {
                                if (iZzb10 != i12) {
                                    throw zzbc.zza("floor type greater than 1 not decodable: " + iZzb10, null);
                                }
                                int iZzb12 = zzadvVar.zzb(i6);
                                int[] iArr2 = new int[iZzb12];
                                int i30 = -1;
                                for (int i31 = 0; i31 < iZzb12; i31++) {
                                    int iZzb13 = zzadvVar.zzb(4);
                                    iArr2[i31] = iZzb13;
                                    if (iZzb13 > i30) {
                                        i30 = iZzb13;
                                    }
                                }
                                int i32 = i30 + 1;
                                int[] iArr3 = new int[i32];
                                int i33 = 0;
                                while (i33 < i32) {
                                    iArr3[i33] = zzadvVar.zzb(i14) + 1;
                                    int iZzb14 = zzadvVar.zzb(i8);
                                    if (iZzb14 > 0) {
                                        i3 = 8;
                                        zzadvVar.zzc(8);
                                    } else {
                                        i3 = 8;
                                    }
                                    int i34 = iZzb3;
                                    int i35 = 0;
                                    for (int i36 = 1; i35 < (i36 << iZzb14); i36 = 1) {
                                        zzadvVar.zzc(i3);
                                        i35++;
                                        i3 = 8;
                                    }
                                    i33++;
                                    iZzb3 = i34;
                                    i8 = 2;
                                    i14 = 3;
                                }
                                i2 = iZzb3;
                                zzadvVar.zzc(i8);
                                int iZzb15 = zzadvVar.zzb(4);
                                int i37 = 0;
                                int i38 = 0;
                                for (int i39 = 0; i39 < iZzb12; i39++) {
                                    i37 += iArr3[iArr2[i39]];
                                    while (i38 < i37) {
                                        zzadvVar.zzc(iZzb15);
                                        i38++;
                                    }
                                }
                            }
                            i13++;
                            iZzb3 = i2;
                            i10 = 6;
                            i8 = 2;
                            i9 = 16;
                            i12 = 1;
                            i6 = 5;
                        }
                    } else {
                        if (zzadvVar.zzb(24) != 5653314) {
                            throw zzbc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzadvVar.zza(), null);
                        }
                        int iZzb16 = zzadvVar.zzb(16);
                        int iZzb17 = zzadvVar.zzb(24);
                        if (zzadvVar.zzd()) {
                            zzadvVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzadvVar.zzb(zzadz.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzadvVar.zzd();
                            for (int i40 = 0; i40 < iZzb17; i40++) {
                                if (!zZzd) {
                                    zzadvVar.zzc(5);
                                } else if (zzadvVar.zzd()) {
                                    zzadvVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzadvVar.zzb(i4);
                        if (iZzb19 > 2) {
                            throw zzbc.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzadyVar = zzadyVar;
                            }
                            i7++;
                            zzadyVar = zzadyVar;
                            i4 = 4;
                        } else {
                            i8 = iZzb19;
                        }
                        zzadvVar.zzc(32);
                        zzadvVar.zzc(32);
                        int iZzb20 = zzadvVar.zzb(i4) + 1;
                        zzadvVar.zzc(1);
                        zzadvVar.zzc((int) ((i8 == 1 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i7++;
                        zzadyVar = zzadyVar;
                        i4 = 4;
                    }
                }
            }
            this.zza = zzajuVar;
            if (zzajuVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzady zzadyVar3 = zzajuVar.zza;
            arrayList.add(zzadyVar3.zzg);
            arrayList.add(zzajuVar.zzc);
            zzay zzayVarZzb = zzadz.zzb(zzfxn.zzm(zzajuVar.zzb.zza));
            zzz zzzVar = new zzz();
            zzzVar.zzaa(MimeTypes.AUDIO_VORBIS);
            zzzVar.zzy(zzadyVar3.zzd);
            zzzVar.zzV(zzadyVar3.zzc);
            zzzVar.zzz(zzadyVar3.zza);
            zzzVar.zzab(zzadyVar3.zzb);
            zzzVar.zzN(arrayList);
            zzzVar.zzT(zzayVarZzb);
            zzajqVar.zza = zzzVar.zzag();
            return true;
        }
        zzadz.zzd(1, zzdyVar, false);
        int iZzj = zzdyVar.zzj();
        int iZzm2 = zzdyVar.zzm();
        int iZzj2 = zzdyVar.zzj();
        int iZzi = zzdyVar.zzi();
        int i41 = iZzi <= 0 ? -1 : iZzi;
        int iZzi2 = zzdyVar.zzi();
        int i42 = iZzi2 <= 0 ? -1 : iZzi2;
        int iZzi3 = zzdyVar.zzi();
        int i43 = iZzi3 <= 0 ? -1 : iZzi3;
        int iZzm3 = zzdyVar.zzm();
        this.zzd = new zzady(iZzj, iZzm2, iZzj2, i41, i42, i43, (int) Math.pow(2.0d, iZzm3 & 15), (int) Math.pow(2.0d, (iZzm3 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzdyVar.zzm() & 1), Arrays.copyOf(zzdyVar.zzN(), zzdyVar.zze()));
        zzajuVar = null;
        this.zza = zzajuVar;
        if (zzajuVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzady zzadyVar4 = zzajuVar.zza;
        arrayList2.add(zzadyVar4.zzg);
        arrayList2.add(zzajuVar.zzc);
        zzay zzayVarZzb2 = zzadz.zzb(zzfxn.zzm(zzajuVar.zzb.zza));
        zzz zzzVar2 = new zzz();
        zzzVar2.zzaa(MimeTypes.AUDIO_VORBIS);
        zzzVar2.zzy(zzadyVar4.zzd);
        zzzVar2.zzV(zzadyVar4.zzc);
        zzzVar2.zzz(zzadyVar4.zza);
        zzzVar2.zzab(zzadyVar4.zzb);
        zzzVar2.zzN(arrayList2);
        zzzVar2.zzT(zzayVarZzb2);
        zzajqVar.zza = zzzVar2.zzag();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    public final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzady zzadyVar = this.zzd;
        this.zzb = zzadyVar != null ? zzadyVar.zze : 0;
    }
}
