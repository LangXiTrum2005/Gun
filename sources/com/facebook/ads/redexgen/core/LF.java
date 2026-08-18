package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class LF extends AbstractC1337bx {
    public static byte[] A01;
    public static String[] A02 = {"QUZtp6d2PVvxohxxHBY0lFVIZrOHPJmP", "NfxzKLWElZxETrhEeUBSDM4deWBqLSti", "M1wrkGT1p8fg9I16hadPO98y5LyXX3HA", "lshWtPbnAXBsXbgnJLDmxkjrZI", "6PixpSZW8UzyowqAm", "UIpIdTluG2bhvKFOHpQ9k0cfwSXrRmCx", "lSmcWeUXMp1pu4geeqYJMaSrMHF509BD", "gheUZ0KSYWPh4kTG81LfbEHF2a7TTHcT"};
    public final /* synthetic */ C0739Gj A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[6].charAt(28) != '0') {
                throw new RuntimeException();
            }
            A02[6] = "QE45n4HEQOiTUZDVXPk8ylx4JLny0ok5";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{59, 44, 64, 62, 48};
    }

    static {
        A01();
    }

    public LF(C0739Gj c0739Gj) {
        this.A00 = c0739Gj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(KY ky) {
        this.A00.A0B.AFZ(A00(0, 5, 92), this.A00.A03());
    }
}
