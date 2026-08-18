package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f1225a = "c";

    public class a implements com.mbridge.msdk.tracker.h {
        @Override // com.mbridge.msdk.tracker.h
        public JSONObject a(com.mbridge.msdk.tracker.e eVar) {
            if (eVar == null) {
                return null;
            }
            JSONObject jSONObjectD = eVar.d();
            if (jSONObjectD == null) {
                jSONObjectD = new JSONObject();
            }
            try {
                jSONObjectD.put("key", eVar.b());
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                int iS = k0.s(contextD);
                if (!jSONObjectD.has(bc.T)) {
                    jSONObjectD.put(bc.T, iS);
                    jSONObjectD.put("network_str", k0.a(contextD, iS));
                }
                if (!jSONObjectD.has("st")) {
                    jSONObjectD.put("st", System.currentTimeMillis());
                }
                String strOptString = jSONObjectD.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String str = com.mbridge.msdk.foundation.controller.a.s.get(strOptString);
                    jSONObjectD.put("u_stid", str != null ? str : "");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && !jSONObjectD.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                    jSONObjectD.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g) && !jSONObjectD.has(bc.aL)) {
                    jSONObjectD.put(bc.aL, com.mbridge.msdk.foundation.same.a.g);
                }
            } catch (Exception e) {
                o0.b(c.f1225a, e.getMessage());
            }
            return jSONObjectD;
        }
    }

    public static JSONObject b() {
        return com.mbridge.msdk.foundation.same.report.a.a();
    }

    public static com.mbridge.msdk.tracker.f c() {
        return new com.mbridge.msdk.tracker.n();
    }

    public static com.mbridge.msdk.tracker.h d() {
        return new a();
    }

    public static boolean a(String str) {
        com.mbridge.msdk.setting.g gVarF = AbstractC3888ke0.f(com.mbridge.msdk.setting.h.b());
        if (gVarF == null) {
            return true;
        }
        return b.a(gVarF, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove("model");
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove(bc.T);
            jSONObject.remove("useragent");
            jSONObject.remove(ay.d);
            jSONObject.remove(bc.N);
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove(bc.y);
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.d);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.e);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove(bc.M);
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove("gaid");
        jSONObject.remove("gaid2");
        jSONObject.remove("oaid");
        jSONObject.remove("az_aid_info");
    }
}
