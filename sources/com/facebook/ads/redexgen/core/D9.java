package com.facebook.ads.redexgen.core;

import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D9 extends Timeline {
    public final OI<C1179Yh> A00;
    public final OI<C1177Yf> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Window> */
    public D9(OI<C1177Yf> oi, OI<C1179Yh> oi2, int[] iArr) {
        AbstractC1517es.A07(oi.size() == iArr.length);
        this.A01 = oi;
        this.A00 = oi2;
        this.A02 = iArr;
        this.A03 = new int[iArr.length];
        for (int i = 0; i < i; i++) {
            int[] iArr2 = this.A03;
            int i2 = iArr[i];
            iArr2[i2] = i;
        }
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A06() {
        return this.A00.size();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A07() {
        return this.A01.size();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A08(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == A0C(z)) {
            if (i2 == 2) {
                return A0B(z);
            }
            return -1;
        }
        if (z) {
            return this.A02[this.A03[i] + 1];
        }
        return i + 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A0A(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A0B(boolean z) {
        if (A0N()) {
            return -1;
        }
        if (z) {
            return this.A02[0];
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        if (z) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final C1179Yh A0I(int i, C1179Yh p, boolean z) {
        C1179Yh p2 = this.A00.get(i);
        p.A0G(p2.A03, p2.A04, p2.A00, p2.A01, p2.A02, p2.A06, p2.A05);
        return p;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final C1177Yf A0L(int i, C1177Yf c1177Yf, long j) {
        C1177Yf c1177Yf2 = this.A01.get(i);
        c1177Yf.A07(c1177Yf2.A0C, c1177Yf2.A09, c1177Yf2.A0A, c1177Yf2.A06, c1177Yf2.A07, c1177Yf2.A04, c1177Yf2.A0G, c1177Yf2.A0D, c1177Yf2.A08, c1177Yf2.A02, c1177Yf2.A03, c1177Yf2.A00, c1177Yf2.A01, c1177Yf2.A05);
        c1177Yf.A0F = c1177Yf2.A0F;
        return c1177Yf;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object A0M(int i) {
        throw new UnsupportedOperationException();
    }
}
