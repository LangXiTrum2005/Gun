package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f2009a = Logger.getLogger(l.class.getName());

    public static class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f2010a;
        final /* synthetic */ OutputStream b;

        public a(t tVar, OutputStream outputStream) {
            this.f2010a = tVar;
            this.b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            u.a(cVar.b, 0L, j);
            while (j > 0) {
                this.f2010a.e();
                o oVar = cVar.f2002a;
                int iMin = (int) Math.min(j, oVar.c - oVar.b);
                this.b.write(oVar.f2015a, oVar.b, iMin);
                int i = oVar.b + iMin;
                oVar.b = i;
                long j2 = iMin;
                j -= j2;
                cVar.b -= j2;
                if (i == oVar.c) {
                    cVar.f2002a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f2010a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            this.b.flush();
        }

        public String toString() {
            return "sink(" + this.b + ")";
        }
    }

    public static class c extends com.mbridge.msdk.thrid.okio.a {
        final /* synthetic */ Socket k;

        public c(Socket socket) {
            this.k = socket;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            try {
                this.k.close();
            } catch (AssertionError e) {
                if (!l.a(e)) {
                    throw e;
                }
                l.f2009a.log(Level.WARNING, "Failed to close timed out socket " + this.k, (Throwable) e);
            } catch (Exception e2) {
                l.f2009a.log(Level.WARNING, "Failed to close timed out socket " + this.k, (Throwable) e2);
            }
        }
    }

    private l() {
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
        return aVarC.a(a(socket.getInputStream(), aVarC));
    }

    private static com.mbridge.msdk.thrid.okio.a c(Socket socket) {
        return new c(socket);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static r a(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
                return aVarC.a(a(socket.getOutputStream(), aVarC));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f2011a;
        final /* synthetic */ InputStream b;

        public b(t tVar, InputStream inputStream) {
            this.f2011a = tVar;
            this.b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC5044xl.h("byteCount < 0: ", j));
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.f2011a.e();
                o oVarB = cVar.b(1);
                int i = this.b.read(oVarB.f2015a, oVarB.c, (int) Math.min(j, 8192 - oVarB.c));
                if (i == -1) {
                    return -1L;
                }
                oVarB.c += i;
                long j2 = i;
                cVar.b += j2;
                return j2;
            } catch (AssertionError e) {
                if (l.a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        public String toString() {
            return "source(" + this.b + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f2011a;
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
