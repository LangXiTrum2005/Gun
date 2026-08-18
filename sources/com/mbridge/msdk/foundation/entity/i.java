package com.mbridge.msdk.foundation.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1159a;
    private String b;
    private String c;

    public i(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
        this.f1159a = i;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }
}
