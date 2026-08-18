package com.mbridge.msdk.splash.request;

import androidx.annotation.NonNull;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1863a;
    private String b;
    private int c;
    private int d;
    private int e;

    public void a(String str) {
        this.b = str;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.f1863a;
    }

    public String e() {
        return this.b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb.append(this.f1863a);
        sb.append(", session_id='");
        sb.append(this.b);
        sb.append("', offset=");
        sb.append(this.c);
        sb.append(", expectWidth=");
        sb.append(this.d);
        sb.append(", expectHeight=");
        return DM.k(sb, this.e, '}');
    }

    public int a() {
        return this.e;
    }

    public void b(int i) {
        this.d = i;
    }

    public void c(int i) {
        this.c = i;
    }

    public void d(int i) {
        this.f1863a = i;
    }

    public void a(int i) {
        this.e = i;
    }
}
