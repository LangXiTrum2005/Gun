package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f2005a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2005a = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j) throws IOException {
        this.f2005a.a(cVar, j);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f2005a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2005a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.f2005a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2005a.toString() + ")";
    }
}
