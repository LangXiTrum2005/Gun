package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.w;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.view.MBSplashView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static String A = "SplashLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1841a;
    private String b;
    private long c;
    private long d;
    private com.mbridge.msdk.splash.middle.b e;
    private MBSplashView g;
    private l h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private String m;
    private int n;
    private boolean o;
    private volatile boolean p;
    private com.mbridge.msdk.videocommon.listener.a q;
    private H5DownLoadManager.ZipDownloadListener r;
    private String s;
    private int t;
    private int v;
    private List<CampaignEx> w;
    private String u = "";
    private String x = "";
    private Handler y = new c(Looper.getMainLooper());
    private Runnable z = new d();
    private Context f = com.mbridge.msdk.foundation.controller.c.n().d();

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                Object obj = message.obj;
                int i3 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i3);
                    return;
                }
                return;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    e eVar = e.this;
                    eVar.h((CampaignEx) obj2, eVar.n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i4 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    if (i4 == 1) {
                        i = 880004;
                    } else {
                        i = i4 == 2 ? 880006 : 880027;
                    }
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i);
                    bVar.d(string);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.m, e.this.n, campaignEx2);
                }
            } catch (Exception e) {
                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880024);
                bVar2.a((Throwable) e);
                e eVar3 = e.this;
                eVar3.a(bVar2, eVar3.m, e.this.n, (CampaignEx) null);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.m, e.this.n, (CampaignEx) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$e, reason: collision with other inner class name */
    public class C0243e extends com.mbridge.msdk.splash.request.b {
        final /* synthetic */ String e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0243e(int i, String str, int i2) {
            super(i);
            this.e = str;
            this.f = i2;
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void a(CampaignUnit campaignUnit, int i) throws Throwable {
            try {
                e eVar = e.this;
                eVar.a(campaignUnit, i, eVar.f1841a, this.e);
                e.this.u = campaignUnit.getRequestId();
                e.this.w = campaignUnit.getAds();
            } catch (Exception e) {
                e.printStackTrace();
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) e);
                e.this.a(bVar, this.e, i, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                e.this.f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void b(int i, String str) throws Throwable {
            o0.b(e.A, str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.d(str);
            e.this.a(bVar, this.e, this.f, (CampaignEx) null);
            e.this.f();
        }
    }

    public class f extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1846a;

        public f(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f1846a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.splash.report.a.a(str, cVar, this.f1846a, e.this.f, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1847a;

        public g(CampaignEx campaignEx) {
            this.f1847a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f)).a();
            w.a(e.this.f, this.f1847a);
        }
    }

    public class h implements com.mbridge.msdk.splash.view.nativeview.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1848a;
        final /* synthetic */ int b;

        public h(CampaignEx campaignEx, int i) {
            this.f1848a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void a() {
            if (this.f1848a.isDynamicView() && e.this.g != null) {
                e.this.g.setImageReady(true);
                e.this.f(this.f1848a, this.b);
            }
            e.this.h(this.f1848a, this.b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void b() throws Throwable {
            if (!this.f1848a.isDynamicView() || e.this.g == null) {
                return;
            }
            e.this.g.setImageReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
            e eVar = e.this;
            eVar.a(bVar, eVar.m, this.b, this.f1848a);
        }
    }

    public class i implements x.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1849a;

        public i(CampaignEx campaignEx) {
            this.f1849a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.x.c
        public void a(String str, String str2, String str3, String str4, boolean z) {
            if (z) {
                return;
            }
            e.this.a(this.f1849a, str, true, "");
        }

        @Override // com.mbridge.msdk.foundation.tools.x.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            e.this.a(this.f1849a, str, false, message);
        }
    }

    public class j implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1850a;
        final /* synthetic */ int b;

        public j(CampaignEx campaignEx, int i) {
            this.f1850a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880006);
            e eVar = e.this;
            eVar.a(bVar, eVar.m, this.b, this.f1850a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f1850a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            e.this.y.sendMessage(messageObtain);
            e.this.a(this.f1850a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f1850a;
            messageObtain.arg1 = this.b;
            e.this.y.sendMessage(messageObtain);
            if (z) {
                return;
            }
            CampaignEx campaignEx = this.f1850a;
            e.this.a(this.f1850a, campaignEx != null ? campaignEx.getAdZip() : "", true, "");
        }
    }

    public class k implements com.mbridge.msdk.splash.inter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1851a;
        final /* synthetic */ int b;

        public k(CampaignEx campaignEx, int i) {
            this.f1851a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void a(View view) {
            if (e.this.g != null) {
                e.this.g.setDynamicView(true);
                e.this.g.setSplashNativeView(view);
                e.this.h(this.f1851a, this.b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void onError(String str) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880034);
            bVar.d(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.m, this.b, this.f1851a);
        }
    }

    public e(String str, String str2, long j2) {
        this.b = str;
        this.f1841a = str2;
        this.d = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i2) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.g, campaignEx) || this.p) {
            return;
        }
        b();
        if (this.o) {
            com.mbridge.msdk.splash.manager.d.a(campaignEx, this.f1841a);
        }
        this.p = true;
        com.mbridge.msdk.splash.middle.b bVar = this.e;
        if (bVar != null) {
            bVar.a(campaignEx, i2);
        }
    }

    private void i(CampaignEx campaignEx, int i2) throws Throwable {
        MBSplashView mBSplashView = this.g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            c(campaignEx, i2);
        } else {
            MBSplashView mBSplashView2 = this.g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (com.mbridge.msdk.splash.manager.d.a(this.g, campaignEx)) {
            h(campaignEx, i2);
        } else {
            a(campaignEx, i2);
        }
    }

    public class a implements com.mbridge.msdk.splash.manager.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1842a;
        final /* synthetic */ int b;

        public a(CampaignEx campaignEx, int i) {
            this.f1842a = campaignEx;
            this.b = i;
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a() {
            if (this.f1842a.isHasMBTplMark()) {
                return;
            }
            e.this.g(this.f1842a, this.b);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void onError(String str) throws Throwable {
            e.this.a(str, this.b, this.f1842a);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a(int i) throws Throwable {
            if (i == 1) {
                e.this.g(this.f1842a, this.b);
            } else {
                e.this.a("readyState 2", this.b, this.f1842a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.t = 0;
    }

    private void g() {
        try {
            int i2 = this.t + 1;
            this.t = i2;
            l lVar = this.h;
            if (lVar != null && i2 <= lVar.y()) {
                return;
            }
            this.t = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String d() {
        return this.u;
    }

    public void e() {
        if (this.e != null) {
            this.e = null;
        }
        if (this.q != null) {
            this.q = null;
        }
        if (this.r != null) {
            this.r = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[Catch: Exception -> 0x0107, TRY_ENTER, TryCatch #5 {Exception -> 0x0107, blocks: (B:54:0x0103, B:55:0x0106, B:42:0x00c4, B:44:0x00c8, B:46:0x00ce, B:48:0x00d4, B:50:0x00da, B:51:0x00f5, B:33:0x00a7), top: B:66:0x000c }] */
    private void d(CampaignEx campaignEx, int i2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream = null;
        fileOutputStream3 = null;
        FileOutputStream fileOutputStream4 = null;
        fileOutputStream3 = null;
        File file2 = null;
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
                                        fileOutputStream4 = fileOutputStream;
                                    } catch (Exception e) {
                                        e = e;
                                        fileOutputStream3 = fileOutputStream;
                                        file3 = file;
                                        e.printStackTrace();
                                        campaignEx.setMraid("");
                                        com.mbridge.msdk.foundation.same.report.g.a(campaignEx, e.getMessage(), this.f1841a, "6");
                                        if (fileOutputStream3 != null) {
                                            fileOutputStream3.close();
                                        }
                                        file = file3;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.g.a(campaignEx, "", this.f1841a, "6");
                            if (fileOutputStream4 != null) {
                                fileOutputStream4.close();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            fileOutputStream2 = fileOutputStream4;
                            file2 = file;
                            file3 = file2;
                            fileOutputStream3 = fileOutputStream2;
                            e.printStackTrace();
                            campaignEx.setMraid("");
                            com.mbridge.msdk.foundation.same.report.g.a(campaignEx, e.getMessage(), this.f1841a, "6");
                            if (fileOutputStream3 != null) {
                                fileOutputStream3.close();
                            }
                            file = file3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream3;
                }
            } catch (Exception e5) {
                e = e5;
                fileOutputStream2 = null;
            }
            if (file.exists() && file.isFile() && file.canRead()) {
                campaignEx.setAdHtml(file.getAbsolutePath());
                a("file:////" + file.getAbsolutePath(), campaignEx, i2);
                return;
            }
            a(new com.mbridge.msdk.foundation.error.b(880013), this.m, i2, campaignEx);
        } catch (Exception unused) {
            a(new com.mbridge.msdk.foundation.error.b(880013), this.m, i2, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CampaignEx campaignEx, int i2) {
        if (campaignEx.isDynamicView()) {
            com.mbridge.msdk.splash.common.c.a aVar = new com.mbridge.msdk.splash.common.c.a();
            aVar.b(this.f1841a).a(this.b).a(this.i).a(campaignEx).c(this.j).f(this.v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                o0.b(A, th.getMessage());
            }
            com.mbridge.msdk.splash.manager.c.a().a(this.g, aVar.a(), new k(campaignEx, i2));
        }
    }

    public void b(int i2) {
        this.v = i2;
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.w);
    }

    private void b() {
        this.y.removeCallbacks(this.z);
    }

    private void c(CampaignEx campaignEx, int i2) {
        com.mbridge.msdk.splash.manager.d.a(this.g, campaignEx, new h(campaignEx, i2));
    }

    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f1843a;

        public b(CampaignEx campaignEx) {
            this.f1843a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            e.this.g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f1843a;
            messageObtain.what = 3;
            e.this.y.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) throws Throwable {
            e.this.g.setVideoReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880004);
            bVar.d(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.m, e.this.n, this.f1843a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f1843a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.y.sendMessage(messageObtain);
        }
    }

    private void b(CampaignEx campaignEx, int i2) {
        this.q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f, this.f1841a, copyOnWriteArrayList, 297, this.q);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, this.f1841a, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f1841a);
        } else {
            this.g.setVideoReady(true);
            h(campaignEx, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(CampaignEx campaignEx, int i2) {
        if (this.g.isH5Ready()) {
            return;
        }
        this.g.setH5Ready(true);
        h(campaignEx, i2);
    }

    private void e(CampaignEx campaignEx, int i2) {
        if (campaignEx.isDynamicView()) {
            x.a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.r = new j(campaignEx, i2);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(297);
        cVar.e(2);
        cVar.a(campaignEx);
        cVar.f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getAdZip(), this.r);
    }

    public void a(l lVar) {
        this.h = lVar;
    }

    public void a(MBSplashView mBSplashView) {
        this.g = mBSplashView;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void a(int i2) {
        this.j = i2;
    }

    public void a(int i2, int i3) {
        this.l = i2;
        this.k = i3;
    }

    public void a(String str, int i2) {
        this.p = false;
        this.m = str;
        this.n = i2;
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.g, this.b, this.f1841a, str, this.i, this.j, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.h.t() == 1 && i2 != 1 && campaignExA != null) {
            i(campaignExA, i2);
            return;
        }
        this.o = true;
        if (i2 == 1) {
            List<Integer> listC = this.h.c();
            if (listC != null && listC.size() > 0) {
                this.c = listC.get(0).intValue() * 1000;
            } else {
                this.c = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
            }
        } else {
            long j2 = this.d;
            if (j2 <= 0) {
                this.c = this.h.E();
            } else {
                this.c = j2;
            }
        }
        if (this.h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.c);
            a(this.f, str, i2);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.h.v() * 1000) {
            a(this.c);
            a(this.f, str, i2);
        } else {
            i(campaignExA, i2);
        }
    }

    private void a(long j2) {
        this.y.postDelayed(this.z, j2);
    }

    private void a(Context context, String str, int i2) throws Throwable {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i2, (CampaignEx) null);
                return;
            }
            if (y0.a(this.f1841a)) {
                a(new com.mbridge.msdk.foundation.error.b(880032), str, i2, (CampaignEx) null);
                return;
            }
            MBridgeIds mBridgeIds = new MBridgeIds(this.b, this.f1841a);
            com.mbridge.msdk.splash.request.f fVar = new com.mbridge.msdk.splash.request.f();
            fVar.d(i2);
            fVar.c(this.t);
            fVar.a(this.s);
            fVar.b(this.l);
            fVar.a(this.k);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.splash.request.e.b(context, mBridgeIds, fVar);
            if (eVarB == null) {
                a(new com.mbridge.msdk.foundation.error.b(880001), str, i2, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                eVarB.a(BidResponsed.KEY_TOKEN, str);
            }
            String strD = t0.d(this.f1841a);
            if (!TextUtils.isEmpty(strD)) {
                eVarB.a("j", strD);
            }
            com.mbridge.msdk.splash.request.c cVar = new com.mbridge.msdk.splash.request.c(context);
            C0243e c0243e = new C0243e(i2, str, i2);
            c0243e.a(str);
            c0243e.setUnitId(this.f1841a);
            c0243e.setPlacementId(this.b);
            c0243e.setAdType(297);
            cVar.choiceV3OrV5BySetting(1, eVarB, c0243e, str, com.mbridge.msdk.foundation.same.c.a(this.c, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
        } catch (Exception e) {
            o0.b(A, e.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) e);
            a(bVar, str, i2, (CampaignEx) null);
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i2, String str, String str2) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        List<CampaignEx> listA = a(campaignUnit);
        if (listA != null && listA.size() > 0) {
            g();
            CampaignEx campaignEx = listA.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx.setHasMBTplMark(false);
                campaignEx.setIsMraid(true);
            } else {
                campaignEx.setHasMBTplMark(true);
                campaignEx.setIsMraid(false);
            }
            i(campaignEx, i2);
            return;
        }
        if (this.x.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        a(bVar, str2, i2, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f1841a);
        a(campaignEx);
        this.s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (t0.c(campaignEx)) {
                campaignEx.setRtinsType(t0.c(this.f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                t0.a(this.f1841a, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                this.x = "APP ALREADY INSTALLED";
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f, cVar, new f(campaignEx, aVar));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    public void a(com.mbridge.msdk.splash.middle.b bVar) {
        this.e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i2, CampaignEx campaignEx) throws Throwable {
        if (this.o) {
            this.o = false;
            a(bVar, i2, str, campaignEx);
        } else {
            a(bVar, i2, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i2, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.g, this.b, this.f1841a, str, this.i, this.j, true, false);
        if (campaignExA != null) {
            i(campaignExA, i2);
        } else {
            a(bVar, i2, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i2, CampaignEx campaignEx) {
        if (this.p) {
            return;
        }
        b();
        this.p = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.middle.b bVar2 = this.e;
        if (bVar2 != null) {
            bVar2.a(bVar, i2);
        }
    }

    private void a(CampaignEx campaignEx, int i2) throws Throwable {
        this.g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            e(campaignEx, i2);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            d(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            b(campaignEx, i2);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        c(campaignEx, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i2) {
        com.mbridge.msdk.splash.manager.g.d dVar = new com.mbridge.msdk.splash.manager.g.d();
        dVar.c(this.f1841a);
        dVar.b(this.b);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(this.i);
        dVar.a(this.j);
        com.mbridge.msdk.splash.manager.g.a().a(this.g, dVar, new a(campaignEx, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.d(str);
        a(bVar, this.m, i2, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z, String str2) {
        try {
            m mVar = new m();
            mVar.e(2);
            mVar.j("m_download_end");
            if (campaignEx != null) {
                mVar.b(campaignEx.isMraid() ? m.N : m.O);
                mVar.o(campaignEx.getRequestIdNotice());
            }
            mVar.b("url", str);
            mVar.b("scenes", "1");
            if (z) {
                mVar.d(1);
            } else {
                mVar.d(3);
                mVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(mVar, campaignEx);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b(A, e.getMessage());
            }
        }
    }
}
