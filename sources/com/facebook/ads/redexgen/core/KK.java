package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class KK extends AbstractC1326bm {
    public final /* synthetic */ C1311bX A00;

    public KK(C1311bX c1311bX) {
        this.A00 = c1311bX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1327bn c1327bn) {
        if (this.A00.A01 == null || c1327bn.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C0785Id(this));
    }
}
