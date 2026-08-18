package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    @SuppressLint({"StaticFieldLeak"})
    private static g b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f863a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.f863a;
    }

    public void a(Context context) {
        this.f863a = context != null ? context.getApplicationContext() : null;
    }
}
