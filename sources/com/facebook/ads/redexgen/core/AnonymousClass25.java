package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.25, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass25 {
    public static byte[] A04;
    public boolean A00;
    public final AnonymousClass26 A01;
    public final C1828k1 A02;
    public final JL A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, 26, 40, 40, 30, 36, 35, -43, 33, 36, 28, 28, 26, 25};
    }

    public abstract void A08(Map<String, String> map);

    public AnonymousClass25(C1828k1 c1828k1, AnonymousClass26 anonymousClass26, JL jl) {
        this.A02 = c1828k1;
        this.A01 = anonymousClass26;
        this.A03 = jl;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new FB().A03(this.A03).A05();
        A08(extraData);
        this.A00 = true;
        CC.A04(this.A02, A00(0, 17, 60));
        AnonymousClass26 anonymousClass26 = this.A01;
    }
}
