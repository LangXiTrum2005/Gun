package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0W extends C03701h {
    public C0863Ld A00;
    public List<C0758Hc> A01;

    public C0W(C1828k1 c1828k1) {
        super(c1828k1);
        this.A00 = new C0863Ld(this, 1, null, null, null);
    }

    public final void A20(JL jl) {
        if (this.A00 != null) {
            this.A00.A0c(jl);
        }
    }

    public C0863Ld getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
