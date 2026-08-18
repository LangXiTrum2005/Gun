package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f2374a;
    private int b = 0;

    public i(WebView webView) {
        this.f2374a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, "landscape");
            } else {
                jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, "portrait");
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2374a, AdUnitActivity.EXTRA_ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void b() {
        super.b();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2374a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void d() {
        super.d();
        this.b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2374a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void e() {
        super.e();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2374a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void g() {
        super.g();
        this.b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2374a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(int i) {
        super.a(i);
        this.b = i;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public int a() {
        return this.b;
    }
}
