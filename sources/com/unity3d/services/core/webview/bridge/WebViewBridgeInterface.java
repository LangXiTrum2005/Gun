package com.unity3d.services.core.webview.bridge;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class WebViewBridgeInterface {
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final IWebViewBridge webViewBridge;

    public WebViewBridgeInterface() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @JavascriptInterface
    public final void handleCallback(String str, String str2, String str3) throws Exception {
        AbstractC2995aW.q(str, "callbackId");
        AbstractC2995aW.q(str2, "callbackStatus");
        AbstractC2995aW.q(str3, "rawParameters");
        DeviceLog.debug("handleCallback " + str + ' ' + str2 + ' ' + str3);
        this.webViewBridge.handleCallback(str, str2, JSONArrayExtensionsKt.toTypedArray(new JSONArray(str3)));
    }

    @JavascriptInterface
    public final void handleInvocation(String str) throws JSONException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AbstractC2995aW.q(str, "data");
        DeviceLog.debug("handleInvocation ".concat(str));
        JSONArray jSONArray = new JSONArray(str);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            AbstractC2995aW.o(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            AbstractC2995aW.o(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            AbstractC2995aW.o(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            AbstractC2995aW.o(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    public final void onHandleCallback(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) throws Exception {
        AbstractC2995aW.q(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(webMessageCompat, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(uri, "sourceOrigin");
        AbstractC2995aW.q(javaScriptReplyProxy, "replyProxy");
        String data = webMessageCompat.getData();
        if (!z || data == null || AbstractC3089ba0.v0(data)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(data);
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString(NotificationCompat.CATEGORY_STATUS);
        String string3 = jSONObject.getString("parameters");
        AbstractC2995aW.p(string, "callbackId");
        AbstractC2995aW.p(string2, "callbackStatus");
        AbstractC2995aW.p(string3, "rawParameters");
        handleCallback(string, string2, string3);
    }

    public final void onHandleInvocation(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) throws JSONException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AbstractC2995aW.q(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(webMessageCompat, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(uri, "sourceOrigin");
        AbstractC2995aW.q(javaScriptReplyProxy, "replyProxy");
        String data = webMessageCompat.getData();
        if (!z || data == null || AbstractC3089ba0.v0(data)) {
            return;
        }
        handleInvocation(data);
    }

    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }

    public WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker) {
        AbstractC2995aW.q(iWebViewBridge, "webViewBridge");
        AbstractC2995aW.q(iInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = iWebViewBridge;
        this.webViewAppInvocationCallbackInvoker = iInvocationCallbackInvoker;
    }
}
