package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class LC extends AbstractC1341c1 {
    public static byte[] A01;
    public final /* synthetic */ C0739Gj A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, 25, 4};
    }

    public LC(C0739Gj c0739Gj) {
        this.A00 = c0739Gj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C1342c2 c1342c2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0737Gh(this));
        this.A00.A0B.AFZ(A00(0, 5, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), this.A00.A03());
    }
}
