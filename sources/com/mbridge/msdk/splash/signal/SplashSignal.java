package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SplashSignal extends AbsFeedBackForH5 {
    private static String h = "SplashSignal";
    public static final /* synthetic */ int i = 0;
    private b g;

    public void getFileInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c.a(obj, new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().onReceivedError(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
            } catch (Throwable th) {
                o0.b(h, "handlerH5Exception", th);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            c.b(obj, new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        AbstractC5044xl.s(MobileAdsBridgeBase.initializeMethodName, str, h);
        b bVar = this.g;
        if (bVar != null) {
            bVar.init(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof b)) {
                return;
            }
            this.g = (b) windVaneWebView.getObject();
        } catch (Throwable th) {
            o0.b(h, MobileAdsBridgeBase.initializeMethodName, th);
        }
    }

    public void install(Object obj, String str) {
        b bVar = this.g;
        if (bVar != null) {
            bVar.install(obj, str);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            o0.b(h, "onSignalCommunication");
            b bVar = this.g;
            if (bVar != null) {
                bVar.c(obj, str);
            }
        } catch (Throwable th) {
            o0.b(h, "onSignalCommunication", th);
        }
    }

    public void openURL(Object obj, String str) {
        AbstractC5044xl.s("openURL", str, h);
        b bVar = this.g;
        if (bVar != null) {
            bVar.openURL(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            o0.b(h, "pauseCountDown");
            b bVar = this.g;
            if (bVar != null) {
                bVar.e(obj, str);
            }
        } catch (Throwable th) {
            o0.b(h, "pauseCountDown", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().a(windVaneWebView, iOptInt);
            } catch (Throwable th) {
                o0.b(h, "readyStatus", th);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            o0.b(h, "reportUrls");
            b bVar = this.g;
            if (bVar != null) {
                bVar.reportUrls(obj, str);
            }
        } catch (Throwable th) {
            o0.b(h, "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        AbstractC5044xl.s("resetCountdown", str, h);
        b bVar = this.g;
        if (bVar != null) {
            bVar.a(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            o0.b(h, "resumeCountDown");
            b bVar = this.g;
            if (bVar != null) {
                bVar.f(obj, str);
            }
        } catch (Throwable th) {
            o0.b(h, "resumeCountDown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            o0.b(h, "sendImpressions");
            b bVar = this.g;
            if (bVar != null) {
                bVar.d(obj, str);
            }
        } catch (Throwable th) {
            o0.b(h, "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        AbstractC5044xl.s("toggleCloseBtn", str, h);
        b bVar = this.g;
        if (bVar != null) {
            bVar.toggleCloseBtn(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        AbstractC5044xl.s("triggerCloseBtn", str, h);
        b bVar = this.g;
        if (bVar != null) {
            bVar.triggerCloseBtn(obj, str);
        }
    }
}
