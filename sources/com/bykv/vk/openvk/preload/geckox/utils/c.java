package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f364a;

    public static c a() {
        if (f364a == null) {
            synchronized (c.class) {
                try {
                    if (f364a == null) {
                        f364a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f364a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.p().execute(runnable);
    }
}
