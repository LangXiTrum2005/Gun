package com.facebook.ads.redexgen.core;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IO extends ContentObserver {
    public final C1348c8 A00;

    public IO(Handler handler, C1348c8 c1348c8) {
        super(handler);
        this.A00 = c1348c8;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0f();
    }
}
