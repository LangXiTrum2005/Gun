package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.w;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.out.MBridgeIds;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static String z = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f903a;
    private String b;
    private long c;
    private com.mbridge.msdk.advanced.middle.b d;
    private MBNativeAdvancedView f;
    private com.mbridge.msdk.setting.l g;
    private List<CampaignEx> h;
    private CampaignEx i;
    private int j;
    private int k;
    private int l;
    private int m;
    private String n;
    private int o;
    private boolean p;
    private volatile boolean q;
    private com.mbridge.msdk.videocommon.listener.a r;
    private H5DownLoadManager.ZipDownloadListener s;
    private H5DownLoadManager.ZipDownloadListener t;
    private String u;
    private int v;
    private String w = "";
    private Handler x = new e(Looper.getMainLooper());
    private Runnable y = new f();
    private Context e = com.mbridge.msdk.foundation.controller.c.n().d();

    public class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f904a;
        final /* synthetic */ int b;

        public a(CampaignEx campaignEx, int i) {
            this.f904a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            o0.a(b.z, "zip 下载失败： " + str2 + " " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f904a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            b.this.x.sendMessage(messageObtain);
            b.this.a(this.f904a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            o0.a(b.z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f904a;
            messageObtain.arg1 = this.b;
            b.this.x.sendMessage(messageObtain);
            if (z) {
                return;
            }
            b.this.a(this.f904a, str, true, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$b, reason: collision with other inner class name */
    public class C0148b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f905a;
        final /* synthetic */ int b;
        final /* synthetic */ long c;

        public C0148b(CampaignEx campaignEx, int i, long j) {
            this.f905a = campaignEx;
            this.b = i;
            this.c = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) throws Throwable {
            super.a(webView, i);
            o0.b("NativeAdvancedLoadManager", "=========readyState: " + i);
            if (i != 1) {
                b.this.a(this.f905a, "readyState 2", this.b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f905a, b.this.f903a, "readyState 2", this.c, 3);
                return;
            }
            b.this.f.setH5Ready(true);
            com.mbridge.msdk.advanced.common.c.a(b.this.b + b.this.f903a + this.f905a.getRequestId(), true);
            b.this.h(this.f905a, this.b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f905a, b.this.f903a, "", this.c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            o0.b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f905a.isHasMBTplMark()) {
                b.this.f.setH5Ready(true);
                o0.b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                com.mbridge.msdk.advanced.common.c.a(b.this.b + b.this.f903a + this.f905a.getRequestId(), true);
                b.this.h(this.f905a, this.b);
                com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f905a, b.this.f903a, "", this.c, 1);
            }
            com.mbridge.msdk.advanced.signal.a.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) throws Throwable {
            super.onReceivedError(webView, i, str, str2);
            o0.b("NativeAdvancedLoadManager", "onReceivedError： " + i + "  " + str + "  " + str2);
            b.this.a(this.f905a, str, this.b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f905a, b.this.f903a, AbstractC5044xl.g("error code:", i, str), this.c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            o0.b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            b.this.a(this.f905a, "onReceivedSslError:" + sslError.getUrl(), this.b);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f905a, b.this.f903a, "error url:" + sslError.getUrl(), this.c, 3);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedWebview f906a;
        final /* synthetic */ String b;

        public c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f906a = mBNativeAdvancedWebview;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f906a.loadUrl(this.b);
        }
    }

    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            int i;
            Object obj;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                Object obj2 = message.obj;
                int i3 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                b.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i3);
                return;
            }
            if (i2 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i4 = ((Bundle) obj3).getInt("type");
                        if (i4 == 1) {
                            i = 880004;
                        } else if (i4 == 2) {
                            i = 880007;
                        } else {
                            i = i4 == 3 ? 880006 : 880024;
                        }
                        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        bVar.d(string);
                        bVar.a(campaignEx2);
                        b bVar2 = b.this;
                        bVar2.a(bVar, bVar2.n, b.this.o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880000);
                    bVar3.a((Throwable) e);
                    b bVar4 = b.this;
                    bVar4.a(bVar3, bVar4.n, b.this.o, (CampaignEx) null);
                    return;
                }
            }
            if (i2 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                b bVar5 = b.this;
                bVar5.i((CampaignEx) obj4, bVar5.o);
                return;
            }
            if (i2 != 4) {
                if (i2 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (b.this.f != null) {
                        b.this.f.setVideoReady(true);
                    }
                    b bVar6 = b.this;
                    bVar6.i((CampaignEx) obj, bVar6.o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (b.this.f != null) {
                b.this.f.setEndCardReady(true);
            }
            b bVar7 = b.this;
            bVar7.i((CampaignEx) obj5, bVar7.o);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            b bVar2 = b.this;
            bVar2.a(bVar, bVar2.n, b.this.o, (CampaignEx) null);
        }
    }

    public class g extends com.mbridge.msdk.advanced.request.b {
        final /* synthetic */ String e;
        final /* synthetic */ int f;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f910a;
            final /* synthetic */ int b;
            final /* synthetic */ CampaignUnit c;

            public a(Exception exc, int i, CampaignUnit campaignUnit) {
                this.f910a = exc;
                this.b = i;
                this.c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) this.f910a);
                g gVar = g.this;
                b bVar2 = b.this;
                String str = gVar.e;
                int i = this.b;
                CampaignUnit campaignUnit = this.c;
                bVar2.a(bVar, str, i, (campaignUnit == null || campaignUnit.getAds() == null || this.c.getAds().size() == 0) ? null : this.c.getAds().get(0));
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g$b, reason: collision with other inner class name */
        public class RunnableC0149b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f911a;

            public RunnableC0149b(String str) {
                this.f911a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
                bVar.d(this.f911a);
                g gVar = g.this;
                b.this.a(bVar, gVar.e, gVar.f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, String str, int i2) {
            super(i);
            this.e = str;
            this.f = i2;
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void a(CampaignUnit campaignUnit, int i) throws Throwable {
            try {
                b bVar = b.this;
                bVar.a(campaignUnit, i, bVar.f903a, this.e);
                b.this.w = campaignUnit.getRequestId();
                b.this.h = campaignUnit.getAds();
            } catch (Exception e) {
                o0.b(b.z, e.getMessage());
                o0.c(b.z, "onLoadCompaginSuccess 数据刚请求失败");
                if (b.this.x != null) {
                    b.this.x.post(new a(e, i, campaignUnit));
                }
                b.this.f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.b
        public void b(int i, String str) {
            o0.b(b.z, str);
            o0.c(b.z, "onLoadCompaginFailed load failed errorCode:" + i + " msg:" + str);
            if (b.this.x != null) {
                b.this.x.post(new RunnableC0149b(str));
            }
            b.this.f();
        }
    }

    public class h extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f912a;

        public h(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f912a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.advanced.report.a.a(str, cVar, this.f912a, b.this.e, null);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f913a;

        public i(CampaignEx campaignEx) {
            this.f913a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(b.this.e)).a();
            w.a(b.this.e, this.f913a);
        }
    }

    public class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f914a;
        final /* synthetic */ int b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f914a, jVar.b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j$b, reason: collision with other inner class name */
        public class RunnableC0150b implements Runnable {
            public RunnableC0150b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                b.this.i(jVar.f914a, jVar.b);
            }
        }

        public j(CampaignEx campaignEx, int i) {
            this.f914a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            AbstractC3888ke0.s("gifurl 下载失败： ", str2, b.z);
            if (b.this.x != null) {
                b.this.x.post(new RunnableC0150b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            AbstractC3888ke0.s("giturl 下载成功： ", str, b.z);
            if (b.this.x != null) {
                b.this.x.post(new a());
            }
        }
    }

    public class k implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f917a;
        final /* synthetic */ int b;

        public k(CampaignEx campaignEx, int i) {
            this.f917a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            AbstractC3888ke0.s("endcard 下载失败： ", str2, b.z);
            if (b.this.f != null) {
                b.this.f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f917a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            b.this.x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            AbstractC3888ke0.s("endcard 下载成功： ", str, b.z);
            if (b.this.x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f917a;
                messageObtain.arg1 = this.b;
                b.this.x.sendMessage(messageObtain);
            }
        }
    }

    public class l implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f918a;
        final /* synthetic */ int b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f918a, lVar.b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l$b, reason: collision with other inner class name */
        public class RunnableC0151b implements Runnable {
            public RunnableC0151b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                b.this.i(lVar.f918a, lVar.b);
            }
        }

        public l(CampaignEx campaignEx, int i) {
            this.f918a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            AbstractC3888ke0.s("image 下载失败： ", str2, b.z);
            if (b.this.x != null) {
                b.this.x.post(new RunnableC0151b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            AbstractC3888ke0.s("image 下载成功： ", str, b.z);
            if (b.this.x != null) {
                b.this.x.post(new a());
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f921a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ int c;

        public m(File file, CampaignEx campaignEx, int i) {
            this.f921a = file;
            this.b = campaignEx;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.a("file:////" + this.f921a.getAbsolutePath(), this.b, this.c);
        }
    }

    public b(String str, String str2, long j2) {
        this.b = str;
        this.f903a = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CampaignEx campaignEx, int i2) {
        if (!com.mbridge.msdk.advanced.manager.d.a(this.f, campaignEx, this.b, this.f903a) || this.q) {
            return;
        }
        b();
        com.mbridge.msdk.advanced.manager.d.a(campaignEx, this.f903a);
        this.q = true;
        com.mbridge.msdk.advanced.middle.b bVar = this.d;
        if (bVar != null) {
            bVar.a(campaignEx, i2);
        }
    }

    private void j(CampaignEx campaignEx, int i2) throws Throwable {
        this.i = campaignEx;
        if (com.mbridge.msdk.advanced.manager.d.a(this.f, campaignEx, this.b, this.f903a)) {
            i(campaignEx, i2);
        } else {
            e(campaignEx, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.v = 0;
    }

    private void g() {
        try {
            int i2 = this.v + 1;
            this.v = i2;
            com.mbridge.msdk.setting.l lVar = this.g;
            if (lVar == null || i2 > lVar.y()) {
                o0.c(z, "onload 重置offset为0");
                this.v = 0;
            }
            o0.c(z, "onload 算出 下次的offset是:" + this.v);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i2) {
        if (this.f.isH5Ready()) {
            i(campaignEx, i2);
            com.mbridge.msdk.advanced.report.a.a(1, "", this.f903a, campaignEx);
        }
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.h);
    }

    public String d() {
        return this.w;
    }

    public void e() {
        if (this.d != null) {
            this.d = null;
        }
        if (this.r != null) {
            this.r = null;
        }
        if (this.s != null) {
            this.s = null;
        }
    }

    private void c(CampaignEx campaignEx, int i2) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl(), new l(campaignEx, i2));
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5 A[Catch: all -> 0x00a9, Exception -> 0x0120, TRY_ENTER, TryCatch #5 {all -> 0x00a9, blocks: (B:68:0x0120, B:44:0x00c5, B:46:0x00c9, B:48:0x00cf, B:50:0x00d5, B:52:0x00db, B:54:0x00ed, B:55:0x00f6, B:33:0x00a5), top: B:81:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x012c A[Catch: IOException -> 0x0112, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0112, blocks: (B:70:0x012c, B:57:0x010e), top: B:86:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void d(CampaignEx campaignEx, int i2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream3 = null;
        fileOutputStream3 = null;
        fileOutputStream3 = null;
        fileOutputStream3 = null;
        File file2 = null;
        FileOutputStream fileOutputStream4 = null;
        FileOutputStream fileOutputStream5 = null;
        try {
            try {
                try {
                    try {
                        try {
                            File file3 = new File(campaignEx.getAdHtml());
                            try {
                                if (file3.exists()) {
                                    file = file3;
                                } else {
                                    String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                    String md5 = SameMD5.getMD5(z0.b(campaignEx.getAdHtml()));
                                    if (TextUtils.isEmpty(md5)) {
                                        md5 = String.valueOf(System.currentTimeMillis());
                                    }
                                    file = new File(strB, md5.concat(".html"));
                                    try {
                                        if (!file.exists()) {
                                            fileOutputStream = new FileOutputStream(file);
                                            try {
                                                String strT = AbstractC2995aW.T(MBridgeConstans.OMID_JS_SERVICE_CONTENT, "<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx.getAdHtml());
                                                if (campaignEx.isActiveOm()) {
                                                    strT = com.mbridge.msdk.omsdk.b.a(strT);
                                                }
                                                fileOutputStream.write(strT.getBytes());
                                                fileOutputStream.flush();
                                                fileOutputStream3 = fileOutputStream;
                                            } catch (Exception e2) {
                                                e = e2;
                                                fileOutputStream3 = fileOutputStream;
                                                file3 = file;
                                                e.printStackTrace();
                                                campaignEx.setMraid("");
                                                com.mbridge.msdk.foundation.same.report.g.a(campaignEx, e.getMessage(), this.f903a, "8");
                                                if (fileOutputStream3 != null) {
                                                    fileOutputStream3.close();
                                                }
                                                file = file3;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Exception unused) {
                                                        fileOutputStream5 = fileOutputStream;
                                                        a(new com.mbridge.msdk.foundation.error.b(880013), this.n, i2, campaignEx);
                                                        if (fileOutputStream5 == null) {
                                                            fileOutputStream5.close();
                                                        }
                                                        return;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        fileOutputStream4 = fileOutputStream;
                                                        if (fileOutputStream4 != null) {
                                                            try {
                                                                fileOutputStream4.close();
                                                            } catch (IOException e3) {
                                                                o0.b(z, e3.getMessage());
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                }
                                try {
                                    com.mbridge.msdk.foundation.same.report.g.a(campaignEx, "", this.f903a, "8");
                                    if (fileOutputStream3 != null) {
                                        fileOutputStream3.close();
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    fileOutputStream2 = fileOutputStream3;
                                    file2 = file;
                                    file3 = file2;
                                    fileOutputStream3 = fileOutputStream2;
                                    e.printStackTrace();
                                    campaignEx.setMraid("");
                                    com.mbridge.msdk.foundation.same.report.g.a(campaignEx, e.getMessage(), this.f903a, "8");
                                    if (fileOutputStream3 != null) {
                                        fileOutputStream3.close();
                                    }
                                    file = file3;
                                }
                            } catch (Exception e6) {
                                e = e6;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream3;
                        }
                    } catch (Exception unused2) {
                        a(new com.mbridge.msdk.foundation.error.b(880013), this.n, i2, campaignEx);
                        if (fileOutputStream5 == null) {
                            return;
                        } else {
                            fileOutputStream5.close();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (fileOutputStream4 != null) {
                        fileOutputStream4.close();
                    }
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                fileOutputStream2 = null;
            }
            if (file.exists() && file.isFile() && file.canRead()) {
                campaignEx.setAdHtml(file.getAbsolutePath());
                o0.a(z, "开始渲染 HTML： ");
                Handler handler = this.x;
                if (handler != null) {
                    handler.post(new m(file, campaignEx, i2));
                }
            } else {
                o0.a(z, "渲染 HTML 失败： html file write failed");
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880013);
                a(bVar, this.n, i2, campaignEx);
                a(bVar, this.n, i2, campaignEx);
            }
            if (fileOutputStream3 != null) {
                fileOutputStream3.close();
            }
        } catch (IOException e8) {
            o0.b(z, e8.getMessage());
        }
    }

    private void f(CampaignEx campaignEx, int i2) {
        this.r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.e, this.f903a, copyOnWriteArrayList, 298, this.r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(298, this.f903a, campaignEx.isBidCampaign())) {
            o0.a(z, " load Video");
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f903a);
        } else {
            o0.a(z, " load Video isReady true");
            this.f.setVideoReady(true);
            i(campaignEx, i2);
        }
    }

    public void b(String str, int i2) throws Throwable {
        CampaignEx campaignExA;
        List<Integer> listC;
        this.q = false;
        this.n = str;
        this.o = i2;
        this.i = null;
        if (this.f == null) {
            a(new com.mbridge.msdk.foundation.error.b(880030), str, i2, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f, this.b, this.f903a, str, this.j, false, false);
        } else {
            campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f, this.b, this.f903a, str, this.j, false, true);
        }
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        com.mbridge.msdk.setting.l lVar = this.g;
        if (lVar != null && lVar.t() == 1 && this.f != null && campaignExA != null) {
            j(campaignExA, i2);
            return;
        }
        this.p = false;
        com.mbridge.msdk.setting.l lVar2 = this.g;
        if (lVar2 != null && (listC = lVar2.c()) != null && listC.size() > 0) {
            this.c = listC.get(0).intValue() * 1000;
        } else {
            this.c = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        }
        o0.a(z, "开始从V3请求新的 offer，超时 ：" + this.c);
        if (this.g == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.c);
            a(this.e, str, i2);
        } else if (System.currentTimeMillis() - timestamp > this.g.v() * 1000) {
            a(this.c);
            a(this.e, str, i2);
        } else {
            j(campaignExA, i2);
        }
    }

    public class d implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f907a;

        public d(CampaignEx campaignEx) {
            this.f907a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            o0.a(b.z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f907a;
            messageObtain.what = 5;
            b.this.x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            o0.a(b.z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f907a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.x.sendMessage(messageObtain);
        }
    }

    private void e(CampaignEx campaignEx, int i2) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            o0.a(z, "开始下载zip： " + campaignEx.getAdZip());
            g(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            o0.a(z, "开始下载HTML： " + campaignEx.getAdHtml());
            d(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            o0.a(z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            f(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            o0.a(z, "开始下载image： " + campaignEx.getImageUrl());
            c(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            o0.a(z, "开始下载EndCard： " + campaignEx.getendcard_url());
            a(campaignEx, i2);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        o0.a(z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        b(campaignEx, i2);
    }

    private void g(CampaignEx campaignEx, int i2) {
        String adZip;
        this.s = new a(campaignEx, i2);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        int i3 = 0;
        if (campaignEx != null) {
            i3 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        cVar.f(i3);
        cVar.e(2);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, adZip, this.s);
    }

    public void a(com.mbridge.msdk.setting.l lVar) {
        this.g = lVar;
    }

    public void a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f = mBNativeAdvancedView;
    }

    public void a(int i2) {
        this.j = i2;
    }

    public void a(int i2, int i3) {
        this.m = i2;
        this.l = i3;
    }

    private void a(long j2) {
        this.x.postDelayed(this.y, j2);
    }

    private void a(Context context, String str, int i2) throws Throwable {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i2, (CampaignEx) null);
                return;
            }
            if (y0.a(this.f903a)) {
                a(new com.mbridge.msdk.foundation.error.b(880032), str, i2, (CampaignEx) null);
                return;
            }
            try {
                com.mbridge.msdk.advanced.manager.d.b(this.f903a);
            } catch (Throwable th) {
                o0.b(z, th.getMessage());
            }
            o0.c(z, "load 开始准备请求参数");
            MBridgeIds mBridgeIds = new MBridgeIds(this.b, this.f903a);
            com.mbridge.msdk.advanced.request.f fVar = new com.mbridge.msdk.advanced.request.f();
            fVar.d(i2);
            fVar.c(this.v);
            fVar.a(this.u);
            fVar.b(this.m);
            fVar.a(this.l);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.advanced.request.e.b(context, mBridgeIds, fVar);
            if (eVarB == null) {
                o0.c(z, "load 请求参数为空 load失败");
                a(new com.mbridge.msdk.foundation.error.b(880001), str, i2, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                eVarB.a(BidResponsed.KEY_TOKEN, str);
            }
            String strD = t0.d(this.f903a);
            if (!TextUtils.isEmpty(strD)) {
                eVarB.a("j", strD);
            }
            new com.mbridge.msdk.advanced.request.c(context).choiceV3OrV5BySetting(1, eVarB, a(str, i2), str, com.mbridge.msdk.foundation.same.c.a(this.c, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
        } catch (Exception e2) {
            o0.b(z, e2.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) e2);
            a(bVar, str, i2, (CampaignEx) null);
            f();
        }
    }

    private void b() {
        this.x.removeCallbacks(this.y);
    }

    private void b(CampaignEx campaignEx, int i2) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getGifUrl(), new j(campaignEx, i2));
    }

    @NonNull
    private com.mbridge.msdk.advanced.request.b a(String str, int i2) {
        g gVar = new g(i2, str, i2);
        gVar.a(str);
        gVar.setUnitId(this.f903a);
        gVar.setPlacementId(this.b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i2, String str, String str2) throws Throwable {
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            o0.c(z, "onload load成功 size:" + listA.size());
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            j(campaignEx, i2);
            return;
        }
        o0.c(z, "onload load失败 返回的compaign没有可以用的");
        a(new com.mbridge.msdk.foundation.error.b(880033), str2, i2, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f903a);
        a(campaignEx);
        this.u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (t0.c(campaignEx)) {
                campaignEx.setRtinsType(t0.c(this.e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                t0.a(this.f903a, campaignEx, com.mbridge.msdk.foundation.same.a.x);
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.e, cVar, new h(campaignEx, aVar));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.advanced.middle.b bVar) {
        this.d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i2, CampaignEx campaignEx) throws Throwable {
        if (this.p) {
            this.p = false;
            a(bVar, i2, str);
        } else {
            if (bVar != null) {
                bVar.a(campaignEx);
            }
            a(bVar, i2, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i2, String str) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f, this.b, this.f903a, str, this.j, true, true);
        if (campaignExA != null) {
            o0.b(z, "load failed cache ");
            j(campaignExA, i2);
        } else {
            a(bVar, i2, campaignExA);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i2, CampaignEx campaignEx) {
        if (this.q) {
            return;
        }
        b();
        if (bVar != null) {
            o0.b(z, "real failed: " + bVar.h());
        }
        this.q = true;
        com.mbridge.msdk.advanced.middle.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.a(bVar, i2);
        }
    }

    private void a(CampaignEx campaignEx, int i2) {
        String str;
        this.t = new k(campaignEx, i2);
        int i3 = 0;
        if (campaignEx != null) {
            i3 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(campaignEx);
        cVar.f(i3);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, str, this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i2) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        com.mbridge.msdk.advanced.report.a.b(this.f903a, campaignEx);
        com.mbridge.msdk.advanced.signal.b bVar = new com.mbridge.msdk.advanced.signal.b(this.f.getContext(), this.b, this.f903a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        bVar.a(arrayList);
        bVar.a(this.j);
        bVar.b(this.k);
        this.f.setAdvancedNativeSignalCommunicationImpl(bVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(campaignEx, "webview is null", i2);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            a(campaignEx, "webview is destroyed", i2);
            return;
        }
        advancedNativeWebview.setWebViewListener(new C0148b(campaignEx, i2, jCurrentTimeMillis));
        if (!advancedNativeWebview.isDestoryed()) {
            AbstractC5044xl.s("=======开始渲染: ", str, z);
            Handler handler = this.x;
            if (handler != null) {
                handler.post(new c(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.mbridge.msdk.foundation.error.b(880031), this.n, i2, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.f903a, "webview had destory", jCurrentTimeMillis, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, int i2) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.d(str);
        a(bVar, this.n, i2, campaignEx);
        com.mbridge.msdk.advanced.report.a.a(2, str, this.f903a, campaignEx);
    }

    public String a(String str) {
        int iJ;
        if (this.i != null) {
            try {
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f903a, this.i.getId() + this.i.getVideoUrlEncode() + this.i.getBidToken());
                if (aVarA == null || (iJ = aVarA.j()) != 5) {
                    return str;
                }
                String strK = aVarA.k();
                if (!new File(strK).exists()) {
                    return str;
                }
                o0.b(z, "本地已下载完 拿本地播放地址：" + strK + " state：" + iJ);
                return strK;
            } catch (Exception e2) {
                o0.b(z, e2.getMessage());
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z2, String str2) {
        try {
            com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
            mVar.e(2);
            mVar.j("m_download_end");
            if (campaignEx != null) {
                mVar.b(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.m.N : com.mbridge.msdk.foundation.entity.m.O);
                mVar.o(campaignEx.getRequestIdNotice());
            }
            mVar.b("url", str);
            mVar.b("scenes", "1");
            if (z2) {
                mVar.d(1);
            } else {
                mVar.d(3);
                mVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(mVar, campaignEx);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b(z, e2.getMessage());
            }
        }
    }
}
