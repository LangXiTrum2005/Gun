package com.apm.insight.h;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.k;
import com.apm.insight.runtime.n;
import com.apm.insight.runtime.p;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f106a;
    private Map<String, String> b;

    public b(File file) {
        String strA;
        File fileC = j.c(file);
        if (!fileC.exists() || fileC.length() == 0 || (strA = NativeImpl.a(fileC.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = strA.split("\n");
        this.b = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split("=");
            if (strArrSplit2.length == 2) {
                this.b.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    public static String a(String str) {
        return e.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static void b(final String str) {
        n.a().a(new Runnable() { // from class: com.apm.insight.h.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f107a = false;

            @Override // java.lang.Runnable
            public final void run() {
                String strA;
                b.b();
                if (b.c(str)) {
                    return;
                }
                p.a("updateSo", str);
                File file = new File(b.a(str));
                file.getParentFile().mkdirs();
                if (file.exists()) {
                    file.delete();
                }
                e.i().isDebugMode();
                try {
                    strA = c.a(e.g(), str, file);
                } catch (Throwable th) {
                    p.a("updateSoError", str);
                    com.apm.insight.c.a();
                    k.a(th, "NPTH_CATCH");
                    strA = null;
                }
                if (strA != null) {
                    if (this.f107a) {
                        p.a("updateSoFailed", str);
                        return;
                    }
                    this.f107a = true;
                    p.a("updateSoPostRetry", str);
                    n.a().a(this, 3000L);
                    return;
                }
                b.f106a.put(file.getName(), "1.3.8.nourl-rc.1");
                try {
                    f.a(new File(e.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver"), "1.3.8.nourl-rc.1", false);
                } catch (Throwable unused) {
                }
                p.a("updateSoSuccess", str);
            }
        });
    }

    public final boolean d() {
        Map<String, String> map = this.b;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.b.get("process_name")) || TextUtils.isEmpty(this.b.get("crash_thread_name")) || TextUtils.isEmpty(this.b.get("pid")) || TextUtils.isEmpty(this.b.get(ScarConstants.TOKEN_ID_KEY)) || TextUtils.isEmpty(this.b.get(com.umeng.analytics.pro.f.p)) || TextUtils.isEmpty(this.b.get("crash_time")) || TextUtils.isEmpty(this.b.get("signal_line"))) ? false : true;
    }

    @Nullable
    public final String e() {
        return this.b.get("signal_line");
    }

    public final Map<String, String> f() {
        return this.b;
    }

    public static String a() {
        return e.g().getFilesDir() + "/apminsight/selflib/";
    }

    public static /* synthetic */ void b() {
        if (f106a == null) {
            f106a = new HashMap<>();
            File file = new File(e.g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            f106a.put(str.substring(0, str.length() - 4), f.a(file.getAbsolutePath() + "/" + str, "\n"));
                        } catch (Throwable th) {
                            com.apm.insight.c.a();
                            k.a(th, "NPTH_CATCH");
                        }
                    } else if (!str.endsWith(".so")) {
                        f.a(new File(file, str));
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean c(String str) {
        return "1.3.8.nourl-rc.1".equals(f106a.get(str)) && new File(a(str)).exists();
    }
}
