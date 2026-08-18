package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.x;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f2059a = a();

    private static x a(u uVar) {
        byte[] bArrB;
        if (uVar == null || (bArrB = uVar.b()) == null) {
            return null;
        }
        return x.a(null, bArrB);
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(u<?> uVar, Map<String, String> map) throws IOException {
        q qVarH = uVar.h();
        if (this.f2059a != null) {
            int iQ = uVar.q() <= 0 ? 30000 : uVar.q();
            long jR = uVar.r();
            String strA = uVar.g() == 0 ? d.a(uVar.t(), uVar) : uVar.t();
            if (qVarH != null) {
                qVarH.f(strA);
                long j = iQ;
                qVarH.e(j);
                qVarH.f(j);
                qVarH.j(j);
                qVarH.a(uVar.n());
            }
            a(uVar, qVarH);
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.mbridge.msdk.thrid.okhttp.u.HTTP_1_1);
            arrayList.add(com.mbridge.msdk.thrid.okhttp.u.HTTP_2);
            t.b bVarA = this.f2059a.s().a(arrayList).a(new MBridgeHostnameVerifier(strA));
            long j2 = iQ;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            t.b bVarA2 = bVarA.d(j2, timeUnit).b(j2, timeUnit).a(qVarH == null ? com.mbridge.msdk.thrid.okhttp.m.f1982a : new j(qVarH.H(), qVarH.b(), qVarH)).e(j2, timeUnit).a(Math.max(jR, 0L), timeUnit);
            a(qVarH, bVarA2);
            w.a aVar = new w.a();
            for (Map.Entry<String, String> entry : uVar.f().entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
            aVar.a("Connection", "close");
            a(aVar, uVar);
            y yVarD = bVarA2.a().a(aVar.b(strA).a()).d();
            p pVarM = yVarD.m();
            ArrayList arrayList2 = new ArrayList();
            int iB = pVarM.b();
            for (int i = 0; i < iB; i++) {
                String strA2 = pVarM.a(i);
                String strB = pVarM.b(i);
                if (strA2 != null) {
                    arrayList2.add(new com.mbridge.msdk.tracker.network.h(strA2, strB));
                }
            }
            z zVarD = yVarD.d();
            if (zVarD == null) {
                return new g(yVarD.k(), arrayList2);
            }
            return new g(yVarD.k(), arrayList2, a(zVarD), zVarD.d());
        }
        throw new IOException("okhttp client is null");
    }

    private static void a(q qVar, t.b bVar) {
        if (qVar == null || bVar == null) {
            return;
        }
        try {
            bVar.a(new OKHTTPEventListener(qVar));
        } catch (Exception unused) {
        }
    }

    private static void a(u<?> uVar, q qVar) {
        if (qVar == null || uVar == null) {
            return;
        }
        try {
            qVar.g(uVar.m());
        } catch (Exception unused) {
        }
    }

    private int a(z zVar) {
        if (zVar == null) {
            return 0;
        }
        if (zVar.h() > 2147483647L) {
            return -1;
        }
        return (int) zVar.h();
    }

    private t a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        com.mbridge.msdk.thrid.okhttp.l lVar = new com.mbridge.msdk.thrid.okhttp.l(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
        lVar.b(50);
        lVar.a(256);
        t.b bVar = new t.b();
        bVar.d(30L, timeUnit);
        bVar.b(30L, timeUnit);
        bVar.e(30L, timeUnit);
        bVar.a(true);
        bVar.a(new com.mbridge.msdk.thrid.okhttp.h(32, 5L, TimeUnit.MINUTES));
        bVar.a(lVar);
        return bVar.a();
    }

    private static void a(w.a aVar, u<?> uVar) throws IOException {
        switch (uVar.g()) {
            case 0:
                aVar.c();
                return;
            case 1:
                x xVarA = a(uVar);
                if (xVarA != null) {
                    aVar.c(xVarA);
                    return;
                }
                throw new IOException("can't create request body for post");
            case 2:
                x xVarA2 = a(uVar);
                if (xVarA2 != null) {
                    aVar.d(xVarA2);
                    return;
                }
                throw new IOException("can't create request body for put");
            case 3:
                aVar.b();
                return;
            case 4:
                aVar.d();
                return;
            case 5:
                aVar.a("OPTIONS", (x) null);
                return;
            case 6:
                aVar.a("TRACE", (x) null);
                return;
            case 7:
                x xVarA3 = a(uVar);
                if (xVarA3 != null) {
                    aVar.b(xVarA3);
                    return;
                }
                throw new IOException("can't create request body for patch");
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
