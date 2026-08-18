package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N1 extends AbstractC1969mN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ N0 A01;
    public final /* synthetic */ C1982mb A02;
    public final /* synthetic */ C0898Mu A03;
    public final /* synthetic */ C1828k1 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(N0 n0, boolean z, C1828k1 c1828k1, C0898Mu c0898Mu, C1982mb c1982mb, int i) {
        super(z);
        this.A01 = n0;
        this.A04 = c1828k1;
        this.A03 = c0898Mu;
        this.A02 = c1982mb;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1969mN
    public final void A00() {
        this.A01.A01.AEz(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1969mN
    public final void A01(boolean z) {
        N0.A0D = null;
        if (z) {
            this.A04.A01().AIK(this.A03.A1g(), this.A02.A1a());
        }
        if (this.A00 == 0) {
            this.A01.A0C.set(true);
            this.A01.A01.AEw(this.A01);
        }
        this.A01.A0C(this.A04, this.A02, this.A00 + 1);
    }
}
