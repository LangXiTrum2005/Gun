package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N2 extends AbstractC1969mN {
    public final /* synthetic */ N0 A00;
    public final /* synthetic */ AbstractC1988mh A01;
    public final /* synthetic */ C0898Mu A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2(N0 n0, boolean z, boolean z2, C0898Mu c0898Mu, AbstractC1988mh abstractC1988mh) {
        super(z);
        this.A00 = n0;
        this.A03 = z2;
        this.A02 = c0898Mu;
        this.A01 = abstractC1988mh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1969mN
    public final void A00() {
        this.A00.A01.AEz(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1969mN
    public final void A01(boolean z) {
        if (!C05789m.A1m(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == BG.A0I) {
                this.A00.A04.A0F().ADg();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AEw(this.A01);
            return;
        }
        this.A00.A06 = AbstractC0748Gs.A01(this.A00.A04, this.A02, 0, new C1998mr(this));
    }
}
