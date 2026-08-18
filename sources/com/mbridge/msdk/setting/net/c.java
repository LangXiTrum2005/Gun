package com.mbridge.msdk.setting.net;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.out.MBConfiguration;
import com.umeng.analytics.pro.bc;
import com.unity3d.services.ads.adunit.AdUnitActivity;

/* JADX INFO: loaded from: classes2.dex */
public class c extends com.mbridge.msdk.foundation.same.net.wrapper.c {
    public c(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a("platform", "1");
        eVar.a(bc.y, Build.VERSION.RELEASE);
        eVar.a("package_name", k0.t(this.mContext));
        eVar.a("app_version_name", k0.B(this.mContext));
        eVar.a("app_version_code", k0.A(this.mContext) + "");
        eVar.a(AdUnitActivity.EXTRA_ORIENTATION, k0.F(this.mContext) + "");
        eVar.a("model", k0.n());
        eVar.a("brand", k0.s());
        eVar.a("gaid2", f.c());
        int iS = k0.s(this.mContext);
        eVar.a(bc.T, iS + "");
        eVar.a("network_str", k0.a(this.mContext, iS));
        eVar.a(bc.N, k0.p(this.mContext));
        eVar.a(bc.M, k0.w());
        eVar.a("useragent", k0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", k0.n(this.mContext) + "x" + k0.m(this.mContext));
        d.a(this.mContext, eVar);
        com.mbridge.msdk.foundation.same.net.wrapper.f.h(eVar);
    }
}
