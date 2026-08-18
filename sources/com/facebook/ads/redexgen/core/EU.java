package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EU implements View.OnClickListener {
    public final /* synthetic */ C1661hE A00;

    public EU(C1661hE c1661hE) {
        this.A00 = c1661hE;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9S();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
