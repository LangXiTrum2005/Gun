package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class DomainMBCommonActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f888a = "";
    private final BrowserView.e b = new a();
    protected BrowserView browserView;
    private CampaignEx c;

    public class a implements BrowserView.e {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageFinished(WebView webView, String str) {
            AbstractC5044xl.s("onPageFinished  ", str, "MBCommonActivity");
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            AbstractC5044xl.s("onPageStarted  ", str, "MBCommonActivity");
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            o0.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (s0.a.b(str) && s0.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a() {
            DomainMBCommonActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            o0.b("MBCommonActivity", th.getMessage());
        }
        if (c.n().d() == null) {
            c.n().b(getApplicationContext());
        }
        c.n().a(this);
        a();
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.f888a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
        if (b.f1317a.containsKey(this.f888a)) {
            BrowserView browserView = b.f1317a.get(this.f888a);
            this.browserView = browserView;
            if (browserView != null) {
                browserView.setListener(this.b);
            }
        } else {
            BrowserView browserView2 = new BrowserView(this, this.c);
            this.browserView = browserView2;
            browserView2.setListener(this.b);
            this.browserView.loadUrl(this.f888a);
        }
        BrowserView browserView3 = this.browserView;
        if (browserView3 != null) {
            c1.a(browserView3);
            setContentView(this.browserView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        Intent uri;
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri2 = Uri.parse(str);
            if (!uri2.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri2.getScheme().equals("https")) {
                if (uri2.getScheme().equals("intent") || (uri2.getScheme().equals("android-app") && Build.VERSION.SDK_INT >= 22)) {
                    String stringExtra = null;
                    if (uri2.getScheme().equals("intent")) {
                        uri = Intent.parseUri(str, 1);
                    } else {
                        uri = (!uri2.getScheme().equals("android-app") || Build.VERSION.SDK_INT < 22) ? null : Intent.parseUri(str, 2);
                    }
                    if (uri != null) {
                        uri.setComponent(null);
                        uri.setSelector(null);
                    }
                    if (uri == null) {
                        str2 = "";
                    } else {
                        try {
                            str2 = uri.getPackage();
                        } catch (Throwable th) {
                            o0.b("MBCommonActivity", th.getMessage());
                        }
                    }
                    if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                        if (uri != null) {
                            uri.setFlags(268435456);
                        }
                        startActivityForResult(uri, 0);
                        finish();
                        return true;
                    }
                    if (uri != null) {
                        try {
                            stringExtra = uri.getStringExtra("browser_fallback_url");
                        } catch (Throwable th2) {
                            o0.b("MBCommonActivity", th2.getMessage());
                        }
                    }
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (!uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) && !uri3.getScheme().equals("https")) {
                            str = stringExtra;
                        }
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                    o0.b("MBCommonActivity", th.getMessage());
                    return false;
                }
                if (com.mbridge.msdk.click.c.e(this, str)) {
                    o0.b("MBCommonActivity", "openDeepLink");
                    finish();
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith(ProxyConfig.MATCH_HTTP) || str.startsWith("https"));
                }
            }
            return false;
        } catch (Throwable th3) {
            o0.b("MBCommonActivity", th3.getMessage());
            return false;
        }
    }
}
