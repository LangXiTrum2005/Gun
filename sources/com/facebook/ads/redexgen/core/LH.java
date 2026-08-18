package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class LH extends AbstractC1333bt {
    public static byte[] A01;
    public final /* synthetic */ C0739Gj A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{53, 55, 42, 53, 38, 55, 42, 41};
    }

    public LH(C0739Gj c0739Gj) {
        this.A00 = c0739Gj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C1334bu c1334bu) {
        this.A00.A03 = true;
        this.A00.A0B.AFZ(A00(0, 8, 73), this.A00.A03());
    }
}
