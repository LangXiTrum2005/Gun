package com.bytedance.sdk.openadsdk.activity;

import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm;
import com.bytedance.sdk.openadsdk.component.reward.view.OY;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.NXR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public boolean Lxb(long j, boolean z) {
        OY oy = this.LD.id;
        ebl eblVar = (oy == null || oy.Lxb() == null) ? new ebl() : this.LD.id.Lxb().getAdShowTime();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        lxb.eK.Lxb(lxb.id.LD(), eblVar);
        HashMap map = new HashMap();
        OY oy2 = this.LD.id;
        if (oy2 != null) {
            map.put("dynamic_show_type", Integer.valueOf(oy2.QAg()));
            JSONObject jSONObjectLxb = this.LD.id.Lxb((JSONObject) null);
            if (jSONObjectLxb != null) {
                Iterator<String> itKeys = jSONObjectLxb.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectLxb.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        this.LD.eK.Lxb(new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.1
            boolean Lxb;

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void LD(long j2, int i) {
                TTRewardExpressVideoActivity.this.ZU.removeMessages(300);
                if (TTRewardExpressVideoActivity.this.LD.eK.LD()) {
                    TTRewardExpressVideoActivity.this.NXR();
                    return;
                }
                TTRewardExpressVideoActivity.this.tD();
                TTRewardExpressVideoActivity.this.LD.eK.NXR();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.LD.lk) {
                    tTRewardExpressVideoActivity.Lxb(false, 3);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                TTRewardExpressVideoActivity.this.LD.id.Lxb(true);
                kqm kqmVar = TTRewardExpressVideoActivity.this.LD.eK;
                kqmVar.Lxb(1 ^ (kqmVar.foI() ? 1 : 0), 2);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, int i) {
                if (this.Lxb) {
                    return;
                }
                this.Lxb = true;
                TTRewardExpressVideoActivity.this.ZU.removeMessages(300);
                TTRewardExpressVideoActivity.this.IeN();
                TTRewardExpressVideoActivity.this.LD.eK.Lxb(j2, j2);
                TTRewardExpressVideoActivity.this.LD.id.LD(true);
                if (TTRewardExpressVideoActivity.this.LD.LD.kqm() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = TTRewardExpressVideoActivity.this.LD;
                    if (lxb2.lk) {
                        lxb2.aH.lk().ZU();
                        NXR.LD();
                    }
                }
                if (TTRewardExpressVideoActivity.this.LD.LD.kqm() == 21 && !TTRewardExpressVideoActivity.this.LD.LD.ZU()) {
                    TTRewardExpressVideoActivity.this.LD.LD.LD(true);
                    TTRewardExpressVideoActivity.this.LD.BcA.kqm();
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = TTRewardExpressVideoActivity.this.LD;
                if (lxb3.lk) {
                    if (!lxb3.LD.MH()) {
                        TTRewardExpressVideoActivity.this.Lxb(false, 5);
                        if (!tD.JXs(TTRewardExpressVideoActivity.this.LD.LD)) {
                            TTRewardExpressVideoActivity.this.LD.eK.Lxb("skip", true);
                        }
                    } else if (TTRewardExpressVideoActivity.this.LD.id.QAg() == 1) {
                        TTRewardExpressVideoActivity.this.LD.nJ.lk();
                    }
                } else if (!lxb3.LD.MH()) {
                    if (!tD.JXs(TTRewardExpressVideoActivity.this.LD.LD)) {
                        TTRewardExpressVideoActivity.this.LD.eK.Lxb("skip", true);
                    }
                    TTRewardExpressVideoActivity.this.finish();
                } else if (TTRewardExpressVideoActivity.this.LD.id.QAg() == 1) {
                    TTRewardExpressVideoActivity.this.LD.nJ.lk();
                }
                ((TTRewardVideoActivity) TTRewardExpressVideoActivity.this).sLN = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.tD();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb() {
                TTRewardExpressVideoActivity.this.ZU.removeMessages(300);
                TTRewardExpressVideoActivity.this.IeN();
                TTRewardExpressVideoActivity.this.tD();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.LD.lk) {
                    tTRewardExpressVideoActivity.Lxb(false, 6);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                kqm kqmVar = TTRewardExpressVideoActivity.this.LD.eK;
                kqmVar.Lxb(!kqmVar.foI() ? 1 : 0, !TTRewardExpressVideoActivity.this.LD.eK.foI() ? 1 : 0);
                TTRewardExpressVideoActivity.this.LD.eK.NXR();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = TTRewardExpressVideoActivity.this.LD;
                if (!lxb2.Ld && lxb2.eK.LD()) {
                    TTRewardExpressVideoActivity.this.LD.eK.IeN();
                }
                if (TTRewardExpressVideoActivity.this.LD.nBu.get()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.ZU.removeMessages(300);
                if (j2 != TTRewardExpressVideoActivity.this.LD.eK.OY()) {
                    TTRewardExpressVideoActivity.this.IeN();
                }
                if (TTRewardExpressVideoActivity.this.LD.eK.LD()) {
                    TTRewardExpressVideoActivity.this.LD.eK.Lxb(j2, j3);
                    int iNBu = com.bytedance.sdk.openadsdk.core.kqm.ZU().nBu(String.valueOf(TTRewardExpressVideoActivity.this.LD.lc));
                    boolean z2 = TTRewardExpressVideoActivity.this.LD.id.OY() && iNBu >= 0;
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTRewardExpressVideoActivity.lc = (int) (tTRewardExpressVideoActivity.LD.eK.KPU() - j4);
                    int i = (int) j4;
                    if ((TTRewardExpressVideoActivity.this.LD.DY.get() || TTRewardExpressVideoActivity.this.LD.JVA.get()) && TTRewardExpressVideoActivity.this.LD.eK.LD()) {
                        TTRewardExpressVideoActivity.this.LD.eK.IeN();
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity2 = TTRewardExpressVideoActivity.this;
                    int i2 = tTRewardExpressVideoActivity2.lc;
                    if (i2 >= 0) {
                        tTRewardExpressVideoActivity2.LD.nJ.Lxb(String.valueOf(i2), null);
                    }
                    TTRewardExpressVideoActivity.this.LD.BcA.ZU(i);
                    TTRewardExpressVideoActivity.this.Lxb(j2, j3);
                    OY oy3 = TTRewardExpressVideoActivity.this.LD.id;
                    if (oy3 != null && oy3.Lxb() != null) {
                        TTRewardExpressVideoActivity.this.LD.id.Lxb().setTime(String.valueOf(TTRewardExpressVideoActivity.this.lc), i, 0, false);
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity3 = TTRewardExpressVideoActivity.this;
                    if (tTRewardExpressVideoActivity3.lc > 0) {
                        if (z2 && i >= iNBu && tTRewardExpressVideoActivity3.LD.LD.kqm() != 5 && TTRewardExpressVideoActivity.this.LD.LD.kqm() != 33) {
                            TTRewardExpressVideoActivity.this.LD.Lxb(true);
                            TTRewardExpressVideoActivity tTRewardExpressVideoActivity4 = TTRewardExpressVideoActivity.this;
                            tTRewardExpressVideoActivity4.LD.nJ.Lxb(String.valueOf(tTRewardExpressVideoActivity4.lc), TTAdDislikeToast.getSkipText());
                            TTRewardExpressVideoActivity.this.LD.nJ.JXs(true);
                            return;
                        }
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity5 = TTRewardExpressVideoActivity.this;
                        tTRewardExpressVideoActivity5.LD.nJ.Lxb(String.valueOf(tTRewardExpressVideoActivity5.lc), null);
                    }
                }
            }
        });
        boolean zLxb = this.LD.eK.Lxb(j, z, map, this.lk);
        if (zLxb && !z) {
            ((TTRewardVideoActivity) this).JVA = (int) (System.currentTimeMillis() / 1000);
        }
        return zLxb;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean brP() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void lk() {
    }
}
