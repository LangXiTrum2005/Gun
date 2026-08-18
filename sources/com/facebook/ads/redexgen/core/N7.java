package com.facebook.ads.redexgen.core;

import android.net.Uri;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N7 extends AbstractC2023nG {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
    }

    static {
        A01();
        A03 = N7.class.getSimpleName();
    }

    public N7(C1828k1 c1828k1, A7 a7, String str, Uri uri, Map<String, String> mExtraData, AnonymousClass22 anonymousClass22, boolean z) {
        super(c1828k1, a7, str, anonymousClass22, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2023nG
    public final EnumC03831u A0D() {
        EnumC03831u enumC03831uA0G = EnumC03831u.A09;
        if (this.A03) {
            enumC03831uA0G = A0G();
        }
        A0E(this.A01, enumC03831uA0G);
        return enumC03831uA0G;
    }

    public final EnumC03831u A0G() {
        EnumC03831u enumC03831u = EnumC03831u.A09;
        try {
            C2.A0C(new C2(), ((AbstractC03841v) this).A00, C5.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((AbstractC03841v) this).A02);
            return enumC03831u;
        } catch (Exception unused) {
            String str = A00(0, 25, EnumC4719u30.JSON_ENCODE_ERROR_VALUE) + this.A00.toString();
            return EnumC03831u.A04;
        }
    }
}
