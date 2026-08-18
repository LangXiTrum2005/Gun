package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f366a;

    public static f a() {
        if (f366a == null) {
            synchronized (f.class) {
                try {
                    if (f366a == null) {
                        f366a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f366a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.p().execute(runnable);
    }
}
