package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.Surface;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class J3 {
    public static byte[] A02;
    public final C0676Dy A00;
    public final C0971Pu A01 = new C0971Pu();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, cw.n, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public J3(C1828k1 c1828k1) {
        InterfaceC1408d6 trackSelectionFactory = new QX(this.A01);
        C04845u c04845u = new C04845u(trackSelectionFactory);
        PC loadControl = new C1205Zh();
        this.A00 = OZ.A00(new C1199Zb(c1828k1), c04845u, loadControl, this.A01);
    }

    public static String A01(Z1 z1) {
        boolean z = z1 instanceof EK;
        String strA00 = A00(36, 2, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        String strA01 = A00(0, 14, 108);
        if (z) {
            EK ek = (EK) z1;
            return A00(55, 11, 8) + ek.A03 + A00(14, 22, 98) + ek.A02 + strA01 + ek.getCause() + strA00;
        }
        return A00(41, 14, 99) + z1.getMessage() + strA01 + z1.getCause() + strA00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7U();
    }

    public final long A07() {
        return this.A00.A7i();
    }

    public final J1 A08() {
        ZM vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new J1(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f) {
        this.A00.A0M(f);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1827k0 c1827k0, Uri uri) {
        if (C05789m.A2p(c1827k0, A03())) {
            J7 cacheManager = J7.A01(c1827k0);
            InterfaceC1437dZ cachedDataSourceFactory = cacheManager.A0H(c1827k0);
            this.A00.A0Q(new C7K(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC1280az mediaSource = new C7K(new C0970Pt(c1827k0, AbstractC1600gE.A0j(c1827k0, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(J0 j0) {
        this.A00.A0O(new C1270ap(this, j0));
    }

    public final void A0H(J2 j2) {
        this.A00.A0P(new C0763Hh(this, j2));
    }

    public final void A0I(boolean z) {
        this.A00.A0S(z);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
