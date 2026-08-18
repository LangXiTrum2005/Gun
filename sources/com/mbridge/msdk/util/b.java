package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f2081a;
    private static volatile Boolean b;

    public static boolean a() {
        if (f2081a == null) {
            try {
                boolean z = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2;
                f2081a = Boolean.valueOf(z);
                return z;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CommonUtils", "isChina", e);
                }
            }
        }
        return f2081a != null && f2081a.booleanValue();
    }

    public static boolean b() {
        if (b == null) {
            try {
                boolean z = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1;
                b = Boolean.valueOf(z);
                return z;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CommonUtils", "isOversea", e);
                }
            }
        }
        return b != null && b.booleanValue();
    }
}
