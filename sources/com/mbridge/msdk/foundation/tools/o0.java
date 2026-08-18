package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f1287a = true;
    public static boolean b = true;
    public static boolean c = true;
    public static boolean d = false;
    public static boolean e = true;
    public static boolean f = false;
    public static boolean g = true;
    public static boolean h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        g = false;
        f1287a = false;
        c = false;
        h = false;
        b = false;
        f = false;
        e = false;
        d = false;
    }

    public static void a(String str, String str2) {
        if (!f1287a || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void b(String str, String str2) {
        if (!b || str2 == null) {
            return;
        }
        a(str);
    }

    public static void c(String str, String str2) {
        if (!c || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void d(String str, String str2) {
        if (!h || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!b || str2 == null || th == null) {
            return;
        }
        a(str);
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? AbstractC3888ke0.i("MBRIDGE_", str) : str;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!h || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f1287a || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str);
    }

    public static void a(String str, Throwable th) {
        if (!h || th == null) {
            return;
        }
        a(str);
    }
}
