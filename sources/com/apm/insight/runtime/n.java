package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile r f188a;
    private static volatile Handler b;

    public static r a() {
        if (f188a == null) {
            b();
        }
        return f188a;
    }

    private static HandlerThread b() {
        if (f188a == null) {
            synchronized (n.class) {
                try {
                    if (f188a == null) {
                        r rVar = new r("default_npth_thread");
                        f188a = rVar;
                        rVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f188a.c();
    }
}
