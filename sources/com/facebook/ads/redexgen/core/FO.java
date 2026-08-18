package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FO implements View.OnClickListener {
    public final /* synthetic */ C1619gY A00;

    public FO(C1619gY c1619gY) {
        this.A00 = c1619gY;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
