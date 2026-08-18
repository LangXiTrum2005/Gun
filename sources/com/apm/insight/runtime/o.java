package com.apm.insight.runtime;

import android.system.Os;
import android.system.OsConstants;
import com.umeng.analytics.pro.bc;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f189a = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f190a = -1;

        public static long a() {
            if (o.f189a == -1) {
                long jSysconf = f190a;
                if (jSysconf <= 0) {
                    jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                    if (jSysconf <= 0) {
                        jSysconf = 100;
                    }
                    f190a = jSysconf;
                }
                long unused = o.f189a = 1000 / jSysconf;
            }
            return o.f189a;
        }

        private static long a(String str) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField(bc.x).get(null), Integer.valueOf(i))).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return 100L;
            }
        }
    }
}
