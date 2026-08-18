package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class GR implements View.OnClickListener {
    public final /* synthetic */ C1577fr A00;

    public GR(C1577fr c1577fr) {
        this.A00 = c1577fr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 == null) {
                return;
            }
            this.A00.A02.AJ5();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
