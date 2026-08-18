package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class QB extends AbstractC1418dG {
    public static String[] A01 = {"gHe6Ggz9iQvLoeqfI7z0Fxxa2bOPFJVC", "mRaRFCBn69tPfujuPAjRFPYxHQXp9RZc", "CSSFDgS5gh03TQ1AYsGOm7d", "zjwBQPent3AQFjnpPPQBXvHN2Tq8EaDX", "cDNJWjlLvsmdd9mkRSbb8bT", "", "", "QEHUtPc9dofNZwowDCRZe3wvjD0c8w3x"};
    public C1410d8 A00;

    public abstract Pair<C0986Ql[], QD[]> A0d(C1410d8 c1410d8, int[][][] iArr, int[] iArr2, R5 r5, Timeline timeline) throws EK;

    public static int A0Y(InterfaceC0983Qi[] interfaceC0983QiArr, C1175Yc c1175Yc, int[] iArr, boolean z) throws EK {
        int length = interfaceC0983QiArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            InterfaceC0983Qi interfaceC0983Qi = interfaceC0983QiArr[i2];
            int iMax = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC0983Qi.AJR(c1175Yc.A08(bestFormatSupportLevel));
                iMax = Math.max(iMax, AbstractC0976Qb.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i2];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (iMax > formatSupportLevel || (iMax == formatSupportLevel && z && i == 0 && bestRendererIndex3 != 0)) {
                length = i2;
                formatSupportLevel = iMax;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC0983Qi interfaceC0983Qi, C1175Yc c1175Yc) throws EK {
        int[] iArr = new int[c1175Yc.A01];
        for (int i = 0; i < c1175Yc.A01; i++) {
            iArr[i] = interfaceC0983Qi.AJR(c1175Yc.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC0983Qi[] interfaceC0983QiArr) throws EK {
        int[] iArr = new int[interfaceC0983QiArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = interfaceC0983QiArr[i].AJT();
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1418dG
    public final C1419dH A0b(InterfaceC0983Qi[] interfaceC0983QiArr, C0992Qs c0992Qs, R5 r5, Timeline timeline) throws EK {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC0983QiArr.length + 1];
        C1175Yc[][] c1175YcArr = new C1175Yc[interfaceC0983QiArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC0983QiArr.length + 1][][];
        for (int i = 0; i < c1175YcArr.length; i++) {
            c1175YcArr[i] = new C1175Yc[c0992Qs.A01];
            iArr2[i] = new int[c0992Qs.A01][];
        }
        int[] iArrA0a = A0a(interfaceC0983QiArr);
        int groupIndex = 0;
        while (true) {
            int i2 = c0992Qs.A01;
            if (A01[7].charAt(15) != 'w') {
                throw new RuntimeException();
            }
            A01[7] = "nXGM96RwffhgFmQwkLMDI9egGDlSsBJ3";
            if (groupIndex < i2) {
                C1175Yc c1175YcA05 = c0992Qs.A05(groupIndex);
                int iA0Y = A0Y(interfaceC0983QiArr, c1175YcA05, iArr, c1175YcA05.A02 == 5);
                if (iA0Y == interfaceC0983QiArr.length) {
                    rendererTrackGroupCounts = new int[c1175YcA05.A01];
                } else {
                    rendererTrackGroupCounts = A0Z(interfaceC0983QiArr[iA0Y], c1175YcA05);
                }
                int i3 = iArr[iA0Y];
                c1175YcArr[iA0Y][i3] = c1175YcA05;
                iArr2[iA0Y][i3] = rendererTrackGroupCounts;
                iArr[iA0Y] = iArr[iA0Y] + 1;
                groupIndex++;
            } else {
                C0992Qs[] c0992QsArr = new C0992Qs[interfaceC0983QiArr.length];
                String[] strArr = new String[interfaceC0983QiArr.length];
                int[] iArr3 = new int[interfaceC0983QiArr.length];
                for (int i4 = 0; i4 < interfaceC0983QiArr.length; i4++) {
                    int i5 = iArr[i4];
                    c0992QsArr[i4] = new C0992Qs((C1175Yc[]) AbstractC1600gE.A1I(c1175YcArr[i4], i5));
                    iArr2[i4] = (int[][]) AbstractC1600gE.A1I(iArr2[i4], i5);
                    strArr[i4] = interfaceC0983QiArr[i4].getName();
                    iArr3[i4] = interfaceC0983QiArr[i4].A9D();
                }
                C1410d8 c1410d8 = new C1410d8(strArr, iArr3, c0992QsArr, iArrA0a, iArr2, new C0992Qs((C1175Yc[]) AbstractC1600gE.A1I(c1175YcArr[interfaceC0983QiArr.length], iArr[interfaceC0983QiArr.length])));
                Pair<C0986Ql[], QD[]> pairA0d = A0d(c1410d8, iArr2, iArrA0a, r5, timeline);
                return new C1419dH((C0986Ql[]) pairA0d.first, (QD[]) pairA0d.second, AbstractC1415dD.A00(c1410d8, (InterfaceC1412dA[]) pairA0d.second), c1410d8);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1418dG
    public final void A0c(Object obj) {
        this.A00 = (C1410d8) obj;
    }
}
