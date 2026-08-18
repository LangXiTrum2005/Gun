package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8O {
    public static byte[] A03;
    public final String A00;
    public final String A01;
    public final Map<String, String> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{8, 101, 2, 0, 20, 6, 9, 21, 62, 4, 25, 2, 4, 17, 21, 8, cw.l, cw.m, 29, 26, cw.m, cw.k, 5, 26, 28, cw.m, cw.k, 11};
    }

    public C8O(String str, Map<String, String> mStaticEnvironmentData) {
        this(str, mStaticEnvironmentData, false);
    }

    public C8O(String str, Map<String, String> map, boolean z) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = z ? A00(1, 1, 37) : A00(0, 1, 73);
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap();
        map.put(A00(18, 10, 31), this.A01);
        map.put(A00(2, 16, 16), this.A00);
        Map<String, String> data = this.A02;
        map.putAll(data);
        return map;
    }
}
