package com.mbridge.msdk.foundation.same.threadpool;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f1252a;
    private static ThreadPoolExecutor b;
    private static Handler c;
    private static ThreadPoolExecutor d;
    private static ThreadPoolExecutor e;
    private static ThreadPoolExecutor f;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.threadpool.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0175a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("BitmapThreadPool");
            return threadNewThread;
        }
    }

    public class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("CommonThreadPool");
            return threadNewThread;
        }
    }

    public class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("NwtThreadPool");
            return threadNewThread;
        }
    }

    public class d implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("ReportThreadPool");
            return threadNewThread;
        }
    }

    public class e implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("rv-load-tread");
            return thread;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
        }
    }

    public static ThreadPoolExecutor a() {
        if (b == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new ThreadFactoryC0175a(), new ThreadPoolExecutor.DiscardPolicy());
            b = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return b;
    }

    public static ThreadPoolExecutor b() {
        if (f1252a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 25, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new b(), new ThreadPoolExecutor.DiscardPolicy());
            f1252a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f1252a;
    }

    public static Handler c() {
        if (c == null) {
            c = new f();
        }
        return c;
    }

    public static ThreadPoolExecutor d() {
        if (d == null) {
            d = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new c(), new ThreadPoolExecutor.DiscardPolicy());
        }
        return d;
    }

    public static ThreadPoolExecutor e() {
        if (e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new d(), new ThreadPoolExecutor.DiscardPolicy());
            e = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return e;
    }

    public static ThreadPoolExecutor f() {
        if (f == null) {
            e eVar = new e();
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors * 2, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), eVar, new ThreadPoolExecutor.DiscardPolicy());
            f = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f;
    }
}
