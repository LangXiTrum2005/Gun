package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SZ implements UC {
    public static String[] A02 = {"ywfQGuZmxKRq9DiGhUZ7kYscmDK1yQgG", "yyTvJSC6Z0r54pydRAhxUJP1azmwXDOJ", "gvuMstIQJvALA6WtbPPaNh31qHMDdkoF", "E0QXldRoWhYO8ektdPBMo", "DFNHE1wHLkZv4p7cWSMUCPCbnnT4PMb", "g4TxeGeqbF4zqLZ4UkHsV", "MUEU7huTxB7R4VrIhIroeSO9nSrJhyxH", "rSptlWUj73Sv"};
    public final C1576fq A00;
    public final C1590g4 A01;

    public SZ(C1590g4 c1590g4) {
        this.A01 = c1590g4;
        this.A00 = new C1576fq();
    }

    private UA A00(C1576fq c1576fq, long j, long j2) {
        int iA09 = -1;
        int nextStartCode = -1;
        long lastScrTimeUsInRange = C.TIME_UNSET;
        while (c1576fq.A07() >= 4) {
            if (SX.A00(c1576fq.A0l(), c1576fq.A09()) != 442) {
                String[] strArr = A02;
                if (strArr[6].charAt(22) == strArr[2].charAt(22)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "a3lqFHSS3DslexIzjbNJjqusIrL4N5Nk";
                strArr2[1] = "njWKM5PygQIPU1OFJXB97dIi4ZCaVTzR";
                c1576fq.A0g(1);
            } else {
                c1576fq.A0g(4);
                long jA06 = YI.A06(c1576fq);
                if (jA06 != C.TIME_UNSET) {
                    long jA07 = this.A01.A06(jA06);
                    String[] strArr3 = A02;
                    String str = strArr3[3];
                    String str2 = strArr3[5];
                    int nextStartCode2 = str.length();
                    if (nextStartCode2 != str2.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A02;
                    strArr4[6] = "F6PF0LTzuWjaRJS9VbMfX0iR1WEuDh7M";
                    strArr4[2] = "m2L6Os1MLtbtnvaHGpyPTkzcprKslVk7";
                    if (jA07 > j) {
                        if (lastScrTimeUsInRange == C.TIME_UNSET) {
                            return UA.A04(jA07, j2);
                        }
                        return UA.A03(((long) iA09) + j2);
                    }
                    long j3 = 100000 + jA07;
                    String[] strArr5 = A02;
                    if (strArr5[6].charAt(22) != strArr5[2].charAt(22)) {
                        String[] strArr6 = A02;
                        strArr6[0] = "W7u44J0wrnlSYvhpCW69qwLkgdUWDqtk";
                        strArr6[1] = "UTLGkfIHUt9GdIVHNcFUM3AMnDAtXDZU";
                        if (j3 > j) {
                            return UA.A03(((long) c1576fq.A09()) + j2);
                        }
                        lastScrTimeUsInRange = jA07;
                        iA09 = c1576fq.A09();
                    } else {
                        if (j3 > j) {
                            return UA.A03(((long) c1576fq.A09()) + j2);
                        }
                        lastScrTimeUsInRange = jA07;
                        iA09 = c1576fq.A09();
                    }
                }
                A01(c1576fq);
                nextStartCode = c1576fq.A09();
            }
        }
        if (lastScrTimeUsInRange != C.TIME_UNSET) {
            return UA.A05(lastScrTimeUsInRange, ((long) nextStartCode) + j2);
        }
        return UA.A03;
    }

    public static void A01(C1576fq c1576fq) {
        int systemHeaderLength = c1576fq.A0A();
        if (c1576fq.A07() < 10) {
            c1576fq.A0f(systemHeaderLength);
            return;
        }
        c1576fq.A0g(9);
        int limit = c1576fq.A0I();
        int packStuffingLength = limit & 7;
        int limit2 = c1576fq.A07();
        if (limit2 < packStuffingLength) {
            c1576fq.A0f(systemHeaderLength);
            return;
        }
        c1576fq.A0g(packStuffingLength);
        int limit3 = c1576fq.A07();
        if (limit3 < 4) {
            c1576fq.A0f(systemHeaderLength);
            return;
        }
        byte[] bArrA0l = c1576fq.A0l();
        int limit4 = c1576fq.A09();
        int iA00 = SX.A00(bArrA0l, limit4);
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[5];
        int packStuffingLength2 = str.length();
        int limit5 = str2.length();
        if (packStuffingLength2 == limit5) {
            String[] strArr2 = A02;
            strArr2[3] = "W4uQhL8jWJHqZgCUKILgt";
            strArr2[5] = "2aDxXS5ryuBYsCblpfdei";
            if (iA00 == 443) {
                c1576fq.A0g(4);
                int iA0M = c1576fq.A0M();
                String[] strArr3 = A02;
                String str3 = strArr3[0];
                String str4 = strArr3[1];
                int packStuffingLength3 = str3.charAt(21);
                int limit6 = str4.charAt(21);
                if (packStuffingLength3 != limit6) {
                    String[] strArr4 = A02;
                    strArr4[7] = "UaHxHuh5g4Eu";
                    strArr4[4] = "Mvhk2ZSMcAgbtShce8DOetPAv4tTvpu";
                    int limit7 = c1576fq.A07();
                    if (limit7 < iA0M) {
                        c1576fq.A0f(systemHeaderLength);
                        return;
                    }
                    c1576fq.A0g(iA0M);
                }
            }
            while (limit >= 4) {
                byte[] bArrA0l2 = c1576fq.A0l();
                int limit8 = c1576fq.A09();
                int packStuffingLength4 = SX.A00(bArrA0l2, limit8);
                if (packStuffingLength4 == 442 || packStuffingLength4 == 441 || (packStuffingLength4 >>> 8) != 1) {
                    return;
                }
                c1576fq.A0g(4);
                if (c1576fq.A07() < 2) {
                    c1576fq.A0f(systemHeaderLength);
                    return;
                }
                int nextStartCode = c1576fq.A0M();
                int packStuffingLength5 = c1576fq.A0A();
                int limit9 = c1576fq.A09();
                c1576fq.A0f(Math.min(packStuffingLength5, limit9 + nextStartCode));
            }
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.UC
    public final void AF2() {
        this.A00.A0i(AbstractC1600gE.A07);
    }

    @Override // com.facebook.ads.redexgen.core.UC
    public final UA AI2(WJ wj, long j) throws IOException {
        long jA8d = wj.A8d();
        int iMin = (int) Math.min(20000L, wj.A8E() - jA8d);
        this.A00.A0d(iMin);
        wj.AG1(this.A00.A0l(), 0, iMin);
        return A00(this.A00, j, jA8d);
    }
}
