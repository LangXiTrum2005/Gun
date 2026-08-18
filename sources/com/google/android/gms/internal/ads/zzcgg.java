package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public final class zzcgg extends zzcgf {
    public zzcgg(zzcex zzcexVar, zzbbj zzbbjVar, boolean z, @Nullable zzebv zzebvVar) {
        super(zzcexVar, zzbbjVar, z, zzebvVar);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzW(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
