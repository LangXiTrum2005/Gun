package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class MJ {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static final Random A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{39, 0, 8, cw.k, 4, 5, 65, 21, cw.l, 65, 19, 4, 21, 19, 8, 4, 23, 4, 65, 44, 4, 5, 8, 0, 39, cw.l, 19, 12, 0, 21, 73, 100, 115, 110, 68, 121, 110, 84, 117, 104, 109, 9, 43, 54, 33, 32, 116, 10, 45, 56, 45, 44, 42, 126, 72, 89, cw.k, 108, 100, cw.k, 107, 127, 110, cw.k, 78, 66, 67, 75, 68, 74, 88, 95, 76, 89, 68, 66, 67, cw.k, 89, 66, cw.k, 28, 59, cw.k, 28, 72, 41, 33, 72, 46, 58, 43, 72, 30, 1, 12, cw.k, 7, 72, 12, 29, 26, 9, 28, 1, 7, 6, 72, 28, 7, 72, 77, 12, 55, 58, 54, 56, 55, 43, 57, 36, 32, 40, 34, 56, 57, 18, 57, 63, 52, 36, 35, 42, 18, 57, 34, 18, 43, 36, 35, 41, 18, 62, 40, 42, 32, 40, 35, 57, 18, 36, 35, 18, 34, 36, 33, 17, 2, 9, 3, 8, 21, 73, 20, 2, 4, 74, 6, cw.l, 1, 21, 4, 74, 19, 21, 6, 9, 20, 1, 2, 21, 74, 21, 2, 22, 18, 2, 20, 19, 73, 17, 6, 11, 18, 2, cw.m, 28, 23, 29, 22, 11, 87, 10, 28, 26, 84, 24, cw.n, 31, 11, 26, 84, cw.m, cw.n, 29, 28, 22, 84, 29, 12, 11, 24, cw.k, cw.n, 22, 23, 87, cw.m, 24, 21, 12, 28, 113, 111, 98, 114, 110};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(EnumC4719u30.JSON_ENCODE_ERROR_VALUE, 37, 71);
        A03 = new Random();
    }

    public static int A00(int i, int i2) {
        if (i2 != 0) {
            return (int) ((Math.pow(2.0d, i - 1) * ((double) i2) * 1000.0d) + ((double) A03.nextInt(2000)));
        }
        return (int) Math.min((((long) (i - 1)) * 1000) + 500, 5000L);
    }

    public static void A03(C0889Mg c0889Mg, MediaFormat mediaFormat) {
        String strA01 = A01(0, 30, 107);
        String strA02 = A01(30, 11, 11);
        if (!c0889Mg.A01) {
            return;
        }
        try {
            if (MH.A02()) {
                if (c0889Mg.A0O && !MH.A03(mediaFormat.getInteger(A01(232, 5, 12)), mediaFormat.getInteger(A01(113, 6, 85)))) {
                    return;
                }
                long j = c0889Mg.A00;
                if (j > 0) {
                    mediaFormat.setLong(A01(195, 37, 115), j);
                    L4.A01(strA02, A01(82, 31, 98), Long.valueOf(j));
                }
                mediaFormat.setInteger(A01(Input.Keys.NUMPAD_SUBTRACT, 39, 109), 1);
                L4.A00(strA02, A01(53, 29, 39));
            }
        } catch (ClassCastException e) {
            L4.A02(strA02, strA01, e);
        } catch (NullPointerException e2) {
            L4.A02(strA02, strA01, e2);
        }
    }

    public static boolean A04(C0889Mg c0889Mg, int i, int i2, int i3, int i4) {
        if (c0889Mg.A01 && c0889Mg.A0O && MH.A03(i, i2) != MH.A03(i3, i4)) {
            return true;
        }
        return false;
    }
}
