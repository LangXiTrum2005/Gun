package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class T3 implements UK {
    public static String[] A03 = {"k8efZyH2VZEed70VLscwWTxfJYGMVXVb", "wHDs8w930P9ocyTkrTcKOrG3eLiipGLC", "lKULTMn9JpRtgDkRsaNluJLDdz7ZT8OO", "5s8G5NdYvsM7b0toSlcxZ0vQatY4SuPv", "WfgK65BOmYafTQD8A4urAIlqtsB84e2H", "MaRqxL8TffhVo41RbVsRd7HFqfHWsY3P", "fTfTVmdZOlhjJnEKvpB38vYa4a1ILvoE", "0yXjXgEhGhHvFR6h00zEX6GIj3lIsxDv"};
    public static final UO A04 = new UO() { // from class: com.facebook.ads.redexgen.X.T4
        @Override // com.facebook.ads.redexgen.core.UO
        public final UK[] A5D() {
            return T3.A00();
        }

        @Override // com.facebook.ads.redexgen.core.UO
        public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
            return UN.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final T2 A01 = new T2();
    public final C1576fq A02 = new C1576fq(16384);

    public static /* synthetic */ UK[] A00() {
        return new UK[]{new T3()};
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AA0(UL ul) {
        this.A01.A5S(ul, new YS(0, 1));
        ul.A6E();
        ul.AID(new C1120Vy(C.TIME_UNSET));
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final int AGT(WJ wj, C1081Ug c1081Ug) throws IOException {
        int i = wj.read(this.A02.A0l(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.A02.A0f(0);
        this.A02.A0e(i);
        if (!this.A00) {
            this.A01.AFy(0L, 4);
            this.A00 = true;
        }
        this.A01.A50(this.A02);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AIC(long j, long j2) {
        this.A00 = false;
        this.A01.AIB();
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final boolean AJB(WJ wj) throws IOException {
        C1576fq c1576fq = new C1576fq(10);
        int i = 0;
        while (true) {
            wj.AG1(c1576fq.A0l(), 0, 10);
            c1576fq.A0f(0);
            if (c1576fq.A0K() != 4801587) {
                break;
            }
            c1576fq.A0g(3);
            int iA0H = c1576fq.A0H();
            i += iA0H + 10;
            wj.A3x(iA0H);
        }
        wj.AHr();
        wj.A3x(i);
        int i2 = i;
        int i3 = 0;
        while (true) {
            wj.AG1(c1576fq.A0l(), 0, 7);
            c1576fq.A0f(0);
            int headerPosition = c1576fq.A0M();
            if (headerPosition != 44096 && headerPosition != 44097) {
                i3 = 0;
                wj.AHr();
                i2++;
                if (i2 - i >= 8192) {
                    return false;
                }
                wj.A3x(i2);
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int headerPosition2 = U5.A02(c1576fq.A0l(), headerPosition);
                if (headerPosition2 == -1) {
                    return false;
                }
                int validFramesCount = headerPosition2 - 7;
                String[] strArr = A03;
                if (strArr[5].charAt(15) != strArr[2].charAt(15)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[4] = "Bc5WMO8E7iY5XFjlt9vwYcph2j6f4wHk";
                strArr2[0] = "Lewh02qYfPWy0Fg4Pvt6K4OTLmpFDVQA";
                wj.A3x(validFramesCount);
            }
        }
    }
}
