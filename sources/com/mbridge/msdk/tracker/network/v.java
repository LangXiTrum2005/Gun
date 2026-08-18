package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f2063a;
    private final int e;
    private final com.mbridge.msdk.tracker.network.b f;
    private final n g;
    private final x h;
    private final AtomicInteger b = new AtomicInteger();
    private final Set<u<?>> c = new HashSet();
    private final PriorityBlockingQueue<u<?>> d = new PriorityBlockingQueue<>();
    private final List<c> i = new ArrayList();
    private boolean j = false;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new o(v.this.d, v.this.g, v.this.f, v.this.h).run();
            } catch (Throwable unused) {
            }
        }
    }

    public interface c {
        void a(u<?> uVar, int i);
    }

    public v(n nVar, x xVar, int i, com.mbridge.msdk.tracker.network.b bVar) {
        this.e = i;
        this.f = bVar;
        this.g = nVar;
        this.h = xVar;
    }

    private void a(int i) {
        if (this.f2063a != null) {
            return;
        }
        try {
            b(i);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.f2063a = null;
            }
        }
    }

    public void b() {
        if (!this.j || this.f2063a == null) {
            a(this.e);
            this.j = true;
        }
    }

    public <T> void c(u<T> uVar) {
        synchronized (this.c) {
            this.c.remove(uVar);
        }
        a(uVar, 5);
    }

    public <T> void d(u<T> uVar) {
        this.d.add(uVar);
    }

    private void b(int i) {
        this.f2063a = new ThreadPoolExecutor(i, i, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public int a() {
        return this.b.incrementAndGet();
    }

    public <T> void b(u<T> uVar) {
        d(uVar);
    }

    public <T> u<T> a(u<T> uVar) {
        uVar.a(this);
        synchronized (this.c) {
            this.c.add(uVar);
        }
        uVar.c(a());
        uVar.a("add-to-queue");
        a(uVar, 0);
        b(uVar);
        if (this.f2063a == null) {
            a(this.e);
        }
        if (!this.f2063a.isShutdown()) {
            this.f2063a.execute(new b());
        }
        return uVar;
    }

    public void a(u<?> uVar, int i) {
        synchronized (this.i) {
            try {
                Iterator<c> it = this.i.iterator();
                while (it.hasNext()) {
                    it.next().a(uVar, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
