package com.mbridge.msdk.foundation.same.report.crashreport;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AccountType;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f1229a;

    public static final class a implements com.mbridge.msdk.foundation.same.report.crashreport.a {

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.c$a$a, reason: collision with other inner class name */
        public class RunnableC0173a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1230a;
            final /* synthetic */ StackTraceElement[] b;

            public RunnableC0173a(String str, StackTraceElement[] stackTraceElementArr) {
                this.f1230a = str;
                this.b = stackTraceElementArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.c(this.f1230a, this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(String str, StackTraceElement[] stackTraceElementArr) {
            try {
                c.b(str, stackTraceElementArr);
            } catch (Exception e) {
                o0.b("AnrMonitorManager", "handler anr failed", e);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.crashreport.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.same.report.crashreport.a
        public void a(String str, StackTraceElement[] stackTraceElementArr) {
            if (MBridgeConstans.DEBUG) {
                AbstractC3888ke0.s("onAnrHappened: ", str, "AnrMonitorManager");
            }
            if (!c.b(str)) {
                o0.a("AnrMonitorManager", "onAnrHappened: can track false");
                return;
            }
            long unused = c.f1229a = System.currentTimeMillis();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0173a(str, stackTraceElementArr));
        }
    }

    public static String b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null) {
                        sb.append(stackTraceElement.toString());
                        sb.append("\r\n");
                    }
                }
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static JSONObject c(String str) throws JSONException {
        JSONObject jSONObjectA = d.c(com.mbridge.msdk.foundation.controller.c.n().d()).a(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
        jSONObjectA.put("crashinfo", str);
        return jSONObjectA;
    }

    private static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(MBridgeConstans.APPLICATION_STACK_COM_ANDROID) || str.contains(AccountType.GOOGLE) || str.contains("java.lang") || str.contains(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) || str.contains(MBridgeConstans.APPLICATION_STACK_ANDROID_APP);
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        return c(stackTraceElementArr) ? "1" : "0";
    }

    public static boolean c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null && !TextUtils.isEmpty(stackTraceElement.toString())) {
                        String string = stackTraceElement.toString();
                        if (!d(string)) {
                            arrayList.add(string);
                        }
                    }
                }
                if (arrayList.size() == 0) {
                    return false;
                }
                return b((String) arrayList.get(0));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("AnrMonitorManager", "isMBridgeFirst exception", e);
                }
            }
        }
        return false;
    }

    private static int a() {
        try {
            int iB = q0.a().b("anr_check_timeout", 5000);
            if (iB <= 0) {
                return 5000;
            }
            return iB;
        } catch (Exception e) {
            o0.b("AnrMonitorManager", "get anr check timeout failed", e);
            return 5000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, StackTraceElement[] stackTraceElementArr) throws JSONException {
        try {
            JSONObject jSONObjectC = c(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", jSONObjectC.toString());
            jSONObject.put("crash_first_index_from_mtg", a(stackTraceElementArr));
            e eVar = new e("m_anr_report");
            eVar.a(jSONObject);
            eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
            eVar.b(0);
            eVar.a(1);
            f.a().b().c(eVar);
        } catch (JSONException e) {
            o0.b("AnrMonitorManager", "reportANRByEventLibrary anr failed", e);
        }
    }

    public static void c() {
        if (!b()) {
            o0.a("AnrMonitorManager", "anr monitor is not available");
            return;
        }
        try {
            b.a().a(a(), new a()).start();
        } catch (Exception e) {
            o0.b("AnrMonitorManager", "start anr monitor failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : d.b(d.b())) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean b() {
        try {
            return q0.a().a("anr_monitor_available", false);
        } catch (Exception e) {
            o0.b("AnrMonitorManager", "get anr monitor available failed", e);
            return false;
        }
    }
}
