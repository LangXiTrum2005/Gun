package com.google.android.gms.dynamite;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb {

    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static ClassLoader zza;

    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    private static Thread zzb;

    /* JADX WARN: Code duplicated, block: B:52:0x0092 A[Catch: all -> 0x008e, PHI: r1
  0x0092: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v14 java.lang.Thread) binds: [B:7:0x000a, B:46:0x008b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x0089, B:60:0x00a1, B:12:0x001f, B:51:0x0091, B:52:0x0092, B:63:0x00a5, B:64:0x00a6, B:53:0x0093, B:59:0x00a0, B:58:0x009d, B:13:0x0020, B:15:0x002d, B:25:0x0046, B:26:0x004d, B:28:0x0058, B:34:0x006d, B:35:0x0074, B:42:0x0084, B:43:0x0087, B:18:0x003c), top: B:78:0x0003, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public static synchronized ClassLoader zza() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (zza == null) {
            Thread thread2 = zzb;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = zzb.getContextClassLoader();
                    } catch (SecurityException e2) {
                        e2.getMessage();
                    }
                }
                zza = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        zza zzaVar = new zza(threadGroup, "GmsDynamite");
                                        try {
                                            zzaVar.setContextClassLoader(null);
                                            zzaVar.start();
                                            thread = zzaVar;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = zzaVar;
                                            e.getMessage();
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (SecurityException e5) {
                            e = e5;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                zzb = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = zzb.getContextClassLoader();
                    }
                }
                zza = contextClassLoader;
            }
        }
        return zza;
    }
}
