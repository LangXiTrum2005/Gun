package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ET implements View.OnClickListener {
    public final /* synthetic */ EL A00;
    public final /* synthetic */ C1661hE A01;

    public ET(C1661hE c1661hE, EL el) {
        this.A01 = c1661hE;
        this.A00 = el;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AAf();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
