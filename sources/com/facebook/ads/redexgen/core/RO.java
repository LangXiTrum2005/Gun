package com.facebook.ads.redexgen.core;

import android.database.Cursor;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RO implements InterfaceC1211Zo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC1210Zn.A00(this);
    }

    public RO(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C1207Zk A00() {
        return C05548n.A01(this.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1211Zo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1211Zo
    public final boolean moveToPosition(int i) {
        return this.A00.moveToPosition(i);
    }
}
