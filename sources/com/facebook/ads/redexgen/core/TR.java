package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TR extends AbstractC1134Wm {
    public static byte[] A05;
    public static String[] A06 = {"OSBuxA8zEnRiolB6cG4uiPECo0WwUmkD", "", "xxcpUJPnTVYqEuTHrwYVOjHOAxUZFuGN", "poU66SInsspskoUBYHR1JtfFAGzPXbU6", "7pDXU75iEa8PyIUpn3YZlzs2rDl8sX26", "S76AnDIrtBEeNrQVDfr12EH7dZmda5WJ", "B8HbVAhEW7WC60T6Eda", "VpVh4192C3aIK0mfoZM1laVAC0HKAzJR"};
    public int A00;
    public C1090Us A01;
    public C1092Uu A02;
    public C1135Wn A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1135Wn A02(C1576fq c1576fq) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC1093Uv.A06(c1576fq);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC1093Uv.A04(c1576fq);
            return null;
        }
        C1092Uu c1092Uu = this.A02;
        C1090Us c1090Us = this.A01;
        byte[] bArr = new byte[c1576fq.A0A()];
        System.arraycopy(c1576fq.A0l(), 0, bArr, 0, c1576fq.A0A());
        C1091Ut[] c1091UtArrA0E = AbstractC1093Uv.A0E(c1576fq, c1092Uu.A05);
        return new C1135Wn(c1092Uu, c1090Us, bArr, c1091UtArrA0E, AbstractC1093Uv.A00(c1091UtArrA0E.length - 1));
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{23, 3, 18, 31, 25, 89, 0, 25, 4, 20, 31, 5};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C1135Wn c1135Wn) {
        if (!c1135Wn.A04[A00(b, c1135Wn.A00, 1)].A03) {
            int modeNumber = c1135Wn.A02.A03;
            return modeNumber;
        }
        C1092Uu c1092Uu = c1135Wn.A02;
        if (A06[5].charAt(14) != 'Q') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "ty7LcGOnA759j2s1NaQCjDuGhoB8VzM6";
        strArr[2] = "FC8vzAHnHatKcIVILTws19eQHI2zvHfe";
        int modeNumber2 = c1092Uu.A04;
        return modeNumber2;
    }

    public static void A05(C1576fq c1576fq, long j) {
        if (c1576fq.A08() < c1576fq.A0A() + 4) {
            c1576fq.A0i(Arrays.copyOf(c1576fq.A0l(), c1576fq.A0A() + 4));
        } else {
            c1576fq.A0e(c1576fq.A0A() + 4);
        }
        byte[] bArrA0l = c1576fq.A0l();
        bArrA0l[c1576fq.A0A() - 4] = (byte) (j & 255);
        bArrA0l[c1576fq.A0A() - 3] = (byte) ((j >>> 8) & 255);
        bArrA0l[c1576fq.A0A() - 2] = (byte) ((j >>> 16) & 255);
        bArrA0l[c1576fq.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C1576fq c1576fq) {
        try {
            return AbstractC1093Uv.A0C(1, c1576fq, true);
        } catch (Q6 unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1134Wm
    public final long A0E(C1576fq c1576fq) {
        int i = 0;
        if ((c1576fq.A0l()[0] & 1) == 1) {
            return -1L;
        }
        int iA01 = A01(c1576fq.A0l()[0], (C1135Wn) AbstractC1517es.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + iA01) / 4;
        }
        A05(c1576fq, i);
        this.A04 = true;
        this.A00 = iA01;
        return i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1134Wm
    public final void A0F(long j) {
        super.A0F(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1134Wm
    public final void A0I(boolean z) {
        super.A0I(z);
        if (z) {
            if (A06[5].charAt(14) != 'Q') {
                throw new RuntimeException();
            }
            A06[5] = "KAtjHSILaIST5YQV0zAYcVVXx1PQzuJl";
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1134Wm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0J(C1576fq c1576fq, long j, C1133Wl c1133Wl) throws IOException {
        if (this.A03 != null) {
            AbstractC1517es.A01(c1133Wl.A00);
            return false;
        }
        this.A03 = A02(c1576fq);
        if (this.A03 == null) {
            return true;
        }
        C1135Wn c1135Wn = this.A03;
        C1092Uu c1092Uu = c1135Wn.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c1092Uu.A09);
        codecInitializationData.add(c1135Wn.A03);
        c1133Wl.A00 = new P5().A11(A03(0, 12, 83)).A0a(c1092Uu.A02).A0j(c1092Uu.A00).A0b(c1092Uu.A05).A0m(c1092Uu.A06).A12(codecInitializationData).A0v(AbstractC1093Uv.A02(MetaExoPlayerCustomizedCollections.A02(c1135Wn.A01.A02))).A14();
        return true;
    }
}
