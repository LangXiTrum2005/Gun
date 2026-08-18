package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class g implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2043a;

    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f2044a;

        public a(Handler handler) {
            this.f2044a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f2044a.post(runnable);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f2045a;
        private final w b;
        private final Runnable c;

        public b(u uVar, w wVar, Runnable runnable) {
            this.f2045a = uVar;
            this.b = wVar;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2045a.v()) {
                this.f2045a.c("canceled-at-delivery");
                return;
            }
            if (this.b.a()) {
                this.f2045a.a(this.b.f2066a);
            } else {
                this.f2045a.b(this.b.c);
            }
            if (this.b.d) {
                this.f2045a.a("intermediate-response");
            } else {
                this.f2045a.c("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public g(Handler handler) {
        this.f2043a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public void a(u<?> uVar, w<?> wVar) {
        a(uVar, wVar, null);
    }

    public void a(u<?> uVar, w<?> wVar, Runnable runnable) {
        uVar.w();
        uVar.a("post-response");
        this.f2043a.execute(new b(uVar, wVar, runnable));
    }

    public g(Executor executor) {
        this.f2043a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public void a(u<?> uVar, d0 d0Var) {
        uVar.a("post-error");
        this.f2043a.execute(new b(uVar, w.a(d0Var), null));
    }
}
