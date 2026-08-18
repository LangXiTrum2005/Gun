package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOException f1931a;
    private IOException b;

    public e(IOException iOException) {
        super(iOException);
        this.f1931a = iOException;
        this.b = iOException;
    }

    public IOException a() {
        return this.f1931a;
    }

    public IOException b() {
        return this.b;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f1931a, (Throwable) iOException);
        this.b = iOException;
    }
}
