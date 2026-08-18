package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final InterfaceC2857Wj continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(InterfaceC2857Wj interfaceC2857Wj) {
        super("", 0);
        AbstractC2995aW.q(interfaceC2857Wj, "continuation");
        this.continuation = interfaceC2857Wj;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r5, Object... objArr) {
        AbstractC2995aW.q(objArr, "params");
        this.continuation.resumeWith(AbstractC3375el.v(new ExposureException("Invocation failed with: " + r5, objArr)));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... objArr) {
        AbstractC2995aW.q(objArr, "params");
        this.continuation.resumeWith(objArr);
    }
}
