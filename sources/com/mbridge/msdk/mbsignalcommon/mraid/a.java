package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a, reason: collision with other inner class name */
    public static class C0197a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f1486a = new a();
    }

    public static a a() {
        return C0197a.f1486a;
    }

    public void b(WebView webView, float f, float f2) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void c(WebView webView, float f, float f2) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void a(WebView webView) {
        a(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public void a(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String string = jSONObject.toString();
        try {
            string = URLEncoder.encode(string, C.UTF8_NAME);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        a(webView, DM.B("javascript:window.mraidbridge.fireChangeEvent(", string, ");"));
    }

    public void b(WebView webView, float f, float f2, float f3, float f4) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    public void c(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
        a(webView, DM.B("javascript:window.mraidbridge.setIsViewable(", str, ");"));
    }

    public void b(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
        a(webView, DM.B("javascript:window.mraidbridge.nativeCallComplete('", str, "');"));
    }

    public void a(WebView webView, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, C.UTF8_NAME);
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
        a(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public void a(WebView webView, double d) {
        Locale locale = Locale.CHINA;
        a(webView, "javascript:window.mraidbridge.audioVolumeChange(" + d + ");");
    }

    public void a(WebView webView, float f, float f2) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void a(WebView webView, float f, float f2, float f3, float f4) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    private void a(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
