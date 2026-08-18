package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class V5 {
    public final InterfaceC1086Uo A00;

    public abstract boolean A0B(C1576fq c1576fq) throws Q6;

    public abstract boolean A0C(C1576fq c1576fq, long j) throws Q6;

    public V5(InterfaceC1086Uo interfaceC1086Uo) {
        this.A00 = interfaceC1086Uo;
    }

    public final boolean A00(C1576fq c1576fq, long j) throws Q6 {
        return A0B(c1576fq) && A0C(c1576fq, j);
    }
}
