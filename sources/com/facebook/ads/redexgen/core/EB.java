package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EB extends View {
    public EA A00;

    public EB(C1828k1 c1828k1, EA ea) {
        super(c1828k1);
        this.A00 = ea;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        EA ea = this.A00;
    }
}
