package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1368a;
    private String b;
    private String c = "";
    private int d;
    private int e;

    public b(String str, String str2, int i, int i2) {
        this.f1368a = str;
        this.b = str2;
        this.d = i;
        this.e = i2;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.b = str;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    public void a(String str) {
        this.c = str;
    }
}
