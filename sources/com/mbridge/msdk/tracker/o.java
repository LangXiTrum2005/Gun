package com.mbridge.msdk.tracker;

import com.mbridge.msdk.tracker.network.d0;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f2067a;
    private final int b;
    private final p c;
    private final w d;
    private final int e;
    private com.mbridge.msdk.tracker.network.v f;
    private final Executor g;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    public static final class b implements com.mbridge.msdk.tracker.network.w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f2069a;
        private final t b;

        public b(r rVar, t tVar) {
            this.f2069a = rVar;
            this.b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.w.a
        public void a(d0 d0Var) {
            int iA;
            int iC;
            String message;
            if (y.a(this.f2069a)) {
                if (d0Var != null) {
                    try {
                        iA = d0Var.a();
                        iC = d0Var.c();
                        message = d0Var.getMessage();
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    message = "";
                    iA = 0;
                    iC = 0;
                }
                this.f2069a.a(this.b, 0, "volleyError:" + iA + ",responseCode:" + iC + ",errorMessage:" + message);
            }
        }
    }

    public static final class c implements com.mbridge.msdk.tracker.network.w.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f2070a;
        private final t b;

        public c(r rVar, t tVar) {
            this.f2070a = rVar;
            this.b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.w.b
        public void a(Object obj) {
            if (y.a(this.f2070a)) {
                try {
                    this.f2070a.a(this.b);
                } catch (Exception unused) {
                }
            }
        }
    }

    public o(int i, p pVar, w wVar, int i2) {
        this.b = i;
        this.c = pVar;
        this.d = wVar;
        this.e = i2;
        this.g = new ThreadPoolExecutor(i, i, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void a(r rVar) {
        this.f2067a = rVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z) {
        if (y.b(map)) {
            r rVar = this.f2067a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f.a(a(tVar, map, z));
        } catch (Exception e) {
            if (y.a(this.f2067a)) {
                this.f2067a.a(tVar, 0, e.getMessage());
            }
        }
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z) {
        v<Object> vVar = this.e == 1 ? new v<>(this.c.c(), 1, this.c.a()) : new v<>(this.c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.d);
        vVar.a(z ? com.mbridge.msdk.tracker.network.u.a.HIGH : com.mbridge.msdk.tracker.network.u.a.NORMAL);
        vVar.a((com.mbridge.msdk.tracker.network.w.b<Object>) new c(this.f2067a, tVar));
        vVar.a((com.mbridge.msdk.tracker.network.w.a) new b(this.f2067a, tVar));
        return vVar;
    }

    private void a() {
        if (y.a(this.f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.v vVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.c.b()), new com.mbridge.msdk.tracker.network.g(this.g), this.b, null);
        this.f = vVarA;
        vVarA.b();
    }
}
