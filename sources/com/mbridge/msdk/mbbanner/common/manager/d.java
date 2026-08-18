package com.mbridge.msdk.mbbanner.common.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2584Lw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    private N2 A;
    private C4363q1 B;
    private float E;
    private float F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.listener.c f1380a;
    private boolean b;
    protected CampaignEx c;
    protected final MBBannerView d;
    private ImageView e;
    private MBBannerWebView f;
    private ImageView g;
    private ImageView h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    protected boolean o;
    protected final String p;
    private final String q;
    private String r;
    com.mbridge.msdk.click.a t;
    private List<CampaignEx> u;
    private int x;
    private com.mbridge.msdk.mbbanner.common.communication.b z;
    private int s = -1;
    private int v = 1;
    private int w = 1;
    private final long y = MBInterstitialActivity.WEB_LOAD_TIME;
    private final Handler C = new e(Looper.getMainLooper());
    private final com.mbridge.msdk.foundation.same.task.a D = new f();
    private final View.OnClickListener G = new g();
    private com.mbridge.msdk.mbbanner.common.listener.a H = new h();
    private com.mbridge.msdk.mbsignalcommon.listener.b I = new c();

    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void showed() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void summit(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1382a;
        final /* synthetic */ CampaignEx b;

        public b(Context context, CampaignEx campaignEx) {
            this.f1382a = context;
            this.b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f1382a)).b(this.b.getId());
            } catch (Exception e) {
                o0.b("BannerShowManager", e.getMessage());
            }
        }
    }

    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            d.this.k = true;
            com.mbridge.msdk.mbbanner.common.communication.a.a(webView);
            d.this.m = true;
            CampaignEx campaignEx = d.this.c;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.p();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
            bVar.d(i + " WebView receive error: " + i + "  message : " + str);
            bVar.c(d.this.r);
            d.this.a(bVar);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            d.this.g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$d, reason: collision with other inner class name */
    public class C0183d implements com.mbridge.msdk.foundation.feedback.a {
        public C0183d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            d.this.d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void showed() {
            String string;
            d.this.d.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void summit(String str) {
            String string;
            d.this.d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                if (d.this.A != null) {
                    d dVar = d.this;
                    dVar.B = C4363q1.a(dVar.A);
                    if (d.this.B != null) {
                        d.this.B.c();
                        d.this.B.b();
                    }
                }
            } catch (Throwable th) {
                o0.a("BannerShowManager", th.getMessage());
            }
        }
    }

    public class f extends com.mbridge.msdk.foundation.same.task.a {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880045);
            bVar.c(d.this.c.getLocalRequestId());
            d.this.a(bVar);
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.o) {
                dVar.s = 1;
                d.this.b();
            }
        }
    }

    public class h implements com.mbridge.msdk.mbbanner.common.listener.a {
        public h() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void close() {
            d.this.s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void readyStatus(int i) {
            if (i != 1) {
                d.this.g();
            } else {
                d.this.p();
                d.this.a("", 1);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void toggleCloseBtn(int i) {
            if (i == 2) {
                d.this.e();
            } else {
                d.this.n();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void triggerCloseBtn(String str) {
            d.this.s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z) {
            d dVar = d.this;
            if (dVar.f1380a != null) {
                dVar.n = z;
                if (z) {
                    d.this.f1380a.a();
                } else {
                    d.this.f1380a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z, String str) {
            try {
                if (d.this.f1380a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f1380a.c();
                        d.this.f1380a.onLeaveApp();
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.c));
                        campaignWithBackData.setClickURL(str);
                        d.this.a(campaignWithBackData, z, str);
                    }
                }
            } catch (Exception e) {
                o0.b("BannerShowManager", e.getMessage());
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f != null) {
                    String str = d.this.v == 2 ? "false" : "true";
                    d.this.f.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class j implements View.OnTouchListener {
        public j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            d.this.E = motionEvent.getRawX();
            d.this.F = motionEvent.getRawY();
            o0.b("BannerShowManager", d.this.E + "  " + d.this.F);
            return false;
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.E, d.this.F), d.this.c), false, "");
        }
    }

    public class l implements com.mbridge.msdk.foundation.same.image.c {
        public l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880039);
            bVar.c(d.this.r);
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (d.this.e != null) {
                d.this.e.setImageBitmap(bitmap);
            }
            d.this.k = true;
            d.this.o();
            d.this.n();
            d.this.m();
            d dVar = d.this;
            if (dVar.o) {
                return;
            }
            dVar.p();
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.p();
        }
    }

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.listener.c cVar, String str, String str2, boolean z, com.mbridge.msdk.setting.l lVar) {
        this.b = z;
        this.d = mBBannerView;
        this.p = str2;
        this.q = str;
        this.f1380a = new com.mbridge.msdk.mbbanner.common.listener.e(cVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        MBBannerView mBBannerView;
        if (this.k && !this.l && this.f1380a != null) {
            this.l = true;
            this.C.removeCallbacks(this.D);
            CampaignEx campaignEx = this.c;
            if (campaignEx != null && !campaignEx.isCallbacked()) {
                this.c.setCallbacked(true);
                this.f1380a.a(this.u);
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c.getMaitve(), this.c.getMaitve_src());
            }
        }
        if (this.k && this.i && this.j && this.l && this.c != null && !d()) {
            boolean zA = a();
            if (!zA && (mBBannerView = this.d) != null) {
                mBBannerView.postDelayed(new m(), 1000L);
            }
            if (this.m && zA) {
                o0.b("BannerShowManager", "onBannerWebViewShow && transInfoToMraid");
                int[] iArr = new int[2];
                this.d.getLocationInWindow(iArr);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f, iArr[0], iArr[1]);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f, iArr[0], iArr[1], this.d.getWidth(), this.d.getHeight());
                this.m = false;
                this.w = 1;
                if (!TextUtils.isEmpty(this.c.getImageUrl())) {
                    com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.c.getImageUrl());
                }
                l();
            }
            o0.b("BannerShowManager", "showSuccessed:" + this.c.getId());
            if (!zA) {
                this.c.setReport(false);
                return;
            }
            ImageView imageView = this.e;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<CampaignEx> list = this.u;
                if (list != null && list.size() > 0) {
                    boolean z = false;
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.u.size(); i3++) {
                        if (!this.u.get(i3).isHasMBTplMark() && (i3 == 0 || !this.u.get(i3).isReport())) {
                            a(this.u.get(i3), com.mbridge.msdk.foundation.controller.c.n().d(), this.p);
                            this.u.get(i3).setReport(true);
                            com.mbridge.msdk.foundation.same.buffer.b.a(this.p, this.u.get(i3), "banner");
                            i2 = i3;
                            z = true;
                        }
                    }
                    if (z) {
                        b(this.u.get(i2), com.mbridge.msdk.foundation.controller.c.n().d(), this.p);
                        c(this.u.get(i2), com.mbridge.msdk.foundation.controller.c.n().d(), this.p);
                    }
                }
            } else {
                CampaignEx campaignEx2 = this.c;
                if (campaignEx2 != null) {
                    b(campaignEx2);
                    this.c.setReport(true);
                    this.w = 2;
                    com.mbridge.msdk.foundation.same.buffer.b.a(this.p, this.c, "banner");
                }
            }
            this.o = true;
            com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f1380a;
            if (cVar != null) {
                cVar.a(this.c);
            }
            try {
                CampaignEx campaignEx3 = this.c;
                if (campaignEx3 != null && campaignEx3.isActiveOm()) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    MBBannerWebView mBBannerWebView = this.f;
                    N2 n2A = com.mbridge.msdk.omsdk.b.a(contextD, mBBannerWebView, mBBannerWebView.getUrl(), this.c);
                    this.A = n2A;
                    if (n2A != null) {
                        try {
                            n2A.d(this.f);
                            ImageView imageView2 = this.g;
                            if (imageView2 != null) {
                                this.A.a(imageView2, EnumC2584Lw.b);
                            }
                            ImageView imageView3 = this.e;
                            if (imageView3 != null) {
                                this.A.a(imageView3, EnumC2584Lw.d);
                            }
                            this.A.f();
                        } catch (Exception e2) {
                            o0.a("OMSDK", e2.getMessage());
                        }
                    } else {
                        CampaignEx campaignEx4 = this.c;
                        if (campaignEx4 != null) {
                            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx4.getRequestId(), this.c.getRequestIdNotice(), this.c.getId(), this.p, "fetch OM failed, context null");
                        }
                    }
                }
            } catch (Exception unused) {
                CampaignEx campaignEx5 = this.c;
                if (campaignEx5 != null) {
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx5.getRequestId(), this.c.getRequestIdNotice(), this.c.getId(), this.p, "fetch OM failed, context null");
                }
            }
            this.C.sendEmptyMessageDelayed(1, 1000L);
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.p, this.c.getAdType());
            if (bitmapDrawableA != null) {
                if (this.h == null) {
                    this.h = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.h.getVisibility() != 0) {
                    this.h.setVisibility(0);
                }
                t0.a(this.h, bitmapDrawableA, this.d.getResources().getDisplayMetrics());
                if (this.h.getParent() == null) {
                    this.d.addView(this.h, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        }
    }

    private boolean q() {
        String strA = a(this.c);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.d != null) {
            if (this.f == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                    this.f = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.p, this.u, this.H));
                } catch (Throwable unused) {
                    a(com.mbridge.msdk.foundation.error.a.a(880029), 1);
                    return false;
                }
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f.getVisibility() != 0) {
                this.f.setVisibility(0);
            }
            if (this.f.getParent() == null) {
                this.d.addView(this.f);
                a(this.c.isMraid());
            }
            if (this.c.isMraid()) {
                m();
            }
            n();
            com.mbridge.msdk.mbbanner.common.communication.b bVar = new com.mbridge.msdk.mbbanner.common.communication.b(this.d.getContext(), this.q, this.p);
            this.z = bVar;
            bVar.a(this.u);
            this.z.a(this.H);
            this.z.a(this.x);
            this.f.setWebViewListener(this.I);
            this.f.setObject(this.z);
            this.f.loadUrl(strA);
            MBBannerWebView mBBannerWebView2 = this.f;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new i(), 1000L);
            }
        } else {
            a(com.mbridge.msdk.foundation.error.a.a(880046), 2);
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880046);
            bVar2.c(this.r);
            a(bVar2);
        }
        return true;
    }

    public void a(CampaignEx campaignEx, boolean z, String str) {
        throw null;
    }

    private synchronized boolean d() {
        boolean zIsReport;
        zIsReport = this.c.isReport();
        if (!zIsReport) {
            this.c.setReport(true);
        }
        return zIsReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView;
        if (this.b && (imageView = this.g) != null && imageView.getVisibility() == 0) {
            this.g.setVisibility(8);
            this.g.setOnClickListener(null);
            if (this.d == null || this.g.getParent() == null) {
                return;
            }
            this.d.removeView(this.g);
        }
    }

    private void f() {
        if (this.b && this.g == null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.g = imageView;
            imageView.setBackgroundResource(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_banner_close", "drawable"));
            this.g.setVisibility(8);
            this.g.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void g() {
        if (this.d == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880046);
            bVar.c(this.r);
            a(bVar);
            return;
        }
        MBBannerWebView mBBannerWebView = this.f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.d.removeView(this.f);
        }
        if (this.e == null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.e = imageView;
            imageView.setOnTouchListener(new j());
            this.e.setOnClickListener(new k());
        }
        String imageUrl = this.c.getImageUrl();
        if (!TextUtils.isEmpty(imageUrl)) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(imageUrl, new l());
            return;
        }
        com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880047);
        bVar2.c(this.r);
        a(bVar2);
    }

    private void i() {
        N2 n2 = this.A;
        if (n2 != null) {
            n2.c();
            this.A = null;
            o0.a("omsdk", " adSession.finish() ");
        }
    }

    private void j() {
        try {
            CampaignEx campaignEx = this.c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.p, campaignEx.getLocalRequestId());
                cVarA.g(this.w);
                cVarA.b(true);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000152", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th) {
            o0.b("BannerShowManager", th.getMessage());
        }
    }

    private void k() {
        try {
            CampaignEx campaignEx = this.c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.p, campaignEx.getLocalRequestId());
                cVarA.g(this.w);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("close_click_type", Integer.valueOf(this.s));
                eVar.a(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(this.c.getCreativeId()));
                com.mbridge.msdk.mbbanner.common.report.a.a("2000069", cVarA, eVar);
            }
        } catch (Throwable th) {
            o0.b("BannerShowManager", th.getMessage());
        }
    }

    private void l() {
        try {
            CampaignEx campaignEx = this.c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.p, campaignEx.getLocalRequestId());
                cVarA.g(this.w);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000133", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th) {
            o0.b("BannerShowManager", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.d == null) {
            return;
        }
        CampaignEx campaignEx = this.c;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
            mBAdChoice.setCampaign(this.c);
            mBAdChoice.setFeedbackDialogEventListener(new a());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC3950lJ.j(6.0f), AbstractC3950lJ.j(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.d.addView(mBAdChoice, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ImageView imageView;
        if (!this.b || (imageView = this.g) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.g.setVisibility(0);
            this.g.setOnClickListener(this.G);
        }
        if (this.g.getParent() != null || this.d == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC3950lJ.j(12.0f), AbstractC3950lJ.j(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.d.addView(this.g, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.e != null) {
            MBBannerWebView mBBannerWebView = this.f;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(0);
            }
            this.w = 2;
            if (this.d != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.e.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.e.getParent() == null) {
                    this.d.addView(this.e, layoutParams);
                }
                a(true);
            }
        }
    }

    public void h() {
        i();
        com.mbridge.msdk.mbbanner.common.report.a.a(this.c, this.p);
        if (this.f1380a != null) {
            this.f1380a = null;
        }
        MBBannerWebView mBBannerWebView = this.f;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.I != null) {
            this.I = null;
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.d;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.b bVar = this.z;
        if (bVar != null) {
            bVar.a();
        }
        if (this.H != null) {
            this.H = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.p);
        com.mbridge.msdk.mbbanner.common.report.a.a(this.p);
    }

    public void c(boolean z) {
        this.b = z;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                }
            } catch (Throwable th) {
                o0.b("BannerShowManager", th.getMessage());
            }
        }
    }

    public void b(CampaignUnit campaignUnit) {
        CampaignEx campaignExA = a(campaignUnit);
        this.c = campaignExA;
        if (campaignExA == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880043);
            bVar.c(this.r);
            a(bVar);
            return;
        }
        this.C.removeCallbacks(this.D);
        f();
        this.k = false;
        this.l = false;
        this.o = false;
        if (!TextUtils.isEmpty(this.c.getBannerHtml()) || !TextUtils.isEmpty(this.c.getBannerUrl())) {
            com.mbridge.msdk.mbbanner.common.report.a.a(this.p, this.c);
        }
        this.C.postDelayed(this.D, MBInterstitialActivity.WEB_LOAD_TIME);
        if (q()) {
            return;
        }
        if (!TextUtils.isEmpty(this.c.getBannerHtml()) || !TextUtils.isEmpty(this.c.getBannerUrl())) {
            a(com.mbridge.msdk.foundation.error.a.a(880048), 2);
        }
        g();
    }

    public void d(boolean z) {
        this.j = z;
        p();
    }

    public void a(boolean z, int i2) {
        this.x = i2;
        if (i2 != 0) {
            this.b = z;
            return;
        }
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.p);
        if (lVarE != null) {
            this.b = lVarE.g() == 1;
        }
    }

    public int c() {
        return this.w;
    }

    private CampaignEx a(CampaignUnit campaignUnit) {
        if (campaignUnit != null) {
            ArrayList<CampaignEx> ads = campaignUnit.getAds();
            this.u = ads;
            if (ads != null && ads.size() > 0) {
                return this.u.get(0);
            }
        }
        return null;
    }

    private String a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            String bannerUrl = campaignEx.getBannerUrl();
            if (!TextUtils.isEmpty(bannerUrl)) {
                return bannerUrl;
            }
            String bannerHtml = campaignEx.getBannerHtml();
            File file = new File(bannerHtml);
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                return bannerHtml;
            }
            return "file:////" + bannerHtml;
        } catch (Throwable th) {
            o0.b("BannerShowManager", th.getMessage());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        k();
        MBBannerWebView mBBannerWebView = this.f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.d.removeView(this.f);
        }
        ImageView imageView = this.e;
        if (imageView != null && imageView.getParent() != null) {
            this.e.setVisibility(8);
            this.d.removeView(this.e);
        }
        ImageView imageView2 = this.g;
        if (imageView2 != null && imageView2.getParent() != null) {
            this.d.removeView(this.g);
            this.g.setVisibility(8);
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.p);
        ImageView imageView3 = this.h;
        if (imageView3 != null && imageView3.getParent() != null) {
            this.d.removeView(this.h);
            this.h.setVisibility(8);
        }
        BannerUtils.inserCloseId(this.p, this.u);
        j();
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f1380a;
        if (cVar != null) {
            cVar.b();
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        if (this.c == null || d()) {
            return;
        }
        this.C.removeCallbacks(this.D);
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f1380a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    private boolean a() {
        if (this.d == null) {
            return false;
        }
        CampaignEx campaignEx = this.c;
        return (b1.a(this.d, campaignEx != null ? campaignEx.getImpReportType() : 0) || this.n) ? false : true;
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new b(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().k() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().k(), false, false);
    }

    public void b(boolean z) {
        this.i = z;
        p();
    }

    public void a(int i2, int i3, int i4, int i5) {
        if (i2 == i4 && i3 == i5) {
            return;
        }
        com.mbridge.msdk.mbbanner.common.communication.a.a((WebView) this.f, i2, i3);
    }

    private void a(boolean z) {
        if (this.d != null) {
            View viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.p);
            if (com.mbridge.msdk.foundation.feedback.b.b().a() && z && viewA != null) {
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
                viewA.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.e, com.mbridge.msdk.foundation.feedback.b.d);
                }
                layoutParams.addRule(12);
                viewA.setLayoutParams(layoutParams);
                this.d.addView(viewA);
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(this.p, new C0183d());
            this.c.setCampaignUnitId(this.p);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.p, this.c);
        }
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.p);
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.p);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.p);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.n);
            } catch (Throwable th) {
                o0.b("BannerShowManager", th.getMessage());
            }
        }
    }

    public void a(String str) {
        this.r = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2) {
        try {
            CampaignEx campaignEx = this.c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.p, campaignEx.getLocalRequestId());
                cVarA.g(this.w);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", Integer.valueOf(i2));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                eVar.a("reason", str);
                cVarA.d(TextUtils.isEmpty(this.c.getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000068", cVarA, eVar);
            }
        } catch (Throwable th) {
            o0.b("BannerShowManager", th.getMessage());
        }
    }
}
