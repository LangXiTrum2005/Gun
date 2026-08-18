package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.controller.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.controller.a;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class MBBidInterstitialVideoHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f1357a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private d h;
    private InterstitialVideoListener j;
    private int q;
    private int r;
    private int s;
    private boolean i = false;
    private int k = 2;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) {
        String strE = t0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            t0.b(str2, strE);
        }
        this.b = str2;
        this.c = str;
        boolean zA = b.b().a("new_bridge_reward_video");
        this.i = zA;
        if (zA) {
            b();
        } else {
            a();
        }
    }

    private void b(String str, String str2) {
        try {
            if (this.f1357a == null) {
                a aVar = new a();
                this.f1357a = aVar;
                aVar.d(true);
                this.f1357a.e(true);
                this.f1357a.c(str, str2);
            }
        } catch (Throwable th) {
            o0.b("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void c(String str, String str2) {
        if (this.h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.i) {
            return;
        }
        try {
            a aVar = this.f1357a;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.i) {
            d dVar = this.h;
            return dVar != null ? dVar.b() : "";
        }
        a aVar = this.f1357a;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        if (this.i) {
            d dVar = this.h;
            return dVar != null ? dVar.c() : "";
        }
        a aVar = this.f1357a;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        if (this.i) {
            b();
            d dVar = this.h;
            if (dVar != null) {
                return dVar.a(true);
            }
            return false;
        }
        a();
        a aVar = this.f1357a;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        boolean zA = b.b().a("new_bridge_reward_video");
        this.i = zA;
        if (zA) {
            b();
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f1357a != null) {
            this.f1357a.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 287, this.b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean zA = b.b().a("new_bridge_reward_video");
        this.i = zA;
        if (zA) {
            b();
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f1357a != null) {
            this.f1357a.a(true, str, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 287, this.b, true, 2));
        }
    }

    public void playVideoMute(int i) {
        this.k = i;
        if (this.i) {
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(i);
                return;
            }
            return;
        }
        a aVar = this.f1357a;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.n = true;
        this.o = true;
        MBridgeGlobalCommon.setAlertDialogText(this.b, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i, int i2) {
        this.q = i;
        this.r = i2;
        this.s = com.mbridge.msdk.foundation.same.a.K;
        this.p = true;
        c();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        d dVar;
        a aVar;
        this.j = interstitialVideoListener;
        this.m = true;
        if (!this.i && (aVar = this.f1357a) != null && !aVar.u()) {
            this.f1357a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.b, true));
            this.m = false;
        }
        this.l = true;
        if (!this.i || (dVar = this.h) == null || dVar.d()) {
            return;
        }
        this.h.setRewardVideoListener(new InterstitialVideoListenerWrapper(interstitialVideoListener));
        this.l = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        d dVar;
        a aVar;
        this.j = interstitialVideoListener;
        this.m = true;
        if (!this.i && (aVar = this.f1357a) != null && !aVar.u()) {
            this.f1357a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.b, true));
            this.m = false;
        }
        this.l = true;
        if (!this.i || (dVar = this.h) == null || dVar.d()) {
            return;
        }
        this.h.setRewardVideoListener(new InterstitialVideoListenerWrapper(interstitialVideoListener));
        this.l = false;
    }

    public void showFromBid() {
        if (this.i) {
            b();
            d dVar = this.h;
            if (dVar != null) {
                dVar.a("", "", "");
                return;
            }
            return;
        }
        a();
        if (this.f1357a != null) {
            this.f1357a.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 287, this.b, false, -1));
        }
    }

    private void c() {
        if (this.i) {
            d dVar = this.h;
            if (dVar != null) {
                dVar.a(this.q, this.s, this.r);
                return;
            }
            return;
        }
        a aVar = this.f1357a;
        if (aVar != null) {
            aVar.a(this.q, this.s, this.r);
        }
    }

    public void setIVRewardEnable(int i, double d) {
        this.q = i;
        this.r = (int) (d * 100.0d);
        this.s = com.mbridge.msdk.foundation.same.a.J;
        this.p = true;
        c();
    }

    private void b() {
        d dVar;
        if (this.h == null) {
            c(this.c, this.b);
        }
        if (this.l) {
            d dVar2 = this.h;
            if (dVar2 != null) {
                dVar2.setRewardVideoListener(new InterstitialVideoListenerWrapper(this.j));
            }
            this.l = false;
        }
        if (this.o) {
            MBridgeGlobalCommon.setAlertDialogText(this.b, this.d, this.e, this.f, this.g);
            this.o = false;
        }
        if (this.p && (dVar = this.h) != null) {
            dVar.a(this.q, this.s, this.r);
            this.p = false;
        }
        d dVar3 = this.h;
        if (dVar3 != null) {
            dVar3.a(this.k);
        }
    }

    private void a() {
        a aVar;
        if (this.f1357a == null) {
            b(this.c, this.b);
        }
        if (this.m) {
            a aVar2 = this.f1357a;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.j, this.b, true));
            }
            this.m = false;
        }
        if (this.n) {
            a aVar3 = this.f1357a;
            if (aVar3 != null) {
                aVar3.a(this.d, this.e, this.f, this.g);
            }
            this.n = false;
        }
        if (this.p && (aVar = this.f1357a) != null) {
            aVar.a(this.q, this.s, this.r);
            this.p = false;
        }
        a aVar4 = this.f1357a;
        if (aVar4 != null) {
            aVar4.a(this.k);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
