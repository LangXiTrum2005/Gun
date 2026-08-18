package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4980x2;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {
    private final String c = "NativeAdvancedWebViewClient";
    private final String d;
    private final String e;
    String f;
    com.mbridge.msdk.advanced.middle.a g;
    private c h;

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.view.a$a, reason: collision with other inner class name */
    public class C0153a implements ValueCallback<String> {
        public C0153a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, com.mbridge.msdk.advanced.middle.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.directory.c cVar2 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC;
        this.d = e.b(cVar2) != null ? e.b(cVar2) : i0.a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.e = i0.a("Y+xgWkl2");
        this.f = str;
        this.g = aVar;
        this.h = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.h != null) {
            try {
                String strA = "";
                if (str.startsWith("file") && str.startsWith(this.d)) {
                    strA = str.replace(C4980x2.FILE_SCHEME, "");
                }
                if (a(str)) {
                    strA = this.h.a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
                }
                if (!TextUtils.isEmpty(strA) && a(strA, this.d)) {
                    o0.a("NativeAdvancedWebViewClient", "replace url : " + strA);
                    if (!strA.contains("127.0.0.1") && !strA.startsWith(ProxyConfig.MATCH_HTTP)) {
                        HashMap map = new HashMap();
                        map.put(HttpResponseHeader.AccessControlAllowOrigin, ProxyConfig.MATCH_ALL_SCHEMES);
                        WebResourceResponse webResourceResponse = new WebResourceResponse(MimeTypes.VIDEO_MP4, "utf-8", new FileInputStream(strA));
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th) {
                o0.b("NativeAdvancedWebViewClient", th.getMessage());
            }
        }
        return null;
    }

    public void b() {
        if (this.h != null) {
            this.h = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new C0153a());
        } catch (Throwable th) {
            o0.b("NativeAdvancedWebViewClient", "onPageStarted", th);
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.c && com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.advanced.signal.b) windVaneWebView.getObject()).a().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.b)) {
                    return false;
                }
            } catch (Exception e) {
                o0.b("NativeAdvancedWebViewClient", e.getMessage());
            }
            o0.b("NativeAdvancedWebViewClient", "Use html to open url.");
            com.mbridge.msdk.advanced.middle.a aVar = this.g;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th) {
            o0.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl().toString());
    }

    private boolean a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.e) || scheme.equals("mb-h5");
    }
}
