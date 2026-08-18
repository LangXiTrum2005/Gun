package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewBridge {
    InterfaceC4286p60 getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, InterfaceC2857Wj interfaceC2857Wj);

    Object sendEvent(WebViewEvent webViewEvent, InterfaceC2857Wj interfaceC2857Wj);
}
