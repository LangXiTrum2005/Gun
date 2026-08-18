package com.mbridge.msdk.advanced.manager;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f923a = "ResManager";
    private static int b = 1;
    public static e c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f924a;
        final /* synthetic */ String b;
        final /* synthetic */ CampaignEx c;
        final /* synthetic */ MBNativeAdvancedView d;
        final /* synthetic */ long e;

        public a(String str, String str2, CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, long j) {
            this.f924a = str;
            this.b = str2;
            this.c = campaignEx;
            this.d = mBNativeAdvancedView;
            this.e = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            super.a(webView, i);
            if (i != 1) {
                this.d.setH5Ready(false);
                o0.a("WindVaneWebView", "======渲染失败");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.b, "readyState 2", this.e, 3);
                return;
            }
            com.mbridge.msdk.advanced.common.c.a(this.f924a + this.b + this.c.getRequestId(), true);
            this.d.setH5Ready(true);
            o0.a("WindVaneWebView", "======渲染成功：ready");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.b, "", this.e, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.c.isHasMBTplMark()) {
                com.mbridge.msdk.advanced.common.c.a(this.f924a + this.b + this.c.getRequestId(), true);
                this.d.setH5Ready(true);
                o0.a("WindVaneWebView", "======渲染成功：finish");
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.b, "", this.e, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.d.setH5Ready(false);
            o0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.b, AbstractC5044xl.g("error code:", i, str), this.e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.d.setH5Ready(false);
            o0.a("WindVaneWebView", "======渲染失败");
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.b, "error url:" + sslError.getUrl(), this.e, 3);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f925a;
        final /* synthetic */ String b;

        public b(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f925a = mBNativeAdvancedWebview;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f925a.loadUrl(this.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    public static CampaignEx a(MBNativeAdvancedView mBNativeAdvancedView, String str, String str2, String str3, int i, boolean z, boolean z2) {
        com.mbridge.msdk.setting.g gVarF = AbstractC3888ke0.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        long jZ = gVarF.Z() * 1000;
        long jA0 = gVarF.a0() * 1000;
        a(jA0, str2);
        List<CampaignEx> listA = a(str2, str3);
        if (listA == null || listA.size() <= 0) {
            return null;
        }
        CampaignEx campaignEx = listA.get(0);
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - jZ;
        if (!z) {
            if (campaignEx.getPlct() <= 0) {
                if (campaignEx.getPlct() <= 0) {
                }
                o0.a(f923a, "========已经超了缓存时间");
                return campaignEx.isSpareOffer(jZ, jA0) ? null : null;
            }
            if (campaignEx.getTimestamp() + (campaignEx.getPlct() * 1000) < jCurrentTimeMillis) {
                if (campaignEx.getPlct() <= 0 || campaignEx.getTimestamp() < j) {
                    o0.a(f923a, "========已经超了缓存时间");
                    if (campaignEx.isSpareOffer(jZ, jA0) && mBNativeAdvancedView != null) {
                        mBNativeAdvancedView.setVisibility(8);
                        return null;
                    }
                }
            }
            if (!a(mBNativeAdvancedView, campaignEx, str, str2, i, z2)) {
                return null;
            }
            o0.b(f923a, "cache campain is picked:" + campaignEx.getAppName());
            return a(campaignEx);
        }
        if (campaignEx.getPlct() <= 0) {
            if (campaignEx.getPlct() <= 0) {
            }
            if (!a(mBNativeAdvancedView, campaignEx, str, str2, i, z2)) {
            }
            return campaignEx.isSpareOffer(jZ, jA0) ? null : null;
        }
        if (campaignEx.getTimestamp() + (campaignEx.getPlct() * 1000) < jCurrentTimeMillis) {
            if (campaignEx.getPlct() <= 0 || campaignEx.getTimestamp() < j) {
                if (!a(mBNativeAdvancedView, campaignEx, str, str2, i, z2) && campaignEx.isSpareOffer(jZ, jA0)) {
                    return a(campaignEx);
                }
                if (campaignEx.isSpareOffer(jZ, jA0) && mBNativeAdvancedView != null) {
                    mBNativeAdvancedView.setVisibility(8);
                    return null;
                }
            }
        }
        if (!a(mBNativeAdvancedView, campaignEx, str, str2, i, z2)) {
            return null;
        }
        o0.b(f923a, "cache campain is picked:" + campaignEx.getAppName());
        return a(campaignEx);
    }

    public static void b(String str) {
        if (c == null) {
            c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        c.a(str, 0, b);
    }

    private static List<CampaignEx> a(String str, String str2) {
        if (c == null) {
            c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        return c.b(str, 0, 0, b);
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
        } else {
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
        }
        return campaignEx;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2, int i, boolean z) {
        boolean z2;
        if (campaignEx == null) {
            return false;
        }
        mBNativeAdvancedView.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            boolean zB = com.mbridge.msdk.videocommon.download.b.getInstance().b(298, str2, campaignEx.isBidCampaign());
            if (zB) {
                mBNativeAdvancedView.setVideoReady(true);
            }
            z2 = zB;
        } else {
            mBNativeAdvancedView.setVideoReady(true);
            z2 = true;
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url()) && !mBNativeAdvancedView.isEndCardReady() && !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getendcard_url()))) {
            mBNativeAdvancedView.setEndCardReady(true);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) && !mBNativeAdvancedView.isH5Ready()) {
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip());
            if (TextUtils.isEmpty(h5ResAddress)) {
                z2 = false;
            } else {
                StringBuilder sbQ = DM.q(str, str2);
                sbQ.append(campaignEx.getRequestId());
                if (com.mbridge.msdk.advanced.common.c.a(sbQ.toString())) {
                    mBNativeAdvancedView.setH5Ready(true);
                } else {
                    a(mBNativeAdvancedView, h5ResAddress, campaignEx, str, str2, i);
                    if (!z) {
                        z2 = false;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml()) && !mBNativeAdvancedView.isH5Ready()) {
            String strA = a(campaignEx.getAdHtml());
            if (TextUtils.isEmpty(strA)) {
                return false;
            }
            StringBuilder sbQ2 = DM.q(str, str2);
            sbQ2.append(campaignEx.getRequestId());
            if (com.mbridge.msdk.advanced.common.c.a(sbQ2.toString())) {
                mBNativeAdvancedView.setH5Ready(true);
                if (campaignEx.isMraid()) {
                    mBNativeAdvancedView.setVideoReady(true);
                }
                return true;
            }
            a(mBNativeAdvancedView, strA, campaignEx, str, str2, i);
            if (!z) {
                return false;
            }
        }
        return z2;
    }

    private static void a(MBNativeAdvancedView mBNativeAdvancedView, String str, CampaignEx campaignEx, String str2, String str3, int i) {
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(str3, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(i);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(bVar);
        MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
        long jCurrentTimeMillis = System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new a(str2, str3, campaignEx, mBNativeAdvancedView, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            o0.a(f923a, "======开始渲染：" + str);
            new Handler(Looper.getMainLooper()).post(new b(advancedNativeWebview, str));
            return;
        }
        mBNativeAdvancedView.setH5Ready(false);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str3, "webview had destory", jCurrentTimeMillis, 3);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return "file:///" + file.getAbsolutePath();
            }
            return "";
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public static boolean a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2) {
        boolean zA;
        boolean z = false;
        if (mBNativeAdvancedView == null) {
            o0.b(f923a, "mbAdvancedNativeView  is null");
            return false;
        }
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            zA = true;
        } else {
            zA = mBNativeAdvancedView.isVideoReady();
            o0.b(f923a, "======isReady isVideoReady:" + zA);
        }
        if (zA && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            StringBuilder sbQ = DM.q(str, str2);
            sbQ.append(campaignEx.getRequestId());
            zA = com.mbridge.msdk.advanced.common.c.a(sbQ.toString());
            o0.b(f923a, "======isReady getAdZip:" + zA);
        }
        if (zA && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            StringBuilder sbQ2 = DM.q(str, str2);
            sbQ2.append(campaignEx.getRequestId());
            zA = com.mbridge.msdk.advanced.common.c.a(sbQ2.toString());
            o0.b(f923a, "======isReady getAdHtml:" + zA);
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            o0.b(f923a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z = zA;
        }
        if (!z || TextUtils.isEmpty(campaignEx.getendcard_url())) {
            return z;
        }
        boolean zIsEndCardReady = mBNativeAdvancedView.isEndCardReady();
        o0.b(f923a, "======isReady isEndCardReady:" + zIsEndCardReady);
        return zIsEndCardReady;
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (c == null) {
            c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        c.a(arrayList, str);
    }

    public static void a(long j, String str) {
        if (c == null) {
            c = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        c.a(j, str);
    }
}
