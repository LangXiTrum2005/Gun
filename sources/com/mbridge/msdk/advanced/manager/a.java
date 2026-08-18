package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.out.MBridgeIds;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    protected CampaignEx b;
    protected MBNativeAdvancedView c;
    protected com.mbridge.msdk.advanced.middle.d d;
    protected com.mbridge.msdk.click.a e;
    private com.mbridge.msdk.advanced.middle.c f;
    private boolean g;
    private ImageView i;
    protected String j;
    private String k;
    protected MBridgeIds l;
    private boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f896a = "NativeAdvancedShowManager";
    private int h = -1;
    private View.OnClickListener n = new ViewOnClickListenerC0147a();
    public Handler o = new b(Looper.getMainLooper());
    private com.mbridge.msdk.advanced.middle.a p = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0147a implements View.OnClickListener {
        public ViewOnClickListenerC0147a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.g) {
                a.this.a(1);
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            CampaignEx campaignEx;
            MBNativeAdvancedView mBNativeAdvancedView;
            MBNativeAdvancedWebview advancedNativeWebview;
            super.handleMessage(message);
            if (message.what != 2 || (campaignEx = a.this.b) == null || !campaignEx.isActiveOm() || (mBNativeAdvancedView = a.this.c) == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null) {
                return;
            }
            try {
                N2 adSession = advancedNativeWebview.getAdSession();
                if (adSession != null) {
                    C4363q1 c4363q1A = C4363q1.a(adSession);
                    c4363q1A.c();
                    c4363q1A.b();
                    o0.a("OMSDK", "adSession.impressionOccurred()");
                }
            } catch (Throwable th) {
                o0.a("OMSDK", th.getMessage());
                CampaignEx campaignEx2 = a.this.b;
                if (campaignEx2 != null) {
                    new h(advancedNativeWebview.getContext()).a(campaignEx2.getRequestId(), a.this.b.getRequestIdNotice(), a.this.b.getId(), a.this.j, AbstractC3888ke0.l(th, new StringBuilder("fetch OM failed, exception")));
                }
            }
        }
    }

    public class c implements com.mbridge.msdk.advanced.middle.a {
        public c() {
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(CampaignEx campaignEx) {
            a.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void close() {
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void toggleCloseBtn(int i) {
            a.this.h = i;
            MBNativeAdvancedView mBNativeAdvancedView = a.this.c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.changeCloseBtnState(i);
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            MBNativeAdvancedView mBNativeAdvancedView = a.this.c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.setVisibility(8);
            }
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(int i) {
            o0.b(a.this.f896a, "resetCountdown" + i);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z) {
            a aVar = a.this;
            if (aVar.d != null) {
                aVar.m = z;
                if (z) {
                    a aVar2 = a.this;
                    aVar2.d.f(aVar2.l);
                } else {
                    a aVar3 = a.this;
                    aVar3.d.a(aVar3.l);
                }
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z, String str) {
            try {
                if (a.this.d != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.d.b(aVar.l);
                        a aVar2 = a.this;
                        aVar2.d.d(aVar2.l);
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(a.this.b));
                        campaignWithBackData.setClickURL(str);
                        a.this.a(campaignWithBackData, z, str);
                    }
                }
            } catch (Exception e) {
                o0.b(a.this.f896a, e.getMessage());
            }
        }
    }

    public class d implements com.mbridge.msdk.foundation.feedback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f900a;

        public d(MBNativeAdvancedView mBNativeAdvancedView) {
            this.f900a = mBNativeAdvancedView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b(a.this.f896a, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f900a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void showed() {
            String string;
            a.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b(a.this.f896a, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f900a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void summit(String str) {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                o0.b(a.this.f896a, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f900a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f901a;
        final /* synthetic */ MBNativeAdvancedView b;

        public e(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView) {
            this.f901a = campaignEx;
            this.b = mBNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f901a, this.b, false);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f902a;
        final /* synthetic */ CampaignEx b;

        public f(Context context, CampaignEx campaignEx) {
            this.f902a = context;
            this.b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f902a)).b(this.b.getId());
            } catch (Exception unused) {
                o0.b(a.this.f896a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.j = str2;
        this.k = str;
        this.l = new MBridgeIds(str, str2);
        if (this.i == null) {
            ImageView imageView = new ImageView(context);
            this.i = imageView;
            imageView.setPadding(t0.a(context, 2.0f), t0.a(context, 2.0f), t0.a(context, 2.0f), t0.a(context, 2.0f));
            d();
        }
    }

    private void d() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(t0.a(contextD, 29.0f), t0.a(contextD, 16.0f));
        }
        this.i.setLayoutParams(layoutParams);
        this.i.setImageResource(contextD.getResources().getIdentifier("mbridge_native_advanced_close_icon", "drawable", com.mbridge.msdk.foundation.controller.c.n().h()));
    }

    private void h() {
        if (this.b.isReport()) {
            return;
        }
        a(this.b);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.b, this.j);
        com.mbridge.msdk.advanced.middle.d dVar = this.d;
        if (dVar != null) {
            dVar.e(this.l);
        }
    }

    public void a(CampaignEx campaignEx, boolean z, String str) {
        throw null;
    }

    public String c() {
        CampaignEx campaignEx = this.b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.b.getRequestId();
    }

    public void e() {
        MBNativeAdvancedWebview advancedNativeWebview;
        MBNativeAdvancedView mBNativeAdvancedView = this.c;
        if (mBNativeAdvancedView == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) advancedNativeWebview, "onViewDisappeared", "");
    }

    public void f() {
        MBNativeAdvancedWebview advancedNativeWebview;
        if (this.c == null || com.mbridge.msdk.foundation.feedback.b.f || (advancedNativeWebview = this.c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.advanced.signal.a.a(advancedNativeWebview, "onViewAppeared", "");
    }

    public void g() {
        if (this.d != null) {
            this.d = null;
        }
        if (this.p != null) {
            this.p = null;
        }
        if (this.n != null) {
            this.n = null;
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.c;
        if (mBNativeAdvancedView != null) {
            MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
            this.c.destroy();
        }
        if (this.f != null) {
            this.f = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.j);
    }

    public com.mbridge.msdk.advanced.middle.a b() {
        return this.p;
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.n);
            } catch (Throwable th) {
                o0.b(this.f896a, th.getMessage());
            }
        }
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
                o0.b(this.f896a, th.getMessage());
            }
        }
    }

    public void a(com.mbridge.msdk.advanced.middle.c cVar) {
        this.f = cVar;
    }

    public void a(com.mbridge.msdk.advanced.middle.d dVar) {
        this.d = dVar;
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public void a(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, boolean z) {
        MBNativeAdvancedWebview advancedNativeWebview;
        View viewA;
        RelativeLayout.LayoutParams layoutParams;
        if (mBNativeAdvancedView == null) {
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.j, new d(mBNativeAdvancedView));
        if (campaignEx.isMraid() && com.mbridge.msdk.foundation.feedback.b.b().a() && (viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.j)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
            } catch (Exception e2) {
                e2.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.e, com.mbridge.msdk.foundation.feedback.b.d);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewA);
            }
            mBNativeAdvancedView.addView(viewA, layoutParams);
        }
        a(this.g);
        this.b = campaignEx;
        this.c = mBNativeAdvancedView;
        com.mbridge.msdk.advanced.signal.b advancedNativeSignalCommunicationImpl = mBNativeAdvancedView.getAdvancedNativeSignalCommunicationImpl();
        com.mbridge.msdk.advanced.signal.b bVar = advancedNativeSignalCommunicationImpl;
        if (advancedNativeSignalCommunicationImpl == null) {
            com.mbridge.msdk.advanced.signal.b bVar2 = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), this.k, this.j);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            bVar2.a(arrayList);
            bVar = bVar2;
        }
        bVar.a(this.g ? 1 : 0);
        bVar.a(this.p);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(bVar);
        if (campaignEx.isHasMBTplMark() || !this.g) {
            this.i.setVisibility(8);
        }
        a(this.i);
        mBNativeAdvancedView.setCloseView(this.i);
        if (mBNativeAdvancedView.getVisibility() != 0) {
            mBNativeAdvancedView.setVisibility(0);
        }
        boolean zA = b1.a(mBNativeAdvancedView.getAdvancedNativeWebview(), 0);
        com.mbridge.msdk.advanced.middle.c cVar = this.f;
        if (cVar == null || zA || cVar.d() == null || this.f.d().getAlpha() < 0.5f || this.f.d().getVisibility() != 0 || this.m) {
            if (z) {
                mBNativeAdvancedView.postDelayed(new e(campaignEx, mBNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        mBNativeAdvancedView.show();
        com.mbridge.msdk.foundation.controller.c.n().a(mBNativeAdvancedView.getContext());
        campaignEx.setCampaignUnitId(this.j);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.j, campaignEx);
        CampaignEx campaignEx2 = this.b;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) != null) {
            try {
                N2 n2A = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), advancedNativeWebview, advancedNativeWebview.getUrl(), this.b);
                if (n2A != null) {
                    advancedNativeWebview.setAdSession(n2A);
                    n2A.d(advancedNativeWebview);
                    n2A.f();
                    o0.a("OMSDK", "adSession.start()");
                }
            } catch (Throwable th) {
                o0.a("OMSDK", th.getMessage());
                CampaignEx campaignEx3 = this.b;
                if (campaignEx3 != null) {
                    new h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx3.getRequestId(), this.b.getRequestIdNotice(), this.b.getId(), this.j, AbstractC3888ke0.l(th, new StringBuilder("fetch OM failed, exception")));
                }
            }
        }
        h();
        int i = this.h;
        if (i != -1) {
            mBNativeAdvancedView.changeCloseBtnState(i);
        }
        com.mbridge.msdk.advanced.manager.d.b(this.j);
        com.mbridge.msdk.advanced.common.c.b(this.k + this.j + campaignEx.getRequestId());
        this.o.sendEmptyMessageDelayed(2, 1000L);
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.b.getMaitve(), this.b.getMaitve_src());
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.j);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.j, campaignEx, "h5_native");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.j);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.j);
    }

    public void a(boolean z) {
        this.g = z;
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        com.mbridge.msdk.advanced.middle.d dVar = this.d;
        if (dVar != null) {
            dVar.c(this.l);
            this.d = null;
            com.mbridge.msdk.advanced.report.a.a(this.j, this.b);
        }
        com.mbridge.msdk.advanced.report.a.a(this.j, i, this.b);
        MBNativeAdvancedView mBNativeAdvancedView = this.c;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.setVisibility(8);
            e();
            MBNativeAdvancedWebview advancedNativeWebview = this.c.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
        }
        Handler handler = this.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new f(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().k() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().k(), false, false);
    }
}
