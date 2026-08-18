package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.redexgen.core.AbstractC1517es;
import com.facebook.ads.redexgen.core.AbstractC1522ex;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.C0673Dv;
import com.facebook.ads.redexgen.core.C1177Yf;
import com.facebook.ads.redexgen.core.C1179Yh;
import com.facebook.ads.redexgen.core.C4T;
import com.facebook.ads.redexgen.core.D9;
import com.facebook.ads.redexgen.core.InterfaceC0903Na;
import com.facebook.ads.redexgen.core.InterfaceC0904Nb;
import com.facebook.ads.redexgen.core.NZ;
import com.facebook.ads.redexgen.core.OI;
import com.google.android.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Timeline implements InterfaceC0904Nb {
    public static String[] A00 = {"WkVexZ4Kygk3uKicUY1OXfODb", "GIiS2UJhm7eNWc1RNsVtI188MaIWXiP1", "mvb2ZOpLQSukRu8SaaR11ChJ6YlWeg17", "GpqGNDRh5SNWW3ILzx0b4GigB2QZ", "l3gcwBnDpUyGEIuzCOMvj8Zkex2sIVDq", "5vqwZr1Euu5eHU7", "X2iFApCkixWr4HhP0VYktwd8lnJlTLsj", "DmEaLbFXoo0zDFQ2cF3ATofiD0Mpaqc2"};
    public static final Timeline A02 = new C0673Dv();
    public static final String A05 = AbstractC1600gE.A0h(0);
    public static final String A03 = AbstractC1600gE.A0h(1);
    public static final String A04 = AbstractC1600gE.A0h(2);
    public static final InterfaceC0903Na<Timeline> A01 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Yj
        @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
        public final InterfaceC0904Nb A6V(Bundle bundle) {
            return Timeline.A02(bundle);
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C1179Yh A0I(int i, C1179Yh c1179Yh, boolean z);

    public abstract C1177Yf A0L(int i, C1177Yf c1177Yf, long j);

    public abstract Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Window> */
    public static D9 A02(Bundle bundle) {
        OI oiA04 = A04(C1177Yf.A0J, AbstractC1522ex.A00(bundle, A05));
        OI oiA05 = A04(C1179Yh.A08, AbstractC1522ex.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(oiA04.size());
        }
        return new D9(oiA04, oiA05, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.Nb> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Na != com.google.android.exoplayer2.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.Nb> */
    public static <T extends InterfaceC0904Nb> OI<T> A04(InterfaceC0903Na<T> interfaceC0903Na, IBinder iBinder) {
        if (iBinder == null) {
            return OI.A03();
        }
        C4T c4t = new C4T();
        OI<Bundle> oiA00 = NZ.A00(iBinder);
        for (int i = 0; i < oiA00.size(); i++) {
            c4t.A04(interfaceC0903Na.A6V(oiA00.get(i)));
        }
        return c4t.A05();
    }

    public static int[] A05(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public int A08(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A0C(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                if (i == A0C(z)) {
                    return A0B(z);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i, C1179Yh c1179Yh, C1177Yf c1177Yf, int i2, boolean z) {
        int i3 = A0H(i, c1179Yh).A00;
        int windowIndex = A0K(i3, c1177Yf).A01;
        if (windowIndex == i) {
            int iA08 = A08(i3, i2, z);
            String[] strArr = A00;
            String str = strArr[3];
            String str2 = strArr[0];
            int length = str.length();
            int windowIndex2 = str2.length();
            if (length == windowIndex2) {
                throw new RuntimeException();
            }
            A00[4] = "IqWzMtwlvGQ3uqJzMIx5j0VAke1rLFLr";
            if (iA08 == -1) {
                return -1;
            }
            int windowIndex3 = A0K(iA08, c1177Yf).A00;
            return windowIndex3;
        }
        int windowIndex4 = i + 1;
        return windowIndex4;
    }

    public int A0B(boolean z) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C1177Yf c1177Yf, C1179Yh c1179Yh, int i, long j) {
        return A0E(c1177Yf, c1179Yh, i, j);
    }

    public final Pair<Object, Long> A0E(C1177Yf c1177Yf, C1179Yh c1179Yh, int i, long j) {
        return (Pair) AbstractC1517es.A01(A0G(c1177Yf, c1179Yh, i, j, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C1177Yf c1177Yf, C1179Yh c1179Yh, int i, long j, long j2) {
        return A0G(c1177Yf, c1179Yh, i, j, j2);
    }

    public final Pair<Object, Long> A0G(C1177Yf c1177Yf, C1179Yh c1179Yh, int i, long j, long j2) {
        AbstractC1517es.A00(i, 0, A07());
        A0L(i, c1177Yf, j2);
        if (j == C.TIME_UNSET) {
            j = c1177Yf.A05();
            if (j == C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = c1177Yf.A00;
        A0H(i2, c1179Yh);
        while (i2 < c1177Yf.A01 && c1179Yh.A02 != j && A0H(i2 + 1, c1179Yh).A02 <= j) {
            i2++;
        }
        A0I(i2, c1179Yh, true);
        long j3 = c1179Yh.A02;
        if (A00[7].charAt(7) != 'm') {
            A00[1] = "3ZieKL5X1T768JW4phYrzNkptEzy1ocP";
            long jMin = j - j3;
            if (c1179Yh.A01 != C.TIME_UNSET) {
                long j4 = c1179Yh.A01;
                if (A00[1].charAt(2) == 'i') {
                    A00[2] = "LahSWw1T0AjdVvbLLNcvYZLp9vt0kwQB";
                    jMin = Math.min(jMin, j4 - 1);
                }
            }
            return Pair.create(AbstractC1517es.A01(c1179Yh.A04), Long.valueOf(Math.max(0L, jMin)));
        }
        throw new RuntimeException();
    }

    public final C1179Yh A0H(int i, C1179Yh c1179Yh) {
        return A0I(i, c1179Yh, false);
    }

    public C1179Yh A0J(Object obj, C1179Yh c1179Yh) {
        return A0I(A0A(obj), c1179Yh, true);
    }

    public final C1177Yf A0K(int i, C1177Yf c1177Yf) {
        return A0L(i, c1177Yf, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, C1179Yh c1179Yh, C1177Yf c1177Yf, int i2, boolean z) {
        return A09(i, c1179Yh, c1177Yf, i2, z) == -1;
    }

    public final boolean equals(Object obj) {
        int iA0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C1177Yf c1177Yf = new C1177Yf();
        C1179Yh otherPeriod = new C1179Yh();
        C1177Yf c1177Yf2 = new C1177Yf();
        C1179Yh c1179Yh = new C1179Yh();
        int i = 0;
        while (true) {
            int iA07 = A07();
            if (A00[2].charAt(20) == 'v') {
                throw new RuntimeException();
            }
            A00[4] = "PMvZEUC2BBAfRxUz3Ht2Mf4aXvWRW3I0";
            if (i < iA07) {
                if (!A0K(i, c1177Yf).equals(timeline.A0K(i, c1177Yf2))) {
                    return false;
                }
                i++;
            } else {
                for (int i2 = 0; i2 < A06(); i2++) {
                    if (!A0I(i2, otherPeriod, true).equals(timeline.A0I(i2, c1179Yh, true))) {
                        return false;
                    }
                }
                int iA0B = A0B(true);
                if (iA0B != timeline.A0B(true) || (iA0C = A0C(true)) != timeline.A0C(true)) {
                    return false;
                }
                while (iA0B != iA0C) {
                    int iA08 = A08(iA0B, 0, true);
                    if (iA08 != timeline.A08(iA0B, 0, true)) {
                        return false;
                    }
                    iA0B = iA08;
                }
                return true;
            }
        }
    }

    public final int hashCode() {
        C1177Yf c1177Yf = new C1177Yf();
        C1179Yh c1179Yh = new C1179Yh();
        int result = 7 * 31;
        int i = result + A07();
        for (int i2 = 0; i2 < A07(); i2++) {
            C1177Yf window = A0K(i2, c1177Yf);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i3 = result2 + A06();
        for (int i4 = 0; i4 < A06(); i4++) {
            i3 = (i3 * 31) + A0I(i4, c1179Yh, true).hashCode();
        }
        int iA0B = A0B(true);
        while (iA0B != -1) {
            int windowIndex = i3 * 31;
            i3 = windowIndex + iA0B;
            iA0B = A08(iA0B, 0, true);
        }
        return i3;
    }
}
