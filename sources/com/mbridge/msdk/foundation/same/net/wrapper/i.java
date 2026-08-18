package com.mbridge.msdk.foundation.same.net.wrapper;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.tracker.network.d0;
import com.mbridge.msdk.tracker.network.k;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.w;

/* JADX INFO: loaded from: classes2.dex */
public class i<T> implements k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.net.b<T> f1220a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f1221a;
        final /* synthetic */ r b;

        public a(w wVar, r rVar) {
            this.f1221a = wVar;
            this.b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f1220a != null) {
                    i.this.f1220a.onSuccess(i.this.a(this.f1221a, this.b));
                }
            } catch (Exception e) {
                o0.b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f1222a;
        final /* synthetic */ r b;

        public b(w wVar, r rVar) {
            this.f1222a = wVar;
            this.b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f1220a != null) {
                    i.this.f1220a.onError(i.this.a(this.f1222a.c, this.b));
                }
            } catch (Exception e) {
                o0.b("MBridgeRequestListenerWrapper", "onResponseError error", e);
            }
        }
    }

    public i(com.mbridge.msdk.foundation.same.net.b<T> bVar) {
        this.f1220a = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.k
    public void b(com.mbridge.msdk.tracker.network.i<T> iVar, w<T> wVar, r rVar) {
        o0.a("MBridgeRequestListenerWrapper", "onResponseError: " + wVar.c.a() + " " + wVar.c.getMessage());
        this.b.post(new b(wVar, rVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.e a(w<T> wVar, r rVar) {
        if (wVar == null) {
            return null;
        }
        return com.mbridge.msdk.foundation.same.net.e.a(wVar.f2066a, new com.mbridge.msdk.foundation.same.net.toolbox.a(rVar.f2050a, rVar.b, rVar.d));
    }

    @Override // com.mbridge.msdk.tracker.network.k
    public void a(com.mbridge.msdk.tracker.network.i<T> iVar, w<T> wVar, r rVar) {
        o0.a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + wVar.f2066a);
        this.b.post(new a(wVar, rVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.exception.a a(d0 d0Var, r rVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        if (d0Var == null) {
            return null;
        }
        if (rVar != null) {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(rVar.f2050a, rVar.b, rVar.d);
        } else {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(0, null, null);
        }
        if (d0Var.a() == 0) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, d0Var.getMessage());
        }
        if (d0Var.a() == 1) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(6, aVar, d0Var.getMessage());
        }
        if (d0Var.a() == 2) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, d0Var.getMessage());
        }
        if (d0Var.a() == 4) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(880041, aVar, d0Var.getMessage());
        }
        if (d0Var.a() == 5) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, d0Var.getMessage());
        }
        if (d0Var.a() == 6) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(15, aVar, d0Var.getMessage());
        }
        if (d0Var.a() == 7) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(7, aVar, d0Var.getMessage());
        }
        if (d0Var.a() == 8) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(10, aVar, d0Var.getMessage());
        }
        if (d0Var.a() == 9) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(4, aVar, d0Var.getMessage());
        }
        return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, d0Var.getMessage());
    }
}
