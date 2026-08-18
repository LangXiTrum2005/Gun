package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YN implements InterfaceC0904Nb {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final AbstractC1933lm<C1175Yc, YW> A0G;
    public final OG<Integer> A0H;
    public final List<String> A0I;
    public final List<String> A0J;
    public final List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final List<String> A0L;
    public final List<String> A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public static String[] A0R = {"3flTCt6Ahfq1piwneKFx5b7teRo2XFm1", "bOLRonAZjSivNY3pEIWSn6pHj18ozExm", "S6noHKJfzkHMg7dUBICsxcz4aDA6Lld1", "gmAwNXqfhYb7ghakdEuZQMcQTZ0gXXxk", "H", "Gvp2H0dUXvpdMKRABuH0YUpllZZIbEMC", "W5D7Lki0itbDxywftuvRprYj6BxoApgi", "4"};
    public static final YN A0U = new C0997Qx().A0u();

    @Deprecated
    public static final YN A0T = A0U;
    public static final String A0j = AbstractC1600gE.A0h(1);
    public static final String A0l = AbstractC1600gE.A0h(2);
    public static final String A0m = AbstractC1600gE.A0h(3);
    public static final String A0n = AbstractC1600gE.A0h(4);
    public static final String A0s = AbstractC1600gE.A0h(5);
    public static final String A0e = AbstractC1600gE.A0h(6);
    public static final String A0d = AbstractC1600gE.A0h(7);
    public static final String A0c = AbstractC1600gE.A0h(8);
    public static final String A0b = AbstractC1600gE.A0h(9);
    public static final String A0i = AbstractC1600gE.A0h(10);
    public static final String A0h = AbstractC1600gE.A0h(11);
    public static final String A0g = AbstractC1600gE.A0h(12);
    public static final String A0f = AbstractC1600gE.A0h(13);
    public static final String A0v = AbstractC1600gE.A0h(14);
    public static final String A0t = AbstractC1600gE.A0h(15);
    public static final String A0u = AbstractC1600gE.A0h(16);
    public static final String A0p = AbstractC1600gE.A0h(17);
    public static final String A0a = AbstractC1600gE.A0h(18);
    public static final String A0Z = AbstractC1600gE.A0h(19);
    public static final String A0k = AbstractC1600gE.A0h(20);
    public static final String A0X = AbstractC1600gE.A0h(21);
    public static final String A0W = AbstractC1600gE.A0h(22);
    public static final String A0r = AbstractC1600gE.A0h(23);
    public static final String A0V = AbstractC1600gE.A0h(24);
    public static final String A0q = AbstractC1600gE.A0h(25);
    public static final String A0Y = AbstractC1600gE.A0h(26);

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static final String A0o = AbstractC1600gE.A0h(27);

    @Deprecated
    public static final InterfaceC0903Na<YN> A0S = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.YR
        @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
        public final InterfaceC0904Nb A6V(Bundle bundle) {
            return YN.A0P(bundle);
        }
    };

    public YN(C0997Qx c0997Qx) {
        this.A06 = c0997Qx.A06;
        this.A05 = c0997Qx.A05;
        this.A04 = c0997Qx.A04;
        this.A03 = c0997Qx.A03;
        this.A0A = c0997Qx.A0A;
        this.A09 = c0997Qx.A09;
        this.A08 = c0997Qx.A08;
        this.A07 = c0997Qx.A07;
        this.A0F = c0997Qx.A0F;
        this.A0E = c0997Qx.A0E;
        this.A0Q = c0997Qx.A0Q;
        this.A0M = c0997Qx.A0M;
        this.A0D = c0997Qx.A0D;
        this.A0L = c0997Qx.A0L;
        this.A0I = c0997Qx.A0I;
        this.A0B = c0997Qx.A0B;
        this.A02 = c0997Qx.A02;
        this.A01 = c0997Qx.A01;
        this.A0J = c0997Qx.A0J;
        this.A0K = c0997Qx.A0K;
        this.A0C = c0997Qx.A0C;
        this.A00 = c0997Qx.A00;
        this.A0P = c0997Qx.A0P;
        this.A0O = c0997Qx.A0O;
        this.A0N = c0997Qx.A0N;
        this.A0G = AbstractC1933lm.A06(c0997Qx.A0G);
        this.A0H = OG.A07(c0997Qx.A0H);
    }

    public static YN A0P(Bundle bundle) {
        return new C0997Qx(bundle).A0u();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        YN yn = (YN) obj;
        if (this.A06 == yn.A06) {
            int i = this.A05;
            int i2 = yn.A05;
            String[] strArr = A0R;
            if (strArr[3].charAt(8) != strArr[0].charAt(8)) {
                throw new RuntimeException();
            }
            A0R[2] = "m123ZjxDyH6FVeAPvauFPaUT8Dyqb1yS";
            if (i == i2 && this.A04 == yn.A04 && this.A03 == yn.A03) {
                int i3 = this.A0A;
                if (A0R[6].charAt(23) == 'J') {
                    throw new RuntimeException();
                }
                A0R[2] = "3FISEUX4NWBULZmOMUzRIp5QNDlvcSwU";
                if (i3 == yn.A0A && this.A09 == yn.A09 && this.A08 == yn.A08 && this.A07 == yn.A07 && this.A0Q == yn.A0Q && this.A0F == yn.A0F && this.A0E == yn.A0E && this.A0M.equals(yn.A0M) && this.A0D == yn.A0D && this.A0L.equals(yn.A0L) && this.A0I.equals(yn.A0I) && this.A0B == yn.A0B && this.A02 == yn.A02 && this.A01 == yn.A01 && this.A0J.equals(yn.A0J) && this.A0K.equals(yn.A0K) && this.A0C == yn.A0C && this.A00 == yn.A00 && this.A0P == yn.A0P && this.A0O == yn.A0O && this.A0N == yn.A0N && this.A0G.equals(yn.A0G) && this.A0H.equals(yn.A0H)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((1 * 31) + this.A06) * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A0A) * 31) + this.A09) * 31) + this.A08) * 31) + this.A07) * 31) + (this.A0Q ? 1 : 0)) * 31) + this.A0F) * 31) + this.A0E) * 31) + this.A0M.hashCode()) * 31) + this.A0D) * 31) + this.A0L.hashCode()) * 31) + this.A0I.hashCode()) * 31) + this.A0B) * 31) + this.A02) * 31) + this.A01) * 31) + this.A0J.hashCode()) * 31) + this.A0K.hashCode()) * 31) + this.A0C) * 31) + this.A00) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + this.A0G.hashCode()) * 31) + this.A0H.hashCode();
    }
}
