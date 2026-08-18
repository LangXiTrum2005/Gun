package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
public class c extends a {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile c t;

    private c() {
    }

    public static c n() {
        if (t == null) {
            synchronized (c.class) {
                try {
                    if (t == null) {
                        t = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }
}
