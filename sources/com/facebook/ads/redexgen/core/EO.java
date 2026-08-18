package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EO implements View.OnClickListener {
    public final /* synthetic */ C1662hF A00;

    public EO(C1662hF c1662hF) {
        this.A00 = c1662hF;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.AE6(EnumC04233i.A06);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
