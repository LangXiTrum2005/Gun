package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OR extends AbstractC1895l7 {
    public OR() {
        super(null);
    }

    private final AbstractC1895l7 A00(int result) {
        if (result < 0) {
            return AbstractC1895l7.A02;
        }
        if (result > 0) {
            return AbstractC1895l7.A01;
        }
        return AbstractC1895l7.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1895l7
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1895l7
    public final AbstractC1895l7 A06(int left, int right) {
        return A00(AbstractC0914Nn.A01(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1895l7
    public final AbstractC1895l7 A07(long left, long right) {
        return A00(AbstractC2098oq.A01(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1895l7
    public final <T> AbstractC1895l7 A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1895l7
    public final AbstractC1895l7 A09(boolean left, boolean right) {
        return A00(PF.A00(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1895l7
    public final AbstractC1895l7 A0A(boolean left, boolean right) {
        return A00(PF.A00(right, left));
    }
}
