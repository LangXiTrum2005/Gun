package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class a implements BrowserView.e {
    private static String o = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1312a;
    private String c;
    private boolean d;
    private BaseTrackingListener e;
    private BrowserView f;
    private CampaignEx g;
    private com.mbridge.msdk.click.a h;
    private Context i;
    private JumpLoaderResult k;
    private long n;
    private boolean b = true;
    private boolean l = false;
    private final Runnable m = new RunnableC0178a();
    private Handler j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$a, reason: collision with other inner class name */
    public class RunnableC0178a implements Runnable {
        public RunnableC0178a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.b(a.o, "webview js！超时上限：" + a.this.f1312a + "ms");
            if (a.this.h != null && a.this.k != null) {
                a.this.k.setSuccess(false);
                a.this.k.setUrl(a.this.c);
                a.this.k.setType(2);
                a.this.k.setExceptionMsg("linktype 8 time out");
                a.this.h.a(a.this.k, a.this.g, 1, false);
            }
            a aVar = a.this;
            if (aVar.b(null, aVar.c) && !a.this.l) {
                a.this.l = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.i, a.this.c, a.this.g);
            }
            if (a.this.e != null) {
                a.this.e.onFinishRedirection(a.this.g, a.this.c);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1314a;

        public b(String str) {
            this.f1314a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.h != null && a.this.k != null) {
                a.this.k.setSuccess(true);
                a.this.k.setUrl(this.f1314a);
                a.this.k.setType(2);
                a.this.h.a(a.this.k, a.this.g, 1, true);
            }
            if (a.this.e != null) {
                a.this.e.onFinishRedirection(a.this.g, this.f1314a);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1315a;

        public c(String str) {
            this.f1315a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.e != null) {
                a.this.e.onFinishRedirection(a.this.g, this.f1315a);
            }
            if (a.this.h == null || a.this.k == null) {
                return;
            }
            a.this.k.setSuccess(true);
            a.this.k.setUrl(this.f1315a);
            a.this.k.setType(2);
            a.this.h.a(a.this.k, a.this.g, 1, true);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1316a;
        final /* synthetic */ String b;

        public d(String str, String str2) {
            this.f1316a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.e != null) {
                a.this.e.onFinishRedirection(a.this.g, this.f1316a);
            }
            if (a.this.h == null || a.this.k == null) {
                return;
            }
            a.this.k.setSuccess(false);
            a.this.k.setUrl(this.f1316a);
            a.this.k.setType(2);
            a.this.k.setExceptionMsg(this.b);
            a.this.h.a(a.this.k, a.this.g, 1, true);
        }
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f1312a = 10000;
        this.k = null;
        this.i = context;
        this.g = campaignEx;
        this.f = browserView;
        this.e = baseTrackingListener;
        g gVarF = AbstractC3888ke0.f(h.b());
        gVarF = gVarF == null ? h.b().a() : gVarF;
        this.h = aVar;
        this.k = new JumpLoaderResult();
        this.f1312a = (int) gVarF.o0();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a() {
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageFinished(WebView webView, String str) {
        AbstractC5044xl.s("onPageFinished1  ", str, o);
        if (this.b) {
            this.n = 0L;
            this.b = false;
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if ((uri.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri.getScheme().equals("https")) && !this.l) {
                this.l = true;
                a(this.i, str, this.g);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.n == 0) {
            this.n = System.currentTimeMillis();
            if (!this.d) {
                this.d = true;
                d();
            }
            this.l = false;
        }
        this.c = str;
        this.b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        o0.d(o, str);
        c();
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(str2, str));
        if (!b(webView, str2) || this.l) {
            return;
        }
        this.l = true;
        a(this.i, str2, this.g);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC5044xl.s("shouldOverrideUrlLoading1  ", str, o);
        this.b = false;
        if (s0.a.b(str) && s0.a.a(this.i, str, null)) {
            this.l = true;
        }
        boolean zC = c(webView, str);
        if (zC) {
            this.n = 0L;
            this.b = false;
            c();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new b(str));
        }
        return zC;
    }

    private boolean c(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.setFlags(268435456);
                            this.i.startActivity(uri2);
                            this.l = true;
                            return true;
                        }
                        try {
                            String stringExtra = uri2.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                Uri uri3 = Uri.parse(str);
                                if (!uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th) {
                            o0.b(o, th.getMessage());
                        }
                    } catch (Throwable th2) {
                        o0.b(o, th2.getMessage());
                    }
                    o0.b(o, th.getMessage());
                    return false;
                }
                if (com.mbridge.msdk.click.c.e(this.i, str)) {
                    o0.b(o, "openDeepLink");
                    this.l = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            o0.b(o, th3.getMessage());
            return false;
        }
    }

    private void d() {
        this.j.postDelayed(this.m, this.f1312a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            return false;
                        }
                    } catch (Throwable th) {
                        o0.b(o, th.getMessage());
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri3.getScheme().equals("https")) {
                                return true;
                            }
                            str = stringExtra;
                        }
                    } catch (Throwable th2) {
                        o0.b(o, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.e(this.i, str)) {
                    o0.b(o, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            o0.b(o, th3.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str) {
        if (this.n == 0) {
            this.n = System.currentTimeMillis();
            if (!this.d) {
                this.d = true;
                d();
            }
        }
        this.c = str;
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i = MBCommonActivity.e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.webview.b.f1317a.put(str, this.f);
            if (s0.a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            o0.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            s0.a(context, str, this.e, campaignEx, new ArrayList());
        }
    }

    private void c() {
        this.j.removeCallbacks(this.m);
    }
}
