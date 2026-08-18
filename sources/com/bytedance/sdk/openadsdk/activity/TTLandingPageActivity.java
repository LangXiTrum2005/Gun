package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.ZU.JVA;
import com.bytedance.sdk.openadsdk.ZU.nBu;
import com.bytedance.sdk.openadsdk.common.IeN;
import com.bytedance.sdk.openadsdk.common.STP;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.hg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.ebl;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.bytedance.sdk.openadsdk.utils.sLN;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTLandingPageActivity extends TTBaseActivity {
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb CG;
    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc DY;
    private String IeN;
    private STP JVA;
    private int KPU;
    IeN LD;
    JVA Lxb;
    private com.bytedance.sdk.openadsdk.core.JXs.lc NXR;
    private ImageView OY;
    private TextView QAg;
    private String STP;
    private String Sfi;
    private Ivz VVE;
    private ILoader aH;
    private String brP;
    private String eK;
    private int foI;
    private sLN hg;
    private int kqm;
    private com.bytedance.sdk.component.QAg.ZU lc;
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs le;
    TTAdDislikeToast lk;
    private Context nBu;
    private com.bytedance.sdk.openadsdk.common.sLN nE;
    private com.bytedance.sdk.openadsdk.common.ZU nJ;
    private Button sLN;
    private tD tD;
    private boolean xan;
    private final AtomicBoolean HD = new AtomicBoolean(true);
    private final AtomicInteger CSn = new AtomicInteger(0);
    private final AtomicInteger id = new AtomicInteger(0);
    private final AtomicInteger Ivz = new AtomicInteger(0);
    final AtomicBoolean ZU = new AtomicBoolean(false);
    final AtomicBoolean JXs = new AtomicBoolean(false);
    private String BcA = "ダウンロード";

    public static class LD implements View.OnScrollChangeListener {
        private final WeakReference<JVA> Lxb;

        public LD(JVA jva) {
            this.Lxb = new WeakReference<>(jva);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            JVA jva = this.Lxb.get();
            if (jva != null) {
                jva.LD(i2);
            }
        }
    }

    public static class Lxb implements nBu {
        private final tD LD;
        private final int Lxb;
        private final WeakReference<TTLandingPageActivity> ZU;
        private final String lk;

        public Lxb(int i, tD tDVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.Lxb = i;
            this.LD = tDVar;
            this.lk = str;
            this.ZU = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.ZU.nBu
        public void Lxb(int i) {
            TTLandingPageActivity tTLandingPageActivity = this.ZU.get();
            if (tTLandingPageActivity != null) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(this.Lxb, tTLandingPageActivity.id.get(), tTLandingPageActivity.Ivz.get(), tTLandingPageActivity.CSn.get() - tTLandingPageActivity.Ivz.get(), this.LD, this.lk, i);
            }
        }
    }

    public static class lk implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.common.ZU> LD;
        private final WeakReference<JVA> Lxb;

        public lk(JVA jva, com.bytedance.sdk.openadsdk.common.ZU zu) {
            this.Lxb = new WeakReference<>(jva);
            this.LD = new WeakReference<>(zu);
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            JVA jva = this.Lxb.get();
            if (jva != null) {
                jva.Lxb(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.ZU zu = this.LD.get();
            if (zu == null) {
                return false;
            }
            zu.Lxb(motionEvent);
            return false;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (ebl() && !this.HD.getAndSet(true)) {
            OY();
            LD(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        lk();
    }

    @Override // android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public void onCreate(@Nullable Bundle bundle) {
        Lxb(3);
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.STP.JXs()) {
            finish();
            return;
        }
        try {
            kqm.LD(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            setContentView(LD());
            Intent intent = getIntent();
            int intExtra = intent.getIntExtra("sdk_version", 1);
            this.STP = intent.getStringExtra("adid");
            this.IeN = intent.getStringExtra("log_extra");
            this.kqm = intent.getIntExtra("source", -1);
            String stringExtra = intent.getStringExtra("url");
            this.Sfi = stringExtra;
            LD(4);
            String stringExtra2 = intent.getStringExtra("web_title");
            this.brP = intent.getStringExtra("event_tag");
            this.eK = intent.getStringExtra("gecko_id");
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.tD = com.bytedance.sdk.openadsdk.core.LD.Lxb(new JSONObject(stringExtra3));
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.tD = aH.Lxb().LD();
                aH.Lxb().lc();
            }
            if (this.tD == null) {
                finish();
                return;
            }
            JXs();
            if (!TextUtils.isEmpty(this.eK)) {
                this.aH = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().LD();
                int iLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.aH, this.eK);
                this.foI = iLxb;
                this.KPU = iLxb > 0 ? 2 : 0;
            }
            this.nBu = this;
            if (this.lc != null) {
                com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(this).Lxb(false).LD(false).Lxb(this.lc.getWebView());
            }
            com.bytedance.sdk.component.QAg.ZU zu = this.lc;
            if (zu != null && zu.getWebView() != null) {
                JVA jvaLxb = new JVA(this.tD, this.lc.getWebView(), new Lxb(this.foI, this.tD, "landingpage", this), this.KPU).Lxb(true);
                this.Lxb = jvaLxb;
                this.CG = jvaLxb.Lxb;
                this.nJ = nJ.Lxb(this.tD, this.lc, this.nBu, this.brP);
            }
            lc();
            this.lc.setLandingPage(true);
            this.lc.setTag("landingpage");
            this.lc.setMaterialMeta(this.tD.Bg());
            com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(this.nBu, this.VVE, this.STP, this.nJ, this.Lxb, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.NXR != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.NXR.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.nE != null) {
                        TTLandingPageActivity.this.nE.LD();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.eK)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.CSn.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(TTLandingPageActivity.this.aH, TTLandingPageActivity.this.eK, str);
                        if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.Ivz.incrementAndGet();
                            return webResourceResponseModelLxb.getWebResourceResponse();
                        }
                        if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getMsg() == 2) {
                            TTLandingPageActivity.this.id.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.le = jXs;
            jXs.Lxb(this.tD);
            this.lc.setWebViewClient(this.le);
            com.bytedance.sdk.component.QAg.ZU zu2 = this.lc;
            if (zu2 != null) {
                zu2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.kqm.Lxb(zu2.getWebView(), intExtra));
            }
            int i = Build.VERSION.SDK_INT;
            com.bytedance.sdk.component.QAg.ZU zu3 = this.lc;
            if (zu3 != null) {
                zu3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.tD, "landingpage", this.KPU);
            com.bytedance.sdk.openadsdk.utils.tD.Lxb(this.lc, stringExtra);
            this.lc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.VVE, this.Lxb, this.nJ) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i2) {
                    super.onProgressChanged(webView, i2);
                    if (TTLandingPageActivity.this.nE != null) {
                        TTLandingPageActivity.this.nE.Lxb(i2);
                    }
                    if (TTLandingPageActivity.this.NXR == null || TTLandingPageActivity.this.isFinishing()) {
                        return;
                    }
                    if (i2 == 100 && TTLandingPageActivity.this.NXR.isShown()) {
                        TTLandingPageActivity.this.NXR.setVisibility(8);
                    } else {
                        TTLandingPageActivity.this.NXR.setProgress(i2);
                    }
                }
            });
            if (this.lc.getWebView() != null) {
                if (i >= 23) {
                    this.lc.getWebView().setOnScrollChangeListener(new LD(this.Lxb));
                }
                this.lc.getWebView().setOnTouchListener(new lk(this.Lxb, this.nJ));
            }
            this.lc.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (TTLandingPageActivity.this.DY != null) {
                        TTLandingPageActivity.this.DY.ZU();
                    }
                }
            });
            TextView textView = this.QAg;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = com.bytedance.sdk.component.utils.tD.Lxb(this, "tt_web_title_default");
                }
                textView.setText(stringExtra2);
            }
            lk();
            sLN slnLxb = ebl.Lxb(this, new ebl.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // com.bytedance.sdk.openadsdk.utils.ebl.Lxb
                public void LD() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ebl.Lxb
                public View Lxb() {
                    return TTLandingPageActivity.this.OY;
                }
            });
            this.hg = slnLxb;
            slnLxb.Lxb(0L);
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(SystemClock.elapsedRealtime() - jElapsedRealtime, this.tD, "landingpage", this.aH, this.eK);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.QAg.ZU zu;
        super.onDestroy();
        JVA jva = this.Lxb;
        if (jva != null && (zu = this.lc) != null) {
            jva.Lxb(zu);
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.QAg.ZU zu2 = this.lc;
        if (zu2 != null) {
            hg.Lxb(zu2.getWebView());
        }
        this.lc = null;
        Ivz ivz = this.VVE;
        if (ivz != null) {
            ivz.JVA();
        }
        JVA jva2 = this.Lxb;
        if (jva2 != null) {
            jva2.lk(true);
        }
        if (!TextUtils.isEmpty(this.eK)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(this.Ivz.get(), this.CSn.get(), this.tD);
        }
        com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.aH);
        sLN sln = this.hg;
        if (sln != null) {
            sln.lk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        sLN sln = this.hg;
        if (sln != null) {
            sln.LD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Ivz ivz = this.VVE;
        if (ivz != null) {
            ivz.nBu();
        }
        JVA jva = this.Lxb;
        if (jva != null) {
            jva.ebl();
        }
        if (!this.xan) {
            this.xan = true;
            Lxb(4);
        }
        sLN sln = this.hg;
        if (sln != null) {
            sln.Lxb();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.lk.Lxb(this, this.tD);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        JVA jva = this.Lxb;
        if (jva != null) {
            jva.OY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void JVA() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.lk) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void JXs() {
        com.bytedance.sdk.component.QAg.ZU zu = (com.bytedance.sdk.component.QAg.ZU) findViewById(com.bytedance.sdk.openadsdk.utils.STP.sRq);
        this.lc = zu;
        nJ.Lxb(this.tD, zu);
        this.JVA = (STP) findViewById(com.bytedance.sdk.openadsdk.utils.STP.Nu);
        STP stp = (STP) findViewById(com.bytedance.sdk.openadsdk.utils.STP.LXE);
        com.bytedance.sdk.openadsdk.common.sLN sln = (com.bytedance.sdk.openadsdk.common.sLN) findViewById(520093721);
        this.nE = sln;
        if (sln != null) {
            sln.Lxb(this.tD);
            this.nE.Lxb();
        }
        if (stp != null) {
            stp.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(520093720);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.lc != null) {
                        if (TTLandingPageActivity.this.CG != null) {
                            TTLandingPageActivity.this.CG.Lxb();
                        }
                        if (TTLandingPageActivity.this.lc.JXs()) {
                            TTLandingPageActivity.this.lc.lc();
                        } else if (TTLandingPageActivity.this.ebl()) {
                            TTLandingPageActivity.this.onBackPressed();
                        } else {
                            TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(520093716);
        this.OY = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.QAg = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.AcC);
        com.bytedance.sdk.openadsdk.core.JXs.lc lcVar = (com.bytedance.sdk.openadsdk.core.JXs.lc) findViewById(com.bytedance.sdk.openadsdk.utils.STP.ae);
        this.NXR = lcVar;
        if (lcVar != null) {
            lcVar.setVisibility(0);
        }
        View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.STP.Hu);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.Lxb();
                }
            });
        }
    }

    private View LD() {
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(this);
        if (Build.VERSION.SDK_INT >= 35) {
            lkVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(this);
        jXs.setOrientation(1);
        lkVar.addView(jXs, new FrameLayout.LayoutParams(-1, -1));
        View stp = new STP(this, new STP.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.common.STP.Lxb
            public View Lxb(Context context) {
                return new com.bytedance.sdk.openadsdk.common.nBu(context);
            }
        });
        stp.setId(com.bytedance.sdk.openadsdk.utils.STP.LXE);
        jXs.addView(stp, new LinearLayout.LayoutParams(-1, le.lk(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        jXs.addView(lkVar2, layoutParams);
        com.bytedance.sdk.component.QAg.ZU zu = new com.bytedance.sdk.component.QAg.ZU(this);
        zu.setId(com.bytedance.sdk.openadsdk.utils.STP.sRq);
        lkVar2.addView(zu, new FrameLayout.LayoutParams(-1, -1));
        STP stp2 = new STP(this, new STP.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.common.STP.Lxb
            public View Lxb(Context context) {
                return new com.bytedance.sdk.openadsdk.common.ebl(context);
            }
        });
        stp2.setId(com.bytedance.sdk.openadsdk.utils.STP.Nu);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        lkVar2.addView(stp2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.lc lcVar = new com.bytedance.sdk.openadsdk.core.JXs.lc(this, null, R.style.Widget.ProgressBar.Horizontal);
        lcVar.setId(com.bytedance.sdk.openadsdk.utils.STP.ae);
        lcVar.setProgress(1);
        lcVar.setVisibility(8);
        lcVar.setProgressDrawable(QAg.Lxb(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, le.lk(this, 3.0f));
        layoutParams3.gravity = 49;
        lkVar2.addView(lcVar, layoutParams3);
        View sln = new com.bytedance.sdk.openadsdk.common.sLN(this);
        sln.setId(520093721);
        lkVar.addView(sln, new FrameLayout.LayoutParams(-1, -1));
        return lkVar;
    }

    private void Lxb(int i) {
        int i2;
        if (i == 1 || (i2 = Build.VERSION.SDK_INT) == 26) {
            return;
        }
        if (i2 != 27) {
            setRequestedOrientation(i);
        } else {
            try {
                setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        }
    }

    private void OY() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.VVE.Lxb("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void QAg() {
        try {
            if (this.LD == null) {
                IeN ieN = new IeN(this.nBu, this.tD);
                this.LD = ieN;
                ieN.setDislikeSource("landing_page");
                this.LD.setCallback(new IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void LD(View view) {
                        TTLandingPageActivity.this.ZU.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void Lxb(View view) {
                        TTLandingPageActivity.this.ZU.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                    public void Lxb(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.JXs.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.JXs.set(true);
                        TTLandingPageActivity.this.JVA();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.LD);
            if (this.lk == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.nBu);
                this.lk = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private String ZU() {
        tD tDVar = this.tD;
        if (tDVar != null && !TextUtils.isEmpty(tDVar.xr())) {
            this.BcA = this.tD.xr();
        }
        return this.BcA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ebl() {
        return !TextUtils.isEmpty(this.Sfi) && this.Sfi.contains("__luban_sdk");
    }

    private void lc() {
        Ivz ivz = new Ivz(this);
        this.VVE = ivz;
        ivz.LD(this.lc).lk(this.STP).ZU(this.IeN).Lxb(this.tD).LD(this.kqm).Lxb(this.tD.BcA()).JXs(this.tD.cf()).Lxb(this.lc).LD("landingpage");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void lk() {
        tD tDVar = this.tD;
        if (tDVar == null || tDVar.sRq() != 4) {
            return;
        }
        STP stp = this.JVA;
        if (stp != null) {
            stp.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.STP.gS);
        this.sLN = button;
        if (button != null) {
            Lxb(ZU());
            if (this.DY == null) {
                this.DY = com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(this, this.tD, TextUtils.isEmpty(this.brP) ? nJ.LD(this.kqm) : this.brP);
            }
            com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = new com.bytedance.sdk.openadsdk.core.LD.Lxb(this, this.tD, this.brP, this.kqm);
            lxb.Lxb(false);
            this.sLN.setOnClickListener(lxb);
            this.sLN.setOnTouchListener(lxb);
            lxb.lk(true);
            lxb.Lxb(this.DY);
        }
    }

    private void nBu() {
        TTAdDislikeToast tTAdDislikeToast = this.lk;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private void Lxb(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.sLN) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.sLN == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.sLN.setText(str);
            }
        });
    }

    public void Lxb() {
        if (isFinishing()) {
            return;
        }
        if (this.JXs.get()) {
            nBu();
            return;
        }
        if (this.LD == null) {
            QAg();
        }
        IeN ieN = this.LD;
        if (ieN != null) {
            ieN.Lxb();
        }
    }

    private void LD(final int i) {
        if (this.OY == null || !ebl()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                le.Lxb((View) TTLandingPageActivity.this.OY, i);
            }
        });
    }
}
