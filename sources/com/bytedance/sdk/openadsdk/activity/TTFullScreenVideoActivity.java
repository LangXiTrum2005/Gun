package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.LD.QAg;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.OY;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.NXR;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import com.bytedance.sdk.openadsdk.utils.hg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.Lxb.lk.LD sLN;
    private com.bytedance.sdk.openadsdk.Lxb.lk.LD JVA;
    private boolean NXR;

    private void DY() {
        if (this.OY) {
            return;
        }
        this.OY = true;
        Sfi.Lxb("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.lk.LD ld = this.JVA;
        if (ld != null) {
            ld.LD();
        }
    }

    private boolean LD(tD tDVar) {
        if (tDVar == null) {
            return false;
        }
        return kqm.ZU().DY(String.valueOf(this.LD.lc));
    }

    private void ZU(int i) {
        this.LD.nJ.Lxb(null, String.format(com.bytedance.sdk.component.utils.tD.Lxb(kqm.Lxb(), "tt_skip_ad_time_text"), Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tD() {
        Sfi.Lxb("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.lk.LD ld = this.JVA;
        if (ld != null) {
            ld.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void JXs() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.Lxb.lk.LD ld = this.JVA;
            if (ld != null) {
                ld.Lxb();
            }
        }
        if (brP()) {
            this.LD.id.nBu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void STP() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void VVE() {
        final View viewNBu = this.LD.BcA.nBu();
        if (viewNBu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.LD.hg.id() && TTFullScreenVideoActivity.this.LD.nBu.get()) {
                        boolean zNXR = TTFullScreenVideoActivity.this.LD.CG.NXR();
                        TTFullScreenVideoActivity.this.LD.hg.JXs(zNXR);
                        TTFullScreenVideoActivity.this.LD.BcA.JXs(8);
                        View view2 = viewNBu;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.JXs.ZU) {
                            ((com.bytedance.sdk.openadsdk.core.JXs.ZU) view2).setImageResource(com.bytedance.sdk.component.utils.tD.ZU(TTFullScreenVideoActivity.this.LD.NDz, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.LD.JJ.sendEmptyMessageDelayed(600, 5000L);
                        if (!tD.lk(TTFullScreenVideoActivity.this.LD.LD)) {
                            return;
                        }
                        if (tD.lk(TTFullScreenVideoActivity.this.LD.LD) && zNXR) {
                            return;
                        }
                    }
                    if (TTFullScreenVideoActivity.this.LD.LD.Njp()) {
                        if (TTFullScreenVideoActivity.this.LD.LD.chu()) {
                            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = TTFullScreenVideoActivity.this.LD;
                            if (lxb.le != null) {
                                lxb.LD.CG(2);
                                if (TTFullScreenVideoActivity.this.LD.le.JXs()) {
                                    return;
                                }
                            }
                        } else if (TTFullScreenVideoActivity.this.LD.LD.qK() == 0 && !TTFullScreenVideoActivity.this.LD.hg.kqm()) {
                            TTFullScreenVideoActivity.this.LD.LD.CG(11);
                            if (TTFullScreenVideoActivity.this.LD.hg.ZU()) {
                                TTFullScreenVideoActivity.this.LD.LD.CG(12);
                            }
                            try {
                                TTFullScreenVideoActivity.this.LD.BcA.kqm();
                                return;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    TTFullScreenVideoActivity.this.LD.hg.foI();
                    TTFullScreenVideoActivity.this.LD.CG.JVA();
                    TTFullScreenVideoActivity.this.LD.KPU.lc();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewNBu.setOnClickListener(onClickListener);
            viewNBu.setTag(viewNBu.getId(), onClickListener);
        }
        this.LD.nJ.Lxb(new com.bytedance.sdk.openadsdk.component.reward.top.LD() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void LD(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = tTFullScreenVideoActivity.LD;
                lxb.Of = !lxb.Of;
                com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = tTFullScreenVideoActivity.lk;
                if (ld != null && ld.ZU() != null) {
                    TTFullScreenVideoActivity.this.lk.ZU().Lxb(TTFullScreenVideoActivity.this.LD.Of);
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = TTFullScreenVideoActivity.this.LD;
                lxb2.eK.LD(lxb2.Of);
                if (!eK.tD(TTFullScreenVideoActivity.this.LD.LD) || TTFullScreenVideoActivity.this.LD.nBu.get()) {
                    if (eK.ebl(TTFullScreenVideoActivity.this.LD.LD)) {
                        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = TTFullScreenVideoActivity.this.LD;
                        lxb3.xan.Lxb(lxb3.Of, true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = TTFullScreenVideoActivity.this.LD;
                    lxb4.hg.ZU(lxb4.Of);
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = TTFullScreenVideoActivity.this.LD;
                    lxb5.CSn.lc(lxb5.Of);
                    tD tDVar = TTFullScreenVideoActivity.this.LD.LD;
                    if (tDVar == null || tDVar.SlV() == null || TTFullScreenVideoActivity.this.LD.LD.SlV().Lxb() == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb6 = TTFullScreenVideoActivity.this.LD;
                    if (lxb6.eK != null) {
                        if (lxb6.Of) {
                            lxb6.LD.SlV().Lxb().OY(TTFullScreenVideoActivity.this.LD.eK.ebl());
                        } else {
                            lxb6.LD.SlV().Lxb().QAg(TTFullScreenVideoActivity.this.LD.eK.ebl());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void Lxb(View view) {
                com.bytedance.sdk.openadsdk.component.reward.view.LD ldLxb;
                if (eK.lc(TTFullScreenVideoActivity.this.LD.LD) || (eK.JXs(TTFullScreenVideoActivity.this.LD.LD) && TTFullScreenVideoActivity.this.LD.CSn.OY(OY.LD))) {
                    if (eK.nBu(TTFullScreenVideoActivity.this.LD.LD)) {
                        TTFullScreenVideoActivity.this.LD.CSn.kqm();
                        return;
                    }
                    View view2 = viewNBu;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (eK.OY(TTFullScreenVideoActivity.this.LD.LD) && (eK.brP(TTFullScreenVideoActivity.this.LD.LD) || TTFullScreenVideoActivity.this.LD.nBu.get())) {
                    if (TTFullScreenVideoActivity.this.LD.CSn.Lxb()) {
                        TTFullScreenVideoActivity.this.LD.CSn.Lxb(5);
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.LD.hg.OY();
                        return;
                    }
                }
                if (eK.brP(TTFullScreenVideoActivity.this.LD.LD) || (com.bytedance.sdk.openadsdk.core.model.kqm.Lxb(TTFullScreenVideoActivity.this.LD.LD) && !TTFullScreenVideoActivity.this.LD.VVE.get())) {
                    if (!eK.OY(TTFullScreenVideoActivity.this.LD.LD) && TTFullScreenVideoActivity.this.LD.CSn.Lxb()) {
                        TTFullScreenVideoActivity.this.LD.CSn.Lxb(4);
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if (TTFullScreenVideoActivity.this.LD.LD.uao()) {
                    if (TTFullScreenVideoActivity.this.LD.BcA.JVA() != null) {
                        TTFullScreenVideoActivity.this.LD.LD.CG(2);
                        TTFullScreenVideoActivity.this.LD.BcA.kqm();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = TTFullScreenVideoActivity.this.LD;
                if (!lxb.lk && lxb.LD.Njp() && !TTFullScreenVideoActivity.this.LD.LD.chu()) {
                    TTFullScreenVideoActivity.this.LD.LD.CG(13);
                    try {
                        TTFullScreenVideoActivity.this.LD.BcA.kqm();
                        return;
                    } catch (Exception unused) {
                    }
                }
                IeN.Lxb lxb2 = new IeN.Lxb();
                lxb2.Lxb(TTFullScreenVideoActivity.this.LD.eK.ebl());
                lxb2.lk(TTFullScreenVideoActivity.this.LD.eK.tD());
                lxb2.LD(TTFullScreenVideoActivity.this.LD.eK.JVA());
                lxb2.lk(3);
                lxb2.ZU(TTFullScreenVideoActivity.this.LD.eK.brP());
                com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(TTFullScreenVideoActivity.this.LD.eK.lk(), lxb2, TTFullScreenVideoActivity.this.LD.eK.Lxb());
                com.bytedance.sdk.openadsdk.core.eK.lk(TTFullScreenVideoActivity.this.LD.lc);
                TTFullScreenVideoActivity.this.LD.eK.Lxb("skip", false);
                TTFullScreenVideoActivity.this.LD.nJ.ZU(false);
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = TTFullScreenVideoActivity.this.LD;
                if (!lxb3.lk || (com.bytedance.sdk.openadsdk.core.model.kqm.lk(lxb3.LD) && (ldLxb = TTFullScreenVideoActivity.this.LD.id.Lxb()) != null && ldLxb.ZU == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.Lxb(true, 4);
                }
                tD tDVar = TTFullScreenVideoActivity.this.LD.LD;
                if (tDVar != null && tDVar.SlV() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = TTFullScreenVideoActivity.this.LD;
                    if (lxb4.eK != null) {
                        lxb4.LD.SlV().Lxb().lc(TTFullScreenVideoActivity.this.LD.eK.ebl());
                        TTFullScreenVideoActivity.this.LD.LD.SlV().Lxb().JXs(TTFullScreenVideoActivity.this.LD.eK.ebl());
                    }
                }
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(TTFullScreenVideoActivity.this.LD.LD, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void ZU(View view) {
                View view2 = viewNBu;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void lk(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.LD.nE.Lxb(tTFullScreenVideoActivity.lk);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void c_() {
        if (this.LD.LD.Za() != 100.0f) {
            this.NXR = true;
        }
        tD();
    }

    public void finalize() throws Throwable {
        super.finalize();
        sLN = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.LD != null) {
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("videoForceBreak", this.LD.LD);
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
            lxb.CSn.Lxb(lxb.wbY);
        }
        try {
            DY();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean kqm() {
        return false;
    }

    public void lk(int i) {
        int iTD = kqm.ZU().tD(String.valueOf(this.LD.lc));
        if (!kqm.ZU().lc(String.valueOf(this.LD.lc)) || (!tD.JXs(this.LD.LD) && !this.LD.lk)) {
            if (i >= iTD) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
                if (!lxb.LXE) {
                    lxb.Lxb(true);
                }
                Lxb();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
        if (!lxb2.LXE) {
            lxb2.Lxb(true);
        }
        if (i > iTD) {
            Lxb();
        } else {
            ZU(iTD - i);
            this.LD.nJ.JXs(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null || tD.JXs(lxb.LD)) {
            return;
        }
        KG kgJJ = this.LD.LD.JJ();
        if (kgJJ == null) {
            KG kg = new KG();
            kg.d = 10.0d;
            this.LD.LD.Lxb(kg);
        } else if (kgJJ.d <= 0.0d) {
            kgJJ.d = 10.0d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DY();
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("recycleRes");
        }
        this.JVA = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.view.LD ldLxb;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null || (ldLxb = lxb.id.Lxb()) == null) {
            return;
        }
        ldLxb.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lc() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.lc
            public void Lxb() {
                TTFullScreenVideoActivity.this.tD();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        sLN = this.JVA;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null || !LD(lxb.LD) || Lxb(this.LD.LD)) {
            return;
        }
        if (this.NXR) {
            this.NXR = false;
            finish();
        } else if (this.LD.hg.CG()) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void ZU() {
        tD();
        this.LD.LD.BK();
        this.LD.LD.Lxb(true);
        if (tD.JXs(this.LD.LD)) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
            tD tDVar = lxb.LD;
            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, lxb.JXs, tDVar.mhk());
        }
    }

    private void Lxb(final String str) {
        hg.lk(new com.bytedance.sdk.component.OY.OY("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.LD(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.LD.sRq, str);
                } catch (Throwable th) {
                    sLN.Lxb("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void Lxb(@NonNull Intent intent) {
        super.Lxb(intent);
        this.LD.wbY = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            this.JVA = aH.Lxb().ZU();
        }
        if (this.JVA != null || bundle == null) {
            return;
        }
        this.JVA = sLN;
        sLN = null;
    }

    public boolean Lxb(long j, boolean z) {
        ebl eblVar = new ebl();
        eblVar.Lxb(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk;
        if (ld != null && (ld instanceof QAg)) {
            this.LD.eK.Lxb(((QAg) ld).Ivz(), eblVar);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
            lxb.eK.Lxb(lxb.BcA.lc(), eblVar);
        }
        Fo0 fo0 = new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5
            boolean Lxb;

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void LD(long j2, int i) {
                TTFullScreenVideoActivity.this.ZU.removeMessages(300);
                if (TTFullScreenVideoActivity.this.LD.eK.LD()) {
                    TTFullScreenVideoActivity.this.NXR();
                    return;
                }
                TTFullScreenVideoActivity.this.LD.eK.NXR();
                sLN.Lxb("TTAD.FSVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (!tTFullScreenVideoActivity.LD.lk) {
                    tTFullScreenVideoActivity.finish();
                    return;
                }
                tTFullScreenVideoActivity.Lxb(false, true, 3);
                com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar = TTFullScreenVideoActivity.this.LD.eK;
                kqmVar.Lxb(1 ^ (kqmVar.foI() ? 1 : 0), 2);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, int i) {
                com.bytedance.sdk.openadsdk.utils.sLN sln;
                if (this.Lxb) {
                    return;
                }
                this.Lxb = true;
                TTFullScreenVideoActivity.this.ZU.removeMessages(300);
                TTFullScreenVideoActivity.this.IeN();
                TTFullScreenVideoActivity.this.LD.eK.Lxb(j2, j2);
                TTFullScreenVideoActivity.this.LD.tD.set(true);
                if (TTFullScreenVideoActivity.this.LD.LD.kqm() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = TTFullScreenVideoActivity.this.LD;
                    if (lxb2.lk) {
                        lxb2.aH.lk().ZU();
                        NXR.LD();
                    }
                }
                if (TTFullScreenVideoActivity.this.LD.LD.ZE()) {
                    TTFullScreenVideoActivity.this.LD.LD.CG(1);
                    TTFullScreenVideoActivity.this.LD.BcA.kqm();
                }
                if (TTFullScreenVideoActivity.this.LD.LD.kqm() == 21 && !TTFullScreenVideoActivity.this.LD.LD.ZU()) {
                    TTFullScreenVideoActivity.this.LD.LD.LD(true);
                    TTFullScreenVideoActivity.this.LD.BcA.kqm();
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = TTFullScreenVideoActivity.this.LD;
                if (!lxb3.lk) {
                    if (lxb3.LD.MH()) {
                        TTFullScreenVideoActivity.this.LD.nJ.lk();
                        return;
                    }
                    if (!tD.JXs(TTFullScreenVideoActivity.this.LD.LD)) {
                        TTFullScreenVideoActivity.this.LD.eK.Lxb("skip", true);
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if (lxb3.LD.MH()) {
                    TTFullScreenVideoActivity.this.LD.nJ.lk();
                    return;
                }
                TTFullScreenVideoActivity.this.Lxb(false, 5);
                if (com.bytedance.sdk.openadsdk.core.model.kqm.LD(TTFullScreenVideoActivity.this.LD.LD) && (sln = TTFullScreenVideoActivity.this.LD.MGT) != null) {
                    sln.Lxb(0L);
                }
                if (tD.JXs(TTFullScreenVideoActivity.this.LD.LD)) {
                    return;
                }
                TTFullScreenVideoActivity.this.LD.eK.Lxb("skip", true);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb() {
                TTFullScreenVideoActivity.this.ZU.removeMessages(300);
                TTFullScreenVideoActivity.this.IeN();
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.LD.lk) {
                    tTFullScreenVideoActivity.Lxb(false, true, 6);
                } else {
                    tTFullScreenVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar = TTFullScreenVideoActivity.this.LD.eK;
                kqmVar.Lxb(!kqmVar.foI() ? 1 : 0, 1 ^ (TTFullScreenVideoActivity.this.LD.eK.foI() ? 1 : 0));
                TTFullScreenVideoActivity.this.LD.eK.NXR();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = TTFullScreenVideoActivity.this.LD;
                if (!lxb2.Ld && lxb2.eK.LD()) {
                    TTFullScreenVideoActivity.this.LD.eK.IeN();
                }
                if (TTFullScreenVideoActivity.this.LD.nBu.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.ZU.removeMessages(300);
                if (j2 != TTFullScreenVideoActivity.this.LD.eK.OY()) {
                    TTFullScreenVideoActivity.this.IeN();
                }
                TTFullScreenVideoActivity.this.LD.eK.Lxb(j2, j3);
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                long j4 = j2 / 1000;
                tTFullScreenVideoActivity.lc = (int) (tTFullScreenVideoActivity.LD.eK.KPU() - j4);
                int i = (int) j4;
                if ((TTFullScreenVideoActivity.this.LD.DY.get() || TTFullScreenVideoActivity.this.LD.JVA.get()) && TTFullScreenVideoActivity.this.LD.eK.LD()) {
                    TTFullScreenVideoActivity.this.LD.eK.IeN();
                }
                TTFullScreenVideoActivity.this.lk(i);
                TTFullScreenVideoActivity tTFullScreenVideoActivity2 = TTFullScreenVideoActivity.this;
                int i2 = tTFullScreenVideoActivity2.lc;
                if (i2 >= 0) {
                    tTFullScreenVideoActivity2.LD.nJ.Lxb(String.valueOf(i2), null);
                }
            }
        };
        this.LD.eK.Lxb(fo0);
        com.bytedance.sdk.openadsdk.core.model.kqm kqmVar = this.LD.BcA.IeN;
        if (kqmVar != null) {
            kqmVar.Lxb(fo0);
        }
        return this.LD.eK.Lxb(j, z, null, this.lk);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void Lxb() {
        if (tD.JXs(this.LD.LD)) {
            this.LD.nJ.Lxb(null, TTAdDislikeToast.getSkipText());
        } else {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
            if (!lxb.lk) {
                lxb.nJ.Lxb(null, "X");
            } else {
                this.LD.nJ.Lxb(null, TTAdDislikeToast.getSkipText());
            }
        }
        this.LD.nJ.JXs(true);
    }

    private boolean Lxb(tD tDVar) {
        return tDVar == null || tDVar.Za() == 100.0f;
    }
}
