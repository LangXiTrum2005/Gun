package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final AbstractC3899kk dispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(AbstractC3899kk abstractC3899kk, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.dispatcher = abstractC3899kk;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(AndroidWebViewContainer androidWebViewContainer, InterfaceC4514rk interfaceC4514rk) {
        AbstractC2995aW.q(androidWebViewContainer, "webViewContainer");
        AbstractC2995aW.q(interfaceC4514rk, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, androidWebViewContainer, interfaceC4514rk, this.sendDiagnosticEvent);
    }

    public CommonGetWebViewBridgeUseCase(AbstractC3899kk abstractC3899kk, SendDiagnosticEvent sendDiagnosticEvent, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? AbstractC4437qp.f4904a : abstractC3899kk, sendDiagnosticEvent);
    }
}
