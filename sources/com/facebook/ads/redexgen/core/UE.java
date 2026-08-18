package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class UE {
    public static byte[] A00;
    public static String[] A01 = {"zOBnVdZEl2L3e4AXnDd9G11vWIOq79KJ", "WoGScMtyZyTkSevv94XXwMvUSUOngUyP", "wcZi00XFnf2p", "EA6oz7f03wgSVcWDu3otuiJxV6VRA", "OucbhJWJlfZaBgKYK86IYzWVq5D6YSLq", "LcwjEa3UpwWSC1hm4hnO4DZsnjIlc", "0X4EiQAcF9Ys", "i3pZtA"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{109, 75, 79, 123, 90, 71, 66, 10, 50, 48, 41, 41, 48, 55, 62, 121, 43, 60, 52, 56, 48, 55, 61, 60, 43, 121, 54, 63, 121, 52, 56, 53, 63, 54, 43, 52, 60, 61, 121, 10, 28, cw.n, 121, 23, 24, 21, 121, 44, 55, 48, 45, 119};
    }

    static {
        A02();
    }

    public static int A00(C1576fq c1576fq) {
        int i = 0;
        while (value != 0) {
            int b = c1576fq.A0I();
            i += b;
            if (b != 255) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static void A03(long j, C1576fq c1576fq, InterfaceC1086Uo[] interfaceC1086UoArr) {
        while (true) {
            if (c1576fq.A07() > 1) {
                int iA00 = A00(c1576fq);
                int iA01 = A00(c1576fq);
                int nextPayloadPosition = c1576fq.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c1576fq.A07();
                    if (iA01 > payloadType) {
                        AbstractC1561fb.A07(A01(0, 7, 77), A01(7, 45, 58));
                        nextPayloadPosition = c1576fq.A0A();
                    } else if (iA00 == 4) {
                        String[] strArr = A01;
                        if (strArr[3].length() != strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A01;
                        strArr2[6] = "hCWyPMi8Uw97";
                        strArr2[2] = "MFbyJ6GioS0x";
                        if (iA01 >= 8) {
                            int userDataTypeCode = c1576fq.A0I();
                            int iA0M = c1576fq.A0M();
                            int userIdentifier = 0;
                            if (iA0M == 49) {
                                userIdentifier = c1576fq.A0C();
                            }
                            int iA0I = c1576fq.A0I();
                            if (iA0M == 47) {
                                c1576fq.A0g(1);
                            }
                            int i = (userDataTypeCode == 181 && (iA0M == 49 || iA0M == 47) && iA0I == 3) ? 1 : 0;
                            if (iA0M == 49) {
                                int countryCode = userIdentifier != 1195456820 ? 0 : 1;
                                i &= countryCode;
                            }
                            if (i != 0) {
                                A04(j, c1576fq, interfaceC1086UoArr);
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    AbstractC1561fb.A07(A01(0, 7, 77), A01(7, 45, 58));
                    nextPayloadPosition = c1576fq.A0A();
                }
                c1576fq.A0f(nextPayloadPosition);
            } else {
                return;
            }
        }
    }

    public static void A04(long j, C1576fq c1576fq, InterfaceC1086Uo[] interfaceC1086UoArr) {
        int firstByte = c1576fq.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c1576fq.A0g(1);
        int i = (firstByte & 31) * 3;
        int iA09 = c1576fq.A09();
        for (InterfaceC1086Uo interfaceC1086Uo : interfaceC1086UoArr) {
            c1576fq.A0f(iA09);
            interfaceC1086Uo.AHx(c1576fq, i);
            if (j != C.TIME_UNSET) {
                interfaceC1086Uo.AI0(j, 1, i, 0, null);
            }
        }
    }
}
