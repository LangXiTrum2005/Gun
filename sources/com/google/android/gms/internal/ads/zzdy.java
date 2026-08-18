package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdy {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfxs zzc = zzfxs.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzdy(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
    }

    private final char zzO(Charset charset, char[] cArr) {
        int iZzP = zzP(charset);
        if (iZzP != 0) {
            int i = iZzP >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.zze += (char) iZzP;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private final int zzP(Charset charset) {
        byte bZza;
        int i;
        int i2;
        char cZzb;
        int i3;
        int i4;
        int i5 = 1;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            int i6 = this.zzf;
            int i7 = this.zze;
            if (i6 - i7 > 0) {
                bZza = (byte) zzgan.zza(this.zzd[i7] & 255);
            } else {
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    i = this.zzf;
                    i2 = this.zze;
                    if (i - i2 >= 2) {
                        byte[] bArr = this.zzd;
                        cZzb = zzgan.zzb(bArr[i2], bArr[i2 + 1]);
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            return 0;
                        }
                        i3 = this.zzf;
                        i4 = this.zze;
                        if (i3 - i4 >= 2) {
                            return 0;
                        }
                        byte[] bArr2 = this.zzd;
                        cZzb = zzgan.zzb(bArr2[i4 + 1], bArr2[i4]);
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i3 = this.zzf;
                    i4 = this.zze;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr3 = this.zzd;
                    cZzb = zzgan.zzb(bArr3[i4 + 1], bArr3[i4]);
                }
                bZza = (byte) cZzb;
                i5 = 2;
            }
        } else {
            if (charset.equals(StandardCharsets.UTF_16)) {
                i = this.zzf;
                i2 = this.zze;
                if (i - i2 >= 2) {
                    byte[] bArr4 = this.zzd;
                    cZzb = zzgan.zzb(bArr4[i2], bArr4[i2 + 1]);
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i3 = this.zzf;
                    i4 = this.zze;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr5 = this.zzd;
                    cZzb = zzgan.zzb(bArr5[i4 + 1], bArr5[i4]);
                }
            } else {
                i = this.zzf;
                i2 = this.zze;
                if (i - i2 >= 2) {
                    byte[] bArr6 = this.zzd;
                    cZzb = zzgan.zzb(bArr6[i2], bArr6[i2 + 1]);
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i3 = this.zzf;
                    i4 = this.zze;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr7 = this.zzd;
                    cZzb = zzgan.zzb(bArr7[i4 + 1], bArr7[i4]);
                }
            }
            bZza = (byte) cZzb;
            i5 = 2;
        }
        return (zzgan.zza(bZza) << 16) + i5;
    }

    public final String zzA(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.zze;
        int i3 = (i2 + i) - 1;
        String strZzC = zzei.zzC(this.zzd, i2, (i3 >= this.zzf || this.zzd[i3] != 0) ? i : i - 1);
        this.zze += i;
        return strZzC;
    }

    public final String zzB(int i, Charset charset) {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        String str = new String(bArr, i2, i, charset);
        this.zze = i2 + i;
        return str;
    }

    @Nullable
    public final Charset zzC() {
        int i = this.zzf;
        int i2 = this.zze;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.zze = i2 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.zzd;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.zze = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.zze = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zze = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zze = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final void zzF(int i) {
        byte[] bArr = this.zzd;
        if (i > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i);
        }
    }

    public final void zzG(zzdx zzdxVar, int i) {
        zzH(zzdxVar.zza, 0, i);
        zzdxVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzd, this.zze, bArr, i, i2);
        this.zze += i2;
    }

    public final void zzI(int i) {
        byte[] bArr = this.zzd;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzJ(bArr, i);
    }

    public final void zzJ(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
        this.zze = 0;
    }

    public final void zzK(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzd.length) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzf = i;
    }

    public final void zzL(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzf) {
            z = true;
        }
        zzcw.zzd(z);
        this.zze = i;
    }

    public final void zzM(int i) {
        zzL(this.zze + i);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzcw.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (zzP(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = i + 3;
        int i5 = bArr[i + 2] & 255;
        this.zze = i + 4;
        return (bArr[i4] & 255) | (i2 << 24) | (i3 << 16) | (i5 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = bArr[i] & 255;
        int i3 = i + 2;
        int i4 = bArr[i + 1] & 255;
        this.zze = i + 3;
        return (bArr[i3] & 255) | ((i2 << 24) >> 8) | (i4 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        this.zze = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final int zzj() {
        int iZzi = zzi();
        if (iZzi >= 0) {
            return iZzi;
        }
        throw new IllegalStateException(AbstractC3950lJ.p("Top bit not zero: ", iZzi));
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zze = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        this.zze = i + 1;
        return bArr[i] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        this.zze = i + 4;
        return i3 | (i2 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = bArr[i] & 255;
        int i3 = i + 2;
        int i4 = bArr[i + 1] & 255;
        this.zze = i + 3;
        return (bArr[i3] & 255) | (i2 << 16) | (i4 << 8);
    }

    public final int zzp() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException(AbstractC3950lJ.p("Top bit not zero: ", iZzg));
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zze = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        long j7 = bArr[i + 6];
        this.zze = i + 8;
        long j8 = j6 & 255;
        return ((((long) bArr[i + 7]) & 255) << 56) | ((j7 & 255) << 48) | ((j2 & 255) << 8) | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | (j8 << 40);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        this.zze = i + 4;
        return ((((long) bArr[i + 3]) & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        long j7 = bArr[i + 6];
        this.zze = i + 8;
        return (((long) bArr[i + 7]) & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        this.zze = i + 4;
        return (((long) bArr[i + 3]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long zzv() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.zze == this.zzf) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzm = zzm();
            j |= (127 & jZzm) << (i * 7);
            if ((jZzm & 128) == 0) {
                break;
            }
        }
        return j;
    }

    public final long zzw() {
        long jZzt = zzt();
        if (jZzt >= 0) {
            return jZzt;
        }
        throw new IllegalStateException(AbstractC5044xl.h("Top bit not zero: ", jZzt));
    }

    public final long zzx() {
        int i;
        int i2;
        long j = this.zzd[this.zze];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) == 0) {
                if (i3 >= 6) {
                    if (i3 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j &= (long) (i4 - 1);
                i = 7 - i3;
                break;
            }
            i3--;
        }
        if (i == 0) {
            throw new NumberFormatException(AbstractC5044xl.h("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i2 = 1; i2 < i; i2++) {
            byte b = this.zzd[this.zze + i2];
            if ((b & 192) != 128) {
                throw new NumberFormatException(AbstractC5044xl.h("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.zze += i;
        return j;
    }

    @Nullable
    public final String zzy(char c) {
        int i = this.zzf;
        int i2 = this.zze;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.zzf && this.zzd[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.zzd;
        int i3 = this.zze;
        String strZzC = zzei.zzC(bArr, i3, i2 - i3);
        this.zze = i2;
        if (i2 < this.zzf) {
            this.zze = i2 + 1;
        }
        return strZzC;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[SYNTHETIC] */
    @Nullable
    public final String zzz(Charset charset) {
        byte[] bArr;
        zzcw.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            zzC();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i2 = this.zze;
        while (true) {
            int i3 = this.zzf;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzei.zzL(this.zzd[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.zzd;
                if (bArr2[i2] == 0 && zzei.zzL(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zzd;
                    if (bArr[i2 + 1] == 0 && zzei.zzL(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zzd;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strZzB = zzB(i2 - this.zze, charset);
        if (this.zze != this.zzf && zzO(charset, zza) == '\r') {
            zzO(charset, zzb);
        }
        return strZzB;
    }

    public zzdy() {
        this.zzd = zzei.zzf;
    }

    public zzdy(int i) {
        this.zzd = new byte[i];
        this.zzf = i;
    }

    public zzdy(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
