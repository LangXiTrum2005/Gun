package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WP {
    public static byte[] A05;
    public static String[] A06 = {"KHCt4frvDkKshICcUrq132zIrmtDdnSU", "NfmQTohX8ER0xRkghOCuc5NhbIvXt6sK", "", "LQAPDnufH1IbXJuWkKGdMQkSNtCiMLs6", "CYKeElTsYUvzx2jzIwklWkzXtzJ3PGrg", "AraRtnwsGm9vMrJxVcKOamDTh279HA2i", "eMrQ6EyYPQXepM9ear0xYLgK7RlUGwgn", "iGqindczD9XGJAcMytEcInY6pYjypdvq"};
    public int A00;
    public final InterfaceC1086Uo A01;
    public final C1087Up A02;
    public final WZ A03;
    public final C1124Wc A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr = A06;
            if (strArr[4].charAt(22) != strArr[0].charAt(22)) {
                throw new RuntimeException();
            }
            A06[6] = "tMzdqHyqHtX34y6x3xLDF3vxUsqaH2zl";
            bArrCopyOfRange[i4] = (byte) (i5 - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{127, -109, -126, -121, -115, 77, -110, -112, -109, -125, 75, -122, -126};
    }

    static {
        A01();
    }

    public WP(WZ wz, C1124Wc c1124Wc, InterfaceC1086Uo interfaceC1086Uo) {
        C1087Up c1087Up;
        this.A03 = wz;
        this.A04 = c1124Wc;
        this.A01 = interfaceC1086Uo;
        if (A00(0, 13, 20).equals(wz.A07.A0W)) {
            c1087Up = new C1087Up();
        } else {
            c1087Up = null;
        }
        this.A02 = c1087Up;
    }
}
