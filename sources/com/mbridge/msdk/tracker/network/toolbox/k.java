package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import com.mbridge.msdk.tracker.network.a0;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.c0;
import com.mbridge.msdk.tracker.network.d0;
import com.mbridge.msdk.tracker.network.e0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.s;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.z;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class k {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f2058a;
        final d0 b;

        private b(String str, d0 d0Var) {
            this.f2058a = str;
            this.b = d0Var;
        }
    }

    public static void a(long j, u<?> uVar, byte[] bArr, int i) {
        if (j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = uVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(uVar.o().c());
            e0.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    public static r a(u<?> uVar, long j, List<com.mbridge.msdk.tracker.network.h> list) {
        com.mbridge.msdk.tracker.network.b.a aVarD = uVar.d();
        if (aVarD == null) {
            return new r(304, null, true, j, list);
        }
        return new r(304, aVarD.f2039a, true, j, f.a(list, aVarD));
    }

    public static byte[] a(InputStream inputStream, int i, c cVar, q qVar) throws Throwable {
        byte[] bArrA;
        n nVar = new n(cVar, i);
        a(qVar);
        try {
            bArrA = cVar.a(1024);
            while (true) {
                try {
                    int i2 = inputStream.read(bArrA);
                    if (i2 == -1) {
                        break;
                    }
                    nVar.write(bArrA, 0, i2);
                    a(qVar, i2);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            e0.d("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.a(bArrA);
                    nVar.close();
                    throw th;
                }
            }
            byte[] byteArray = nVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                e0.d("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.a(bArrA);
            nVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }

    private static void a(q qVar) {
        if (qVar != null) {
            qVar.c(0L);
        }
    }

    private static void a(q qVar, int i) {
        if (qVar != null) {
            qVar.c(qVar.B() + ((long) i));
        }
    }

    public static void a(u<?> uVar, b bVar) throws d0 {
        if (uVar == null) {
            throw new c0("request is null when retrying");
        }
        if (bVar != null) {
            z zVarO = uVar.o();
            if (zVarO != null) {
                if (!zVarO.a(bVar.b)) {
                    throw bVar.b;
                }
                return;
            }
            throw bVar.b;
        }
        throw new c0("retry info is null when retrying");
    }

    public static b a(u<?> uVar, IOException iOException, long j, g gVar, byte[] bArr) throws d0 {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new b0());
        }
        if (iOException instanceof MalformedURLException) {
            throw new com.mbridge.msdk.tracker.network.a("Bad URL " + uVar.t());
        }
        if (gVar != null) {
            int iD = gVar.d();
            e0.c("Unexpected response code %d for %s", Integer.valueOf(iD), uVar.t());
            if (bArr != null) {
                r rVar = new r(iD, bArr, false, SystemClock.elapsedRealtime() - j, gVar.c());
                if (iD >= 400 && iD <= 499) {
                    com.mbridge.msdk.tracker.network.d dVar = new com.mbridge.msdk.tracker.network.d(rVar);
                    dVar.a(iD);
                    throw dVar;
                }
                a0 a0Var = new a0(rVar);
                a0Var.a(iD);
                if (iD >= 500 && iD <= 599 && uVar.B()) {
                    return new b("server", a0Var);
                }
                throw a0Var;
            }
            p pVar = new p();
            pVar.a(iD);
            return new b("network", pVar);
        }
        if (uVar.A()) {
            return new b("connection", new s());
        }
        throw new s(iOException);
    }
}
