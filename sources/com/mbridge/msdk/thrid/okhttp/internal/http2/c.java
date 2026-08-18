package com.mbridge.msdk.thrid.okhttp.internal.http2;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final com.mbridge.msdk.thrid.okio.f d = com.mbridge.msdk.thrid.okio.f.c(":");
    public static final com.mbridge.msdk.thrid.okio.f e = com.mbridge.msdk.thrid.okio.f.c(":status");
    public static final com.mbridge.msdk.thrid.okio.f f = com.mbridge.msdk.thrid.okio.f.c(":method");
    public static final com.mbridge.msdk.thrid.okio.f g = com.mbridge.msdk.thrid.okio.f.c(":path");
    public static final com.mbridge.msdk.thrid.okio.f h = com.mbridge.msdk.thrid.okio.f.c(":scheme");
    public static final com.mbridge.msdk.thrid.okio.f i = com.mbridge.msdk.thrid.okio.f.c(":authority");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f1949a;
    public final com.mbridge.msdk.thrid.okio.f b;
    final int c;

    public interface a {
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1949a.equals(cVar.f1949a) && this.b.equals(cVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.f1949a.hashCode() + 527) * 31);
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.f1949a.h(), this.b.h());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.f1949a = fVar;
        this.b = fVar2;
        this.c = fVar2.e() + fVar.e() + 32;
    }
}
