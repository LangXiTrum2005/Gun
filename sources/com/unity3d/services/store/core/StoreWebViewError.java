package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.services.core.webview.WebViewEventCategory;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class StoreWebViewError extends WebViewAdsError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum<?> r2, String str, Object... objArr) {
        super(r2, str, Arrays.copyOf(objArr, objArr.length));
        AbstractC2995aW.q(objArr, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError, com.unity3d.scar.adapter.common.IUnityAdsError
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
