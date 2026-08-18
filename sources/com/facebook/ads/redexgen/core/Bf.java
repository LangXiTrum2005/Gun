package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Bf {
    public static final AtomicReference<InterfaceC0612Be> A00 = new AtomicReference<>(null);

    public static InterfaceC0612Be A00() {
        InterfaceC0612Be errorLogger = A00.get();
        if (errorLogger == null) {
            return new C1728iN();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC0612Be interfaceC0612Be) {
        A00.set(interfaceC0612Be);
    }
}
