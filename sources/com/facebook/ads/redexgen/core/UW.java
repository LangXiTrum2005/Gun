package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UW {
    public static byte[] A09;
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final List<byte[]> A08;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static UW A00(C1576fq c1576fq) throws Q6 {
        try {
            c1576fq.A0g(21);
            int iA0I = c1576fq.A0I() & 3;
            int iA0I2 = c1576fq.A0I();
            int i = 0;
            int iA09 = c1576fq.A09();
            for (int i2 = 0; i2 < iA0I2; i2++) {
                c1576fq.A0g(1);
                int iA0M = c1576fq.A0M();
                for (int i3 = 0; i3 < iA0M; i3++) {
                    int iA0M2 = c1576fq.A0M();
                    i += iA0M2 + 4;
                    c1576fq.A0g(iA0M2);
                }
            }
            c1576fq.A0f(iA09);
            byte[] bArr = new byte[i];
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            float f = 1.0f;
            String strA03 = null;
            for (int i10 = 0; i10 < iA0I2; i10++) {
                int iA0I3 = c1576fq.A0I() & 63;
                int iA0M3 = c1576fq.A0M();
                for (int i11 = 0; i11 < iA0M3; i11++) {
                    int iA0M4 = c1576fq.A0M();
                    System.arraycopy(AbstractC1078Ud.A03, 0, bArr, i4, AbstractC1078Ud.A03.length);
                    int length = i4 + AbstractC1078Ud.A03.length;
                    System.arraycopy(c1576fq.A0l(), c1576fq.A09(), bArr, length, iA0M4);
                    if (iA0I3 == 33 && i11 == 0) {
                        C1076Ua c1076UaA05 = AbstractC1078Ud.A05(bArr, length, length + iA0M4);
                        i5 = c1076UaA05.A0A;
                        i6 = c1076UaA05.A08;
                        i7 = c1076UaA05.A02;
                        i8 = c1076UaA05.A01;
                        i9 = c1076UaA05.A03;
                        f = c1076UaA05.A00;
                        strA03 = AbstractC1525f0.A03(c1076UaA05.A07, c1076UaA05.A0B, c1076UaA05.A06, c1076UaA05.A05, c1076UaA05.A0C, c1076UaA05.A04);
                    }
                    i4 = length + iA0M4;
                    c1576fq.A0g(iA0M4);
                }
            }
            return new UW(i == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iA0I + 1, i5, i6, f, strA03, i7, i8, i9);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw Q6.A01(A01(0, 25, 115), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{-65, -20, -20, -23, -20, -102, -22, -37, -20, -19, -29, -24, -31, -102, -62, -65, -48, -67, -102, -35, -23, -24, -32, -29, -31};
    }

    public UW(List<byte[]> initializationData, int i, int i2, int i3, float f, String str, int i4, int i5, int i6) {
        this.A08 = initializationData;
        this.A05 = i;
        this.A06 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A07 = str;
        this.A02 = i4;
        this.A01 = i5;
        this.A03 = i6;
    }
}
