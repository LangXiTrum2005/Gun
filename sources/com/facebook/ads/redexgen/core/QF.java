package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QF extends AbstractC1403d1<QF> {
    public static String[] A0H = {"v6KJHFJIwSxW5VkVURyarc4QqwiwICsW", "YqHoiDUZ8NWGt5PpM2LITj1dVPNsfOlI", "MP9q3LvInq1PRsoa4HNF83BC92cUuK86", "wQbclW7ApNS8xw7MRINJmgEuNFXyyCJy", "UIre8iEn6A8UlrOJV8LrROKKwXNvo3Ma", "rBd8Gmbnjc9Nipv5s", "PBkO2vxtIwTyXPWlGSE2UajCtTy2WCFi", "Jw9rUAhmRQ3mXCn0vVji8P2gXy9pale6"};
    public final int A00;
    public final int A01;
    public final int A02;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A03;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C04855v A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public QF(int i, C1175Yc c1175Yc, int i2, C04855v c04855v, int i3, String str, int i4, boolean z) {
        int requiredAdaptiveSupport;
        super(i, c1175Yc, i2);
        this.A09 = c04855v;
        if (c04855v.A07) {
            requiredAdaptiveSupport = 24;
        } else {
            requiredAdaptiveSupport = 16;
        }
        this.A0A = c04855v.A06 && (i4 & requiredAdaptiveSupport) != 0;
        this.A0C = z && (super.A02.A0L == -1 || super.A02.A0L <= ((YN) c04855v).A06) && ((super.A02.A0A == -1 || super.A02.A0A <= ((YN) c04855v).A05) && ((super.A02.A01 == -1.0f || super.A02.A01 <= ((float) ((YN) c04855v).A04)) && (super.A02.A05 == -1 || super.A02.A05 <= ((YN) c04855v).A03)));
        this.A0D = z && (super.A02.A0L == -1 || super.A02.A0L >= ((YN) c04855v).A0A) && ((super.A02.A0A == -1 || super.A02.A0A >= ((YN) c04855v).A09) && ((super.A02.A01 == -1.0f || super.A02.A01 >= ((float) ((YN) c04855v).A08)) && (super.A02.A05 == -1 || super.A02.A05 >= ((YN) c04855v).A07)));
        this.A0E = C04845u.A0S(i3, false);
        int bestLanguageIndex = 0;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < c04855v.A0L.size(); i6++) {
            int iA02 = C04845u.A02(super.A02, c04855v.A0L.get(i6), false);
            if (iA02 > 0) {
                i5 = i6;
                bestLanguageIndex = iA02;
                break;
            }
        }
        this.A03 = i5;
        this.A04 = bestLanguageIndex;
        this.A00 = super.A02.A05;
        this.A02 = super.A02.A06();
        this.A06 = C04845u.A00(super.A02.A0E, ((YN) c04855v).A0D);
        this.A0B = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A07 = C04845u.A02(super.A02, str, C04845u.A0K(str) == null);
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < c04855v.A0M.size(); i8++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(c04855v.A0M.get(i8))) {
                i7 = i8;
                break;
            }
        }
        this.A05 = i7;
        this.A0G = AbstractC0976Qb.A02(i3) == 128;
        this.A0F = AbstractC0976Qb.A04(i3) == 64;
        this.A01 = C04845u.A07(super.A02.A0W);
        this.A08 = A00(i3, requiredAdaptiveSupport);
    }

    private int A00(int i, int i2) {
        if ((super.A02.A0E & 16384) != 0 || !C04845u.A0S(i, this.A09.A0B)) {
            return 0;
        }
        if (!this.A0C && !this.A09.A0C) {
            return 0;
        }
        if (C04845u.A0S(i, false) && this.A0D && this.A0C && super.A02.A05 != -1 && !this.A09.A0N && !this.A09.A0O && (i & i2) != 0) {
            return 2;
        }
        return 1;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static int A01(QF qf, QF qf2) {
        AbstractC1895l7 abstractC1895l7A09 = AbstractC1895l7.A01().A09(qf.A0E, qf2.A0E).A08(Integer.valueOf(qf.A03), Integer.valueOf(qf2.A03), AbstractC2041nY.A03().A06()).A06(qf.A04, qf2.A04).A06(qf.A06, qf2.A06).A09(qf.A0B, qf2.A0B).A06(qf.A07, qf2.A07).A09(qf.A0C, qf2.A0C).A09(qf.A0D, qf2.A0D).A08(Integer.valueOf(qf.A05), Integer.valueOf(qf2.A05), AbstractC2041nY.A03().A06()).A09(qf.A0G, qf2.A0G).A09(qf.A0F, qf2.A0F);
        if (qf.A0G && qf.A0F) {
            int i = qf.A01;
            if (A0H[4].length() == 27) {
                throw new RuntimeException();
            }
            A0H[1] = "WnfleLMmT1GOcOsW0qDOxckWrr441Hrs";
            abstractC1895l7A09 = abstractC1895l7A09.A06(i, qf2.A01);
        }
        return abstractC1895l7A09.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<java.lang.Integer> */
    public static int A02(QF qf, QF qf2) {
        AbstractC2041nY abstractC2041nYA06;
        AbstractC2041nY abstractC2041nYA07 = (qf.A0C && qf.A0E) ? C04845u.A09 : C04845u.A09.A06();
        AbstractC1895l7 abstractC1895l7A01 = AbstractC1895l7.A01();
        Integer numValueOf = Integer.valueOf(qf.A00);
        Integer numValueOf2 = Integer.valueOf(qf2.A00);
        if (qf.A09.A0O) {
            abstractC2041nYA06 = C04845u.A09.A06();
        } else {
            abstractC2041nYA06 = C04845u.A0A;
        }
        AbstractC1895l7 abstractC1895l7A08 = abstractC1895l7A01.A08(numValueOf, numValueOf2, abstractC2041nYA06);
        String[] strArr = A0H;
        if (strArr[3].charAt(13) == strArr[0].charAt(13)) {
            throw new RuntimeException();
        }
        A0H[6] = "6nkXgJ47E0Y7x1U4DSFgJgJf9oyN7uwC";
        return abstractC1895l7A08.A08(Integer.valueOf(qf.A02), Integer.valueOf(qf2.A02), abstractC2041nYA07).A08(Integer.valueOf(qf.A00), Integer.valueOf(qf2.A00), abstractC2041nYA07).A05();
    }

    public static int A05(List<QF> list, List<QF> list2) {
        return AbstractC1895l7.A01().A08((QF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.d2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QF.A01((QF) obj, (QF) obj2);
            }
        }), (QF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.d2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QF.A01((QF) obj, (QF) obj2);
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.d2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QF.A01((QF) obj, (QF) obj2);
            }
        }).A06(list.size(), list2.size()).A08((QF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.d3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QF.A02((QF) obj, (QF) obj2);
            }
        }), (QF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.d3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QF.A02((QF) obj, (QF) obj2);
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.d3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QF.A02((QF) obj, (QF) obj2);
            }
        }).A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo> */
    public static OI<QF> A06(int i, C1175Yc c1175Yc, C04855v c04855v, int[] iArr, String str, int maxPixelsToRetainForViewport) {
        int iA03 = C04845u.A03(c1175Yc, ((YN) c04855v).A0F, ((YN) c04855v).A0E, c04855v.A0Q);
        C4T c4tA01 = OI.A01();
        for (int i2 = 0; i2 < c1175Yc.A01; i2++) {
            int iA06 = c1175Yc.A08(i2).A06();
            c4tA01.A04(new QF(i, c1175Yc, i2, c04855v, iArr[i2], str, maxPixelsToRetainForViewport, iA03 == Integer.MAX_VALUE || (iA06 != -1 && iA06 <= iA03)));
        }
        return c4tA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1403d1
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final boolean A09(QF qf) {
        if (this.A0A || AbstractC1600gE.A1E(super.A02.A0W, ((AbstractC1403d1) qf).A02.A0W)) {
            if (!this.A09.A05) {
                boolean z = this.A0G;
                String[] strArr = A0H;
                if (strArr[7].charAt(2) != strArr[2].charAt(2)) {
                    throw new RuntimeException();
                }
                A0H[4] = "jVM2Qvf4diEch6VN99nFo";
                if (z != qf.A0G || this.A0F != qf.A0F) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1403d1
    public final int A08() {
        return this.A08;
    }
}
