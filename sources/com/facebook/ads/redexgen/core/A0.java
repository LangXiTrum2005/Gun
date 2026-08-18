package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A0 implements AudienceNetworkExportedActivityApi {
    public static byte[] A01;
    public static String[] A02 = {"mk4JADweKGMdEipgs7lqzWCmp9MhwBVd", "7Ny", "iKbrrxCAW5LmmXQLv4pN0A2xOojW5LEh", "hTGooAwgeIivj8mmjwzyxJz5o5QVTAJv", "t2q", "TYEvFDV2ICGQhAA5rVoFfbgoEst1cigG", "6Z5Mtc9AK5a0redP3ZVrPDgigSlCVve8", "dEPXAz2Hd7rZMNq86xusU7gw49uZCQrL"};
    public final Activity A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -12, -6, 5, -8, -4, 5, -25, -10, -10, 5, -11, -8, -17, -21, -12, -6, -25, -6, -17, -11, -12, 5, -15, -21, -1, -44, -43, -45, -32, -62, -59, -32, -54, -59, -32, -52, -58, -38};
    }

    static {
        A01();
    }

    public A0(Activity activity) {
        this.A00 = activity;
    }

    private void A02(int i) {
        this.A00.setResult(i);
        this.A00.finish();
    }

    private boolean A03(C05919z c05919z) {
        String callingPackage = this.A00.getCallingPackage();
        if (callingPackage != null) {
            String callingPackage2 = c05919z.A03;
            if (callingPackage.equals(callingPackage2)) {
                if (A02[6].charAt(24) != 'N') {
                    String[] strArr = A02;
                    strArr[3] = "K8elIBMg7jYz2h1Vp3N7ST3gxgb7rcrL";
                    strArr[2] = "atbN7xR2A34bPDsarDq1XfYhUcdmo37f";
                    return true;
                }
                String[] strArr2 = A02;
                strArr2[3] = "WL8DJ1n8qMW41xfoDndW3QEL4VTWFS4X";
                strArr2[2] = "L472DFJOuggr64sYy3SVVGT8Lyt3cNtD";
                return true;
            }
        }
        A02(12);
        if (c05919z.A00 instanceof C1945ly) {
            ((C1945ly) c05919z.A00).A0F().A0F().AH1();
        }
        if (c05919z.A00 instanceof C1942lv) {
            InterfaceC03681f interfaceC03681fA0F = ((C1942lv) c05919z.A00).A0H().A0F();
            if (A02[6].charAt(24) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[3] = "KnmB7vQIkrX7k7dgjGlnkXpo8slRCHvd";
            strArr3[2] = "L31mVvLUBUTWDHfS0xNAbfc4Adshav9b";
            interfaceC03681fA0F.AH1();
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi
    public final void onCreate(Bundle bundle) {
        C1828k1 c1828k1A05 = C05056p.A05(this.A00, UUID.randomUUID().toString());
        if (this.A00.isTaskRoot()) {
            c1828k1A05.A0F().AGu();
            A02(10);
            return;
        }
        String stringExtra = this.A00.getIntent().getStringExtra(A00(26, 13, 64));
        if (stringExtra == null) {
            c1828k1A05.A0F().AGx();
            A02(11);
            return;
        }
        C1774j9 c1774j9A00 = C1774j9.A00();
        String[] strArr = A02;
        String adId = strArr[3];
        if (adId.charAt(2) == strArr[2].charAt(2)) {
            throw new RuntimeException();
        }
        A02[6] = "lksFSMsleDiju0zPRojKCtBItYjbAveN";
        C05919z c05919zA04 = c1774j9A00.A04(stringExtra);
        C3G c3g = c05919zA04 != null ? c05919zA04.A00 : null;
        if (c05919zA04 != null && (c3g instanceof C1942lv)) {
            boolean zA03 = A03(c05919zA04);
            String[] strArr2 = A02;
            String adId2 = strArr2[3];
            if (adId2.charAt(2) == strArr2[2].charAt(2)) {
                throw new RuntimeException();
            }
            A02[6] = "e1bxVkSqO5M4Y9q0gpYlqAB3DYjxjVYF";
            if (!zA03) {
                return;
            }
            C1942lv c1942lv = (C1942lv) c3g;
            c1942lv.A0G().A01().A0J(this.A00);
            c1942lv.A0M(this.A00.getIntent().getIntExtra(A00(0, 26, 101), -1), 0L);
        } else if (c05919zA04 != null && (c3g instanceof C1945ly)) {
            if (!A03(c05919zA04)) {
                return;
            }
            C1945ly c1945ly = (C1945ly) c3g;
            c1945ly.A0E().A05().A0J(this.A00);
            c1945ly.A0J();
        } else {
            c1828k1A05.A0F().AHO();
            A02(13);
            return;
        }
        this.A00.setResult(-1);
        this.A00.finish();
    }
}
