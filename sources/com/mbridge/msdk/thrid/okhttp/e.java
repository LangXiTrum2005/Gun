package com.mbridge.msdk.thrid.okhttp;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final e c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f1914a;

    @Nullable
    private final com.mbridge.msdk.thrid.okhttp.internal.tls.c b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<b> f1915a = new ArrayList();

        public e a() {
            return new e(new LinkedHashSet(this.f1915a), null);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f1916a;
        final String b;
        final String c;
        final com.mbridge.msdk.thrid.okio.f d;

        public boolean a(String str) {
            if (!this.f1916a.startsWith("*.")) {
                return str.equals(this.b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 == this.b.length()) {
                String str2 = this.b;
                if (str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f1916a.equals(bVar.f1916a) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.d.hashCode() + DM.d(this.c, DM.d(this.f1916a, 527, 31), 31);
        }

        public String toString() {
            return this.c + this.d.a();
        }
    }

    public e(Set<b> set, @Nullable com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        this.f1914a = set;
        this.b = cVar;
    }

    public static com.mbridge.msdk.thrid.okio.f b(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> listA = a(str);
        if (listA.isEmpty()) {
            return;
        }
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listA.size();
            com.mbridge.msdk.thrid.okio.f fVarB = null;
            com.mbridge.msdk.thrid.okio.f fVarA = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = listA.get(i2);
                if (bVar.c.equals("sha256/")) {
                    if (fVarB == null) {
                        fVarB = b(x509Certificate);
                    }
                    if (bVar.d.equals(fVarB)) {
                        return;
                    }
                } else {
                    if (!bVar.c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.c);
                    }
                    if (fVarA == null) {
                        fVarA = a(x509Certificate);
                    }
                    if (bVar.d.equals(fVarA)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = listA.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b bVar2 = listA.get(i4);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.b, eVar.b) && this.f1914a.equals(eVar.f1914a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.b;
        return this.f1914a.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }

    public List<b> a(String str) {
        List<b> listEmptyList = Collections.emptyList();
        for (b bVar : this.f1914a) {
            if (bVar.a(str)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                listEmptyList.add(bVar);
            }
        }
        return listEmptyList;
    }

    public e a(@Nullable com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.b, cVar) ? this : new e(this.f1914a, cVar);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public static com.mbridge.msdk.thrid.okio.f a(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).c();
    }
}
