package com.mbridge.msdk.foundation.same.report.crashreport;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class b extends Thread {
    private static volatile b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f1227a;
    private volatile RunnableC0172b b;
    private com.mbridge.msdk.foundation.same.report.crashreport.a c;
    private int d;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.b$b, reason: collision with other inner class name */
    public class RunnableC0172b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1228a;
        private boolean b;
        private long c;

        private RunnableC0172b() {
            this.f1228a = SystemClock.uptimeMillis();
        }

        public void b() {
            this.b = false;
            this.c = SystemClock.uptimeMillis();
            b.this.f1227a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this) {
                this.b = true;
                this.f1228a = SystemClock.uptimeMillis();
            }
        }

        public boolean a() {
            return !this.b || this.f1228a - this.c >= ((long) b.this.d);
        }
    }

    private b() {
        super("AnrMonitor-Thread");
        this.f1227a = new Handler(Looper.getMainLooper());
        this.d = 5000;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0025 */
    @Override // java.lang.Thread, java.lang.Runnable
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r7 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L5:
            boolean r0 = r7.isInterrupted()
            if (r0 != 0) goto L87
            com.mbridge.msdk.foundation.same.report.crashreport.b$b r0 = r7.b
            if (r0 == 0) goto L17
            com.mbridge.msdk.foundation.same.report.crashreport.b$b r0 = r7.b
            boolean r0 = com.mbridge.msdk.foundation.same.report.crashreport.b.RunnableC0172b.a(r0)
            if (r0 == 0) goto L87
        L17:
            monitor-enter(r7)
            com.mbridge.msdk.foundation.same.report.crashreport.b$b r0 = r7.b     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L27
            com.mbridge.msdk.foundation.same.report.crashreport.b$b r0 = new com.mbridge.msdk.foundation.same.report.crashreport.b$b     // Catch: java.lang.Throwable -> L25
            r1 = 0
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            r7.b = r0     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r0 = move-exception
            goto L85
        L27:
            com.mbridge.msdk.foundation.same.report.crashreport.b$b r0 = r7.b     // Catch: java.lang.Throwable -> L25
            r0.b()     // Catch: java.lang.Throwable -> L25
            int r0 = r7.d     // Catch: java.lang.Throwable -> L25
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L25
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L25
        L33:
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4c
            r7.wait(r0)     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L3d
            goto L41
        L3d:
            r0 = move-exception
            r0.toString()     // Catch: java.lang.Throwable -> L25
        L41:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L25
            long r0 = r0 - r2
            int r4 = r7.d     // Catch: java.lang.Throwable -> L25
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L25
            long r0 = r4 - r0
            goto L33
        L4c:
            com.mbridge.msdk.foundation.same.report.crashreport.b$b r0 = r7.b     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L5d
            com.mbridge.msdk.foundation.same.report.crashreport.a r0 = r7.c     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L5b
            r0.a()     // Catch: java.lang.Throwable -> L25
        L5b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            goto L5
        L5d:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto L5
            boolean r0 = android.os.Debug.waitingForDebugger()
            if (r0 == 0) goto L6b
            goto L5
        L6b:
            com.mbridge.msdk.foundation.same.report.crashreport.a r0 = r7.c
            if (r0 == 0) goto L5
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r1 = com.mbridge.msdk.foundation.same.report.crashreport.c.b(r0)
            com.mbridge.msdk.foundation.same.report.crashreport.a r2 = r7.c
            r2.a(r1, r0)
            goto L5
        L85:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L25
            throw r0
        L87:
            int r0 = r7.d     // Catch: java.lang.Exception -> L8f
            long r0 = (long) r0     // Catch: java.lang.Exception -> L8f
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L8f
            goto L5
        L8f:
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.crashreport.b.run():void");
    }

    public static b a() {
        if (e == null) {
            synchronized (b.class) {
                try {
                    if (e == null) {
                        e = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public b a(int i, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.d = i;
        this.c = aVar;
        return this;
    }
}
