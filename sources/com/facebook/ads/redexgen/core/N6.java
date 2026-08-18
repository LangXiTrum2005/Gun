package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N6 extends AbstractC1628gh {
    public static byte[] A02;
    public static String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};
    public final /* synthetic */ N5 A00;
    public final /* synthetic */ C1995mo A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{67, 116, 116, 105, 116, 38, 99, 126, 99, 101, 115, 114, 111, 104, 97, 38, 103, 101, 114, 111, 105, 104, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 116, 112, 115, 118, 66, 77, 72, 80, 65, 86, 65, 64, 123, 71, 72, 77, 71, 79, 123, 64, 65, 72, 69, 93, 123, 73, 87, 2, 24, 52, 8, 25, cw.l, 10, 31, 2, 29, cw.l, 52, 10, 24, 52, 8, 31, 10, 52, 29, 89, 102, 125, 122, 98, 102, 118, 90, 119};
    }

    static {
        A01();
    }

    public N6(N5 n5, C1995mo c1995mo) {
        this.A00 = n5;
        this.A01 = c1995mo;
    }

    @Override // com.facebook.ads.redexgen.core.F4
    public final void ACH() {
        this.A00.A0G = true;
        if (this.A00.A0H) {
            this.A00.A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1628gh, com.facebook.ads.redexgen.core.F4
    public final void ACc(String str, Map<String, String> map) {
        C03962h c03962hA1c;
        this.A00.A04.A0F().A4F();
        Uri uriA00 = C5.A00(str);
        map.put(A00(22, 10, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE), AdPlacementType.BANNER.name());
        map.put(A00(80, 8, 122), this.A00.A0I);
        if (this.A00.A03 != null) {
            map.put(A00(59, 21, 2), String.valueOf(this.A00.A03.A1D()));
            map.put(A00(36, 23, 77), String.valueOf(this.A00.A03.A0a()));
        }
        M5 m5 = this.A00.A04;
        A7 a7 = this.A00.A05;
        String strA7E = this.A01.A7E();
        if (this.A00.A03 == null) {
            c03962hA1c = null;
        } else {
            c03962hA1c = this.A00.A03.A1c();
            if (A03[2].length() == 26) {
                throw new RuntimeException();
            }
            A03[2] = "FoTEC4l";
        }
        AbstractC03841v abstractC03841vA00 = C03851w.A00(m5, a7, strA7E, uriA00, map, c03962hA1c);
        EnumC03831u enumC03831uA0C = EnumC03831u.A09;
        if (abstractC03841vA00 != null) {
            try {
                this.A00.A04.A0F().A4C();
                enumC03831uA0C = abstractC03841vA00.A0C(null);
            } catch (Exception e) {
                Log.e(N5.A0L, A00(0, 22, 111), e);
            }
        }
        boolean z = ((abstractC03841vA00 instanceof N8) || (abstractC03841vA00 instanceof NA)) && D3.A0e(this.A00.A04, enumC03831uA0C, map);
        String strA00 = A00(32, 4, 123);
        if (A03[4].charAt(4) != 'E') {
            A03[7] = "PCr0bqP";
            if (!strA00.equals(uriA00.getScheme())) {
                return;
            }
        } else {
            A03[2] = "BYDZhEbuDQGN48ANB4gw";
            if (!strA00.equals(uriA00.getScheme())) {
                return;
            }
        }
        if (C03851w.A04(uriA00.getAuthority()) && this.A00.A00 != null && !z && enumC03831uA0C != EnumC03831u.A06) {
            N5 n5 = this.A00;
            String[] strArr = A03;
            if (strArr[3].length() != strArr[1].length()) {
                String[] strArr2 = A03;
                strArr2[6] = "91HK9zTWq2DffgxIC51QeSnJfgkGnhrl";
                strArr2[0] = "HjaNeaEM7xFgNIhJT0kTm10VojUFz4RT";
                n5.A00.ACU(this.A00);
                return;
            }
            String[] strArr3 = A03;
            strArr3[3] = "J3zZp4TimrWeATuA7QTEE5NBu";
            strArr3[1] = "qZL";
            n5.A00.ACU(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.F4
    public final void ADP() {
        this.A00.A04.A0F().A4G(this.A00.A02 != null);
        if (this.A00.A02 != null) {
            this.A00.A02.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1628gh, com.facebook.ads.redexgen.core.F4
    public final void AEN() {
        this.A00.A04.A0F().A4I();
        this.A00.A02.A09();
    }

    @Override // com.facebook.ads.redexgen.core.F4
    public final void AFo() {
    }
}
