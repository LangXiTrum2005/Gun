package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class P9 implements InterfaceC1524ez {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1524ez
    public final C0949Oy A5F(Looper looper, Handler.Callback callback) {
        return new C0949Oy(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524ez
    public final long A69() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524ez
    public final long AJj() {
        return SystemClock.uptimeMillis();
    }
}
