package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VN;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {
    protected String j;
    protected com.mbridge.msdk.videocommon.setting.c k;
    protected com.mbridge.msdk.click.a l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f2371a = false;
    protected boolean b = false;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected int g = 0;
    protected int h = 1;
    protected int i = -1;
    public com.mbridge.msdk.video.signal.a.InterfaceC0270a m = new C0271a();
    protected int n = 2;
    protected int o = 2;
    private N2 p = null;
    private VN q = null;
    private C4363q1 r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    public static class C0271a implements com.mbridge.msdk.video.signal.a.InterfaceC0270a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0270a
        public void a(boolean z) {
            o0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            o0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            o0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
            o0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            o0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            o0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0270a
        public void onInitSuccess() {
            o0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            o0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            o0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            o0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            o0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0270a
        public void a(int i, String str) {
            o0.a("DefaultJSCommon", "onH5Error,code:" + i + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0270a
        public void a() {
            o0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z) {
        o0.a("DefaultJSCommon", "setIsShowingTransparent:" + z);
        this.b = z;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i) {
        this.c = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i) {
        this.e = i;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i, String str) {
        o0.a("DefaultJSCommon", "click:type" + i + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i) {
        o0.a("DefaultJSCommon", "setAlertDialogRole " + i);
        this.h = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i) {
        this.d = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i) {
        o0.a("DefaultJSCommon", "getSDKInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i) {
        this.n = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i, String str) {
        o0.a("DefaultJSCommon", "handlerH5Exception,code=" + i + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.i;
    }

    public C4363q1 j() {
        return this.r;
    }

    public N2 k() {
        return this.p;
    }

    public int l() {
        if (this.c == 0 && this.b) {
            this.c = 1;
        }
        return this.c;
    }

    public int m() {
        if (this.d == 0 && this.b) {
            this.d = 1;
        }
        return this.d;
    }

    public int n() {
        if (this.e == 0 && this.b) {
            this.e = 1;
        }
        return this.e;
    }

    public VN o() {
        return this.q;
    }

    public boolean p() {
        return this.b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        o0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.l;
        if (aVar != null) {
            aVar.a(false);
            this.l.a((NativeListener.NativeTrackingListener) null);
            this.l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        o0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(C4363q1 c4363q1) {
        this.r = c4363q1;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(N2 n2) {
        this.p = n2;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        o0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        AbstractC3888ke0.s("setUnitId:", str, "DefaultJSCommon");
        this.j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(VN vn) {
        this.q = vn;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i) {
        this.g = i;
    }

    public static class b implements com.mbridge.msdk.video.signal.a.InterfaceC0270a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f2372a;
        private com.mbridge.msdk.video.signal.a.InterfaceC0270a b;

        public b(com.mbridge.msdk.video.signal.d dVar, com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a) {
            this.f2372a = dVar;
            this.b = interfaceC0270a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0270a
        public void a(boolean z) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.a(z);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onDownloadProgress(i);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f2372a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0270a
        public void onInitSuccess() {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            return interfaceC0270a != null && interfaceC0270a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f2372a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0270a
        public void a(int i, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.a(i, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0270a
        public void a() {
            com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.b;
            if (interfaceC0270a != null) {
                interfaceC0270a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        o0.a("DefaultJSCommon", "init");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        o0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f2371a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z) {
        this.f2371a = z;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        o0.a("DefaultJSCommon", "getAlertDialogRole " + this.h);
        return this.h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        o0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a) {
        o0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0270a);
        this.m = interfaceC0270a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i, String str) {
        o0.a("DefaultJSCommon", "statistics,type:" + i + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i) {
        this.i = i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        o0.a("DefaultJSCommon", "setNotchArea");
    }
}
