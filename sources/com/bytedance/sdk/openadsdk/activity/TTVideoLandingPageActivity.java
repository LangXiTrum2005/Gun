package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.JXs.VVE;
import com.bytedance.sdk.component.utils.HD;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.ZU.JVA;
import com.bytedance.sdk.openadsdk.ZU.nBu;
import com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl;
import com.bytedance.sdk.openadsdk.common.STP;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Do0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseActivity implements com.bytedance.sdk.openadsdk.nBu.ZU {
    protected int BcA;
    protected TextView CSn;
    protected RelativeLayout HD;
    protected long IeN;
    protected com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc Ivz;
    protected String JJ;
    protected int JVA;
    protected Context JXs;
    protected Button KPU;
    protected ImageView LD;
    protected com.bytedance.sdk.component.QAg.ZU Lxb;
    private int Ns;
    protected String OY;
    private ILoader Of;
    protected JVA Pw;
    protected String QAg;
    protected com.bytedance.sdk.openadsdk.core.NXR.LD.lc STP;
    private int Sv;
    protected com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb VU;
    protected tD VVE;
    protected TextView ZU;
    protected com.bytedance.sdk.openadsdk.core.widget.Lxb aH;
    protected TextView eK;
    protected STP foI;
    protected TextView id;
    protected int lc;
    protected ImageView lk;
    protected Ivz nBu;
    protected com.bytedance.sdk.openadsdk.multipro.LD.Lxb rW;
    protected FrameLayout sLN;
    protected String xan;
    protected int NXR = -1;
    protected int kqm = 0;
    protected int brP = 0;
    protected int tD = 0;
    protected int DY = 0;
    protected String Sfi = "ダウンロード";
    protected boolean nE = false;
    protected boolean hg = false;
    protected boolean CG = true;
    protected boolean nJ = false;
    protected String le = null;
    protected AtomicBoolean dR = new AtomicBoolean(true);
    protected JSONArray NDz = null;
    private final AtomicInteger Ld = new AtomicInteger(0);
    private final AtomicInteger JZE = new AtomicInteger(0);
    private final AtomicInteger Lpq = new AtomicInteger(0);
    protected com.bytedance.sdk.openadsdk.core.LD.Lxb sRq = null;
    private final Do0 uxf = new Do0() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Do0
        public void Lxb(boolean z) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.nE = z;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z) {
                le.Lxb((View) TTVideoLandingPageActivity.this.Lxb, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.sLN.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.tD;
                marginLayoutParams.height = tTVideoLandingPageActivity2.DY;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.brP;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.kqm;
                tTVideoLandingPageActivity2.sLN.setLayoutParams(marginLayoutParams);
                return;
            }
            le.Lxb((View) TTVideoLandingPageActivity.this.Lxb, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.sLN.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.brP = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.kqm = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.tD = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.DY = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.sLN.setLayoutParams(marginLayoutParams2);
        }
    };
    private final HD.Lxb Nu = new HD.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.HD.Lxb
        public void Lxb(Context context, Intent intent, boolean z, final int i) {
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    Lxb(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lxb(int i) {
            com.bytedance.sdk.component.QAg.ZU zu;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.BcA == 0 && i != 0 && (zu = tTVideoLandingPageActivity.Lxb) != null && (str = tTVideoLandingPageActivity.le) != null) {
                zu.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = TTVideoLandingPageActivity.this.STP;
            if (lcVar != null && lcVar.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.hg && tTVideoLandingPageActivity2.BcA != i) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.LD.lk) tTVideoLandingPageActivity2.STP.getNativeVideoController()).lk(i);
                }
            }
            TTVideoLandingPageActivity.this.BcA = i;
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    public static class Lxb extends AsyncTask<Void, Void, Drawable> {
        private final WeakReference<RG> LD;
        private final Bitmap Lxb;

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap bitmapLxb = com.bytedance.sdk.component.adexpress.ZU.Lxb.Lxb(kqm.Lxb(), this.Lxb, 25);
                if (bitmapLxb == null) {
                    return null;
                }
                return new BitmapDrawable(kqm.Lxb().getResources(), bitmapLxb);
            } catch (Throwable th) {
                sLN.Lxb("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        private Lxb(Bitmap bitmap, RG rg) {
            this.Lxb = bitmap;
            this.LD = new WeakReference<>(rg);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<RG> weakReference;
            if (drawable == null || (weakReference = this.LD) == null || weakReference.get() == null) {
                return;
            }
            this.LD.get().Lxb(drawable);
        }
    }

    private void IeN() {
        if (this.STP == null || VVE()) {
            return;
        }
        this.STP.NXR();
    }

    private void NXR() {
        Ivz ivz = new Ivz(this);
        this.nBu = ivz;
        ivz.LD(this.Lxb).lk(this.OY).ZU(this.QAg).LD(this.JVA).Lxb(this.VVE).Lxb(this.VVE.BcA()).Lxb(this.Lxb).LD("landingpage_split_screen").JXs(this.VVE.cf());
    }

    private void STP() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar == null || lcVar.getNativeVideoController() == null || VVE()) {
            return;
        }
        this.STP.NXR();
    }

    private boolean VVE() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar == null || lcVar.getNativeVideoController() == null) {
            return true;
        }
        return this.STP.getNativeVideoController().IeN();
    }

    private void brP() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.nBu.Lxb("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kqm() {
        return !TextUtils.isEmpty(this.le) && this.le.contains("__luban_sdk");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void sLN() {
        tD tDVar = this.VVE;
        if (tDVar == null || tDVar.sRq() != 4) {
            return;
        }
        this.foI.setVisibility(0);
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.STP.gS);
        this.KPU = button;
        if (button != null) {
            Lxb(LD());
            this.KPU.setOnClickListener(this.sRq);
            this.KPU.setOnTouchListener(this.sRq);
        }
    }

    public void JVA() {
        try {
            HD.Lxb(this.Nu);
        } catch (Exception unused) {
        }
    }

    public abstract boolean JXs();

    public abstract View Lxb();

    public void OY() {
        String strVU;
        tD tDVar = this.VVE;
        if (tDVar == null || tDVar.sRq() != 4) {
            return;
        }
        le.Lxb((View) this.HD, 0);
        if (!TextUtils.isEmpty(this.VVE.FD())) {
            strVU = this.VVE.FD();
        } else if (TextUtils.isEmpty(this.VVE.ae())) {
            strVU = !TextUtils.isEmpty(this.VVE.VU()) ? this.VVE.VU() : "";
        } else {
            strVU = this.VVE.ae();
        }
        if (this.VVE.Lpq() != null && this.VVE.Lpq().Lxb() != null) {
            le.Lxb((View) this.aH, 0);
            le.Lxb((View) this.eK, 4);
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.VVE.Lpq(), this.aH, this.VVE);
        } else if (!TextUtils.isEmpty(strVU)) {
            le.Lxb((View) this.aH, 4);
            le.Lxb((View) this.eK, 0);
            this.eK.setText(strVU.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.VVE.xr())) {
            this.id.setText(this.VVE.xr());
        }
        if (!TextUtils.isEmpty(strVU)) {
            this.CSn.setText(strVU);
        }
        le.Lxb((View) this.CSn, 0);
        le.Lxb((View) this.id, 0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void QAg() {
        tD tDVar = this.VVE;
        if (tDVar == null) {
            return;
        }
        this.Ivz = ebl.Lxb(this, tDVar, this.xan);
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = new com.bytedance.sdk.openadsdk.core.LD.Lxb(this, this.VVE, this.xan, this.JVA);
        this.sRq = lxb;
        lxb.Lxb(false);
        this.sRq.lk(true);
        this.id.setOnClickListener(this.sRq);
        this.id.setOnTouchListener(this.sRq);
        this.sRq.Lxb(this.Ivz);
    }

    public int ebl() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar == null || lcVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.STP.getNativeVideoController().nBu();
    }

    public void nBu() {
        HD.Lxb(this.Nu, this.JXs);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar;
        if (this.nE && (lcVar = this.STP) != null && lcVar.getNativeVideoController() != null) {
            ((FK) this.STP.getNativeVideoController()).JXs(null, null);
            this.nE = false;
        } else if (!kqm() || this.dR.getAndSet(true)) {
            super.onBackPressed();
        } else {
            brP();
            Lxb(0);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sLN();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.STP.JXs()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            kqm.LD(this);
        } catch (Throwable unused2) {
        }
        this.BcA = IeN.lk(getApplicationContext());
        try {
            setContentView(Lxb());
            this.JXs = this;
            Intent intent = getIntent();
            this.lc = intent.getIntExtra("sdk_version", 1);
            this.OY = intent.getStringExtra("adid");
            this.QAg = intent.getStringExtra("log_extra");
            this.JVA = intent.getIntExtra("source", -1);
            this.le = intent.getStringExtra("url");
            String stringExtra = intent.getStringExtra("web_title");
            this.xan = intent.getStringExtra("event_tag");
            this.JJ = intent.getStringExtra("gecko_id");
            this.nJ = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.IeN = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.VVE = com.bytedance.sdk.openadsdk.core.LD.Lxb(new JSONObject(stringExtra3));
                    } catch (Exception unused3) {
                    }
                }
                tD tDVar = this.VVE;
                if (tDVar != null) {
                    this.NXR = tDVar.FGm();
                }
            } else {
                tD tDVarLD = aH.Lxb().LD();
                this.VVE = tDVarLD;
                if (tDVarLD != null) {
                    this.NXR = tDVarLD.FGm();
                }
                aH.Lxb().lc();
            }
            if (this.VVE == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.JJ)) {
                this.Of = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().LD();
                int iLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.Of, this.JJ);
                this.Ns = iLxb;
                this.Sv = iLxb > 0 ? 2 : 0;
            }
            if (stringExtra2 != null) {
                try {
                    this.rW = com.bytedance.sdk.openadsdk.multipro.LD.Lxb.Lxb(new JSONObject(stringExtra2));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.LD.Lxb lxb = this.rW;
                if (lxb != null) {
                    this.IeN = lxb.ebl;
                }
            }
            if (bundle != null) {
                String string = bundle.getString("material_meta");
                if (this.VVE == null) {
                    try {
                        this.VVE = com.bytedance.sdk.openadsdk.core.LD.Lxb(new JSONObject(string));
                    } catch (Throwable unused5) {
                    }
                }
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.IeN = j;
                }
            }
            lk();
            QAg();
            NXR();
            Lxb(4);
            if (this.Lxb != null) {
                com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(this.JXs).Lxb(true).LD(false).Lxb(this.Lxb.getWebView());
                JVA jvaLxb = new JVA(this.VVE, this.Lxb.getWebView(), new nBu() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.ZU.nBu
                    public void Lxb(int i) {
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(TTVideoLandingPageActivity.this.Ns, TTVideoLandingPageActivity.this.Lpq.get(), TTVideoLandingPageActivity.this.JZE.get(), TTVideoLandingPageActivity.this.Ld.get() - TTVideoLandingPageActivity.this.JZE.get(), TTVideoLandingPageActivity.this.VVE, "landingpage_split_screen", i);
                    }
                }, this.Sv).Lxb(true);
                this.Pw = jvaLxb;
                this.VU = jvaLxb.Lxb;
                jvaLxb.Lxb("landingpage_split_screen");
            }
            com.bytedance.sdk.component.QAg.ZU zu = this.Lxb;
            if (zu != null) {
                zu.setLandingPage(true);
                this.Lxb.setTag("landingpage_split_screen");
                this.Lxb.setMaterialMeta(this.VVE.Bg());
                this.Lxb.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(this.JXs, this.nBu, this.OY, this.Pw, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.JJ)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.Ld.incrementAndGet();
                            WebResourceResponseModel webResourceResponseModelLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(TTVideoLandingPageActivity.this.Of, TTVideoLandingPageActivity.this.JJ, str);
                            if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.JZE.incrementAndGet();
                                return webResourceResponseModelLxb.getWebResourceResponse();
                            }
                            if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.Lpq.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th) {
                            sLN.Lxb("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.QAg.ZU zu2 = this.Lxb;
                zu2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.kqm.Lxb(zu2.getWebView(), this.lc));
            }
            com.bytedance.sdk.component.QAg.ZU zu3 = this.Lxb;
            if (zu3 != null) {
                zu3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.VVE, "landingpage_split_screen", this.Sv);
            com.bytedance.sdk.openadsdk.utils.tD.Lxb(this.Lxb, this.le);
            this.Lxb.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.nBu, this.Pw) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.Lxb.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
                    com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar = TTVideoLandingPageActivity.this.Ivz;
                    if (lcVar != null) {
                        lcVar.ZU();
                    }
                }
            });
            TextView textView = this.ZU;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = com.bytedance.sdk.component.utils.tD.Lxb(this, "tt_web_title_default");
                }
                textView.setText(stringExtra);
            }
            nBu();
            ZU();
            sLN();
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(SystemClock.elapsedRealtime() - jElapsedRealtime, this.VVE, "landingpage_split_screen", this.Of, this.JJ);
        } catch (Throwable unused6) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        JVA();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.VVE.lc(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.QAg.ZU zu = this.Lxb;
        if (zu != null) {
            com.bytedance.sdk.openadsdk.core.hg.Lxb(zu.getWebView());
        }
        this.Lxb = null;
        Ivz ivz = this.nBu;
        if (ivz != null) {
            ivz.JVA();
        }
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar != null && lcVar.getNativeVideoController() != null) {
            this.STP.getNativeVideoController().ZU();
        }
        this.STP = null;
        this.VVE = null;
        JVA jva = this.Pw;
        if (jva != null) {
            jva.lk(true);
        }
        if (!TextUtils.isEmpty(this.JJ)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(this.JZE.get(), this.Ld.get(), this.VVE);
        }
        com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.Of);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        IeN();
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar == null || lcVar.getNativeVideoController() == null) {
            return;
        }
        Lxb(this.STP.getNativeVideoController());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.CG) {
            STP();
        }
        this.CG = false;
        Ivz ivz = this.nBu;
        if (ivz != null) {
            ivz.nBu();
        }
        JVA jva = this.Pw;
        if (jva != null) {
            jva.ebl();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        tD tDVar = this.VVE;
        bundle.putString("material_meta", tDVar != null ? tDVar.JD().toString() : null);
        bundle.putLong("video_play_position", this.IeN);
        bundle.putBoolean("is_complete", this.hg);
        long jJXs = this.IeN;
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar != null && lcVar.getNativeVideoController() != null) {
            jJXs = this.STP.getNativeVideoController().JXs();
        }
        bundle.putLong("video_play_position", jJXs);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.lk.Lxb(this, this.VVE);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        JVA jva = this.Pw;
        if (jva != null) {
            jva.OY();
        }
    }

    private void Lxb(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.KPU) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.KPU == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.KPU.setText(str);
            }
        });
    }

    public String LD() {
        tD tDVar = this.VVE;
        if (tDVar != null && !TextUtils.isEmpty(tDVar.xr())) {
            this.Sfi = this.VVE.xr();
        }
        return this.Sfi;
    }

    public void ZU() {
        if (JXs()) {
            try {
                com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = new com.bytedance.sdk.openadsdk.core.NXR.LD.lc(this.JXs, this.VVE, true, null);
                this.STP = lcVar;
                if (lcVar.getNativeVideoController() != null) {
                    this.STP.getNativeVideoController().Lxb(false);
                }
                if (this.hg) {
                    this.sLN.setVisibility(0);
                    this.sLN.removeAllViews();
                    this.sLN.addView(this.STP);
                    this.STP.LD(true);
                } else {
                    if (!this.nJ) {
                        this.IeN = 0L;
                    }
                    if (this.rW != null && this.STP.getNativeVideoController() != null) {
                        this.STP.getNativeVideoController().LD(this.rW.ebl);
                        this.STP.getNativeVideoController().lk(this.rW.JXs);
                        this.STP.setIsQuiet(kqm.ZU().lk(String.valueOf(this.VVE.Td())));
                    }
                    if (this.STP.Lxb(this.IeN, this.CG, this.hg)) {
                        this.sLN.setVisibility(0);
                        this.sLN.removeAllViews();
                        this.sLN.addView(this.STP);
                    }
                    if (this.STP.getNativeVideoController() != null) {
                        this.STP.getNativeVideoController().Lxb(false);
                        this.STP.getNativeVideoController().Lxb(this.uxf);
                    }
                }
                String strLxb = this.VVE.uxf().get(0).Lxb();
                com.bytedance.sdk.openadsdk.QAg.ZU.Lxb().Lxb(strLxb).Lxb(this.VVE.uxf().get(0).LD()).LD(this.VVE.uxf().get(0).lk()).JXs(le.ZU(kqm.Lxb())).ZU(le.lk(kqm.Lxb())).lk(2).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(this.VVE, strLxb, new VVE<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.JXs.VVE
                    public void Lxb(int i, String str, @Nullable Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.JXs.VVE
                    public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
                        try {
                            new Lxb(jva.LD(), TTVideoLandingPageActivity.this.STP.getNativeVideoController().NXR()).execute(new Void[0]);
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.STP.findViewById(520093726).setOnTouchListener(null);
                this.STP.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e) {
                sLN.Lxb("TTVideoLandingPage", e.getMessage());
                if (this.STP == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e);
                }
            }
            if (this.BcA == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.tD.Lxb(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public long lc() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar == null || lcVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.STP.getNativeVideoController().OY();
    }

    public void lk() {
        this.foI = (STP) findViewById(com.bytedance.sdk.openadsdk.utils.STP.Nu);
        this.Lxb = (com.bytedance.sdk.component.QAg.ZU) findViewById(com.bytedance.sdk.openadsdk.utils.STP.sRq);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.LD = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObjectLxb;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.Lxb != null) {
                        com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb lxb = tTVideoLandingPageActivity.VU;
                        if (lxb != null) {
                            lxb.Lxb();
                        }
                        if (TTVideoLandingPageActivity.this.Lxb.JXs()) {
                            TTVideoLandingPageActivity.this.Lxb.lc();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.kqm()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = TTVideoLandingPageActivity.this.STP;
                        if (lcVar == null || lcVar.getNativeVideoController() == null) {
                            jSONObjectLxb = null;
                        } else {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectLxb = nJ.Lxb(tTVideoLandingPageActivity2.VVE, tTVideoLandingPageActivity2.STP.getNativeVideoController().lc(), TTVideoLandingPageActivity.this.STP.getNativeVideoController().sLN());
                        }
                        JSONObject jSONObject = jSONObjectLxb;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tTVideoLandingPageActivity3.VVE, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.lc(), TTVideoLandingPageActivity.this.ebl(), jSONObject, (com.bytedance.sdk.openadsdk.ZU.ebl) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar = this.STP;
        if (lcVar != null) {
            lcVar.setIsAutoPlay(this.nJ);
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.rW);
        this.lk = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObjectLxb;
                    com.bytedance.sdk.openadsdk.core.NXR.LD.lc lcVar2 = TTVideoLandingPageActivity.this.STP;
                    if (lcVar2 != null) {
                        if (lcVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectLxb = nJ.Lxb(tTVideoLandingPageActivity.VVE, tTVideoLandingPageActivity.STP.getNativeVideoController().lc(), TTVideoLandingPageActivity.this.STP.getNativeVideoController().sLN());
                        } else {
                            jSONObjectLxb = null;
                        }
                        JSONObject jSONObject = jSONObjectLxb;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tTVideoLandingPageActivity2.VVE, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.lc(), TTVideoLandingPageActivity.this.ebl(), jSONObject, (com.bytedance.sdk.openadsdk.ZU.ebl) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.ZU = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.AcC);
        this.sLN = (FrameLayout) findViewById(com.bytedance.sdk.openadsdk.utils.STP.BcA);
        this.HD = (RelativeLayout) findViewById(com.bytedance.sdk.openadsdk.utils.STP.Pw);
        this.eK = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.NDz);
        this.CSn = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.JJ);
        this.id = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.STP.VU);
        this.aH = (com.bytedance.sdk.openadsdk.core.widget.Lxb) findViewById(com.bytedance.sdk.openadsdk.utils.STP.dR);
        OY();
    }

    private void Lxb(So0 so0) {
        this.hg = this.hg || so0.IeN();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.hg));
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(so0.JXs()));
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(so0.lc() + so0.OY()));
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_duration", Long.valueOf(so0.OY()));
    }

    private void Lxb(final int i) {
        if (this.lk == null || !kqm()) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                le.Lxb((View) TTVideoLandingPageActivity.this.lk, i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.nBu.ZU
    public void Lxb(boolean z, JSONArray jSONArray) {
        if (!z || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.NDz = jSONArray;
    }
}
