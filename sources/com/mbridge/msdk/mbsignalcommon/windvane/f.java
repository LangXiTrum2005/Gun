package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f1497a = new f();

    private f() {
    }

    public static f a() {
        return f1497a;
    }

    public void b(Object obj, String str) {
        String strN;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                strN = DM.B("javascript:window.WindVane.onSuccess(", aVar.g, ",'');");
            } else {
                strN = AbstractC5044xl.n("javascript:window.WindVane.onSuccess(", aVar.g, ",'", i.a(str), "');");
            }
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(strN);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str, String str2) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String strB = TextUtils.isEmpty(str2) ? DM.B("javascript:window.WindVane.fireEvent('", str, "', '');") : AbstractC5044xl.n("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(strB);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(WebView webView, String str, String str2) {
        String strN;
        if (TextUtils.isEmpty(str2)) {
            strN = DM.B("javascript:window.WindVane.fireEvent('", str, "', '');");
        } else {
            strN = AbstractC5044xl.n("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(strN);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                String str2 = aVar.g;
            } else {
                str = i.a(str);
            }
            String strN = AbstractC5044xl.n("javascript:window.WindVane.onFailure(", aVar.g, ",'", str, "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.b.loadUrl(strN);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, "");
        } catch (Throwable unused2) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, "");
        }
    }
}
