package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u<T> implements Comparable<u<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f2061a;
    private String b;
    private volatile q c;
    private long d;
    private Map<String, String> e;
    private int f;
    private final String g;
    private final int h;
    private final String i;
    private final int j;
    private final Object k;
    private w.a l;
    private Integer m;
    private v n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private z t;
    private b.a u;
    private long v;

    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public u(int i, String str) {
        this(i, str, 0);
    }

    public final boolean A() {
        return this.s;
    }

    public final boolean B() {
        return this.r;
    }

    public abstract w<T> a(r rVar);

    public abstract void a(T t);

    public void a(String str) {
    }

    public void b(int i) {
        this.f = i;
    }

    public d0 c(d0 d0Var) {
        return d0Var;
    }

    public b.a d() {
        return this.u;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (this.f2061a == null) {
            this.f2061a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f2061a.a(this);
        this.b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.emptyMap();
    }

    public int g() {
        return this.f;
    }

    public q h() {
        return this.c;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return C.UTF8_NAME;
    }

    public int k() {
        return this.h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.d;
    }

    public z o() {
        return this.t;
    }

    public String p() {
        return this.i;
    }

    public final int q() {
        z zVarO = o();
        if (zVarO == null) {
            return 30000;
        }
        return zVarO.b();
    }

    public final long r() {
        z zVarO = o();
        if (zVarO == null) {
            return WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        }
        long jA = zVarO.a();
        return jA < 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : jA;
    }

    public int s() {
        return this.j;
    }

    public String t() {
        return this.g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb = new StringBuilder();
        sb.append(v() ? "[X] " : "[ ] ");
        sb.append(t());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(l());
        sb.append(" ");
        sb.append(this.m);
        return sb.toString();
    }

    public boolean u() {
        boolean z;
        synchronized (this.k) {
            z = this.q;
        }
        return z;
    }

    public boolean v() {
        boolean z;
        synchronized (this.k) {
            z = this.p;
        }
        return z;
    }

    public void w() {
        synchronized (this.k) {
            this.q = true;
        }
    }

    public void x() {
        synchronized (this.k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.o;
    }

    public u(int i, String str, int i2) {
        this(i, str, i2, "un_known");
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public boolean a() {
        return false;
    }

    public void c(String str) {
        v vVar = this.n;
        if (vVar != null) {
            vVar.c(this);
        }
    }

    public String d(String str) {
        if (this.e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public u(int i, String str, int i2, String str2) {
        this.k = new Object();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.u = null;
        this.v = 0L;
        this.f = i;
        this.g = str;
        this.h = i2;
        this.i = str2;
        a((z) new e());
        this.j = b(str);
        this.d = SystemClock.elapsedRealtime();
    }

    public void a(w.a aVar) {
        this.l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u<?> a(z zVar) {
        this.t = zVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> c(int i) {
        this.m = Integer.valueOf(i);
        return this;
    }

    public void a(int i) {
        v vVar = this.n;
        if (vVar != null) {
            vVar.a(this, i);
        }
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.v = bArrA.length;
            return bArrA;
        }
        this.v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> c(boolean z) {
        this.r = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u<?> a(v vVar) {
        this.n = vVar;
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i <= map.size() - 1) {
                        sb.append('&');
                    }
                }
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(AbstractC3888ke0.i("Encoding not supported: ", str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> b(boolean z) {
        this.s = z;
        return this;
    }

    public void b(d0 d0Var) {
        w.a aVar;
        synchronized (this.k) {
            aVar = this.l;
        }
        if (aVar != null) {
            aVar.a(d0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> a(boolean z) {
        this.o = z;
        return this;
    }

    public void a(w<?> wVar) {
        synchronized (this.k) {
        }
    }

    public void a(q qVar) {
        this.c = qVar;
    }

    public void a(String str, String str2) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u<T> uVar) {
        a aVarL = l();
        a aVarL2 = uVar.l();
        return aVarL == aVarL2 ? this.m.intValue() - uVar.m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }
}
