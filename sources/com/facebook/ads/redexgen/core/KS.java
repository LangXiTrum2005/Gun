package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class KS extends AbstractC1326bm {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C1318be A00;

    public KS(C1318be c1318be) {
        this.A00 = c1318be;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C9K
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1327bn c1327bn) {
        if (this.A00.A01 != null && !this.A00.A03 && c1327bn.A00().getAction() == 0) {
            C1318be c1318be = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            c1318be.A05.removeCallbacksAndMessages(null);
            if (this.A00.A0D(EnumC0797Ip.A04)) {
                this.A00.A03();
                C1318be c1318be2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c1318be2.A06(true, false);
                } else {
                    c1318be2.A06(true, false);
                }
            }
            if (this.A00.A02) {
                this.A00.A05.postDelayed(new C1319bf(this), this.A00.A00);
            }
        }
    }
}
