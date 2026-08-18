package com.mbridge.msdk.foundation.same.net.exception;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1202a;
    public String b;
    public com.mbridge.msdk.foundation.same.net.toolbox.a c;

    public a(int i, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f1202a = i;
        this.c = aVar;
    }

    public a(int i, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.f1202a = i;
        this.c = aVar;
        this.b = str;
    }
}
