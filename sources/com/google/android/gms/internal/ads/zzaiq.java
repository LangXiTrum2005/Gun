package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaiq implements zzacn {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzab zzb;
    private long zzA;

    @Nullable
    private zzaip zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private zzacq zzH;
    private zzadt[] zzI;
    private zzadt[] zzJ;
    private boolean zzK;
    private final zzakd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzdy zzg;
    private final zzdy zzh;
    private final zzdy zzi;
    private final byte[] zzj;
    private final zzdy zzk;
    private final zzafl zzl;
    private final zzdy zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfo zzp;
    private zzfxn zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;

    @Nullable
    private zzdy zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zzaa(MimeTypes.APPLICATION_EMSG);
        zzb = zzzVar.zzag();
    }

    @Deprecated
    public zzaiq() {
        this(zzakd.zza, 32, null, null, zzfxn.zzn(), null);
    }

    private static int zzg(int i) throws zzbc {
        if (i >= 0) {
            return i;
        }
        throw zzbc.zza("Unexpected negative value: " + i, null);
    }

    @Nullable
    private static zzu zzh(List list) {
        int i;
        ArrayList arrayList;
        UUID[] uuidArr;
        zzaix zzaixVar;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < size) {
            zzeo zzeoVar = (zzeo) list.get(i2);
            if (zzeoVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrZzN = zzeoVar.zza.zzN();
                zzdy zzdyVar = new zzdy(bArrZzN);
                if (zzdyVar.zze() < 32) {
                    i = i2;
                    arrayList = arrayList2;
                    zzaixVar = null;
                } else {
                    zzdyVar.zzL(0);
                    int iZzb = zzdyVar.zzb();
                    int iZzg = zzdyVar.zzg();
                    if (iZzg != iZzb) {
                        zzdo.zzf("PsshAtomUtil", "Advertised atom size (" + iZzg + ") does not match buffer size: " + iZzb);
                    } else {
                        int iZzg2 = zzdyVar.zzg();
                        if (iZzg2 != 1886614376) {
                            AbstractC3888ke0.r("Atom type is not pssh: ", iZzg2, "PsshAtomUtil");
                        } else {
                            int iZza = zzaik.zza(zzdyVar.zzg());
                            if (iZza > 1) {
                                AbstractC3888ke0.r("Unsupported pssh version: ", iZza, "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(zzdyVar.zzt(), zzdyVar.zzt());
                                if (iZza == 1) {
                                    int iZzp = zzdyVar.zzp();
                                    uuidArr = new UUID[iZzp];
                                    int i3 = 0;
                                    while (i3 < iZzp) {
                                        uuidArr[i3] = new UUID(zzdyVar.zzt(), zzdyVar.zzt());
                                        i3++;
                                        i2 = i2;
                                        arrayList2 = arrayList2;
                                    }
                                    i = i2;
                                    arrayList = arrayList2;
                                } else {
                                    i = i2;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int iZzp2 = zzdyVar.zzp();
                                int iZzb2 = zzdyVar.zzb();
                                if (iZzp2 != iZzb2) {
                                    zzdo.zzf("PsshAtomUtil", "Atom data size (" + iZzp2 + ") does not match the bytes left: " + iZzb2);
                                    zzaixVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzp2];
                                    zzdyVar.zzH(bArr, 0, iZzp2);
                                    zzaixVar = new zzaix(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i = i2;
                    arrayList = arrayList2;
                    zzaixVar = null;
                }
                UUID uuid2 = zzaixVar == null ? null : zzaixVar.zza;
                if (uuid2 == null) {
                    zzdo.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    arrayList2.add(new zzt(uuid2, null, MimeTypes.VIDEO_MP4, bArrZzN));
                }
                i2 = i + 1;
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzu(arrayList2);
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(zzdy zzdyVar, int i, zzajd zzajdVar) throws zzbc {
        zzdyVar.zzL(i + 8);
        int iZzg = zzdyVar.zzg();
        int i2 = zzaik.zza;
        if ((iZzg & 1) != 0) {
            throw zzbc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzg & 2) != 0;
        int iZzp = zzdyVar.zzp();
        if (iZzp == 0) {
            Arrays.fill(zzajdVar.zzl, 0, zzajdVar.zze, false);
            return;
        }
        int i3 = zzajdVar.zze;
        if (iZzp != i3) {
            throw zzbc.zza("Senc sample count " + iZzp + " is different from fragment sample count" + i3, null);
        }
        Arrays.fill(zzajdVar.zzl, 0, iZzp, z);
        zzajdVar.zza(zzdyVar.zzb());
        zzdy zzdyVar2 = zzajdVar.zzn;
        zzdyVar.zzH(zzdyVar2.zzN(), 0, zzdyVar2.zze());
        zzajdVar.zzn.zzL(0);
        zzajdVar.zzo = false;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0406  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dc  */
    private final void zzl(long j) throws zzbc {
        zzaiq zzaiqVar;
        SparseArray sparseArray;
        zzen zzenVar;
        int i;
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        byte[] bArr4;
        int i6;
        int i7;
        boolean z2;
        int iZzg;
        boolean z3;
        final zzaiq zzaiqVar2 = this;
        while (!zzaiqVar2.zzn.isEmpty() && ((zzen) zzaiqVar2.zzn.peek()).zza == j) {
            zzen zzenVar2 = (zzen) zzaiqVar2.zzn.pop();
            int i8 = zzenVar2.zzd;
            int i9 = 12;
            int i10 = 8;
            if (i8 == 1836019574) {
                zzu zzuVarZzh = zzh(zzenVar2.zzb);
                zzen zzenVarZza = zzenVar2.zza(1836475768);
                zzenVarZza.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zzenVarZza.zzb.size();
                long jZzu = C.TIME_UNSET;
                int i11 = 0;
                while (i11 < size) {
                    zzeo zzeoVar = (zzeo) zzenVarZza.zzb.get(i11);
                    int i12 = zzeoVar.zzd;
                    if (i12 == 1953654136) {
                        zzdy zzdyVar = zzeoVar.zza;
                        zzdyVar.zzL(i9);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzdyVar.zzg()), new zzail(zzdyVar.zzg() - 1, zzdyVar.zzg(), zzdyVar.zzg(), zzdyVar.zzg()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzail) pairCreate.second);
                    } else if (i12 == 1835362404) {
                        zzdy zzdyVar2 = zzeoVar.zza;
                        zzdyVar2.zzL(8);
                        jZzu = zzaik.zza(zzdyVar2.zzg()) == 0 ? zzdyVar2.zzu() : zzdyVar2.zzw();
                    }
                    i11++;
                    i9 = 12;
                }
                List listZzf = zzaik.zzf(zzenVar2, new zzadb(), jZzu, zzuVarZzh, (zzaiqVar2.zzd & 16) != 0, false, new zzfuc(zzaiqVar2) { // from class: com.google.android.gms.internal.ads.zzaim
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final Object apply(Object obj) {
                        return (zzajb) obj;
                    }
                });
                int size2 = listZzf.size();
                if (zzaiqVar2.zzf.size() == 0) {
                    for (int i13 = 0; i13 < size2; i13++) {
                        zzaje zzajeVar = (zzaje) listZzf.get(i13);
                        zzajb zzajbVar = zzajeVar.zza;
                        zzadt zzadtVarZzw = zzaiqVar2.zzH.zzw(i13, zzajbVar.zzb);
                        zzadtVarZzw.zzl(zzajbVar.zze);
                        zzaiqVar2.zzf.put(zzajbVar.zza, new zzaip(zzadtVarZzw, zzajeVar, zzm(sparseArray2, zzajbVar.zza)));
                        zzaiqVar2.zzz = Math.max(zzaiqVar2.zzz, zzajbVar.zze);
                    }
                    zzaiqVar2.zzH.zzD();
                } else {
                    zzcw.zzf(zzaiqVar2.zzf.size() == size2);
                    for (int i14 = 0; i14 < size2; i14++) {
                        zzaje zzajeVar2 = (zzaje) listZzf.get(i14);
                        zzajb zzajbVar2 = zzajeVar2.zza;
                        ((zzaip) zzaiqVar2.zzf.get(zzajbVar2.zza)).zzh(zzajeVar2, zzm(sparseArray2, zzajbVar2.zza));
                    }
                }
            } else {
                if (i8 == 1836019558) {
                    SparseArray sparseArray3 = zzaiqVar2.zzf;
                    int i15 = zzaiqVar2.zzd;
                    byte[] bArr5 = zzaiqVar2.zzj;
                    int size3 = zzenVar2.zzc.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        zzen zzenVar3 = (zzen) zzenVar2.zzc.get(i16);
                        if (zzenVar3.zzd == 1953653094) {
                            zzeo zzeoVarZzb = zzenVar3.zzb(1952868452);
                            zzeoVarZzb.getClass();
                            zzdy zzdyVar3 = zzeoVarZzb.zza;
                            zzdyVar3.zzL(i10);
                            int iZzg2 = zzdyVar3.zzg();
                            int i17 = zzaik.zza;
                            zzaip zzaipVar = (zzaip) sparseArray3.get(zzdyVar3.zzg());
                            if (zzaipVar == null) {
                                zzaipVar = null;
                            } else {
                                if ((iZzg2 & 1) != 0) {
                                    long jZzw = zzdyVar3.zzw();
                                    zzajd zzajdVar = zzaipVar.zzb;
                                    zzajdVar.zzb = jZzw;
                                    zzajdVar.zzc = jZzw;
                                }
                                zzail zzailVar = zzaipVar.zze;
                                zzaipVar.zzb.zza = new zzail((iZzg2 & 2) != 0 ? zzdyVar3.zzg() - 1 : zzailVar.zza, (iZzg2 & 8) != 0 ? zzdyVar3.zzg() : zzailVar.zzb, (iZzg2 & 16) != 0 ? zzdyVar3.zzg() : zzailVar.zzc, (iZzg2 & 32) != 0 ? zzdyVar3.zzg() : zzailVar.zzd);
                            }
                            if (zzaipVar == null) {
                                sparseArray = sparseArray3;
                                zzenVar = zzenVar2;
                                i = i15;
                                bArr = bArr5;
                                i2 = size3;
                                i3 = i16;
                            } else {
                                zzajd zzajdVar2 = zzaipVar.zzb;
                                long j2 = zzajdVar2.zzp;
                                boolean z4 = zzajdVar2.zzq;
                                zzaipVar.zzi();
                                zzaipVar.zzl = true;
                                zzeo zzeoVarZzb2 = zzenVar3.zzb(1952867444);
                                if (zzeoVarZzb2 == null || (i15 & 2) != 0) {
                                    zzajdVar2.zzp = j2;
                                    zzajdVar2.zzq = z4;
                                } else {
                                    zzdy zzdyVar4 = zzeoVarZzb2.zza;
                                    zzdyVar4.zzL(i10);
                                    zzajdVar2.zzp = zzaik.zza(zzdyVar4.zzg()) == 1 ? zzdyVar4.zzw() : zzdyVar4.zzu();
                                    zzajdVar2.zzq = true;
                                }
                                List list = zzenVar3.zzb;
                                int size4 = list.size();
                                int i18 = 0;
                                int i19 = 0;
                                int i20 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i18 >= size4) {
                                        break;
                                    }
                                    SparseArray sparseArray4 = sparseArray3;
                                    zzeo zzeoVar2 = (zzeo) list.get(i18);
                                    int i21 = size3;
                                    if (zzeoVar2.zzd == 1953658222) {
                                        zzdy zzdyVar5 = zzeoVar2.zza;
                                        zzdyVar5.zzL(12);
                                        int iZzp = zzdyVar5.zzp();
                                        if (iZzp > 0) {
                                            i20 += iZzp;
                                            i19++;
                                        }
                                    }
                                    i18++;
                                    size3 = i21;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i2 = size3;
                                zzaipVar.zzh = 0;
                                zzaipVar.zzg = 0;
                                zzaipVar.zzf = 0;
                                zzajd zzajdVar3 = zzaipVar.zzb;
                                zzajdVar3.zzd = i19;
                                zzajdVar3.zze = i20;
                                if (zzajdVar3.zzg.length < i19) {
                                    zzajdVar3.zzf = new long[i19];
                                    zzajdVar3.zzg = new int[i19];
                                }
                                if (zzajdVar3.zzh.length < i20) {
                                    int i22 = (i20 * EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                    zzajdVar3.zzh = new int[i22];
                                    zzajdVar3.zzi = new long[i22];
                                    zzajdVar3.zzj = new boolean[i22];
                                    zzajdVar3.zzl = new boolean[i22];
                                }
                                int i23 = 0;
                                int i24 = 0;
                                int i25 = 0;
                                while (true) {
                                    long j3 = 0;
                                    if (i23 >= size4) {
                                        break;
                                    }
                                    zzeo zzeoVar3 = (zzeo) list.get(i23);
                                    if (zzeoVar3.zzd == i4) {
                                        int i26 = i24 + 1;
                                        zzdy zzdyVar6 = zzeoVar3.zza;
                                        zzdyVar6.zzL(8);
                                        int iZzg3 = zzdyVar6.zzg();
                                        zzajb zzajbVar3 = zzaipVar.zzd.zza;
                                        zzajd zzajdVar4 = zzaipVar.zzb;
                                        zzail zzailVar2 = zzajdVar4.zza;
                                        int i27 = zzei.zza;
                                        zzajdVar4.zzg[i24] = zzdyVar6.zzp();
                                        long[] jArr = zzajdVar4.zzf;
                                        long j4 = zzajdVar4.zzb;
                                        jArr[i24] = j4;
                                        if ((iZzg3 & 1) != 0) {
                                            jArr[i24] = j4 + ((long) zzdyVar6.zzg());
                                        }
                                        boolean z5 = (iZzg3 & 4) != 0;
                                        int iZzg4 = zzailVar2.zzd;
                                        if (z5) {
                                            iZzg4 = zzdyVar6.zzg();
                                        }
                                        int i28 = iZzg3 & 256;
                                        int i29 = iZzg3 & 512;
                                        int i30 = iZzg3 & 1024;
                                        int i31 = iZzg3 & 2048;
                                        long[] jArr2 = zzajbVar3.zzi;
                                        if (jArr2 != null) {
                                            i6 = iZzg4;
                                            bArr4 = bArr5;
                                            if (jArr2.length != 1 || zzajbVar3.zzj == null) {
                                                z2 = z5;
                                                i7 = i30;
                                            } else {
                                                long j5 = jArr2[0];
                                                if (j5 == 0) {
                                                    z2 = z5;
                                                    i7 = i30;
                                                } else {
                                                    z2 = z5;
                                                    long j6 = zzajbVar3.zzd;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long jZzu2 = zzei.zzu(j5, 1000000L, j6, roundingMode);
                                                    i7 = i30;
                                                    if (jZzu2 + zzei.zzu(zzajbVar3.zzj[0], 1000000L, zzajbVar3.zzc, roundingMode) >= zzajbVar3.zze) {
                                                    }
                                                }
                                                j3 = zzajbVar3.zzj[0];
                                            }
                                        } else {
                                            i6 = iZzg4;
                                            bArr4 = bArr5;
                                            i7 = i30;
                                            z2 = z5;
                                        }
                                        int[] iArr = zzajdVar4.zzh;
                                        long[] jArr3 = zzajdVar4.zzi;
                                        boolean[] zArr = zzajdVar4.zzj;
                                        boolean z6 = zzajbVar3.zzb == 2 && (i15 & 1) != 0;
                                        i25 += zzajdVar4.zzg[i24];
                                        boolean z7 = z6;
                                        long j7 = zzajbVar3.zzc;
                                        long j8 = zzajdVar4.zzp;
                                        int i32 = i25;
                                        while (i32 < i25) {
                                            int iZzg5 = i28 != 0 ? zzdyVar6.zzg() : zzailVar2.zzb;
                                            zzg(iZzg5);
                                            int iZzg6 = i29 != 0 ? zzdyVar6.zzg() : zzailVar2.zzc;
                                            zzg(iZzg6);
                                            if (i7 != 0) {
                                                iZzg = zzdyVar6.zzg();
                                            } else if (i32 != 0) {
                                                iZzg = zzailVar2.zzd;
                                            } else if (z2) {
                                                iZzg = i6;
                                                i32 = 0;
                                            } else {
                                                i32 = 0;
                                                iZzg = zzailVar2.zzd;
                                            }
                                            long jZzu3 = zzei.zzu((((long) (i31 != 0 ? zzdyVar6.zzg() : 0)) + j8) - j3, 1000000L, j7, RoundingMode.DOWN);
                                            jArr3[i32] = jZzu3;
                                            if (!zzajdVar4.zzq) {
                                                jArr3[i32] = jZzu3 + zzaipVar.zzd.zzh;
                                            }
                                            iArr[i32] = iZzg6;
                                            if (((iZzg >> 16) & 1) != 0) {
                                                z3 = false;
                                            } else if (!z7) {
                                                z3 = true;
                                            } else if (i32 == 0) {
                                                z3 = true;
                                                i32 = 0;
                                            } else {
                                                z3 = false;
                                            }
                                            zArr[i32] = z3;
                                            j8 += (long) iZzg5;
                                            i32++;
                                            j7 = j7;
                                            i28 = i28;
                                            i29 = i29;
                                            z2 = z2;
                                            zzailVar2 = zzailVar2;
                                            i25 = i25;
                                        }
                                        zzajdVar4.zzp = j8;
                                        i24 = i26;
                                    } else {
                                        bArr4 = bArr5;
                                        i16 = i16;
                                        zzenVar3 = zzenVar3;
                                    }
                                    i23++;
                                    list = list;
                                    size4 = size4;
                                    zzenVar2 = zzenVar2;
                                    i16 = i16;
                                    zzenVar3 = zzenVar3;
                                    bArr5 = bArr4;
                                    zzajdVar2 = zzajdVar2;
                                    i15 = i15;
                                    i4 = 1953658222;
                                }
                                zzenVar = zzenVar2;
                                i = i15;
                                zzajd zzajdVar5 = zzajdVar2;
                                byte[] bArr6 = bArr5;
                                i3 = i16;
                                zzen zzenVar4 = zzenVar3;
                                zzajb zzajbVar4 = zzaipVar.zzd.zza;
                                zzail zzailVar3 = zzajdVar5.zza;
                                zzailVar3.getClass();
                                zzajc zzajcVarZzb = zzajbVar4.zzb(zzailVar3.zza);
                                zzeo zzeoVarZzb3 = zzenVar4.zzb(1935763834);
                                if (zzeoVarZzb3 != null) {
                                    zzajcVarZzb.getClass();
                                    int i33 = zzajcVarZzb.zzd;
                                    zzdy zzdyVar7 = zzeoVarZzb3.zza;
                                    zzdyVar7.zzL(8);
                                    if ((zzdyVar7.zzg() & 1) == 1) {
                                        zzdyVar7.zzM(8);
                                    }
                                    int iZzm = zzdyVar7.zzm();
                                    int iZzp2 = zzdyVar7.zzp();
                                    int i34 = zzajdVar5.zze;
                                    if (iZzp2 > i34) {
                                        throw zzbc.zza("Saiz sample count " + iZzp2 + " is greater than fragment sample count" + i34, null);
                                    }
                                    if (iZzm == 0) {
                                        boolean[] zArr2 = zzajdVar5.zzl;
                                        i5 = 0;
                                        for (int i35 = 0; i35 < iZzp2; i35++) {
                                            int iZzm2 = zzdyVar7.zzm();
                                            i5 += iZzm2;
                                            zArr2[i35] = iZzm2 > i33;
                                        }
                                        z = false;
                                    } else {
                                        boolean z8 = iZzm > i33;
                                        i5 = iZzm * iZzp2;
                                        z = false;
                                        Arrays.fill(zzajdVar5.zzl, 0, iZzp2, z8);
                                    }
                                    Arrays.fill(zzajdVar5.zzl, iZzp2, zzajdVar5.zze, z);
                                    if (i5 > 0) {
                                        zzajdVar5.zza(i5);
                                    }
                                }
                                zzeo zzeoVarZzb4 = zzenVar4.zzb(1935763823);
                                if (zzeoVarZzb4 != null) {
                                    zzdy zzdyVar8 = zzeoVarZzb4.zza;
                                    zzdyVar8.zzL(8);
                                    int iZzg7 = zzdyVar8.zzg();
                                    if ((iZzg7 & 1) == 1) {
                                        zzdyVar8.zzM(8);
                                    }
                                    int iZzp3 = zzdyVar8.zzp();
                                    if (iZzp3 != 1) {
                                        throw zzbc.zza("Unexpected saio entry count: " + iZzp3, null);
                                    }
                                    zzajdVar5.zzc += zzaik.zza(iZzg7) == 0 ? zzdyVar8.zzu() : zzdyVar8.zzw();
                                }
                                zzeo zzeoVarZzb5 = zzenVar4.zzb(1936027235);
                                if (zzeoVarZzb5 != null) {
                                    zzk(zzeoVarZzb5.zza, 0, zzajdVar5);
                                }
                                String str = zzajcVarZzb != null ? zzajcVarZzb.zzb : null;
                                zzdy zzdyVar9 = null;
                                zzdy zzdyVar10 = null;
                                for (int i36 = 0; i36 < zzenVar4.zzb.size(); i36++) {
                                    zzeo zzeoVar4 = (zzeo) zzenVar4.zzb.get(i36);
                                    zzdy zzdyVar11 = zzeoVar4.zza;
                                    int i37 = zzeoVar4.zzd;
                                    if (i37 == 1935828848) {
                                        zzdyVar11.zzL(12);
                                        if (zzdyVar11.zzg() == 1936025959) {
                                            zzdyVar9 = zzdyVar11;
                                        }
                                    } else if (i37 == 1936158820) {
                                        zzdyVar11.zzL(12);
                                        if (zzdyVar11.zzg() == 1936025959) {
                                            zzdyVar10 = zzdyVar11;
                                        }
                                    }
                                }
                                if (zzdyVar9 != null && zzdyVar10 != null) {
                                    zzdyVar9.zzL(8);
                                    int iZza = zzaik.zza(zzdyVar9.zzg());
                                    zzdyVar9.zzM(4);
                                    if (iZza == 1) {
                                        zzdyVar9.zzM(4);
                                    }
                                    if (zzdyVar9.zzg() != 1) {
                                        throw zzbc.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzdyVar10.zzL(8);
                                    int iZza2 = zzaik.zza(zzdyVar10.zzg());
                                    zzdyVar10.zzM(4);
                                    if (iZza2 == 1) {
                                        if (zzdyVar10.zzu() == 0) {
                                            throw zzbc.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZza2 >= 2) {
                                        zzdyVar10.zzM(4);
                                    }
                                    if (zzdyVar10.zzu() != 1) {
                                        throw zzbc.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzdyVar10.zzM(1);
                                    int iZzm3 = zzdyVar10.zzm();
                                    int i38 = (iZzm3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    int i39 = iZzm3 & 15;
                                    if (zzdyVar10.zzm() == 1) {
                                        int iZzm4 = zzdyVar10.zzm();
                                        byte[] bArr7 = new byte[16];
                                        zzdyVar10.zzH(bArr7, 0, 16);
                                        if (iZzm4 == 0) {
                                            int iZzm5 = zzdyVar10.zzm();
                                            byte[] bArr8 = new byte[iZzm5];
                                            zzdyVar10.zzH(bArr8, 0, iZzm5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzajdVar5.zzk = true;
                                        zzajdVar5.zzm = new zzajc(true, str, iZzm4, bArr7, i38, i39, bArr3);
                                    }
                                }
                                int size5 = zzenVar4.zzb.size();
                                int i40 = 0;
                                while (i40 < size5) {
                                    zzeo zzeoVar5 = (zzeo) zzenVar4.zzb.get(i40);
                                    if (zzeoVar5.zzd == 1970628964) {
                                        zzdy zzdyVar12 = zzeoVar5.zza;
                                        zzdyVar12.zzL(8);
                                        bArr2 = bArr6;
                                        zzdyVar12.zzH(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzk(zzdyVar12, 16, zzajdVar5);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i40++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            zzenVar = zzenVar2;
                            i = i15;
                            bArr = bArr5;
                            i2 = size3;
                            i3 = i16;
                        }
                        i16 = i3 + 1;
                        bArr5 = bArr;
                        size3 = i2;
                        sparseArray3 = sparseArray;
                        zzenVar2 = zzenVar;
                        i15 = i;
                        i10 = 8;
                    }
                    zzu zzuVarZzh2 = zzh(zzenVar2.zzb);
                    zzaiqVar = this;
                    if (zzuVarZzh2 != null) {
                        int size6 = zzaiqVar.zzf.size();
                        for (int i41 = 0; i41 < size6; i41++) {
                            zzaip zzaipVar2 = (zzaip) zzaiqVar.zzf.valueAt(i41);
                            zzajb zzajbVar5 = zzaipVar2.zzd.zza;
                            zzail zzailVar4 = zzaipVar2.zzb.zza;
                            int i42 = zzei.zza;
                            zzajc zzajcVarZzb2 = zzajbVar5.zzb(zzailVar4.zza);
                            zzu zzuVarZzb = zzuVarZzh2.zzb(zzajcVarZzb2 != null ? zzajcVarZzb2.zzb : null);
                            zzz zzzVarZzb = zzaipVar2.zzd.zza.zzg.zzb();
                            zzzVarZzb.zzF(zzuVarZzb);
                            zzaipVar2.zza.zzm(zzzVarZzb.zzag());
                        }
                    }
                    if (zzaiqVar.zzy != C.TIME_UNSET) {
                        int size7 = zzaiqVar.zzf.size();
                        for (int i43 = 0; i43 < size7; i43++) {
                            zzaip zzaipVar3 = (zzaip) zzaiqVar.zzf.valueAt(i43);
                            long j9 = zzaiqVar.zzy;
                            int i44 = zzaipVar3.zzf;
                            while (true) {
                                zzajd zzajdVar6 = zzaipVar3.zzb;
                                if (i44 >= zzajdVar6.zze || zzajdVar6.zzi[i44] > j9) {
                                    break;
                                }
                                if (zzajdVar6.zzj[i44]) {
                                    zzaipVar3.zzi = i44;
                                }
                                i44++;
                            }
                        }
                        zzaiqVar.zzy = C.TIME_UNSET;
                    }
                } else {
                    zzaiqVar = zzaiqVar2;
                    if (!zzaiqVar.zzn.isEmpty()) {
                        ((zzen) zzaiqVar.zzn.peek()).zzc(zzenVar2);
                    }
                }
                zzaiqVar2 = zzaiqVar;
            }
        }
        zzj();
    }

    private static final zzail zzm(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzail) sparseArray.valueAt(0);
        }
        zzail zzailVar = (zzail) sparseArray.get(i);
        zzailVar.getClass();
        return zzailVar;
    }

    public final /* synthetic */ void zza(long j, zzdy zzdyVar) {
        zzabz.zza(j, zzdyVar, this.zzJ);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0251  */
    /* JADX WARN: Code duplicated, block: B:107:0x0257  */
    /* JADX WARN: Code duplicated, block: B:111:0x0273  */
    /* JADX WARN: Code duplicated, block: B:112:0x0278  */
    /* JADX WARN: Code duplicated, block: B:116:0x028f  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:404:0x0269 A[EDGE_INSN: B:404:0x0269->B:109:0x0269 BREAK  A[LOOP:7: B:63:0x0137->B:65:0x013d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0137 A[LOOP:7: B:63:0x0137->B:65:0x013d, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:65:0x013d A[LOOP:7: B:63:0x0137->B:65:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0166  */
    /* JADX WARN: Code duplicated, block: B:73:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        int i;
        zzaip zzaipVar;
        zzajb zzajbVar;
        zzadt zzadtVar;
        long jZze;
        int i2;
        byte[] bArrZzN;
        int i3;
        int i4;
        int i5;
        int iZzf;
        int i6;
        int iZzg;
        boolean z;
        String str;
        zzajc zzajcVarZzf;
        zzads zzadsVar;
        zzaio zzaioVar;
        long j;
        int i7;
        int i8;
        int i9;
        int iZzc;
        long jZzu;
        long jZzu2;
        String str2;
        String str3;
        long jZzu3;
        long j2;
        long jZzw;
        long jZzw2;
        while (true) {
            int i10 = this.zzr;
            i = 0;
            if (i10 == 0) {
                if (this.zzu == 0) {
                    if (!zzacoVar.zzn(this.zzm.zzN(), 0, 8, true)) {
                        this.zzp.zzc();
                        return -1;
                    }
                    this.zzu = 8;
                    this.zzm.zzL(0);
                    this.zzt = this.zzm.zzu();
                    this.zzs = this.zzm.zzg();
                }
                long j3 = this.zzt;
                if (j3 == 1) {
                    zzacoVar.zzi(this.zzm.zzN(), 8, 8);
                    this.zzu += 8;
                    this.zzt = this.zzm.zzw();
                } else if (j3 == 0) {
                    long jZzd = zzacoVar.zzd();
                    if (jZzd == -1) {
                        jZzd = !this.zzn.isEmpty() ? ((zzen) this.zzn.peek()).zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzt = (jZzd - zzacoVar.zzf()) + ((long) this.zzu);
                    }
                }
                long j4 = this.zzt;
                long j5 = this.zzu;
                if (j4 < j5) {
                    throw zzbc.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf = zzacoVar.zzf() - j5;
                int i11 = this.zzs;
                if ((i11 == 1836019558 || i11 == 1835295092) && !this.zzK) {
                    this.zzH.zzO(new zzadl(this.zzz, jZzf));
                    this.zzK = true;
                }
                if (this.zzs == 1836019558) {
                    int size = this.zzf.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        zzajd zzajdVar = ((zzaip) this.zzf.valueAt(i12)).zzb;
                        zzajdVar.zzc = jZzf;
                        zzajdVar.zzb = jZzf;
                    }
                }
                int i13 = this.zzs;
                if (i13 == 1835295092) {
                    this.zzB = null;
                    this.zzw = jZzf + this.zzt;
                    this.zzr = 2;
                } else if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1836019558 || i13 == 1953653094 || i13 == 1836475768 || i13 == 1701082227) {
                    long jZzf2 = (zzacoVar.zzf() + this.zzt) - 8;
                    this.zzn.push(new zzen(i13, jZzf2));
                    if (this.zzt == this.zzu) {
                        zzl(jZzf2);
                    } else {
                        zzj();
                    }
                } else if (i13 == 1751411826 || i13 == 1835296868 || i13 == 1836476516 || i13 == 1936286840 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1668576371 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1937011571 || i13 == 1952867444 || i13 == 1952868452 || i13 == 1953196132 || i13 == 1953654136 || i13 == 1953658222 || i13 == 1886614376 || i13 == 1935763834 || i13 == 1935763823 || i13 == 1936027235 || i13 == 1970628964 || i13 == 1935828848 || i13 == 1936158820 || i13 == 1701606260 || i13 == 1835362404 || i13 == 1701671783) {
                    if (this.zzu != 8) {
                        throw zzbc.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzt > 2147483647L) {
                        throw zzbc.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzdy zzdyVar = new zzdy((int) this.zzt);
                    System.arraycopy(this.zzm.zzN(), 0, zzdyVar.zzN(), 0, 8);
                    this.zzv = zzdyVar;
                    this.zzr = 1;
                } else {
                    if (this.zzt > 2147483647L) {
                        throw zzbc.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzv = null;
                    this.zzr = 1;
                }
            } else if (i10 != 1) {
                long j6 = Long.MAX_VALUE;
                if (i10 != 2) {
                    zzaipVar = this.zzB;
                    if (zzaipVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zzf;
                    int size2 = sparseArray.size();
                    long j7 = Long.MAX_VALUE;
                    zzaip zzaipVar2 = null;
                    for (int i14 = 0; i14 < size2; i14++) {
                        zzaip zzaipVar3 = (zzaip) sparseArray.valueAt(i14);
                        if ((zzaipVar3.zzl || zzaipVar3.zzf != zzaipVar3.zzd.zzb) && (!zzaipVar3.zzl || zzaipVar3.zzh != zzaipVar3.zzb.zzd)) {
                            long jZzd2 = zzaipVar3.zzd();
                            if (jZzd2 < j7) {
                                zzaipVar2 = zzaipVar3;
                                j7 = jZzd2;
                            }
                        }
                    }
                    if (zzaipVar2 != null) {
                        int iZzd = (int) (zzaipVar2.zzd() - zzacoVar.zzf());
                        if (iZzd < 0) {
                            zzdo.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZzd = 0;
                        }
                        zzacoVar.zzk(iZzd);
                        this.zzB = zzaipVar2;
                        zzaipVar = zzaipVar2;
                        break;
                    }
                    int iZzf2 = (int) (this.zzw - zzacoVar.zzf());
                    if (iZzf2 < 0) {
                        throw zzbc.zza("Offset to end of mdat was negative.", null);
                    }
                    zzacoVar.zzk(iZzf2);
                    zzj();
                } else {
                    int size3 = this.zzf.size();
                    zzaip zzaipVar4 = null;
                    for (int i15 = 0; i15 < size3; i15++) {
                        zzajd zzajdVar2 = ((zzaip) this.zzf.valueAt(i15)).zzb;
                        if (zzajdVar2.zzo) {
                            long j8 = zzajdVar2.zzc;
                            if (j8 < j6) {
                                zzaipVar4 = (zzaip) this.zzf.valueAt(i15);
                                j6 = j8;
                            }
                        }
                    }
                    if (zzaipVar4 == null) {
                        this.zzr = 3;
                    } else {
                        int iZzf3 = (int) (j6 - zzacoVar.zzf());
                        if (iZzf3 < 0) {
                            throw zzbc.zza("Offset to encryption data was negative.", null);
                        }
                        zzacoVar.zzk(iZzf3);
                        zzajd zzajdVar3 = zzaipVar4.zzb;
                        zzdy zzdyVar2 = zzajdVar3.zzn;
                        zzacoVar.zzi(zzdyVar2.zzN(), 0, zzdyVar2.zze());
                        zzajdVar3.zzn.zzL(0);
                        zzajdVar3.zzo = false;
                    }
                }
            } else {
                int i16 = ((int) this.zzt) - this.zzu;
                zzdy zzdyVar3 = this.zzv;
                if (zzdyVar3 != null) {
                    zzacoVar.zzi(zzdyVar3.zzN(), 8, i16);
                    zzeo zzeoVar = new zzeo(this.zzs, zzdyVar3);
                    long jZzf3 = zzacoVar.zzf();
                    if (this.zzn.isEmpty()) {
                        int i17 = zzeoVar.zzd;
                        if (i17 == 1936286840) {
                            zzdy zzdyVar4 = zzeoVar.zza;
                            zzdyVar4.zzL(8);
                            int iZza = zzaik.zza(zzdyVar4.zzg());
                            zzdyVar4.zzM(4);
                            long jZzu4 = zzdyVar4.zzu();
                            if (iZza == 0) {
                                jZzw = zzdyVar4.zzu();
                                jZzw2 = zzdyVar4.zzu();
                            } else {
                                jZzw = zzdyVar4.zzw();
                                jZzw2 = zzdyVar4.zzw();
                            }
                            long j9 = jZzw2 + jZzf3;
                            long jZzu5 = zzei.zzu(jZzw, 1000000L, jZzu4, RoundingMode.DOWN);
                            zzdyVar4.zzM(2);
                            int iZzq = zzdyVar4.zzq();
                            int[] iArr = new int[iZzq];
                            long[] jArr = new long[iZzq];
                            long[] jArr2 = new long[iZzq];
                            long[] jArr3 = new long[iZzq];
                            long j10 = jZzu5;
                            int i18 = 0;
                            while (i18 < iZzq) {
                                int iZzg2 = zzdyVar4.zzg();
                                if ((iZzg2 & Integer.MIN_VALUE) != 0) {
                                    throw zzbc.zza("Unhandled indirect reference", null);
                                }
                                long jZzu6 = zzdyVar4.zzu();
                                iArr[i18] = iZzg2 & Integer.MAX_VALUE;
                                jArr[i18] = j9;
                                jArr3[i18] = j10;
                                long j11 = jZzw + jZzu6;
                                long[] jArr4 = jArr3;
                                int i19 = i18;
                                long[] jArr5 = jArr2;
                                int[] iArr2 = iArr;
                                long jZzu7 = zzei.zzu(j11, 1000000L, jZzu4, RoundingMode.DOWN);
                                jArr5[i19] = jZzu7 - jArr4[i19];
                                zzdyVar4.zzM(4);
                                j9 += (long) iArr2[i19];
                                jArr = jArr;
                                iArr = iArr2;
                                jArr2 = jArr5;
                                jZzw = j11;
                                jArr3 = jArr4;
                                i18 = i19 + 1;
                                iZzq = iZzq;
                                j10 = jZzu7;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jZzu5), new zzaca(iArr, jArr, jArr2, jArr3));
                            this.zzA = ((Long) pairCreate.first).longValue();
                            this.zzH.zzO((zzadm) pairCreate.second);
                            this.zzK = true;
                        } else if (i17 == 1701671783) {
                            zzdy zzdyVar5 = zzeoVar.zza;
                            if (this.zzI.length != 0) {
                                zzdyVar5.zzL(8);
                                int iZza2 = zzaik.zza(zzdyVar5.zzg());
                                if (iZza2 == 0) {
                                    String strZzy = zzdyVar5.zzy((char) 0);
                                    strZzy.getClass();
                                    String strZzy2 = zzdyVar5.zzy((char) 0);
                                    strZzy2.getClass();
                                    long jZzu8 = zzdyVar5.zzu();
                                    long jZzu9 = zzdyVar5.zzu();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    jZzu = zzei.zzu(jZzu9, 1000000L, jZzu8, roundingMode);
                                    long j12 = this.zzA;
                                    long j13 = j12 != C.TIME_UNSET ? j12 + jZzu : -9223372036854775807L;
                                    jZzu2 = zzei.zzu(zzdyVar5.zzu(), 1000L, jZzu8, roundingMode);
                                    str2 = strZzy;
                                    str3 = strZzy2;
                                    jZzu3 = zzdyVar5.zzu();
                                    j2 = j13;
                                } else if (iZza2 != 1) {
                                    AbstractC3888ke0.r("Skipping unsupported emsg version: ", iZza2, "FragmentedMp4Extractor");
                                } else {
                                    long jZzu10 = zzdyVar5.zzu();
                                    long jZzw3 = zzdyVar5.zzw();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    long jZzu11 = zzei.zzu(jZzw3, 1000000L, jZzu10, roundingMode2);
                                    long jZzu12 = zzei.zzu(zzdyVar5.zzu(), 1000L, jZzu10, roundingMode2);
                                    long jZzu13 = zzdyVar5.zzu();
                                    String strZzy3 = zzdyVar5.zzy((char) 0);
                                    strZzy3.getClass();
                                    String strZzy4 = zzdyVar5.zzy((char) 0);
                                    strZzy4.getClass();
                                    jZzu2 = jZzu12;
                                    jZzu3 = jZzu13;
                                    str2 = strZzy3;
                                    str3 = strZzy4;
                                    j2 = jZzu11;
                                    jZzu = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzdyVar5.zzb()];
                                zzdyVar5.zzH(bArr, 0, zzdyVar5.zzb());
                                zzdy zzdyVar6 = new zzdy(this.zzl.zza(new zzafk(str2, str3, jZzu2, jZzu3, bArr)));
                                int iZzb = zzdyVar6.zzb();
                                for (zzadt zzadtVar2 : this.zzI) {
                                    zzdyVar6.zzL(0);
                                    zzadtVar2.zzr(zzdyVar6, iZzb);
                                }
                                if (j2 == C.TIME_UNSET) {
                                    this.zzo.addLast(new zzaio(jZzu, true, iZzb));
                                    this.zzx += iZzb;
                                } else if (this.zzo.isEmpty()) {
                                    for (zzadt zzadtVar3 : this.zzI) {
                                        zzadtVar3.zzt(j2, 1, iZzb, 0, null);
                                    }
                                } else {
                                    this.zzo.addLast(new zzaio(j2, false, iZzb));
                                    this.zzx += iZzb;
                                }
                            }
                        }
                    } else {
                        ((zzen) this.zzn.peek()).zzd(zzeoVar);
                    }
                } else {
                    zzacoVar.zzk(i16);
                }
                zzl(zzacoVar.zzf());
            }
        }
        int i20 = 6;
        if (this.zzr == 3) {
            int iZzb2 = zzaipVar.zzb();
            this.zzC = iZzb2;
            this.zzF = true;
            if (zzaipVar.zzf < zzaipVar.zzi) {
                zzacoVar.zzk(iZzb2);
                zzajc zzajcVarZzf2 = zzaipVar.zzf();
                if (zzajcVarZzf2 != null) {
                    zzdy zzdyVar7 = zzaipVar.zzb.zzn;
                    int i21 = zzajcVarZzf2.zzd;
                    if (i21 != 0) {
                        zzdyVar7.zzM(i21);
                    }
                    if (zzaipVar.zzb.zzb(zzaipVar.zzf)) {
                        zzdyVar7.zzM(zzdyVar7.zzq() * 6);
                    }
                }
                if (!zzaipVar.zzk()) {
                    this.zzB = null;
                }
            } else {
                if (zzaipVar.zzd.zza.zzh == 1) {
                    this.zzC = iZzb2 - 8;
                    zzacoVar.zzk(8);
                }
                if ("audio/ac4".equals(zzaipVar.zzd.zza.zzg.zzo)) {
                    this.zzD = zzaipVar.zzc(this.zzC, 7);
                    zzabq.zzb(this.zzC, this.zzk);
                    zzaipVar.zza.zzr(this.zzk, 7);
                    iZzc = this.zzD + 7;
                    this.zzD = iZzc;
                } else {
                    iZzc = zzaipVar.zzc(this.zzC, 0);
                    this.zzD = iZzc;
                }
                this.zzC += iZzc;
                this.zzr = 4;
                this.zzE = 0;
                zzajbVar = zzaipVar.zzd.zza;
                zzadtVar = zzaipVar.zza;
                jZze = zzaipVar.zze();
                i2 = zzajbVar.zzk;
                if (i2 == 0) {
                    while (true) {
                        i8 = this.zzD;
                        i9 = this.zzC;
                        if (i8 < i9) {
                            break;
                        }
                        this.zzD += zzadtVar.zzf(zzacoVar, i9 - i8, false);
                    }
                } else {
                    bArrZzN = this.zzh.zzN();
                    bArrZzN[0] = 0;
                    bArrZzN[1] = 0;
                    bArrZzN[2] = 0;
                    i3 = i2 + 1;
                    i4 = 4 - i2;
                    while (this.zzD < this.zzC) {
                        i5 = this.zzE;
                        if (i5 == 0) {
                            zzacoVar.zzi(bArrZzN, i4, i3);
                            this.zzh.zzL(i);
                            iZzg = this.zzh.zzg();
                            if (iZzg > 0) {
                                throw zzbc.zza("Invalid NAL length", null);
                            }
                            this.zzE = iZzg - 1;
                            this.zzg.zzL(i);
                            zzadtVar.zzr(this.zzg, 4);
                            zzadtVar.zzr(this.zzh, 1);
                            if (this.zzJ.length > 0) {
                                zzab zzabVar = zzajbVar.zzg;
                                int i22 = bArrZzN[4];
                                byte[] bArr2 = zzfk.zza;
                                str = zzabVar.zzo;
                                if (("video/avc".equals(str) || (i22 & 31) != i20) && !("video/hevc".equals(str) && ((i22 & EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) >> 1) == 39)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            this.zzG = z;
                            this.zzD += 5;
                            this.zzC += i4;
                            if (this.zzF && Objects.equals(zzaipVar.zzd.zza.zzg.zzo, "video/avc") && zzfk.zzi(bArrZzN[4])) {
                                this.zzF = true;
                            }
                        } else {
                            if (this.zzG) {
                                this.zzi.zzI(i5);
                                zzacoVar.zzi(this.zzi.zzN(), 0, this.zzE);
                                zzadtVar.zzr(this.zzi, this.zzE);
                                iZzf = this.zzE;
                                zzdy zzdyVar8 = this.zzi;
                                int iZzb3 = zzfk.zzb(zzdyVar8.zzN(), zzdyVar8.zze());
                                this.zzi.zzL("video/hevc".equals(zzajbVar.zzg.zzo) ? 1 : 0);
                                this.zzi.zzK(iZzb3);
                                i6 = zzajbVar.zzg.zzq;
                                if (i6 != -1 && i6 != this.zzp.zza()) {
                                    this.zzp.zzd(zzajbVar.zzg.zzq);
                                }
                                this.zzp.zzb(jZze, this.zzi);
                                if ((zzaipVar.zza() & 5) != 0) {
                                    this.zzp.zzc();
                                }
                            } else {
                                iZzf = zzadtVar.zzf(zzacoVar, i5, false);
                            }
                            this.zzD += iZzf;
                            this.zzE -= iZzf;
                            i20 = 6;
                        }
                        i = 0;
                    }
                }
                int iZza3 = zzaipVar.zza();
                zzajcVarZzf = zzaipVar.zzf();
                if (zzajcVarZzf != null) {
                    zzadsVar = zzajcVarZzf.zzc;
                } else {
                    zzadsVar = null;
                }
                zzadtVar.zzt(jZze, iZza3, this.zzC, 0, zzadsVar);
                while (!this.zzo.isEmpty()) {
                    zzaioVar = (zzaio) this.zzo.removeFirst();
                    this.zzx -= zzaioVar.zzc;
                    j = zzaioVar.zza;
                    if (zzaioVar.zzb) {
                        j += jZze;
                    }
                    for (zzadt zzadtVar4 : this.zzI) {
                        zzadtVar4.zzt(j, 1, zzaioVar.zzc, this.zzx, null);
                    }
                }
                if (!zzaipVar.zzk()) {
                    this.zzB = null;
                }
            }
        } else {
            zzajbVar = zzaipVar.zzd.zza;
            zzadtVar = zzaipVar.zza;
            jZze = zzaipVar.zze();
            i2 = zzajbVar.zzk;
            if (i2 == 0) {
                while (true) {
                    i8 = this.zzD;
                    i9 = this.zzC;
                    if (i8 < i9) {
                        break;
                        break;
                    }
                    this.zzD += zzadtVar.zzf(zzacoVar, i9 - i8, false);
                }
            } else {
                bArrZzN = this.zzh.zzN();
                bArrZzN[0] = 0;
                bArrZzN[1] = 0;
                bArrZzN[2] = 0;
                i3 = i2 + 1;
                i4 = 4 - i2;
                while (this.zzD < this.zzC) {
                    i5 = this.zzE;
                    if (i5 == 0) {
                        zzacoVar.zzi(bArrZzN, i4, i3);
                        this.zzh.zzL(i);
                        iZzg = this.zzh.zzg();
                        if (iZzg > 0) {
                            throw zzbc.zza("Invalid NAL length", null);
                        }
                        this.zzE = iZzg - 1;
                        this.zzg.zzL(i);
                        zzadtVar.zzr(this.zzg, 4);
                        zzadtVar.zzr(this.zzh, 1);
                        if (this.zzJ.length > 0) {
                            zzab zzabVar2 = zzajbVar.zzg;
                            int i23 = bArrZzN[4];
                            byte[] bArr3 = zzfk.zza;
                            str = zzabVar2.zzo;
                            if ("video/avc".equals(str)) {
                                z = false;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        this.zzG = z;
                        this.zzD += 5;
                        this.zzC += i4;
                        if (this.zzF) {
                        }
                    } else {
                        if (this.zzG) {
                            this.zzi.zzI(i5);
                            zzacoVar.zzi(this.zzi.zzN(), 0, this.zzE);
                            zzadtVar.zzr(this.zzi, this.zzE);
                            iZzf = this.zzE;
                            zzdy zzdyVar9 = this.zzi;
                            int iZzb4 = zzfk.zzb(zzdyVar9.zzN(), zzdyVar9.zze());
                            this.zzi.zzL("video/hevc".equals(zzajbVar.zzg.zzo) ? 1 : 0);
                            this.zzi.zzK(iZzb4);
                            i6 = zzajbVar.zzg.zzq;
                            if (i6 != -1) {
                                this.zzp.zzd(zzajbVar.zzg.zzq);
                            }
                            this.zzp.zzb(jZze, this.zzi);
                            if ((zzaipVar.zza() & 5) != 0) {
                                this.zzp.zzc();
                            }
                        } else {
                            iZzf = zzadtVar.zzf(zzacoVar, i5, false);
                        }
                        this.zzD += iZzf;
                        this.zzE -= iZzf;
                        i20 = 6;
                    }
                    i = 0;
                }
            }
            int iZza4 = zzaipVar.zza();
            zzajcVarZzf = zzaipVar.zzf();
            if (zzajcVarZzf != null) {
                zzadsVar = zzajcVarZzf.zzc;
            } else {
                zzadsVar = null;
            }
            zzadtVar.zzt(jZze, iZza4, this.zzC, 0, zzadsVar);
            while (!this.zzo.isEmpty()) {
                zzaioVar = (zzaio) this.zzo.removeFirst();
                this.zzx -= zzaioVar.zzc;
                j = zzaioVar.zza;
                if (zzaioVar.zzb) {
                    j += jZze;
                }
                while (i7 < r15) {
                    zzadtVar4.zzt(j, 1, zzaioVar.zzc, this.zzx, null);
                }
            }
            if (!zzaipVar.zzk()) {
                this.zzB = null;
            }
        }
        this.zzr = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        int i;
        if ((this.zzd & 32) == 0) {
            zzacqVar = new zzakg(zzacqVar, this.zzc);
        }
        this.zzH = zzacqVar;
        zzj();
        zzadt[] zzadtVarArr = new zzadt[2];
        this.zzI = zzadtVarArr;
        int i2 = 100;
        int i3 = 0;
        if ((this.zzd & 4) != 0) {
            zzadtVarArr[0] = this.zzH.zzw(100, 5);
            i = 1;
            i2 = 101;
        } else {
            i = 0;
        }
        zzadt[] zzadtVarArr2 = (zzadt[]) zzei.zzN(this.zzI, i);
        this.zzI = zzadtVarArr2;
        for (zzadt zzadtVar : zzadtVarArr2) {
            zzadtVar.zzm(zzb);
        }
        this.zzJ = new zzadt[this.zze.size()];
        while (i3 < this.zzJ.length) {
            zzadt zzadtVarZzw = this.zzH.zzw(i2, 3);
            zzadtVarZzw.zzm((zzab) this.zze.get(i3));
            this.zzJ[i3] = zzadtVarZzw;
            i3++;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        int size = this.zzf.size();
        for (int i = 0; i < size; i++) {
            ((zzaip) this.zzf.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = j2;
        this.zzn.clear();
        zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        zzadq zzadqVarZza = zzaja.zza(zzacoVar);
        this.zzq = zzadqVarZza != null ? zzfxn.zzo(zzadqVarZza) : zzfxn.zzn();
        return zzadqVarZza == null;
    }

    public zzaiq(zzakd zzakdVar, int i, @Nullable zzef zzefVar, @Nullable zzajb zzajbVar, List list, @Nullable zzadt zzadtVar) {
        this.zzc = zzakdVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafl();
        this.zzm = new zzdy(16);
        this.zzg = new zzdy(zzfk.zza);
        this.zzh = new zzdy(5);
        this.zzi = new zzdy();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzdy(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzq = zzfxn.zzn();
        this.zzz = C.TIME_UNSET;
        this.zzy = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzH = zzacq.zza;
        this.zzI = new zzadt[0];
        this.zzJ = new zzadt[0];
        this.zzp = new zzfo(new zzfm() { // from class: com.google.android.gms.internal.ads.zzain
            @Override // com.google.android.gms.internal.ads.zzfm
            public final void zza(long j, zzdy zzdyVar) {
                this.zza.zza(j, zzdyVar);
            }
        });
    }
}
