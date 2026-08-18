package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class M8 extends AbstractC1341c1 {
    public final /* synthetic */ C05116v A00;

    public M8(C05116v c05116v) {
        this.A00 = c05116v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1342c2 c1342c2) {
        if (this.A00.A08 != null) {
            C1744ie.A0L(this.A00.A08.getInternalNativeAd()).A1f(false, true);
        }
        this.A00.A00.onError();
    }
}
