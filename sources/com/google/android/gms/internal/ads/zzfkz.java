package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzfkz implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzfla zza;

    public zzfkz(zzfla zzflaVar) {
        this.zza = zzflaVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zzfla.zze(this.zza, string2);
            } else if (string.equals("finishSession")) {
                zzfla.zzc(this.zza, string2);
            } else {
                zzfkm.zza.getClass();
            }
        } catch (JSONException e) {
            zzfmh.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
