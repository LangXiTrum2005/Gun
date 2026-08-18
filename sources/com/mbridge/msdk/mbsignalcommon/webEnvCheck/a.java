package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f1490a;
    private static volatile Handler b;
    private static Boolean c;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    public class RunnableC0198a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1491a;

        public RunnableC0198a(Context context) {
            this.f1491a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f1490a == null) {
                try {
                    Boolean unused = a.f1490a = Boolean.valueOf(a.a(this.f1491a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f1490a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean b(Context context) {
        g gVarB;
        try {
            gVarB = h.b().b(c.n().b());
        } catch (Exception unused) {
            gVarB = null;
        }
        if (gVarB != null) {
            c = Boolean.valueOf(gVarB.C0());
        } else {
            c = Boolean.FALSE;
        }
        Boolean bool = c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f1490a == null) {
                try {
                    f1490a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f1490a = Boolean.FALSE;
                }
            }
            if (f1490a == null) {
                f1490a = new Boolean(false);
            }
            return f1490a.booleanValue();
        }
        if (f1490a == null && b == null) {
            b = new Handler(Looper.getMainLooper());
            b.post(new RunnableC0198a(context));
        }
        if (f1490a == null) {
            return true;
        }
        return f1490a.booleanValue();
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("MBWebViewChecker", "destroy webview error", e);
            }
        }
    }
}
