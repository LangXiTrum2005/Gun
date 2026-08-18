package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.controller.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.controller.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class MBBidInterstitialVideoHandler implements BaseExtraInterfaceForHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1547a;
    private String b;
    private String c;
    private String d;
    private String e;
    private a f;
    private d g;
    private NewInterstitialListener i;
    public String mUnitId;
    private int p;
    private int q;
    private int r;
    private boolean h = false;
    private int j = 2;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

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
        this.mUnitId = str2;
        this.f1547a = str;
        boolean zA = b.b().a("new_bridge_reward_video");
        this.h = zA;
        if (zA) {
            b();
        } else {
            a();
        }
    }

    private void b(String str, String str2) {
        try {
            if (this.f == null) {
                a aVar = new a();
                this.f = aVar;
                aVar.d(true);
                this.f.e(true);
                this.f.c(str, str2);
            }
        } catch (Throwable th) {
            o0.b("MBBidInterstitialVideoHandler", th.getMessage(), th);
        }
    }

    private void c(String str, String str2) {
        if (this.g == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.g = new d(287, str, str2, true);
        }
    }

    private void d() {
        d dVar;
        if (this.k) {
            d dVar2 = this.g;
            if (dVar2 != null) {
                dVar2.setRewardVideoListener(new NewInterstitialListenerWrapper(this.i));
            }
            this.k = false;
        }
        if (this.n) {
            MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, this.c, this.b, this.d, this.e);
            this.n = false;
        }
        if (this.o && (dVar = this.g) != null) {
            dVar.a(this.p, this.r, this.q);
            this.o = false;
        }
        d dVar3 = this.g;
        if (dVar3 != null) {
            dVar3.a(this.j);
        }
    }

    private void e() {
        if (this.h) {
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(this.p, this.r, this.q);
                return;
            }
            return;
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(this.p, this.r, this.q);
        }
    }

    public void clearVideoCache() {
        if (this.h) {
            return;
        }
        try {
            a aVar = this.f;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.h) {
            d dVar = this.g;
            return dVar != null ? dVar.b() : "";
        }
        a aVar = this.f;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        if (this.h) {
            d dVar = this.g;
            return dVar != null ? dVar.c() : "";
        }
        a aVar = this.f;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        if (this.h) {
            b();
            d dVar = this.g;
            if (dVar != null) {
                return dVar.a(true);
            }
            return false;
        }
        a();
        a aVar = this.f;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        boolean zA = b.b().a("new_bridge_reward_video");
        this.h = zA;
        if (zA) {
            b();
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f != null) {
            this.f.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 287, this.mUnitId, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean zA = b.b().a("new_bridge_reward_video");
        this.h = zA;
        if (zA) {
            b();
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f != null) {
            this.f.a(true, str, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 287, this.mUnitId, true, 2));
        }
    }

    public void playVideoMute(int i) {
        this.j = i;
        if (this.h) {
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(i);
                return;
            }
            return;
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.c = str;
        this.b = str2;
        this.d = str3;
        this.e = str4;
        this.n = true;
        this.m = true;
        MBridgeGlobalCommon.setAlertDialogText(this.mUnitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.n().a(this.mUnitId, jSONObject);
    }

    public void setIVRewardEnable(int i, int i2) {
        this.p = i;
        this.q = i2;
        this.r = com.mbridge.msdk.foundation.same.a.K;
        this.o = true;
        e();
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        d dVar;
        a aVar;
        this.i = newInterstitialListener;
        this.l = true;
        if (!this.h && (aVar = this.f) != null && !aVar.u()) {
            this.f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
            this.l = false;
        }
        this.k = true;
        if (!this.h || (dVar = this.g) == null || dVar.d()) {
            return;
        }
        this.g.setRewardVideoListener(new NewInterstitialListenerWrapper(newInterstitialListener));
        this.k = false;
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        d dVar;
        a aVar;
        this.i = newInterstitialListener;
        this.l = true;
        if (!this.h && (aVar = this.f) != null && !aVar.u()) {
            this.f.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener));
            this.l = false;
        }
        this.k = true;
        if (!this.h || (dVar = this.g) == null || dVar.d()) {
            return;
        }
        this.g.setRewardVideoListener(new NewInterstitialListenerWrapper(newInterstitialListener));
        this.k = false;
    }

    public void showFromBid() {
        if (this.h) {
            b();
            d dVar = this.g;
            if (dVar != null) {
                dVar.a("", "", "");
                return;
            }
            return;
        }
        a();
        if (this.f != null) {
            this.f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 287, this.mUnitId, false, -1));
        }
    }

    private void c() {
        a aVar;
        if (this.l) {
            a aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.i));
            }
            this.l = false;
        }
        if (this.m) {
            a aVar3 = this.f;
            if (aVar3 != null) {
                aVar3.a(this.c, this.b, this.d, this.e);
            }
            this.m = false;
        }
        if (this.o && (aVar = this.f) != null) {
            aVar.a(this.p, this.r, this.q);
            this.o = false;
        }
        a aVar4 = this.f;
        if (aVar4 != null) {
            aVar4.a(this.j);
        }
    }

    public void setIVRewardEnable(int i, double d) {
        this.p = i;
        this.q = (int) (d * 100.0d);
        this.r = com.mbridge.msdk.foundation.same.a.J;
        this.o = true;
        e();
    }

    private void b() {
        if (this.g == null) {
            c(this.f1547a, this.mUnitId);
        }
        d();
    }

    private void a() {
        if (this.f == null) {
            b(this.f1547a, this.mUnitId);
        }
        c();
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
