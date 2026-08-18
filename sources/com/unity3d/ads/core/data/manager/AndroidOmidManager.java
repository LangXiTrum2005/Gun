package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3026an0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4187o1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3346eT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5042xk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.P2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(Context context) {
        AbstractC2995aW.q(context, f.X);
        AbstractC3375el.c.a(context.getApplicationContext());
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public C4187o1 createAdEvents(L2 l2) {
        AbstractC2995aW.q(l2, "adSession");
        C3026an0 c3026an0 = (C3026an0) l2;
        V2 v2 = c3026an0.e;
        if (((C4187o1) v2.e) != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        if (c3026an0.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C4187o1 c4187o1 = new C4187o1(c3026an0);
        v2.e = c4187o1;
        return c4187o1;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public L2 createAdSession(O2 o2, P2 p2) {
        AbstractC2995aW.q(o2, "adSessionConfiguration");
        AbstractC2995aW.q(p2, f.X);
        if (AbstractC3375el.c.b()) {
            return new C3026an0(o2, p2);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public O2 createAdSessionConfiguration(EnumC5042xk enumC5042xk, RC rc, EnumC3346eT enumC3346eT, EnumC3346eT enumC3346eT2, boolean z) {
        AbstractC2995aW.q(enumC5042xk, "creativeType");
        AbstractC2995aW.q(rc, "impressionType");
        AbstractC2995aW.q(enumC3346eT, "owner");
        AbstractC2995aW.q(enumC3346eT2, "mediaEventsOwner");
        if (enumC3346eT == EnumC3346eT.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        EnumC5042xk enumC5042xk2 = EnumC5042xk.DEFINED_BY_JAVASCRIPT;
        EnumC3346eT enumC3346eT3 = EnumC3346eT.NATIVE;
        if (enumC5042xk == enumC5042xk2 && enumC3346eT == enumC3346eT3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (rc == RC.DEFINED_BY_JAVASCRIPT && enumC3346eT == enumC3346eT3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new O2(enumC5042xk, rc, enumC3346eT, enumC3346eT2, z);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public P2 createHtmlAdSessionContext(NT nt, WebView webView, String str, String str2) {
        AbstractC2340Cl.d(nt, "Partner is null");
        AbstractC2340Cl.d(webView, "WebView is null");
        if (str2 == null || str2.length() <= 256) {
            return new P2(nt, webView, str, str2, Q2.HTML);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public P2 createJavaScriptAdSessionContext(NT nt, WebView webView, String str, String str2) {
        AbstractC2340Cl.d(nt, "Partner is null");
        AbstractC2340Cl.d(webView, "WebView is null");
        if (str2 == null || str2.length() <= 256) {
            return new P2(nt, webView, str, str2, Q2.JAVASCRIPT);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public String getVersion() {
        return "1.4.9-Unity3d";
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return AbstractC3375el.c.b();
    }
}
