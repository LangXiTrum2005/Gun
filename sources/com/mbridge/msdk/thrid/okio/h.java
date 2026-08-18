package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f2006a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2006a = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f2006a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2006a.close();
    }

    public final s d() {
        return this.f2006a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2006a.toString() + ")";
    }
}
