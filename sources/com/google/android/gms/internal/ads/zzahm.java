package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahm implements zzacn {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;

    @Nullable
    private zzahk zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;

    @Nullable
    private zzdp zzJ;

    @Nullable
    private zzdp zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzacq zzai;
    private final zzahh zzaj;
    private final zzaho zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakd zzk;
    private final zzdy zzl;
    private final zzdy zzm;
    private final zzdy zzn;
    private final zzdy zzo;
    private final zzdy zzp;
    private final zzdy zzq;
    private final zzdy zzr;
    private final zzdy zzs;
    private final zzdy zzt;
    private final zzdy zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzei.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC3950lJ.y(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC3950lJ.y(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzf = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzahm() {
        this(new zzahh(), 2, zzakd.zza);
    }

    private final int zzp(zzaco zzacoVar, zzahk zzahkVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzahkVar.zzb)) {
            zzx(zzacoVar, zza, i);
            int i3 = this.zzaa;
            zzw();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzahkVar.zzb)) {
            zzx(zzacoVar, zzc, i);
            int i4 = this.zzaa;
            zzw();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzahkVar.zzb)) {
            zzx(zzacoVar, zzd, i);
            int i5 = this.zzaa;
            zzw();
            return i5;
        }
        zzadt zzadtVar = zzahkVar.zzW;
        if (!this.zzac) {
            if (zzahkVar.zzg) {
                this.zzV &= -1073741825;
                if (!this.zzad) {
                    zzacoVar.zzi(this.zzn.zzN(), 0, 1);
                    this.zzZ++;
                    if ((this.zzn.zzN()[0] & 128) == 128) {
                        throw zzbc.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzN()[0];
                    this.zzad = true;
                }
                byte b = this.zzag;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzV |= 1073741824;
                    if (!this.zzah) {
                        zzacoVar.zzi(this.zzs.zzN(), 0, 8);
                        this.zzZ += 8;
                        this.zzah = true;
                        this.zzn.zzN()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.zzn.zzL(0);
                        zzadtVar.zzs(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzL(0);
                        zzadtVar.zzs(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzae) {
                            zzacoVar.zzi(this.zzn.zzN(), 0, 1);
                            this.zzZ++;
                            this.zzn.zzL(0);
                            this.zzaf = this.zzn.zzm();
                            this.zzae = true;
                        }
                        int i7 = this.zzaf * 4;
                        this.zzn.zzI(i7);
                        zzacoVar.zzi(this.zzn.zzN(), 0, i7);
                        this.zzZ += i7;
                        int i8 = (this.zzaf >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzv = ByteBuffer.allocate(i9);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzaf;
                            if (i10 >= i2) {
                                break;
                            }
                            int iZzp = this.zzn.zzp();
                            int i12 = iZzp - i11;
                            if (i10 % 2 == 0) {
                                this.zzv.putShort((short) i12);
                            } else {
                                this.zzv.putInt(i12);
                            }
                            i10++;
                            i11 = iZzp;
                        }
                        int i13 = (i - this.zzZ) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzv.putInt(i13);
                        } else {
                            this.zzv.putShort((short) i13);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzJ(this.zzv.array(), i9);
                        zzadtVar.zzs(this.zzt, i9, 1);
                        this.zzaa += i9;
                    }
                }
            } else {
                byte[] bArr = zzahkVar.zzh;
                if (bArr != null) {
                    this.zzq.zzJ(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahkVar.zzb) ? zzahkVar.zzf > 0 : z) {
                this.zzV |= 268435456;
                this.zzu.zzI(0);
                int iZze = (this.zzq.zze() + i) - this.zzZ;
                this.zzn.zzI(4);
                this.zzn.zzN()[0] = (byte) ((iZze >> 24) & 255);
                this.zzn.zzN()[1] = (byte) ((iZze >> 16) & 255);
                this.zzn.zzN()[2] = (byte) ((iZze >> 8) & 255);
                this.zzn.zzN()[3] = (byte) (iZze & 255);
                zzadtVar.zzs(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int iZze2 = this.zzq.zze() + i;
        if (!"V_MPEG4/ISO/AVC".equals(zzahkVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahkVar.zzb)) {
            if (zzahkVar.zzT != null) {
                zzcw.zzf(this.zzq.zze() == 0);
                zzahkVar.zzT.zzd(zzacoVar);
            }
            while (true) {
                int i14 = this.zzZ;
                if (i14 >= iZze2) {
                    break;
                }
                int iZzq = zzq(zzacoVar, zzadtVar, iZze2 - i14);
                this.zzZ += iZzq;
                this.zzaa += iZzq;
            }
        } else {
            byte[] bArrZzN = this.zzm.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i15 = zzahkVar.zzX;
            int i16 = 4 - i15;
            while (this.zzZ < iZze2) {
                int i17 = this.zzab;
                if (i17 == 0) {
                    int iMin = Math.min(i15, this.zzq.zzb());
                    zzacoVar.zzi(bArrZzN, i16 + iMin, i15 - iMin);
                    if (iMin > 0) {
                        this.zzq.zzH(bArrZzN, i16, iMin);
                    }
                    this.zzZ += i15;
                    this.zzm.zzL(0);
                    this.zzab = this.zzm.zzp();
                    this.zzl.zzL(0);
                    zzadtVar.zzr(this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int iZzq2 = zzq(zzacoVar, zzadtVar, i17);
                    this.zzZ += iZzq2;
                    this.zzaa += iZzq2;
                    this.zzab -= iZzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahkVar.zzb)) {
            this.zzo.zzL(0);
            zzadtVar.zzr(this.zzo, 4);
            this.zzaa += 4;
        }
        int i18 = this.zzaa;
        zzw();
        return i18;
    }

    private final int zzq(zzaco zzacoVar, zzadt zzadtVar, int i) throws IOException {
        int iZzb = this.zzq.zzb();
        if (iZzb <= 0) {
            return zzadtVar.zzf(zzacoVar, i, false);
        }
        int iMin = Math.min(i, iZzb);
        zzadtVar.zzr(this.zzq, iMin);
        return iMin;
    }

    private final long zzr(long j) throws zzbc {
        long j2 = this.zzy;
        if (j2 != C.TIME_UNSET) {
            return zzei.zzu(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzbc.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i) throws zzbc {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbc.zza("Element " + i + " must be in a Cues", null);
        }
    }

    private final void zzt(int i) throws zzbc {
        if (this.zzB != null) {
            return;
        }
        throw zzbc.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    private final void zzu(zzahk zzahkVar, long j, int i, int i2, int i3) {
        byte b;
        byte[] bArrZzy;
        int i4;
        int iZze;
        zzadu zzaduVar = zzahkVar.zzT;
        if (zzaduVar != null) {
            zzaduVar.zzc(zzahkVar.zzW, j, i, i2, i3, zzahkVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzahkVar.zzb) || "S_TEXT/ASS".equals(zzahkVar.zzb) || "S_TEXT/WEBVTT".equals(zzahkVar.zzb)) {
                if (this.zzR > 1) {
                    zzdo.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzP;
                    if (j2 == C.TIME_UNSET) {
                        zzdo.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzahkVar.zzb;
                        byte[] bArrZzN = this.zzr.zzN();
                        int iHashCode = str.hashCode();
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            bArrZzy = zzy(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (b == 1) {
                            bArrZzy = zzy(j2, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
                            i4 = 21;
                        } else {
                            if (b != 2) {
                                throw new IllegalArgumentException();
                            }
                            bArrZzy = zzy(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        System.arraycopy(bArrZzy, 0, bArrZzN, i4, bArrZzy.length);
                        for (int iZzd = this.zzr.zzd(); iZzd < this.zzr.zze(); iZzd++) {
                            if (this.zzr.zzN()[iZzd] == 0) {
                                this.zzr.zzK(iZzd);
                                break;
                            }
                        }
                        zzadt zzadtVar = zzahkVar.zzW;
                        zzdy zzdyVar = this.zzr;
                        zzadtVar.zzr(zzdyVar, zzdyVar.zze());
                        iZze = this.zzr.zze() + i2;
                    }
                }
                iZze = i2;
            } else {
                iZze = i2;
            }
            if ((i & 268435456) != 0) {
                if (this.zzR > 1) {
                    this.zzu.zzI(0);
                } else {
                    int iZze2 = this.zzu.zze();
                    zzahkVar.zzW.zzs(this.zzu, iZze2, 2);
                    iZze += iZze2;
                }
            }
            zzahkVar.zzW.zzt(j, i, iZze, i3, zzahkVar.zzi);
        }
        this.zzM = true;
    }

    private final void zzv(zzaco zzacoVar, int i) throws IOException {
        if (this.zzn.zze() >= i) {
            return;
        }
        if (this.zzn.zzc() < i) {
            zzdy zzdyVar = this.zzn;
            int iZzc = zzdyVar.zzc();
            zzdyVar.zzF(Math.max(iZzc + iZzc, i));
        }
        zzdy zzdyVar2 = this.zzn;
        zzacoVar.zzi(zzdyVar2.zzN(), zzdyVar2.zze(), i - zzdyVar2.zze());
        this.zzn.zzK(i);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzaco zzacoVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzc() < i2) {
            zzdy zzdyVar = this.zzr;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzdyVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzN(), 0, length);
        }
        zzacoVar.zzi(this.zzr.zzN(), length, i);
        this.zzr.zzL(0);
        this.zzr.zzK(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzcw.zzd(j != C.TIME_UNSET);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = zzei.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzaj.zzc(zzacoVar)) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    zzahk zzahkVar = (zzahk) this.zzh.valueAt(i);
                    zzahkVar.zzW.getClass();
                    zzadu zzaduVar = zzahkVar.zzT;
                    if (zzaduVar != null) {
                        zzaduVar.zza(zzahkVar.zzW, zzahkVar.zzi);
                    }
                }
                return -1;
            }
            long jZzf = zzacoVar.zzf();
            if (this.zzF) {
                this.zzH = jZzf;
                zzadjVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzadjVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        if (this.zzj) {
            zzacqVar = new zzakg(zzacqVar, this.zzk);
        }
        this.zzai = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    @CallSuper
    public final void zzf(long j, long j2) {
        this.zzI = C.TIME_UNSET;
        this.zzN = 0;
        this.zzaj.zzb();
        this.zzg.zze();
        zzw();
        for (int i = 0; i < this.zzh.size(); i++) {
            zzadu zzaduVar = ((zzahk) this.zzh.valueAt(i)).zzT;
            if (zzaduVar != null) {
                zzaduVar.zzb();
            }
        }
    }

    @CallSuper
    public final void zzh(int i, int i2, zzaco zzacoVar) throws IOException {
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        Throwable th = null;
        int i9 = 1;
        if (i8 != 161 && i8 != 163) {
            if (i8 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzahk zzahkVar = (zzahk) this.zzh.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzahkVar.zzb)) {
                    zzacoVar.zzk(i2);
                    return;
                } else {
                    this.zzu.zzI(i2);
                    zzacoVar.zzi(this.zzu.zzN(), 0, i2);
                    return;
                }
            }
            if (i8 == 16877) {
                zzt(i);
                zzahk zzahkVar2 = this.zzB;
                if (zzahkVar2.zzY != 1685485123 && zzahkVar2.zzY != 1685480259) {
                    zzacoVar.zzk(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                zzahkVar2.zzN = bArr;
                zzacoVar.zzi(bArr, 0, i2);
                return;
            }
            if (i8 == 16981) {
                zzt(i);
                byte[] bArr2 = new byte[i2];
                this.zzB.zzh = bArr2;
                zzacoVar.zzi(bArr2, 0, i2);
                return;
            }
            if (i8 == 18402) {
                byte[] bArr3 = new byte[i2];
                zzacoVar.zzi(bArr3, 0, i2);
                zzt(i);
                this.zzB.zzi = new zzads(1, bArr3, 0, 0);
                return;
            }
            if (i8 == 21419) {
                Arrays.fill(this.zzp.zzN(), (byte) 0);
                zzacoVar.zzi(this.zzp.zzN(), 4 - i2, i2);
                this.zzp.zzL(0);
                this.zzD = (int) this.zzp.zzu();
                return;
            }
            if (i8 == 25506) {
                zzt(i);
                byte[] bArr4 = new byte[i2];
                this.zzB.zzj = bArr4;
                zzacoVar.zzi(bArr4, 0, i2);
                return;
            }
            if (i8 != 30322) {
                throw zzbc.zza("Unexpected id: " + i8, null);
            }
            zzt(i);
            byte[] bArr5 = new byte[i2];
            this.zzB.zzv = bArr5;
            zzacoVar.zzi(bArr5, 0, i2);
            return;
        }
        if (this.zzN == 0) {
            this.zzT = (int) this.zzg.zzd(zzacoVar, false, true, 8);
            this.zzU = this.zzg.zza();
            this.zzP = C.TIME_UNSET;
            this.zzN = 1;
            this.zzn.zzI(0);
        }
        zzahk zzahkVar3 = (zzahk) this.zzh.get(this.zzT);
        if (zzahkVar3 == null) {
            zzacoVar.zzk(i2 - this.zzU);
            this.zzN = 0;
            return;
        }
        zzahkVar3.zzW.getClass();
        if (this.zzN == 1) {
            zzv(zzacoVar, 3);
            int i10 = (this.zzn.zzN()[2] & 6) >> 1;
            byte b = 255;
            if (i10 == 0) {
                this.zzR = 1;
                int[] iArrZzz = zzz(this.zzS, 1);
                this.zzS = iArrZzz;
                iArrZzz[0] = (i2 - this.zzU) - 3;
            } else {
                zzv(zzacoVar, 4);
                int i11 = (this.zzn.zzN()[3] & 255) + 1;
                this.zzR = i11;
                int[] iArrZzz2 = zzz(this.zzS, i11);
                this.zzS = iArrZzz2;
                if (i10 == 2) {
                    int i12 = (i2 - this.zzU) - 4;
                    int i13 = this.zzR;
                    Arrays.fill(iArrZzz2, 0, i13, i12 / i13);
                } else if (i10 == 1) {
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 4;
                    while (true) {
                        i4 = this.zzR - 1;
                        if (i14 >= i4) {
                            break;
                        }
                        this.zzS[i14] = 0;
                        while (true) {
                            i5 = i16 + 1;
                            zzv(zzacoVar, i5);
                            int i17 = this.zzn.zzN()[i16] & 255;
                            int[] iArr = this.zzS;
                            i6 = iArr[i14] + i17;
                            iArr[i14] = i6;
                            if (i17 != 255) {
                                break;
                            } else {
                                i16 = i5;
                            }
                        }
                        i15 += i6;
                        i14++;
                        i16 = i5;
                    }
                    this.zzS[i4] = ((i2 - this.zzU) - i16) - i15;
                } else {
                    if (i10 != 3) {
                        throw zzbc.zza("Unexpected lacing value: 2", null);
                    }
                    int i18 = 0;
                    int i19 = 4;
                    int i20 = 0;
                    while (true) {
                        int i21 = this.zzR - 1;
                        if (i18 >= i21) {
                            this.zzS[i21] = ((i2 - this.zzU) - i19) - i20;
                            break;
                        }
                        this.zzS[i18] = 0;
                        int i22 = i19 + 1;
                        zzv(zzacoVar, i22);
                        if (this.zzn.zzN()[i19] == 0) {
                            throw zzbc.zza("No valid varint length mask found", th);
                        }
                        int i23 = 0;
                        while (true) {
                            if (i23 >= 8) {
                                j = 0;
                                i3 = i22;
                                break;
                            }
                            int i24 = i9 << (7 - i23);
                            if ((this.zzn.zzN()[i19] & i24) != 0) {
                                int i25 = i22 + i23;
                                zzv(zzacoVar, i25);
                                j = this.zzn.zzN()[i19] & b & (~i24);
                                int i26 = i19 + 1;
                                while (i26 < i25) {
                                    j = (j << 8) | ((long) (this.zzn.zzN()[i26] & b));
                                    i26++;
                                    i25 = i25;
                                    b = 255;
                                }
                                i3 = i25;
                                if (i18 <= 0) {
                                    break;
                                }
                                j -= (1 << ((i23 * 7) + 6)) - 1;
                                break;
                            }
                            i23++;
                            i9 = 1;
                            b = 255;
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            throw zzbc.zza("EBML lacing sample size out of range.", null);
                        }
                        int[] iArr2 = this.zzS;
                        int i27 = (int) j;
                        if (i18 != 0) {
                            i27 += iArr2[i18 - 1];
                        }
                        iArr2[i18] = i27;
                        i20 += i27;
                        i18++;
                        i19 = i3;
                        th = null;
                        i9 = 1;
                        b = 255;
                    }
                }
            }
            this.zzO = this.zzI + zzr((this.zzn.zzN()[0] << 8) | (this.zzn.zzN()[1] & 255));
            if (zzahkVar3.zzd == 2) {
                i7 = 1;
            } else {
                if (i8 == 163) {
                    if ((this.zzn.zzN()[2] & 128) == 128) {
                        i8 = Input.Keys.NUMPAD_RIGHT_PAREN;
                        i7 = 1;
                    } else {
                        i8 = Input.Keys.NUMPAD_RIGHT_PAREN;
                    }
                }
                i7 = 0;
            }
            this.zzV = i7;
            this.zzN = 2;
            this.zzQ = 0;
        }
        if (i8 == 163) {
            while (true) {
                int i28 = this.zzQ;
                if (i28 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzu(zzahkVar3, ((long) ((this.zzQ * zzahkVar3.zze) / 1000)) + this.zzO, this.zzV, zzp(zzacoVar, zzahkVar3, this.zzS[i28], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i29 = this.zzQ;
                if (i29 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i29] = zzp(zzacoVar, zzahkVar3, iArr3[i29], true);
                this.zzQ++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        return new zzahn().zza(zzacoVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:186:0x030c  */
    @CallSuper
    public final void zzj(int i) throws zzbc {
        int i2;
        zzadm zzadlVar;
        int i3;
        int i4 = 0;
        zzcw.zzb(this.zzai);
        if (i == 160) {
            if (this.zzN == 2) {
                zzahk zzahkVar = (zzahk) this.zzh.get(this.zzT);
                zzahkVar.zzW.getClass();
                if (this.zzY > 0 && "A_OPUS".equals(zzahkVar.zzb)) {
                    zzdy zzdyVar = this.zzu;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                    zzdyVar.zzJ(bArrArray, bArrArray.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzR; i6++) {
                    i5 += this.zzS[i6];
                }
                int i7 = 0;
                while (i7 < this.zzR) {
                    long j = this.zzO + ((long) ((zzahkVar.zze * i7) / 1000));
                    int i8 = this.zzV;
                    if (i7 == 0) {
                        if (!this.zzX) {
                            i8 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i7;
                    }
                    int i9 = this.zzS[i2];
                    int i10 = i5 - i9;
                    zzu(zzahkVar, j, i8, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzN = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzD;
                if (i11 != -1) {
                    long j2 = this.zzE;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzG = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzbc.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzt(i);
                zzahk zzahkVar2 = this.zzB;
                if (zzahkVar2.zzg) {
                    if (zzahkVar2.zzi == null) {
                        throw zzbc.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzahkVar2.zzk = new zzu(null, new zzt(zzh.zza, null, "video/webm", this.zzB.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzt(i);
                zzahk zzahkVar3 = this.zzB;
                if (zzahkVar3.zzg && zzahkVar3.zzh != null) {
                    throw zzbc.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzy == C.TIME_UNSET) {
                    this.zzy = 1000000L;
                }
                long j3 = this.zzz;
                if (j3 != C.TIME_UNSET) {
                    this.zzA = zzr(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzh.size() == 0) {
                    throw zzbc.zza("No valid tracks were found", null);
                }
                this.zzai.zzD();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzC) {
                zzacq zzacqVar = this.zzai;
                zzdp zzdpVar = this.zzJ;
                zzdp zzdpVar2 = this.zzK;
                if (this.zzx == -1 || this.zzA == C.TIME_UNSET || zzdpVar == null || zzdpVar.zza() == 0 || zzdpVar2 == null || zzdpVar2.zza() != zzdpVar.zza()) {
                    zzadlVar = new zzadl(this.zzA, 0L);
                } else {
                    int iZza = zzdpVar.zza();
                    int[] iArrCopyOf = new int[iZza];
                    long[] jArrCopyOf = new long[iZza];
                    long[] jArrCopyOf2 = new long[iZza];
                    long[] jArrCopyOf3 = new long[iZza];
                    for (int i12 = 0; i12 < iZza; i12++) {
                        jArrCopyOf3[i12] = zzdpVar.zzb(i12);
                        jArrCopyOf[i12] = zzdpVar2.zzb(i12) + this.zzx;
                    }
                    while (true) {
                        i3 = iZza - 1;
                        if (i4 >= i3) {
                            break;
                        }
                        int i13 = i4 + 1;
                        iArrCopyOf[i4] = (int) (jArrCopyOf[i13] - jArrCopyOf[i4]);
                        jArrCopyOf2[i4] = jArrCopyOf3[i13] - jArrCopyOf3[i4];
                        i4 = i13;
                    }
                    iArrCopyOf[i3] = (int) ((this.zzx + this.zzw) - jArrCopyOf[i3]);
                    long j4 = this.zzA - jArrCopyOf3[i3];
                    jArrCopyOf2[i3] = j4;
                    if (j4 <= 0) {
                        zzdo.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i3);
                    }
                    zzadlVar = new zzaca(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzacqVar.zzO(zzadlVar);
                this.zzC = true;
            }
            this.zzJ = null;
            this.zzK = null;
            return;
        }
        zzahk zzahkVar4 = this.zzB;
        zzcw.zzb(zzahkVar4);
        String str = zzahkVar4.zzb;
        if (str == null) {
            throw zzbc.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    i4 = 6;
                } else {
                    i4 = -1;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    i4 = 4;
                } else {
                    i4 = -1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    i4 = 23;
                } else {
                    i4 = -1;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    i4 = 18;
                } else {
                    i4 = -1;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    i4 = 12;
                } else {
                    i4 = -1;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    i4 = 14;
                } else {
                    i4 = -1;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    i4 = 15;
                } else {
                    i4 = -1;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    i4 = 9;
                } else {
                    i4 = -1;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    i4 = 32;
                } else {
                    i4 = -1;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    i4 = 5;
                } else {
                    i4 = -1;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    i4 = 7;
                } else {
                    i4 = -1;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    i4 = 30;
                } else {
                    i4 = -1;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    i4 = 21;
                } else {
                    i4 = -1;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    i4 = 13;
                } else {
                    i4 = -1;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    i4 = 16;
                } else {
                    i4 = -1;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    i4 = 19;
                } else {
                    i4 = -1;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    i4 = 2;
                } else {
                    i4 = -1;
                }
                break;
            case 82338133:
                if (!str.equals("V_VP8")) {
                    i4 = -1;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    i4 = 31;
                } else {
                    i4 = -1;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    i4 = 10;
                } else {
                    i4 = -1;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    i4 = 20;
                } else {
                    i4 = -1;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    i4 = 26;
                } else {
                    i4 = -1;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    i4 = 25;
                } else {
                    i4 = -1;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    i4 = 24;
                } else {
                    i4 = -1;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    i4 = 28;
                } else {
                    i4 = -1;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    i4 = 8;
                } else {
                    i4 = -1;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    i4 = 29;
                } else {
                    i4 = -1;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    i4 = 27;
                } else {
                    i4 = -1;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    i4 = 3;
                } else {
                    i4 = -1;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    i4 = 17;
                } else {
                    i4 = -1;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    i4 = 22;
                } else {
                    i4 = -1;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    i4 = 11;
                } else {
                    i4 = -1;
                }
                break;
            default:
                i4 = -1;
                break;
        }
        switch (i4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                zzahkVar4.zze(this.zzai, zzahkVar4.zzc);
                this.zzh.put(zzahkVar4.zzc, zzahkVar4);
                break;
        }
        this.zzB = null;
    }

    @CallSuper
    public final void zzk(int i, double d) throws zzbc {
        if (i == 181) {
            zzt(i);
            this.zzB.zzQ = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzz = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzt(i);
                this.zzB.zzD = (float) d;
                break;
            case 21970:
                zzt(i);
                this.zzB.zzE = (float) d;
                break;
            case 21971:
                zzt(i);
                this.zzB.zzF = (float) d;
                break;
            case 21972:
                zzt(i);
                this.zzB.zzG = (float) d;
                break;
            case 21973:
                zzt(i);
                this.zzB.zzH = (float) d;
                break;
            case 21974:
                zzt(i);
                this.zzB.zzI = (float) d;
                break;
            case 21975:
                zzt(i);
                this.zzB.zzJ = (float) d;
                break;
            case 21976:
                zzt(i);
                this.zzB.zzK = (float) d;
                break;
            case 21977:
                zzt(i);
                this.zzB.zzL = (float) d;
                break;
            case 21978:
                zzt(i);
                this.zzB.zzM = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzt(i);
                        this.zzB.zzs = (float) d;
                        break;
                    case 30324:
                        zzt(i);
                        this.zzB.zzt = (float) d;
                        break;
                    case 30325:
                        zzt(i);
                        this.zzB.zzu = (float) d;
                        break;
                }
                break;
        }
    }

    @CallSuper
    public final void zzl(int i, long j) throws zzbc {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzbc.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzbc.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                zzt(i);
                this.zzB.zzd = (int) j;
                return;
            case 136:
                z = j == 1;
                zzt(i);
                this.zzB.zzV = z;
                return;
            case Input.Keys.NUMPAD_MULTIPLY /* 155 */:
                this.zzP = zzr(j);
                return;
            case Input.Keys.NUMPAD_COMMA /* 159 */:
                zzt(i);
                this.zzB.zzO = (int) j;
                return;
            case 176:
                zzt(i);
                this.zzB.zzl = (int) j;
                return;
            case 179:
                zzs(i);
                this.zzJ.zzc(zzr(j));
                return;
            case Input.Keys.F16 /* 186 */:
                zzt(i);
                this.zzB.zzm = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzt(i);
                this.zzB.zzc = (int) j;
                return;
            case 231:
                this.zzI = zzr(j);
                return;
            case 238:
                this.zzW = (int) j;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzs(i);
                this.zzK.zzc(j);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzt(i);
                this.zzB.zzY = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzbc.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzbc.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzbc.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzbc.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzbc.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzE = j + this.zzx;
                return;
            case 21432:
                int i2 = (int) j;
                zzt(i);
                if (i2 == 0) {
                    this.zzB.zzw = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzB.zzw = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzB.zzw = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzB.zzw = 3;
                    return;
                }
            case 21680:
                zzt(i);
                this.zzB.zzo = (int) j;
                return;
            case 21682:
                zzt(i);
                this.zzB.zzq = (int) j;
                return;
            case 21690:
                zzt(i);
                this.zzB.zzp = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzt(i);
                this.zzB.zzU = z;
                return;
            case 21938:
                zzt(i);
                zzahk zzahkVar = this.zzB;
                zzahkVar.zzx = true;
                zzahkVar.zzn = (int) j;
                return;
            case 21998:
                zzt(i);
                this.zzB.zzf = (int) j;
                return;
            case 22186:
                zzt(i);
                this.zzB.zzR = j;
                return;
            case 22203:
                zzt(i);
                this.zzB.zzS = j;
                return;
            case 25188:
                zzt(i);
                this.zzB.zzP = (int) j;
                return;
            case 30114:
                this.zzY = j;
                return;
            case 30321:
                int i3 = (int) j;
                zzt(i);
                if (i3 == 0) {
                    this.zzB.zzr = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzB.zzr = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzB.zzr = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzB.zzr = 3;
                    return;
                }
            case 2352003:
                zzt(i);
                this.zzB.zze = (int) j;
                return;
            case 2807729:
                this.zzy = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        zzt(i);
                        if (i4 == 1) {
                            this.zzB.zzA = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzB.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzt(i);
                        int iZzb = zzk.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzB.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzt(i);
                        this.zzB.zzx = true;
                        int iZza = zzk.zza((int) j);
                        if (iZza != -1) {
                            this.zzB.zzy = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzt(i);
                        this.zzB.zzB = (int) j;
                        return;
                    case 21949:
                        zzt(i);
                        this.zzB.zzC = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public final void zzm(int i, long j, long j2) throws zzbc {
        zzcw.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i == 174) {
            this.zzB = new zzahk();
            return;
        }
        if (i == 187) {
            this.zzL = false;
            return;
        }
        if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i == 20533) {
            zzt(i);
            this.zzB.zzg = true;
            return;
        }
        if (i == 21968) {
            zzt(i);
            this.zzB.zzx = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzbc.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
            return;
        }
        if (i == 475249515) {
            this.zzJ = new zzdp(32);
            this.zzK = new zzdp(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzi && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzO(new zzadl(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    @CallSuper
    public final void zzn(int i, String str) throws zzbc {
        if (i == 134) {
            zzt(i);
            this.zzB.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbc.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzt(i);
            this.zzB.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzt(i);
            this.zzB.zzZ = str;
        }
    }

    public zzahm(zzahh zzahhVar, int i, zzakd zzakdVar) {
        this.zzx = -1L;
        this.zzy = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = C.TIME_UNSET;
        this.zzaj = zzahhVar;
        zzahhVar.zza(new zzahj(this, null));
        this.zzk = zzakdVar;
        this.zzi = 1 == ((i & 1) ^ 1);
        this.zzj = (i & 2) == 0;
        this.zzg = new zzaho();
        this.zzh = new SparseArray();
        this.zzn = new zzdy(4);
        this.zzo = new zzdy(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzdy(4);
        this.zzl = new zzdy(zzfk.zza);
        this.zzm = new zzdy(4);
        this.zzq = new zzdy();
        this.zzr = new zzdy();
        this.zzs = new zzdy(8);
        this.zzt = new zzdy();
        this.zzu = new zzdy();
        this.zzS = new int[1];
    }

    public zzahm(zzakd zzakdVar, int i) {
        this(new zzahh(), 0, zzakdVar);
    }
}
