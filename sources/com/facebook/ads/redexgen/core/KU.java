package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class KU extends AbstractC1335bv {
    public final /* synthetic */ C1318be A00;

    public KU(C1318be c1318be) {
        this.A00 = c1318be;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1336bw c1336bw) {
        if (!this.A00.A03 || !this.A00.A02) {
            return;
        }
        this.A00.A03 = false;
        if (!this.A00.A0D(EnumC0797Ip.A03) && !this.A00.A04) {
            if (!this.A00.A0D(EnumC0797Ip.A02)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A04 = false;
        this.A00.A05.postDelayed(new C1321bh(this), this.A00.A00);
    }
}
