package com.mbridge.msdk.thrid.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f1909a;
    final Proxy b;
    final InetSocketAddress c;

    public a0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f1909a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public a a() {
        return this.f1909a;
    }

    public Proxy b() {
        return this.b;
    }

    public boolean c() {
        return this.f1909a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (a0Var.f1909a.equals(this.f1909a) && a0Var.b.equals(this.b) && a0Var.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f1909a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        return "Route{" + this.c + "}";
    }
}
