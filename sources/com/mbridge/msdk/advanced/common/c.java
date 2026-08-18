package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f895a = new HashMap();

    public static void a(String str, boolean z) {
        f895a.put(str, Boolean.valueOf(z));
    }

    public static void b(String str) {
        f895a.remove(str);
    }

    public static boolean a(String str) {
        if (f895a.containsKey(str)) {
            return f895a.get(str).booleanValue();
        }
        return false;
    }
}
