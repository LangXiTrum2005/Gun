package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZW extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 71, 67, 83, 68, 79, 22, 67, 88, 82, 83, 68, 90, 79, 95, 88, 81, 22, 91, 83, 82, 95, 87, 22, 85, 89, 82, 83, 85, 69};
    }

    public ZW(Throwable th) {
        super(A00(0, 39, 69), th);
    }
}
