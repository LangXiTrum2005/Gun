package com.unity3d.services.core.webview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.umeng.analytics.pro.f;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC4746uO;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class WebView extends android.webkit.WebView implements IServiceComponent {
    private final InterfaceC3069bH sdkMetricsSender$delegate;
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, false, null, null, null, 30, null);
        AbstractC2995aW.q(context, f.X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(WebView webView, String str, ValueCallback valueCallback) {
        AbstractC2995aW.q(webView, "this$0");
        AbstractC2995aW.q(str, "$script");
        super.evaluateJavascript(str, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        AbstractC2995aW.q(str, "script");
        Utilities.runOnUiThread(new RunnableC4746uO(this, str, valueCallback, 13));
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        AbstractC2995aW.q(str, "url");
        DeviceLog.debug("Loading url: ".concat(str));
        super.loadUrl(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z) {
        this(context, z, null, null, null, 28, null);
        AbstractC2995aW.q(context, f.X);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge iWebViewBridge) {
        this(context, z, iWebViewBridge, null, null, 24, null);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(iWebViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker) {
        this(context, z, iWebViewBridge, iInvocationCallbackInvoker, null, 16, null);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(iWebViewBridge, "webViewBridge");
        AbstractC2995aW.q(iInvocationCallbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i, AbstractC2471Hm abstractC2471Hm) {
        this(context, (i & 2) != 0 ? false : z, (i & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        super(context);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(iWebViewBridge, "webViewBridge");
        AbstractC2995aW.q(iInvocationCallbackInvoker, "callbackInvoker");
        AbstractC2995aW.q(iExperiments, "experiments");
        this.sdkMetricsSender$delegate = AbstractC2340Cl.H(EnumC4124nH.c, new WebView$special$$inlined$inject$default$1(this, ""));
        final WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(iWebViewBridge, iInvocationCallbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        final int i = 1;
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        final int i2 = 0;
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean zIsWebMessageEnabled = iExperiments.isWebMessageEnabled();
        if (zIsWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean zIsFeatureSupported = WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER);
        if (zIsFeatureSupported) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (zIsWebMessageEnabled && zIsFeatureSupported) {
            Set setSingleton = Collections.singleton(ProxyConfig.MATCH_ALL_SCHEMES);
            AbstractC2995aW.p(setSingleton, "singleton(element)");
            WebViewCompat.addWebMessageListener(this, "handleInvocation", setSingleton, new WebViewCompat.WebMessageListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vl0
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy) throws Exception {
                    switch (i2) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, webMessageCompat, uri, z2, javaScriptReplyProxy);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, webMessageCompat, uri, z2, javaScriptReplyProxy);
                            break;
                    }
                }
            });
            Set setSingleton2 = Collections.singleton(ProxyConfig.MATCH_ALL_SCHEMES);
            AbstractC2995aW.p(setSingleton2, "singleton(element)");
            WebViewCompat.addWebMessageListener(this, "handleCallback", setSingleton2, new WebViewCompat.WebMessageListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vl0
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy) throws Exception {
                    switch (i) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, webMessageCompat, uri, z2, javaScriptReplyProxy);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, webMessageCompat, uri, z2, javaScriptReplyProxy);
                            break;
                    }
                }
            });
            return;
        }
        addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
    }
}
