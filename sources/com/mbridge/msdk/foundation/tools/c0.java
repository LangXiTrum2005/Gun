package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class c0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f1271a;
    private Runnable b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f1272a;

        public a(Runnable runnable) {
            this.f1272a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1272a.run();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("LimitExecutor", e.getMessage());
                }
            } finally {
                c0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f1271a == null) {
                this.f1271a = a(runnable);
                a0.a().execute(this.f1271a);
            } else if (this.b == null) {
                this.b = a(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.b;
        this.f1271a = runnable;
        this.b = null;
        if (runnable != null) {
            a0.a().execute(this.f1271a);
        }
    }
}
