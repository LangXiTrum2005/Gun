package com.facebook.ads.redexgen.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum K0 {
    A03(A01(37, 3, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE)),
    A04(A01(40, 7, 55));

    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{48, 50, 58, 108, 75, 83, 68, 73, 76, 65, 5, 86, 64, 87, 83, 64, 87, 5, 87, 64, 86, 85, 74, 75, 86, 64, 31, 5, 0, 86, 51, 40, 45, 40, 41, 49, 40, 106, 104, 96, 55, 44, 41, 44, 45, 53, 44};
    }

    static {
        A02();
    }

    K0(String str) {
        this.A00 = str;
    }

    public static K0 A00(String str) {
        for (K0 k0 : values()) {
            if (k0.A00.equals(str)) {
                return k0;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 80), str));
    }
}
