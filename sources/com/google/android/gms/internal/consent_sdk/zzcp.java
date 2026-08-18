package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcp {

    @GuardedBy("WebViewUtil.class")
    private static Boolean zza;

    private zzcp() {
    }

    public static void zza(WebView webView, String str) {
        boolean zBooleanValue;
        synchronized (zzcp.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
                zBooleanValue = zza.booleanValue();
            } else {
                zBooleanValue = zza.booleanValue();
            }
            throw th;
        }
        if (zBooleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
