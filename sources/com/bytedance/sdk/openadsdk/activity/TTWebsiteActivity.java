package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.kqm;
import com.bytedance.sdk.openadsdk.core.JXs.OY;
import com.bytedance.sdk.openadsdk.core.JXs.ebl;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.hg;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private kqm LD;
    private String Lxb = null;
    private WebView lk;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.kqm.LD(getApplicationContext());
        if (!STP.JXs()) {
            finish();
            return;
        }
        final String stringExtra = getIntent().getStringExtra("_extra_meta");
        String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(this);
        if (Build.VERSION.SDK_INT >= 35) {
            jXs.setFitsSystemWindows(true);
        }
        jXs.setBackgroundColor(-1);
        jXs.setId(520093726);
        jXs.setOrientation(1);
        jXs.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(jXs);
            int iLk = le.lk(this, 5.0f);
            int iLk2 = le.lk(this, 8.0f);
            int iLk3 = le.lk(this, 10.0f);
            int iLk4 = le.lk(this, 12.0f);
            int iLk5 = le.lk(this, 14.0f);
            int iLk6 = le.lk(this, 20.0f);
            int iLk7 = le.lk(this, 24.0f);
            int iLk8 = le.lk(this, 40.0f);
            int iLk9 = le.lk(this, 44.0f);
            int iLk10 = le.lk(this, 191.0f);
            ebl eblVar = new ebl(this);
            eblVar.setGravity(15);
            eblVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iLk9));
            com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(this);
            zu.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLk8, iLk9);
            layoutParams.setMarginStart(iLk2);
            zu.setLayoutParams(layoutParams);
            zu.setClickable(true);
            zu.setFocusable(true);
            zu.setPadding(iLk5, iLk4, iLk5, iLk4);
            zu.setImageDrawable(tD.lk(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(this);
            zu2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iLk8, iLk9);
            layoutParams2.addRule(17, 520093720);
            zu2.setLayoutParams(layoutParams2);
            zu2.setClickable(true);
            zu2.setFocusable(true);
            zu2.setPadding(iLk4, iLk5, iLk4, iLk5);
            zu2.setImageDrawable(tD.lk(this, "tt_ad_xmark"));
            OY oy = new OY(this);
            oy.setId(com.bytedance.sdk.openadsdk.utils.STP.AcC);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iLk10, iLk7);
            layoutParams3.setMarginStart(iLk);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            oy.setLayoutParams(layoutParams3);
            oy.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            oy.setGravity(17);
            oy.setSingleLine(true);
            oy.setTextColor(Color.parseColor("#222222"));
            oy.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.JXs.ZU zu3 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(this);
            zu3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iLk8, iLk9);
            layoutParams4.addRule(16, 520093742);
            zu3.setLayoutParams(layoutParams4);
            zu3.setPadding(iLk3, iLk4, iLk3, iLk4);
            zu3.setImageDrawable(tD.lk(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.JXs.ZU zu4 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(this);
            zu4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iLk8, iLk9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iLk2);
            zu4.setLayoutParams(layoutParams5);
            zu4.setPadding(iLk4, iLk6, iLk4, iLk6);
            zu4.setImageDrawable(tD.lk(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.JXs.lc lcVar = new com.bytedance.sdk.openadsdk.core.JXs.lc(this, null, R.style.Widget.ProgressBar.Horizontal);
            lcVar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, le.lk(this, 2.0f));
            layoutParams6.addRule(12);
            lcVar.setLayoutParams(layoutParams6);
            lcVar.setProgress(1);
            lcVar.setProgressDrawable(QAg.Lxb(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, le.lk(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            eblVar.addView(zu);
            eblVar.addView(zu2);
            eblVar.addView(oy);
            eblVar.addView(zu3);
            eblVar.addView(zu4);
            eblVar.addView(lcVar);
            eblVar.addView(view);
            jXs.addView(eblVar);
            try {
                WebView webView = new WebView(getApplicationContext());
                this.lk = webView;
                webView.setBackgroundColor(-1);
                jXs.addView(this.lk, new ViewGroup.LayoutParams(-1, -1));
                zu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.lk.canGoBack()) {
                            TTWebsiteActivity.this.lk.goBack();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                zu2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                zu2.setVisibility(4);
                zu2.setClickable(false);
                oy.setText(tD.Lxb(this, "tt_privacy_title"));
                zu3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.lk.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.LD.Lxb(TTWebsiteActivity.this, intent, null);
                    }
                });
                zu4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.LD == null) {
                            TTWebsiteActivity.this.LD = new kqm(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.LD.Lxb(stringExtra);
                            TTWebsiteActivity.this.LD.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.LD.show();
                    }
                });
                if (com.bytedance.sdk.openadsdk.core.kqm.ZU() != null) {
                    this.Lxb = com.bytedance.sdk.openadsdk.core.kqm.ZU().nJ();
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        String strEncode = URLEncoder.encode(stringExtra2);
                        if (this.Lxb.contains("?")) {
                            this.Lxb = AbstractC5044xl.p(new StringBuilder(), this.Lxb, "&gdid_encrypted=", strEncode);
                        } else {
                            this.Lxb = AbstractC5044xl.p(new StringBuilder(), this.Lxb, "?gdid_encrypted=", strEncode);
                        }
                    }
                }
                if (this.Lxb == null) {
                    finish();
                    return;
                }
                WebSettings settings = this.lk.getSettings();
                settings.setMixedContentMode(0);
                try {
                    settings.setJavaScriptEnabled(true);
                    settings.setDomStorageEnabled(true);
                    settings.setSavePassword(false);
                    settings.setAllowFileAccess(false);
                } catch (Throwable unused) {
                }
                try {
                    this.lk.loadUrl(this.Lxb, AbstractC3950lJ.v(HttpRequestHeader.Referer, TTAdConstant.REQUEST_HEAD_REFERER));
                } catch (Throwable unused2) {
                    this.lk.loadUrl(this.Lxb);
                }
                this.lk.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView2, int i) {
                        super.onProgressChanged(webView2, i);
                        if (lcVar == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i != 100) {
                            lcVar.setVisibility(0);
                            lcVar.setProgress(i);
                            return;
                        }
                        lcVar.setVisibility(8);
                        if (webView2.canGoBack()) {
                            zu2.setVisibility(0);
                            zu2.setClickable(true);
                        } else {
                            zu2.setVisibility(4);
                            zu2.setClickable(false);
                        }
                    }
                });
                this.lk.setWebViewClient(new com.bytedance.sdk.component.QAg.ZU.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str) {
                        super.onPageFinished(webView2, str);
                    }

                    @Override // android.webkit.WebViewClient
                    @RequiresApi(api = 23)
                    public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView2, webResourceRequest, webResourceError);
                        sLN.Lxb("TTAD.TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                        sLN.Lxb("TTAD.TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=".concat(String.valueOf(webResourceResponse)));
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                        if (webView2 == null || webResourceRequest == null) {
                            return false;
                        }
                        webView2.loadUrl(webResourceRequest.getUrl().toString());
                        return true;
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, int i, String str, String str2) {
                        super.onReceivedError(webView2, i, str, str2);
                    }
                });
                com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.LD(this.lk);
            } catch (Exception e) {
                sLN.Lxb("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        hg.Lxb(this.lk);
        super.onDestroy();
    }

    public static void Lxb(Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), tDVar, str, "open_policy");
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.kqm.ZU().nJ())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (tDVar != null) {
            intent.putExtra("_extra_meta", tDVar.iC().toString());
            intent.putExtra("_extra_glo_d", tDVar.Ax());
        }
        com.bytedance.sdk.component.utils.LD.Lxb(context, intent, null);
    }
}
