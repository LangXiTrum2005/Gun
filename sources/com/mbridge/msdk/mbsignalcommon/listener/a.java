package com.mbridge.msdk.mbsignalcommon.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.windvane.c;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c {
    public void a(Object obj) {
        o0.a("RVWindVaneWebView", "getEndScreenInfo");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void loadingResourceStatus(WebView webView, int i) {
        o0.a("RVWindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onPageFinished(WebView webView, String str) {
        o0.a("RVWindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        o0.a("RVWindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onProgressChanged(WebView webView, int i) {
        o0.a("RVWindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        o0.a("RVWindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        o0.a("RVWindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void onRenderProcessGone(WebView webView) {
        o0.a("RVWindVaneWebView", "onRenderProcessGone");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        o0.a("RVWindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    public void a(WebView webView, String str, String str2, int i, int i2) {
        o0.a("RVWindVaneWebView", "loadAds");
    }

    public void a(Object obj, String str) {
        o0.a("RVWindVaneWebView", "operateComponent");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView, int i) {
        o0.a("RVWindVaneWebView", "readyState");
    }
}
