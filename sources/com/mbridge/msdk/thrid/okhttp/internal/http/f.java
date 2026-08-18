package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.badlogic.gdx.Net;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static boolean a(String str) {
        return (str.equals("GET") || str.equals(Net.HttpMethods.HEAD)) ? false : true;
    }

    public static boolean b(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean c(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals("POST") || str.equals(Net.HttpMethods.PUT) || str.equals(Net.HttpMethods.PATCH) || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
