package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzgcs;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends zzbkk {
    private final WebView zza;
    private final zzf zzb;
    private final Executor zzc;

    @Nullable
    private WebViewClient zzd;

    public zzj(WebView webView, zzf zzfVar, @UiThread zzgcs zzgcsVar) {
        this.zza = webView;
        this.zzb = zzfVar;
        this.zzc = zzgcsVar;
    }

    private final void zzc() {
        this.zza.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjF), this.zzb.zza()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzc();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzc();
        super.onPageStarted(webView, str, bitmap);
    }

    public final /* synthetic */ void zza() {
        WebViewClient webViewClient;
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            WebView webView = this.zza;
            if (Build.VERSION.SDK_INT < 26) {
                if (WebViewFeature.isFeatureSupported(WebViewFeature.GET_WEB_VIEW_CLIENT)) {
                    try {
                        webViewClient = WebViewCompat.getWebViewClient(webView);
                    } catch (RuntimeException e) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            webViewClient = webView.getWebViewClient();
            if (webViewClient == this) {
                return;
            }
            if (webViewClient != null) {
                this.zzd = webViewClient;
            }
            this.zza.setWebViewClient(this);
            zzc();
        } catch (IllegalStateException unused) {
        }
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza();
            }
        });
    }
}
