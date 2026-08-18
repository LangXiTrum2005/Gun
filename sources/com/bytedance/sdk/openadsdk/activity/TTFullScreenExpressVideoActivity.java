package com.bytedance.sdk.openadsdk.activity;

import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.component.reward.LD.QAg;
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
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public boolean Lxb(long j, boolean z) {
        OY oy = this.LD.id;
        ebl eblVar = (oy == null || oy.Lxb() == null) ? new ebl() : this.LD.id.Lxb().getAdShowTime();
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk;
        if (ld == null || !(ld instanceof QAg)) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
            lxb.eK.Lxb(lxb.id.LD(), eblVar);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
            if (lxb2.Lpq) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.LD;
                lxb3.eK.Lxb(lxb3.id.LD(), eblVar);
            } else {
                lxb2.eK.Lxb(((QAg) ld).Ivz(), eblVar);
            }
        }
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
        this.LD.eK.Lxb(new Fo0() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.1
            boolean Lxb;

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void LD(long j2, int i) {
                TTFullScreenExpressVideoActivity.this.ZU.removeMessages(300);
                if (TTFullScreenExpressVideoActivity.this.LD.eK.LD()) {
                    TTFullScreenExpressVideoActivity.this.NXR();
                    return;
                }
                TTFullScreenExpressVideoActivity.this.LD.eK.NXR();
                sLN.Lxb("TTAD.FSEVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                TTFullScreenExpressVideoActivity.this.LD.id.Lxb(true);
                TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                if (!tTFullScreenExpressVideoActivity.LD.lk) {
                    tTFullScreenExpressVideoActivity.finish();
                    return;
                }
                tTFullScreenExpressVideoActivity.Lxb(false, 3);
                kqm kqmVar = TTFullScreenExpressVideoActivity.this.LD.eK;
                kqmVar.Lxb(1 ^ (kqmVar.foI() ? 1 : 0), 2);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, int i) {
                if (this.Lxb) {
                    return;
                }
                this.Lxb = true;
                TTFullScreenExpressVideoActivity.this.ZU.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.IeN();
                TTFullScreenExpressVideoActivity.this.LD.eK.Lxb(j2, j2);
                TTFullScreenExpressVideoActivity.this.LD.id.LD(true);
                if (TTFullScreenExpressVideoActivity.this.LD.LD.kqm() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = TTFullScreenExpressVideoActivity.this.LD;
                    if (lxb4.lk) {
                        lxb4.aH.lk().ZU();
                        NXR.LD();
                    }
                }
                if (TTFullScreenExpressVideoActivity.this.LD.LD.kqm() == 21 && !TTFullScreenExpressVideoActivity.this.LD.LD.ZU()) {
                    TTFullScreenExpressVideoActivity.this.LD.LD.LD(true);
                    TTFullScreenExpressVideoActivity.this.LD.BcA.kqm();
                }
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb5 = TTFullScreenExpressVideoActivity.this.LD;
                if (lxb5.lk) {
                    if (lxb5.LD.MH()) {
                        if (TTFullScreenExpressVideoActivity.this.LD.id.QAg() == 1) {
                            TTFullScreenExpressVideoActivity.this.LD.nJ.lk();
                            return;
                        }
                        return;
                    } else {
                        TTFullScreenExpressVideoActivity.this.Lxb(false, 5);
                        if (tD.JXs(TTFullScreenExpressVideoActivity.this.LD.LD)) {
                            return;
                        }
                        TTFullScreenExpressVideoActivity.this.LD.eK.Lxb("skip", true);
                        return;
                    }
                }
                if (tD.JXs(lxb5.LD)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                    return;
                }
                OY oy3 = TTFullScreenExpressVideoActivity.this.LD.id;
                if (oy3 == null || oy3.Lxb() == null) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.LD.id.Lxb().setTime("0", 0, 0, false);
                if (TTFullScreenExpressVideoActivity.this.LD.id.OY()) {
                    TTFullScreenExpressVideoActivity.this.LD.nJ.Lxb("0", "X");
                    TTFullScreenExpressVideoActivity.this.LD.nJ.JXs(true);
                    TTFullScreenExpressVideoActivity.this.LD.nJ.lk();
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb() {
                TTFullScreenExpressVideoActivity.this.ZU.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.IeN();
                TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                if (tTFullScreenExpressVideoActivity.LD.lk) {
                    tTFullScreenExpressVideoActivity.Lxb(false, 6);
                } else {
                    tTFullScreenExpressVideoActivity.finish();
                }
                kqm kqmVar = TTFullScreenExpressVideoActivity.this.LD.eK;
                kqmVar.Lxb(!kqmVar.foI() ? 1 : 0, !TTFullScreenExpressVideoActivity.this.LD.eK.foI() ? 1 : 0);
                TTFullScreenExpressVideoActivity.this.LD.eK.NXR();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
            public void Lxb(long j2, long j3) {
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = TTFullScreenExpressVideoActivity.this.LD;
                if (!lxb4.Ld && lxb4.eK.LD()) {
                    TTFullScreenExpressVideoActivity.this.LD.eK.IeN();
                }
                if (TTFullScreenExpressVideoActivity.this.LD.nBu.get()) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.ZU.removeMessages(300);
                if (j2 != TTFullScreenExpressVideoActivity.this.LD.eK.OY()) {
                    TTFullScreenExpressVideoActivity.this.IeN();
                }
                if (TTFullScreenExpressVideoActivity.this.LD.eK.LD()) {
                    TTFullScreenExpressVideoActivity.this.LD.eK.Lxb(j2, j3);
                    TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTFullScreenExpressVideoActivity.lc = (int) (tTFullScreenExpressVideoActivity.LD.eK.KPU() - j4);
                    int i = (int) j4;
                    if ((TTFullScreenExpressVideoActivity.this.LD.DY.get() || TTFullScreenExpressVideoActivity.this.LD.JVA.get()) && TTFullScreenExpressVideoActivity.this.LD.eK.LD()) {
                        TTFullScreenExpressVideoActivity.this.LD.eK.IeN();
                    }
                    OY oy3 = TTFullScreenExpressVideoActivity.this.LD.id;
                    if (oy3 != null && oy3.Lxb() != null) {
                        TTFullScreenExpressVideoActivity.this.LD.id.Lxb().setTime(String.valueOf(TTFullScreenExpressVideoActivity.this.lc), i, 0, false);
                    }
                    if (TTFullScreenExpressVideoActivity.this.LD.id.OY() || TTFullScreenExpressVideoActivity.this.LD.LD.JP()) {
                        TTFullScreenExpressVideoActivity.this.lk(i);
                        TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity2 = TTFullScreenExpressVideoActivity.this;
                        if (tTFullScreenExpressVideoActivity2.lc >= 0) {
                            tTFullScreenExpressVideoActivity2.LD.nJ.ZU(true);
                            TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity3 = TTFullScreenExpressVideoActivity.this;
                            tTFullScreenExpressVideoActivity3.LD.nJ.Lxb(String.valueOf(tTFullScreenExpressVideoActivity3.lc), null);
                        }
                    }
                }
            }
        });
        return this.LD.eK.Lxb(j, z, map, this.lk);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean brP() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void lk() {
    }
}
