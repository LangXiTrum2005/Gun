package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class LG extends AbstractC1335bv {
    public static byte[] A01;
    public final /* synthetic */ C0739Gj A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{112, 108, 97, 121};
    }

    public LG(C0739Gj c0739Gj) {
        this.A00 = c0739Gj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C1336bw c1336bw) {
        this.A00.A04 = true;
        this.A00.A0B.AFZ(A00(0, 4, 106), this.A00.A03());
    }
}
