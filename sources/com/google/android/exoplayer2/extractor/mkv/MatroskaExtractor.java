package com.google.android.exoplayer2.extractor.mkv;

import android.net.Uri;
import android.util.SparseArray;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.work.WorkRequest;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.facebook.ads.redexgen.core.AbstractC1078Ud;
import com.facebook.ads.redexgen.core.AbstractC1517es;
import com.facebook.ads.redexgen.core.AbstractC1561fb;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.C1068Ts;
import com.facebook.ads.redexgen.core.C1072Tw;
import com.facebook.ads.redexgen.core.C1081Ug;
import com.facebook.ads.redexgen.core.C1085Um;
import com.facebook.ads.redexgen.core.C1120Vy;
import com.facebook.ads.redexgen.core.C1121Vz;
import com.facebook.ads.redexgen.core.C1562fc;
import com.facebook.ads.redexgen.core.C1576fq;
import com.facebook.ads.redexgen.core.InterfaceC1086Uo;
import com.facebook.ads.redexgen.core.InterfaceC1118Vw;
import com.facebook.ads.redexgen.core.Q6;
import com.facebook.ads.redexgen.core.UK;
import com.facebook.ads.redexgen.core.UL;
import com.facebook.ads.redexgen.core.UO;
import com.facebook.ads.redexgen.core.Uj;
import com.facebook.ads.redexgen.core.W0;
import com.facebook.ads.redexgen.core.W1;
import com.facebook.ads.redexgen.core.WJ;
import com.facebook.ads.redexgen.core.WY;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.ColorInfo;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MatroskaExtractor implements UK {
    public static byte[] A0t;
    public static String[] A0u = {"hvJsNyYp3v3a4C8A8LwOC4mgkuvCVXoh", "3ANqqpKHoM9q2pU5yvcC4TIXXl4OB4", "W4fcrFg9mIAIMJnn3ruN8Pp1p", "kBvi78HnY0B5pFf5ZLsioHHyWxztsmRs", "nMOCvaqUX6ANdIUM2nc6uVaFYW8fhdLw", "NaaBlhh1gleR9PSnSSlJga6sCsJWQtGN", "vbtih1VRjprWkk0rxsNMjhqVp2JrwXtO", ""};
    public static final UO A0v;
    public static final Map<String, Integer> A0w;
    public static final UUID A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;

    @MetaExoPlayerCustomization("Removed the final from the member variable")
    public SparseArray<C1121Vz> A0P;
    public UL A0Q;
    public C1121Vz A0R;
    public C1562fc A0S;
    public C1562fc A0T;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "AR/VC customizations")
    public String A0U;
    public ByteBuffer A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public int[] A0f;
    public final InterfaceC1118Vw A0g;
    public final W1 A0h;
    public final C1576fq A0i;
    public final C1576fq A0j;
    public final C1576fq A0k;
    public final C1576fq A0l;
    public final C1576fq A0m;
    public final C1576fq A0n;
    public final C1576fq A0o;
    public final C1576fq A0p;
    public final C1576fq A0q;
    public final C1576fq A0r;
    public final boolean A0s;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @RequiresNonNull({"#2.output"})
    private int A02(WJ wj, C1121Vz c1121Vz, int i, boolean z) throws IOException {
        int iA0L;
        int i2;
        if (A06(1012, 11, 79).equals(c1121Vz.A0d)) {
            A0F(wj, A10, i);
            return A00();
        }
        boolean zEquals = A06(1002, 10, 36).equals(c1121Vz.A0d);
        String[] strArr = A0u;
        if (strArr[1].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0u;
        strArr2[1] = "VeNawnzVnUoeQbv5dbPntIzy1QeUIs";
        strArr2[7] = "";
        if (zEquals) {
            A0F(wj, A0z, i);
            String[] strArr3 = A0u;
            if (strArr3[1].length() == strArr3[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0u;
            strArr4[3] = "xvOGB0nkBw8ypQOxOB86OzNoUEqCHeQo";
            strArr4[5] = "9ya9RNQvGPORZirlZGnzoNeBDQHCmHaH";
            return A00();
        }
        if (A06(1023, 13, 34).equals(c1121Vz.A0d)) {
            A0F(wj, A11, i);
            return A00();
        }
        InterfaceC1086Uo interfaceC1086Uo = c1121Vz.A0b;
        if (!this.A0Y) {
            if (c1121Vz.A0i) {
                this.A02 &= -1073741825;
                if (!this.A0b) {
                    wj.readFully(this.A0n.A0l(), 0, 1);
                    this.A08++;
                    if ((this.A0n.A0l()[0] & 128) == 128) {
                        throw Q6.A01(A06(694, 35, 18), null);
                    }
                    this.A00 = this.A0n.A0l()[0];
                    this.A0b = true;
                }
                if ((this.A00 & 1) == 1) {
                    boolean z2 = (this.A00 & 2) == 2;
                    this.A02 |= 1073741824;
                    if (!this.A0Z) {
                        wj.readFully(this.A0i.A0l(), 0, 8);
                        this.A08 += 8;
                        this.A0Z = true;
                        this.A0n.A0l()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.A0n.A0f(0);
                        interfaceC1086Uo.AHy(this.A0n, 1, 1);
                        this.A09++;
                        this.A0i.A0f(0);
                        interfaceC1086Uo.AHy(this.A0i, 8, 1);
                        this.A09 += 8;
                    }
                    if (z2) {
                        if (!this.A0a) {
                            wj.readFully(this.A0n.A0l(), 0, 1);
                            this.A08++;
                            this.A0n.A0f(0);
                            this.A0B = this.A0n.A0I();
                            this.A0a = true;
                        }
                        int i3 = this.A0B * 4;
                        this.A0n.A0d(i3);
                        wj.readFully(this.A0n.A0l(), 0, i3);
                        this.A08 += i3;
                        short s = (short) ((this.A0B / 2) + 1);
                        int i4 = (s * 6) + 2;
                        if (this.A0V == null || this.A0V.capacity() < i4) {
                            this.A0V = ByteBuffer.allocate(i4);
                        }
                        this.A0V.position(0);
                        String[] strArr5 = A0u;
                        if (strArr5[3].charAt(31) != strArr5[5].charAt(31)) {
                            String[] strArr6 = A0u;
                            strArr6[3] = "XsyONaQoXb0KRGR9GBMCqS74AjhcnCna";
                            strArr6[5] = "Km2zYEf5FuXm3vuJIjLoXkc44n6BHKFj";
                            this.A0V.putShort(s);
                            iA0L = 0;
                            i2 = 0;
                        } else {
                            A0u[6] = "1a1cgBQUUVYd773oCiMoc5ncpb4sV2rG";
                            this.A0V.putShort(s);
                            iA0L = 0;
                            i2 = 0;
                        }
                        while (i2 < this.A0B) {
                            int i5 = iA0L;
                            iA0L = this.A0n.A0L();
                            if (i2 % 2 == 0) {
                                this.A0V.putShort((short) (iA0L - i5));
                            } else {
                                this.A0V.putInt(iA0L - i5);
                            }
                            i2++;
                        }
                        int i6 = (i - this.A08) - iA0L;
                        if (this.A0B % 2 == 1) {
                            this.A0V.putInt(i6);
                        } else {
                            this.A0V.putShort((short) i6);
                            this.A0V.putInt(0);
                        }
                        C1576fq c1576fq = this.A0j;
                        byte[] bArrArray = this.A0V.array();
                        String[] strArr7 = A0u;
                        if (strArr7[1].length() != strArr7[7].length()) {
                            String[] strArr8 = A0u;
                            strArr8[3] = "OVXM98q5Whv6Ovenvj8Rl8RTqDNSVL0c";
                            strArr8[5] = "Pcui2Gkgol7vWOk20ujxNfcUqWQWrCa7";
                            c1576fq.A0j(bArrArray, i4);
                            interfaceC1086Uo.AHy(this.A0j, i4, 1);
                            this.A09 += i4;
                        } else {
                            String[] strArr9 = A0u;
                            strArr9[4] = "w5EeB6QB3VoUfhBDA6Ca0eRezxaYRFVP";
                            strArr9[0] = "3JNEEZKOGCdM5xkGIjn8mvQrr3ZCFSrs";
                            c1576fq.A0j(bArrArray, i4);
                            interfaceC1086Uo.AHy(this.A0j, i4, 0);
                            this.A09 += i4;
                        }
                    }
                }
            } else if (c1121Vz.A0m != null) {
                this.A0m.A0j(c1121Vz.A0m, c1121Vz.A0m.length);
            }
            if (c1121Vz.A0B(z)) {
                this.A02 |= 268435456;
                this.A0q.A0d(0);
                int iA0A = (this.A0m.A0A() + i) - this.A08;
                this.A0n.A0d(4);
                this.A0n.A0l()[0] = (byte) ((iA0A >> 24) & 255);
                this.A0n.A0l()[1] = (byte) ((iA0A >> 16) & 255);
                this.A0n.A0l()[2] = (byte) ((iA0A >> 8) & 255);
                this.A0n.A0l()[3] = (byte) (iA0A & 255);
                interfaceC1086Uo.AHy(this.A0n, 4, 2);
                this.A09 += 4;
            }
            this.A0Y = true;
        }
        int iA0A2 = i + this.A0m.A0A();
        if (A06(1207, 15, 19).equals(c1121Vz.A0d) || A06(1236, 16, 87).equals(c1121Vz.A0d)) {
            byte[] bArrA0l = this.A0k.A0l();
            bArrA0l[0] = 0;
            bArrA0l[1] = 0;
            bArrA0l[2] = 0;
            int i7 = c1121Vz.A0Q;
            int i8 = 4 - c1121Vz.A0Q;
            while (this.A08 < iA0A2) {
                if (this.A0A == 0) {
                    A0G(wj, bArrA0l, i8, i7);
                    this.A08 += i7;
                    this.A0k.A0f(0);
                    this.A0A = this.A0k.A0L();
                    this.A0l.A0f(0);
                    interfaceC1086Uo.AHx(this.A0l, 4);
                    this.A09 += 4;
                } else {
                    int iA01 = A01(wj, interfaceC1086Uo, this.A0A);
                    this.A08 += iA01;
                    this.A09 += iA01;
                    this.A0A -= iA01;
                }
            }
        } else {
            if (c1121Vz.A0c != null) {
                AbstractC1517es.A08(this.A0m.A0A() == 0);
                c1121Vz.A0c.A03(wj);
            }
            while (this.A08 < iA0A2) {
                int iA02 = A01(wj, interfaceC1086Uo, iA0A2 - this.A08);
                this.A08 += iA02;
                this.A09 += iA02;
            }
        }
        if (A06(271, 8, 29).equals(c1121Vz.A0d)) {
            this.A0r.A0f(0);
            interfaceC1086Uo.AHx(this.A0r, 4);
            this.A09 += 4;
        }
        return A00();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0t, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0t = new byte[]{127, 50, 42, 44, 43, 127, 61, 58, 127, 54, 49, 127, 62, 127, 28, 42, 58, 44, 98, 47, 55, 49, 54, 98, 32, 39, 98, 43, 44, 98, 35, 98, 22, 48, 35, 33, 41, 7, 44, 54, 48, 59, 0, 78, 79, 84, 0, 83, 85, 80, 80, 79, 82, 84, 69, 68, 29, 8, 9, 92, 2, 29, 8, 10, 92, 2, 29, 8, 10, 92, 2, 29, 8, 10, 92, 38, 51, 49, 103, 57, 38, 51, 49, 103, 57, 38, 51, 49, 103, 47, 38, 51, 48, 103, 42, 63, 61, 107, 53, 42, 63, 61, 107, 53, 42, 63, 61, 107, 33, 42, 63, 60, 107, 101, 97, 119, 119, 65, 80, 80, 77, 74, 67, 87, 103, 77, 84, 76, 65, 86, 105, 75, 64, 65, 4, 61, 35, 61, 61, 63, 64, 94, 64, 66, 50, 27, 5, 30, cw.l, 9, 31, 1, 26, 10, cw.k, 113, 27, 6, cw.l, 12, 27, cw.k, cw.k, 81, 79, 84, 68, 67, 63, 92, 95, 67, 67, 92, 85, 67, 67, 36, 58, 32, 36, 38, 86, 76, 82, 75, 65, 76, 78, 58, 36, 54, 43, 62, 60, 84, 55, 73, 28, 2, cw.n, cw.k, 24, 26, 114, 17, 110, 73, 87, 69, 91, 39, 73, 75, 69, 118, 104, 120, 103, 98, 100, 96, 126, 113, 98, 108, cw.l, 103, 109, 110, 96, 117, cw.l, 104, 100, 100, 100, 69, 91, 84, 71, 73, 43, 77, 74, 80, 43, 70, 77, 67, 73, 87, 88, 75, 69, 39, 65, 70, 92, 39, 68, 65, 92, 5, 27, cw.n, 22, 17, 1, 12, 0, 103, 121, 112, 105, 116, 100, 111, 117, 44, cw.l, 1, 72, 27, 79, 28, 12, cw.l, 3, 10, 79, 27, 6, 2, 10, 12, 0, 11, 10, 79, 31, 29, 6, 0, 29, 79, 27, 0, 79, 27, 6, 2, 10, 12, 0, 11, 10, 60, 12, cw.l, 3, 10, 79, cw.k, 10, 6, 1, 8, 79, 28, 10, 27, 65, 9, 37, 46, 47, 41, 3, 46, 106, 35, 57, 106, 39, 35, 57, 57, 35, 36, 45, 106, 35, 36, 106, 30, 56, 43, 41, 33, cw.m, 36, 62, 56, 51, 106, 47, 38, 47, 39, 47, 36, 62, 46, 2, 0, cw.m, 4, 3, 4, 3, 10, 77, 8, 3, cw.l, 31, 20, 29, 25, 4, 2, 3, 77, 12, 3, 9, 77, cw.l, 2, 0, 29, 31, 8, 30, 30, 4, 2, 3, 77, 4, 30, 77, 3, 2, 25, 77, 30, 24, 29, 29, 2, 31, 25, 8, 9, 96, 76, 77, 87, 70, 77, 87, 96, 76, 78, 83, 98, 79, 68, 76, 3, 116, 88, 89, 67, 82, 89, 67, 114, 89, 84, 118, 91, 80, 88, 23, 65, 109, 108, 118, 103, 108, 118, 71, 108, 97, 109, 102, 107, 108, 101, 77, 112, 102, 103, 112, 34, 92, 112, 113, 107, 122, 113, 107, 90, 113, 124, 112, 123, 118, 113, 120, 76, 124, 112, 111, 122, 63, 11, 38, 60, 44, 46, 61, 43, 38, 33, 40, 111, 35, 46, 60, 59, 111, 44, 58, 42, 111, 63, 32, 38, 33, 59, 111, 56, 38, 59, 39, 111, 58, 33, 42, 55, 63, 42, 44, 59, 42, 43, 111, 43, 58, 61, 46, 59, 38, 32, 33, 117, 111, 33, 10, 6, 49, 28, 21, 0, 69, 94, 117, 121, 78, 99, 106, 127, 72, 127, 123, 126, 76, 127, 104, 105, 115, 117, 116, 58, 56, 63, 48, 49, 93, 17, 28, 30, 20, 19, 26, 93, cw.l, 28, cw.n, cw.k, 17, 24, 93, cw.l, 20, 7, 24, 93, 18, 8, 9, 93, 18, 27, 93, cw.m, 28, 19, 26, 24, 83, 116, 115, 124, 125, 99, 84, 80, 85, 103, 84, 67, 66, 88, 94, 95, 17, 105, 64, 73, 65, 73, 66, 88, 12, 89, 114, 127, 110, 101, 108, 104, 121, 120, 60, 72, 110, 125, 127, 119, 60, 122, 115, 105, 114, 120, 60, 126, 105, 104, 60, 95, 115, 114, 104, 121, 114, 104, 89, 114, 127, 87, 121, 101, 85, 88, 60, 107, 125, 111, 60, 114, 115, 104, 60, 122, 115, 105, 114, 120, 108, 81, 93, 76, 71, 90, 64, 70, 71, 9, 75, 64, 93, 9, 64, 90, 9, 90, 76, 93, 9, 64, 71, 9, 90, 64, 78, 71, 72, 69, 9, 75, 80, 93, 76, 99, 74, 87, 72, 68, 81, 31, 5, 118, 81, 68, 87, 81, 9, 5, 96, 75, 65, 9, 5, 119, 64, 68, 65, 106, 87, 65, 64, 87, 9, 5, 105, 68, 92, 64, 87, 9, 5, 118, 81, 92, 73, 64, 9, 5, 107, 68, 72, 64, 9, 5, 104, 68, 87, 66, 76, 75, 105, 9, 5, 104, 68, 87, 66, 76, 75, 119, 9, 5, 104, 68, 87, 66, 76, 75, 115, 9, 5, 96, 67, 67, 64, 70, 81, 9, 5, 113, 64, 93, 81, 96, 76, 67, 73, 76, 89, 66, 95, 84, cw.k, 72, 65, 72, 64, 72, 67, 89, cw.k, 126, 72, 72, 70, 100, 105, cw.k, 66, 95, cw.k, 126, 72, 72, 70, 125, 66, 94, 68, 89, 68, 66, 67, cw.k, 67, 66, 89, cw.k, 75, 66, 88, 67, 73, 116, 88, 77, 75, 86, 74, 82, 88, 124, 65, 77, 75, 88, 90, 77, 86, 75, 7, 63, 38, 62, 35, 58, 38, 47, 106, 25, 47, 45, 39, 47, 36, 62, 106, 47, 38, 47, 39, 47, 36, 62, 57, 106, 36, 37, 62, 106, 57, 63, 58, 58, 37, 56, 62, 47, 46, 19, 50, 125, 43, 60, 49, 52, 57, 125, 41, 47, 60, 62, 54, 46, 125, 42, 56, 47, 56, 125, 59, 50, 40, 51, 57, 115, 82, 29, 75, 92, 81, 84, 89, 29, 75, 92, 79, 84, 83, 73, 29, 81, 88, 83, 90, 73, 85, 29, 80, 92, 78, 86, 29, 91, 82, 72, 83, 89, cw.n, 28, 7, 21, 1, cw.n, 22, 1, 55, 59, 44, 32, 41, 50, 75, 52, 
        35, 55, 76, 64, 75, 90, 71, 75, 48, 94, 76, 76, 39, 43, 32, 49, 44, 32, 91, 33, 32, 50, 76, 74, 70, 77, 92, 65, 77, 54, 78, 92, 91, 79, 77, 77, 8, 4, cw.k, 20, 25, 8, cw.l, 25, 79, 119, 117, 108, 108, 117, 114, 123, 60, 111, 105, 126, 104, 117, 104, 112, 121, 60, 111, 125, 113, 108, 112, 121, 60, 117, 114, 60, 112, 125, 127, 121, 120, 60, 126, 112, 115, 127, 119, 50, 1, 57, 59, 34, 34, 59, 60, 53, 114, 33, 39, 48, 38, 59, 38, 62, 55, 114, 33, 51, 63, 34, 62, 55, 114, 37, 59, 38, 58, 114, 60, 61, 114, 54, 39, 32, 51, 38, 59, 61, 60, 124, 69, 126, 117, 104, 96, 117, 115, 100, 117, 116, 48, 121, 116, 42, 48, 73, 114, 121, 100, 108, 121, 127, 104, 121, 120, 60, 112, 125, 127, 117, 114, 123, 60, 106, 125, 112, 105, 121, 38, 60, 56, 49, 47, 56, 95, 87, 94, 76, 81, 68, 70, 51, 70, 79, 93, 64, 85, 87, 36, 63, 89, 67, 95, 63, 81, 64, 20, 29, cw.m, 18, 7, 5, 118, 109, 11, 17, cw.k, 109, 3, 17, 18, 126, 119, 101, 120, 109, 111, 28, 7, 97, 123, 103, 7, 105, 126, 107, 91, 82, 64, 93, 72, 74, 57, 34, 68, 94, 66, 34, 94, 93, 58, 51, 33, 60, 41, 43, 36, 67, 37, 63, 35, 67, 36, 41, 58, 47, 17, 24, 10, 20, 104, 17, 1, cw.n, 104, 1, 8, 18, 21, 4, 4, 79, 70, 77, 81, 92, 86, 75, 88, 94, 87, 94, 88, 48, 110, 103, 110, 104, 1, 42, 54, 33, 29, 52, 43, 38, 39, 45, 29, 48, 45, 54, 3, 111, 114, 114, 114, 80, 76, 91, 103, 78, 81, 92, 93, 87, 103, 74, 87, 76, 121, 21, 8, 1, 8, 119, 107, 124, 64, 105, 118, 123, 122, 112, 64, 109, 112, 107, 94, 50, 46, 39, 47, 23, 11, 28, 32, 9, 22, 27, 26, cw.n, 32, cw.k, cw.n, 11, 62, 82, 77, 72, 79, 26, 22, 3, 5, 24, 4, 28, 22, 69, 90, 87, 86, 92, 28, 68, 86, 81, 94, 6, 20, 19, 28};
    }

    static {
        A0B();
        A0v = new UO() { // from class: com.facebook.ads.redexgen.X.Tu
            @Override // com.facebook.ads.redexgen.core.UO
            public final UK[] A5D() {
                return MatroskaExtractor.A0Q();
            }

            @Override // com.facebook.ads.redexgen.core.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
        A10 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0y = AbstractC1600gE.A1G(A06(729, 90, 30));
        A0z = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A11 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        A0x = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put(A06(GL20.GL_OUT_OF_MEMORY, 18, 121), 0);
        map.put(A06(1303, 18, 3), 90);
        map.put(A06(1321, 18, 36), 180);
        map.put(A06(1339, 18, 68), 270);
        Map<String, Integer> trackNameToRotationDegrees = Collections.unmodifiableMap(map);
        A0w = trackNameToRotationDegrees;
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new C1072Tw(), i);
    }

    public MatroskaExtractor(InterfaceC1118Vw interfaceC1118Vw, int i) {
        this.A0M = -1L;
        this.A0O = C.TIME_UNSET;
        this.A0I = C.TIME_UNSET;
        this.A0J = C.TIME_UNSET;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = C.TIME_UNSET;
        this.A0g = interfaceC1118Vw;
        this.A0g.AA1(new C1068Ts(this));
        this.A0s = (i & 1) == 0;
        this.A0h = new W1();
        this.A0P = new SparseArray<>();
        this.A0n = new C1576fq(4);
        this.A0r = new C1576fq(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0o = new C1576fq(4);
        this.A0l = new C1576fq(AbstractC1078Ud.A03);
        this.A0k = new C1576fq(4);
        this.A0m = new C1576fq();
        this.A0p = new C1576fq();
        this.A0i = new C1576fq(8);
        this.A0j = new C1576fq();
        this.A0q = new C1576fq();
        this.A0f = new int[1];
    }

    private int A00() {
        int sampleSize = this.A09;
        A0A();
        return sampleSize;
    }

    private int A01(WJ wj, InterfaceC1086Uo interfaceC1086Uo, int i) throws IOException {
        int strippedBytesLeft = this.A0m.A07();
        if (strippedBytesLeft > 0) {
            int bytesWritten = Math.min(i, strippedBytesLeft);
            interfaceC1086Uo.AHx(this.A0m, bytesWritten);
            return bytesWritten;
        }
        String[] strArr = A0u;
        if (strArr[4].charAt(26) == strArr[0].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0u;
        strArr2[1] = "0YdUuctU2QhpAt9U3DDz8MmnF4Qdx3";
        strArr2[7] = "";
        return interfaceC1086Uo.AHv(wj, i, false);
    }

    private long A03(long j) throws Q6 {
        if (this.A0O != C.TIME_UNSET) {
            return AbstractC1600gE.A0U(j, this.A0O, 1000L);
        }
        throw Q6.A01(A06(279, 54, 84), null);
    }

    @MetaExoPlayerCustomization("Adding support AR/VR eventListener")
    private Uj A04(C1562fc c1562fc, C1562fc c1562fc2) {
        if (this.A0M == -1 || this.A0J == C.TIME_UNSET || c1562fc == null || c1562fc.A02() == 0 || c1562fc2 == null || c1562fc2.A02() != c1562fc.A02()) {
            return new C1120Vy(this.A0J);
        }
        int iA02 = c1562fc.A02();
        int[] iArrCopyOf = new int[iA02];
        long[] timesUs = new long[iA02];
        String[] strArr = A0u;
        String str = strArr[1];
        String str2 = strArr[7];
        int length = str.length();
        int cuePointsSize = str2.length();
        if (length == cuePointsSize) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0u;
        strArr2[3] = "gVrzOIrGkpMKHCJql84VffjdelF7f3Qa";
        strArr2[5] = "ETJTZkcPi6sBc1BE7EkTzZvXvhAqJcHT";
        long[] jArrCopyOf = new long[iA02];
        long[] jArrCopyOf2 = new long[iA02];
        for (int i = 0; i < iA02; i++) {
            jArrCopyOf2[i] = c1562fc.A03(i);
            timesUs[i] = this.A0M + c1562fc2.A03(i);
        }
        for (int i2 = 0; i2 < iA02 - 1; i2++) {
            iArrCopyOf[i2] = (int) (timesUs[i2 + 1] - timesUs[i2]);
            jArrCopyOf[i2] = jArrCopyOf2[i2 + 1] - jArrCopyOf2[i2];
        }
        iArrCopyOf[iA02 - 1] = (int) ((this.A0M + this.A0N) - timesUs[iA02 - 1]);
        jArrCopyOf[iA02 - 1] = this.A0J - jArrCopyOf2[iA02 - 1];
        long j = jArrCopyOf[iA02 - 1];
        if (j <= 0) {
            AbstractC1561fb.A07(A06(869, 17, 2), A06(499, 52, 116) + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length - 1);
            timesUs = Arrays.copyOf(timesUs, timesUs.length - 1);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length - 1);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, jArrCopyOf2.length - 1);
        }
        return new WY(iArrCopyOf, timesUs, jArrCopyOf, jArrCopyOf2);
    }

    private final C1121Vz A05(int i) throws Q6 {
        A0D(i);
        return this.A0R;
    }

    @EnsuresNonNull({"extractorOutput"})
    private void A09() {
        AbstractC1517es.A02(this.A0Q);
    }

    private void A0A() {
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0Y = false;
        this.A0b = false;
        this.A0a = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0Z = false;
        this.A0m.A0d(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void A0C(int i) throws Q6 {
        if (this.A0T != null && this.A0S != null) {
        } else {
            throw Q6.A01(A06(631, 8, 23) + i + A06(0, 18, 100), null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void A0D(int i) throws Q6 {
        if (this.A0R != null) {
        } else {
            throw Q6.A01(A06(631, 8, 23) + i + A06(18, 24, 121), null);
        }
    }

    private void A0E(WJ wj, int i) throws IOException {
        if (this.A0n.A0A() >= i) {
            return;
        }
        if (this.A0n.A08() < i) {
            this.A0n.A0c(Math.max(this.A0n.A08() * 2, i));
        }
        wj.readFully(this.A0n.A0l(), this.A0n.A0A(), i - this.A0n.A0A());
        this.A0n.A0e(i);
    }

    private void A0F(WJ wj, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        int sizeWithPrefix = this.A0p.A08();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i;
            this.A0p.A0i(Arrays.copyOf(bArr, sizeWithPrefix2));
        } else {
            byte[] bArrA0l = this.A0p.A0l();
            int sizeWithPrefix3 = bArr.length;
            System.arraycopy(bArr, 0, bArrA0l, 0, sizeWithPrefix3);
        }
        byte[] bArrA0l2 = this.A0p.A0l();
        int sizeWithPrefix4 = bArr.length;
        wj.readFully(bArrA0l2, sizeWithPrefix4, i);
        this.A0p.A0f(0);
        C1576fq c1576fq = this.A0p;
        String[] strArr = A0u;
        String str = strArr[3];
        String str2 = strArr[5];
        int iCharAt = str.charAt(31);
        int sizeWithPrefix5 = str2.charAt(31);
        if (iCharAt == sizeWithPrefix5) {
            throw new RuntimeException();
        }
        A0u[2] = "OLEoajv0A5hAFn";
        c1576fq.A0e(length);
    }

    private void A0G(WJ wj, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.A0m.A07());
        int pendingStrippedBytes = i + iMin;
        wj.readFully(bArr, pendingStrippedBytes, i2 - iMin);
        if (iMin > 0) {
            this.A0m.A0k(bArr, i, iMin);
        }
    }

    private final void A0H(C1121Vz c1121Vz, int i, WJ wj, int i2) throws IOException {
        if (i == 4) {
            if (A06(GL20.GL_INVALID_ENUM, 5, 3).equals(c1121Vz.A0d)) {
                this.A0q.A0d(i2);
                wj.readFully(this.A0q.A0l(), 0, i2);
                return;
            }
        }
        wj.AJ9(i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:35:0x010d A[LOOP:0: B:29:0x00e0->B:35:0x010d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2 A[SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    private void A0I(C1121Vz c1121Vz, long j, int i, int i2, int i3) {
        int i4;
        String strA06;
        int iA09;
        int iA0A = i2;
        if (c1121Vz.A0c != null) {
            c1121Vz.A0c.A04(c1121Vz.A0b, j, i, iA0A, i3, c1121Vz.A0a);
        } else {
            if (!A06(1012, 11, 79).equals(c1121Vz.A0d)) {
                if (!A06(1002, 10, 36).equals(c1121Vz.A0d)) {
                    if (A06(1023, 13, 34).equals(c1121Vz.A0d)) {
                        i4 = this.A03;
                        strA06 = A06(869, 17, 2);
                        if (i4 > 1) {
                            AbstractC1561fb.A07(strA06, A06(1044, 40, 39));
                        } else if (this.A0D == C.TIME_UNSET) {
                            AbstractC1561fb.A07(strA06, A06(1084, 42, 105));
                        } else {
                            A0K(c1121Vz.A0d, this.A0D, this.A0p.A0l());
                            for (iA09 = this.A0p.A09(); iA09 < this.A0p.A0A(); iA09++) {
                                if (this.A0p.A0l()[iA09] == 0) {
                                    this.A0p.A0e(iA09);
                                    break;
                                }
                            }
                            c1121Vz.A0b.AHx(this.A0p, this.A0p.A0A());
                            iA0A += this.A0p.A0A();
                        }
                    }
                } else {
                    i4 = this.A03;
                    strA06 = A06(869, 17, 2);
                    if (i4 > 1) {
                        AbstractC1561fb.A07(strA06, A06(1044, 40, 39));
                    } else if (this.A0D == C.TIME_UNSET) {
                        AbstractC1561fb.A07(strA06, A06(1084, 42, 105));
                    } else {
                        A0K(c1121Vz.A0d, this.A0D, this.A0p.A0l());
                        while (iA09 < this.A0p.A0A()) {
                            if (this.A0p.A0l()[iA09] == 0) {
                                this.A0p.A0e(iA09);
                                break;
                            }
                        }
                        c1121Vz.A0b.AHx(this.A0p, this.A0p.A0A());
                        iA0A += this.A0p.A0A();
                    }
                }
            } else {
                i4 = this.A03;
                strA06 = A06(869, 17, 2);
                if (i4 > 1) {
                    AbstractC1561fb.A07(strA06, A06(1044, 40, 39));
                } else if (this.A0D == C.TIME_UNSET) {
                    AbstractC1561fb.A07(strA06, A06(1084, 42, 105));
                } else {
                    A0K(c1121Vz.A0d, this.A0D, this.A0p.A0l());
                    while (iA09 < this.A0p.A0A()) {
                        if (this.A0p.A0l()[iA09] == 0) {
                            this.A0p.A0e(iA09);
                            break;
                        }
                    }
                    c1121Vz.A0b.AHx(this.A0p, this.A0p.A0A());
                    iA0A += this.A0p.A0A();
                }
            }
            if ((268435456 & i) != 0) {
                if (this.A03 > 1) {
                    this.A0q.A0d(0);
                } else {
                    int iA0A2 = this.A0q.A0A();
                    InterfaceC1086Uo interfaceC1086Uo = c1121Vz.A0b;
                    C1576fq c1576fq = this.A0q;
                    String[] strArr = A0u;
                    if (strArr[4].charAt(26) == strArr[0].charAt(26)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0u;
                    strArr2[3] = "IzD8vMX1BU9RXYzru7wjKUuhr05Eh8Zu";
                    strArr2[5] = "TLmBDf5aqweBMP1sJJSmilgU542yUaT3";
                    interfaceC1086Uo.AHy(c1576fq, iA0A2, 2);
                    iA0A += iA0A2;
                }
            }
            c1121Vz.A0b.AI0(j, i, iA0A, i3, c1121Vz.A0a);
        }
        this.A0X = true;
    }

    private final void A0J(C1121Vz c1121Vz, WJ wj, int i) throws IOException {
        if (c1121Vz.A0n == 1685485123 || c1121Vz.A0n == 1685480259) {
            c1121Vz.A0k = new byte[i];
            wj.readFully(c1121Vz.A0k, 0, i);
        } else {
            wj.AJ9(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public static void A0K(String str, long j, byte[] bArr) {
        byte b;
        String[] strArr;
        byte[] bArrA0O;
        int i;
        switch (str.hashCode()) {
            case 738597099:
                if (A0u[6].charAt(12) == 'Q') {
                    throw new RuntimeException();
                }
                A0u[2] = "Ms6DDOdJ87XoRGxXo";
                if (str.equals(A06(1002, 10, 36))) {
                    b = 1;
                } else {
                    b = -1;
                }
                strArr = A0u;
                if (strArr[3].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0u;
                strArr2[3] = "omptfwud1uZfxkRy7EoFVt5BBy6X4sdY";
                strArr2[5] = "9NnrcsgcwKRVNKlpkbx1c9FxUfNErco3";
                switch (b) {
                    case 0:
                        bArrA0O = A0O(j, A06(75, 19, 56), 1000L);
                        i = 19;
                        break;
                    case 1:
                        bArrA0O = A0O(j, A06(56, 19, 3), WorkRequest.MIN_BACKOFF_MILLIS);
                        i = 21;
                        break;
                    case 2:
                        bArrA0O = A0O(j, A06(94, 19, 52), 1000L);
                        i = 25;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                System.arraycopy(bArrA0O, 0, bArr, i, bArrA0O.length);
                return;
            case 1045209816:
                if (str.equals(A06(1023, 13, 34))) {
                    b = 2;
                } else {
                    b = -1;
                }
                strArr = A0u;
                if (strArr[3].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0u;
                strArr3[3] = "omptfwud1uZfxkRy7EoFVt5BBy6X4sdY";
                strArr3[5] = "9NnrcsgcwKRVNKlpkbx1c9FxUfNErco3";
                switch (b) {
                    case 0:
                        bArrA0O = A0O(j, A06(75, 19, 56), 1000L);
                        i = 19;
                        break;
                    case 1:
                        bArrA0O = A0O(j, A06(56, 19, 3), WorkRequest.MIN_BACKOFF_MILLIS);
                        i = 21;
                        break;
                    case 2:
                        bArrA0O = A0O(j, A06(94, 19, 52), 1000L);
                        i = 25;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                System.arraycopy(bArrA0O, 0, bArr, i, bArrA0O.length);
                return;
            case 1422270023:
                if (str.equals(A06(1012, 11, 79))) {
                    b = 0;
                } else {
                    b = -1;
                }
                strArr = A0u;
                if (strArr[3].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0u;
                strArr4[3] = "omptfwud1uZfxkRy7EoFVt5BBy6X4sdY";
                strArr4[5] = "9NnrcsgcwKRVNKlpkbx1c9FxUfNErco3";
                switch (b) {
                    case 0:
                        bArrA0O = A0O(j, A06(75, 19, 56), 1000L);
                        i = 19;
                        break;
                    case 1:
                        bArrA0O = A0O(j, A06(56, 19, 3), WorkRequest.MIN_BACKOFF_MILLIS);
                        i = 21;
                        break;
                    case 2:
                        bArrA0O = A0O(j, A06(94, 19, 52), 1000L);
                        i = 25;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                System.arraycopy(bArrA0O, 0, bArr, i, bArrA0O.length);
                return;
            default:
                b = -1;
                strArr = A0u;
                if (strArr[3].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr5 = A0u;
                strArr5[3] = "omptfwud1uZfxkRy7EoFVt5BBy6X4sdY";
                strArr5[5] = "9NnrcsgcwKRVNKlpkbx1c9FxUfNErco3";
                switch (b) {
                    case 0:
                        bArrA0O = A0O(j, A06(75, 19, 56), 1000L);
                        i = 19;
                        break;
                    case 1:
                        bArrA0O = A0O(j, A06(56, 19, 3), WorkRequest.MIN_BACKOFF_MILLIS);
                        i = 21;
                        break;
                    case 2:
                        bArrA0O = A0O(j, A06(94, 19, 52), 1000L);
                        i = 25;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                System.arraycopy(bArrA0O, 0, bArr, i, bArrA0O.length);
                return;
        }
    }

    private boolean A0L(C1081Ug c1081Ug, long j) {
        if (this.A0c) {
            this.A0L = j;
            c1081Ug.A00 = this.A0H;
            this.A0c = false;
            return true;
        }
        if (!this.A0e || this.A0L == -1) {
            return false;
        }
        c1081Ug.A00 = this.A0L;
        this.A0L = -1L;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x029f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[RETURN] */
    public static boolean A0M(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A06(1178, 14, 43))) {
                    b = 6;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -2095575984:
                if (str.equals(A06(1222, 14, 54))) {
                    b = 4;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -1985379776:
                if (str.equals(A06(207, 8, 51))) {
                    b = 23;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -1784763192:
                if (str.equals(A06(263, 8, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE))) {
                    b = 18;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -1730367663:
                if (A0u[6].charAt(12) == 'Q') {
                    throw new RuntimeException();
                }
                A0u[2] = "UUQNuwg2Mh";
                if (str.equals(A06(271, 8, 29))) {
                    b = 12;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -1482641358:
                if (str.equals(A06(189, 9, 64))) {
                    b = cw.l;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -1482641357:
                if (str.equals(A06(198, 9, 102))) {
                    b = cw.m;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -1373388978:
                if (str.equals(A06(1252, 15, 124))) {
                    b = 9;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -933872740:
                if (str.equals(A06(984, 8, 120))) {
                    b = 32;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -538363189:
                if (str.equals(A06(1192, 15, 121))) {
                    b = 5;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -538363109:
                if (str.equals(A06(1207, 15, 19))) {
                    b = 7;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -425012669:
                if (str.equals(A06(1036, 8, 96))) {
                    b = 30;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case -356037306:
                if (str.equals(A06(Input.Keys.NUMPAD_RIGHT_PAREN, 14, 43))) {
                    b = 21;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 62923557:
                if (str.equals(A06(135, 5, 71))) {
                    b = cw.k;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 62923603:
                if (str.equals(A06(Input.Keys.F10, 5, 58))) {
                    b = cw.n;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 62927045:
                if (str.equals(A06(Input.Keys.NUMPAD_1, 5, 97))) {
                    b = 19;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 82318131:
                if (str.equals(A06(1166, 5, 85))) {
                    b = 2;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 82338133:
                if (str.equals(A06(1275, 5, 51))) {
                    b = 0;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 82338134:
                if (str.equals(A06(GL20.GL_INVALID_ENUM, 5, 3))) {
                    b = 1;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 99146302:
                if (str.equals(A06(992, 10, 95))) {
                    b = 31;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 444813526:
                if (str.equals(A06(1267, 8, 34))) {
                    b = 10;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 542569478:
                if (str.equals(A06(Input.Keys.NUMPAD_6, 13, 101))) {
                    b = 20;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 635596514:
                if (str.equals(A06(EnumC4719u30.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 16, 26))) {
                    b = 26;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 725948237:
                if (str.equals(A06(237, 13, 63))) {
                    b = 25;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 725957860:
                if (str.equals(A06(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 13, 51))) {
                    b = 24;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 738597099:
                if (str.equals(A06(1002, 10, 36))) {
                    b = 28;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 855502857:
                if (str.equals(A06(1236, 16, 87))) {
                    b = 8;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 1045209816:
                if (str.equals(A06(1023, 13, 34))) {
                    b = 29;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 1422270023:
                if (str.equals(A06(1012, 11, 79))) {
                    b = 27;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 1809237540:
                if (str.equals(A06(1171, 7, 58))) {
                    b = 3;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 1950749482:
                if (str.equals(A06(177, 6, 94))) {
                    b = 17;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 1950789798:
                if (str.equals(A06(Input.Keys.F13, 6, 54))) {
                    b = 22;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
            case 1951062397:
                if (str.equals(A06(EnumC4719u30.AD_RESPONSE_EMPTY_VALUE, 6, 12))) {
                    b = 11;
                }
                switch (b) {
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
                        return true;
                    default:
                        return false;
                }
        }
        b = -1;
        switch (b) {
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
                return true;
            default:
                return false;
        }
    }

    public static byte[] A0O(long j, String str, long j2) {
        AbstractC1517es.A07(j != C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((((long) i) * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((((long) i2) * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        int minutes = (int) ((j4 - (((long) i3) * 1000000)) / j2);
        return AbstractC1600gE.A1G(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(minutes)));
    }

    public static int[] A0P(int[] iArr, int i) {
        if (iArr == null) {
            int[] iArr2 = new int[i];
            String[] strArr = A0u;
            if (strArr[3].charAt(31) == strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[1] = "0ba4GojJLJm7uxnaPSAOLd77fYTidr";
            strArr2[7] = "";
            return iArr2;
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public static /* synthetic */ UK[] A0Q() {
        return new UK[]{new MatroskaExtractor()};
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "Adding support for AR/VR TAGs")
    public final int A0R(int i) {
        switch (i) {
            case 131:
            case 136:
            case Input.Keys.NUMPAD_MULTIPLY /* 155 */:
            case Input.Keys.NUMPAD_COMMA /* 159 */:
            case 176:
            case 179:
            case Input.Keys.F16 /* 186 */:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case Input.Keys.NUMPAD_ENTER /* 160 */:
            case 166:
            case 174:
            case Input.Keys.F13 /* 183 */:
            case Input.Keys.F17 /* 187 */:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 26568:
            case 28032:
            case 29555:
            case 30113:
            case 30320:
            case 290298740:
            case 307544935:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case Input.Keys.NUMPAD_EQUALS /* 161 */:
            case Input.Keys.NUMPAD_RIGHT_PAREN /* 163 */:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            case 17543:
            case 17827:
                return 6;
            default:
                String[] strArr = A0u;
                if (strArr[1].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0u;
                strArr2[1] = "A2FH5DOh7IT2snIry1cKkBkzyzULmN";
                strArr2[7] = "";
                return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r4 != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r14.A0C != 475249515) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        r14.A0H = r14.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        if (r4 != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0S(int r15) throws com.facebook.ads.redexgen.core.Q6 {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0S(int):void");
    }

    public final void A0T(int i, double d) throws Q6 {
        switch (i) {
            case 181:
                A05(i).A0T = (int) d;
                return;
            case 17545:
                this.A0I = (long) d;
                return;
            case 21969:
                A05(i).A06 = (float) d;
                return;
            case 21970:
                A05(i).A07 = (float) d;
                return;
            case 21971:
                A05(i).A04 = (float) d;
                return;
            case 21972:
                A05(i).A05 = (float) d;
                return;
            case 21973:
                A05(i).A02 = (float) d;
                return;
            case 21974:
                A05(i).A03 = (float) d;
                return;
            case 21975:
                C1121Vz c1121VzA05 = A05(i);
                float f = (float) d;
                String[] strArr = A0u;
                if (strArr[4].charAt(26) != strArr[0].charAt(26)) {
                    A0u[6] = "GpGoD1bpW9Cr16bouccvZy2hl3WrTyfc";
                    c1121VzA05.A0B = f;
                    return;
                }
                throw new RuntimeException();
            case 21976:
                A05(i).A0C = (float) d;
                return;
            case 21977:
                A05(i).A00 = (float) d;
                return;
            case 21978:
                A05(i).A01 = (float) d;
                return;
            case 30323:
                A05(i).A0A = (float) d;
                return;
            case 30324:
                A05(i).A08 = (float) d;
                return;
            case 30325:
                A05(i).A09 = (float) d;
                return;
            default:
                return;
        }
    }

    public final void A0U(int i, int i2, WJ wj) throws IOException {
        int i3;
        int totalSamplesSize = 0;
        int i4 = 1;
        switch (i) {
            case Input.Keys.NUMPAD_EQUALS /* 161 */:
            case Input.Keys.NUMPAD_RIGHT_PAREN /* 163 */:
                if (this.A05 == 0) {
                    this.A06 = (int) this.A0h.A05(wj, false, true, 8);
                    this.A07 = this.A0h.A04();
                    this.A0D = C.TIME_UNSET;
                    this.A05 = 1;
                    this.A0n.A0d(0);
                }
                C1121Vz c1121Vz = this.A0P.get(this.A06);
                if (c1121Vz == null) {
                    wj.AJ9(i2 - this.A07);
                    this.A05 = 0;
                    return;
                }
                c1121Vz.A06();
                if (this.A05 == 1) {
                    A0E(wj, 3);
                    int i5 = (this.A0n.A0l()[2] & 6) >> 1;
                    int i6 = 255;
                    if (i5 != 0) {
                        A0E(wj, 4);
                        int timecode = this.A0n.A0l()[3];
                        this.A03 = (timecode & 255) + 1;
                        int[] iArr = this.A0f;
                        int timecode2 = this.A03;
                        this.A0f = A0P(iArr, timecode2);
                        if (i5 == 2) {
                            int timecode3 = this.A07;
                            int i7 = (i2 - timecode3) - 4;
                            int timecode4 = this.A03;
                            int i8 = i7 / timecode4;
                            int[] iArr2 = this.A0f;
                            int blockLacingSampleSize = this.A03;
                            Arrays.fill(iArr2, 0, blockLacingSampleSize, i8);
                        } else if (i5 != 1) {
                            if (i5 == 3) {
                                int i9 = 0;
                                int i10 = 4;
                                int readPosition = 0;
                                while (readPosition < this.A03 - i4) {
                                    this.A0f[readPosition] = totalSamplesSize;
                                    i10++;
                                    A0E(wj, i10);
                                    if (this.A0n.A0l()[i10 - 1] != 0) {
                                        long j = 0;
                                        int totalSamplesSize2 = 0;
                                        while (totalSamplesSize2 < 8) {
                                            int sampleIndex = 7 - totalSamplesSize2;
                                            int i11 = i4 << sampleIndex;
                                            int sampleIndex2 = i10 - 1;
                                            if ((this.A0n.A0l()[sampleIndex2] & i11) != 0) {
                                                int i12 = i10 - 1;
                                                i10 += totalSamplesSize2;
                                                String[] strArr = A0u;
                                                String str = strArr[3];
                                                String str2 = strArr[5];
                                                int lengthMask = str.charAt(31);
                                                if (lengthMask == str2.charAt(31)) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr2 = A0u;
                                                strArr2[1] = "kymoVNjauRIIYurZ1PYjonnN2KHGDV";
                                                strArr2[7] = "";
                                                A0E(wj, i10);
                                                int lengthMask2 = this.A0n.A0l()[i12];
                                                j = lengthMask2 & i6 & (~i11);
                                                for (int sampleIndex3 = i12 + 1; sampleIndex3 < i10; sampleIndex3++) {
                                                    j = (j << 8) | ((long) (this.A0n.A0l()[sampleIndex3] & i6));
                                                }
                                                if (readPosition > 0) {
                                                    j -= (1 << ((totalSamplesSize2 * 7) + 6)) - 1;
                                                    String[] strArr3 = A0u;
                                                    String str3 = strArr3[4];
                                                    String str4 = strArr3[0];
                                                    int iCharAt = str3.charAt(26);
                                                    int totalSamplesSize3 = str4.charAt(26);
                                                    if (iCharAt == totalSamplesSize3) {
                                                        throw new RuntimeException();
                                                    }
                                                    String[] strArr4 = A0u;
                                                    strArr4[3] = "q6Hzihia91GQdLAEd62mB34K5cq2yWea";
                                                    strArr4[5] = "TTdVzEgNvV2wnNlFFo3tMKXLnGvOVEe9";
                                                }
                                                if (j < -2147483648L && j <= 2147483647L) {
                                                    int totalSamplesSize4 = (int) j;
                                                    int[] iArr3 = this.A0f;
                                                    if (readPosition != 0) {
                                                        totalSamplesSize4 += this.A0f[readPosition - 1];
                                                    }
                                                    iArr3[readPosition] = totalSamplesSize4;
                                                    i9 += this.A0f[readPosition];
                                                    readPosition++;
                                                    i6 = 255;
                                                    totalSamplesSize = 0;
                                                    i4 = 1;
                                                } else {
                                                    throw Q6.A01(A06(578, 37, 70), null);
                                                }
                                            } else {
                                                totalSamplesSize2++;
                                                i4 = 1;
                                            }
                                        }
                                        if (j < -2147483648L) {
                                        }
                                        throw Q6.A01(A06(578, 37, 70), null);
                                    }
                                    throw Q6.A01(A06(951, 33, 6), null);
                                }
                                this.A0f[this.A03 - 1] = ((i2 - this.A07) - i10) - i9;
                            } else {
                                throw Q6.A01(A06(1141, 25, 39) + i5, null);
                            }
                        } else {
                            int byteValue = 0;
                            int i13 = 4;
                            String[] strArr5 = A0u;
                            String str5 = strArr5[4];
                            String str6 = strArr5[0];
                            int iCharAt2 = str5.charAt(26);
                            int totalSamplesSize5 = str6.charAt(26);
                            if (iCharAt2 != totalSamplesSize5) {
                                A0u[2] = "iApPxy5UqF";
                                for (int totalSamplesSize6 = 0; totalSamplesSize6 < this.A03 - 1; totalSamplesSize6++) {
                                    this.A0f[totalSamplesSize6] = 0;
                                    do {
                                        i13++;
                                        A0E(wj, i13);
                                        i3 = this.A0n.A0l()[i13 - 1] & 255;
                                        int[] iArr4 = this.A0f;
                                        iArr4[totalSamplesSize6] = iArr4[totalSamplesSize6] + i3;
                                    } while (i3 == 255);
                                    byteValue += this.A0f[totalSamplesSize6];
                                }
                                int[] iArr5 = this.A0f;
                                int i14 = this.A03 - 1;
                                int totalSamplesSize7 = this.A07;
                                iArr5[i14] = ((i2 - totalSamplesSize7) - i13) - byteValue;
                            } else {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        this.A03 = 1;
                        this.A0f = A0P(this.A0f, 1);
                        this.A0f[0] = (i2 - this.A07) - 3;
                    }
                    this.A0F = this.A0G + A03((this.A0n.A0l()[0] << 8) | (this.A0n.A0l()[1] & 255));
                    int timecode5 = c1121Vz.A0V;
                    int timecode6 = (timecode5 == 2 || (i == 163 && (this.A0n.A0l()[2] & 128) == 128)) ? 1 : 0;
                    int timecode7 = timecode6 != 0 ? 1 : 0;
                    this.A02 = timecode7;
                    this.A05 = 2;
                    this.A04 = 0;
                }
                if (i == 163) {
                    while (i < timecode) {
                        int[] iArr6 = this.A0f;
                        int timecode8 = this.A04;
                        int iA02 = A02(wj, c1121Vz, iArr6[timecode8], false);
                        long j2 = this.A0F;
                        int i15 = this.A04;
                        int timecode9 = c1121Vz.A0I;
                        long j3 = j2 + ((long) ((i15 * timecode9) / 1000));
                        int timecode10 = this.A02;
                        A0I(c1121Vz, j3, timecode10, iA02, 0);
                        this.A04++;
                        break;
                    }
                    this.A05 = 0;
                    return;
                }
                while (this.A04 < this.A03) {
                    this.A0f[this.A04] = A02(wj, c1121Vz, this.A0f[this.A04], true);
                    this.A04++;
                }
                return;
            case 165:
                if (this.A05 != 2) {
                    return;
                }
                A0H(this.A0P.get(this.A06), this.A01, wj, i2);
                return;
            case 16877:
                C1121Vz c1121VzA05 = A05(i);
                if (A0u[2].length() == 20) {
                    throw new RuntimeException();
                }
                A0u[6] = "x0XNXHtF7CIWG7yTOcdxbddrsHC5V629";
                A0J(c1121VzA05, wj, i2);
                return;
            case 16981:
                A0D(i);
                this.A0R.A0m = new byte[i2];
                wj.readFully(this.A0R.A0m, 0, i2);
                return;
            case 18402:
                byte[] bArr = new byte[i2];
                wj.readFully(bArr, 0, i2);
                A05(i).A0a = new C1085Um(1, bArr, 0, 0);
                return;
            case 21419:
                Arrays.fill(this.A0o.A0l(), (byte) 0);
                wj.readFully(this.A0o.A0l(), 4 - i2, i2);
                this.A0o.A0f(0);
                this.A0C = (int) this.A0o.A0Q();
                return;
            case 25506:
                A0D(i);
                this.A0R.A0j = new byte[i2];
                wj.readFully(this.A0R.A0j, 0, i2);
                return;
            case 30322:
                A0D(i);
                this.A0R.A0l = new byte[i2];
                wj.readFully(this.A0R.A0l, 0, i2);
                return;
            default:
                throw Q6.A01(A06(1126, 15, 43) + i, null);
        }
    }

    public final void A0V(int i, long j) throws Q6 {
        String strA06 = A06(42, 14, 27);
        switch (i) {
            case 131:
                A05(i).A0V = (int) j;
                return;
            case 136:
                A05(i).A0f = j == 1;
                return;
            case Input.Keys.NUMPAD_MULTIPLY /* 155 */:
                this.A0D = A03(j);
                return;
            case Input.Keys.NUMPAD_COMMA /* 159 */:
                A05(i).A0E = (int) j;
                return;
            case 176:
                A05(i).A0W = (int) j;
                return;
            case 179:
                A0C(i);
                this.A0T.A04(A03(j));
                return;
            case Input.Keys.F16 /* 186 */:
                A05(i).A0M = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                A05(i).A0R = (int) j;
                return;
            case 231:
                long jA03 = A03(j);
                String[] strArr = A0u;
                if (strArr[4].charAt(26) != strArr[0].charAt(26)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "N4wUezsqKMvSsh09xrDROdih0el4rf";
                    strArr2[7] = "";
                    this.A0G = jA03;
                    return;
                }
                A0u[6] = "gZA18wlZqGkVKVcbkcwQH6O765N5iGrw";
                this.A0G = jA03;
                return;
            case 238:
                this.A01 = (int) j;
                return;
            case 241:
                boolean z = this.A0d;
                String[] strArr3 = A0u;
                if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                    String[] strArr4 = A0u;
                    strArr4[3] = "Io3F5GpcwGeLsvVnH4RNXQOeF3DOTVj0";
                    strArr4[5] = "reFWPNfDPDIen75T2OsnmI6Hn5ySsbxR";
                    if (z) {
                        return;
                    }
                    A0C(i);
                    this.A0S.A04(j);
                    this.A0d = true;
                    return;
                }
                break;
            case 251:
                this.A0W = true;
                return;
            case 16871:
                A05(i).A0n = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                } else {
                    throw Q6.A01(A06(426, 16, 24) + j + strA06, null);
                }
            case 17029:
                if (j >= 1 && j <= 2) {
                    return;
                } else {
                    throw Q6.A01(A06(559, 19, 33) + j + strA06, null);
                }
            case 17143:
                if (j == 1) {
                    return;
                } else {
                    throw Q6.A01(A06(615, 16, 10) + j + strA06, null);
                }
            case 18401:
                if (j == 5) {
                    return;
                } else {
                    throw Q6.A01(A06(442, 15, 12) + j + strA06, null);
                }
            case 18408:
                if (j == 1) {
                    return;
                } else {
                    throw Q6.A01(A06(113, 22, 31) + j + strA06, null);
                }
            case 20529:
                if (j == 0) {
                    return;
                } else {
                    throw Q6.A01(A06(457, 21, 57) + j + strA06, null);
                }
            case 20530:
                if (j != 1) {
                    throw Q6.A01(A06(478, 21, 36) + j + strA06, null);
                }
                return;
            case 21420:
                this.A0K = this.A0M + j;
                return;
            case 21432:
                int i2 = (int) j;
                A0D(i);
                switch (i2) {
                    case 0:
                        this.A0R.A0U = 0;
                        return;
                    case 1:
                        this.A0R.A0U = 2;
                        return;
                    case 3:
                        this.A0R.A0U = 1;
                        return;
                    case 15:
                        this.A0R.A0U = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                A05(i).A0L = (int) j;
                return;
            case 21682:
                A05(i).A0K = (int) j;
                return;
            case 21690:
                C1121Vz c1121VzA05 = A05(i);
                String[] strArr5 = A0u;
                if (strArr5[1].length() != strArr5[7].length()) {
                    String[] strArr6 = A0u;
                    strArr6[3] = "a4JWGbvcHBxEuqFTNJyjkKzLLBks8zxi";
                    strArr6[5] = "V653rOPNcZ8n6p2drhLFQbJ4jSAS100h";
                    c1121VzA05.A0J = (int) j;
                    return;
                }
                String[] strArr7 = A0u;
                strArr7[1] = "SFiKSoumrDWrN654gSJjTAdOE1goia";
                strArr7[7] = "";
                c1121VzA05.A0J = (int) j;
                return;
            case 21930:
                A05(i).A0g = j == 1;
                return;
            case 21945:
                A0D(i);
                switch ((int) j) {
                    case 1:
                        this.A0R.A0F = 2;
                        return;
                    case 2:
                        this.A0R.A0F = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                A0D(i);
                int iA01 = ColorInfo.A01((int) j);
                if (iA01 == -1) {
                    return;
                }
                this.A0R.A0H = iA01;
                return;
            case 21947:
                A0D(i);
                this.A0R.A0h = true;
                int iA00 = ColorInfo.A00((int) j);
                if (iA00 == -1) {
                    return;
                }
                this.A0R.A0G = iA00;
                return;
            case 21948:
                A05(i).A0O = (int) j;
                return;
            case 21949:
                C1121Vz c1121VzA06 = A05(i);
                String[] strArr8 = A0u;
                if (strArr8[4].charAt(26) != strArr8[0].charAt(26)) {
                    String[] strArr9 = A0u;
                    strArr9[3] = "T0WP6ZFXgE6s8V8heT9wtEkD8f9NdjCM";
                    strArr9[5] = "7XePdUxt4aUcyCfjxSClX0QS1zLuSosx";
                    c1121VzA06.A0P = (int) j;
                    return;
                }
                throw new RuntimeException();
            case 21998:
                A05(i).A0N = (int) j;
                return;
            case 22186:
                A05(i).A0X = j;
                return;
            case 22203:
                A05(i).A0Y = j;
                return;
            case 25188:
                C1121Vz c1121VzA07 = A05(i);
                String[] strArr10 = A0u;
                if (strArr10[3].charAt(31) != strArr10[5].charAt(31)) {
                    String[] strArr11 = A0u;
                    strArr11[1] = "Cu1zz2XfEKQYvl96Y2e5xfLC0ajo7s";
                    strArr11[7] = "";
                    c1121VzA07.A0D = (int) j;
                    return;
                }
                break;
            case 30114:
                this.A0E = j;
                return;
            case 30321:
                A0D(i);
                switch ((int) j) {
                    case 0:
                        this.A0R.A0S = 0;
                        return;
                    case 1:
                        this.A0R.A0S = 1;
                        return;
                    case 2:
                        this.A0R.A0S = 2;
                        return;
                    case 3:
                        this.A0R.A0S = 3;
                        return;
                    default:
                        return;
                }
            case 2352003:
                A05(i).A0I = (int) j;
                return;
            case 2807729:
                this.A0O = j;
                return;
            default:
                return;
        }
        throw new RuntimeException();
    }

    public final void A0W(int i, long j, long j2) throws Q6 {
        A09();
        switch (i) {
            case Input.Keys.NUMPAD_ENTER /* 160 */:
                this.A0W = false;
                this.A0E = 0L;
                return;
            case 174:
                this.A0R = new C1121Vz();
                return;
            case Input.Keys.F17 /* 187 */:
                this.A0d = false;
                return;
            case 19899:
                this.A0C = -1;
                this.A0K = -1L;
                return;
            case 20533:
                A05(i).A0i = true;
                return;
            case 21968:
                A05(i).A0h = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                if (this.A0M == -1 || this.A0M == j) {
                    this.A0M = j;
                    this.A0N = j2;
                    return;
                }
                throw Q6.A01(A06(886, 39, 113), null);
            case 475249515:
                this.A0T = new C1562fc();
                this.A0S = new C1562fc();
                return;
            case 524531317:
                if (this.A0e) {
                    return;
                }
                if (this.A0s && this.A0H != -1) {
                    this.A0c = true;
                    return;
                } else {
                    this.A0Q.AID(new C1120Vy(this.A0J));
                    this.A0e = true;
                    return;
                }
        }
    }

    @MetaExoPlayerCustomization("Adding support for AR/VR TAGs")
    public final void A0X(int i, String str) throws Q6 {
        switch (i) {
            case 134:
                A05(i).A0d = str;
                return;
            case 17026:
                String strA06 = A06(1375, 4, 74);
                String[] strArr = A0u;
                if (strArr[3].charAt(31) == strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0u;
                strArr2[1] = "ZpQtQwhf10lxVfkk9mMvWEAcwosY1p";
                strArr2[7] = "";
                if (strA06.equals(str)) {
                    return;
                }
                String[] strArr3 = A0u;
                if (strArr3[3].charAt(31) == strArr3[5].charAt(31)) {
                    throw new RuntimeException();
                }
                A0u[2] = "ErKYIjeg";
                if (A06(1357, 8, 76).equals(str)) {
                    return;
                } else {
                    throw Q6.A01(A06(551, 8, 94) + str + A06(42, 14, 27), null);
                }
            case 17827:
                this.A0U = str;
                return;
            case 21358:
                A05(i).A0e = str;
                return;
            case 2274716:
                A05(i).A0o = str;
                return;
            default:
                return;
        }
    }

    public final boolean A0Y(int i) {
        if (i != 357149030) {
            String[] strArr = A0u;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[1] = "BSEqXCtR2L3q8w452lR0fLhAQtFc8c";
            strArr2[7] = "";
            if (i != 524531317 && i != 475249515 && i != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AA0(UL ul) {
        this.A0Q = ul;
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final int AGT(WJ wj, C1081Ug c1081Ug) throws IOException {
        this.A0X = false;
        boolean zAGW = true;
        while (zAGW) {
            boolean z = this.A0X;
            String[] strArr = A0u;
            if (strArr[3].charAt(31) == strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[1] = "Z1NgeQgdiHJR50jbQsNezzrBQqlcsU";
            strArr2[7] = "";
            if (z) {
                break;
            }
            zAGW = this.A0g.AGW(wj);
            if (zAGW && A0L(c1081Ug, wj.A8d())) {
                return 1;
            }
        }
        if (zAGW) {
            return 0;
        }
        for (int i = 0; i < i; i++) {
            C1121Vz c1121VzValueAt = this.A0P.valueAt(i);
            c1121VzValueAt.A06();
            c1121VzValueAt.A0E();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AIC(long j, long j2) {
        this.A0G = C.TIME_UNSET;
        this.A05 = 0;
        this.A0g.reset();
        this.A0h.A06();
        A0A();
        for (int i = 0; i < i; i++) {
            this.A0P.valueAt(i).A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final boolean AJB(WJ wj) throws IOException {
        return new W0().A01(wj);
    }
}
