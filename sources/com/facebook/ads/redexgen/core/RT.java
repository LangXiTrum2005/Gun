package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RT {
    public static byte[] A04;
    public static final RT A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{103, 107, 40, 35, 42, 37, 37, 46, 39, 8, 36, 62, 37, 63, 118, 71, 75, cw.l, 5, 8, 4, cw.m, 2, 5, 12, 86, 121, 77, 92, 81, 87, 126, 87, 74, 85, 89, 76, 99, 75, 89, 85, 72, 84, 93, 106, 89, 76, 93, 5};
    }

    static {
        A01();
        A05 = new RT(-1, -1, -1);
    }

    public RT(int i, int i2, int i3) {
        int iA06;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (AbstractC1600gE.A15(i3)) {
            iA06 = AbstractC1600gE.A06(i3, i2);
        } else {
            iA06 = -1;
        }
        this.A00 = iA06;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RT)) {
            return false;
        }
        RT rt = (RT) obj;
        return this.A03 == rt.A03 && this.A01 == rt.A01 && this.A02 == rt.A02;
    }

    public final int hashCode() {
        return AbstractC0942Or.A00(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return A00(26, 23, 15) + this.A03 + A00(0, 15, 124) + this.A01 + A00(15, 11, 92) + this.A02 + ']';
    }
}
