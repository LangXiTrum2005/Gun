package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S8 implements YK {
    public final C1575fp A00 = new C1575fp(new byte[4]);
    public final /* synthetic */ S6 A01;

    public S8(S6 s6) {
        this.A01 = s6;
    }

    @Override // com.facebook.ads.redexgen.core.YK
    public final void A50(C1576fq c1576fq) {
        int tableId = c1576fq.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c1576fq.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c1576fq.A0g(6);
        int iA07 = c1576fq.A07() / 4;
        for (int i = 0; i < iA07; i++) {
            c1576fq.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int iA04 = this.A00.A04(13);
                if (this.A01.A0B.get(iA04) == null) {
                    this.A01.A0B.put(iA04, new SU(new S7(this.A01, iA04)));
                    S6.A02(this.A01);
                }
            }
        }
        int secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            this.A01.A0B.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.YK
    public final void AA3(C1590g4 c1590g4, UL ul, YS ys) {
    }
}
