package com.unity3d.ads.adplayer;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4731u90;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, InterfaceC2857Wj interfaceC2857Wj);

    Object destroy(InterfaceC2857Wj interfaceC2857Wj);

    Object evaluateJavascript(String str, InterfaceC2857Wj interfaceC2857Wj);

    InterfaceC4731u90 getLastInputEvent();

    Object loadUrl(String str, InterfaceC2857Wj interfaceC2857Wj);
}
