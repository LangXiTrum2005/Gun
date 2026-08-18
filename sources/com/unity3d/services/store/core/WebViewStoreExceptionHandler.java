package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class WebViewStoreExceptionHandler implements StoreExceptionHandler {
    private final WebViewErrorHandler _webViewErrorHandler;

    public WebViewStoreExceptionHandler(WebViewErrorHandler webViewErrorHandler) {
        AbstractC2995aW.q(webViewErrorHandler, "_webViewErrorHandler");
        this._webViewErrorHandler = webViewErrorHandler;
    }

    private final StoreError getStoreError(Exception exc) {
        if (exc instanceof NoSuchMethodException) {
            return StoreError.NO_SUCH_METHOD;
        }
        if (exc instanceof IllegalAccessException) {
            return StoreError.ILLEGAL_ACCESS;
        }
        if (exc instanceof JSONException) {
            return StoreError.JSON_ERROR;
        }
        if (exc instanceof InvocationTargetException) {
            return StoreError.INVOCATION_TARGET;
        }
        return exc instanceof ClassNotFoundException ? StoreError.CLASS_NOT_FOUND : StoreError.UNKNOWN_ERROR;
    }

    private final void sendErrorToWebView(StoreEvent storeEvent, StoreError storeError, int i, Exception exc) {
        this._webViewErrorHandler.handleError((WebViewAdsError) new StoreWebViewError(storeEvent, exc.getMessage(), Integer.valueOf(i), storeError, exc.getMessage()));
    }

    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(StoreEvent storeEvent, int i, Exception exc) {
        AbstractC2995aW.q(storeEvent, "storeEvent");
        AbstractC2995aW.q(exc, "exception");
        sendErrorToWebView(storeEvent, getStoreError(exc), i, exc);
    }
}
