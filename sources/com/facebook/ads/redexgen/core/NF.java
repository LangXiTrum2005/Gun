package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NF extends AbstractC2030nN<EnumC03801r> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public NF(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2030nN
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C03741l A04(EnumC03801r enumC03801r) {
        return new C03741l(this, enumC03801r == null ? A00(0, 4, 114) : enumC03801r.A03());
    }
}
