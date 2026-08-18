package com.mbridge.msdk.thrid.okhttp.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f1923a;

    public b(String str, Object... objArr) {
        this.f1923a = c.a(str, objArr);
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f1923a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
