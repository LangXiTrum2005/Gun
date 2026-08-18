package com.mbridge.msdk.tracker;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f2030a;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f2032a;

        public b(Runnable runnable) {
            this.f2032a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.f2032a)) {
                return;
            }
            try {
                this.f2032a.run();
            } catch (Exception unused) {
            }
        }
    }

    public void a(Runnable runnable) {
        if (this.f2030a == null) {
            this.f2030a = a();
        }
        if (this.f2030a.isShutdown()) {
            return;
        }
        this.f2030a.execute(new b(runnable));
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
