package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import androidx.webkit.WebViewFeature;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.extensions.IntExtensionKt;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2854Wg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2828Vg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3732io;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4731u90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XC;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final InterfaceC4309pQ _isRenderProcessGone;
    private final InterfaceC2828Vg _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetWebViewCacheAssetLoader getWebViewAssetLoader;
    private final InterfaceC4731u90 isRenderProcessGone;
    private final InterfaceC4309pQ loadErrors;
    private final InterfaceC3732io onLoadFinished;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewClient$getLatestWebviewDomain$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewClient$getLatestWebviewDomain$1", f = "AndroidWebViewClient.kt", l = {133}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidWebViewClient.this.new AnonymousClass1(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                GetLatestWebViewConfiguration getLatestWebViewConfiguration = AndroidWebViewClient.this.getLatestWebViewConfiguration;
                this.label = 1;
                obj = GetLatestWebViewConfiguration.invoke$default(getLatestWebViewConfiguration, null, null, null, this, 7, null);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            String host = Uri.parse(((WebViewConfiguration) obj).getEntryPoint()).getHost();
            if (host == null || host.length() == 0) {
                return UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN;
            }
            AbstractC2995aW.p(host, "it");
            return host;
        }
    }

    public AndroidWebViewClient(GetWebViewCacheAssetLoader getWebViewCacheAssetLoader, GetCachedAsset getCachedAsset, GetLatestWebViewConfiguration getLatestWebViewConfiguration) {
        AbstractC2995aW.q(getWebViewCacheAssetLoader, "getWebViewAssetLoader");
        AbstractC2995aW.q(getCachedAsset, "getCachedAsset");
        AbstractC2995aW.q(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        this.getWebViewAssetLoader = getWebViewCacheAssetLoader;
        this.getCachedAsset = getCachedAsset;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.loadErrors = AbstractC4995x90.a(C2812Uq.f3846a);
        C2854Wg c2854WgB = AbstractC3375el.b();
        this._onLoadFinished = c2854WgB;
        this.onLoadFinished = c2854WgB;
        C4907w90 c4907w90A = AbstractC4995x90.a(Boolean.FALSE);
        this._isRenderProcessGone = c4907w90A;
        this.isRenderProcessGone = new CX(c4907w90A);
    }

    private final String getLatestWebviewDomain() {
        return (String) WD.R(C2734Rq.f3684a, new AnonymousClass1(null));
    }

    public final InterfaceC3732io getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final InterfaceC4731u90 isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) throws IllegalAccessException, InvocationTargetException {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(str, "url");
        if (AbstractC2995aW.i(str, BLANK_PAGE)) {
            InterfaceC4309pQ interfaceC4309pQ = this.loadErrors;
            do {
                c4907w90 = (C4907w90) interfaceC4309pQ;
                value = c4907w90.getValue();
            } while (!c4907w90.h(value, AbstractC2853Wf.q0(new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null), (List) value)));
        }
        super.onPageFinished(webView, str);
        ((C2854Wg) this._onLoadFinished).S(((C4907w90) this.loadErrors).getValue());
    }

    @Override // androidx.webkit.WebViewClientCompat
    @RequiresApi(21)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorCompat webResourceErrorCompat) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(webResourceRequest, J0.REQUEST_KEY_EXTRA);
        AbstractC2995aW.q(webResourceErrorCompat, "error");
        super.onReceivedError(webView, webResourceRequest, webResourceErrorCompat);
        ErrorReason errorReasonWebResourceToErrorReason = WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE) ? IntExtensionKt.webResourceToErrorReason(webResourceErrorCompat.getErrorCode()) : ErrorReason.REASON_UNKNOWN;
        InterfaceC4309pQ interfaceC4309pQ = this.loadErrors;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, AbstractC2853Wf.q0(new WebViewClientError(webResourceRequest.getUrl().toString(), errorReasonWebResourceToErrorReason, null, 4, null), (List) value)));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(webResourceRequest, J0.REQUEST_KEY_EXTRA);
        AbstractC2995aW.q(webResourceResponse, "errorResponse");
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        WebViewClientError webViewClientError = new WebViewClientError(webResourceRequest.getUrl().toString(), ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, Integer.valueOf(webResourceResponse.getStatusCode()));
        InterfaceC4309pQ interfaceC4309pQ = this.loadErrors;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, AbstractC2853Wf.q0(webViewClientError, (List) value)));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) throws IllegalAccessException, InvocationTargetException {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(renderProcessGoneDetail, "detail");
        ViewExtensionsKt.removeViewFromParent(webView);
        webView.destroy();
        if (!(((PE) this._onLoadFinished).N() instanceof XC)) {
            ((C4907w90) this._isRenderProcessGone).i(Boolean.TRUE);
        } else {
            InterfaceC4309pQ interfaceC4309pQ = this.loadErrors;
            do {
                c4907w90 = (C4907w90) interfaceC4309pQ;
                value = c4907w90.getValue();
            } while (!c4907w90.h(value, AbstractC2853Wf.q0(new WebViewClientError(String.valueOf(webView.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null), (List) value)));
            ((C2854Wg) this._onLoadFinished).S(((C4907w90) this.loadErrors).getValue());
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC2995aW.q(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(webResourceRequest, J0.REQUEST_KEY_EXTRA);
        Uri url = webResourceRequest.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        if (AbstractC2995aW.i(url.getLastPathSegment(), "favicon.ico")) {
            return new WebResourceResponse("image/png", null, null);
        }
        if (!AbstractC2995aW.i(url.getScheme(), UnityAdsConstants.Cache.CACHE_SCHEME)) {
            return AbstractC2995aW.i(url.getHost(), getLatestWebviewDomain()) ? this.getWebViewAssetLoader.invoke().shouldInterceptRequest(url) : super.shouldInterceptRequest(webView, webResourceRequest);
        }
        GetCachedAsset getCachedAsset = this.getCachedAsset;
        Uri url2 = webResourceRequest.getUrl();
        AbstractC2995aW.p(url2, "request.url");
        return getCachedAsset.invoke(url2);
    }
}
