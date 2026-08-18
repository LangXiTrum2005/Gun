package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics
    public void invoke(List<WebViewClientError> list) {
        AbstractC2995aW.q(list, "errors");
        for (WebViewClientError webViewClientError : list) {
            String url = webViewClientError.getUrl();
            Map mapO = (url == null || url.length() == 0) ? null : AbstractC3375el.O(new C4839vT("webview_url", webViewClientError.getUrl()));
            LinkedHashMap linkedHashMapV0 = U5.v0(new C4839vT("reason", Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                linkedHashMapV0.put("webview_error_code", webViewClientError.getStatusCode());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", null, mapO, linkedHashMapV0, null, 18, null);
        }
    }
}
