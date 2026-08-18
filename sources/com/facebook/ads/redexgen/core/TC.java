package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TC implements InterfaceC1142Wv {
    public static final TC A01 = new TC();
    public final List<C0982Qh> A00;

    public TC() {
        this.A00 = Collections.emptyList();
    }

    public TC(C0982Qh c0982Qh) {
        this.A00 = Collections.singletonList(c0982Qh);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final List<C0982Qh> A7N(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final long A7t(int i) {
        AbstractC1517es.A07(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final int A7u() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final int A8Q(long j) {
        return j < 0 ? 0 : -1;
    }
}
