package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.e0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f1810a = "j";

    public class a extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)) {
                return;
            }
            try {
                e0.a().a(jSONObject.getString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I));
            } catch (Exception e) {
                o0.b(j.f1810a, e.getMessage());
            }
        }
    }

    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {
        final /* synthetic */ Context b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        public c(Context context, String str, String str2) {
            this.b = context;
            this.c = str;
            this.d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().r = false;
            AbstractC3888ke0.s("fetch CNDSettingHost failed, errorCode = ", str, j.f1810a);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            o0.a(j.f1810a, "fetch CNDSettingHost success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host_ts", System.currentTimeMillis());
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host", str);
            for (String str2 : str.split("\n")) {
                if (!TextUtils.isEmpty(str2.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().u.contains(str2.trim())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().u.add(str2.trim());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().x.add(str2.trim());
                }
            }
            j.this.a(this.b, this.c, this.d);
        }
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().s || !com.mbridge.msdk.foundation.same.net.utils.d.h().r || com.mbridge.msdk.foundation.same.net.utils.d.h().w >= com.mbridge.msdk.foundation.same.net.utils.d.h().x.size()) {
                return str;
            }
            String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().w);
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            if (!str2.startsWith(ProxyConfig.MATCH_HTTP) && !str2.startsWith("https")) {
                return str;
            }
            return str2.concat("/setting");
        } catch (Throwable th) {
            o0.b(f1810a, th.getMessage());
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a();
        } catch (Throwable th) {
            o0.b(f1810a, th.getMessage());
        }
    }

    public void d(Context context, String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().r) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.utils.d.h().r = true;
            if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("mkey_spare_host_ts").longValue() + 86400000) {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host");
                if (!TextUtils.isEmpty(strA)) {
                    for (String str3 : strA.split("\n")) {
                        if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().u.contains(str3.trim())) {
                            com.mbridge.msdk.foundation.same.net.utils.d.h().u.add(str3.trim());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().x.add(str3.trim());
                        }
                    }
                    a(context, str, str2);
                    return;
                }
            }
            new com.mbridge.msdk.foundation.same.net.wrapper.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.utils.d.h().c, new com.mbridge.msdk.foundation.same.net.wrapper.e(), new c(context, str, str2), "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        } catch (Throwable th) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().r = false;
            o0.b(f1810a, th.getMessage());
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, str, str2, "1", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        if (!com.mbridge.msdk.foundation.same.net.utils.d.h().g()) {
            d(context, str, str2);
        } else {
            b(context, str, str2);
        }
    }

    public void a(Context context, String str, String str2, String str3, com.mbridge.msdk.foundation.same.net.wrapper.d dVar) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            String strV0 = h.b().b(str).v0();
            if (TextUtils.isEmpty(strV0)) {
                strV0 = "";
            }
            eVar.a("vtag", strV0);
        } catch (Throwable th) {
            o0.b(f1810a, th.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.utils.d.h().r) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.utils.d.h().t + "");
        }
        eVar.a("only_p_info", str3);
        com.mbridge.msdk.setting.net.c cVar = new com.mbridge.msdk.setting.net.c(context);
        String strConcat = com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().s && com.mbridge.msdk.foundation.same.net.utils.d.h().r && com.mbridge.msdk.foundation.same.net.utils.d.h().w < com.mbridge.msdk.foundation.same.net.utils.d.h().x.size()) {
                String str4 = com.mbridge.msdk.foundation.same.net.utils.d.h().x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().w);
                if (!TextUtils.isEmpty(str4) && (str4.startsWith(ProxyConfig.MATCH_HTTP) || str4.startsWith("https"))) {
                    strConcat = str4.concat("/setting");
                }
            }
        } catch (Throwable th2) {
            o0.b(f1810a, th2.getMessage());
        }
        cVar.get(1, strConcat, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        a(context, str, str2, "0", new b(str, context, str2));
        a(3, 0, "");
    }

    public class d extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        public d(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                if (t0.a(jSONObject)) {
                    String strOptString = jSONObject.optString("vtag", "");
                    String strOptString2 = jSONObject.optString("rid", "");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strF = h.b().f(this.b, this.c);
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    jSONObjectOptJSONObject = h.b().a(new JSONObject(strF), jSONObjectOptJSONObject);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        jSONObjectOptJSONObject.put("current_time", System.currentTimeMillis());
                        jSONObjectOptJSONObject.put("vtag", strOptString);
                        jSONObjectOptJSONObject.put("rid", strOptString2);
                        h.b().a(this.b, this.c, jSONObjectOptJSONObject.toString());
                    }
                } else {
                    h.b().j(this.b, this.c);
                }
                j.this.a(1, 1, "");
            } catch (Exception e2) {
                o0.b(j.f1810a, e2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            j.this.a(2, 1, "");
        }
    }

    public class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        final /* synthetic */ String b;
        final /* synthetic */ Context c;
        final /* synthetic */ String d;

        public b(String str, Context context, String str2) {
            this.b = str;
            this.c = context;
            this.d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            try {
                j.this.a(1, 0, "");
            } catch (Throwable th) {
                o0.b(j.f1810a, th.getMessage());
            }
            try {
                if (t0.a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strE = h.b().e(this.b);
                        if (!TextUtils.isEmpty(strE)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strE), jSONObject);
                            } catch (Exception e) {
                                o0.b(j.f1810a, e.getMessage());
                            }
                        }
                    }
                    k.a(jSONObject);
                    jSONObject.put("current_time", System.currentTimeMillis());
                    if (com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
                        if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                            jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().m);
                        }
                    } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                        jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().i);
                    }
                    h.b().h(this.b, jSONObject.toString());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                    k.a();
                    try {
                        if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                            com.mbridge.msdk.setting.util.a.a().a(this.c, jSONObject.optString("mraid_js"));
                        }
                    } catch (Exception e2) {
                        o0.b(j.f1810a, e2.getMessage());
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                        com.mbridge.msdk.setting.util.b.c().a(this.c, jSONObject.optString("web_env_url"));
                    }
                    j.this.a(this.c, this.b);
                } else {
                    h.b().h(this.b);
                }
                j.this.c();
            } catch (Exception e3) {
                o0.b(j.f1810a, e3.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                j.this.a(2, 0, str);
            } catch (Throwable th) {
                o0.b(j.f1810a, th.getMessage());
            }
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
                com.mbridge.msdk.foundation.same.net.utils.d.h().v++;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.d.h().w++;
            }
            j.this.a(this.c, this.b, this.d);
            j.this.c();
            AbstractC5044xl.s("get app setting error", str, j.f1810a);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
            str2 = com.mbridge.msdk.foundation.controller.c.n().c();
        }
        if (h.b().g(str3, str) && h.b().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String str4 = "[" + str3 + "]";
            eVar.a("unit_ids", str4);
            eVar.a("app_id", str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String strJ = h.b().d(str, str4).J();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            } catch (Throwable th) {
                o0.b(f1810a, th.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new com.mbridge.msdk.setting.net.c(context).get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().Q, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        g gVarD;
        h hVarB = h.b();
        if (hVarB != null && (gVarD = hVarB.d(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.U();
            MBridgeConstans.OMID_JS_H5_URL = gVarD.T();
        }
        com.mbridge.msdk.omsdk.b.b(context);
        com.mbridge.msdk.omsdk.b.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, String str) {
        String strB;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("key", "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().t));
            eVar.a("result", Integer.valueOf(i));
            eVar.a("type", Integer.valueOf(i2));
            if (i2 == 0) {
                strB = b();
            } else {
                strB = com.mbridge.msdk.foundation.same.net.utils.d.h().s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
            }
            eVar.a("url", strB);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th) {
            o0.b(f1810a, th.getMessage());
        }
    }
}
