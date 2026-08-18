package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes3.dex */
final class zzfmc extends WebViewClient {
    final /* synthetic */ zzfme zza;

    public zzfmc(zzfme zzfmeVar) {
        this.zza = zzfmeVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        renderProcessGoneDetail.toString();
        String.valueOf(webView);
        if (this.zza.zza() == webView) {
            this.zza.zzn(null);
        }
        webView.destroy();
        return true;
    }
}
