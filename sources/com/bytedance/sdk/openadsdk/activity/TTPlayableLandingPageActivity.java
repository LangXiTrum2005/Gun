package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.ZU.JVA;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.CSn;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.hg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.IeN;
import com.bytedance.sdk.openadsdk.core.widget.STP;
import com.bytedance.sdk.openadsdk.core.widget.nBu;
import com.bytedance.sdk.openadsdk.sLN.ebl;
import com.bytedance.sdk.openadsdk.tD.OY;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.le;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTPlayableLandingPageActivity extends TTBaseActivity implements aH.Lxb, com.bytedance.sdk.openadsdk.core.LD.ZU, ebl {
    private static final com.bytedance.sdk.openadsdk.tD.ebl.Lxb sRq = new com.bytedance.sdk.openadsdk.tD.ebl.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
        @Override // com.bytedance.sdk.openadsdk.tD.ebl.Lxb
        public void Lxb(String str, String str2, Throwable th) {
            sLN.Lxb(str, str2, th);
        }
    };
    private int BcA;
    private Ivz DY;
    private int HD;
    private com.bytedance.sdk.openadsdk.core.JXs.lc IeN;
    private boolean Ivz;
    private com.bytedance.sdk.openadsdk.ZU.ZU.JXs JJ;
    private IeN JVA;
    private com.bytedance.sdk.component.QAg.ZU JXs;
    private com.bytedance.sdk.openadsdk.tD.Lxb.Lxb JZE;
    private boolean KPU;
    TTAdDislikeToast LD;
    private boolean Ld;
    CSn Lxb;
    private Context NXR;
    private OY Pw;
    private int STP;
    private Ivz Sfi;
    private JVA VU;
    private com.bytedance.sdk.openadsdk.core.widget.JVA VVE;
    private String aH;
    private String brP;
    private ILoader dR;
    private String eK;
    private String hg;
    private tD id;
    private nBu kqm;
    private RelativeLayout nBu;
    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc nE;
    private int rW;
    private STP sLN;
    private String tD;
    private boolean lc = true;
    private boolean OY = false;
    private boolean QAg = true;
    final AtomicBoolean lk = new AtomicBoolean(false);
    private final String CSn = "embeded_ad";
    private final aH foI = new aH(Looper.getMainLooper(), this);
    private final AtomicBoolean xan = new AtomicBoolean(false);
    private final AtomicInteger CG = new AtomicInteger(0);
    private final AtomicInteger nJ = new AtomicInteger(0);
    private final AtomicInteger le = new AtomicInteger(0);
    private boolean NDz = false;
    protected com.bytedance.sdk.openadsdk.sLN.ZU ZU = new com.bytedance.sdk.openadsdk.sLN.ZU() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.sLN.ZU
        public void LD() {
            if (eK.STP(TTPlayableLandingPageActivity.this.id) && eK.IeN(TTPlayableLandingPageActivity.this.id)) {
                TTPlayableLandingPageActivity.this.foI.sendMessageDelayed(TTPlayableLandingPageActivity.this.Lxb(0, 0), 1000L);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.sLN.ZU
        public void Lxb() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && eK.STP(TTPlayableLandingPageActivity.this.id) && eK.VVE(TTPlayableLandingPageActivity.this.id)) {
                TTPlayableLandingPageActivity.this.foI.removeMessages(2);
                TTPlayableLandingPageActivity.this.foI.sendMessage(TTPlayableLandingPageActivity.this.Lxb(1, 0));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.sLN.ZU
        public void Lxb(int i) {
            if (!eK.STP(TTPlayableLandingPageActivity.this.id) || TTPlayableLandingPageActivity.this.VVE == null) {
                return;
            }
            TTPlayableLandingPageActivity.this.VVE.setProgress(i);
        }
    };
    private int Of = 1;

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.JJ;
        if (jXs != null) {
            jXs.OY();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(@Nullable Bundle bundle) {
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.STP.JXs()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            kqm.LD(this);
        } catch (Throwable unused) {
        }
        Lxb(bundle);
        tD tDVar = this.id;
        if (tDVar == null) {
            return;
        }
        this.Ld = tDVar.II();
        int iKqm = eK.kqm(this.id);
        if (iKqm == 0) {
            setRequestedOrientation(14);
        } else if (iKqm == 1) {
            setRequestedOrientation(1);
        } else if (iKqm == 2) {
            setRequestedOrientation(0);
            this.Of = 2;
        }
        this.NXR = this;
        try {
            setContentView(ZU());
            QAg();
            lc();
            if (this.Ld) {
                STP();
                this.JZE.Lxb(false, (com.bytedance.sdk.openadsdk.sLN.JXs) null);
            } else {
                Lxb();
                JVA();
                if (!TextUtils.isEmpty(this.hg)) {
                    this.dR = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().LD();
                    int iLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.dR, this.hg);
                    this.BcA = iLxb;
                    this.rW = iLxb > 0 ? 2 : 0;
                }
                OY();
                com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.JJ;
                if (jXs != null) {
                    jXs.ebl();
                }
            }
            ebl();
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(SystemClock.elapsedRealtime() - jElapsedRealtime, this.id, "embeded_ad", this.dR, this.hg);
            if (!this.Ld || (lxb = this.JZE) == null) {
                return;
            }
            lxb.Lxb();
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.JZE;
        if (lxb != null) {
            lxb.ZU();
        }
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.JJ;
        if (jXs != null) {
            jXs.Lxb(true);
            this.JJ.sLN();
        }
        this.foI.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.hg)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(this.nJ.get(), this.CG.get(), this.id);
        }
        com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.dR);
        com.bytedance.sdk.component.QAg.ZU zu = this.JXs;
        if (zu != null) {
            hg.Lxb(zu.getWebView());
            this.JXs.sLN();
        }
        this.JXs = null;
        Ivz ivz = this.DY;
        if (ivz != null) {
            ivz.JVA();
        }
        Ivz ivz2 = this.Sfi;
        if (ivz2 != null) {
            ivz2.JVA();
        }
        OY oy = this.Pw;
        if (oy != null) {
            oy.nJ();
        }
        JVA jva = this.VU;
        if (jva != null) {
            jva.lk(true);
        }
        CSn cSn = this.Lxb;
        if (cSn != null) {
            cSn.LD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Ivz ivz = this.DY;
        if (ivz != null) {
            ivz.LD(false);
        }
        OY oy = this.Pw;
        if (oy != null) {
            oy.Lxb(true);
            this.Pw.lk(false);
        }
        DeviceUtils.AudioInfoReceiver.LD((ebl) this);
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.JZE;
        if (lxb != null) {
            lxb.lk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Ivz ivz = this.DY;
        if (ivz != null) {
            ivz.nBu();
            com.bytedance.sdk.component.QAg.ZU zu = this.JXs;
            if (zu != null) {
                this.DY.LD(zu.getVisibility() == 0);
            }
        }
        Ivz ivz2 = this.Sfi;
        if (ivz2 != null) {
            ivz2.nBu();
        }
        OY oy = this.Pw;
        if (oy != null) {
            oy.lk(true);
        }
        JVA jva = this.VU;
        if (jva != null) {
            jva.ebl();
        }
        DeviceUtils.AudioInfoReceiver.Lxb((ebl) this);
        if (DeviceUtils.ebl() == 0) {
            this.NDz = true;
        }
        lk(this.NDz);
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.JZE;
        if (lxb != null) {
            lxb.LD();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            tD tDVar = this.id;
            bundle.putString("material_meta", tDVar != null ? tDVar.JD().toString() : null);
            bundle.putInt("sdk_version", this.STP);
            bundle.putString("adid", this.brP);
            bundle.putString("log_extra", this.tD);
            bundle.putInt("source", this.HD);
            bundle.putBoolean("ad_pending_download", this.KPU);
            bundle.putString("url", this.eK);
            bundle.putString("web_title", this.aH);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.JJ;
        if (jXs != null) {
            jXs.nBu();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = this.JJ;
        if (jXs != null) {
            jXs.QAg();
        }
        JVA jva = this.VU;
        if (jva != null) {
            jva.OY();
        }
    }

    private void JVA() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.id);
        this.JJ = new com.bytedance.sdk.openadsdk.ZU.kqm(3, "embeded_ad", this.id);
        this.DY = new Ivz(this);
        this.DY.LD(this.JXs).Lxb(this.id).Lxb(arrayList).lk(this.brP).ZU(this.tD).LD("embeded_ad").LD(this.HD).Lxb(this).Lxb(this.JJ).Lxb(this.ZU).Lxb(this.JXs).JXs(this.id.cf());
        JXs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NXR() {
        TTAdDislikeToast tTAdDislikeToast = this.LD;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void OY() {
        com.bytedance.sdk.component.QAg.ZU zu = this.JXs;
        if (zu == null) {
            return;
        }
        zu.setLandingPage(true);
        this.JXs.setTag("landingpage");
        this.JXs.setMaterialMeta(this.id.Bg());
        JVA jvaLxb = new JVA(this.id, this.JXs.getWebView(), new com.bytedance.sdk.openadsdk.ZU.nBu() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.ZU.nBu
            public void Lxb(int i) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(TTPlayableLandingPageActivity.this.BcA, TTPlayableLandingPageActivity.this.le.get(), TTPlayableLandingPageActivity.this.nJ.get(), TTPlayableLandingPageActivity.this.CG.get() - TTPlayableLandingPageActivity.this.nJ.get(), TTPlayableLandingPageActivity.this.id, "embeded_ad", i);
            }
        }, this.rW).Lxb(true);
        this.VU = jvaLxb;
        jvaLxb.Lxb("embeded_ad");
        this.VU.Lxb(this.JJ);
        this.VU.Lxb(this.Pw);
        this.JXs.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(this.NXR, this.DY, this.brP, this.VU, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                TTPlayableLandingPageActivity.this.OY = true;
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if (TTPlayableLandingPageActivity.this.Pw != null) {
                    TTPlayableLandingPageActivity.this.Pw.QAg(str);
                }
                try {
                    TTPlayableLandingPageActivity.this.ZU.LD();
                } catch (Throwable unused) {
                }
                try {
                    if (TTPlayableLandingPageActivity.this.IeN != null) {
                        TTPlayableLandingPageActivity.this.IeN.setVisibility(8);
                    }
                    if (TTPlayableLandingPageActivity.this.lc) {
                        TTPlayableLandingPageActivity.this.nBu();
                        TTPlayableLandingPageActivity.this.Lxb("py_loading_success");
                        Ivz ivz = this.lk;
                        if (ivz != null) {
                            ivz.LD(true);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (Build.VERSION.SDK_INT < 23) {
                    return;
                }
                TTPlayableLandingPageActivity.this.lc = false;
                if (TTPlayableLandingPageActivity.this.Pw == null || webResourceError == null || webResourceRequest == null) {
                    return;
                }
                TTPlayableLandingPageActivity.this.Pw.Lxb(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            @RequiresApi(api = 21)
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (TTPlayableLandingPageActivity.this.eK != null && webResourceRequest != null && webResourceRequest.getUrl() != null && TTPlayableLandingPageActivity.this.eK.equals(webResourceRequest.getUrl().toString())) {
                    TTPlayableLandingPageActivity.this.lc = false;
                }
                if (TTPlayableLandingPageActivity.this.Pw != null && webResourceRequest != null) {
                    try {
                        TTPlayableLandingPageActivity.this.Pw.Lxb(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    } catch (Throwable unused) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (TTPlayableLandingPageActivity.this.Pw != null) {
                        TTPlayableLandingPageActivity.this.Pw.nBu(str);
                    }
                    if (!TextUtils.isEmpty(TTPlayableLandingPageActivity.this.hg)) {
                        TTPlayableLandingPageActivity.this.CG.incrementAndGet();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    WebResourceResponseModel webResourceResponseModelLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(TTPlayableLandingPageActivity.this.dR, TTPlayableLandingPageActivity.this.hg, str);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (TTPlayableLandingPageActivity.this.JJ != null) {
                        com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb Lxb = com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb(str);
                        int i = (webResourceResponseModelLxb == null || webResourceResponseModelLxb.getWebResourceResponse() == null) ? 2 : 1;
                        if (Lxb == com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.HTML) {
                            TTPlayableLandingPageActivity.this.JJ.Lxb(str, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        } else if (Lxb == com.bytedance.sdk.component.adexpress.ZU.nBu.Lxb.JS) {
                            TTPlayableLandingPageActivity.this.JJ.LD(str, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        }
                    }
                    if (webResourceResponseModelLxb == null || webResourceResponseModelLxb.getWebResourceResponse() == null) {
                        if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getMsg() == 2) {
                            TTPlayableLandingPageActivity.this.le.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    }
                    TTPlayableLandingPageActivity.this.nJ.incrementAndGet();
                    if (TTPlayableLandingPageActivity.this.Pw != null) {
                        TTPlayableLandingPageActivity.this.Pw.JVA(str);
                    }
                    return webResourceResponseModelLxb.getWebResourceResponse();
                } catch (Exception unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (Build.VERSION.SDK_INT >= 23) {
                    return;
                }
                TTPlayableLandingPageActivity.this.lc = false;
                if (TTPlayableLandingPageActivity.this.Pw != null) {
                    TTPlayableLandingPageActivity.this.Pw.Lxb(i, str, str2);
                }
            }
        });
        Lxb(this.JXs);
        com.bytedance.sdk.openadsdk.utils.tD.Lxb(this.JXs, this.eK);
        OY oy = this.Pw;
        if (oy != null) {
            oy.OY(this.eK);
        }
        this.JXs.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.DY, this.VU) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.14
            @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    TTPlayableLandingPageActivity.this.ZU.Lxb(i);
                } catch (Throwable unused) {
                }
                if (TTPlayableLandingPageActivity.this.IeN != null) {
                    if (i != 100) {
                        TTPlayableLandingPageActivity.this.IeN.setProgress(i);
                        return;
                    }
                    TTPlayableLandingPageActivity.this.OY = true;
                    TTPlayableLandingPageActivity.this.IeN.setVisibility(8);
                    TTPlayableLandingPageActivity.this.nBu();
                }
            }
        });
        this.JXs.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.15
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (TTPlayableLandingPageActivity.this.VU == null) {
                    return false;
                }
                TTPlayableLandingPageActivity.this.VU.Lxb(motionEvent);
                return false;
            }
        });
    }

    private void QAg() {
        RelativeLayout relativeLayout = this.nBu;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.JJ != null) {
                        TTPlayableLandingPageActivity.this.JJ.OY();
                    }
                    TTPlayableLandingPageActivity.this.foI.sendMessage(TTPlayableLandingPageActivity.this.Lxb(4, 0));
                    TTPlayableLandingPageActivity.this.Lxb("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        IeN ieN = this.JVA;
        if (ieN != null) {
            ieN.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.LD();
                }
            });
        }
        STP stp = this.sLN;
        if (stp != null) {
            stp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.NDz = !tTPlayableLandingPageActivity.NDz;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity2.lk(tTPlayableLandingPageActivity2.NDz);
                    if (TTPlayableLandingPageActivity.this.Pw != null) {
                        TTPlayableLandingPageActivity.this.Pw.Lxb(TTPlayableLandingPageActivity.this.NDz);
                    }
                }
            });
        }
        if (this.Ld) {
            return;
        }
        this.JXs.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        le.Lxb((View) this.JXs, 4);
        this.VVE.LD(this.id, this.Of);
    }

    private void STP() {
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = new com.bytedance.sdk.openadsdk.core.LD.Lxb(this, this.id, "embeded_ad", this.HD) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
            @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb, com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
            public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, boolean z) {
                tD tDVar = ((com.bytedance.sdk.openadsdk.core.LD.LD) this).lc;
                if (tDVar == null || tDVar.DY() != 1 || z) {
                    super.Lxb(view, f, f2, f3, f4, sparseArray, z);
                    TTPlayableLandingPageActivity.this.KPU = true;
                    TTPlayableLandingPageActivity.this.Ivz = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.eK);
                    } catch (JSONException e) {
                        sLN.Lxb("TTPWPActivity", "onClick JSON ERROR", e);
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(TTPlayableLandingPageActivity.this.id, ((com.bytedance.sdk.openadsdk.core.LD.LD) this).ebl, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        lxb.Lxb(this.nE);
        com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb2 = this.JZE;
        if (lxb2 != null) {
            lxb2.Lxb(lxb);
        }
    }

    private void ebl() {
        int i = kqm.ZU().foI(String.valueOf(this.id.Td())).kqm;
        if (i >= 0) {
            this.foI.sendEmptyMessageDelayed(1, ((long) i) * 1000);
        } else {
            le.Lxb((View) this.nBu, 0);
        }
    }

    private void lc() {
        if (this.id.sRq() == 4) {
            this.nE = com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(this.NXR, this.id, "interaction");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nBu() {
        if (this.xan.getAndSet(true)) {
            return;
        }
        if (!eK.eK(this.id) || (this.OY && this.lc)) {
            com.bytedance.sdk.component.QAg.ZU zu = this.JXs;
            if (zu == null || this.VVE == null) {
                return;
            }
            le.Lxb((View) zu, 0);
            le.Lxb((View) this.VVE, 8);
            return;
        }
        if (this.kqm == null || this.VVE == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = new com.bytedance.sdk.openadsdk.core.LD.Lxb(this, this.id, "embeded_ad", this.HD);
        lxb.Lxb(this.nE);
        this.kqm.Lxb(this.id, "embeded_ad", lxb);
        le.Lxb((View) this.kqm, 0);
        le.Lxb((View) this.VVE, 8);
        le.Lxb((View) this.sLN, 8);
    }

    private void sLN() {
        TTAdDislikeToast tTAdDislikeToast = this.LD;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    private void JXs() {
        if (this.Pw != null) {
            return;
        }
        if (QAg.LD().kqm()) {
            com.bytedance.sdk.openadsdk.tD.ebl.Lxb(sRq);
        }
        com.bytedance.sdk.openadsdk.tD.Lxb lxb = new com.bytedance.sdk.openadsdk.tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.tD.Lxb
            public void Lxb(int i, String str) {
                super.Lxb(i, str);
                if (eK.eK(TTPlayableLandingPageActivity.this.id)) {
                    TTPlayableLandingPageActivity.this.foI.sendMessage(TTPlayableLandingPageActivity.this.Lxb(3, eK.Lxb(i)));
                    TTPlayableLandingPageActivity.this.nBu();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tD.Lxb
            public com.bytedance.sdk.openadsdk.tD.ZU Lxb() {
                String strLc = com.bytedance.sdk.openadsdk.common.LD.lc();
                strLc.getClass();
                switch (strLc) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tD.Lxb
            public void Lxb(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.ZU.lk.LD(TTPlayableLandingPageActivity.this.id, "embeded_ad", "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.tD.lk lkVar = new com.bytedance.sdk.openadsdk.tD.lk() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10
            @Override // com.bytedance.sdk.openadsdk.tD.lk
            public void Lxb(String str, JSONObject jSONObject) {
                TTPlayableLandingPageActivity.this.DY.Lxb(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.brP);
            jSONObject.put("log_extra", this.tD);
            this.Pw = OY.Lxb(getApplicationContext(), this.JXs.getWebView(), lkVar, lxb).ebl(this.eK).JXs(com.bytedance.sdk.openadsdk.common.LD.Lxb(kqm.Lxb())).Lxb(com.bytedance.sdk.openadsdk.common.LD.Lxb()).lk(jSONObject).LD(com.bytedance.sdk.openadsdk.common.LD.JXs()).Lxb("sdkEdition", com.bytedance.sdk.openadsdk.common.LD.lk()).ZU(com.bytedance.sdk.openadsdk.common.LD.ZU()).ZU(false).Lxb(this.NDz).Lxb(eK.DY(this.id)).LD(eK.DY(this.id)).JXs(true);
        } catch (Throwable unused) {
        }
        if (this.Pw == null) {
            sLN.Lxb("Pangle", "new PlayablePlugin Object failed, mPlayablePlugin is null");
            return;
        }
        if (!TextUtils.isEmpty(eK.JVA(this.id))) {
            this.Pw.lk(eK.JVA(this.id));
        }
        Set<String> setJVA = this.Pw.JVA();
        final WeakReference weakReference = new WeakReference(this.Pw);
        for (String str : setJVA) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str)) {
                this.DY.Lxb().Lxb(str, new com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.11
                    @Override // com.bytedance.sdk.component.Lxb.JXs
                    public JSONObject Lxb(@NonNull JSONObject jSONObject2, @NonNull com.bytedance.sdk.component.Lxb.lc lcVar) {
                        try {
                            OY oy = (OY) weakReference.get();
                            if (oy == null) {
                                return null;
                            }
                            return oy.ZU(Lxb(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private View ZU() {
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(this);
        lkVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (this.Ld) {
            this.JZE = new com.bytedance.sdk.openadsdk.tD.Lxb.Lxb(this.NXR, this.id, this.Of, this.NDz, lkVar, true);
        } else {
            this.JXs = new com.bytedance.sdk.component.QAg.ZU(this);
            this.JXs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.JXs.setVisibility(4);
            this.IeN = new com.bytedance.sdk.openadsdk.core.JXs.lc(this, null, R.style.Widget.ProgressBar.Horizontal);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, le.lk(this, 3.0f));
            layoutParams.gravity = 49;
            this.IeN.setLayoutParams(layoutParams);
            this.IeN.setProgress(1);
            this.IeN.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(this, "tt_browser_progress_style"));
            this.VVE = new com.bytedance.sdk.openadsdk.core.widget.JVA(this);
            this.VVE.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.VVE.setClickable(true);
            this.VVE.setFocusable(true);
            this.kqm = new nBu(this);
            this.kqm.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.sLN = new STP(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(le.lk(this, 28.0f), le.lk(this, 28.0f));
        layoutParams2.leftMargin = le.lk(this, 12.0f);
        layoutParams2.topMargin = le.lk(this, 20.0f);
        this.sLN.setLayoutParams(layoutParams2);
        this.sLN.setScaleType(ImageView.ScaleType.CENTER);
        this.sLN.setImageDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(this, "tt_unmute_wrapper"));
        this.JVA = new IeN(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, le.lk(this, 28.0f));
        layoutParams3.gravity = 8388661;
        layoutParams3.leftMargin = le.lk(this, 16.0f);
        layoutParams3.rightMargin = le.lk(this, 80.0f);
        layoutParams3.topMargin = le.lk(this, 20.0f);
        this.JVA.setLayoutParams(layoutParams3);
        this.JVA.setGravity(17);
        this.JVA.setText(com.bytedance.sdk.component.utils.tD.Lxb(this, "tt_reward_feedback"));
        this.JVA.setTextColor(-1);
        this.JVA.setTextSize(14.0f);
        this.nBu = new com.bytedance.sdk.openadsdk.core.JXs.ebl(this);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(le.lk(this, 28.0f), le.lk(this, 28.0f));
        layoutParams4.gravity = 8388661;
        layoutParams4.topMargin = le.lk(this, 20.0f);
        layoutParams4.rightMargin = le.lk(this, 24.0f);
        this.nBu.setLayoutParams(layoutParams4);
        this.nBu.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(this, "tt_mute_btn_bg"));
        this.nBu.setGravity(17);
        this.nBu.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(this);
        zu.setLayoutParams(new RelativeLayout.LayoutParams(le.lk(this, 12.0f), le.lk(this, 12.0f)));
        zu.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(this, "tt_video_close_drawable"));
        zu.setVisibility(0);
        this.nBu.addView(zu);
        if (!this.Ld) {
            lkVar.addView(this.JXs);
            lkVar.addView(this.IeN);
            lkVar.addView(this.kqm);
            lkVar.addView(this.VVE);
        }
        lkVar.addView(this.sLN);
        lkVar.addView(this.JVA);
        lkVar.addView(this.nBu);
        return lkVar;
    }

    public void LD() {
        if (this.id == null || isFinishing()) {
            return;
        }
        if (this.lk.get()) {
            sLN();
            return;
        }
        if (this.Lxb == null) {
            lk();
        }
        this.Lxb.Lxb(new CSn.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.CSn.Lxb
            public void Lxb() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.CSn.Lxb
            public void Lxb(int i, String str) {
                if (TTPlayableLandingPageActivity.this.lk.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.lk.set(true);
                TTPlayableLandingPageActivity.this.NXR();
            }
        });
        CSn cSn = this.Lxb;
        if (cSn != null) {
            cSn.Lxb();
        }
    }

    public void lk() {
        tD tDVar = this.id;
        if (tDVar != null) {
            this.Lxb = new com.bytedance.sdk.openadsdk.lk.lk(this, tDVar.Lv(), this.id.Wi(), this.id.JD().toString(), "playable");
        }
        if (this.LD == null) {
            this.LD = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.LD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message Lxb(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    private void Lxb(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.STP = intent.getIntExtra("sdk_version", 1);
            this.brP = intent.getStringExtra("adid");
            this.tD = intent.getStringExtra("log_extra");
            this.HD = intent.getIntExtra("source", -1);
            this.KPU = intent.getBooleanExtra("ad_pending_download", false);
            this.eK = intent.getStringExtra("url");
            this.hg = intent.getStringExtra("gecko_id");
            this.aH = intent.getStringExtra("web_title");
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.id = com.bytedance.sdk.openadsdk.core.LD.Lxb(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        sLN.Lxb("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.id = com.bytedance.sdk.openadsdk.core.aH.Lxb().LD();
                com.bytedance.sdk.openadsdk.core.aH.Lxb().lc();
            }
        }
        if (bundle != null) {
            try {
                this.STP = bundle.getInt("sdk_version", 1);
                this.brP = bundle.getString("adid");
                this.tD = bundle.getString("log_extra");
                this.HD = bundle.getInt("source", -1);
                this.KPU = bundle.getBoolean("ad_pending_download", false);
                this.eK = bundle.getString("url");
                this.aH = bundle.getString("web_title");
                String string = bundle.getString("material_meta", null);
                if (!TextUtils.isEmpty(string)) {
                    this.id = com.bytedance.sdk.openadsdk.core.LD.Lxb(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.id == null) {
            sLN.Lxb("TTPWPActivity", "material is null, no data to display");
            finish();
        } else {
            try {
                this.NDz = kqm.ZU().kqm(this.id.hg().getCodeId());
            } catch (Throwable th) {
                sLN.Lxb("TTPWPActivity", th.getMessage());
            }
        }
    }

    public void lk(boolean z) {
        Drawable drawableLxb;
        try {
            this.NDz = z;
            if (z) {
                drawableLxb = com.bytedance.sdk.openadsdk.utils.QAg.Lxb(this.NXR, "tt_mute_wrapper");
            } else {
                drawableLxb = com.bytedance.sdk.openadsdk.utils.QAg.Lxb(this.NXR, "tt_unmute_wrapper");
            }
            this.sLN.setImageDrawable(drawableLxb);
            OY oy = this.Pw;
            if (oy != null) {
                oy.Lxb(z);
            }
            com.bytedance.sdk.openadsdk.tD.Lxb.Lxb lxb = this.JZE;
            if (lxb != null) {
                lxb.Lxb(z);
            }
        } catch (Exception e) {
            sLN.Lxb("TTPWPActivity", e.getMessage());
        }
    }

    public void Lxb() {
        if (this.VVE == null) {
            return;
        }
        tD tDVar = this.id;
        if (tDVar != null && !eK.STP(tDVar)) {
            this.VVE.lk();
            return;
        }
        this.VVE.LD(this.id, this.Of);
        if (this.VVE.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = new com.bytedance.sdk.openadsdk.core.LD.Lxb(this, this.id, "embeded_ad", this.HD) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb, com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
                public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, boolean z) {
                    tD tDVar2 = ((com.bytedance.sdk.openadsdk.core.LD.LD) this).lc;
                    if (tDVar2 == null || tDVar2.DY() != 1 || z) {
                        super.Lxb(view, f, f2, f3, f4, sparseArray, z);
                        TTPlayableLandingPageActivity.this.KPU = true;
                        TTPlayableLandingPageActivity.this.Ivz = true;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.eK);
                        } catch (JSONException e) {
                            sLN.Lxb("TTPWPActivity", "onClick JSON ERROR", e);
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.LD(TTPlayableLandingPageActivity.this.id, ((com.bytedance.sdk.openadsdk.core.LD.LD) this).ebl, "click_playable_download_button_loading", jSONObject);
                    }
                }
            };
            lxb.Lxb(this.nE);
            this.VVE.getDownloadButton().setOnClickListener(lxb);
        }
        if (eK.VVE(this.id)) {
            this.foI.sendMessageDelayed(Lxb(2, eK.Lxb(2)), eK.Sfi(this.id));
        }
    }

    private void Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(this.NXR).Lxb(false).LD(false).Lxb(zu.getWebView());
        zu.setUserAgentString(com.bytedance.sdk.openadsdk.utils.kqm.Lxb(zu.getWebView(), this.STP));
        zu.setMixedContentMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str) {
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), this.id, "embeded_ad", str);
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        int i = message.what;
        if (i == 1) {
            le.Lxb((View) this.nBu, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.JVA jva = this.VVE;
        if (jva == null || !jva.ZU()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i2 = message.arg2;
                if (i2 != 0) {
                    jSONObject.put("remove_loading_page_reason", i2);
                }
                jSONObject.put("playable_url", this.eK);
                com.bytedance.sdk.openadsdk.core.widget.JVA jva2 = this.VVE;
                jSONObject.put("duration", jva2 != null ? jva2.getDisplayDuration() : 0L);
            } catch (JSONException e) {
                sLN.Lxb("TTPWPActivity", "handleMsg json error", e);
            }
            com.bytedance.sdk.openadsdk.ZU.lk.LD(this.id, "embeded_ad", "remove_loading_page", jSONObject);
            this.foI.removeMessages(2);
            com.bytedance.sdk.openadsdk.core.widget.JVA jva3 = this.VVE;
            if (jva3 != null) {
                jva3.lk();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.ZU
    public void Lxb(boolean z) {
        com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar;
        this.KPU = true;
        this.Ivz = z;
        if (!z) {
            try {
                Toast.makeText(this.NXR, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.Ivz || (lcVar = this.nE) == null) {
            return;
        }
        lcVar.ZU();
    }

    @Override // com.bytedance.sdk.openadsdk.sLN.ebl
    public void Lxb(int i) {
        lk(i <= 0);
    }
}
