package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M0 implements InterfaceC1743id {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public M0(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final void AC6() {
        BP.A00(new C1739iZ(this));
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final void ACA() {
        BP.A00(new C1740ia(this));
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final void AD4(C0597Ag c0597Ag) {
        BP.A00(new C1742ic(this, c0597Ag));
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final void AE0() {
        BP.A00(new C1738iY(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1743id
    public final void AE5() {
        BP.A00(new C1741ib(this));
    }
}
