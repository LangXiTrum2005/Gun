package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.DY;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.eK;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.utils.NXR;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String IeN;
    private static String STP;
    private static com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb Sfi;
    private static String VVE;
    private static String brP;
    private static String kqm;
    private String DY;
    protected int JVA;
    protected com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb NXR;
    private boolean aH;
    protected int sLN;
    private String tD;
    private final AtomicBoolean HD = new AtomicBoolean(false);
    private int eK = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    public void DY() {
        com.bytedance.sdk.openadsdk.component.reward.view.LD ldLxb;
        IeN.Lxb lxb = new IeN.Lxb();
        lxb.Lxb(this.LD.eK.ebl());
        lxb.lk(this.LD.eK.tD());
        lxb.LD(this.LD.eK.JVA());
        lxb.lk(3);
        lxb.ZU(this.LD.eK.brP());
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(this.LD.eK.lk(), lxb, this.LD.eK.Lxb());
        eK.lk(this.LD.lc);
        this.LD.eK.Lxb("skip", false);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
        if (lxb2.lk) {
            if (kqm.lk(lxb2.LD) && (ldLxb = this.LD.id.Lxb()) != null && ldLxb.ZU == 0) {
                finish();
            } else {
                Lxb(true, 4);
            }
            if (kqm.Lxb(this.LD.LD) && !this.LD.VVE.get()) {
                finish();
            }
        } else {
            finish();
        }
        com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = this.LD.LD.SlV();
        if (lxbSlV != null) {
            com.bytedance.sdk.openadsdk.core.sLN.ZU zuLxb = lxbSlV.Lxb();
            long jEbl = this.LD.eK.ebl();
            zuLxb.lc(jEbl);
            zuLxb.JXs(jEbl);
        }
        com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.LD.LD, 5);
    }

    private JSONObject HD() {
        JSONObject jSONObject = new JSONObject();
        int iDY = (int) this.LD.eK.DY();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.LD.LD.Sfi());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.LD.LD.HD());
            jSONObject.put("network", com.bytedance.sdk.component.utils.IeN.lk(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iBcA = this.LD.LD.BcA();
            String strLk = "unKnow";
            if (iBcA == 2) {
                strLk = nJ.LD();
            } else if (iBcA == 1) {
                strLk = nJ.lk();
            }
            jSONObject.put("user_agent", strLk);
            jSONObject.put("extra", this.LD.LD.Mvg());
            jSONObject.put("media_extra", this.tD);
            jSONObject.put("video_duration", this.LD.LD.JJ().d);
            jSONObject.put("play_start_ts", this.JVA);
            jSONObject.put("play_end_ts", this.sLN);
            jSONObject.put("duration", iDY);
            jSONObject.put("user_id", this.DY);
            jSONObject.put("trans_id", com.bytedance.sdk.openadsdk.utils.eK.Lxb().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            sLN.Lxb("TTAD.RVA", "", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sfi() {
        Sfi.Lxb("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb = this.NXR;
        if (lxb != null) {
            lxb.onAdClicked();
        }
    }

    private void eK() {
        if (this.OY) {
            return;
        }
        this.OY = true;
        Sfi.Lxb("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb = this.NXR;
        if (lxb != null) {
            lxb.LD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void JXs() {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb = this.NXR;
            if (lxb != null) {
                lxb.Lxb();
            }
        }
        if (brP()) {
            this.LD.id.nBu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void STP() {
        int i = com.bytedance.sdk.openadsdk.core.kqm.ZU().foI(String.valueOf(this.LD.lc)).lc;
        if (com.bytedance.sdk.openadsdk.core.model.eK.tD(this.LD.LD)) {
            if ((1.0d - (((double) this.lc) / this.LD.eK.KPU())) * 100.0d < i) {
                return;
            }
        } else {
            boolean z = (1.0f - (this.LD.CSn.LD() / ((float) this.LD.LD.Rt()))) * 100.0f >= ((float) i);
            int iLxb = com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(String.valueOf(this.LD.lc));
            if (iLxb == 0) {
                boolean zJXs = this.LD.CSn.lk() ? true : this.LD.hg.sLN().JXs();
                if (!z || !zJXs) {
                    return;
                }
            } else if (iLxb != 1 || !z) {
                return;
            }
        }
        tD();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void VVE() {
        final View viewNBu = this.LD.BcA.nBu();
        if (viewNBu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.LD.hg.id() && TTRewardVideoActivity.this.LD.nBu.get()) {
                        boolean zNXR = TTRewardVideoActivity.this.LD.CG.NXR();
                        TTRewardVideoActivity.this.LD.hg.JXs(zNXR);
                        TTRewardVideoActivity.this.LD.BcA.JXs(8);
                        View view2 = viewNBu;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.JXs.ZU) {
                            ((com.bytedance.sdk.openadsdk.core.JXs.ZU) view2).setImageResource(tD.ZU(TTRewardVideoActivity.this.LD.NDz, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.LD.JJ.sendEmptyMessageDelayed(600, 5000L);
                        if (!com.bytedance.sdk.openadsdk.core.model.tD.lk(TTRewardVideoActivity.this.LD.LD)) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.tD.lk(TTRewardVideoActivity.this.LD.LD) && zNXR) {
                            return;
                        }
                    }
                    if (TTRewardVideoActivity.this.LD.LD.Njp()) {
                        if (TTRewardVideoActivity.this.LD.LD.chu()) {
                            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = TTRewardVideoActivity.this.LD;
                            if (lxb.le != null) {
                                lxb.LD.CG(2);
                                if (TTRewardVideoActivity.this.LD.le.JXs()) {
                                    return;
                                }
                            }
                        } else if (TTRewardVideoActivity.this.LD.LD.qK() == 0 && !TTRewardVideoActivity.this.LD.hg.kqm()) {
                            TTRewardVideoActivity.this.LD.LD.CG(11);
                            if (TTRewardVideoActivity.this.LD.hg.ZU()) {
                                TTRewardVideoActivity.this.LD.LD.CG(12);
                            }
                            try {
                                TTRewardVideoActivity.this.LD.BcA.kqm();
                                return;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    TTRewardVideoActivity.this.LD.hg.foI();
                    TTRewardVideoActivity.this.LD.CG.JVA();
                    TTRewardVideoActivity.this.LD.KPU.lc();
                    if (com.bytedance.sdk.openadsdk.core.model.eK.ZU(TTRewardVideoActivity.this.LD.LD)) {
                        TTRewardVideoActivity.this.Lxb(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewNBu.setOnClickListener(onClickListener);
            viewNBu.setTag(viewNBu.getId(), onClickListener);
        }
        this.LD.nJ.Lxb(new com.bytedance.sdk.openadsdk.component.reward.top.LD() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void LD(View view) {
                com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = TTRewardVideoActivity.this.lk;
                if (ld != null && ld.ZU() != null) {
                    TTRewardVideoActivity.this.lk.ZU().Lxb(TTRewardVideoActivity.this.LD.Of);
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = TTRewardVideoActivity.this.LD;
                lxb.Of = !lxb.Of;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(TTRewardVideoActivity.this.LD.Of);
                sb.append(" mLastVolume=");
                sb.append(TTRewardVideoActivity.this.LD.xan.Lxb());
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = TTRewardVideoActivity.this.LD;
                lxb2.eK.LD(lxb2.Of);
                if (!com.bytedance.sdk.openadsdk.core.model.eK.tD(TTRewardVideoActivity.this.LD.LD) || TTRewardVideoActivity.this.LD.nBu.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.eK.ebl(TTRewardVideoActivity.this.LD.LD)) {
                        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = TTRewardVideoActivity.this.LD;
                        lxb3.xan.Lxb(lxb3.Of, true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = TTRewardVideoActivity.this.LD;
                    lxb4.hg.ZU(lxb4.Of);
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = TTRewardVideoActivity.this.LD;
                    lxb5.CSn.lc(lxb5.Of);
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar = TTRewardVideoActivity.this.LD.LD;
                    if (tDVar == null || tDVar.SlV() == null || TTRewardVideoActivity.this.LD.LD.SlV().Lxb() == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb6 = TTRewardVideoActivity.this.LD;
                    if (lxb6.eK != null) {
                        if (lxb6.Of) {
                            lxb6.LD.SlV().Lxb().OY(TTRewardVideoActivity.this.LD.eK.ebl());
                        } else {
                            lxb6.LD.SlV().Lxb().QAg(TTRewardVideoActivity.this.LD.eK.ebl());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.LD
            public void Lxb(View view) {
                if (TTRewardVideoActivity.this.LD.LD.uao()) {
                    if (TTRewardVideoActivity.this.LD.BcA.JVA() != null) {
                        TTRewardVideoActivity.this.LD.LD.CG(2);
                        TTRewardVideoActivity.this.LD.BcA.kqm();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = TTRewardVideoActivity.this.LD;
                if (!lxb.lk && lxb.LD.Njp() && !TTRewardVideoActivity.this.LD.LD.chu()) {
                    TTRewardVideoActivity.this.LD.LD.CG(13);
                    try {
                        TTRewardVideoActivity.this.LD.BcA.kqm();
                        return;
                    } catch (Exception unused) {
                    }
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.Lxb(com.bytedance.sdk.openadsdk.core.model.eK.lk(tTRewardVideoActivity.LD.LD), false);
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
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.LD.nE.Lxb(tTRewardVideoActivity.lk);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void ZU() {
        Sfi();
        this.LD.LD.BK();
        this.LD.LD.Lxb(true);
        if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(this.LD.LD)) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb.LD;
            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, lxb.JXs, tDVar.mhk());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void c_() {
        Sfi();
    }

    public void finalize() throws Throwable {
        super.finalize();
        Sfi = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.LD != null) {
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("videoForceBreak", this.LD.LD);
        }
        eK();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean kqm() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar;
        super.onCreate(bundle);
        try {
            if (STP == null) {
                STP = tD.Lxb(this, "tt_reward_msg");
                IeN = tD.Lxb(this, "tt_msgPlayable");
                VVE = tD.Lxb(this, "tt_negtiveBtnBtnText");
                kqm = tD.Lxb(this, "tt_postiveBtnText");
                brP = tD.Lxb(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            sLN.Lxb("TTAD.RVA", th.getMessage());
        }
        if (bundle == null || (lxb = this.LD) == null || (tDVar = lxb.LD) == null || !tDVar.oo()) {
            return;
        }
        this.HD.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        eK();
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("recycleRes");
        }
        this.NXR = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.view.LD ldLxb;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null || (ldLxb = lxb.id.Lxb()) == null) {
            return;
        }
        ldLxb.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lc() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.lc
            public void Lxb() {
                TTRewardVideoActivity.this.Sfi();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Sfi = this.NXR;
        if (this.HD.get() && (lxb = this.LD) != null) {
            lxb.LD.aHr();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void sLN() {
        tD();
    }

    public void tD() {
        if (this.HD.get()) {
            return;
        }
        this.HD.set(true);
        if (com.bytedance.sdk.openadsdk.core.kqm.ZU().VVE(String.valueOf(this.LD.lc))) {
            Lxb(true, this.LD.LD.HD(), this.LD.LD.Sfi(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.kqm.lk().Lxb(HD(), new com.bytedance.sdk.openadsdk.core.tD.LD() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.tD.LD
                public void Lxb(int i, String str) {
                    TTRewardVideoActivity.this.Lxb(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tD.LD
                public void Lxb(DY.LD ld) {
                    boolean z = ld.LD;
                    TTRewardVideoActivity.this.Lxb(ld.LD, ld.lk.Lxb(), ld.lk.LD(), 0, "");
                }
            });
        }
    }

    public void Lxb(String str) {
        Lxb(str, false, 0, "", 0, "");
    }

    private void Lxb(final String str, final boolean z, final int i, final String str2, final int i2, final String str3) {
        hg.lk(new OY("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.LD(0).executeRewardVideoCallback(TTRewardVideoActivity.this.LD.sRq, str, z, i, str2, i2, str3);
                } catch (Throwable th) {
                    sLN.Lxb("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            this.NXR = aH.Lxb().lk();
        }
        if (this.NXR != null || bundle == null) {
            return;
        }
        this.NXR = Sfi;
        Sfi = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void Lxb() {
        this.LD.nJ.Lxb(null, TTAdDislikeToast.getSkipText());
        this.LD.nJ.JXs(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final boolean z, boolean z2) {
        if (!z2 && this.aH && this.LD.nBu.get()) {
            if (com.bytedance.sdk.openadsdk.core.model.eK.OY(this.LD.LD)) {
                this.LD.hg.OY();
                return;
            } else if (com.bytedance.sdk.openadsdk.core.model.eK.nBu(this.LD.LD)) {
                this.LD.CSn.kqm();
                return;
            }
        }
        if (!com.bytedance.sdk.openadsdk.core.kqm.ZU().OY(String.valueOf(this.LD.lc))) {
            if (!z2 && this.LD.nBu.get()) {
                if (com.bytedance.sdk.openadsdk.core.model.eK.OY(this.LD.LD)) {
                    this.LD.hg.OY();
                    return;
                } else if (com.bytedance.sdk.openadsdk.core.model.eK.nBu(this.LD.LD)) {
                    this.LD.CSn.kqm();
                    return;
                }
            }
            if (z) {
                finish();
                return;
            } else {
                DY();
                return;
            }
        }
        if (this.HD.get()) {
            if (this.LD.nBu.get()) {
                if (com.bytedance.sdk.openadsdk.core.model.eK.OY(this.LD.LD)) {
                    this.LD.hg.OY();
                    return;
                } else if (com.bytedance.sdk.openadsdk.core.model.eK.nBu(this.LD.LD)) {
                    this.LD.CSn.kqm();
                    return;
                }
            }
            if (z) {
                finish();
                return;
            } else {
                DY();
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.eK.OY(this.LD.LD) && this.LD.hg.JVA().getVisibility() == 0) {
            this.LD.hg.OY();
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.eK.nBu(this.LD.LD) && this.LD.hg.nBu().getVisibility() == 0) {
            this.LD.CSn.kqm();
            return;
        }
        this.LD.DY.set(true);
        this.LD.eK.IeN();
        if (z) {
            this.LD.CSn.STP();
        }
        final com.bytedance.sdk.openadsdk.core.widget.LD ld = new com.bytedance.sdk.openadsdk.core.widget.LD(this);
        this.lk.NXR = ld;
        if (z) {
            ld.Lxb(IeN).LD(brP).lk(VVE);
        } else {
            ld.Lxb(STP).LD(kqm).lk(VVE);
        }
        this.lk.NXR.Lxb(new com.bytedance.sdk.openadsdk.core.widget.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.LD.Lxb
            public void LD() {
                ld.dismiss();
                TTRewardVideoActivity.this.aH = true;
                TTRewardVideoActivity.this.LD.DY.set(false);
                TTRewardVideoActivity.this.LD.CSn.lc(Integer.MAX_VALUE);
                if (z) {
                    if (com.bytedance.sdk.openadsdk.core.model.eK.brP(TTRewardVideoActivity.this.LD.LD)) {
                        if (com.bytedance.sdk.openadsdk.core.model.eK.OY(TTRewardVideoActivity.this.LD.LD)) {
                            if (TTRewardVideoActivity.this.LD.CSn.Lxb()) {
                                TTRewardVideoActivity.this.LD.CSn.Lxb(5);
                                return;
                            } else {
                                TTRewardVideoActivity.this.LD.hg.OY();
                                return;
                            }
                        }
                        TTRewardVideoActivity.this.LD.KPU.lc();
                        if (TTRewardVideoActivity.this.LD.CSn.Lxb()) {
                            TTRewardVideoActivity.this.LD.CSn.Lxb(4);
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.eK.lc(TTRewardVideoActivity.this.LD.LD)) {
                        if (com.bytedance.sdk.openadsdk.core.model.eK.nBu(TTRewardVideoActivity.this.LD.LD)) {
                            TTRewardVideoActivity.this.LD.CSn.kqm();
                            return;
                        } else {
                            TTRewardVideoActivity.this.LD.KPU.lc();
                            TTRewardVideoActivity.this.finish();
                            return;
                        }
                    }
                }
                TTRewardVideoActivity.this.DY();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.LD.Lxb
            public void Lxb() {
                TTRewardVideoActivity.this.LD.eK.STP();
                if (z) {
                    TTRewardVideoActivity.this.LD.CSn.JXs(1000);
                }
                ld.dismiss();
                TTRewardVideoActivity.this.LD.DY.set(false);
            }
        }).show();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void Lxb(@NonNull Intent intent) {
        super.Lxb(intent);
        this.tD = intent.getStringExtra("media_extra");
        this.DY = intent.getStringExtra("user_id");
    }

    public boolean Lxb(long j, boolean z) {
        ebl eblVar = new ebl();
        eblVar.Lxb(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        lxb.eK.Lxb(lxb.BcA.lc(), eblVar);
        Fo0 fo0 = new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            boolean Lxb;

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void LD(long j2, int i) {
                TTRewardVideoActivity.this.ZU.removeMessages(300);
                if (TTRewardVideoActivity.this.LD.eK.LD()) {
                    TTRewardVideoActivity.this.NXR();
                    return;
                }
                TTRewardVideoActivity.this.LD.eK.NXR();
                TTRewardVideoActivity.this.tD();
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity.LD.lk) {
                    tTRewardVideoActivity.Lxb(false, true, 3);
                } else {
                    tTRewardVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar = TTRewardVideoActivity.this.LD.eK;
                kqmVar.Lxb(!kqmVar.foI() ? 1 : 0, 2);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, int i) {
                com.bytedance.sdk.openadsdk.utils.sLN sln;
                if (this.Lxb) {
                    return;
                }
                this.Lxb = true;
                TTRewardVideoActivity.this.ZU.removeMessages(300);
                TTRewardVideoActivity.this.IeN();
                TTRewardVideoActivity.this.tD();
                TTRewardVideoActivity.this.LD.eK.Lxb(j2, j2);
                TTRewardVideoActivity.this.LD.tD.set(true);
                if (TTRewardVideoActivity.this.LD.LD.kqm() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = TTRewardVideoActivity.this.LD;
                    if (lxb2.lk) {
                        lxb2.aH.lk().ZU();
                        NXR.LD();
                    }
                }
                if (TTRewardVideoActivity.this.LD.LD.ZE()) {
                    TTRewardVideoActivity.this.LD.LD.CG(1);
                    TTRewardVideoActivity.this.LD.BcA.kqm();
                }
                if (TTRewardVideoActivity.this.LD.LD.kqm() == 21 && !TTRewardVideoActivity.this.LD.LD.ZU()) {
                    TTRewardVideoActivity.this.LD.LD.LD(true);
                    TTRewardVideoActivity.this.LD.BcA.kqm();
                }
                TTRewardVideoActivity.this.sLN = (int) (System.currentTimeMillis() / 1000);
                if (kqm.ZU(TTRewardVideoActivity.this.LD.LD) || kqm.LD(TTRewardVideoActivity.this.LD.LD) || kqm.JXs(TTRewardVideoActivity.this.LD.LD)) {
                    TTRewardVideoActivity.this.Lxb(false, 5);
                    if (!kqm.LD(TTRewardVideoActivity.this.LD.LD) || (sln = TTRewardVideoActivity.this.LD.MGT) == null) {
                        return;
                    }
                    sln.Lxb(0L);
                    return;
                }
                if (kqm.Lxb(TTRewardVideoActivity.this.LD.LD) && !TTRewardVideoActivity.this.LD.VVE.get()) {
                    TTRewardVideoActivity.this.LD.Lxb(true);
                    TTRewardVideoActivity.this.LD.nJ.JXs(true);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = TTRewardVideoActivity.this.LD;
                if (!lxb3.lk) {
                    if (lxb3.LD.MH()) {
                        TTRewardVideoActivity.this.LD.nJ.lk();
                        return;
                    }
                    if (!com.bytedance.sdk.openadsdk.core.model.tD.JXs(TTRewardVideoActivity.this.LD.LD)) {
                        TTRewardVideoActivity.this.LD.eK.Lxb("skip", true);
                    }
                    TTRewardVideoActivity.this.finish();
                    return;
                }
                if (lxb3.LD.MH()) {
                    TTRewardVideoActivity.this.LD.nJ.lk();
                    return;
                }
                TTRewardVideoActivity.this.Lxb(false, 5);
                if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(TTRewardVideoActivity.this.LD.LD)) {
                    return;
                }
                TTRewardVideoActivity.this.LD.eK.Lxb("skip", true);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb() {
                TTRewardVideoActivity.this.ZU.removeMessages(300);
                TTRewardVideoActivity.this.IeN();
                TTRewardVideoActivity.this.tD();
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity.LD.lk) {
                    tTRewardVideoActivity.Lxb(false, true, 6);
                } else {
                    tTRewardVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm kqmVar = TTRewardVideoActivity.this.LD.eK;
                kqmVar.Lxb(!kqmVar.foI() ? 1 : 0, 1 ^ (TTRewardVideoActivity.this.LD.eK.foI() ? 1 : 0));
                TTRewardVideoActivity.this.LD.eK.NXR();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = TTRewardVideoActivity.this.LD;
                if (!lxb2.Ld && lxb2.eK.LD()) {
                    TTRewardVideoActivity.this.LD.eK.IeN();
                }
                if (TTRewardVideoActivity.this.LD.nBu.get()) {
                    return;
                }
                TTRewardVideoActivity.this.ZU.removeMessages(300);
                if (j2 != TTRewardVideoActivity.this.LD.eK.OY()) {
                    TTRewardVideoActivity.this.IeN();
                }
                TTRewardVideoActivity.this.LD.eK.Lxb(j2, j3);
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                long j4 = j2 / 1000;
                double d = j4;
                tTRewardVideoActivity.lc = (int) (tTRewardVideoActivity.LD.eK.KPU() - d);
                TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                int i = tTRewardVideoActivity2.lc;
                if (i >= 0) {
                    tTRewardVideoActivity2.LD.nJ.Lxb(String.valueOf(i), null);
                }
                TTRewardVideoActivity tTRewardVideoActivity3 = TTRewardVideoActivity.this;
                tTRewardVideoActivity3.lc = (int) (tTRewardVideoActivity3.LD.eK.KPU() - d);
                int i2 = (int) j4;
                int iNBu = com.bytedance.sdk.openadsdk.core.kqm.ZU().nBu(String.valueOf(TTRewardVideoActivity.this.LD.lc));
                boolean z2 = iNBu >= 0;
                if ((TTRewardVideoActivity.this.LD.DY.get() || TTRewardVideoActivity.this.LD.JVA.get()) && TTRewardVideoActivity.this.LD.eK.LD()) {
                    TTRewardVideoActivity.this.LD.eK.IeN();
                }
                TTRewardVideoActivity.this.LD.BcA.ZU(i2);
                TTRewardVideoActivity.this.Lxb(j2, j3);
                TTRewardVideoActivity tTRewardVideoActivity4 = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity4.lc > 0) {
                    tTRewardVideoActivity4.LD.nJ.ZU(true);
                    if (z2 && i2 >= iNBu) {
                        TTRewardVideoActivity.this.LD.Lxb(true);
                        TTRewardVideoActivity tTRewardVideoActivity5 = TTRewardVideoActivity.this;
                        tTRewardVideoActivity5.LD.nJ.Lxb(String.valueOf(tTRewardVideoActivity5.lc), TTAdDislikeToast.getSkipText());
                        TTRewardVideoActivity.this.LD.nJ.JXs(true);
                        return;
                    }
                    TTRewardVideoActivity tTRewardVideoActivity6 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity6.LD.nJ.Lxb(String.valueOf(tTRewardVideoActivity6.lc), null);
                }
            }
        };
        this.LD.eK.Lxb(fo0);
        kqm kqmVar = this.LD.BcA.IeN;
        if (kqmVar != null) {
            kqmVar.Lxb(fo0);
        }
        boolean zLxb = this.LD.eK.Lxb(j, z, null, this.lk);
        if (zLxb && !z) {
            this.JVA = (int) (System.currentTimeMillis() / 1000);
        }
        return zLxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final boolean z, final int i, final String str, final int i2, final String str2) {
        Sfi.Lxb("BVA", "invoke callback onRewardVerify: " + z + ", " + i + ", " + str + ", " + i2 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb("onRewardVerify", z, i, str, i2, str2);
        } else {
            this.ZU.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb = TTRewardVideoActivity.this.NXR;
                    if (lxb != null) {
                        lxb.Lxb(z, i, str, i2, str2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(int i) {
        if (i == 10000) {
            tD();
        }
    }

    public void Lxb(long j, long j2) {
        long j3 = (((long) this.LD.JZE) * 1000) + j;
        if (this.eK == -1) {
            this.eK = com.bytedance.sdk.openadsdk.core.kqm.ZU().foI(String.valueOf(this.LD.lc)).lc;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS && j3 >= 27000) {
            tD();
        } else if ((j3 * 100) / j2 >= this.eK) {
            tD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(boolean z) {
        if (z) {
            tD();
            return;
        }
        if ((1.0d - (((double) this.lc) / this.LD.eK.KPU())) * 100.0d >= com.bytedance.sdk.openadsdk.core.kqm.ZU().foI(String.valueOf(this.LD.lc)).lc) {
            tD();
        }
    }
}
