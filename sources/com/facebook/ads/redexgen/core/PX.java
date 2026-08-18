package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PX implements InterfaceC1437dZ {
    public int A00;
    public int A01;
    public InterfaceC1434dW A02;
    public InterfaceC1437dZ A04;
    public InterfaceC1490eR A05;
    public boolean A07;
    public InterfaceC1437dZ A03 = new C0966Pp();
    public InterfaceC1499ea A06 = InterfaceC1499ea.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1437dZ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C04454e A58() {
        return A01(this.A04 != null ? this.A04.A58() : null, this.A00, this.A01);
    }

    private C04454e A01(Q7 q7, int i, int i2) {
        PY pyA57;
        InterfaceC1490eR interfaceC1490eR = (InterfaceC1490eR) AbstractC1517es.A01(this.A05);
        if (this.A07 || q7 == null) {
            pyA57 = null;
        } else if (this.A02 != null) {
            pyA57 = this.A02.A57();
        } else {
            pyA57 = new C0954Pd().A00(interfaceC1490eR).A57();
        }
        return new C04454e(interfaceC1490eR, q7, this.A03.A58(), pyA57, this.A06, i, null, i2, null);
    }

    public final QV A02() {
        return null;
    }

    public final PX A03(int i) {
        this.A00 = i;
        return this;
    }

    public final PX A04(InterfaceC1437dZ interfaceC1437dZ) {
        this.A03 = interfaceC1437dZ;
        return this;
    }

    public final PX A05(InterfaceC1437dZ interfaceC1437dZ) {
        this.A04 = interfaceC1437dZ;
        return this;
    }

    public final PX A06(InterfaceC1490eR interfaceC1490eR) {
        this.A05 = interfaceC1490eR;
        return this;
    }

    public final C04454e A07() {
        return A01(this.A04 != null ? this.A04.A58() : null, this.A00 | 1, -1000);
    }
}
