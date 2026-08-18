package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.common.IeN;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.QAg.OY;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.eK;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.utils.CG;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements aH.Lxb {
    private static com.bytedance.sdk.openadsdk.Lxb.ZU.LD OY;
    private int CSn;
    private String DY;
    private IListenerManager HD;
    private ebl IeN;
    private com.bytedance.sdk.openadsdk.component.lk Ivz;
    private IeN JVA;
    private boolean KPU;
    private tD Sfi;
    private float VVE;
    private boolean brP;
    private com.bytedance.sdk.openadsdk.Lxb.ZU.LD eK;
    private FrameLayout foI;
    private int id;
    private float kqm;
    private com.bytedance.sdk.openadsdk.component.lc.LD nBu;
    private AdSlot nE;
    private TTAdDislikeToast sLN;
    private int tD;
    protected final AtomicBoolean Lxb = new AtomicBoolean(false);
    protected final aH LD = new aH(Looper.getMainLooper(), this);
    final AtomicBoolean lk = new AtomicBoolean(false);
    final AtomicBoolean ZU = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.OY.Lxb QAg = new com.bytedance.sdk.openadsdk.component.OY.Lxb();
    protected boolean JXs = false;
    private final AtomicBoolean NXR = new AtomicBoolean(false);
    private CG STP = CG.lk();
    private final AtomicBoolean aH = new AtomicBoolean(false);
    long lc = 0;
    private volatile boolean xan = false;
    private final com.bytedance.sdk.openadsdk.component.Lxb hg = new com.bytedance.sdk.openadsdk.component.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.Lxb
        public void JXs() {
            TTAppOpenAdActivity.this.tD();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
        public void LD(long j, int i) {
            com.bytedance.sdk.openadsdk.component.OY.lk lkVarEbl;
            StringBuilder sb = new StringBuilder("onError() called with: totalPlayTime = [");
            sb.append(j);
            sb.append("], percent = [");
            sb.append(i);
            sb.append("]");
            if (TTAppOpenAdActivity.this.Ivz != null && (lkVarEbl = TTAppOpenAdActivity.this.Ivz.ebl()) != null) {
                lkVarEbl.Lxb(true);
            }
            TTAppOpenAdActivity.this.DY();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
        public void Lxb() {
            TTAppOpenAdActivity.this.DY();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb
        public void ZU() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb
        public void lk() {
            TTAppOpenAdActivity.this.lc();
            TTAppOpenAdActivity.this.STP.JXs();
            TTAppOpenAdActivity.this.kqm();
            if (TTAppOpenAdActivity.this.brP) {
                TTAppOpenAdActivity.this.sLN();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
        public void Lxb(long j, long j2) {
            TTAppOpenAdActivity.this.QAg.Lxb(j);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.JXs && tTAppOpenAdActivity.Ivz != null && TTAppOpenAdActivity.this.Ivz.ebl() != null && TTAppOpenAdActivity.this.Ivz.ebl().ZU()) {
                TTAppOpenAdActivity.this.Ivz.ebl().ebl();
            }
            TTAppOpenAdActivity.this.NXR();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb, com.bytedance.sdk.openadsdk.component.lc.Lxb
        public void LD(View view) {
            TTAppOpenAdActivity.this.Lxb();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb, com.bytedance.sdk.openadsdk.component.lc.Lxb
        public void LD() {
            TTAppOpenAdActivity.this.xan = true;
            if (com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.ebl();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb, com.bytedance.sdk.openadsdk.component.lc.Lxb
        public void Lxb(View view) {
            TTAppOpenAdActivity.this.Sfi();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Lxb, com.bytedance.sdk.openadsdk.component.lc.Lxb
        public void Lxb(int i, int i2, boolean z) {
            if (TTAppOpenAdActivity.this.Ivz != null) {
                TTAppOpenAdActivity.this.Ivz.Lxb(i, i2, z || i == 0);
            }
        }
    };
    private final Runnable CG = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            if (TTAppOpenAdActivity.this.NXR.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.Sfi != null && TTAppOpenAdActivity.this.Sfi.chu() && TTAppOpenAdActivity.this.Sfi.SlV() != null && TTAppOpenAdActivity.this.Sfi.SlV().Lxb() != null) {
                TTAppOpenAdActivity.this.Sfi.SlV().Lxb().Lxb(0L);
            }
            TTAppOpenAdActivity.this.IeN = new ebl();
            TTAppOpenAdActivity.this.IeN.Lxb(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.STP.JXs();
            if (TTAppOpenAdActivity.this.nBu != null) {
                TTAppOpenAdActivity.this.nBu.LD();
            }
            if (TTAppOpenAdActivity.this.Ivz != null) {
                TTAppOpenAdActivity.this.Ivz.JXs();
            }
            TTAppOpenAdActivity.this.brP();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException unused) {
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.CSn);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.brP ? "video_normal_ad" : "image_normal_ad");
            if (OY.lk() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.KPU || TTAppOpenAdActivity.this.Sfi.Iyd()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.VVE());
                TTAppOpenAdActivity.this.Lxb(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.Sfi.kVf() ? 1 : 0);
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(TTAppOpenAdActivity.this.Sfi, "open_ad", jSONObject2);
            com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.Sfi, new com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(TTAppOpenAdActivity.this.VVE()));
            com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(TTAppOpenAdActivity.this.Sfi);
            TTAppOpenAdActivity.this.NXR.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        le.Lxb((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                le.Lxb((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        sLN.Lxb("TTAppOpenAdActivity", e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (kqm.ZU().Sfi(String.valueOf(this.tD)) == 1) {
            if (this.QAg.LD() >= ((long) kqm.ZU().HD(String.valueOf(this.tD))) * 1000) {
                Sfi();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kqm.LD(getApplicationContext());
        if (!LD(bundle)) {
            finish();
            return;
        }
        if (!STP.JXs()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.ZU.lk.JXs(this.Sfi, "open_ad", (JSONObject) null);
        }
        this.brP = tD.JXs(this.Sfi);
        new StringBuilder("onCreate: isVideo is ").append(this.brP);
        if (this.brP) {
            this.QAg.Lxb((float) this.Sfi.JJ().d);
        } else {
            this.QAg.Lxb(kqm.ZU().eK(String.valueOf(this.tD)));
        }
        com.bytedance.sdk.openadsdk.component.lc.LD ld = new com.bytedance.sdk.openadsdk.component.lc.LD(this.QAg);
        this.nBu = ld;
        ld.Lxb(this.hg);
        OY();
        FrameLayout frameLayout = new FrameLayout(this);
        this.foI = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.foI);
            this.foI.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                /* JADX WARN: Code duplicated, block: B:11:0x0026  */
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    try {
                        int iId = TTAppOpenAdActivity.this.Sfi.id();
                        TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                        if (tTAppOpenAdActivity.Sfi == null || TTAppOpenAdActivity.this.Sfi.eK() != 2) {
                            z = false;
                        } else {
                            z = true;
                            if (iId == 1) {
                                z = false;
                            }
                        }
                        tTAppOpenAdActivity.KPU = z;
                        if (TTAppOpenAdActivity.this.KPU) {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity2.Ivz = new com.bytedance.sdk.openadsdk.component.LD(tTAppOpenAdActivity2, tTAppOpenAdActivity2.Sfi, TTAppOpenAdActivity.this.foI, TTAppOpenAdActivity.this.hg, TTAppOpenAdActivity.this.id, TTAppOpenAdActivity.this.brP, TTAppOpenAdActivity.this.QAg, TTAppOpenAdActivity.this.nBu);
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity3.Ivz = new com.bytedance.sdk.openadsdk.component.lk(tTAppOpenAdActivity3, tTAppOpenAdActivity3.Sfi, TTAppOpenAdActivity.this.foI, TTAppOpenAdActivity.this.hg, TTAppOpenAdActivity.this.id, TTAppOpenAdActivity.this.brP, TTAppOpenAdActivity.this.QAg);
                            TTAppOpenAdActivity.this.Ivz.Lxb(TTAppOpenAdActivity.this.kqm, TTAppOpenAdActivity.this.VVE);
                        }
                        TTAppOpenAdActivity.this.Ivz.Lxb((ViewGroup) TTAppOpenAdActivity.this.foI);
                        TTAppOpenAdActivity.this.Ivz.Lxb();
                        TTAppOpenAdActivity.this.Ivz.LD();
                    } catch (Throwable th) {
                        TTAppOpenAdActivity.this.finish();
                        sLN.Lxb("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.STP.lk.LD();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.Sfi != null) {
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("videoForceBreak", this.Sfi);
        }
        this.LD.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.lc.LD ld = this.nBu;
        if (ld != null) {
            ld.JXs();
        }
        com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.Sfi);
        com.bytedance.sdk.openadsdk.eK.Lxb.lk.LD(this.Sfi);
        if (this.brP) {
            com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(this.Sfi, this.QAg.LD(), this.QAg.Lxb(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(this.Sfi, -1L, this.QAg.Lxb(), false);
        }
        if (this.STP.lc() && this.NXR.get()) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(String.valueOf(this.STP.ZU()), this.Sfi, "open_ad", this.IeN);
            this.STP = CG.lk();
        }
        com.bytedance.sdk.openadsdk.component.lk lkVar = this.Ivz;
        if (lkVar != null) {
            lkVar.lk();
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("recycleRes");
        }
        ebl();
        OY = null;
        this.eK = null;
        IeN ieN = this.JVA;
        if (ieN != null) {
            ieN.setCallback(null);
        }
        if (VVE.TA().CSn(String.valueOf(this.tD)) != 1 || tD.lc(this.Sfi)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.lc.Lxb(kqm.Lxb()).Lxb(this.nE);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.JXs = false;
        lk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.lk lkVar;
        super.onResume();
        this.JXs = true;
        if (this.Lxb.getAndSet(true)) {
            if (!this.aH.get()) {
                LD();
                return;
            }
            DY();
            if (this.brP && (lkVar = this.Ivz) != null && lkVar.ebl() != null) {
                this.Ivz.ebl().Lxb(3);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            tD tDVar = this.Sfi;
            bundle.putString("material_meta", tDVar != null ? tDVar.JD().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.DY);
            bundle.putInt("ad_source", this.CSn);
            bundle.putLong("start_show_time", this.lc);
        } catch (Throwable th) {
            sLN.Lxb("TTAppOpenAdActivity", th.getMessage());
        }
        OY = this.eK;
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.lk.Lxb(this, this.Sfi);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.KPU) {
                this.STP.JXs();
            }
            tD tDVar = this.Sfi;
            if (tDVar != null && tDVar.wVL() && !this.Sfi.aE()) {
                this.Sfi.ebl(true);
                tD tDVar2 = this.Sfi;
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar2, "open_ad", tDVar2.Kue());
            }
        } else if (this.NXR.get()) {
            if (this.STP.lc()) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(String.valueOf(this.STP.ZU()), this.Sfi, "open_ad", this.IeN);
            }
            this.STP = CG.lk();
        }
        com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.Sfi, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(this.Sfi, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DY() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.ZU.LD ld = this.eK;
        if (ld != null) {
            ld.LD();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IeN() {
        this.sLN.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void JVA() {
        if (this.JVA == null) {
            IeN ieN = new IeN(this, this.Sfi);
            this.JVA = ieN;
            ieN.setDislikeSource("video_player");
            this.JVA.setCallback(new IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                public void LD(View view) {
                    TTAppOpenAdActivity.this.lk.set(false);
                    TTAppOpenAdActivity.this.LD();
                    com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(TTAppOpenAdActivity.this.Sfi, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                public void Lxb(View view) {
                    TTAppOpenAdActivity.this.lk.set(true);
                    TTAppOpenAdActivity.this.lk();
                    com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(TTAppOpenAdActivity.this.Sfi, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.IeN.Lxb
                public void Lxb(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.ZU.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.ZU.set(true);
                    TTAppOpenAdActivity.this.IeN();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.JVA);
        if (this.sLN == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.sLN = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NXR() {
        if (!this.brP || this.Sfi.kVf()) {
            return;
        }
        this.LD.removeMessages(100);
    }

    private void OY() {
        if (26 != Build.VERSION.SDK_INT) {
            this.id = this.Sfi.wCT();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.id = 1;
        } else {
            this.id = 2;
        }
        QAg();
    }

    private void QAg() {
        int iMin;
        int iMax;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.id);
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            if (i == 27) {
                try {
                    nBu();
                } catch (Throwable th) {
                    sLN.Lxb("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                nBu();
            }
        }
        Pair<Integer, Integer> pairOY = le.OY(getApplicationContext());
        if (this.id == 2) {
            iMin = Math.max(((Integer) pairOY.first).intValue(), ((Integer) pairOY.second).intValue());
            iMax = Math.min(((Integer) pairOY.first).intValue(), ((Integer) pairOY.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairOY.first).intValue(), ((Integer) pairOY.second).intValue());
            iMax = Math.max(((Integer) pairOY.first).intValue(), ((Integer) pairOY.second).intValue());
        }
        this.VVE = iMax;
        this.kqm = iMin;
        float fLxb = le.Lxb();
        if (le.lk((Activity) this)) {
            int i2 = this.id;
            if (i2 == 1) {
                this.VVE -= fLxb;
            } else if (i2 == 2) {
                this.kqm -= fLxb;
            }
        }
        com.bytedance.sdk.openadsdk.component.lk lkVar = this.Ivz;
        if (lkVar != null) {
            lkVar.Lxb(this.kqm, this.VVE);
        }
    }

    private void STP() {
        this.sLN.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sfi() {
        com.bytedance.sdk.openadsdk.component.lk lkVar;
        eK.lk(this.tD);
        DY();
        if (this.brP && (lkVar = this.Ivz) != null && lkVar.ebl() != null) {
            this.Ivz.ebl().Lxb(4);
        }
        com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(this.Sfi, (int) this.QAg.LD(), this.nBu.Lxb(), this.QAg.Lxb());
        tD tDVar = this.Sfi;
        if (tDVar != null && tDVar.chu() && this.Sfi.SlV() != null && this.Sfi.SlV().Lxb() != null) {
            com.bytedance.sdk.openadsdk.core.sLN.ZU zuLxb = this.Sfi.SlV().Lxb();
            com.bytedance.sdk.openadsdk.component.lk lkVar2 = this.Ivz;
            long jSLN = (lkVar2 == null || lkVar2.ebl() == null) ? 0L : this.Ivz.ebl().sLN();
            zuLxb.lc(jSLN);
            zuLxb.JXs(jSLN);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int VVE() {
        if (this.Sfi.Iyd()) {
            return 5;
        }
        if (this.KPU) {
            return this.Ivz.ZU();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void brP() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.ZU.LD ld = this.eK;
        if (ld != null) {
            ld.Lxb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ebl() {
        Sfi.Lxb("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdTimeOver");
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.ZU.LD ld = this.eK;
        if (ld != null) {
            ld.lk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kqm() {
        if (this.NXR.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.CG);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lc() {
        this.nBu.LD(kqm.ZU().HD(String.valueOf(this.tD)));
        this.nBu.Lxb(this.QAg.Lxb());
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void nBu() {
        if (this.id != 2) {
            setRequestedOrientation(1);
        } else if (JXs()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.id == 2 || !le.lk((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sLN() {
        if (!this.brP || this.Sfi.kVf() || this.xan) {
            return;
        }
        this.LD.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tD() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdClicked");
        } else {
            com.bytedance.sdk.openadsdk.Lxb.ZU.LD ld = this.eK;
            if (ld != null) {
                ld.onAdClicked();
            }
        }
        if (VVE.TA().aH(String.valueOf(this.tD))) {
            this.aH.set(true);
        }
    }

    public boolean JXs() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e) {
            sLN.Lxb("TTAppOpenAdActivity", e.getMessage());
            return false;
        }
    }

    public IListenerManager ZU() {
        if (this.HD == null) {
            this.HD = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().Lxb(7));
        }
        return this.HD;
    }

    public void lk() {
        if (this.brP) {
            com.bytedance.sdk.openadsdk.component.lk lkVar = this.Ivz;
            if (lkVar != null && lkVar.ebl() != null && this.Ivz.ebl().ZU()) {
                this.Ivz.ebl().ebl();
            }
            NXR();
        }
        com.bytedance.sdk.openadsdk.component.lc.LD ld = this.nBu;
        if (ld != null) {
            ld.ZU();
        }
    }

    public void LD() {
        if (this.lk.get()) {
            return;
        }
        if (this.brP) {
            com.bytedance.sdk.openadsdk.component.lk lkVar = this.Ivz;
            if (lkVar != null && lkVar.ebl() != null && this.Ivz.ebl().JXs()) {
                this.Ivz.ebl().nBu();
            }
            sLN();
        }
        com.bytedance.sdk.openadsdk.component.lc.LD ld = this.nBu;
        if (ld != null) {
            ld.lk();
        }
    }

    public void Lxb() {
        if (isFinishing()) {
            return;
        }
        if (this.ZU.get()) {
            STP();
            return;
        }
        if (this.JVA == null) {
            try {
                JVA();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        IeN ieN = this.JVA;
        if (ieN != null) {
            ieN.Lxb();
        }
    }

    private boolean LD(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.Sfi = com.bytedance.sdk.openadsdk.core.LD.Lxb(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        sLN.Lxb("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e);
                    }
                }
                this.DY = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.Sfi = com.bytedance.sdk.openadsdk.core.aH.Lxb().LD();
            this.eK = com.bytedance.sdk.openadsdk.core.aH.Lxb().JXs();
            com.bytedance.sdk.openadsdk.core.aH.Lxb().lc();
        }
        Lxb(getIntent());
        Lxb(bundle);
        tD tDVar = this.Sfi;
        if (tDVar == null) {
            finish();
            return false;
        }
        this.nE = tDVar.hg();
        this.Sfi.Lxb(this.lc);
        this.tD = this.Sfi.Td();
        com.bytedance.sdk.openadsdk.utils.LD.Lxb(this.Sfi);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject Lxb(JSONObject jSONObject) {
        if (VVE() == 0) {
            return this.Ivz.Lxb(jSONObject);
        }
        return null;
    }

    private void Lxb(final String str) {
        hg.lk(new com.bytedance.sdk.component.OY.OY("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.ZU().executeAppOpenAdCallback(TTAppOpenAdActivity.this.DY, str);
                } catch (Throwable th) {
                    sLN.Lxb("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void Lxb(Intent intent) {
        if (intent != null) {
            this.CSn = intent.getIntExtra("ad_source", 0);
            this.lc = intent.getLongExtra("start_show_time", 0L);
        }
    }

    public void Lxb(Bundle bundle) {
        if (bundle != null) {
            if (this.eK == null) {
                this.eK = OY;
                OY = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.DY = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.CSn = bundle.getInt("ad_source", 0);
                this.lc = bundle.getLong("start_show_time", 0L);
                this.Sfi = com.bytedance.sdk.openadsdk.core.LD.Lxb(new JSONObject(string));
            } catch (Throwable th) {
                sLN.Lxb("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        com.bytedance.sdk.openadsdk.component.lk lkVar;
        if (message.what == 100) {
            if (this.brP && (lkVar = this.Ivz) != null && lkVar.ebl() != null) {
                this.Ivz.ebl().Lxb(1);
            }
            DY();
            finish();
        }
    }
}
