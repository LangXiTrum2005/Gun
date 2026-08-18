package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class E5 implements View.OnClickListener {
    public final /* synthetic */ C1666hJ A00;

    public E5(C1666hJ c1666hJ) {
        this.A00 = c1666hJ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A07.ADA();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
