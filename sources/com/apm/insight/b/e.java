package com.apm.insight.b;

import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f66a;
    public static long b;
    public volatile boolean c = false;

    public boolean a() {
        return false;
    }

    @CallSuper
    public void b(String str) {
        this.c = false;
    }

    @CallSuper
    public void a(String str) {
        this.c = true;
    }
}
