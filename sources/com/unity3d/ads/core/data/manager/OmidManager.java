package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4187o1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3346eT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5042xk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.P2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RC;

/* JADX INFO: loaded from: classes4.dex */
public interface OmidManager {
    void activate(Context context);

    C4187o1 createAdEvents(L2 l2);

    L2 createAdSession(O2 o2, P2 p2);

    O2 createAdSessionConfiguration(EnumC5042xk enumC5042xk, RC rc, EnumC3346eT enumC3346eT, EnumC3346eT enumC3346eT2, boolean z);

    P2 createHtmlAdSessionContext(NT nt, WebView webView, String str, String str2);

    P2 createJavaScriptAdSessionContext(NT nt, WebView webView, String str, String str2);

    String getVersion();

    boolean isActive();
}
