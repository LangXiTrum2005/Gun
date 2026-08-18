package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.e0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.w0;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1809a = "h";
    private static volatile h b;
    private static volatile g c;
    private static HashMap<String, l> d = new HashMap<>();

    private h() {
    }

    public static void a(Context context, String str) {
        FastKV fastKVBuild;
        Map<String, Object> all = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                fastKVBuild = null;
            }
        } else {
            fastKVBuild = null;
        }
        if (fastKVBuild == null) {
            try {
                Map<String, ?> all2 = context.getSharedPreferences("mbridge", 0).getAll();
                for (String str2 : all2.keySet()) {
                    if (str2.startsWith(str + "_")) {
                        d.put(str2, l.l((String) all2.get(str2)));
                    }
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            all = fastKVBuild.getAll();
        } catch (Exception unused2) {
        }
        if (all != null) {
            try {
                for (String str3 : all.keySet()) {
                    if (str3.startsWith(str + "_")) {
                        d.put(str3, l.l((String) all.get(str3)));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static h b() {
        if (b == null) {
            synchronized (h.class) {
                try {
                    if (b == null) {
                        b = new h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public g c() {
        return c != null ? c : a();
    }

    public g d(String str) {
        if (c == null) {
            try {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
                if (!TextUtils.isEmpty(strA)) {
                    JSONObject jSONObject = new JSONObject(strA);
                    if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    }
                    if (jSONObject.has(bc.aL)) {
                        jSONObject.remove(bc.aL);
                    }
                    c = g.C(jSONObject.toString());
                    if (c != null) {
                        c.K0();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return c;
    }

    public l e(String str, String str2) {
        l lVarB = b(str, str2);
        if (lVarB != null && lVarB.L() == 0) {
            lVarB.d(1);
        }
        return lVarB;
    }

    public String f(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DM.i(str, "_", str2));
    }

    public boolean g(String str, String str2) {
        g gVarD = d(str2);
        if (f(str2) && a(str2, 1, str)) {
            new j().b(com.mbridge.msdk.foundation.controller.c.n().d(), str2, com.mbridge.msdk.foundation.controller.c.n().c());
        }
        l lVarE = e(str2, str);
        if (gVarD != null && lVarE != null) {
            long jQ0 = gVarD.q0() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jO = lVarE.o() + jQ0;
            if (jO > jCurrentTimeMillis) {
                String str3 = f1809a;
                StringBuilder sbP = DM.p("unit setting  nexttime is not ready  [settingNextRequestTime= ", jO, " currentTime = ");
                sbP.append(jCurrentTimeMillis);
                sbP.append("]");
                o0.c(str3, sbP.toString());
                return false;
            }
        }
        o0.c(f1809a, "unit setting timeout or not exists");
        return true;
    }

    public void h(String str) {
        try {
            String strE = e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strE);
            jSONObject.put("current_time", System.currentTimeMillis());
            h(str, jSONObject.toString());
        } catch (Throwable th) {
            o0.b(f1809a, th.getMessage());
        }
    }

    public void i(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str, str2);
    }

    public void j(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            o0.b(f1809a, th.getMessage());
        }
    }

    public String c(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str);
    }

    public String e(String str) {
        if (str == null) {
            return "";
        }
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
            return strA == null ? "" : strA;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    public l c(String str, String str2) {
        l lVarA = a(str, str2);
        return lVarA == null ? l.N() : lVarA;
    }

    public g b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return a();
            }
            g gVarD = d(str);
            return gVarD == null ? a() : gVarD;
        } catch (Exception unused) {
            return a();
        }
    }

    public void h(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str, str2);
        c = g.C(str2);
        if (c != null) {
            c.K0();
        }
        i.a(c);
        e0.a().a(c.Q());
    }

    public boolean f(String str) {
        g gVarD = d(str);
        if (gVarD != null) {
            long jA = gVarD.A() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jW = gVarD.w() + jA;
            if (jW > jCurrentTimeMillis) {
                String str2 = f1809a;
                StringBuilder sbP = DM.p("app setting nexttime is not ready  [settingNextRequestTime= ", jW, " currentTime = ");
                sbP.append(jCurrentTimeMillis);
                sbP.append("]");
                o0.c(str2, sbP.toString());
                return false;
            }
        }
        o0.c(f1809a, "app setting timeout or not exists");
        return true;
    }

    private l b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
        }
        String strI = DM.i(str, "_", str2);
        if (d.containsKey(strI)) {
            return d.get(strI);
        }
        l lVarL = null;
        try {
            lVarL = l.l(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strI));
            d.put(strI, lVarL);
            return lVarL;
        } catch (Exception e) {
            l lVar = lVarL;
            e.printStackTrace();
            return lVar;
        }
    }

    public l d(String str, String str2) {
        l lVarE = e(str, str2);
        return lVarE == null ? l.N() : lVarE;
    }

    public void g(String str) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().c("ivreward_" + str);
    }

    public void a(String str) {
        i.a(str, this);
    }

    public g a() {
        return i.a();
    }

    public l a(String str, String str2) {
        return b(str, str2);
    }

    public boolean a(String str, int i, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String str3 = str + "_" + i + "_" + str2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long jLongValue = ((Long) w0.a(contextD, str3, 0L)).longValue();
            g gVarD = d(str);
            if (gVarD == null) {
                gVarD = b().a();
            } else {
                j = jLongValue;
            }
            if ((gVarD.l0() * 1000) + j > jCurrentTimeMillis) {
                return false;
            }
            w0.b(contextD, str3, Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        String strI = DM.i(str, "_", str2);
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strI, str3);
        d.put(strI, l.l(str3));
    }
}
