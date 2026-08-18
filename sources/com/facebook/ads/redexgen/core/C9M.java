package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C9M {
    public static byte[] A00;
    public static String[] A01 = {"DnTt6XIWuAOQU1Yv6ovRwSY", "69qI84ufJ2UhBtkQx2IBHzZ", "lNRa3H", "2y2Uq0vrRuc5d5uHsu4hqSSezWuXbHLJ", "zUBzfUPcj8uIEo8tGSc", "tyrfQSxRYtG07uuggB4oX54vdLL3Tqsi", "aO8Ix6JCuD3GiDZZv02FTTQkozyjIQFp", "pMzofq8cn4xP4Da44trMpLQAQtlXLUTp"};

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        String[] strArr = A01;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A01[4] = "";
        A00 = new byte[]{3, 20, 18, 30, 3, 21, 46, 21, cw.n, 5, cw.n, 19, cw.n, 2, 20};
    }

    static {
        A03();
    }

    public static C9O A00(C1827k0 c1827k0) {
        try {
            return new C1792jR(c1827k0);
        } catch (IOException e) {
            c1827k0.A08().AAu(A02(0, 15, 104), AbstractC05418a.A2K, new C05428b(e));
            return new C1795jU();
        }
    }

    public static M2 A01(C1827k0 c1827k0) {
        return new M2(c1827k0);
    }
}
