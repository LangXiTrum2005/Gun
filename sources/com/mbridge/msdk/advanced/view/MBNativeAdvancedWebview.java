package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;

/* JADX INFO: loaded from: classes.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {
    private static final String t = "MBNativeAdvancedWebview";
    private N2 r;
    private NetWorkStateReceiver s;

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            N2 n2 = this.r;
            if (n2 != null) {
                n2.c();
                this.r = null;
                o0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e) {
            o0.a("OMSDK", e.getMessage());
        }
    }

    public N2 getAdSession() {
        return this.r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.s == null) {
                this.s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.s, intentFilter);
        } catch (Throwable th) {
            o0.a(t, th.getMessage());
        }
    }

    public void setAdSession(N2 n2) {
        this.r = n2;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.a();
                getContext().unregisterReceiver(this.s);
            }
        } catch (Throwable th) {
            o0.a(t, th.getMessage());
        }
    }
}
