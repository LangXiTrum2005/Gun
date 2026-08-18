package com.mbridge.msdk.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f2082a = false;
    public static String b = "";

    public static void a() {
        if (c()) {
            try {
                GoogleApiAvailability.getInstance().getApkVersion(com.mbridge.msdk.foundation.controller.c.n().d());
                GoogleApiAvailability.getInstance().verifyGooglePlayServicesIsAvailable(com.mbridge.msdk.foundation.controller.c.n().d(), 11925000);
                try {
                    String strB = b();
                    boolean z = !TextUtils.isEmpty(strB);
                    f2082a = z;
                    if (z) {
                        b = strB;
                    }
                } catch (Throwable th) {
                    o0.b("CronetEnvCheckUtil", th.getMessage());
                }
            } catch (Throwable th2) {
                o0.b("CronetEnvCheckUtil", th2.getMessage());
                f2082a = false;
            }
        }
    }

    private static String b() {
        ArrayList<Pair> arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.n().d().getClassLoader();
            for (Pair pair : arrayList) {
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.n().d()).getClass().getName())) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(pair.first);
                    }
                } catch (Throwable th) {
                    o0.b("CronetEnvCheckUtil", th.getMessage());
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            o0.b("CronetEnvCheckUtil", th2.getMessage());
            return "";
        }
    }

    public static boolean c() {
        return q0.a().a("cronet_env_check", false);
    }
}
