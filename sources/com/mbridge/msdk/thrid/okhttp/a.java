package com.mbridge.msdk.thrid.okhttp;

import androidx.webkit.ProxyConfig;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final q f1908a;
    final m b;
    final SocketFactory c;
    final b d;
    final List<u> e;
    final List<i> f;
    final ProxySelector g;

    @Nullable
    final Proxy h;

    @Nullable
    final SSLSocketFactory i;

    @Nullable
    final HostnameVerifier j;

    @Nullable
    final e k;

    public a(String str, int i, m mVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable e eVar, b bVar, @Nullable Proxy proxy, List<u> list, List<i> list2, ProxySelector proxySelector) {
        this.f1908a = new q.a().e(sSLSocketFactory != null ? "https" : ProxyConfig.MATCH_HTTP).b(str).a(i).a();
        if (mVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.b = mVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = eVar;
    }

    @Nullable
    public e a() {
        return this.k;
    }

    public List<i> b() {
        return this.f;
    }

    public m c() {
        return this.b;
    }

    @Nullable
    public HostnameVerifier d() {
        return this.j;
    }

    public List<u> e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1908a.equals(aVar.f1908a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Proxy f() {
        return this.h;
    }

    public b g() {
        return this.d;
    }

    public ProxySelector h() {
        return this.g;
    }

    public int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + ((this.f1908a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        e eVar = this.k;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.c;
    }

    @Nullable
    public SSLSocketFactory j() {
        return this.i;
    }

    public q k() {
        return this.f1908a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f1908a.g());
        sb.append(":");
        sb.append(this.f1908a.j());
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean a(a aVar) {
        return this.b.equals(aVar.b) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.h, aVar.h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.i, aVar.i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.j, aVar.j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.k, aVar.k) && k().j() == aVar.k().j();
    }
}
