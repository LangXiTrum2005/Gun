package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;

/* JADX INFO: loaded from: classes2.dex */
public class MBSplashWebview extends WindVaneWebView {
    private String r;
    private N2 s;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            N2 n2 = this.s;
            if (n2 != null) {
                n2.c();
                this.s = null;
                o0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e) {
            o0.a("OMSDK", e.getMessage());
        }
    }

    public N2 getAdSession() {
        return this.s;
    }

    public String getRequestId() {
        return this.r;
    }

    public void setAdSession(N2 n2) {
        this.s = n2;
    }

    public void setRequestId(String str) {
        this.r = str;
    }
}
