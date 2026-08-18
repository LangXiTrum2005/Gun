package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaiv implements zzacn, zzadm {
    private int zzA;

    @Nullable
    private zzagv zzB;
    private final zzakd zza;
    private final int zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdy zze;
    private final zzdy zzf;
    private final ArrayDeque zzg;
    private final zzaiz zzh;
    private final List zzi;
    private zzfxn zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;

    @Nullable
    private zzdy zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private zzacq zzv;
    private zzaiu[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzaiv() {
        this(zzakd.zza, 16);
    }

    private static int zzj(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzaje zzajeVar, long j) {
        int iZza = zzajeVar.zza(j);
        return iZza == -1 ? zzajeVar.zzb(j) : iZza;
    }

    private static long zzl(zzaje zzajeVar, long j, long j2) {
        int iZzk = zzk(zzajeVar, j);
        return iZzk == -1 ? j2 : Math.min(zzajeVar.zzc[iZzk], j2);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    private final void zzn(long j) throws zzbc {
        zzay zzayVar;
        long j2;
        zzay zzayVar2;
        int i;
        ArrayList arrayList;
        int i2;
        zzay zzayVarZzc;
        int i3;
        while (true) {
            int i4 = 1;
            if (this.zzg.isEmpty() || ((zzen) this.zzg.peek()).zza != j) {
                break;
            }
            zzen zzenVar = (zzen) this.zzg.pop();
            if (zzenVar.zzd == 1836019574) {
                zzen zzenVarZza = zzenVar.zza(1835365473);
                new ArrayList();
                zzay zzayVarZzb = zzenVarZza != null ? zzaik.zzb(zzenVarZza) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z = this.zzA == 1;
                zzadb zzadbVar = new zzadb();
                zzeo zzeoVarZzb = zzenVar.zzb(1969517665);
                if (zzeoVarZzb != null) {
                    zzay zzayVarZzc2 = zzaik.zzc(zzeoVarZzb);
                    zzadbVar.zzb(zzayVarZzc2);
                    zzayVar = zzayVarZzc2;
                } else {
                    zzayVar = null;
                }
                zzeo zzeoVarZzb2 = zzenVar.zzb(1836476516);
                zzeoVarZzb2.getClass();
                zzay zzayVar3 = new zzay(C.TIME_UNSET, zzaik.zzd(zzeoVarZzb2.zza));
                ArrayList arrayList3 = arrayList2;
                long j3 = -9223372036854775807L;
                List listZzf = zzaik.zzf(zzenVar, zzadbVar, C.TIME_UNSET, null, 1 == (this.zzb & 1), z, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzait
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final Object apply(Object obj) {
                        return (zzajb) obj;
                    }
                });
                long jMax = -9223372036854775807L;
                int i5 = 0;
                int size = -1;
                int i6 = 0;
                while (true) {
                    j2 = 0;
                    if (i5 >= listZzf.size()) {
                        break;
                    }
                    zzaje zzajeVar = (zzaje) listZzf.get(i5);
                    if (zzajeVar.zzb == 0) {
                        arrayList = arrayList3;
                    } else {
                        zzajb zzajbVar = zzajeVar.zza;
                        int i7 = i6 + 1;
                        zzaiu zzaiuVar = new zzaiu(zzajbVar, zzajeVar, this.zzv.zzw(i6, zzajbVar.zzb));
                        long j4 = zzajbVar.zze;
                        if (j4 == j3) {
                            j4 = zzajeVar.zzh;
                        }
                        zzaiuVar.zzc.zzl(j4);
                        jMax = Math.max(jMax, j4);
                        int i8 = MimeTypes.AUDIO_TRUEHD.equals(zzajbVar.zzg.zzo) ? zzajeVar.zze * 16 : zzajeVar.zze + 30;
                        zzz zzzVarZzb = zzajbVar.zzg.zzb();
                        zzzVarZzb.zzR(i8);
                        if (zzajbVar.zzb == 2) {
                            zzab zzabVar = zzajbVar.zzg;
                            int i9 = this.zzb;
                            int i10 = zzabVar.zzf;
                            if ((i9 & 8) != 0) {
                                i10 |= size == -1 ? 1 : 2;
                            }
                            if (zzabVar.zzx == -1.0f && j4 > 0 && (i3 = zzajeVar.zzb) > 0) {
                                zzzVarZzb.zzI(i3 / (j4 / 1000000.0f));
                            }
                            zzzVarZzb.zzY(i10);
                        }
                        if (zzajbVar.zzb == 1 && zzadbVar.zza()) {
                            zzzVarZzb.zzG(zzadbVar.zza);
                            zzzVarZzb.zzH(zzadbVar.zzb);
                        }
                        int i11 = zzajbVar.zzb;
                        zzay[] zzayVarArr = new zzay[3];
                        if (this.zzi.isEmpty()) {
                            i = 0;
                            zzayVar2 = null;
                        } else {
                            zzayVar2 = new zzay(this.zzi);
                            i = 0;
                        }
                        zzayVarArr[i] = zzayVar2;
                        zzayVarArr[1] = zzayVar;
                        zzayVarArr[2] = zzayVar3;
                        zzay zzayVar4 = new zzay(C.TIME_UNSET, new zzax[i]);
                        if (zzayVarZzb != null) {
                            int i12 = 0;
                            while (i12 < zzayVarZzb.zza()) {
                                zzax zzaxVarZzb = zzayVarZzb.zzb(i12);
                                if (zzaxVarZzb instanceof zzem) {
                                    zzem zzemVar = (zzem) zzaxVarZzb;
                                    if (!zzemVar.zza.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                                        i2 = 1;
                                        zzayVarZzc = zzayVar4.zzc(zzemVar);
                                    } else if (i11 == 2) {
                                        i2 = 1;
                                        zzayVarZzc = zzayVar4.zzc(zzemVar);
                                    } else {
                                        i2 = 1;
                                    }
                                    zzayVar4 = zzayVarZzc;
                                } else {
                                    i2 = 1;
                                }
                                i12 += i2;
                            }
                        }
                        for (int i13 = 0; i13 < 3; i13++) {
                            zzayVar4 = zzayVar4.zzd(zzayVarArr[i13]);
                        }
                        if (zzayVar4.zza() > 0) {
                            zzzVarZzb.zzT(zzayVar4);
                        }
                        zzaiuVar.zzc.zzm(zzzVarZzb.zzag());
                        if (zzajbVar.zzb == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzaiuVar);
                        i6 = i7;
                        i4 = 1;
                    }
                    i5 += i4;
                    arrayList3 = arrayList;
                    listZzf = listZzf;
                    j3 = C.TIME_UNSET;
                }
                this.zzy = size;
                this.zzz = jMax;
                zzaiu[] zzaiuVarArr = (zzaiu[]) arrayList3.toArray(new zzaiu[0]);
                this.zzw = zzaiuVarArr;
                int length = zzaiuVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i14 = 0; i14 < zzaiuVarArr.length; i14++) {
                    jArr[i14] = new long[zzaiuVarArr[i14].zzb.zzb];
                    jArr2[i14] = zzaiuVarArr[i14].zzb.zzf[0];
                }
                int i15 = 0;
                while (i15 < zzaiuVarArr.length) {
                    long j5 = Long.MAX_VALUE;
                    int i16 = -1;
                    for (int i17 = 0; i17 < zzaiuVarArr.length; i17++) {
                        if (!zArr[i17]) {
                            long j6 = jArr2[i17];
                            if (j6 <= j5) {
                                i16 = i17;
                                j5 = j6;
                            }
                        }
                    }
                    int i18 = iArr[i16];
                    long[] jArr3 = jArr[i16];
                    jArr3[i18] = j2;
                    zzaje zzajeVar2 = zzaiuVarArr[i16].zzb;
                    j2 += (long) zzajeVar2.zzd[i18];
                    int i19 = i18 + 1;
                    iArr[i16] = i19;
                    if (i19 < jArr3.length) {
                        jArr2[i16] = zzajeVar2.zzf[i19];
                    } else {
                        zArr[i16] = true;
                        i15++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((zzen) this.zzg.peek()).zzc(zzenVar);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzz;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        char c;
        int i;
        boolean z;
        boolean z2;
        while (true) {
            int i2 = this.zzk;
            if (i2 == 0) {
                if (this.zzn == 0) {
                    if (!zzacoVar.zzn(this.zzf.zzN(), 0, 8, true)) {
                        if (this.zzA != 2 || (this.zzb & 2) == 0) {
                            return -1;
                        }
                        zzadt zzadtVarZzw = this.zzv.zzw(0, 4);
                        zzagv zzagvVar = this.zzB;
                        zzay zzayVar = zzagvVar == null ? null : new zzay(C.TIME_UNSET, zzagvVar);
                        zzz zzzVar = new zzz();
                        zzzVar.zzT(zzayVar);
                        zzadtVarZzw.zzm(zzzVar.zzag());
                        this.zzv.zzD();
                        this.zzv.zzO(new zzadl(C.TIME_UNSET, 0L));
                        return -1;
                    }
                    this.zzn = 8;
                    this.zzf.zzL(0);
                    this.zzm = this.zzf.zzu();
                    this.zzl = this.zzf.zzg();
                }
                long j = this.zzm;
                if (j == 1) {
                    zzacoVar.zzi(this.zzf.zzN(), 8, 8);
                    this.zzn += 8;
                    this.zzm = this.zzf.zzw();
                } else if (j == 0) {
                    long jZzd = zzacoVar.zzd();
                    if (jZzd == -1) {
                        zzen zzenVar = (zzen) this.zzg.peek();
                        jZzd = zzenVar != null ? zzenVar.zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzm = (jZzd - zzacoVar.zzf()) + ((long) this.zzn);
                    }
                }
                long j2 = this.zzm;
                int i3 = this.zzn;
                if (j2 < i3) {
                    throw zzbc.zzc("Atom size less than header length (unsupported).");
                }
                int i4 = this.zzl;
                if (i4 == 1836019574 || i4 == 1953653099 || i4 == 1835297121 || i4 == 1835626086 || i4 == 1937007212 || i4 == 1701082227 || i4 == 1835365473 || i4 == 1701082724) {
                    long jZzf = zzacoVar.zzf();
                    long j3 = this.zzm;
                    long j4 = jZzf + j3;
                    long j5 = this.zzn;
                    if (j3 != j5 && this.zzl == 1835365473) {
                        this.zze.zzI(8);
                        zzacoVar.zzh(this.zze.zzN(), 0, 8);
                        zzaik.zzg(this.zze);
                        zzacoVar.zzk(this.zze.zzd());
                        zzacoVar.zzj();
                    }
                    long j6 = j4 - j5;
                    this.zzg.push(new zzen(this.zzl, j6));
                    if (this.zzm == this.zzn) {
                        zzn(j6);
                    } else {
                        zzm();
                    }
                } else if (i4 == 1835296868 || i4 == 1836476516 || i4 == 1751411826 || i4 == 1937011556 || i4 == 1937011827 || i4 == 1937011571 || i4 == 1668576371 || i4 == 1701606260 || i4 == 1937011555 || i4 == 1937011578 || i4 == 1937013298 || i4 == 1937007471 || i4 == 1668232756 || i4 == 1953196132 || i4 == 1718909296 || i4 == 1969517665 || i4 == 1801812339 || i4 == 1768715124) {
                    zzcw.zzf(i3 == 8);
                    zzcw.zzf(this.zzm <= 2147483647L);
                    zzdy zzdyVar = new zzdy((int) this.zzm);
                    System.arraycopy(this.zzf.zzN(), 0, zzdyVar.zzN(), 0, 8);
                    this.zzo = zzdyVar;
                    this.zzk = 1;
                } else {
                    long jZzf2 = zzacoVar.zzf();
                    long j7 = this.zzn;
                    long j8 = jZzf2 - j7;
                    if (this.zzl == 1836086884) {
                        this.zzB = new zzagv(0L, j8, C.TIME_UNSET, j8 + j7, this.zzm - j7);
                    }
                    this.zzo = null;
                    this.zzk = 1;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        this.zzh.zza(zzacoVar, zzadjVar, this.zzi);
                        if (zzadjVar.zza == 0) {
                            zzm();
                        }
                        return 1;
                    }
                    long jZzf3 = zzacoVar.zzf();
                    int i5 = this.zzp;
                    if (i5 == -1) {
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        int i6 = 0;
                        boolean z3 = true;
                        int i7 = -1;
                        int i8 = -1;
                        boolean z4 = true;
                        while (true) {
                            zzaiu[] zzaiuVarArr = this.zzw;
                            if (i6 >= zzaiuVarArr.length) {
                                break;
                            }
                            zzaiu zzaiuVar = zzaiuVarArr[i6];
                            int i9 = zzaiuVar.zze;
                            zzaje zzajeVar = zzaiuVar.zzb;
                            if (i9 != zzajeVar.zzb) {
                                long j12 = zzajeVar.zzc[i9];
                                long[][] jArr = this.zzx;
                                int i10 = zzei.zza;
                                long j13 = jArr[i6][i9];
                                long j14 = j12 - jZzf3;
                                boolean z5 = j14 < 0 || j14 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (z4) {
                                        z4 = z5;
                                        j10 = j13;
                                        i8 = i6;
                                        j11 = j14;
                                    } else {
                                        z = false;
                                    }
                                    if (j13 < j9) {
                                        z3 = z5;
                                        j9 = j13;
                                        i7 = i6;
                                    }
                                }
                                if (z5 != z || j14 >= j11) {
                                    z4 = z;
                                } else {
                                    z4 = z5;
                                    j10 = j13;
                                    i8 = i6;
                                    j11 = j14;
                                }
                                if (j13 < j9) {
                                    z3 = z5;
                                    j9 = j13;
                                    i7 = i6;
                                }
                            }
                            i6++;
                        }
                        i5 = (j9 == Long.MAX_VALUE || !z3 || j10 < j9 + 10485760) ? i8 : i7;
                        this.zzp = i5;
                        if (i5 == -1) {
                            return -1;
                        }
                    }
                    zzaiu zzaiuVar2 = this.zzw[i5];
                    zzadt zzadtVar = zzaiuVar2.zzc;
                    int i11 = zzaiuVar2.zze;
                    zzaje zzajeVar2 = zzaiuVar2.zzb;
                    long j15 = zzajeVar2.zzc[i11];
                    int i12 = zzajeVar2.zzd[i11];
                    zzadu zzaduVar = zzaiuVar2.zzd;
                    long j16 = (j15 - jZzf3) + ((long) this.zzq);
                    if (j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzadjVar.zza = j15;
                        return 1;
                    }
                    if (zzaiuVar2.zza.zzh == 1) {
                        j16 += 8;
                        i12 -= 8;
                    }
                    zzacoVar.zzk((int) j16);
                    if (Objects.equals(zzaiuVar2.zza.zzg.zzo, "video/avc")) {
                        c = 1;
                    } else {
                        c = 1;
                        this.zzt = true;
                    }
                    zzajb zzajbVar = zzaiuVar2.zza;
                    int i13 = zzajbVar.zzk;
                    if (i13 == 0) {
                        if ("audio/ac4".equals(zzajbVar.zzg.zzo)) {
                            if (this.zzr == 0) {
                                zzabq.zzb(i12, this.zze);
                                i = 7;
                                zzadtVar.zzr(this.zze, 7);
                                this.zzr += 7;
                            } else {
                                i = 7;
                            }
                            i12 += i;
                        } else if (zzaduVar != null) {
                            zzaduVar.zzd(zzacoVar);
                        }
                        while (true) {
                            int i14 = this.zzr;
                            if (i14 >= i12) {
                                break;
                            }
                            int iZzf = zzadtVar.zzf(zzacoVar, i12 - i14, false);
                            this.zzq += iZzf;
                            this.zzr += iZzf;
                            this.zzs -= iZzf;
                        }
                    } else {
                        byte[] bArrZzN = this.zzd.zzN();
                        bArrZzN[0] = 0;
                        bArrZzN[c] = 0;
                        bArrZzN[2] = 0;
                        int i15 = i13 + 1;
                        int i16 = 4 - i13;
                        while (this.zzr < i12) {
                            int i17 = this.zzs;
                            if (i17 == 0) {
                                zzacoVar.zzi(bArrZzN, i16, i15);
                                this.zzq += i15;
                                this.zzd.zzL(0);
                                int iZzg = this.zzd.zzg();
                                if (iZzg <= 0) {
                                    throw zzbc.zza("Invalid NAL length", null);
                                }
                                this.zzs = iZzg - 1;
                                this.zzc.zzL(0);
                                zzadtVar.zzr(this.zzc, 4);
                                zzadtVar.zzr(this.zzd, 1);
                                this.zzr += 5;
                                i12 += i16;
                                if (!this.zzt && zzfk.zzi(bArrZzN[4])) {
                                    this.zzt = true;
                                }
                            } else {
                                int iZzf2 = zzadtVar.zzf(zzacoVar, i17, false);
                                this.zzq += iZzf2;
                                this.zzr += iZzf2;
                                this.zzs -= iZzf2;
                            }
                        }
                    }
                    zzaje zzajeVar3 = zzaiuVar2.zzb;
                    long j17 = zzajeVar3.zzf[i11];
                    int i18 = zzajeVar3.zzg[i11];
                    if (!this.zzt) {
                        i18 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if (zzaduVar != null) {
                        zzaduVar.zzc(zzadtVar, j17, i18, i12, 0, null);
                        if (i11 + 1 == zzaiuVar2.zzb.zzb) {
                            zzaduVar.zza(zzadtVar, null);
                        }
                    } else {
                        zzadtVar.zzt(j17, i18, i12, 0, null);
                    }
                    zzaiuVar2.zze++;
                    this.zzp = -1;
                    this.zzq = 0;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = true;
                    return 0;
                }
                long j18 = this.zzm - ((long) this.zzn);
                long jZzf4 = zzacoVar.zzf() + j18;
                zzdy zzdyVar2 = this.zzo;
                if (zzdyVar2 != null) {
                    zzacoVar.zzi(zzdyVar2.zzN(), this.zzn, (int) j18);
                    if (this.zzl == 1718909296) {
                        this.zzu = true;
                        zzdyVar2.zzL(8);
                        int iZzj = zzj(zzdyVar2.zzg());
                        if (iZzj == 0) {
                            zzdyVar2.zzM(4);
                            do {
                                if (zzdyVar2.zzb() <= 0) {
                                    iZzj = 0;
                                    break;
                                }
                                iZzj = zzj(zzdyVar2.zzg());
                            } while (iZzj == 0);
                        }
                        this.zzA = iZzj;
                    } else if (!this.zzg.isEmpty()) {
                        ((zzen) this.zzg.peek()).zzd(new zzeo(this.zzl, zzdyVar2));
                    }
                } else {
                    if (!this.zzu && this.zzl == 1835295092) {
                        this.zzA = 1;
                    }
                    if (j18 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzacoVar.zzk((int) j18);
                    } else {
                        zzadjVar.zza = zzacoVar.zzf() + j18;
                        z2 = true;
                    }
                    zzn(jZzf4);
                    if (z2 && this.zzk != 2) {
                        return 1;
                    }
                }
                z2 = false;
                zzn(jZzf4);
                if (z2) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        if ((this.zzb & 16) == 0) {
            zzacqVar = new zzakg(zzacqVar, this.zza);
        }
        this.zzv = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = true;
        if (j == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzaiu zzaiuVar : this.zzw) {
            zzaje zzajeVar = zzaiuVar.zzb;
            int iZza = zzajeVar.zza(j2);
            if (iZza == -1) {
                iZza = zzajeVar.zzb(j2);
            }
            zzaiuVar.zze = iZza;
            zzadu zzaduVar = zzaiuVar.zzd;
            if (zzaduVar != null) {
                zzaduVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        long j2;
        long j3;
        int iZzb;
        zzaiu[] zzaiuVarArr = this.zzw;
        if (zzaiuVarArr.length == 0) {
            zzadn zzadnVar = zzadn.zza;
            return new zzadk(zzadnVar, zzadnVar);
        }
        int i = this.zzy;
        long jZzl = -1;
        if (i != -1) {
            zzaje zzajeVar = zzaiuVarArr[i].zzb;
            int iZzk = zzk(zzajeVar, j);
            if (iZzk == -1) {
                zzadn zzadnVar2 = zzadn.zza;
                return new zzadk(zzadnVar2, zzadnVar2);
            }
            long j4 = zzajeVar.zzf[iZzk];
            j2 = zzajeVar.zzc[iZzk];
            if (j4 >= j || iZzk >= zzajeVar.zzb - 1 || (iZzb = zzajeVar.zzb(j)) == -1 || iZzb == iZzk) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzajeVar.zzf[iZzb];
                jZzl = zzajeVar.zzc[iZzb];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaiu[] zzaiuVarArr2 = this.zzw;
            if (i2 >= zzaiuVarArr2.length) {
                break;
            }
            if (i2 != this.zzy) {
                zzaje zzajeVar2 = zzaiuVarArr2[i2].zzb;
                long jZzl2 = zzl(zzajeVar2, j, j2);
                if (j3 != C.TIME_UNSET) {
                    jZzl = zzl(zzajeVar2, j3, jZzl);
                }
                j2 = jZzl2;
            }
            i2++;
        }
        zzadn zzadnVar3 = new zzadn(j, j2);
        return j3 == C.TIME_UNSET ? new zzadk(zzadnVar3, zzadnVar3) : new zzadk(zzadnVar3, new zzadn(j3, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        zzadq zzadqVarZzb = zzaja.zzb(zzacoVar, (this.zzb & 2) != 0);
        this.zzj = zzadqVarZzb != null ? zzfxn.zzo(zzadqVarZzb) : zzfxn.zzn();
        return zzadqVarZzb == null;
    }

    public zzaiv(zzakd zzakdVar, int i) {
        this.zza = zzakdVar;
        this.zzb = i;
        this.zzj = zzfxn.zzn();
        this.zzk = (i & 4) != 0 ? 3 : 0;
        this.zzh = new zzaiz();
        this.zzi = new ArrayList();
        this.zzf = new zzdy(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzdy(zzfk.zza);
        this.zzd = new zzdy(5);
        this.zze = new zzdy();
        this.zzp = -1;
        this.zzv = zzacq.zza;
        this.zzw = new zzaiu[0];
        this.zzt = true;
    }
}
