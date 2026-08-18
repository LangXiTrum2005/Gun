package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2012a = new c();
    public final r b;
    boolean c;

    public m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f2012a;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.c) {
            return;
        }
        c cVar = this.f2012a;
        long j = cVar.b;
        if (j > 0) {
            this.b.a(cVar, j);
        }
        th = null;
        try {
            this.b.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f2012a.m();
        if (jM > 0) {
            this.b.a(this.f2012a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f2012a;
        long j = cVar.b;
        if (j > 0) {
            this.b.a(cVar, j);
        }
        this.b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    public String toString() {
        return "buffer(" + this.b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f2012a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f2012a.writeByte(i);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f2012a.writeInt(i);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f2012a.writeShort(i);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f2012a.a(cVar, j);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.c) {
            this.f2012a.write(bArr, i, i2);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (!this.c) {
            this.f2012a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.c) {
            int iWrite = this.f2012a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j) throws IOException {
        if (!this.c) {
            this.f2012a.a(j);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
