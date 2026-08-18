package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.ZU.JVA;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.model.VVE;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.ebl;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;

/* JADX INFO: loaded from: classes2.dex */
public class TTCeilingLandingPageActivity extends TTBaseActivity {
    private com.bytedance.sdk.component.QAg.ZU JVA;
    private String JXs;
    private tD LD;
    Lxb Lxb;
    private String OY;
    private JVA QAg;
    private String ZU;
    private int lc;
    private Ivz lk;
    private com.bytedance.sdk.openadsdk.common.ZU nBu;

    public interface Lxb {
        void Lxb();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!STP.JXs()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.OY = intent.getStringExtra("second_url");
        this.lc = intent.getIntExtra("source", -1);
        this.LD = aH.Lxb().LD();
        aH.Lxb().lc();
        tD tDVar = this.LD;
        if (tDVar == null) {
            finish();
            return;
        }
        this.ZU = tDVar.bG();
        this.JXs = this.LD.Lv();
        this.lc = this.LD.hg().getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(this);
        Lxb(this, lkVar);
        setContentView(lkVar);
        Lxb();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Lxb(Context context, FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu;
        this.JVA = new com.bytedance.sdk.component.QAg.ZU(context);
        frameLayout.addView(this.JVA, new FrameLayout.LayoutParams(-1, -1));
        View viewLD = ebl.LD(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = le.lk(context, 18.0f);
        layoutParams.rightMargin = le.lk(context, 18.0f);
        frameLayout.addView(viewLD, layoutParams);
        final int iZU = this.LD.nBu().ZU();
        if (iZU != 3) {
            zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(le.lk(context, 28.0f), le.lk(context, 28.0f));
            layoutParams2.gravity = 8388659;
            layoutParams2.topMargin = le.lk(context, 18.0f);
            layoutParams2.leftMargin = le.lk(context, 18.0f);
            int iLk = le.lk(context, 5.0f);
            zu.setPadding(iLk, iLk, iLk, iLk);
            zu.setScaleType(ImageView.ScaleType.FIT_XY);
            zu.setBackground(com.bytedance.sdk.openadsdk.core.widget.ZU.Lxb());
            zu.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(zu, layoutParams2);
        } else {
            zu = null;
        }
        com.bytedance.sdk.openadsdk.utils.tD.Lxb(this.JVA, this.OY);
        final WebView webView = this.JVA.getWebView();
        viewLD.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        JVA jva = new JVA(this.LD, webView, true);
        this.QAg = jva;
        jva.Lxb("landingpage_split_ceiling");
        final com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb lxb = this.QAg.Lxb;
        if (zu != null) {
            zu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i = iZU;
                    if (i == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb lxb2 = lxb;
                    if (lxb2 != null) {
                        lxb2.Lxb();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.ZU zuLxb = nJ.Lxb(this.LD, this.JVA, this, "landingpage_split_ceiling");
        this.nBu = zuLxb;
        if (zuLxb != null) {
            zuLxb.Lxb("landingpage_split_ceiling");
            this.nBu.Lxb();
        }
        nJ.Lxb(this.LD, this.JVA, true);
        this.Lxb = new Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.Lxb
            public void Lxb() {
                if (TTCeilingLandingPageActivity.this.LD.nBu().JXs() == VVE.LD) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(this, this.lk, this.ZU, this.nBu, this.QAg, true, true, this.Lxb) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        jXs.Lxb(this.LD);
        com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU zu2 = new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.lk, this.QAg, this.nBu) { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i) {
                super.onProgressChanged(webView2, i);
            }
        };
        com.bytedance.sdk.component.QAg.ZU zu3 = this.JVA;
        if (zu3 != null) {
            zu3.setWebViewClient(jXs);
            this.JVA.setWebChromeClient(zu2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.QAg == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.QAg.Lxb(motionEvent);
                    return false;
                }
            });
            if (Build.VERSION.SDK_INT >= 23) {
                webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.7
                    @Override // android.view.View.OnScrollChangeListener
                    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                        if (TTCeilingLandingPageActivity.this.QAg != null) {
                            TTCeilingLandingPageActivity.this.QAg.LD(i2);
                        }
                    }
                });
            }
        }
    }

    private void Lxb() {
        Ivz ivz = new Ivz(this);
        this.lk = ivz;
        ivz.LD(this.JVA).lk(this.ZU).ZU(this.JXs).Lxb(this.LD).LD(this.lc).Lxb(this.LD.BcA()).JXs(this.LD.cf()).Lxb(this.JVA).LD("landingpage_split_ceiling");
    }
}
