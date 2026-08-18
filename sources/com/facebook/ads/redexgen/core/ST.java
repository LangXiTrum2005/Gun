package com.facebook.ads.redexgen.core;

import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ST implements UC {
    public final int A00;
    public final int A01;
    public final C1576fq A02 = new C1576fq();
    public final C1590g4 A03;

    public ST(int i, C1590g4 c1590g4, int i2) {
        this.A00 = i;
        this.A03 = c1590g4;
        this.A01 = i2;
    }

    private UA A00(C1576fq c1576fq, long j, long j2) {
        int iA00;
        int iA01;
        int iA0A = c1576fq.A0A();
        long j3 = -1;
        long j4 = -1;
        long lastPcrTimeUsInRange = C.TIME_UNSET;
        while (c1576fq.A07() >= 188 && (iA01 = (iA00 = YU.A00(c1576fq.A0l(), c1576fq.A09(), iA0A)) + Input.Keys.F18) <= iA0A) {
            long jA01 = YU.A01(c1576fq, iA00, this.A00);
            if (jA01 != C.TIME_UNSET) {
                long jA06 = this.A03.A06(jA01);
                if (jA06 > j) {
                    if (lastPcrTimeUsInRange == C.TIME_UNSET) {
                        return UA.A04(jA06, j2);
                    }
                    return UA.A03(j2 + j3);
                }
                long endOfLastPacketPositionInStream = jA06 + 100000;
                if (endOfLastPacketPositionInStream > j) {
                    return UA.A03(((long) iA00) + j2);
                }
                j3 = iA00;
                lastPcrTimeUsInRange = jA06;
            }
            c1576fq.A0f(iA01);
            j4 = iA01;
        }
        if (lastPcrTimeUsInRange != C.TIME_UNSET) {
            return UA.A05(lastPcrTimeUsInRange, j2 + j4);
        }
        return UA.A03;
    }

    @Override // com.facebook.ads.redexgen.core.UC
    public final void AF2() {
        this.A02.A0i(AbstractC1600gE.A07);
    }

    @Override // com.facebook.ads.redexgen.core.UC
    public final UA AI2(WJ wj, long j) throws IOException {
        long jA8d = wj.A8d();
        int iMin = (int) Math.min(this.A01, wj.A8E() - jA8d);
        this.A02.A0d(iMin);
        wj.AG1(this.A02.A0l(), 0, iMin);
        return A00(this.A02, j, jA8d);
    }
}
