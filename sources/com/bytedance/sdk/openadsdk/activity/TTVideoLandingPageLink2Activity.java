package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.ZU.JVA;
import com.bytedance.sdk.openadsdk.common.IeN;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.VVE;
import com.bytedance.sdk.openadsdk.common.sLN;
import com.bytedance.sdk.openadsdk.core.JXs.OY;
import com.bytedance.sdk.openadsdk.core.JXs.ebl;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.nBu.ZU {
    private TextView LXE;
    TTAdDislikeToast Ld;
    private PAGLogoView MGT;
    private sLN Ns;
    private boolean Nu;
    IeN Of;
    private TextView SS;
    private View Sv;
    private boolean ae;
    private LinearLayout bG;
    private com.bytedance.sdk.openadsdk.common.ZU jeq;
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs nTb;
    private View uxf;
    private long wbY;
    private VVE xr;
    private boolean FD = false;
    final AtomicBoolean JZE = new AtomicBoolean(false);
    final AtomicBoolean Lpq = new AtomicBoolean(false);

    private void VVE() {
        try {
            if (this.Of == null) {
                IeN ieN = new IeN(this.JXs, this.VVE);
                this.Of = ieN;
                ieN.setDislikeSource("landing_page");
                this.Of.setCallback(new IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void LD(View view) {
                        TTVideoLandingPageLink2Activity.this.JZE.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void Lxb(View view) {
                        TTVideoLandingPageLink2Activity.this.JZE.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void Lxb(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.Lpq.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.Lpq.set(true);
                        TTVideoLandingPageLink2Activity.this.kqm();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.Of);
            if (this.Ld == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.JXs);
                this.Ld = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kqm() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.Ld) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sLN sln = this.Ns;
        if (sln != null) {
            sln.Lxb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        tD tDVar;
        com.bytedance.sdk.component.QAg.ZU zu;
        super.onCreate(bundle);
        if (!STP.JXs() || (tDVar = this.VVE) == null || (zu = this.Lxb) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.ZU zuLxb = nJ.Lxb(tDVar, zu, this.JXs, this.xan);
        this.jeq = zuLxb;
        if (zuLxb != null) {
            zuLxb.Lxb("landingpage_split_screen");
        }
        this.ae = kqm.ZU().HD();
        if (this.Lxb.getWebView() != null && Build.VERSION.SDK_INT >= 23) {
            this.Lxb.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    JVA jva = TTVideoLandingPageLink2Activity.this.Pw;
                    if (jva != null) {
                        jva.LD(i2);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(this.JXs, this.nBu, this.OY, this.jeq, this.Pw, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.Sv != null && !TTVideoLandingPageLink2Activity.this.Nu) {
                        TTVideoLandingPageLink2Activity.this.Sv.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.bG != null) {
                        TTVideoLandingPageLink2Activity.this.bG.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.FD = true;
                    TTVideoLandingPageLink2Activity.this.STP();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tTVideoLandingPageLink2Activity.VVE, tTVideoLandingPageLink2Activity.xan, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.wbY, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.wbY = System.currentTimeMillis();
            }
        };
        this.nTb = jXs;
        jXs.Lxb(this.VVE);
        this.Lxb.setWebViewClient(this.nTb);
        this.Lxb.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.nBu, this.Pw, this.jeq) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.ae && TTVideoLandingPageLink2Activity.this.xr != null && i == 100) {
                    TTVideoLandingPageLink2Activity.this.xr.Lxb(webView, TTVideoLandingPageLink2Activity.this.VU);
                }
                if (TTVideoLandingPageLink2Activity.this.Ns != null) {
                    TTVideoLandingPageLink2Activity.this.Ns.Lxb(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.aE);
        if (textView != null && this.VVE.QAg() != null) {
            textView.setText(this.VVE.QAg().JXs());
        }
        tD tDVar2 = this.VVE;
        STP.lk().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.Nu = true;
                    if (TTVideoLandingPageLink2Activity.this.Ns != null) {
                        TTVideoLandingPageLink2Activity.this.Ns.LD();
                    }
                    TTVideoLandingPageLink2Activity.this.uxf.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.MGT != null) {
                        TTVideoLandingPageLink2Activity.this.MGT.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.FD) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tTVideoLandingPageLink2Activity.VVE, tTVideoLandingPageLink2Activity.xan, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.wbY, false);
                } catch (Exception unused) {
                }
            }
        }, (tDVar2 == null || tDVar2.QAg() == null) ? WorkRequest.MIN_BACKOFF_MILLIS : this.VVE.QAg().Lxb() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    public void onDestroy() {
        STP();
        if (!this.Nu && this.Pw != null && this.Lxb != null && this.Ns.getVisibility() == 8) {
            this.Pw.Lxb(this.Lxb);
        }
        super.onDestroy();
    }

    private void IeN() {
        TTAdDislikeToast tTAdDislikeToast = this.Ld;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NXR() {
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.VVE, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void STP() {
        sLN sln = this.Ns;
        if (sln != null) {
            sln.LD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public boolean JXs() {
        int i = this.NXR;
        return i == 5 || i == 15 || i == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void QAg() {
        super.QAg();
        tD tDVar = this.VVE;
        if (tDVar != null) {
            tDVar.lc(true);
        }
        TextView textView = this.LXE;
        if (textView != null) {
            textView.setText(LD());
            this.LXE.setClickable(true);
            this.LXE.setOnClickListener(this.sRq);
            this.LXE.setOnTouchListener(this.sRq);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void ZU() {
        if (!JXs()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.VVE.uxf().get(0), imageView, this.VVE);
                this.sLN.setVisibility(0);
                this.sLN.removeAllViews();
                this.sLN.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        com.bytedance.sdk.openadsdk.ZU.lk.LD(TTVideoLandingPageLink2Activity.this.VVE, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.ZU();
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar != null) {
            if (lcVar.getNativeVideoController() != null) {
                this.STP.getNativeVideoController().Lxb(false);
                ((com.bytedance.sdk.openadsdk.core.NXR.LD.lk) this.STP.getNativeVideoController()).ebl(false);
                this.sLN.setClickable(true);
                this.sLN.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.NXR();
                        return false;
                    }
                });
            }
            this.STP.getNativeVideoController().Lxb(new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void LD(long j, int i) {
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb() {
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb(long j, int i) {
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
                public void Lxb(long j, long j2) {
                    if (TTVideoLandingPageLink2Activity.this.SS != null) {
                        int iMax = (int) Math.max(0L, (j2 - j) / 1000);
                        TTVideoLandingPageLink2Activity.this.SS.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.SS.setVisibility(8);
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void lk() {
        super.lk();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(com.bytedance.sdk.component.utils.tD.Lxb(kqm.Lxb(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.sLN();
                }
            });
        }
        this.SS = (TextView) findViewById(520093714);
        this.Ns = (sLN) findViewById(com.bytedance.sdk.openadsdk.utils.STP.Ld);
        this.Sv = findViewById(com.bytedance.sdk.openadsdk.utils.STP.Of);
        this.uxf = findViewById(com.bytedance.sdk.openadsdk.utils.STP.le);
        TextView textView2 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.Lpq);
        TextView textView3 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.Ns);
        com.bytedance.sdk.openadsdk.core.widget.kqm kqmVar = (com.bytedance.sdk.openadsdk.core.widget.kqm) findViewById(com.bytedance.sdk.openadsdk.utils.STP.JZE);
        this.LXE = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.Sv);
        if (this.VVE.Lpq() != null && !TextUtils.isEmpty(this.VVE.Lpq().Lxb())) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.VVE.Lpq(), kqmVar, this.VVE);
        }
        textView2.setText(this.VVE.VU());
        textView3.setText(this.VVE.ae());
        findViewById(com.bytedance.sdk.openadsdk.utils.STP.uxf).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.Lxb(tTVideoLandingPageLink2Activity.JXs, tTVideoLandingPageLink2Activity.VVE, tTVideoLandingPageLink2Activity.xan);
            }
        });
        com.bytedance.sdk.component.QAg.ZU zu = this.Lxb;
        if (zu != null && zu.getWebView() != null) {
            nJ.Lxb(this.VVE, this.Lxb);
        }
        boolean zHD = kqm.ZU().HD();
        this.ae = zHD;
        if (zHD) {
            ((com.bytedance.sdk.openadsdk.common.STP) findViewById(com.bytedance.sdk.openadsdk.utils.STP.SS)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(com.bytedance.sdk.openadsdk.utils.STP.Lv);
            this.bG = linearLayout;
            linearLayout.setVisibility(8);
            this.xr = new VVE(this, this.bG, this.Lxb, this.VVE, "landingpage_split_screen");
            if (this.Lxb.getWebView() != null) {
                this.Lxb.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    float Lxb = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.Lxb = motionEvent.getY();
                        }
                        JVA jva = TTVideoLandingPageLink2Activity.this.Pw;
                        if (jva != null) {
                            jva.Lxb(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.jeq != null) {
                            TTVideoLandingPageLink2Activity.this.jeq.Lxb(motionEvent);
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f = this.Lxb;
                            if (y - f > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.xr != null) {
                                    TTVideoLandingPageLink2Activity.this.xr.Lxb();
                                }
                                return false;
                            }
                            if (y - f < -8.0f && TTVideoLandingPageLink2Activity.this.xr != null) {
                                TTVideoLandingPageLink2Activity.this.xr.LD();
                            }
                        }
                        return false;
                    }
                });
            }
        } else if (this.Lxb.getWebView() != null) {
            this.Lxb.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    JVA jva = TTVideoLandingPageLink2Activity.this.Pw;
                    if (jva != null) {
                        jva.Lxb(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.jeq == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.jeq.Lxb(motionEvent);
                    return false;
                }
            });
        }
        sLN sln = this.Ns;
        if (sln != null) {
            sln.Lxb(this.VVE);
        }
    }

    public void sLN() {
        if (isFinishing()) {
            return;
        }
        if (this.Lpq.get()) {
            IeN();
            return;
        }
        if (this.Of == null) {
            VVE();
        }
        IeN ieN = this.Of;
        if (ieN != null) {
            ieN.Lxb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public View Lxb() {
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(this);
        if (Build.VERSION.SDK_INT >= 35) {
            jXs.setFitsSystemWindows(true);
        }
        jXs.setOrientation(1);
        jXs.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(this);
        jXs.addView(lkVar, new LinearLayout.LayoutParams(-1, le.lk(this, 220.0f)));
        View lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(this);
        lkVar2.setId(com.bytedance.sdk.openadsdk.utils.STP.BcA);
        lkVar.addView(lkVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(this);
        jXs2.setOrientation(0);
        jXs2.setPadding(0, le.lk(this, 20.0f), 0, 0);
        lkVar.addView(jXs2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        jXs2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.IeN ieN = new com.bytedance.sdk.openadsdk.core.widget.IeN(this);
        ieN.setId(520093713);
        ieN.setGravity(17);
        ieN.setText(com.bytedance.sdk.component.utils.tD.Lxb(this, "tt_reward_feedback"));
        ieN.setTextColor(-1);
        ieN.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, le.lk(this, 28.0f));
        int iLk = le.lk(this, 16.0f);
        layoutParams2.rightMargin = iLk;
        layoutParams2.leftMargin = iLk;
        jXs2.addView(ieN, layoutParams2);
        com.bytedance.sdk.openadsdk.core.widget.STP stp = new com.bytedance.sdk.openadsdk.core.widget.STP(this);
        stp.setId(com.bytedance.sdk.openadsdk.utils.STP.rW);
        stp.setPadding(le.lk(this, 7.0f), le.lk(this, 7.0f), le.lk(this, 7.0f), le.lk(this, 7.0f));
        stp.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(le.lk(this, 28.0f), le.lk(this, 28.0f));
        layoutParams3.rightMargin = le.lk(this, 12.0f);
        jXs2.addView(stp, layoutParams3);
        ebl eblVar = new ebl(this);
        eblVar.setVisibility(8);
        eblVar.setId(com.bytedance.sdk.openadsdk.utils.STP.Pw);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = le.lk(this, 10.0f);
        jXs.addView(eblVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.Lxb lxb = new com.bytedance.sdk.openadsdk.core.widget.Lxb(this);
        lxb.setId(com.bytedance.sdk.openadsdk.utils.STP.dR);
        lxb.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lxb.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(le.lk(this, 44.0f), le.lk(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = le.lk(this, 5.0f);
        eblVar.addView(lxb, layoutParams5);
        OY oy = new OY(this);
        int i = com.bytedance.sdk.openadsdk.utils.STP.NDz;
        oy.setId(i);
        oy.setBackground(QAg.Lxb(this, "tt_circle_solid_mian"));
        oy.setGravity(17);
        oy.setTextColor(-1);
        oy.setTextSize(2, 19.0f);
        oy.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(le.lk(this, 44.0f), le.lk(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = le.lk(this, 5.0f);
        eblVar.addView(oy, layoutParams6);
        OY oy2 = new OY(this);
        oy2.setId(com.bytedance.sdk.openadsdk.utils.STP.JJ);
        oy2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy2.setEllipsize(truncateAt);
        oy2.setTextColor(Color.parseColor("#e5000000"));
        oy2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = le.lk(this, 5.0f);
        layoutParams7.rightMargin = le.lk(this, 80.0f);
        layoutParams7.addRule(1, i);
        eblVar.addView(oy2, layoutParams7);
        OY oy3 = new OY(this);
        oy3.setId(com.bytedance.sdk.openadsdk.utils.STP.VU);
        oy3.setClickable(true);
        oy3.setMaxLines(1);
        oy3.setEllipsize(truncateAt);
        oy3.setFocusable(true);
        oy3.setGravity(17);
        oy3.setText(com.bytedance.sdk.component.utils.tD.Lxb(this, "tt_video_mobile_go_detail"));
        oy3.setTextColor(-1);
        oy3.setTextSize(2, 14.0f);
        oy3.setPadding(le.lk(this, 2.0f), le.lk(this, 2.0f), le.lk(this, 2.0f), le.lk(this, 2.0f));
        oy3.setBackground(QAg.Lxb(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(le.lk(this, 90.0f), le.lk(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = le.lk(this, 5.0f);
        eblVar.addView(oy3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar3 = new com.bytedance.sdk.openadsdk.core.JXs.lk(this);
        jXs.addView(lkVar3, new LinearLayout.LayoutParams(-1, -1));
        View zu = new com.bytedance.sdk.component.QAg.ZU(this);
        zu.setId(com.bytedance.sdk.openadsdk.utils.STP.sRq);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = le.lk(this, 2.0f);
        lkVar3.addView(zu, layoutParams9);
        ebl eblVar2 = new ebl(this);
        eblVar2.setId(com.bytedance.sdk.openadsdk.utils.STP.Of);
        eblVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        lkVar3.addView(eblVar2, new FrameLayout.LayoutParams(-1, -1));
        View sln = new sLN(this);
        sln.setId(com.bytedance.sdk.openadsdk.utils.STP.Ld);
        eblVar2.addView(sln, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs3 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(this);
        jXs3.setId(com.bytedance.sdk.openadsdk.utils.STP.le);
        jXs3.setOrientation(1);
        jXs3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        eblVar2.addView(jXs3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.kqm kqmVar = new com.bytedance.sdk.openadsdk.core.widget.kqm(this);
        kqmVar.setId(com.bytedance.sdk.openadsdk.utils.STP.JZE);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(le.lk(this, 80.0f), le.lk(this, 80.0f));
        layoutParams11.gravity = 17;
        jXs3.addView(kqmVar, layoutParams11);
        OY oy4 = new OY(this);
        oy4.setId(com.bytedance.sdk.openadsdk.utils.STP.Lpq);
        oy4.setTextColor(Color.parseColor("#161823"));
        oy4.setTextSize(0, le.lk(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = le.lk(this, 12.0f);
        jXs3.addView(oy4, layoutParams12);
        OY oy5 = new OY(this);
        oy5.setId(com.bytedance.sdk.openadsdk.utils.STP.Ns);
        oy5.setTextColor(Color.parseColor("#80161823"));
        oy5.setTextSize(0, le.lk(this, 16.0f));
        oy5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iLk2 = le.lk(this, 60.0f);
        layoutParams13.rightMargin = iLk2;
        layoutParams13.leftMargin = iLk2;
        layoutParams13.topMargin = le.lk(this, 8.0f);
        jXs3.addView(oy5, layoutParams13);
        OY oy6 = new OY(this);
        oy6.setId(com.bytedance.sdk.openadsdk.utils.STP.Sv);
        oy6.setGravity(17);
        oy6.setTextColor(-1);
        oy6.setText(com.bytedance.sdk.component.utils.tD.Lxb(this, "tt_video_mobile_go_detail"));
        oy6.setBackground(QAg.Lxb(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(le.lk(this, 255.0f), le.lk(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = le.lk(this, 32.0f);
        jXs3.addView(oy6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.MGT = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.STP.uxf);
        this.MGT.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, le.lk(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = le.lk(this, 18.0f);
        layoutParams15.bottomMargin = le.lk(this, 61.0f);
        eblVar2.addView(this.MGT, layoutParams15);
        View stp2 = new com.bytedance.sdk.openadsdk.common.STP(this, new com.bytedance.sdk.openadsdk.common.STP.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.STP.Lxb
            public View Lxb(Context context) {
                return new com.bytedance.sdk.openadsdk.common.ebl(context);
            }
        });
        stp2.setId(com.bytedance.sdk.openadsdk.utils.STP.Nu);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, le.lk(this, 48.0f));
        layoutParams16.gravity = 81;
        lkVar3.addView(stp2, layoutParams16);
        View stp3 = new com.bytedance.sdk.openadsdk.common.STP(this, new com.bytedance.sdk.openadsdk.common.STP.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.STP.Lxb
            public View Lxb(Context context) {
                return new com.bytedance.sdk.openadsdk.common.OY(context);
            }
        });
        stp3.setId(com.bytedance.sdk.openadsdk.utils.STP.SS);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, le.lk(this, 44.0f));
        layoutParams17.gravity = 80;
        lkVar3.addView(stp3, layoutParams17);
        return jXs;
    }
}
