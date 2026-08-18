package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes2.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f1279a;

    public static synchronized ConnectivityManager a() {
        try {
            if (f1279a == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                f1279a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
            }
        } catch (Exception e) {
            o0.b("NetManager", e.getMessage());
        }
        return f1279a;
    }
}
