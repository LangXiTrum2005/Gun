package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<u<?>> f2048a;
    private final n b;
    private final b c;
    private final x d;
    private volatile boolean e = false;

    public o(BlockingQueue<u<?>> blockingQueue, n nVar, b bVar, x xVar) {
        this.f2048a = blockingQueue;
        this.b = nVar;
        this.c = bVar;
        this.d = xVar;
    }

    private void a(u<?> uVar) {
        TrafficStats.setThreadStatsTag(uVar.s());
    }

    public void b(u<?> uVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        uVar.a(3);
        try {
            try {
                uVar.a("network-queue-take");
                if (uVar.v()) {
                    uVar.c("network-discard-cancelled");
                    uVar.x();
                    return;
                }
                if (uVar.y()) {
                    a(uVar);
                }
                r rVarA = this.b.a(uVar);
                uVar.a("network-http-complete");
                if (rVarA.e && uVar.u()) {
                    uVar.c("not-modified");
                    uVar.x();
                    return;
                }
                w<?> wVarA = uVar.a(rVarA);
                uVar.a("network-parse-complete");
                if (uVar.z() && wVarA.b != null) {
                    this.c.a(uVar.e(), wVarA.b);
                    uVar.a("network-cache-written");
                }
                uVar.w();
                this.d.a(uVar, wVarA);
                uVar.a(wVarA);
            } catch (d0 e) {
                e.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                a(uVar, e);
                uVar.x();
            } catch (Exception e2) {
                e0.a(e2, "Unhandled exception %s", e2.toString());
                c0 c0Var = new c0(e2);
                c0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.d.a(uVar, c0Var);
                uVar.x();
            }
        } finally {
            uVar.a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                e0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() throws InterruptedException {
        b(this.f2048a.take());
    }

    private void a(u<?> uVar, d0 d0Var) {
        this.d.a(uVar, uVar.c(d0Var));
    }
}
