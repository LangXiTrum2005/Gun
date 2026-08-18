package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CL {
    public static byte[] A05;
    public static String[] A06 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC1984md A02;
    public final C1828k1 A03;
    public final CJ A04;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 91, 94, 84, 92, 104, 68, 88, 66, 69, 84, 82};
    }

    static {
        A03();
    }

    public CL(C1828k1 c1828k1, AbstractC1984md abstractC1984md, CJ cj) {
        this.A03 = c1828k1;
        this.A04 = cj;
        this.A02 = abstractC1984md;
    }

    public static CL A01(C1828k1 c1828k1, AbstractC1984md abstractC1984md, CJ cj) {
        Object creativeAsCtaLoggingHelper = c1828k1.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new CL(c1828k1, abstractC1984md, cj);
            c1828k1.A0P(creativeAsCtaLoggingHelper);
        }
        return (CL) creativeAsCtaLoggingHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(String str, C03962h c03962h, String str2) {
        Map<String, String> mapA05 = new FB().A03(null).A02(null).A05();
        mapA05.put(A02(0, 12, 53), str);
        this.A03.A0A().AB3(str2, mapA05);
        if (c03962h != null) {
            C03962h.A06(c03962h, this.A03);
        }
        if (C05789m.A2L(this.A03)) {
            HashMap map = new HashMap();
            map.put(AbstractC2023nG.A04, Boolean.TRUE.toString());
            map.put(AbstractC2023nG.A05, Boolean.TRUE.toString());
            map.put(AbstractC2023nG.A06, Boolean.TRUE.toString());
            this.A03.A0A().ABC(str2, map);
        }
        this.A04.ADz();
    }

    private void A06(String str, C03962h c03962h, String str2, long j) {
        this.A00 = true;
        this.A01.postDelayed(new CI(this, str, c03962h, str2), j);
    }

    public static boolean A07(C1828k1 c1828k1) {
        return C05789m.A1Z(c1828k1) && C2.A0H(c1828k1);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public final CK A0A(AbstractC1984md abstractC1984md) {
        boolean z;
        if (C05789m.A1f(this.A03)) {
            z = abstractC1984md.A1D() && A07(this.A03);
            return new CK(z, z);
        }
        boolean zA1D = abstractC1984md.A1D();
        if (zA1D) {
            boolean zA07 = A07(this.A03);
            String[] strArr = A06;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
            z = zA07;
        }
        return new CK(zA1D, z);
    }

    public final void A0B() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }

    public final void A0C(String str, C03962h c03962h, String str2) {
        A0B();
        A06(str, c03962h, str2, this.A02 != null ? this.A02.A0Z() : 2000L);
    }

    public final void A0D(String str, C03962h c03962h, String str2) {
        A0B();
        A06(str, c03962h, str2, this.A02 != null ? this.A02.A0a() : 2000L);
    }
}
