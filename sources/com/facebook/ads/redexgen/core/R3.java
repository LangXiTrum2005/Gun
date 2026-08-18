package com.facebook.ads.redexgen.core;

import android.net.Uri;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class R3 implements InterfaceC1470e7, InterfaceC1271aq {
    public long A00;
    public InterfaceC1086Uo A01;
    public C1447dj A02;
    public boolean A04;
    public final Uri A06;
    public final UL A07;
    public final InterfaceC1293bF A09;
    public final AnonymousClass51 A0A;
    public final C1527f2 A0B;
    public volatile boolean A0C;
    public final /* synthetic */ C05237h A0D;
    public final C1081Ug A08 = new C1081Ug();
    public boolean A03 = true;
    public final long A05 = C1272ar.A00();

    public R3(C05237h c05237h, Uri uri, Q7 q7, InterfaceC1293bF interfaceC1293bF, UL ul, C1527f2 c1527f2) {
        this.A0D = c05237h;
        this.A06 = uri;
        this.A0A = new AnonymousClass51(q7);
        this.A09 = interfaceC1293bF;
        this.A07 = ul;
        this.A0B = c1527f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j, long j2) {
        this.A08.A00 = j;
        this.A00 = j2;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1470e7
    public final void A4h() {
        this.A0C = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00fa */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1470e7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AAg() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.R3.AAg():void");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1271aq
    public final void ADK(C1576fq c1576fq) {
        long jMax;
        if (this.A04) {
            jMax = Math.max(this.A0D.A03(true), this.A00);
        } else {
            jMax = this.A00;
        }
        int iA07 = c1576fq.A07();
        InterfaceC1086Uo interfaceC1086Uo = (InterfaceC1086Uo) AbstractC1517es.A01(this.A01);
        interfaceC1086Uo.AHx(c1576fq, iA07);
        interfaceC1086Uo.AI0(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}
