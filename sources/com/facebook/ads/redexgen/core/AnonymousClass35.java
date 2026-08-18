package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.35, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass35 {
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
        A00 = new byte[]{11, 77, 81, 72, 73};
    }

    public static void A02(C1828k1 c1828k1, AbstractC1984md abstractC1984md, boolean z, AnonymousClass33 anonymousClass33) {
        if (!C05789m.A25(c1828k1)) {
            C05357t c05357t = new C05357t(c1828k1);
            C04042p c04042pA07 = abstractC1984md.A1b().A0F().A07();
            c05357t.A0d(new AF(abstractC1984md.A1g(), c1828k1.A0A()));
            if (c04042pA07 == null) {
                anonymousClass33.AET(AdError.CACHE_ERROR);
                return;
            }
            if (c04042pA07.A0O()) {
                anonymousClass33.AEU();
                return;
            }
            C05317p c05317p = new C05317p(c04042pA07.A0F(), abstractC1984md.A0r(), abstractC1984md.A0i());
            c05317p.A04 = true;
            c05317p.A03 = A00(0, 5, 86);
            switch (AnonymousClass32.A00[c04042pA07.A0A().ordinal()]) {
                case 1:
                case 2:
                    c05357t.A0X(c05317p);
                    break;
            }
            c05357t.A0b(new C05337r(abstractC1984md.A1e().A01(), -1, -1, abstractC1984md.A0r(), abstractC1984md.A0i()));
            c05357t.A0b(new C05337r(c04042pA07.A0E(), -1, -1, abstractC1984md.A0r(), abstractC1984md.A0i()));
            c05357t.A0W(new mQ(c1828k1, anonymousClass33, c05357t, c04042pA07, z), new C05287m(abstractC1984md.A0r(), abstractC1984md.A0i()));
            return;
        }
        anonymousClass33.AEU();
    }
}
