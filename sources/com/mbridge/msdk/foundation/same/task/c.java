package com.mbridge.msdk.foundation.same.task;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f1251a;

    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("mb-task-loader-thread");
            return thread;
        }
    }

    private static ThreadFactory a() {
        return new a();
    }

    public static ThreadPoolExecutor b() {
        c();
        if (f1251a == null) {
            int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f1251a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), a(), new ThreadPoolExecutor.DiscardPolicy());
            f1251a.allowCoreThreadTimeOut(true);
        }
        return f1251a;
    }

    private static void c() {
        if (f1251a != null) {
            return;
        }
        int iA = a(10, "c_t_l_t_p_c");
        int iA2 = a(50, "c_t_l_t_p_m");
        int iA3 = a(5, "c_t_l_t_p_t");
        int i = iA2 < iA ? iA : iA2;
        try {
            if (MBridgeConstans.DEBUG) {
                o0.a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor for core " + iA + " max " + i + " timeout " + iA3);
            }
            long j = iA3;
            if (j <= 0) {
                j = 1;
            }
            f1251a = new ThreadPoolExecutor(iA, i, j, TimeUnit.SECONDS, new LinkedBlockingDeque(), a(), new ThreadPoolExecutor.DiscardPolicy());
            f1251a.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor failed ", e);
            }
        }
    }

    private static int a(int i, String str) {
        try {
            int iB = q0.a().b(str, i);
            return iB <= 0 ? i : iB;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return i;
            }
            o0.b("CommonTaskLoaderThreadPool", e.getMessage());
            return i;
        }
    }
}
