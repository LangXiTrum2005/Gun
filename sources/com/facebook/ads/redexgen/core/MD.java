package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MD extends AbstractC1335bv {
    public final /* synthetic */ C05116v A00;

    public MD(C05116v c05116v) {
        this.A00 = c05116v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1336bw c1336bw) {
        if (this.A00.A08 != null) {
            C1744ie.A0L(this.A00.A08.getInternalNativeAd()).A1f(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
