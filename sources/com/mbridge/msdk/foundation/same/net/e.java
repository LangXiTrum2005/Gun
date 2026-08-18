package com.mbridge.msdk.foundation.same.net;

/* JADX INFO: loaded from: classes2.dex */
public class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.exception.a f1201a = null;
    public com.mbridge.msdk.foundation.same.net.toolbox.a b;
    public T c;

    private e(T t, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.c = t;
        this.b = aVar;
    }

    public static <T> e<T> a(T t, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        return new e<>(t, aVar);
    }
}
