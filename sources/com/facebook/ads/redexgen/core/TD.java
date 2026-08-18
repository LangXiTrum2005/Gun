package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TD implements InterfaceC1142Wv {
    public final XY A00;
    public final Map<String, C1152Xf> A01;
    public final Map<String, String> A02;
    public final Map<String, XZ> A03;
    public final long[] A04;

    public TD(XY xy, Map<String, C1152Xf> map, Map<String, XZ> map2, Map<String, String> imageMap) {
        this.A00 = xy;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = xy.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final List<C0982Qh> A7N(long j) {
        return this.A00.A0E(j, this.A01, this.A03, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final long A7t(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final int A7u() {
        return this.A04.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1142Wv
    public final int A8Q(long j) {
        int iA0K = AbstractC1600gE.A0K(this.A04, j, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
