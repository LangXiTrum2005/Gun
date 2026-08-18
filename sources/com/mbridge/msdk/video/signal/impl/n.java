package com.mbridge.msdk.video.signal.impl;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class n extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f2377a;

    public n(WebView webView) {
        this.f2377a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i) {
        super.a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2377a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i, String str) {
        super.a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2377a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.v vVar) {
        super.a(vVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(vVar.f2262a, vVar.b));
            jSONObject.put("time", String.valueOf(vVar.f2262a));
            jSONObject.put("duration", String.valueOf(vVar.b));
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2377a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String a(int i, int i2) {
        if (i2 != 0) {
            try {
                return t0.a(Double.valueOf(i / i2)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return AbstractC3950lJ.n(i2, "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        String strEncodeToString;
        super.a(obj);
        if (obj != null && (obj instanceof String)) {
            strEncodeToString = Base64.encodeToString(obj.toString().getBytes(), 2);
        } else {
            strEncodeToString = "";
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2377a, "webviewshow", strEncodeToString);
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i, int i2, int i3, int i4) {
        super.a(i, i2, i3, i4);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i != 2 ? i2 != 2 : i2 == 1) {
                str = "portrait";
            }
            jSONObject2.put(AdUnitActivity.EXTRA_ORIENTATION, str);
            jSONObject2.put("screen_width", i3);
            jSONObject2.put("screen_height", i4);
            jSONObject.put("data", jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f2377a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
