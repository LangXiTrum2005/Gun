package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.r0;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static void a(e eVar, Context context) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", k0.C() + "");
            eVar.a("has_wx", k0.D(context) + "");
            eVar.a("integrated_wx", k0.D() + "");
            eVar.a("opensdk_ver", k0.B() + "");
            eVar.a("wx_api_ver", k0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
            eVar.a("mnc", k0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
            eVar.a("mcc", k0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
            String strJ = k0.j();
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("hardware", strJ);
            }
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().d() == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.f.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.d, r0.c() + "");
            eVar.a(e.e, r0.a() + "");
            eVar.a(e.j, k0.u());
        }
        eVar.a("pkg_source", k0.a(k0.t(context), context));
        if (com.mbridge.msdk.foundation.controller.c.n().k() != null) {
            eVar.a("web_env", com.mbridge.msdk.foundation.controller.c.n().k().toString());
        }
        eVar.a("http_req", "2");
        g.a(eVar, context);
        g(eVar);
    }

    public static void b(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.d);
    }

    public static void c(e eVar) {
        String str = com.mbridge.msdk.util.c.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        eVar.a("cronet_env", str);
    }

    public static void d(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.w);
    }

    public static void e(e eVar) {
        com.mbridge.msdk.setting.g gVarF = AbstractC3888ke0.f(com.mbridge.msdk.setting.h.b());
        if (gVarF == null) {
            gVarF = com.mbridge.msdk.setting.h.b().a();
        }
        if (gVarF.D() == 1) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        } else if (gVarF.E0()) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().e() + "");
        }
        String strF = com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        eVar.a("tc_string", strF);
    }

    public static void f(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                eVar.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(bc.aL);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                return;
            }
            eVar.a(bc.aL, com.mbridge.msdk.foundation.same.a.g);
        } catch (Exception e) {
            o0.b("CommonRequestParamsForAdd", e.getMessage());
        }
    }

    public static void g(e eVar) {
        a(eVar, true);
        i(eVar);
        f(eVar);
        e(eVar);
        a(eVar);
        c(eVar);
        g.a(eVar);
    }

    public static void h(e eVar) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", k0.C() + "");
            eVar.a("has_wx", k0.D(com.mbridge.msdk.foundation.controller.c.n().d()) + "");
            eVar.a("integrated_wx", k0.D() + "");
            eVar.a("opensdk_ver", k0.B() + "");
            eVar.a("wx_api_ver", k0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
            eVar.a("mnc", k0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
            eVar.a("mcc", k0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
            String strJ = k0.j();
            if (!TextUtils.isEmpty(strJ)) {
                eVar.a("hardware", strJ);
            }
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.f.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.j, k0.u());
        }
        g.b(eVar);
        a(eVar, false);
        i(eVar);
        f(eVar);
        a(eVar);
        c(eVar);
    }

    public static void i(e eVar) {
        int iA = k0.A();
        if (iA != -1) {
            eVar.a("unknown_source", iA + "");
        }
    }

    public static void j(e eVar) {
        if (k0.y() == 0) {
            return;
        }
        eVar.a("tun", k0.y() + "");
    }

    public static void k(e eVar) {
        if (eVar != null) {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("model");
                eVar.a("brand");
                eVar.a("screen_size");
                eVar.a("sub_ip");
                eVar.a(bc.T);
                eVar.a("useragent");
                eVar.a(ay.d);
                eVar.a(bc.N);
                eVar.a("network_str");
                eVar.a(bc.y);
                eVar.a("country_code");
                eVar.a("cronet_env");
                eVar.a("adid_limit");
                eVar.a("adid_limit_dev");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVar.a(e.d);
                eVar.a(e.e);
                eVar.a("power_rate");
                eVar.a("charging");
                eVar.a(bc.M);
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                eVar.a("gaid");
                eVar.a("gaid2");
                eVar.a("az_aid_info");
            }
            g.c(eVar);
        }
    }

    public static void a(e eVar, boolean z) {
        com.mbridge.msdk.setting.g gVarF = AbstractC3888ke0.f(com.mbridge.msdk.setting.h.b());
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (gVarF != null) {
            if (!TextUtils.isEmpty(gVarF.a()) && z) {
                eVar.a("a_stid", gVarF.a());
            }
            try {
                g.a(eVar, contextD, z, gVarF);
            } catch (Exception e) {
                o0.b("CommonRequestParamsForAdd", e.getMessage());
            }
        }
    }

    public static void a(e eVar) {
        String strB = com.mbridge.msdk.foundation.tools.f.b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        eVar.a("az_aid_info", strB);
    }
}
