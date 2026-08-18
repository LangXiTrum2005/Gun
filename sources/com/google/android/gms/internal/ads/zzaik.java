package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaik {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        int i = zzei.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    @Nullable
    public static zzay zzb(zzen zzenVar) {
        zzem zzemVar;
        zzeo zzeoVarZzb = zzenVar.zzb(1751411826);
        zzeo zzeoVarZzb2 = zzenVar.zzb(1801812339);
        zzeo zzeoVarZzb3 = zzenVar.zzb(1768715124);
        if (zzeoVarZzb != null && zzeoVarZzb2 != null && zzeoVarZzb3 != null && zzi(zzeoVarZzb.zza) == 1835299937) {
            zzdy zzdyVar = zzeoVarZzb2.zza;
            zzdyVar.zzL(12);
            int iZzg = zzdyVar.zzg();
            String[] strArr = new String[iZzg];
            for (int i = 0; i < iZzg; i++) {
                int iZzg2 = zzdyVar.zzg();
                zzdyVar.zzM(4);
                strArr[i] = zzdyVar.zzB(iZzg2 - 8, StandardCharsets.UTF_8);
            }
            zzdy zzdyVar2 = zzeoVarZzb3.zza;
            zzdyVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzdyVar2.zzb() > 8) {
                int iZzg3 = zzdyVar2.zzg() + zzdyVar2.zzd();
                int iZzg4 = zzdyVar2.zzg() - 1;
                if (iZzg4 < 0 || iZzg4 >= iZzg) {
                    AbstractC3888ke0.r("Skipped metadata with unknown key index: ", iZzg4, "BoxParsers");
                } else {
                    String str = strArr[iZzg4];
                    while (true) {
                        int iZzd = zzdyVar2.zzd();
                        if (iZzd >= iZzg3) {
                            zzemVar = null;
                            break;
                        }
                        int iZzg5 = zzdyVar2.zzg();
                        if (zzdyVar2.zzg() == 1684108385) {
                            int iZzg6 = zzdyVar2.zzg();
                            int iZzg7 = zzdyVar2.zzg();
                            int i2 = iZzg5 - 16;
                            byte[] bArr = new byte[i2];
                            zzdyVar2.zzH(bArr, 0, i2);
                            zzemVar = new zzem(str, bArr, iZzg7, iZzg6);
                            break;
                        }
                        zzdyVar2.zzL(iZzd + iZzg5);
                    }
                    if (zzemVar != null) {
                        arrayList.add(zzemVar);
                    }
                }
                zzdyVar2.zzL(iZzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzay(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    public static zzay zzc(zzeo zzeoVar) {
        int iZzn;
        zzdy zzdyVar = zzeoVar.zza;
        zzdyVar.zzL(8);
        zzay zzayVar = new zzay(C.TIME_UNSET, new zzax[0]);
        while (zzdyVar.zzb() >= 8) {
            int iZzd = zzdyVar.zzd();
            int iZzg = zzdyVar.zzg() + iZzd;
            int iZzg2 = zzdyVar.zzg();
            zzay zzayVar2 = null;
            if (iZzg2 == 1835365473) {
                zzdyVar.zzL(iZzd);
                zzdyVar.zzM(8);
                zzg(zzdyVar);
                while (zzdyVar.zzd() < iZzg) {
                    int iZzd2 = zzdyVar.zzd();
                    int iZzg3 = zzdyVar.zzg() + iZzd2;
                    if (zzdyVar.zzg() == 1768715124) {
                        zzdyVar.zzL(iZzd2);
                        zzdyVar.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzdyVar.zzd() < iZzg3) {
                            zzax zzaxVarZza = zzais.zza(zzdyVar);
                            if (zzaxVarZza != null) {
                                arrayList.add(zzaxVarZza);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzayVar2 = new zzay(arrayList);
                            break;
                        }
                        break;
                    }
                    zzdyVar.zzL(iZzg3);
                }
                zzayVar = zzayVar.zzd(zzayVar2);
            } else if (iZzg2 == 1936553057) {
                zzdyVar.zzL(iZzd);
                zzdyVar.zzM(12);
                while (zzdyVar.zzd() < iZzg) {
                    int iZzd3 = zzdyVar.zzd();
                    int iZzg4 = zzdyVar.zzg();
                    if (zzdyVar.zzg() == 1935766900) {
                        if (iZzg4 < 16) {
                            break;
                        }
                        zzdyVar.zzM(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int iZzm = zzdyVar.zzm();
                            int iZzm2 = zzdyVar.zzm();
                            if (iZzm == 0) {
                                i = iZzm2;
                            } else if (iZzm == 1) {
                                i2 = iZzm2;
                            }
                        }
                        if (i == 12) {
                            iZzn = PsExtractor.VIDEO_STREAM_MASK;
                        } else if (i == 13) {
                            iZzn = 120;
                        } else if (i == 21 && zzdyVar.zzb() >= 8 && zzdyVar.zzd() + 8 <= iZzg) {
                            int iZzg5 = zzdyVar.zzg();
                            int iZzg6 = zzdyVar.zzg();
                            if (iZzg5 < 12 || iZzg6 != 1936877170) {
                                iZzn = -2147483647;
                            } else {
                                iZzn = zzdyVar.zzn();
                            }
                        } else {
                            iZzn = -2147483647;
                        }
                        if (iZzn == -2147483647) {
                            break;
                        }
                        zzayVar2 = new zzay(C.TIME_UNSET, new zzahc(iZzn, i2));
                        break;
                    }
                    zzdyVar.zzL(iZzd3 + iZzg4);
                }
                zzayVar = zzayVar.zzd(zzayVar2);
            } else if (iZzg2 == -1451722374) {
                zzayVar = zzayVar.zzd(zzl(zzdyVar));
            }
            zzdyVar.zzL(iZzg);
        }
        return zzayVar;
    }

    public static zzew zzd(zzdy zzdyVar) {
        long jZzt;
        long jZzt2;
        zzdyVar.zzL(8);
        if (zza(zzdyVar.zzg()) == 0) {
            jZzt = zzdyVar.zzu();
            jZzt2 = zzdyVar.zzu();
        } else {
            jZzt = zzdyVar.zzt();
            jZzt2 = zzdyVar.zzt();
        }
        return new zzew(jZzt, jZzt2, zzdyVar.zzu());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0265  */
    /* JADX WARN: Code duplicated, block: B:104:0x0273  */
    /* JADX WARN: Code duplicated, block: B:109:0x0296 A[DONT_INVERT, LOOP:13: B:109:0x0296->B:113:0x02a0, LOOP_START, PHI: r16
  0x0296: PHI (r16v15 int) = (r16v3 int), (r16v16 int) binds: [B:108:0x0294, B:113:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0298  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a0 A[LOOP:13: B:109:0x0296->B:113:0x02a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a6 A[EDGE_INSN: B:114:0x02a6->B:115:0x02a7 BREAK  A[LOOP:13: B:109:0x0296->B:113:0x02a0]] */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x02ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x02af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:123:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:128:0x0300  */
    /* JADX WARN: Code duplicated, block: B:131:0x0334  */
    /* JADX WARN: Code duplicated, block: B:132:0x0337  */
    /* JADX WARN: Code duplicated, block: B:137:0x0363  */
    /* JADX WARN: Code duplicated, block: B:139:0x0379  */
    /* JADX WARN: Code duplicated, block: B:165:0x043a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0441  */
    /* JADX WARN: Code duplicated, block: B:170:0x044a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0455 A[LOOP:4: B:171:0x0452->B:173:0x0455, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0488  */
    /* JADX WARN: Code duplicated, block: B:179:0x048e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0490  */
    /* JADX WARN: Code duplicated, block: B:184:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:194:0x04e9 A[LOOP:7: B:194:0x04e9->B:198:0x04fa, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:196:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:198:0x04fa A[LOOP:7: B:194:0x04e9->B:198:0x04fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:202:0x0508  */
    /* JADX WARN: Code duplicated, block: B:203:0x050a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0511  */
    /* JADX WARN: Code duplicated, block: B:209:0x0532  */
    /* JADX WARN: Code duplicated, block: B:210:0x0534  */
    /* JADX WARN: Code duplicated, block: B:213:0x0539  */
    /* JADX WARN: Code duplicated, block: B:214:0x053c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0540  */
    /* JADX WARN: Code duplicated, block: B:218:0x0544  */
    /* JADX WARN: Code duplicated, block: B:220:0x0549  */
    /* JADX WARN: Code duplicated, block: B:222:0x054d  */
    /* JADX WARN: Code duplicated, block: B:223:0x0550  */
    /* JADX WARN: Code duplicated, block: B:227:0x055d  */
    /* JADX WARN: Code duplicated, block: B:229:0x056b  */
    /* JADX WARN: Code duplicated, block: B:230:0x057d  */
    /* JADX WARN: Code duplicated, block: B:233:0x0589  */
    /* JADX WARN: Code duplicated, block: B:235:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:237:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:247:0x060e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0623  */
    /* JADX WARN: Code duplicated, block: B:258:0x0528 A[EDGE_INSN: B:258:0x0528->B:207:0x0528 BREAK  A[LOOP:5: B:182:0x049e->B:206:0x051d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x04ff A[EDGE_INSN: B:263:0x04ff->B:200:0x04ff BREAK  A[LOOP:7: B:194:0x04e9->B:198:0x04fa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x04ff A[EDGE_INSN: B:264:0x04ff->B:200:0x04ff BREAK  A[LOOP:7: B:194:0x04e9->B:198:0x04fa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ab A[PHI: r11
  0x01ab: PHI (r11v4 int) = (r11v3 int), (r11v3 int), (r11v41 int), (r11v3 int) binds: [B:41:0x00f4, B:48:0x0110, B:65:0x01aa, B:47:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d7 A[LOOP:11: B:70:0x01cf->B:73:0x01d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x021d A[ADDED_TO_REGION, LOOP:12: B:82:0x021d->B:84:0x0221, LOOP_START, PHI: r2 r16 r29
  0x021d: PHI (r2v5 int) = (r2v3 int), (r2v6 int) binds: [B:80:0x021a, B:84:0x0221] A[DONT_GENERATE, DONT_INLINE]
  0x021d: PHI (r16v18 int) = (r16v3 int), (r16v19 int) binds: [B:80:0x021a, B:84:0x0221] A[DONT_GENERATE, DONT_INLINE]
  0x021d: PHI (r29v3 int) = (r29v1 int), (r29v7 int) binds: [B:80:0x021a, B:84:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0221 A[LOOP:12: B:82:0x021d->B:84:0x0221, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x023d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0245  */
    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
    /* JADX WARN: Code duplicated, block: B:97:0x024c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0253  */
    public static zzaje zze(zzajb zzajbVar, zzen zzenVar, zzadb zzadbVar) throws zzbc {
        zzaid zzaihVar;
        boolean z;
        int iZzp;
        int iZzp2;
        int iZzp3;
        int iZza;
        zzab zzabVar;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i;
        zzajb zzajbVar2;
        int iZzp4;
        int i2;
        long j;
        long j2;
        int i3;
        int iZzp5;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        long j3;
        int[] iArr;
        long[] jArr;
        int i8;
        int[] iArr2;
        long[] jArr2;
        String str;
        long j4;
        boolean zZza;
        int i9;
        int iZzg;
        int iZzc;
        int i10;
        long jZzu;
        long[] jArr3;
        int[] iArr3;
        int i11;
        long[] jArr4;
        int length;
        boolean z3;
        long[] jArr5;
        int[] iArr4;
        int[] iArr5;
        int i12;
        boolean z4;
        int i13;
        int i14;
        long[] jArr6;
        long[] jArr7;
        int[] iArr6;
        boolean z5;
        boolean z6;
        long[] jArr8;
        int[] iArr7;
        int[] iArr8;
        long[] jArr9;
        long j5;
        int i15;
        boolean z7;
        int i16;
        boolean z8;
        zzajb zzajbVarZza;
        long j6;
        int i17;
        int i18;
        int[] iArr9;
        boolean z9;
        long jZzu2;
        boolean z10;
        long j7;
        int i19;
        boolean z11;
        int i20;
        int i21;
        long j8;
        int iZza2;
        int i22;
        boolean z12;
        int i23;
        long j9;
        int i24;
        int length2;
        String str2;
        zzajb zzajbVarZza2 = zzajbVar;
        zzeo zzeoVarZzb = zzenVar.zzb(1937011578);
        if (zzeoVarZzb != null) {
            zzaihVar = new zzaig(zzeoVarZzb, zzajbVarZza2.zzg);
        } else {
            zzeo zzeoVarZzb2 = zzenVar.zzb(1937013298);
            if (zzeoVarZzb2 == null) {
                throw zzbc.zza("Track has no sample table size information", null);
            }
            zzaihVar = new zzaih(zzeoVarZzb2);
        }
        int iZzb = zzaihVar.zzb();
        if (iZzb == 0) {
            return new zzaje(zzajbVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (zzajbVarZza2.zzb == 2) {
            long j10 = zzajbVarZza2.zzf;
            if (j10 > 0) {
                zzz zzzVarZzb = zzajbVarZza2.zzg.zzb();
                zzzVarZzb.zzI(iZzb / (j10 / 1000000.0f));
                zzajbVarZza2 = zzajbVarZza2.zza(zzzVarZzb.zzag());
            }
        }
        zzajb zzajbVar3 = zzajbVarZza2;
        zzeo zzeoVarZzb3 = zzenVar.zzb(1937007471);
        if (zzeoVarZzb3 == null) {
            zzeoVarZzb3 = zzenVar.zzb(1668232756);
            zzeoVarZzb3.getClass();
            z = true;
        } else {
            z = false;
        }
        zzeo zzeoVarZzb4 = zzenVar.zzb(1937011555);
        zzeoVarZzb4.getClass();
        zzdy zzdyVar = zzeoVarZzb4.zza;
        zzeo zzeoVarZzb5 = zzenVar.zzb(1937011827);
        zzeoVarZzb5.getClass();
        zzdy zzdyVar2 = zzeoVarZzb5.zza;
        zzeo zzeoVarZzb6 = zzenVar.zzb(1937011571);
        zzdy zzdyVar3 = zzeoVarZzb6 != null ? zzeoVarZzb6.zza : null;
        zzeo zzeoVarZzb7 = zzenVar.zzb(1668576371);
        zzdy zzdyVar4 = zzeoVarZzb7 != null ? zzeoVarZzb7.zza : null;
        zzahz zzahzVar = new zzahz(zzdyVar, zzeoVarZzb3.zza, z);
        zzdyVar2.zzL(12);
        int iZzp6 = zzdyVar2.zzp() - 1;
        int iZzp7 = zzdyVar2.zzp();
        int iZzp8 = zzdyVar2.zzp();
        if (zzdyVar4 != null) {
            zzdyVar4.zzL(12);
            iZzp = zzdyVar4.zzp();
        } else {
            iZzp = 0;
        }
        if (zzdyVar3 != null) {
            zzdyVar3.zzL(12);
            iZzp2 = zzdyVar3.zzp();
            if (iZzp2 > 0) {
                iZzp3 = zzdyVar3.zzp() - 1;
            } else {
                zzdyVar3 = null;
            }
            iZza = zzaihVar.zza();
            zzabVar = zzajbVar3.zzg;
            if (iZza != -1) {
                str2 = zzabVar.zzo;
                if ((MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2)) || iZzp6 != 0) {
                    jArrCopyOf = new long[iZzb];
                    iArrCopyOf = new int[iZzb];
                    jArrCopyOf2 = new long[iZzb];
                    iArrCopyOf2 = new int[iZzb];
                    i = iZzp6;
                    zzajbVar2 = zzajbVar3;
                    iZzp4 = iZzp3;
                    i2 = 0;
                    j = 0;
                    j2 = 0;
                    i3 = 0;
                    iZzp5 = 0;
                    i4 = 0;
                    i5 = iZzp;
                    i6 = 0;
                    while (i6 < iZzb) {
                        j4 = j;
                        zZza = true;
                        while (true) {
                            if (i3 != 0) {
                                i9 = i3;
                                break;
                            }
                            zZza = zzahzVar.zza();
                            if (zZza) {
                                i9 = 0;
                                break;
                            }
                            zzdy zzdyVar5 = zzdyVar2;
                            long j11 = zzahzVar.zzd;
                            i3 = zzahzVar.zzc;
                            j4 = j11;
                            zzdyVar2 = zzdyVar5;
                            zzdyVar3 = zzdyVar3;
                            iZzb = iZzb;
                        }
                        if (!zZza) {
                            zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i6);
                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i6);
                            iZzb = i6;
                            break;
                        }
                        iZzg = i4;
                        if (zzdyVar4 != null) {
                            while (iZzp5 == 0) {
                                if (i5 > 0) {
                                    iZzp5 = 0;
                                    break;
                                }
                                i5--;
                                iZzp5 = zzdyVar4.zzp();
                                iZzg = zzdyVar4.zzg();
                            }
                            iZzp5--;
                        }
                        jArrCopyOf[i6] = j4;
                        iZzc = zzaihVar.zzc();
                        iArrCopyOf[i6] = iZzc;
                        if (iZzc > i2) {
                            i2 = iZzc;
                        }
                        jArrCopyOf2[i6] = j2 + ((long) iZzg);
                        if (zzdyVar3 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        iArrCopyOf2[i6] = i10;
                        if (i6 == iZzp4) {
                            iArrCopyOf2[i6] = 1;
                            iZzp2--;
                            if (iZzp2 > 0) {
                                zzdyVar3.getClass();
                                iZzp4 = zzdyVar3.zzp() - 1;
                            }
                        }
                        j2 += (long) iZzp8;
                        iZzp7--;
                        if (iZzp7 != 0) {
                            if (i > 0) {
                                i--;
                                iZzp7 = zzdyVar2.zzp();
                                iZzp8 = zzdyVar2.zzg();
                            } else {
                                iZzp7 = 0;
                            }
                        }
                        long j12 = j4 + ((long) iArrCopyOf[i6]);
                        i3 = i9 - 1;
                        i6++;
                        i4 = iZzg;
                        iZzb = iZzb;
                        zzdyVar2 = zzdyVar2;
                        j = j12;
                        zzdyVar3 = zzdyVar3;
                    }
                    long j13 = j2 + ((long) i4);
                    if (zzdyVar4 != null) {
                        z2 = true;
                        break;
                    }
                    while (true) {
                        if (i5 > 0) {
                            z2 = true;
                            break;
                        }
                        if (zzdyVar4.zzp() != 0) {
                            z2 = false;
                            break;
                        }
                        zzdyVar4.zzg();
                        i5--;
                    }
                    if (iZzp2 == 0) {
                        if (iZzp7 == 0) {
                            if (i3 == 0) {
                                i7 = 0;
                            } else if (i == 0) {
                                z2 = z2;
                                iZzb = iZzb;
                                i = i;
                                zzajbVar2 = zzajbVar2;
                                iZzp5 = iZzp5;
                                i7 = 0;
                                iZzp2 = 0;
                                i3 = 0;
                            } else if (iZzp5 == 0) {
                                z2 = z2;
                                iZzb = iZzb;
                                zzajbVar2 = zzajbVar2;
                                iZzp5 = iZzp5;
                                i7 = 0;
                                iZzp2 = 0;
                                i3 = 0;
                                i = 0;
                            } else if (z2) {
                                iZzb = iZzb;
                                zzajbVar2 = zzajbVar2;
                            } else {
                                iZzb = iZzb;
                                zzajbVar2 = zzajbVar2;
                                i7 = 0;
                                iZzp2 = 0;
                                i3 = 0;
                                i = 0;
                                iZzp5 = 0;
                                z2 = false;
                            }
                            j3 = j13;
                            iZzb = iZzb;
                            iArr = iArrCopyOf;
                            jArr = jArrCopyOf2;
                            i8 = i2;
                            iArr2 = iArrCopyOf2;
                            jArr2 = jArrCopyOf;
                        } else {
                            i7 = iZzp7;
                        }
                        iZzp2 = 0;
                    } else {
                        z2 = z2;
                        iZzb = iZzb;
                        i7 = iZzp7;
                        i3 = i3;
                        i = i;
                        zzajbVar2 = zzajbVar2;
                        iZzp5 = iZzp5;
                    }
                    StringBuilder sbT = AbstractC3950lJ.t("Inconsistent stbl box for track ", zzajbVar2.zza, ": remainingSynchronizationSamples ", iZzp2, ", remainingSamplesAtTimestampDelta ");
                    AbstractC3888ke0.t(sbT, i7, ", remainingSamplesInChunk ", i3, ", remainingTimestampDeltaChanges ");
                    sbT.append(i);
                    sbT.append(", remainingSamplesAtTimestampOffset ");
                    sbT.append(iZzp5);
                    if (true != z2) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbT.append(str);
                    zzdo.zzf("BoxParsers", sbT.toString());
                    j3 = j13;
                    iZzb = iZzb;
                    iArr = iArrCopyOf;
                    jArr = jArrCopyOf2;
                    i8 = i2;
                    iArr2 = iArrCopyOf2;
                    jArr2 = jArrCopyOf;
                } else if (iZzp == 0 || iZzp2 != 0) {
                    iZzp6 = 0;
                    jArrCopyOf = new long[iZzb];
                    iArrCopyOf = new int[iZzb];
                    jArrCopyOf2 = new long[iZzb];
                    iArrCopyOf2 = new int[iZzb];
                    i = iZzp6;
                    zzajbVar2 = zzajbVar3;
                    iZzp4 = iZzp3;
                    i2 = 0;
                    j = 0;
                    j2 = 0;
                    i3 = 0;
                    iZzp5 = 0;
                    i4 = 0;
                    i5 = iZzp;
                    i6 = 0;
                    while (i6 < iZzb) {
                        j4 = j;
                        zZza = true;
                        while (true) {
                            if (i3 != 0) {
                                i9 = i3;
                                break;
                            }
                            zZza = zzahzVar.zza();
                            if (zZza) {
                                i9 = 0;
                                break;
                            }
                            zzdy zzdyVar6 = zzdyVar2;
                            long j14 = zzahzVar.zzd;
                            i3 = zzahzVar.zzc;
                            j4 = j14;
                            zzdyVar2 = zzdyVar6;
                            zzdyVar3 = zzdyVar3;
                            iZzb = iZzb;
                        }
                        if (!zZza) {
                            zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i6);
                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i6);
                            iZzb = i6;
                            break;
                        }
                        iZzg = i4;
                        if (zzdyVar4 != null) {
                            while (iZzp5 == 0) {
                                if (i5 > 0) {
                                    iZzp5 = 0;
                                    break;
                                }
                                i5--;
                                iZzp5 = zzdyVar4.zzp();
                                iZzg = zzdyVar4.zzg();
                            }
                            iZzp5--;
                        }
                        jArrCopyOf[i6] = j4;
                        iZzc = zzaihVar.zzc();
                        iArrCopyOf[i6] = iZzc;
                        if (iZzc > i2) {
                            i2 = iZzc;
                        }
                        jArrCopyOf2[i6] = j2 + ((long) iZzg);
                        if (zzdyVar3 == 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        iArrCopyOf2[i6] = i10;
                        if (i6 == iZzp4) {
                            iArrCopyOf2[i6] = 1;
                            iZzp2--;
                            if (iZzp2 > 0) {
                                zzdyVar3.getClass();
                                iZzp4 = zzdyVar3.zzp() - 1;
                            }
                        }
                        j2 += (long) iZzp8;
                        iZzp7--;
                        if (iZzp7 != 0) {
                            if (i > 0) {
                                i--;
                                iZzp7 = zzdyVar2.zzp();
                                iZzp8 = zzdyVar2.zzg();
                            } else {
                                iZzp7 = 0;
                            }
                        }
                        long j15 = j4 + ((long) iArrCopyOf[i6]);
                        i3 = i9 - 1;
                        i6++;
                        i4 = iZzg;
                        iZzb = iZzb;
                        zzdyVar2 = zzdyVar2;
                        j = j15;
                        zzdyVar3 = zzdyVar3;
                    }
                    long j16 = j2 + ((long) i4);
                    if (zzdyVar4 != null) {
                        z2 = true;
                        break;
                    }
                    while (true) {
                        if (i5 > 0) {
                            z2 = true;
                            break;
                        }
                        if (zzdyVar4.zzp() != 0) {
                            z2 = false;
                            break;
                        }
                        zzdyVar4.zzg();
                        i5--;
                    }
                    if (iZzp2 == 0) {
                        if (iZzp7 == 0) {
                            if (i3 == 0) {
                                i7 = 0;
                            } else if (i == 0) {
                                z2 = z2;
                                iZzb = iZzb;
                                i = i;
                                zzajbVar2 = zzajbVar2;
                                iZzp5 = iZzp5;
                                i7 = 0;
                                iZzp2 = 0;
                                i3 = 0;
                            } else if (iZzp5 == 0) {
                                z2 = z2;
                                iZzb = iZzb;
                                zzajbVar2 = zzajbVar2;
                                iZzp5 = iZzp5;
                                i7 = 0;
                                iZzp2 = 0;
                                i3 = 0;
                                i = 0;
                            } else if (z2) {
                                iZzb = iZzb;
                                zzajbVar2 = zzajbVar2;
                                i7 = 0;
                                iZzp2 = 0;
                                i3 = 0;
                                i = 0;
                                iZzp5 = 0;
                                z2 = false;
                            } else {
                                iZzb = iZzb;
                                zzajbVar2 = zzajbVar2;
                            }
                            j3 = j16;
                            iZzb = iZzb;
                            iArr = iArrCopyOf;
                            jArr = jArrCopyOf2;
                            i8 = i2;
                            iArr2 = iArrCopyOf2;
                            jArr2 = jArrCopyOf;
                        } else {
                            i7 = iZzp7;
                        }
                        iZzp2 = 0;
                    } else {
                        z2 = z2;
                        iZzb = iZzb;
                        i7 = iZzp7;
                        i3 = i3;
                        i = i;
                        zzajbVar2 = zzajbVar2;
                        iZzp5 = iZzp5;
                    }
                    StringBuilder sbT2 = AbstractC3950lJ.t("Inconsistent stbl box for track ", zzajbVar2.zza, ": remainingSynchronizationSamples ", iZzp2, ", remainingSamplesAtTimestampDelta ");
                    AbstractC3888ke0.t(sbT2, i7, ", remainingSamplesInChunk ", i3, ", remainingTimestampDeltaChanges ");
                    sbT2.append(i);
                    sbT2.append(", remainingSamplesAtTimestampOffset ");
                    sbT2.append(iZzp5);
                    if (true != z2) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbT2.append(str);
                    zzdo.zzf("BoxParsers", sbT2.toString());
                    j3 = j16;
                    iZzb = iZzb;
                    iArr = iArrCopyOf;
                    jArr = jArrCopyOf2;
                    i8 = i2;
                    iArr2 = iArrCopyOf2;
                    jArr2 = jArrCopyOf;
                } else {
                    int i25 = zzahzVar.zza;
                    long[] jArr10 = new long[i25];
                    int[] iArr10 = new int[i25];
                    while (zzahzVar.zza()) {
                        int i26 = zzahzVar.zzb;
                        jArr10[i26] = zzahzVar.zzd;
                        iArr10[i26] = zzahzVar.zzc;
                    }
                    long j17 = iZzp8;
                    int i27 = 8192 / iZza;
                    int i28 = 0;
                    for (int i29 = 0; i29 < i25; i29++) {
                        int i30 = iArr10[i29];
                        int i31 = zzei.zza;
                        i28 += ((i30 + i27) - 1) / i27;
                    }
                    long[] jArr11 = new long[i28];
                    int[] iArr11 = new int[i28];
                    long[] jArr12 = new long[i28];
                    int[] iArr12 = new int[i28];
                    int i32 = 0;
                    int i33 = 0;
                    i8 = 0;
                    int i34 = 0;
                    while (i33 < i25) {
                        int i35 = iArr10[i33];
                        long j18 = jArr10[i33];
                        int i36 = i34;
                        int i37 = i25;
                        int iMax = i8;
                        int i38 = i36;
                        long[] jArr13 = jArr10;
                        int i39 = i35;
                        while (i39 > 0) {
                            int iMin = Math.min(i27, i39);
                            jArr11[i38] = j18;
                            int i40 = i27;
                            int i41 = iZza * iMin;
                            iArr11[i38] = i41;
                            iMax = Math.max(iMax, i41);
                            jArr12[i38] = ((long) i32) * j17;
                            iArr12[i38] = 1;
                            j18 += (long) iArr11[i38];
                            i32 += iMin;
                            i39 -= iMin;
                            i38++;
                            i27 = i40;
                            iZza = iZza;
                        }
                        i33++;
                        jArr10 = jArr13;
                        int i42 = i38;
                        i8 = iMax;
                        i25 = i37;
                        i34 = i42;
                    }
                    j3 = j17 * ((long) i32);
                    jArr2 = jArr11;
                    zzajbVar2 = zzajbVar3;
                    jArr = jArr12;
                    iArr2 = iArr12;
                    iArr = iArr11;
                }
            } else {
                jArrCopyOf = new long[iZzb];
                iArrCopyOf = new int[iZzb];
                jArrCopyOf2 = new long[iZzb];
                iArrCopyOf2 = new int[iZzb];
                i = iZzp6;
                zzajbVar2 = zzajbVar3;
                iZzp4 = iZzp3;
                i2 = 0;
                j = 0;
                j2 = 0;
                i3 = 0;
                iZzp5 = 0;
                i4 = 0;
                i5 = iZzp;
                i6 = 0;
                while (i6 < iZzb) {
                    j4 = j;
                    zZza = true;
                    while (true) {
                        if (i3 != 0) {
                            i9 = i3;
                            break;
                        }
                        zZza = zzahzVar.zza();
                        if (zZza) {
                            i9 = 0;
                            break;
                        }
                        zzdy zzdyVar7 = zzdyVar2;
                        long j19 = zzahzVar.zzd;
                        i3 = zzahzVar.zzc;
                        j4 = j19;
                        zzdyVar2 = zzdyVar7;
                        zzdyVar3 = zzdyVar3;
                        iZzb = iZzb;
                    }
                    if (!zZza) {
                        zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i6);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i6);
                        iZzb = i6;
                        break;
                    }
                    iZzg = i4;
                    if (zzdyVar4 != null) {
                        while (iZzp5 == 0) {
                            if (i5 > 0) {
                                iZzp5 = 0;
                                break;
                            }
                            i5--;
                            iZzp5 = zzdyVar4.zzp();
                            iZzg = zzdyVar4.zzg();
                        }
                        iZzp5--;
                    }
                    jArrCopyOf[i6] = j4;
                    iZzc = zzaihVar.zzc();
                    iArrCopyOf[i6] = iZzc;
                    if (iZzc > i2) {
                        i2 = iZzc;
                    }
                    jArrCopyOf2[i6] = j2 + ((long) iZzg);
                    if (zzdyVar3 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    iArrCopyOf2[i6] = i10;
                    if (i6 == iZzp4) {
                        iArrCopyOf2[i6] = 1;
                        iZzp2--;
                        if (iZzp2 > 0) {
                            zzdyVar3.getClass();
                            iZzp4 = zzdyVar3.zzp() - 1;
                        }
                    }
                    j2 += (long) iZzp8;
                    iZzp7--;
                    if (iZzp7 != 0) {
                        if (i > 0) {
                            i--;
                            iZzp7 = zzdyVar2.zzp();
                            iZzp8 = zzdyVar2.zzg();
                        } else {
                            iZzp7 = 0;
                        }
                    }
                    long j110 = j4 + ((long) iArrCopyOf[i6]);
                    i3 = i9 - 1;
                    i6++;
                    i4 = iZzg;
                    iZzb = iZzb;
                    zzdyVar2 = zzdyVar2;
                    j = j110;
                    zzdyVar3 = zzdyVar3;
                }
                long j111 = j2 + ((long) i4);
                if (zzdyVar4 != null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i5 > 0) {
                        z2 = true;
                        break;
                    }
                    if (zzdyVar4.zzp() != 0) {
                        z2 = false;
                        break;
                    }
                    zzdyVar4.zzg();
                    i5--;
                }
                if (iZzp2 == 0) {
                    if (iZzp7 == 0) {
                        if (i3 == 0) {
                            i7 = 0;
                        } else if (i == 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            i = i;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                        } else if (iZzp5 == 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                        } else if (z2) {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                            iZzp5 = 0;
                            z2 = false;
                        } else {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                        }
                        j3 = j111;
                        iZzb = iZzb;
                        iArr = iArrCopyOf;
                        jArr = jArrCopyOf2;
                        i8 = i2;
                        iArr2 = iArrCopyOf2;
                        jArr2 = jArrCopyOf;
                    } else {
                        i7 = iZzp7;
                    }
                    iZzp2 = 0;
                } else {
                    z2 = z2;
                    iZzb = iZzb;
                    i7 = iZzp7;
                    i3 = i3;
                    i = i;
                    zzajbVar2 = zzajbVar2;
                    iZzp5 = iZzp5;
                }
                StringBuilder sbT3 = AbstractC3950lJ.t("Inconsistent stbl box for track ", zzajbVar2.zza, ": remainingSynchronizationSamples ", iZzp2, ", remainingSamplesAtTimestampDelta ");
                AbstractC3888ke0.t(sbT3, i7, ", remainingSamplesInChunk ", i3, ", remainingTimestampDeltaChanges ");
                sbT3.append(i);
                sbT3.append(", remainingSamplesAtTimestampOffset ");
                sbT3.append(iZzp5);
                if (true != z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sbT3.append(str);
                zzdo.zzf("BoxParsers", sbT3.toString());
                j3 = j111;
                iZzb = iZzb;
                iArr = iArrCopyOf;
                jArr = jArrCopyOf2;
                i8 = i2;
                iArr2 = iArrCopyOf2;
                jArr2 = jArrCopyOf;
            }
            long j20 = zzajbVar2.zzc;
            RoundingMode roundingMode = RoundingMode.DOWN;
            jZzu = zzei.zzu(j3, 1000000L, j20, roundingMode);
            jArr3 = zzajbVar2.zzi;
            if (jArr3 == null) {
                zzei.zzF(jArr, 1000000L, zzajbVar2.zzc);
                return new zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr2, jZzu);
            }
            iArr3 = iArr2;
            if (jArr3.length == 1 || zzajbVar2.zzb != 1 || (length2 = jArr.length) < 2) {
                i11 = iZzb;
            } else {
                long[] jArr14 = zzajbVar2.zzj;
                jArr14.getClass();
                long j21 = jArr14[0];
                long jZzu3 = j21 + zzei.zzu(jArr3[0], zzajbVar2.zzc, zzajbVar2.zzd, roundingMode);
                int i43 = length2 - 1;
                int iMax2 = Math.max(0, Math.min(4, i43));
                int iMax3 = Math.max(0, Math.min(length2 - 4, i43));
                long j22 = jArr[0];
                if (j22 > j21 || j21 >= jArr[iMax2] || jArr[iMax3] >= jZzu3 || jZzu3 > j3) {
                    i11 = iZzb;
                } else {
                    int i44 = iZzb;
                    long jZzu4 = zzei.zzu(j21 - j22, zzajbVar2.zzg.zzE, zzajbVar2.zzc, roundingMode);
                    i11 = i44;
                    long jZzu5 = zzei.zzu(j3 - jZzu3, zzajbVar2.zzg.zzE, zzajbVar2.zzc, roundingMode);
                    if (jZzu4 != 0) {
                        if (jZzu4 <= 2147483647L && jZzu5 <= 2147483647L) {
                            zzadbVar.zza = (int) jZzu4;
                            zzadbVar.zzb = (int) jZzu5;
                            zzei.zzF(jArr, 1000000L, zzajbVar2.zzc);
                            return new zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr3, zzei.zzu(zzajbVar2.zzi[0], 1000000L, zzajbVar2.zzd, roundingMode));
                        }
                    } else if (jZzu5 != 0) {
                        jZzu4 = 0;
                        if (jZzu4 <= 2147483647L) {
                            zzadbVar.zza = (int) jZzu4;
                            zzadbVar.zzb = (int) jZzu5;
                            zzei.zzF(jArr, 1000000L, zzajbVar2.zzc);
                            return new zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr3, zzei.zzu(zzajbVar2.zzi[0], 1000000L, zzajbVar2.zzd, roundingMode));
                        }
                    }
                }
            }
            jArr4 = zzajbVar2.zzi;
            length = jArr4.length;
            if (length == 1) {
                if (jArr4[0] == 0) {
                    long[] jArr15 = zzajbVar2.zzj;
                    jArr15.getClass();
                    j9 = jArr15[0];
                    for (i24 = 0; i24 < jArr.length; i24++) {
                        jArr[i24] = zzei.zzu(jArr[i24] - j9, 1000000L, zzajbVar2.zzc, RoundingMode.DOWN);
                    }
                    return new zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr3, zzei.zzu(j3 - j9, 1000000L, zzajbVar2.zzc, RoundingMode.DOWN));
                }
                length = 1;
            }
            if (zzajbVar2.zzb == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            jArr5 = zzajbVar2.zzj;
            iArr4 = new int[length];
            iArr5 = new int[length];
            jArr5.getClass();
            i12 = 0;
            z4 = false;
            i13 = 0;
            i14 = 0;
            while (true) {
                jArr6 = zzajbVar2.zzi;
                if (i14 < jArr6.length) {
                    break;
                }
                long[] jArr16 = jArr2;
                int[] iArr13 = iArr;
                j7 = jArr5[i14];
                if (j7 != -1) {
                    boolean z13 = z4;
                    i20 = i13;
                    long jZzu6 = zzei.zzu(jArr6[i14], zzajbVar2.zzc, zzajbVar2.zzd, RoundingMode.DOWN);
                    iArr4[i14] = zzei.zzd(jArr, j7, true, true);
                    while (true) {
                        i21 = iArr4[i14];
                        if (i21 < 0 || (iArr3[i21] & 1) != 0) {
                            break;
                        }
                        iArr4[i14] = i21 - 1;
                    }
                    j8 = j7 + jZzu6;
                    iZza2 = zzei.zza(jArr, j8, z3, false);
                    iArr5[i14] = iZza2;
                    if (zzajbVar2.zzb == 2) {
                        while (true) {
                            iZza2 = iArr5[i14];
                            if (iZza2 < jArr.length - 1) {
                                break;
                            }
                            i23 = iZza2 + 1;
                            if (jArr[i23] <= j8) {
                                break;
                            }
                            iArr5[i14] = i23;
                        }
                    }
                    i22 = iArr4[i14];
                    int i45 = (iZza2 - i22) + i12;
                    if (i20 != i22) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i19 = iZza2;
                    z11 = z13 | z12;
                    i12 = i45;
                } else {
                    i19 = i13;
                    z11 = z4;
                }
                i14++;
                z4 = z11;
                i11 = i11;
                i13 = i19;
                iArr = iArr13;
                jArr2 = jArr16;
            }
            boolean z14 = z4;
            jArr7 = jArr2;
            iArr6 = iArr;
            if (i12 != i11) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z14 | z5;
            if (z6) {
                jArr8 = new long[i12];
            } else {
                jArr8 = jArr7;
            }
            if (z6) {
                iArr7 = new int[i12];
            } else {
                iArr7 = iArr6;
            }
            if (true == z6) {
                i8 = 0;
            }
            if (z6) {
                iArr8 = new int[i12];
            } else {
                iArr8 = iArr3;
            }
            jArr9 = new long[i12];
            j5 = 0;
            i15 = 0;
            z7 = false;
            i16 = 0;
            while (i15 < zzajbVar2.zzi.length) {
                j6 = zzajbVar2.zzj[i15];
                i17 = iArr4[i15];
                int[] iArr14 = iArr4;
                i18 = iArr5[i15];
                int[] iArr15 = iArr5;
                if (z6) {
                    int i46 = i18 - i17;
                    System.arraycopy(jArr7, i17, jArr8, i16, i46);
                    iArr9 = iArr6;
                    System.arraycopy(iArr9, i17, iArr7, i16, i46);
                    System.arraycopy(iArr3, i17, iArr8, i16, i46);
                } else {
                    iArr9 = iArr6;
                }
                z9 = z7;
                int[] iArr16 = iArr3;
                int i47 = i8;
                while (i17 < i18) {
                    int i48 = i15;
                    int[] iArr17 = iArr8;
                    long j23 = zzajbVar2.zzd;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jZzu7 = zzei.zzu(j5, 1000000L, j23, roundingMode2);
                    long[] jArr17 = jArr;
                    int i49 = i18;
                    jZzu2 = zzei.zzu(jArr[i17] - j6, 1000000L, zzajbVar2.zzc, roundingMode2);
                    if (jZzu2 < 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z9 = (!z10) | z9;
                    jArr9[i16] = jZzu7 + jZzu2;
                    if (!z6 && iArr7[i16] > i47) {
                        i47 = iArr9[i17];
                    }
                    i16++;
                    i17++;
                    i18 = i49;
                    iArr8 = iArr17;
                    i15 = i48;
                    jArr = jArr17;
                }
                int i50 = i15;
                j5 += zzajbVar2.zzi[i50];
                i15 = i50 + 1;
                i8 = i47;
                iArr3 = iArr16;
                iArr4 = iArr14;
                iArr8 = iArr8;
                jArr = jArr;
                iArr6 = iArr9;
                z7 = z9;
                iArr5 = iArr15;
            }
            int[] iArr18 = iArr8;
            z8 = z7;
            long jZzu8 = zzei.zzu(j5, 1000000L, zzajbVar2.zzd, RoundingMode.DOWN);
            if (z8) {
                zzz zzzVarZzb2 = zzajbVar2.zzg.zzb();
                zzzVarZzb2.zzJ(true);
                zzajbVarZza = zzajbVar2.zza(zzzVarZzb2.zzag());
            } else {
                zzajbVarZza = zzajbVar2;
            }
            return new zzaje(zzajbVarZza, jArr8, iArr7, i8, jArr9, iArr18, jZzu8);
        }
        iZzp2 = 0;
        iZzp3 = -1;
        iZza = zzaihVar.zza();
        zzabVar = zzajbVar3.zzg;
        if (iZza != -1) {
            str2 = zzabVar.zzo;
            if (MimeTypes.AUDIO_RAW.equals(str2)) {
                if (iZzp == 0) {
                }
                iZzp6 = 0;
                jArrCopyOf = new long[iZzb];
                iArrCopyOf = new int[iZzb];
                jArrCopyOf2 = new long[iZzb];
                iArrCopyOf2 = new int[iZzb];
                i = iZzp6;
                zzajbVar2 = zzajbVar3;
                iZzp4 = iZzp3;
                i2 = 0;
                j = 0;
                j2 = 0;
                i3 = 0;
                iZzp5 = 0;
                i4 = 0;
                i5 = iZzp;
                i6 = 0;
                while (i6 < iZzb) {
                    j4 = j;
                    zZza = true;
                    while (true) {
                        if (i3 != 0) {
                            i9 = i3;
                            break;
                        }
                        zZza = zzahzVar.zza();
                        if (zZza) {
                            i9 = 0;
                            break;
                        }
                        zzdy zzdyVar8 = zzdyVar2;
                        long j112 = zzahzVar.zzd;
                        i3 = zzahzVar.zzc;
                        j4 = j112;
                        zzdyVar2 = zzdyVar8;
                        zzdyVar3 = zzdyVar3;
                        iZzb = iZzb;
                    }
                    if (!zZza) {
                        zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i6);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i6);
                        iZzb = i6;
                        break;
                    }
                    iZzg = i4;
                    if (zzdyVar4 != null) {
                        while (iZzp5 == 0) {
                            if (i5 > 0) {
                                iZzp5 = 0;
                                break;
                            }
                            i5--;
                            iZzp5 = zzdyVar4.zzp();
                            iZzg = zzdyVar4.zzg();
                        }
                        iZzp5--;
                    }
                    jArrCopyOf[i6] = j4;
                    iZzc = zzaihVar.zzc();
                    iArrCopyOf[i6] = iZzc;
                    if (iZzc > i2) {
                        i2 = iZzc;
                    }
                    jArrCopyOf2[i6] = j2 + ((long) iZzg);
                    if (zzdyVar3 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    iArrCopyOf2[i6] = i10;
                    if (i6 == iZzp4) {
                        iArrCopyOf2[i6] = 1;
                        iZzp2--;
                        if (iZzp2 > 0) {
                            zzdyVar3.getClass();
                            iZzp4 = zzdyVar3.zzp() - 1;
                        }
                    }
                    j2 += (long) iZzp8;
                    iZzp7--;
                    if (iZzp7 != 0) {
                        if (i > 0) {
                            i--;
                            iZzp7 = zzdyVar2.zzp();
                            iZzp8 = zzdyVar2.zzg();
                        } else {
                            iZzp7 = 0;
                        }
                    }
                    long j113 = j4 + ((long) iArrCopyOf[i6]);
                    i3 = i9 - 1;
                    i6++;
                    i4 = iZzg;
                    iZzb = iZzb;
                    zzdyVar2 = zzdyVar2;
                    j = j113;
                    zzdyVar3 = zzdyVar3;
                }
                long j114 = j2 + ((long) i4);
                if (zzdyVar4 != null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i5 > 0) {
                        z2 = true;
                        break;
                    }
                    if (zzdyVar4.zzp() != 0) {
                        z2 = false;
                        break;
                    }
                    zzdyVar4.zzg();
                    i5--;
                }
                if (iZzp2 == 0) {
                    if (iZzp7 == 0) {
                        if (i3 == 0) {
                            i7 = 0;
                        } else if (i == 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            i = i;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                        } else if (iZzp5 == 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                        } else if (z2) {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                            iZzp5 = 0;
                            z2 = false;
                        } else {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                        }
                        j3 = j114;
                        iZzb = iZzb;
                        iArr = iArrCopyOf;
                        jArr = jArrCopyOf2;
                        i8 = i2;
                        iArr2 = iArrCopyOf2;
                        jArr2 = jArrCopyOf;
                    } else {
                        i7 = iZzp7;
                    }
                    iZzp2 = 0;
                } else {
                    z2 = z2;
                    iZzb = iZzb;
                    i7 = iZzp7;
                    i3 = i3;
                    i = i;
                    zzajbVar2 = zzajbVar2;
                    iZzp5 = iZzp5;
                }
                StringBuilder sbT4 = AbstractC3950lJ.t("Inconsistent stbl box for track ", zzajbVar2.zza, ": remainingSynchronizationSamples ", iZzp2, ", remainingSamplesAtTimestampDelta ");
                AbstractC3888ke0.t(sbT4, i7, ", remainingSamplesInChunk ", i3, ", remainingTimestampDeltaChanges ");
                sbT4.append(i);
                sbT4.append(", remainingSamplesAtTimestampOffset ");
                sbT4.append(iZzp5);
                if (true != z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sbT4.append(str);
                zzdo.zzf("BoxParsers", sbT4.toString());
                j3 = j114;
                iZzb = iZzb;
                iArr = iArrCopyOf;
                jArr = jArrCopyOf2;
                i8 = i2;
                iArr2 = iArrCopyOf2;
                jArr2 = jArrCopyOf;
            } else {
                if (iZzp == 0) {
                }
                iZzp6 = 0;
                jArrCopyOf = new long[iZzb];
                iArrCopyOf = new int[iZzb];
                jArrCopyOf2 = new long[iZzb];
                iArrCopyOf2 = new int[iZzb];
                i = iZzp6;
                zzajbVar2 = zzajbVar3;
                iZzp4 = iZzp3;
                i2 = 0;
                j = 0;
                j2 = 0;
                i3 = 0;
                iZzp5 = 0;
                i4 = 0;
                i5 = iZzp;
                i6 = 0;
                while (i6 < iZzb) {
                    j4 = j;
                    zZza = true;
                    while (true) {
                        if (i3 != 0) {
                            i9 = i3;
                            break;
                        }
                        zZza = zzahzVar.zza();
                        if (zZza) {
                            i9 = 0;
                            break;
                        }
                        zzdy zzdyVar9 = zzdyVar2;
                        long j115 = zzahzVar.zzd;
                        i3 = zzahzVar.zzc;
                        j4 = j115;
                        zzdyVar2 = zzdyVar9;
                        zzdyVar3 = zzdyVar3;
                        iZzb = iZzb;
                    }
                    if (!zZza) {
                        zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i6);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i6);
                        iZzb = i6;
                        break;
                    }
                    iZzg = i4;
                    if (zzdyVar4 != null) {
                        while (iZzp5 == 0) {
                            if (i5 > 0) {
                                iZzp5 = 0;
                                break;
                            }
                            i5--;
                            iZzp5 = zzdyVar4.zzp();
                            iZzg = zzdyVar4.zzg();
                        }
                        iZzp5--;
                    }
                    jArrCopyOf[i6] = j4;
                    iZzc = zzaihVar.zzc();
                    iArrCopyOf[i6] = iZzc;
                    if (iZzc > i2) {
                        i2 = iZzc;
                    }
                    jArrCopyOf2[i6] = j2 + ((long) iZzg);
                    if (zzdyVar3 == 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    iArrCopyOf2[i6] = i10;
                    if (i6 == iZzp4) {
                        iArrCopyOf2[i6] = 1;
                        iZzp2--;
                        if (iZzp2 > 0) {
                            zzdyVar3.getClass();
                            iZzp4 = zzdyVar3.zzp() - 1;
                        }
                    }
                    j2 += (long) iZzp8;
                    iZzp7--;
                    if (iZzp7 != 0) {
                        if (i > 0) {
                            i--;
                            iZzp7 = zzdyVar2.zzp();
                            iZzp8 = zzdyVar2.zzg();
                        } else {
                            iZzp7 = 0;
                        }
                    }
                    long j116 = j4 + ((long) iArrCopyOf[i6]);
                    i3 = i9 - 1;
                    i6++;
                    i4 = iZzg;
                    iZzb = iZzb;
                    zzdyVar2 = zzdyVar2;
                    j = j116;
                    zzdyVar3 = zzdyVar3;
                }
                long j117 = j2 + ((long) i4);
                if (zzdyVar4 != null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i5 > 0) {
                        z2 = true;
                        break;
                    }
                    if (zzdyVar4.zzp() != 0) {
                        z2 = false;
                        break;
                    }
                    zzdyVar4.zzg();
                    i5--;
                }
                if (iZzp2 == 0) {
                    if (iZzp7 == 0) {
                        if (i3 == 0) {
                            i7 = 0;
                        } else if (i == 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            i = i;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                        } else if (iZzp5 == 0) {
                            z2 = z2;
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            iZzp5 = iZzp5;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                        } else if (z2) {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                            i7 = 0;
                            iZzp2 = 0;
                            i3 = 0;
                            i = 0;
                            iZzp5 = 0;
                            z2 = false;
                        } else {
                            iZzb = iZzb;
                            zzajbVar2 = zzajbVar2;
                        }
                        j3 = j117;
                        iZzb = iZzb;
                        iArr = iArrCopyOf;
                        jArr = jArrCopyOf2;
                        i8 = i2;
                        iArr2 = iArrCopyOf2;
                        jArr2 = jArrCopyOf;
                    } else {
                        i7 = iZzp7;
                    }
                    iZzp2 = 0;
                } else {
                    z2 = z2;
                    iZzb = iZzb;
                    i7 = iZzp7;
                    i3 = i3;
                    i = i;
                    zzajbVar2 = zzajbVar2;
                    iZzp5 = iZzp5;
                }
                StringBuilder sbT5 = AbstractC3950lJ.t("Inconsistent stbl box for track ", zzajbVar2.zza, ": remainingSynchronizationSamples ", iZzp2, ", remainingSamplesAtTimestampDelta ");
                AbstractC3888ke0.t(sbT5, i7, ", remainingSamplesInChunk ", i3, ", remainingTimestampDeltaChanges ");
                sbT5.append(i);
                sbT5.append(", remainingSamplesAtTimestampOffset ");
                sbT5.append(iZzp5);
                if (true != z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sbT5.append(str);
                zzdo.zzf("BoxParsers", sbT5.toString());
                j3 = j117;
                iZzb = iZzb;
                iArr = iArrCopyOf;
                jArr = jArrCopyOf2;
                i8 = i2;
                iArr2 = iArrCopyOf2;
                jArr2 = jArrCopyOf;
            }
        } else {
            jArrCopyOf = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArrCopyOf2 = new long[iZzb];
            iArrCopyOf2 = new int[iZzb];
            i = iZzp6;
            zzajbVar2 = zzajbVar3;
            iZzp4 = iZzp3;
            i2 = 0;
            j = 0;
            j2 = 0;
            i3 = 0;
            iZzp5 = 0;
            i4 = 0;
            i5 = iZzp;
            i6 = 0;
            while (i6 < iZzb) {
                j4 = j;
                zZza = true;
                while (true) {
                    if (i3 != 0) {
                        i9 = i3;
                        break;
                    }
                    zZza = zzahzVar.zza();
                    if (zZza) {
                        i9 = 0;
                        break;
                    }
                    zzdy zzdyVar10 = zzdyVar2;
                    long j118 = zzahzVar.zzd;
                    i3 = zzahzVar.zzc;
                    j4 = j118;
                    zzdyVar2 = zzdyVar10;
                    zzdyVar3 = zzdyVar3;
                    iZzb = iZzb;
                }
                if (!zZza) {
                    zzdo.zzf("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i6);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i6);
                    iZzb = i6;
                    break;
                }
                iZzg = i4;
                if (zzdyVar4 != null) {
                    while (iZzp5 == 0) {
                        if (i5 > 0) {
                            iZzp5 = 0;
                            break;
                        }
                        i5--;
                        iZzp5 = zzdyVar4.zzp();
                        iZzg = zzdyVar4.zzg();
                    }
                    iZzp5--;
                }
                jArrCopyOf[i6] = j4;
                iZzc = zzaihVar.zzc();
                iArrCopyOf[i6] = iZzc;
                if (iZzc > i2) {
                    i2 = iZzc;
                }
                jArrCopyOf2[i6] = j2 + ((long) iZzg);
                if (zzdyVar3 == 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                iArrCopyOf2[i6] = i10;
                if (i6 == iZzp4) {
                    iArrCopyOf2[i6] = 1;
                    iZzp2--;
                    if (iZzp2 > 0) {
                        zzdyVar3.getClass();
                        iZzp4 = zzdyVar3.zzp() - 1;
                    }
                }
                j2 += (long) iZzp8;
                iZzp7--;
                if (iZzp7 != 0) {
                    if (i > 0) {
                        i--;
                        iZzp7 = zzdyVar2.zzp();
                        iZzp8 = zzdyVar2.zzg();
                    } else {
                        iZzp7 = 0;
                    }
                }
                long j119 = j4 + ((long) iArrCopyOf[i6]);
                i3 = i9 - 1;
                i6++;
                i4 = iZzg;
                iZzb = iZzb;
                zzdyVar2 = zzdyVar2;
                j = j119;
                zzdyVar3 = zzdyVar3;
            }
            long j1110 = j2 + ((long) i4);
            if (zzdyVar4 != null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i5 > 0) {
                    z2 = true;
                    break;
                }
                if (zzdyVar4.zzp() != 0) {
                    z2 = false;
                    break;
                }
                zzdyVar4.zzg();
                i5--;
            }
            if (iZzp2 == 0) {
                if (iZzp7 == 0) {
                    if (i3 == 0) {
                        i7 = 0;
                    } else if (i == 0) {
                        z2 = z2;
                        iZzb = iZzb;
                        i = i;
                        zzajbVar2 = zzajbVar2;
                        iZzp5 = iZzp5;
                        i7 = 0;
                        iZzp2 = 0;
                        i3 = 0;
                    } else if (iZzp5 == 0) {
                        z2 = z2;
                        iZzb = iZzb;
                        zzajbVar2 = zzajbVar2;
                        iZzp5 = iZzp5;
                        i7 = 0;
                        iZzp2 = 0;
                        i3 = 0;
                        i = 0;
                    } else if (z2) {
                        iZzb = iZzb;
                        zzajbVar2 = zzajbVar2;
                        i7 = 0;
                        iZzp2 = 0;
                        i3 = 0;
                        i = 0;
                        iZzp5 = 0;
                        z2 = false;
                    } else {
                        iZzb = iZzb;
                        zzajbVar2 = zzajbVar2;
                    }
                    j3 = j1110;
                    iZzb = iZzb;
                    iArr = iArrCopyOf;
                    jArr = jArrCopyOf2;
                    i8 = i2;
                    iArr2 = iArrCopyOf2;
                    jArr2 = jArrCopyOf;
                } else {
                    i7 = iZzp7;
                }
                iZzp2 = 0;
            } else {
                z2 = z2;
                iZzb = iZzb;
                i7 = iZzp7;
                i3 = i3;
                i = i;
                zzajbVar2 = zzajbVar2;
                iZzp5 = iZzp5;
            }
            StringBuilder sbT6 = AbstractC3950lJ.t("Inconsistent stbl box for track ", zzajbVar2.zza, ": remainingSynchronizationSamples ", iZzp2, ", remainingSamplesAtTimestampDelta ");
            AbstractC3888ke0.t(sbT6, i7, ", remainingSamplesInChunk ", i3, ", remainingTimestampDeltaChanges ");
            sbT6.append(i);
            sbT6.append(", remainingSamplesAtTimestampOffset ");
            sbT6.append(iZzp5);
            if (true != z2) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            sbT6.append(str);
            zzdo.zzf("BoxParsers", sbT6.toString());
            j3 = j1110;
            iZzb = iZzb;
            iArr = iArrCopyOf;
            jArr = jArrCopyOf2;
            i8 = i2;
            iArr2 = iArrCopyOf2;
            jArr2 = jArrCopyOf;
        }
        long j24 = zzajbVar2.zzc;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        jZzu = zzei.zzu(j3, 1000000L, j24, roundingMode3);
        jArr3 = zzajbVar2.zzi;
        if (jArr3 == null) {
            zzei.zzF(jArr, 1000000L, zzajbVar2.zzc);
            return new zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr2, jZzu);
        }
        iArr3 = iArr2;
        if (jArr3.length == 1) {
            i11 = iZzb;
        } else {
            i11 = iZzb;
        }
        jArr4 = zzajbVar2.zzi;
        length = jArr4.length;
        if (length == 1) {
            if (jArr4[0] == 0) {
                long[] jArr18 = zzajbVar2.zzj;
                jArr18.getClass();
                j9 = jArr18[0];
                while (i24 < jArr.length) {
                    jArr[i24] = zzei.zzu(jArr[i24] - j9, 1000000L, zzajbVar2.zzc, RoundingMode.DOWN);
                }
                return new zzaje(zzajbVar2, jArr2, iArr, i8, jArr, iArr3, zzei.zzu(j3 - j9, 1000000L, zzajbVar2.zzc, RoundingMode.DOWN));
            }
            length = 1;
        }
        if (zzajbVar2.zzb == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        jArr5 = zzajbVar2.zzj;
        iArr4 = new int[length];
        iArr5 = new int[length];
        jArr5.getClass();
        i12 = 0;
        z4 = false;
        i13 = 0;
        i14 = 0;
        while (true) {
            jArr6 = zzajbVar2.zzi;
            if (i14 < jArr6.length) {
                break;
                break;
            }
            long[] jArr19 = jArr2;
            int[] iArr19 = iArr;
            j7 = jArr5[i14];
            if (j7 != -1) {
                boolean z15 = z4;
                i20 = i13;
                long jZzu9 = zzei.zzu(jArr6[i14], zzajbVar2.zzc, zzajbVar2.zzd, RoundingMode.DOWN);
                iArr4[i14] = zzei.zzd(jArr, j7, true, true);
                while (true) {
                    i21 = iArr4[i14];
                    if (i21 < 0) {
                        break;
                    }
                    break;
                    break;
                    iArr4[i14] = i21 - 1;
                }
                j8 = j7 + jZzu9;
                iZza2 = zzei.zza(jArr, j8, z3, false);
                iArr5[i14] = iZza2;
                if (zzajbVar2.zzb == 2) {
                    while (true) {
                        iZza2 = iArr5[i14];
                        if (iZza2 < jArr.length - 1) {
                            break;
                            break;
                        }
                        i23 = iZza2 + 1;
                        if (jArr[i23] <= j8) {
                            break;
                            break;
                        }
                        iArr5[i14] = i23;
                    }
                }
                i22 = iArr4[i14];
                int i410 = (iZza2 - i22) + i12;
                if (i20 != i22) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i19 = iZza2;
                z11 = z15 | z12;
                i12 = i410;
            } else {
                i19 = i13;
                z11 = z4;
            }
            i14++;
            z4 = z11;
            i11 = i11;
            i13 = i19;
            iArr = iArr19;
            jArr2 = jArr19;
        }
        boolean z16 = z4;
        jArr7 = jArr2;
        iArr6 = iArr;
        if (i12 != i11) {
            z5 = true;
        } else {
            z5 = false;
        }
        z6 = z16 | z5;
        if (z6) {
            jArr8 = new long[i12];
        } else {
            jArr8 = jArr7;
        }
        if (z6) {
            iArr7 = new int[i12];
        } else {
            iArr7 = iArr6;
        }
        if (true == z6) {
            i8 = 0;
        }
        if (z6) {
            iArr8 = new int[i12];
        } else {
            iArr8 = iArr3;
        }
        jArr9 = new long[i12];
        j5 = 0;
        i15 = 0;
        z7 = false;
        i16 = 0;
        while (i15 < zzajbVar2.zzi.length) {
            j6 = zzajbVar2.zzj[i15];
            i17 = iArr4[i15];
            int[] iArr110 = iArr4;
            i18 = iArr5[i15];
            int[] iArr111 = iArr5;
            if (z6) {
                int i411 = i18 - i17;
                System.arraycopy(jArr7, i17, jArr8, i16, i411);
                iArr9 = iArr6;
                System.arraycopy(iArr9, i17, iArr7, i16, i411);
                System.arraycopy(iArr3, i17, iArr8, i16, i411);
            } else {
                iArr9 = iArr6;
            }
            z9 = z7;
            int[] iArr112 = iArr3;
            int i412 = i8;
            while (i17 < i18) {
                int i413 = i15;
                int[] iArr113 = iArr8;
                long j25 = zzajbVar2.zzd;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jZzu10 = zzei.zzu(j5, 1000000L, j25, roundingMode4);
                long[] jArr110 = jArr;
                int i414 = i18;
                jZzu2 = zzei.zzu(jArr[i17] - j6, 1000000L, zzajbVar2.zzc, roundingMode4);
                if (jZzu2 < 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z9 = (!z10) | z9;
                jArr9[i16] = jZzu10 + jZzu2;
                if (!z6) {
                }
                i16++;
                i17++;
                i18 = i414;
                iArr8 = iArr113;
                i15 = i413;
                jArr = jArr110;
            }
            int i51 = i15;
            j5 += zzajbVar2.zzi[i51];
            i15 = i51 + 1;
            i8 = i412;
            iArr3 = iArr112;
            iArr4 = iArr110;
            iArr8 = iArr8;
            jArr = jArr;
            iArr6 = iArr9;
            z7 = z9;
            iArr5 = iArr111;
        }
        int[] iArr114 = iArr8;
        z8 = z7;
        long jZzu11 = zzei.zzu(j5, 1000000L, zzajbVar2.zzd, RoundingMode.DOWN);
        if (z8) {
            zzz zzzVarZzb3 = zzajbVar2.zzg.zzb();
            zzzVarZzb3.zzJ(true);
            zzajbVarZza = zzajbVar2.zza(zzzVarZzb3.zzag());
        } else {
            zzajbVarZza = zzajbVar2;
        }
        return new zzaje(zzajbVarZza, jArr8, iArr7, i8, jArr9, iArr114, jZzu11);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35771. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzen r72, com.google.android.gms.internal.ads.zzadb r73, long r74, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzu r76, boolean r77, boolean r78, com.google.android.gms.internal.ads.zzfuc r79) throws com.google.android.gms.internal.ads.zzbc {
        /*
            Method dump skipped, instruction units count: 3577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzf(com.google.android.gms.internal.ads.zzen, com.google.android.gms.internal.ads.zzadb, long, com.google.android.gms.internal.ads.zzu, boolean, boolean, com.google.android.gms.internal.ads.zzfuc):java.util.List");
    }

    public static void zzg(zzdy zzdyVar) {
        int iZzd = zzdyVar.zzd();
        zzdyVar.zzM(4);
        if (zzdyVar.zzg() != 1751411826) {
            iZzd += 4;
        }
        zzdyVar.zzL(iZzd);
    }

    private static int zzh(zzdy zzdyVar) {
        int iZzm = zzdyVar.zzm();
        int i = iZzm & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((iZzm & 128) == 128) {
            iZzm = zzdyVar.zzm();
            i = (i << 7) | (iZzm & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i;
    }

    private static int zzi(zzdy zzdyVar) {
        zzdyVar.zzL(16);
        return zzdyVar.zzg();
    }

    @Nullable
    private static Pair zzj(zzdy zzdyVar, int i, int i2) throws zzbc {
        zzajc zzajcVar;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int iZzd = zzdyVar.zzd();
        while (iZzd - i < i2) {
            zzdyVar.zzL(iZzd);
            int iZzg = zzdyVar.zzg();
            zzacr.zzb(iZzg > 0, "childAtomSize must be positive");
            if (zzdyVar.zzg() == 1936289382) {
                int i5 = iZzd + 8;
                int i6 = -1;
                int i7 = 0;
                String strZzB = null;
                Integer numValueOf = null;
                while (i5 - iZzd < iZzg) {
                    zzdyVar.zzL(i5);
                    int iZzg2 = zzdyVar.zzg();
                    int iZzg3 = zzdyVar.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzdyVar.zzg());
                    } else if (iZzg3 == 1935894637) {
                        zzdyVar.zzM(4);
                        strZzB = zzdyVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (iZzg3 == 1935894633) {
                        i6 = i5;
                        i7 = iZzg2;
                    }
                    i5 += iZzg2;
                }
                if (C.CENC_TYPE_cenc.equals(strZzB) || C.CENC_TYPE_cbc1.equals(strZzB) || C.CENC_TYPE_cens.equals(strZzB) || C.CENC_TYPE_cbcs.equals(strZzB)) {
                    zzacr.zzb(numValueOf != null, "frma atom is mandatory");
                    zzacr.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            zzajcVar = null;
                            break;
                        }
                        zzdyVar.zzL(i8);
                        int iZzg4 = zzdyVar.zzg();
                        if (zzdyVar.zzg() == 1952804451) {
                            int iZza = zza(zzdyVar.zzg());
                            zzdyVar.zzM(1);
                            if (iZza == 0) {
                                zzdyVar.zzM(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iZzm = zzdyVar.zzm();
                                int i9 = (iZzm & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                i3 = iZzm & 15;
                                i4 = i9;
                            }
                            boolean z = zzdyVar.zzm() == 1;
                            int iZzm2 = zzdyVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzdyVar.zzH(bArr2, 0, 16);
                            if (z && iZzm2 == 0) {
                                int iZzm3 = zzdyVar.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                zzdyVar.zzH(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            zzajcVar = new zzajc(z, strZzB, iZzm2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iZzg4;
                    }
                    zzacr.zzb(zzajcVar != null, "tenc atom is mandatory");
                    int i10 = zzei.zza;
                    pairCreate = Pair.create(numValueOf, zzajcVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzd += iZzg;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0154  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    private static zzk zzk(zzdy zzdyVar) {
        int i;
        int iZzd;
        int iZzd2;
        zzi zziVar = new zzi();
        byte[] bArrZzN = zzdyVar.zzN();
        zzdx zzdxVar = new zzdx(bArrZzN, bArrZzN.length);
        zzdxVar.zzl(zzdyVar.zzd() * 8);
        zzdxVar.zzo(1);
        int iZzd3 = zzdxVar.zzd(3);
        zzdxVar.zzn(6);
        boolean zZzp = zzdxVar.zzp();
        boolean zZzp2 = zzdxVar.zzp();
        boolean z = false;
        if (iZzd3 != 2) {
            if (iZzd3 <= 2) {
                i = true != zZzp ? 8 : 10;
                zziVar.zzf(i);
                zziVar.zza(i);
            }
        } else if (zZzp) {
            i = true == zZzp2 ? 12 : 10;
            zziVar.zzf(i);
            zziVar.zza(i);
        } else {
            iZzd3 = 2;
            zZzp = false;
            if (iZzd3 <= 2) {
                if (true != zZzp) {
                }
                zziVar.zzf(i);
                zziVar.zza(i);
            }
        }
        int i2 = 13;
        zzdxVar.zzn(13);
        zzdxVar.zzm();
        int iZzd4 = zzdxVar.zzd(4);
        if (iZzd4 != 1) {
            zzdo.zze("BoxParsers", "Unsupported obu_type: " + iZzd4);
            return zziVar.zzg();
        }
        if (zzdxVar.zzp()) {
            zzdo.zze("BoxParsers", "Unsupported obu_extension_flag");
            return zziVar.zzg();
        }
        boolean zZzp3 = zzdxVar.zzp();
        zzdxVar.zzm();
        if (zZzp3 && zzdxVar.zzd(8) > 127) {
            zzdo.zze("BoxParsers", "Excessive obu_size");
            return zziVar.zzg();
        }
        int iZzd5 = zzdxVar.zzd(3);
        zzdxVar.zzm();
        if (zzdxVar.zzp()) {
            zzdo.zze("BoxParsers", "Unsupported reduced_still_picture_header");
            return zziVar.zzg();
        }
        if (zzdxVar.zzp()) {
            zzdo.zze("BoxParsers", "Unsupported timing_info_present_flag");
            return zziVar.zzg();
        }
        if (zzdxVar.zzp()) {
            zzdo.zze("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return zziVar.zzg();
        }
        int iZzd6 = zzdxVar.zzd(5);
        for (int i3 = 0; i3 <= iZzd6; i3++) {
            zzdxVar.zzn(12);
            if (zzdxVar.zzd(5) > 7) {
                zzdxVar.zzm();
            }
        }
        int iZzd7 = zzdxVar.zzd(4);
        int iZzd8 = zzdxVar.zzd(4);
        zzdxVar.zzn(iZzd7 + 1);
        zzdxVar.zzn(iZzd8 + 1);
        if (zzdxVar.zzp()) {
            zzdxVar.zzn(7);
        }
        zzdxVar.zzn(7);
        boolean zZzp4 = zzdxVar.zzp();
        if (zZzp4) {
            zzdxVar.zzn(2);
        }
        if ((zzdxVar.zzp() || zzdxVar.zzd(1) > 0) && !zzdxVar.zzp()) {
            zzdxVar.zzn(1);
        }
        if (zZzp4) {
            zzdxVar.zzn(3);
        }
        zzdxVar.zzn(3);
        boolean zZzp5 = zzdxVar.zzp();
        if (iZzd5 != 2) {
            if (iZzd5 != 1) {
            }
            if (zzdxVar.zzp()) {
                int iZzd9 = zzdxVar.zzd(8);
                iZzd = zzdxVar.zzd(8);
                int iZzd10 = zzdxVar.zzd(8);
                if (z && iZzd9 == 1) {
                    if (iZzd == 13) {
                        if (iZzd10 == 0) {
                            iZzd2 = 1;
                            iZzd9 = 1;
                        }
                        zziVar.zzc(zzk.zza(iZzd9));
                        zziVar.zzb(iZzd2 != 1 ? 2 : 1);
                        zziVar.zzd(zzk.zzb(i2));
                    } else {
                        i2 = iZzd;
                    }
                    iZzd9 = 1;
                } else {
                    i2 = iZzd;
                }
                iZzd2 = zzdxVar.zzd(1);
                zziVar.zzc(zzk.zza(iZzd9));
                zziVar.zzb(iZzd2 != 1 ? 2 : 1);
                zziVar.zzd(zzk.zzb(i2));
            }
            return zziVar.zzg();
        }
        if (zZzp5) {
            zzdxVar.zzm();
        }
        if (zzdxVar.zzp()) {
            z = true;
        }
        if (zzdxVar.zzp()) {
            int iZzd11 = zzdxVar.zzd(8);
            iZzd = zzdxVar.zzd(8);
            int iZzd12 = zzdxVar.zzd(8);
            if (z) {
                i2 = iZzd;
                iZzd2 = zzdxVar.zzd(1);
            } else {
                i2 = iZzd;
                iZzd2 = zzdxVar.zzd(1);
            }
            zziVar.zzc(zzk.zza(iZzd11));
            zziVar.zzb(iZzd2 != 1 ? 2 : 1);
            zziVar.zzd(zzk.zzb(i2));
        }
        return zziVar.zzg();
    }

    @Nullable
    private static zzay zzl(zzdy zzdyVar) {
        short sZzE = zzdyVar.zzE();
        zzdyVar.zzM(2);
        String strZzB = zzdyVar.zzB(sZzE, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzB.lastIndexOf(43), strZzB.lastIndexOf(45));
        try {
            return new zzay(C.TIME_UNSET, new zzet(Float.parseFloat(strZzB.substring(0, iMax)), Float.parseFloat(strZzB.substring(iMax, strZzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaia zzm(zzdy zzdyVar, int i) {
        zzdyVar.zzL(i + 12);
        zzdyVar.zzM(1);
        zzh(zzdyVar);
        zzdyVar.zzM(2);
        int iZzm = zzdyVar.zzm();
        if ((iZzm & 128) != 0) {
            zzdyVar.zzM(2);
        }
        if ((iZzm & 64) != 0) {
            zzdyVar.zzM(zzdyVar.zzm());
        }
        if ((iZzm & 32) != 0) {
            zzdyVar.zzM(2);
        }
        zzdyVar.zzM(1);
        zzh(zzdyVar);
        String strZzd = zzbb.zzd(zzdyVar.zzm());
        if (MimeTypes.AUDIO_MPEG.equals(strZzd) || MimeTypes.AUDIO_DTS.equals(strZzd) || MimeTypes.AUDIO_DTS_HD.equals(strZzd)) {
            return new zzaia(strZzd, null, -1L, -1L);
        }
        zzdyVar.zzM(4);
        long jZzu = zzdyVar.zzu();
        long jZzu2 = zzdyVar.zzu();
        zzdyVar.zzM(1);
        int iZzh = zzh(zzdyVar);
        byte[] bArr = new byte[iZzh];
        zzdyVar.zzH(bArr, 0, iZzh);
        return new zzaia(strZzd, bArr, jZzu2 <= 0 ? -1L : jZzu2, jZzu > 0 ? jZzu : -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:245:0x050a A[PHI: r1 r14 r23
  0x050a: PHI (r1v56 java.lang.String) = (r1v49 java.lang.String), (r1v57 java.lang.String), (r1v49 java.lang.String), (r1v49 java.lang.String) binds: [B:220:0x0473, B:222:0x0481, B:218:0x0449, B:217:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x050a: PHI (r14v7 int) = (r34v1 int), (r34v1 int), (r14v9 int), (r14v10 int) binds: [B:220:0x0473, B:222:0x0481, B:218:0x0449, B:217:0x0445] A[DONT_GENERATE, DONT_INLINE]
  0x050a: PHI (r23v2 com.google.android.gms.internal.ads.zzaia) = 
  (r23v1 com.google.android.gms.internal.ads.zzaia)
  (r23v3 com.google.android.gms.internal.ads.zzaia)
  (r23v1 com.google.android.gms.internal.ads.zzaia)
  (r23v1 com.google.android.gms.internal.ads.zzaia)
 binds: [B:220:0x0473, B:222:0x0481, B:218:0x0449, B:217:0x0445] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:84:0x0149  */
    private static void zzo(zzdy zzdyVar, int i, int i2, int i3, int i4, String str, boolean z, @Nullable zzu zzuVar, zzaif zzaifVar, int i5) throws zzbc {
        int iZzq;
        int iZzg;
        int i6;
        int iZzp;
        int i7;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        String str3;
        boolean z2;
        int i12;
        String str4;
        zzdy zzdyVar2 = zzdyVar;
        int i13 = i2;
        int i14 = i3;
        zzu zzuVarZzb = zzuVar;
        zzdyVar2.zzL(i13 + 16);
        if (z) {
            iZzq = zzdyVar.zzq();
            zzdyVar2.zzM(6);
        } else {
            zzdyVar2.zzM(8);
            iZzq = 0;
        }
        if (iZzq == 0 || iZzq == 1) {
            int iZzq2 = zzdyVar.zzq();
            zzdyVar2.zzM(6);
            int iZzn = zzdyVar.zzn();
            zzdyVar2.zzL(zzdyVar.zzd() - 4);
            iZzg = zzdyVar.zzg();
            if (iZzq == 1) {
                zzdyVar2.zzM(16);
            }
            i6 = iZzn;
            iZzp = iZzq2;
            i7 = -1;
        } else {
            if (iZzq != 2) {
                return;
            }
            zzdyVar2.zzM(16);
            int iRound = (int) Math.round(Double.longBitsToDouble(zzdyVar.zzt()));
            iZzp = zzdyVar.zzp();
            zzdyVar2.zzM(4);
            int iZzp2 = zzdyVar.zzp();
            int iZzp3 = zzdyVar.zzp();
            int i15 = iZzp3 & 1;
            int i16 = iZzp3 & 2;
            if (i15 == 0) {
                if (iZzp2 == 8) {
                    i7 = 3;
                } else if (iZzp2 == 16) {
                    i7 = i16 != 0 ? 268435456 : 2;
                } else if (iZzp2 == 24) {
                    i7 = i16 != 0 ? 1342177280 : 21;
                } else if (iZzp2 == 32) {
                    i7 = i16 != 0 ? 1610612736 : 22;
                } else {
                    i7 = -1;
                }
            } else if (iZzp2 == 32) {
                i7 = 4;
            } else {
                i7 = -1;
            }
            zzdyVar2.zzM(8);
            i6 = iRound;
            iZzg = 0;
        }
        if (i == 1767992678) {
            i6 = -1;
        }
        if (i == 1767992678) {
            iZzp = -1;
        }
        int iZzd = zzdyVar.zzd();
        int iIntValue = 1701733217;
        if (i == 1701733217) {
            Pair pairZzj = zzj(zzdyVar2, i13, i14);
            if (pairZzj != null) {
                iIntValue = ((Integer) pairZzj.first).intValue();
                zzuVarZzb = zzuVarZzb == null ? null : zzuVarZzb.zzb(((zzajc) pairZzj.second).zzb);
                zzaifVar.zza[i5] = (zzajc) pairZzj.second;
            }
            zzdyVar2.zzL(iZzd);
        } else {
            iIntValue = i;
        }
        String str5 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (iIntValue == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else if (iIntValue == 1936684916) {
            str2 = MimeTypes.AUDIO_RAW;
            i7 = 2;
        } else if (iIntValue == 1953984371) {
            str2 = MimeTypes.AUDIO_RAW;
            i7 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i7 == -1) {
                str2 = MimeTypes.AUDIO_RAW;
                i7 = 2;
            } else {
                str2 = MimeTypes.AUDIO_RAW;
            }
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = MimeTypes.AUDIO_MPEG;
        } else if (iIntValue == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str2 = MimeTypes.AUDIO_ALAC;
        } else if (iIntValue == 1634492791) {
            str2 = MimeTypes.AUDIO_ALAW;
        } else if (iIntValue == 1970037111) {
            str2 = MimeTypes.AUDIO_MLAW;
        } else if (iIntValue == 1332770163) {
            str2 = MimeTypes.AUDIO_OPUS;
        } else if (iIntValue == 1716281667) {
            str2 = MimeTypes.AUDIO_FLAC;
        } else if (iIntValue == 1835823201) {
            str2 = MimeTypes.AUDIO_TRUEHD;
        } else {
            str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
        }
        int i17 = i7;
        List listZzo = null;
        zzaia zzaiaVarZzm = null;
        String str6 = null;
        while (iZzd - i13 < i14) {
            zzdyVar2.zzL(iZzd);
            int iZzg2 = zzdyVar.zzg();
            String str7 = "childAtomSize must be positive";
            zzacr.zzb(iZzg2 > 0, "childAtomSize must be positive");
            int iZzg3 = zzdyVar.zzg();
            i6 = i6;
            if (iZzg3 == 1835557187) {
                zzdyVar2.zzL(iZzd + 8);
                zzdyVar2.zzM(1);
                int iZzm = zzdyVar.zzm();
                zzdyVar2.zzM(1);
                if (Objects.equals(str2, str5)) {
                    i12 = 0;
                    str4 = String.format("mhm1.%02X", Integer.valueOf(iZzm));
                } else {
                    i12 = 0;
                    str4 = String.format("mha1.%02X", Integer.valueOf(iZzm));
                }
                int iZzq3 = zzdyVar.zzq();
                byte[] bArr = new byte[iZzq3];
                zzdyVar2.zzH(bArr, i12, iZzq3);
                listZzo = listZzo == null ? zzfxn.zzo(bArr) : zzfxn.zzp(bArr, (byte[]) listZzo.get(i12));
                str6 = str4;
            } else {
                str5 = str5;
                if (iZzg3 == 1835557200) {
                    zzdyVar2.zzL(iZzd + 8);
                    int iZzm2 = zzdyVar.zzm();
                    if (iZzm2 > 0) {
                        byte[] bArr2 = new byte[iZzm2];
                        zzdyVar2.zzH(bArr2, 0, iZzm2);
                        listZzo = listZzo == null ? zzfxn.zzo(bArr2) : zzfxn.zzp((byte[]) listZzo.get(0), bArr2);
                    }
                    i6 = i6;
                    i10 = iZzg;
                    i6 = i6;
                } else {
                    if (iZzg3 == 1702061171) {
                        i8 = iZzd;
                        i9 = -1;
                    } else if (z && iZzg3 == 2002876005) {
                        int iZzd2 = zzdyVar.zzd();
                        if (iZzd2 >= iZzd) {
                            str3 = null;
                            z2 = true;
                        } else {
                            str3 = null;
                            z2 = false;
                        }
                        zzacr.zzb(z2, str3);
                        while (true) {
                            if (iZzd2 - iZzd >= iZzg2) {
                                i8 = -1;
                                i9 = -1;
                                break;
                            }
                            zzdyVar2.zzL(iZzd2);
                            int iZzg4 = zzdyVar.zzg();
                            zzacr.zzb(iZzg4 > 0, str7);
                            String str8 = str7;
                            if (zzdyVar.zzg() == 1702061171) {
                                i8 = iZzd2;
                                i9 = -1;
                                break;
                            } else {
                                iZzd2 += iZzg4;
                                str7 = str8;
                            }
                        }
                    } else {
                        if (iZzg3 == 1684103987) {
                            zzdyVar2.zzL(iZzd + 8);
                            zzaifVar.zzb = zzabn.zzc(zzdyVar2, Integer.toString(i4), str, zzuVarZzb);
                        } else if (iZzg3 == 1684366131) {
                            zzdyVar2.zzL(iZzd + 8);
                            zzaifVar.zzb = zzabn.zzd(zzdyVar2, Integer.toString(i4), str, zzuVarZzb);
                        } else if (iZzg3 == 1684103988) {
                            zzdyVar2.zzL(iZzd + 8);
                            String string = Integer.toString(i4);
                            zzdyVar2.zzM(1);
                            int iZzm3 = zzdyVar.zzm() & 32;
                            zzz zzzVar = new zzz();
                            zzzVar.zzM(string);
                            zzzVar.zzaa("audio/ac4");
                            zzzVar.zzz(2);
                            zzzVar.zzab(1 != (iZzm3 >> 5) ? 44100 : 48000);
                            zzzVar.zzF(zzuVarZzb);
                            zzzVar.zzQ(str);
                            zzaifVar.zzb = zzzVar.zzag();
                        } else if (iZzg3 != 1684892784) {
                            if (iZzg3 == 1684305011 || iZzg3 == 1969517683) {
                                zzz zzzVar2 = new zzz();
                                zzzVar2.zzL(i4);
                                zzzVar2.zzaa(str2);
                                zzzVar2.zzz(iZzp);
                                i6 = i6;
                                zzzVar2.zzab(i6);
                                zzzVar2.zzF(zzuVarZzb);
                                zzzVar2.zzQ(str);
                                zzaifVar.zzb = zzzVar2.zzag();
                            } else if (iZzg3 == 1682927731) {
                                int i18 = iZzg2 - 8;
                                byte[] bArr3 = zzb;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i18);
                                zzdyVar2.zzL(iZzd + 8);
                                zzdyVar2.zzH(bArrCopyOf, bArr3.length, i18);
                                listZzo = zzadi.zze(bArrCopyOf);
                            } else {
                                if (iZzg3 == 1684425825) {
                                    byte[] bArr4 = new byte[iZzg2 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    zzdyVar2.zzL(iZzd + 12);
                                    zzdyVar2.zzH(bArr4, 4, iZzg2 - 12);
                                    listZzo = zzfxn.zzo(bArr4);
                                } else if (iZzg3 == 1634492771) {
                                    int i19 = iZzg2 - 12;
                                    byte[] bArr5 = new byte[i19];
                                    zzdyVar2.zzL(iZzd + 12);
                                    zzdyVar2.zzH(bArr5, 0, i19);
                                    int i20 = zzcy.zza;
                                    zzdy zzdyVar3 = new zzdy(bArr5);
                                    zzdyVar3.zzL(9);
                                    int iZzm4 = zzdyVar3.zzm();
                                    zzdyVar3.zzL(20);
                                    Pair pairCreate = Pair.create(Integer.valueOf(zzdyVar3.zzp()), Integer.valueOf(iZzm4));
                                    int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                    int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                    i6 = iIntValue2;
                                    listZzo = zzfxn.zzo(bArr5);
                                    i10 = iZzg;
                                    iZzp = iIntValue3;
                                } else if (iZzg3 == 1767990114) {
                                    zzdyVar2.zzL(iZzd + 9);
                                    int iZzb = zzgaq.zzb(zzdyVar.zzv());
                                    byte[] bArr6 = new byte[iZzb];
                                    zzdyVar2.zzH(bArr6, 0, iZzb);
                                    listZzo = zzfxn.zzo(bArr6);
                                } else {
                                    i6 = i6;
                                }
                                i6 = i6;
                                i10 = iZzg;
                            }
                            i10 = iZzg;
                            i6 = i6;
                        } else {
                            if (iZzg <= 0) {
                                throw zzbc.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZzg, null);
                            }
                            i6 = iZzg;
                            i10 = i6;
                            iZzp = 2;
                        }
                        i6 = i6;
                        i10 = iZzg;
                        i6 = i6;
                    }
                    if (i8 != i9) {
                        zzaiaVarZzm = zzm(zzdyVar2, i8);
                        str2 = zzaiaVarZzm.zza;
                        byte[] bArr7 = zzaiaVarZzm.zzb;
                        if (bArr7 == null) {
                            i10 = iZzg;
                        } else if (MimeTypes.AUDIO_VORBIS.equals(str2)) {
                            zzdy zzdyVar4 = new zzdy(bArr7);
                            int i21 = 1;
                            zzdyVar4.zzM(1);
                            int i22 = 0;
                            while (true) {
                                if (zzdyVar4.zzb() <= 0) {
                                    i10 = iZzg;
                                    i11 = 255;
                                    break;
                                }
                                i10 = iZzg;
                                i11 = 255;
                                if (zzdyVar4.zzf() != 255) {
                                    break;
                                }
                                zzdyVar4.zzM(i21);
                                i22 += 255;
                                iZzg = i10;
                                i21 = 1;
                            }
                            int iZzm5 = zzdyVar4.zzm() + i22;
                            int i23 = 0;
                            while (zzdyVar4.zzb() > 0 && zzdyVar4.zzf() == i11) {
                                zzdyVar4.zzM(1);
                                i23 += i11;
                            }
                            int iZzm6 = zzdyVar4.zzm() + i23;
                            byte[] bArr8 = new byte[iZzm5];
                            int iZzd3 = zzdyVar4.zzd();
                            System.arraycopy(bArr7, iZzd3, bArr8, 0, iZzm5);
                            int i24 = iZzd3 + iZzm5 + iZzm6;
                            int length = bArr7.length - i24;
                            byte[] bArr9 = new byte[length];
                            System.arraycopy(bArr7, i24, bArr9, 0, length);
                            listZzo = zzfxn.zzp(bArr8, bArr9);
                        } else {
                            i10 = iZzg;
                            if (MimeTypes.AUDIO_AAC.equals(str2)) {
                                zzabi zzabiVarZza = zzabk.zza(bArr7);
                                i6 = zzabiVarZza.zza;
                                iZzp = zzabiVarZza.zzb;
                                str6 = zzabiVarZza.zzc;
                            } else {
                                i6 = i6;
                            }
                            listZzo = zzfxn.zzo(bArr7);
                        }
                        i6 = i6;
                    } else {
                        i10 = iZzg;
                        i6 = i6;
                    }
                }
                iZzd += iZzg2;
                zzdyVar2 = zzdyVar;
                i13 = i2;
                i14 = i3;
                str5 = str5;
                iZzg = i10;
            }
            i10 = iZzg;
            iZzd += iZzg2;
            zzdyVar2 = zzdyVar;
            i13 = i2;
            i14 = i3;
            str5 = str5;
            iZzg = i10;
        }
        int i25 = i6;
        if (zzaifVar.zzb != null || str2 == null) {
            return;
        }
        zzz zzzVar3 = new zzz();
        zzzVar3.zzL(i4);
        zzzVar3.zzaa(str2);
        zzzVar3.zzA(str6);
        zzzVar3.zzz(iZzp);
        zzzVar3.zzab(i25);
        zzzVar3.zzU(i17);
        zzzVar3.zzN(listZzo);
        zzzVar3.zzF(zzuVarZzb);
        zzzVar3.zzQ(str);
        if (zzaiaVarZzm != null) {
            zzzVar3.zzy(zzgaq.zze(zzaiaVarZzm.zzc));
            zzzVar3.zzV(zzgaq.zze(zzaiaVarZzm.zzd));
        }
        zzaifVar.zzb = zzzVar3.zzag();
    }
}
