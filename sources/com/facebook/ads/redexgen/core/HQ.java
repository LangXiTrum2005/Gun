package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HQ implements Runnable {
    public final /* synthetic */ C0843Kj A00;

    public HQ(C0843Kj c0843Kj) {
        this.A00 = c0843Kj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            ((AbstractC1476eD) this.A00).A09.A4Z(((AbstractC1476eD) this.A00).A0A.A7m());
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
