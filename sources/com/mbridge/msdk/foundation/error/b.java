package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1165a;
    private int b;
    private String c;
    private Throwable d;
    private CampaignEx e;
    private MBridgeIds f;
    private String g;
    private String h;
    private boolean i;
    private int j = -1;
    private String k;
    private HashMap<Object, Object> l;
    private int m;
    private String n;
    private String o;
    private String p;
    private boolean q;

    public b(int i) {
        this.f1165a = i;
        this.b = a.b(i);
    }

    public void a(Throwable th) {
        this.d = th;
    }

    public int b() {
        return this.f1165a;
    }

    public int c() {
        return this.b;
    }

    public void d(String str) {
        this.c = str;
    }

    public void e(String str) {
        this.k = str;
    }

    public MBridgeIds f() {
        if (this.f == null) {
            this.f = new MBridgeIds();
        }
        return this.f;
    }

    public String g() {
        return this.h;
    }

    public String h() {
        int i;
        String strA = !TextUtils.isEmpty(this.c) ? this.c : "";
        if (TextUtils.isEmpty(strA) && (i = this.f1165a) != -1) {
            strA = a.a(i);
        }
        Throwable th = this.d;
        if (th == null) {
            return strA;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) ? DM.i(strA, " # ", message) : strA;
    }

    public String i() {
        return this.k;
    }

    public int j() {
        return this.m;
    }

    public String k() {
        return this.o;
    }

    public int l() {
        return this.j;
    }

    public boolean m() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MBFailureReason{errorCode=");
        sb.append(this.f1165a);
        sb.append(", errorSubType=");
        sb.append(this.b);
        sb.append(", message='");
        sb.append(this.c);
        sb.append("', cause=");
        sb.append(this.d);
        sb.append(", campaign=");
        sb.append(this.e);
        sb.append(", ids=");
        sb.append(this.f);
        sb.append(", requestId='");
        sb.append(this.g);
        sb.append("', localRequestId='");
        sb.append(this.h);
        sb.append("', isHeaderBidding=");
        sb.append(this.i);
        sb.append(", typeD=");
        sb.append(this.j);
        sb.append(", reasonD='");
        sb.append(this.k);
        sb.append("', extraMap=");
        sb.append(this.l);
        sb.append(", serverErrorCode=");
        sb.append(this.m);
        sb.append(", errorUrl='");
        sb.append(this.n);
        sb.append("', serverErrorResponse='");
        return DM.m(sb, this.o, "'}");
    }

    public CampaignEx a() {
        return this.e;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public void c(String str) {
        this.h = str;
    }

    public String d() {
        return this.n;
    }

    public String e() {
        return this.p;
    }

    public void a(CampaignEx campaignEx) {
        this.e = campaignEx;
    }

    public void b(String str) {
        this.p = str;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f = mBridgeIds;
    }

    public void f(String str) {
        this.o = str;
    }

    public b(int i, String str) {
        this.f1165a = i;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.c = str;
        this.b = a.b(i);
    }

    public void a(Object obj, Object obj2) {
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        this.l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.l;
        if (map != null && map.containsKey(obj)) {
            return this.l.get(obj);
        }
        return null;
    }

    public void a(int i) {
        this.j = i;
    }

    public b(int i, int i2, String str) {
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
            this.c = str;
        } else {
            this.c = a.a(i2);
        }
        this.m = i;
        this.b = a.b(i2);
    }

    public void a(String str) {
        this.n = str;
    }

    public void a(boolean z) {
        this.q = z;
    }
}
