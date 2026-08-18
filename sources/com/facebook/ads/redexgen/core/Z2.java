package com.facebook.ads.redexgen.core;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.Input;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z2 {
    public static byte[] A0B;
    public static String[] A0C = {"FBXPhDeCZ6ta56izg2RX4UAMGxSWuPmO", "QDrmS89XtXuNc36lbLCGV2rXwMMaCdmS", "noOMEUvqxn4F9nXxwkLlT", "Nt19yBDAzxo6G70U2O2eiohegrIvFrbk", "3lkz9BodtFScM4PEoF3XaCKts9KucpwR", "ZOKXB8HAY4o3HPLOLnouM", "MXm1HhuqFq0azwHnrfysHiEAnyccYvPg", "FEiKe9Sj4I2Kk6mI0nlyn5nHBNOH03KR"};
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-65, 19, cw.l, -65, -97, -109, -93, -105, -46, -110, -95, -45, -45, -43, -51, -59, -60, -83, -63, -40, -93, -56, -63, -50, -50, -59, -52, -95, -60, -54, -43, -45, -44, -51, -59, -50, -44, -102, -128, -38, 12, 12, cw.l, 6, -2, -3, -20, cw.l, 9, 9, 8, 11, cw.k, -71, -12, -30, -5, 4, 5, 12, 5, -74, -22, -40, -61, -18, -52, -58, -53, -36, -11, -2, -1, 6, -1, -80, -28, -46, -67, -24, -58, -64, -58, -91, -66, -57, -56, -49, -56, 121, -83, -101, -122, -79, -113, -118, -113, -97, -73, -74, -69, -77, -107, -63, -74, -73, -75, -101, -64, -72, -63, -121, -98, -79, -82, -84, 89, 106, 105, -86, -53, -81, -47, -52, -52, -53, -50, -48, 124, -73, -37, -48, -34, -37, -43, -48, -71, -28, -31, -65, -83, -85, -74, -116, -93, -42, -41, -52, -51, -47, -116, -97, -76, -95, -116, -94, -61, -63, -51, -62, -61, -48, -15, -17, -6, -48, -25, 26, 27, cw.n, 17, 21, -48, -29, -8, -27, -48, -26, 7, 5, 17, 6, 7, 20, -48, 21, 7, 5, 23, 20, 7, -73, -75, -64, -106, -75, -87, -70, -66, -83, -76, -76, -106, -66, -79, -84, -83, -73, -106, -80, -65, -106, -85, -73, -84, -87, -97, -99, -100, -102, -84, -83, -85, -73, -84, -83, -70, -61, -63, -52, -94, -63, -56, -65, -94, -54, -67, -72, -71, -61, -94, -72, -71, -73, -61, -72, -71, -58, -94, -68, -71, -54, -73, 0, -6, -38, 1, -33, -32, -35, -104, -32, -93, -34, cw.k, cw.n, cw.k, 28, 32, 21, 34, 17, -39, 28, 24, cw.k, 37, cw.l, cw.k, cw.m, 23, cw.l, 34, 17, 22, 28, -36, -32, 20, 29, 29, -22, -2, -19, -14, -8, -72, -22, -20, -68, -28, -8, -25, -20, -14, -78, -28, -16, -11, -80, -6, -27, -81, -61, -78, -73, -67, 125, -77, -81, -79, -127, -5, cw.m, -2, 3, 9, -55, 0, 6, -5, -3, 11, 31, cw.l, 19, 25, -39, 17, -31, -37, -37, -41, 11, 22, 11, 33, -57, -37, -54, -49, -43, -107, -51, -99, -105, -105, -109, -45, -46, -57, -35, -92, -72, -89, -84, -78, 114, -86, -74, -80, -27, -7, -24, -19, -13, -77, -15, -12, -72, -27, -79, -16, -27, -8, -15, -16, 4, -13, -8, -2, -66, -4, -1, -12, -10, -1, 19, 2, 7, cw.k, -51, cw.k, cw.l, 19, 17, -48, -28, -45, -40, -34, -98, -31, -48, -26, -32, -12, -29, -24, -18, -82, -11, -18, -15, -31, -24, -14, -5, 8, 11, -2, -6, 5, -55, -50, -57, -44, -44, -53, -46, -87, -43, -37, -44, -38, -108, -57, -87, -57, -42, -39, -59, -54, -61, -48, -48, -57, -50, -91, -47, -41, -48, -42, -112, -59, -61, -46, -43, -96, -91, -98, -85, -85, -94, -87, -128, -84, -78, -85, -79, 107, -80, -78, -83, -83, -84, -81, -79, 105, 93, -59, -47, -58, -57, -59, -112, -49, -53, -49, -57, -126, -47, -35, -46, -45, -47, -100, -34, -32, -35, -44, -41, -38, -45, -70, -45, -28, -45, -38, -102, -114, -57, -69, -52, -58, -61, -56, 24, cw.l, 33, -32, 12, -37, -55, -54, -38, -47, -42, -55, -14, -32, -24, -21, -27, -24, -14, -25, -46, -64, -52, -49, -53, -60, -79, -64, -45, -60, -115, -64, -94, -64, -49, -46, 22, 4, cw.n, 19, cw.m, 8, -11, 4, 23, 8, -47, 6, 4, 19, 22, 10, -8, 4, 7, 3, -4, -23, -8, 11, -4, -59, 10, 12, 7, 7, 6, 9, 11, -61, -73, -35, -49, -51, -33, -36, -49, -105, -38, -42, -53, -29, -52, -53, -51, -43, 23, cw.k, 30, 9, -27, 18, 8, -10, 5, 24, 9, -46, 7, 5, 20, 23, -14, -24, -7, -28, -64, -19, -29, -47, -32, -13, -28, -83, -30, -18, -11, -28, -15, -85, -97, cw.k, 3, 20, -1, -37, 8, -2, -20, -5, cw.l, -1, -56, 12, 9, cw.l, -5, cw.l, -1, -2, -58, -70, 32, 22, 39, 18, -18, 27, 17, -1, cw.l, 33, 18, -37, 32, 34, 29, 29, 28, 31, 33, -39, -51, -17, -27, -10, -31, -67, -22, -32, -50, -35, -16, -31, -86, -14, -65, -35, -20, -17, 33, 34, 27, 27, 18, 25, 18, 17, -38, 29, 25, cw.l, 38, cw.m, cw.l, cw.n, 24, -18, -31, -36, -35, -25, -89, -39, -18, -37, -43, -56, -61, -60, -50, -114, -61, -50, -53, -63, -40, -116, -43, -56, -46, -56, -50, -51, -32, -45, -50, -49, -39, -103, -46, -49, -32, -51, 10, -3, -8, -7, 3, -61, 12, -63, 10, 2, -8, -62, 3, 2, -58, -62, 10, 4, -51, -52};
        String[] strArr = A0C;
        if (strArr[0].charAt(30) != strArr[1].charAt(30)) {
            throw new RuntimeException();
        }
        A0C[6] = "Z5VDyRnJom1aU8j1qPs7WLJ1gpMnSQJN";
        A0B = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final OD A0O(ZM zm, ZM zm2) {
        int i = AbstractC1600gE.A1E(zm.A0W, zm2.A0W) ? 0 : 0 | 8;
        if (this.A0A) {
            if (zm.A0F != zm2.A0F) {
                i |= 1024;
            }
            if (!this.A04 && (zm.A0L != zm2.A0L || zm.A0A != zm2.A0A)) {
                i |= 512;
            }
            if (!AbstractC1600gE.A1E(zm.A0N, zm2.A0N)) {
                i |= 2048;
            }
            if (A0I(this.A03) && !zm.A0A(zm2)) {
                i |= 2;
                String[] strArr = A0C;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0C[3] = "mPqTU4DXHyTGhrj84LfZEmdGRD3BlVQY";
            }
            if (i == 0) {
                return new OD(this.A03, zm, zm2, zm.A0A(zm2) ? 3 : 2, 0);
            }
        } else {
            if (zm.A06 != zm2.A06) {
                i |= 4096;
            }
            if (zm.A0G != zm2.A0G) {
                i |= 8192;
            }
            if (zm.A0C != zm2.A0C) {
                i |= 16384;
            }
            if (i == 0 && A03(371, 15, 86).equals(this.A02)) {
                Pair<Integer, Integer> pairA0B = ZZ.A0B(zm);
                Pair<Integer, Integer> pairA0B2 = ZZ.A0B(zm2);
                if (pairA0B != null && pairA0B2 != null) {
                    int iIntValue = ((Integer) pairA0B.first).intValue();
                    int iIntValue2 = ((Integer) pairA0B2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new OD(this.A03, zm, zm2, 3, 0);
                    }
                }
            }
            boolean zA0A = zm.A0A(zm2);
            String[] strArr2 = A0C;
            if (strArr2[4].charAt(31) == strArr2[7].charAt(31)) {
                String[] strArr3 = A0C;
                strArr3[4] = "3fRSwDCXDrhNeJCsA46dHQKoKsoPgylR";
                strArr3[7] = "8jX7yhJiWNByxZjRLv3UIJJsGPs0pDmR";
                if (!zA0A) {
                    i |= 32;
                }
            } else if (!zA0A) {
                i |= 32;
            }
            boolean zA0H = A0H(this.A02);
            String[] strArr4 = A0C;
            if (strArr4[0].charAt(30) != strArr4[1].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0C;
            strArr5[4] = "QhdJwSvYwnxnh04cgBDXk1DfSAMlKxiR";
            strArr5[7] = "bBzx3qQxnphZNjaaSLtGu5pyO1sK8pIR";
            if (zA0H) {
                i |= 2;
            }
            if (i == 0) {
                return new OD(this.A03, zm, zm2, 1, 0);
            }
        }
        return new OD(this.A03, zm, zm2, 0, i);
    }

    static {
        A04();
    }

    public Z2(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = (String) AbstractC1517es.A01(str);
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A05 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A04 = z4;
        this.A08 = z5;
        this.A06 = z6;
        this.A0A = Q2.A0F(str2);
    }

    public static int A00(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((AbstractC1600gE.A02 >= 26 && i > 0) || A03(386, 10, 97).equals(str2) || A03(281, 10, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE).equals(str2) || A03(300, 12, 85).equals(str2) || A03(371, 15, 86).equals(str2) || A03(415, 12, 81).equals(str2) || A03(396, 10, 112).equals(str2) || A03(406, 9, 65).equals(str2) || A03(322, 10, 108).equals(str2) || A03(332, 15, 124).equals(str2) || A03(347, 15, 56).equals(str2) || A03(362, 9, 21).equals(str2))) {
            return i;
        }
        if (A03(291, 9, 91).equals(str2)) {
            i2 = 6;
        } else if (A03(312, 10, 32).equals(str2)) {
            i2 = 16;
        } else {
            i2 = 30;
        }
        AbstractC1561fb.A07(A03(97, 14, 36), A03(10, 29, 50) + str + A03(6, 3, 73) + i + A03(0, 4, 113) + i2 + A03(260, 1, 13));
        return i2;
    }

    public static Point A01(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int heightAlignment = videoCapabilities.getWidthAlignment();
        int widthAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC1600gE.A05(i, heightAlignment) * heightAlignment, AbstractC1600gE.A05(i2, widthAlignment) * widthAlignment);
    }

    public static Z2 A02(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = (z4 || codecCapabilities == null || !A09(codecCapabilities) || A0J(str)) ? false : true;
        boolean z7 = codecCapabilities != null && A0D(codecCapabilities);
        boolean z8 = z5 || (codecCapabilities != null && A0B(codecCapabilities));
        String[] strArr = A0C;
        if (strArr[4].charAt(31) != strArr[7].charAt(31)) {
            throw new RuntimeException();
        }
        A0C[6] = "iu6X6TeG7hna2aJ2WJ8Ns0NHwlxEFqT7";
        return new Z2(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z8);
    }

    private void A05(String str) {
        StringBuilder sbAppend = new StringBuilder().append(A03(39, 16, 107)).append(str);
        String strA03 = A03(261, 3, 85);
        AbstractC1561fb.A04(A03(97, 14, 36), sbAppend.append(strA03).append(this.A03).append(A03(4, 2, 69)).append(this.A02).append(strA03).append(AbstractC1600gE.A04).append(A03(260, 1, 13)).toString());
    }

    private void A06(String str) {
        StringBuilder sbAppend = new StringBuilder().append(A03(EnumC4719u30.JSON_ENCODE_ERROR_VALUE, 11, 46)).append(str);
        String strA03 = A03(261, 3, 85);
        AbstractC1561fb.A04(A03(97, 14, 36), sbAppend.append(strA03).append(this.A03).append(A03(4, 2, 69)).append(this.A02).append(strA03).append(AbstractC1600gE.A04).append(A03(260, 1, 13)).toString());
    }

    public static boolean A07() {
        return AbstractC1600gE.A03.equals(A03(532, 7, 58)) || AbstractC1600gE.A03.equals(A03(427, 6, 107)) || AbstractC1600gE.A06.startsWith(A03(55, 14, 104)) || AbstractC1600gE.A06.startsWith(A03(69, 14, 98)) || AbstractC1600gE.A06.startsWith(A03(83, 14, 43));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1600gE.A02 >= 19 && A0A(codecCapabilities);
    }

    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(264, 17, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1600gE.A02 >= 21 && A0C(codecCapabilities);
    }

    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(598, 15, 60));
    }

    public static boolean A0D(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1600gE.A02 >= 21 && A0E(codecCapabilities);
    }

    public static boolean A0E(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 17, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
    }

    public static boolean A0F(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point alignedSize = A01(videoCapabilities, i, i2);
        int i3 = alignedSize.x;
        int i4 = alignedSize.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D46258033: [FBLite][Video] Solve tasks T154141530 T154151746 gating the call for SDK >=21")
    private boolean A0G(ZM zm, boolean z) {
        Pair<Integer, Integer> pairA0B = ZZ.A0B(zm);
        if (pairA0B == null) {
            return true;
        }
        int iIntValue = ((Integer) pairA0B.first).intValue();
        int iIntValue2 = ((Integer) pairA0B.second).intValue();
        if (A03(733, 18, 49).equals(zm.A0W)) {
            if (A03(724, 9, 74).equals(this.A02)) {
                iIntValue = 8;
                iIntValue2 = 0;
            } else if (A03(751, 10, 60).equals(this.A02)) {
                iIntValue = 2;
                iIntValue2 = 0;
            }
        }
        if ((!this.A0A && iIntValue != 42) || A0V().length <= 0) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] profileLevels = A0V();
        if (AbstractC1600gE.A02 >= 21 && AbstractC1600gE.A02 <= 23) {
            if (A03(761, 19, 102).equals(this.A02) && profileLevels.length == 0) {
                profileLevels = A0M(this.A00);
            }
        }
        if (A0C[3].charAt(6) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[0] = "ORMX5iAQPjpwd33E74u0BsfeHTZSntm8";
        strArr[1] = "S9zUHIvKdvUZcB7QlWQwOtS9GyXtTFmh";
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            int profile = codecProfileLevel.profile;
            if (profile == iIntValue) {
                int profile2 = codecProfileLevel.level;
                if ((profile2 >= iIntValue2 || !z) && !A0L(this.A02, iIntValue)) {
                    return true;
                }
            }
        }
        A06(A03(501, 20, 64) + zm.A0R + A03(4, 2, 69) + this.A01);
        return false;
    }

    public static boolean A0H(String str) {
        return A03(396, 10, 112).equals(str);
    }

    public static boolean A0I(String str) {
        return AbstractC1600gE.A06.startsWith(A03(253, 7, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) && A03(Input.Keys.F21, 36, 58).equals(str);
    }

    public static boolean A0J(String str) {
        if (AbstractC1600gE.A02 <= 22) {
            if ((A03(130, 10, 94).equals(AbstractC1600gE.A06) || A03(111, 8, 11).equals(AbstractC1600gE.A06)) && (A03(Input.Keys.F10, 22, 48).equals(str) || A03(Input.Keys.NUMPAD_LEFT_PAREN, 29, 116).equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0K(String str) {
        if (A03(227, 26, 70).equals(str) && A03(527, 5, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE).equals(AbstractC1600gE.A03)) {
            return false;
        }
        if (A0C[3].charAt(6) != 'D') {
            throw new RuntimeException();
        }
        A0C[6] = "rGkUTSP69JXayHzzfRs4rqRX6esaTUNK";
        return true;
    }

    public static boolean A0L(String str, int i) {
        if (A03(751, 10, 60).equals(str)) {
            String[] strArr = A0C;
            if (strArr[4].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "lDNsaVG6TpZD2QagnIn1pIMPC8hAw7mb";
            strArr2[1] = "IkuK62epzms2zSlQYmCFCweCKeq9Cgmu";
            if (2 == i) {
                if (A03(539, 8, 81).equals(AbstractC1600gE.A03) || A03(521, 6, 44).equals(AbstractC1600gE.A03)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static MediaCodecInfo.CodecProfileLevel[] A0M(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int level;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = 0;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            iIntValue = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        }
        if (A0C[6].charAt(11) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[2] = "bMi2YjKgH6UosJyAhorls";
        strArr[5] = "OZZEdnO9Xa3Shz0YgvfWB";
        if (iIntValue >= 180000000) {
            level = 1024;
        } else if (iIntValue >= 120000000) {
            level = 512;
        } else if (iIntValue >= 60000000) {
            level = 256;
        } else if (iIntValue >= 30000000) {
            level = 128;
        } else if (iIntValue >= 18000000) {
            level = 64;
        } else if (iIntValue >= 12000000) {
            level = 32;
        } else if (iIntValue >= 7200000) {
            level = 16;
        } else if (iIntValue >= 3600000) {
            level = 8;
        } else if (iIntValue >= 1800000) {
            level = 4;
        } else if (iIntValue >= 800000) {
            level = 2;
        } else {
            level = 1;
        }
        MediaCodecInfo.CodecProfileLevel profileLevel = new MediaCodecInfo.CodecProfileLevel();
        profileLevel.profile = 1;
        profileLevel.level = level;
        return new MediaCodecInfo.CodecProfileLevel[]{profileLevel};
    }

    public final Point A0N(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.A00 == null || (videoCapabilities = this.A00.getVideoCapabilities()) == null) {
            return null;
        }
        return A01(videoCapabilities, i, i2);
    }

    public final boolean A0P(int i) {
        if (this.A00 == null) {
            A06(A03(451, 17, 52));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(433, 18, 56));
            return false;
        }
        if (A00(this.A03, this.A02, audioCapabilities.getMaxInputChannelCount()) < i) {
            A06(A03(468, 22, 15) + i);
            return false;
        }
        return true;
    }

    public final boolean A0Q(int i) {
        if (this.A00 == null) {
            A06(A03(563, 15, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(547, 16, 49));
            return false;
        }
        if (!audioCapabilities.isSampleRateSupported(i)) {
            A06(A03(578, 20, 105) + i);
            return false;
        }
        return true;
    }

    public final boolean A0R(int i, int i2, double d) {
        if (this.A00 == null) {
            A06(A03(613, 16, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE));
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(690, 17, 78));
            return false;
        }
        int i3 = AbstractC1600gE.A02;
        String strA03 = A03(9, 1, 36);
        String strA04 = A03(780, 1, 38);
        if (i3 >= 29) {
            int iA00 = Z0.A00(videoCapabilities, i, i2, d);
            if (iA00 == 2) {
                return true;
            }
            if (iA00 == 1) {
                A06(A03(629, 19, 81) + i + strA04 + i2 + strA03 + d);
                return false;
            }
        }
        if (!A0F(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !A0K(this.A03) || !A0F(videoCapabilities, i2, i, d)) {
                A06(A03(669, 21, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + i + strA04 + i2 + strA03 + d);
                return false;
            }
            A05(A03(648, 21, 108) + i + strA04 + i2 + strA03 + d);
        }
        return true;
    }

    @MetaExoPlayerCustomization(type = {"DEPRECATED_LOGIC"}, value = "D51676338: Control Renderer Support behavior")
    public final boolean A0S(ZM zm) {
        String strA07;
        if (zm.A0R == null || this.A02 == null || (strA07 = Q2.A07(zm.A0R)) == null) {
            return true;
        }
        String str = this.A02;
        if (A0C[3].charAt(6) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[2] = "KAwJ2lKC4hgwLXt68d84S";
        strArr[5] = "kJwFVEEageZGhP5qzVn8u";
        if (!str.equals(strA07)) {
            StringBuilder sb = new StringBuilder();
            String codecMimeType = A03(490, 11, 52);
            StringBuilder sbAppend = sb.append(codecMimeType);
            String codecMimeType2 = zm.A0R;
            StringBuilder sbAppend2 = sbAppend.append(codecMimeType2);
            String codecMimeType3 = A03(4, 2, 69);
            A06(sbAppend2.append(codecMimeType3).append(strA07).toString());
            return false;
        }
        return A0G(zm, true);
    }

    public final boolean A0T(ZM zm) {
        if (this.A0A) {
            boolean z = this.A04;
            String[] strArr = A0C;
            if (strArr[0].charAt(30) == strArr[1].charAt(30)) {
                String[] strArr2 = A0C;
                strArr2[4] = "q0okLXeWdPGtykafkblhIV4KyWkme2AR";
                strArr2[7] = "3q0ziuawpqKtRPl3U6pidMLg7nfoGoOR";
                return z;
            }
        } else {
            Pair<Integer, Integer> pairA0B = ZZ.A0B(zm);
            if (A0C[6].charAt(11) == 'a') {
                String[] strArr3 = A0C;
                strArr3[0] = "1xtIoqy66xdoySwSi0No6Dznh2tk7Bm6";
                strArr3[1] = "tyq1ut2AGrr1b3GtAVKN5E2WpsFCa0m4";
                return pairA0B != null && ((Integer) pairA0B.first).intValue() == 42;
            }
        }
        throw new RuntimeException();
    }

    @Deprecated
    public final boolean A0U(ZM zm, ZM zm2, boolean z) {
        if (!z && zm.A0N != null && zm2.A0N == null) {
            zm2 = zm2.A07().A0t(zm.A0N).A14();
        }
        int i = A0O(zm, zm2).A01;
        if (i != 2) {
            if (A0C[6].charAt(11) != 'a') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "G0NkXFkY0d8qrzbvDqnofI31CkQoypIR";
            strArr[7] = "vdgZg5erOMw5t31Gg1U5hRxQh5cKBhKR";
            if (i != 3) {
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0V() {
        if (this.A00 == null || this.A00.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.A00.profileLevels;
    }

    public final String toString() {
        return this.A03;
    }
}
