package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class j implements Closeable {
    private static final Logger g = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.d f1963a;
    private final boolean b;
    private final com.mbridge.msdk.thrid.okio.c c;
    private int d;
    private boolean e;
    final d.b f;

    public j(com.mbridge.msdk.thrid.okio.d dVar, boolean z) {
        this.f1963a = dVar;
        this.b = z;
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        this.c = cVar;
        this.f = new d.b(cVar);
        this.d = 16384;
    }

    public synchronized void a(m mVar) throws IOException {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            this.d = mVar.c(this.d);
            if (mVar.b() != -1) {
                this.f.b(mVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f1963a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(m mVar) throws IOException {
        int i;
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            int i2 = 0;
            a(0, mVar.d() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (mVar.d(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f1963a.writeShort(i);
                    this.f1963a.writeInt(mVar.a(i2));
                }
                i2++;
            }
            this.f1963a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.e = true;
        this.f1963a.close();
    }

    public synchronized void d() throws IOException {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            if (this.b) {
                Logger logger = g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.mbridge.msdk.thrid.okhttp.internal.c.a(">> CONNECTION %s", e.f1953a.b()));
                }
                this.f1963a.write(e.f1953a.g());
                this.f1963a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f1963a.flush();
    }

    public int h() {
        return this.d;
    }

    public synchronized void a(int i, int i2, List<c> list) throws IOException {
        if (!this.e) {
            this.f.a(list);
            long size = this.c.size();
            int iMin = (int) Math.min(this.d - 4, size);
            long j = iMin;
            a(i, iMin + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
            this.f1963a.writeInt(i2 & Integer.MAX_VALUE);
            this.f1963a.a(this.c, j);
            if (size > j) {
                b(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void b(int i, long j) throws IOException {
        while (j > 0) {
            int iMin = (int) Math.min(this.d, j);
            long j2 = iMin;
            j -= j2;
            a(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f1963a.a(this.c, j2);
        }
    }

    public synchronized void a(boolean z, int i, int i2, List<c> list) throws IOException {
        if (!this.e) {
            a(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i, b bVar) throws IOException {
        if (!this.e) {
            if (bVar.f1948a != -1) {
                a(i, 4, (byte) 3, (byte) 0);
                this.f1963a.writeInt(bVar.f1948a);
                this.f1963a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i, com.mbridge.msdk.thrid.okio.c cVar, int i2) throws IOException {
        if (!this.e) {
            a(i, z ? (byte) 1 : (byte) 0, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public void a(int i, byte b, com.mbridge.msdk.thrid.okio.c cVar, int i2) throws IOException {
        a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f1963a.a(cVar, i2);
        }
    }

    public synchronized void a(boolean z, int i, int i2) throws IOException {
        if (!this.e) {
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f1963a.writeInt(i);
            this.f1963a.writeInt(i2);
            this.f1963a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i, b bVar, byte[] bArr) throws IOException {
        try {
            if (!this.e) {
                if (bVar.f1948a != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f1963a.writeInt(i);
                    this.f1963a.writeInt(bVar.f1948a);
                    if (bArr.length > 0) {
                        this.f1963a.write(bArr);
                    }
                    this.f1963a.flush();
                } else {
                    throw e.a("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(int i, long j) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j != 0 && j <= 2147483647L) {
            a(i, 4, (byte) 8, (byte) 0);
            this.f1963a.writeInt((int) j);
            this.f1963a.flush();
        } else {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
    }

    public void a(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i, i2, b, b2));
        }
        int i3 = this.d;
        if (i2 > i3) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw e.a("reserved bit set: %s", Integer.valueOf(i));
        }
        a(this.f1963a, i2);
        this.f1963a.writeByte(b & 255);
        this.f1963a.writeByte(b2 & 255);
        this.f1963a.writeInt(i & Integer.MAX_VALUE);
    }

    private static void a(com.mbridge.msdk.thrid.okio.d dVar, int i) throws IOException {
        dVar.writeByte((i >>> 16) & 255);
        dVar.writeByte((i >>> 8) & 255);
        dVar.writeByte(i & 255);
    }

    public void a(boolean z, int i, List<c> list) throws IOException {
        if (!this.e) {
            this.f.a(list);
            long size = this.c.size();
            int iMin = (int) Math.min(this.d, size);
            long j = iMin;
            byte b = size == j ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            a(i, iMin, (byte) 1, b);
            this.f1963a.a(this.c, j);
            if (size > j) {
                b(i, size - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
