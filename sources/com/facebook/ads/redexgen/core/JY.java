package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JY {
    public static byte[] A07;
    public static String[] A08 = {"H9a6GPEeuBppqgml", "UMFfHf9K0rtxTnfS4GQ", "HJf7oQJhMr6BjfdBAkNXb1VX0FlaYu0s", "mblZ", "lDa8BWO3GNKgBVoNV1FydEibnHhzaqpi", "BpHqCYEOVY5", "fQPNbuq5zM2Vt99anBRO7vAhC8TCHPEC", "oGui3UnSaV6fb7qd5azTuEEp3mm97meQ"};
    public JP A05;
    public int A04 = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{4, 40, 49, 32, 36, 60, 36, 105, 59, 44, 61, 59, 32, 44, 58, 105, 36, 60, 58, 61, 105, 43, 44, 105, 43, 44, 61, 62, 44, 44, 39, 105, 120, 105, 40, 39, 45, 105, 120, 113};
        if (A08[3].length() != 4) {
            throw new RuntimeException();
        }
        A08[4] = "ylxMzgRnic8ELdWNUfQitMVfYj0C1DI2";
    }

    static {
        A01();
    }

    public final JY A02(int i) {
        this.A00 = i;
        return this;
    }

    public final JY A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 45));
    }

    public final JY A04(int i) {
        this.A02 = i;
        return this;
    }

    public final JY A05(int i) {
        this.A03 = i;
        return this;
    }

    public final JY A06(int i) {
        this.A04 = i;
        return this;
    }

    public final JY A07(JP jp) {
        this.A05 = jp;
        return this;
    }

    public final JY A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final JZ A09() {
        return new JZ(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
