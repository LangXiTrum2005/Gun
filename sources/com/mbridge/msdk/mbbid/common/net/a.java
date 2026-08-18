package com.mbridge.msdk.mbbid.common.net;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.same.net.wrapper.h;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.g;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends h {
    public a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.h, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        g gVarF = AbstractC3888ke0.f(com.mbridge.msdk.setting.h.b());
        if (gVarF == null) {
            gVarF = com.mbridge.msdk.setting.h.b().a();
        }
        eVar.a("platform", "1");
        eVar.a(bc.y, Build.VERSION.RELEASE);
        eVar.a("package_name", k0.t(this.mContext));
        eVar.a("app_version_name", k0.B(this.mContext));
        eVar.a("app_version_code", k0.A(this.mContext) + "");
        eVar.a("model", k0.n());
        eVar.a("brand", k0.s());
        eVar.a("gaid", "");
        eVar.a("gaid2", f.c());
        int iS = k0.s(this.mContext);
        eVar.a(bc.T, iS + "");
        eVar.a("network_str", k0.a(this.mContext, iS) + "");
        eVar.a(bc.N, k0.p(this.mContext));
        eVar.a(bc.M, k0.w());
        eVar.a("useragent", k0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", k0.n(this.mContext) + "x" + k0.m(this.mContext));
        b.a(eVar, gVarF, this.mContext);
        com.mbridge.msdk.foundation.same.net.wrapper.f.a(eVar, this.mContext);
        com.mbridge.msdk.foundation.same.net.wrapper.f.b(eVar);
        com.mbridge.msdk.foundation.same.net.wrapper.f.d(eVar);
        com.mbridge.msdk.foundation.same.net.wrapper.f.j(eVar);
    }
}
