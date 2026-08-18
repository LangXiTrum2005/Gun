package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HK {
    public String A02;
    public String A03;
    public String A04;
    public final C03892a A06;
    public final C04022n A07;
    public final C1828k1 A08;
    public C03912c A01 = C03912c.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public HK(C1828k1 c1828k1, C03892a c03892a, C04022n c04022n) {
        this.A08 = c1828k1;
        this.A06 = c03892a;
        this.A07 = c04022n;
    }

    public final HK A09(int i) {
        this.A00 = i;
        return this;
    }

    public final HK A0A(C03912c c03912c) {
        this.A01 = c03912c;
        return this;
    }

    public final HK A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final HK A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final HK A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final HK A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final HM A0F() {
        return new HM(this, null);
    }
}
