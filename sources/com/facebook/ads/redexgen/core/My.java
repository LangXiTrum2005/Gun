package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class My extends AbstractC1985me {
    public final C1828k1 A00;

    public My(C0X c0x, List<C1744ie> list, C1828k1 c1828k1) {
        super(c0x, list, c1828k1);
        this.A00 = c1828k1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1698hr A0D(ViewGroup viewGroup, int i) {
        return new C1698hr(new C0655Dd(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04805q
    /* JADX INFO: renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final void A0E(C1698hr c1698hr, int i) {
        super.A0E(c1698hr, i);
        C0655Dd c0655Dd = (C0655Dd) c1698hr.A0j();
        E0 imageView = (E0) c0655Dd.getImageCardView();
        imageView.setImageDrawable(null);
        A0G(imageView, i);
        C1744ie childAd = ((AbstractC1985me) this).A01.get(i);
        childAd.A12().A0L(this.A00);
        childAd.A1O(c0655Dd, c0655Dd);
    }
}
