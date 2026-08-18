package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FI implements Runnable {
    public final /* synthetic */ AbstractC1622gb A00;

    public FI(AbstractC1622gb abstractC1622gb) {
        this.A00 = abstractC1622gb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0F.getVisibility() == 0) {
                this.A00.A0R(8);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
