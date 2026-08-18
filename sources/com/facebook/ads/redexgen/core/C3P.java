package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C3P {
    public static C3O A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static C3O A00(C1827k0 c1827k0) {
        if (A00 == null) {
            A00 = new C3O(c1827k0);
        }
        return A00;
    }

    public static void A01(C1827k0 c1827k0) {
        if (AbstractC05819p.A0C(c1827k0)) {
            A03(c1827k0);
        }
    }

    public static void A02(C1827k0 c1827k0) {
        if (AbstractC05819p.A0B(c1827k0)) {
            A03(c1827k0);
        }
    }

    public static void A03(C1827k0 c1827k0) {
        if (A01.compareAndSet(false, true)) {
            ExecutorC0649Cx.A01.execute(new C1934ln(c1827k0));
        }
    }
}
