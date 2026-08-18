package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes2.dex */
public class w<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f2066a;
    public final com.mbridge.msdk.tracker.network.b.a b;
    public final d0 c;
    public boolean d;

    public interface a {
        void a(d0 d0Var);
    }

    public interface b<T> {
        void a(T t);
    }

    private w(T t, com.mbridge.msdk.tracker.network.b.a aVar) {
        this.d = false;
        this.f2066a = t;
        this.b = aVar;
        this.c = null;
    }

    public static <T> w<T> a(T t, com.mbridge.msdk.tracker.network.b.a aVar) {
        return new w<>(t, aVar);
    }

    public static <T> w<T> a(d0 d0Var) {
        return new w<>(d0Var);
    }

    public boolean a() {
        return this.c == null;
    }

    private w(d0 d0Var) {
        this.d = false;
        this.f2066a = null;
        this.b = null;
        this.c = d0Var;
    }
}
