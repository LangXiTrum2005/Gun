package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadWebViewError extends AdPlayerError {
    private final List<WebViewClientError> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(List<WebViewClientError> list) {
        super("AdPlayer was not able to load the webview.", null);
        AbstractC2995aW.q(list, "errors");
        this.errors = list;
    }

    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }
}
