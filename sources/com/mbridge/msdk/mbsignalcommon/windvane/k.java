package com.mbridge.msdk.mbsignalcommon.windvane;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.o0;

/* JADX INFO: loaded from: classes2.dex */
public class k extends com.mbridge.msdk.mbsignalcommon.base.b {
    protected String c = null;
    private int d = 0;
    private c e;

    @RequiresApi(api = 11)
    private WebResourceResponse a(String str) {
        try {
            if (TextUtils.isEmpty(str) || !i.e(str)) {
                return null;
            }
            o0.c("WindVaneWebViewClient", "is image " + str);
            Bitmap bitmapB = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(str);
            o0.c("WindVaneWebViewClient", "find image from cache " + str);
            if (bitmapB == null || bitmapB.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(i.b(str), "utf-8", com.mbridge.msdk.foundation.same.image.a.a(bitmapB));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.c = str;
        c cVar = this.e;
        if (cVar != null) {
            cVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseA = a(str);
        if (webResourceResponseA == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        o0.c("WindVaneWebViewClient", "find WebResourceResponse url is " + str);
        return webResourceResponseA;
    }
}
