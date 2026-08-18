package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.component.reward.LD.ebl;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.JVA;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.OY;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.CSn;
import com.bytedance.sdk.openadsdk.utils.NXR;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements aH.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD {
    private boolean JVA;
    protected IListenerManager JXs;
    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb LD;
    public final String Lxb;
    private final AtomicBoolean NXR;
    boolean OY;
    int QAg;
    final aH ZU;
    int lc;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.LD.LD lk;
    protected com.bytedance.sdk.openadsdk.sLN.JXs nBu;
    private int sLN;

    public TTBaseVideoActivity() {
        this.Lxb = kqm() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.ZU = new aH(Looper.getMainLooper(), this);
        this.JVA = false;
        this.sLN = 0;
        this.QAg = 1;
        this.NXR = new AtomicBoolean(false);
        this.nBu = new com.bytedance.sdk.openadsdk.sLN.JXs() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.sLN.JXs
            public void Lxb() {
                TTBaseVideoActivity.this.STP();
            }
        };
    }

    private void DY() {
        this.lk.Lxb(this.nBu);
        this.lc = (int) this.LD.eK.KPU();
        VVE();
        lk();
        if (this.LD.LD.SlV() == null || this.LD.LD.SlV().Lxb() == null) {
            return;
        }
        this.LD.LD.SlV().Lxb().Lxb(0L);
    }

    private boolean Sfi() {
        if (this.LD.nBu.get() && this.LD.ebl) {
            return false;
        }
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.LD.nBu.get();
        }
        return true;
    }

    private void tD() {
        setContentView(this.LD.rW);
        this.LD.rW.Lxb(this.lk);
        this.lk.Lxb(this, this.ZU);
        this.lk.JVA();
    }

    public void IeN() {
        this.ZU.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void JVA() {
        if (!this.LD.STP.getAndSet(true) || eK.lk(this.LD.LD)) {
            this.LD.KPU.Lxb();
        }
    }

    public abstract void JXs();

    public IListenerManager LD(int i) {
        if (this.JXs == null) {
            this.JXs = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().Lxb(i));
        }
        return this.JXs;
    }

    public abstract void Lxb();

    public void Lxb(@NonNull Intent intent) {
    }

    public void NXR() {
        Message message = new Message();
        message.what = 400;
        if (kqm()) {
            Lxb(10000);
        }
        this.ZU.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void OY() {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk;
        if (ld == null) {
            return;
        }
        ld.NXR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void QAg() {
        this.LD.eK.Ivz();
    }

    public abstract void VVE();

    public boolean brP() {
        return false;
    }

    public void ebl() {
        if (brP() && !this.JVA) {
            this.JVA = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = tTBaseVideoActivity.LD;
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.lc lcVar = lxb.Ivz;
                    float[] fArrLxb = lxb.foI.Lxb(tTBaseVideoActivity.QAg);
                    TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                    lcVar.Lxb(fArrLxb, tTBaseVideoActivity2, tTBaseVideoActivity2.lk);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.LD == null) {
            return;
        }
        if (CSn.JXs()) {
            le.LD((Activity) this);
        }
        if (eK.ebl(this.LD.LD) && !this.LD.nBu.get()) {
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
        } else {
            if (!eK.JXs(this.LD.LD) || this.LD.CSn.OY(OY.LD)) {
                return;
            }
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
        }
    }

    public abstract boolean kqm();

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void lc() {
        if (this.NXR.compareAndSet(false, true)) {
            Sfi.Lxb("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            JXs();
        }
    }

    public void lk() {
        if (eK.lk(this.LD.LD)) {
            Lxb(false, com.bytedance.sdk.openadsdk.ZU.LD.C0078LD.lk);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk;
        if (ld != null) {
            ld.Lxb(this.LD.BcA.lc());
            this.lk.id();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public View nBu() {
        return this.LD.eK.nE();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null) {
            return;
        }
        lxb.foI.Lxb();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld;
        if (this.LD == null || (ld = this.lk) == null) {
            super.onBackPressed();
        } else {
            ld.eK();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb;
        super.onCreate(bundle);
        Sfi.Lxb("BVA", "onCreate ".concat(String.valueOf(this)));
        kqm.LD(getApplicationContext());
        if (!STP.JXs()) {
            finish();
            return;
        }
        tD tDVarLxb = com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(getIntent(), bundle, this);
        if (tDVarLxb == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.LD.Lxb(tDVarLxb);
        this.QAg = tDVarLxb.wCT();
        Lxb(tDVarLxb, bundle);
        if (bundle != null) {
            if (tDVarLxb.YZq()) {
                this.NXR.set(true);
            }
            if (tDVarLxb.zqY() && (lxb = this.LD) != null) {
                lxb.NXR.set(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
            if (lxb2 != null) {
                lxb2.KPU.ebl();
            }
        }
        try {
            tD();
            DY();
        } catch (Throwable th) {
            sLN.Lxb("TTAD.BVA", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.STP.lk.LD();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Sfi.Lxb("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null || this.lk == null) {
            return;
        }
        if (lxb.FD > 0 && lxb.NXR.get()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LD.FD);
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(strValueOf, lxb2.LD, this.Lxb, lxb2.eK.Lxb());
            this.LD.FD = 0L;
        }
        this.LD.nE.LD();
        this.ZU.removeCallbacksAndMessages(null);
        this.lk.HD();
        com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.LD.LD);
        com.bytedance.sdk.openadsdk.eK.Lxb.lk.LD(this.LD.LD);
        final AdSlot adSlotHg = this.LD.LD.hg();
        if (!this.LD.eK.aH() && adSlotHg != null && TextUtils.isEmpty(adSlotHg.getBidAdm())) {
            STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    if (TTBaseVideoActivity.this.kqm()) {
                        com.bytedance.sdk.openadsdk.component.reward.sLN.Lxb(kqm.Lxb()).Lxb(adSlotHg);
                    } else {
                        com.bytedance.sdk.openadsdk.component.reward.JXs.Lxb(kqm.Lxb()).Lxb(adSlotHg);
                    }
                }
            });
        }
        NXR.Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Sfi.Lxb("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk;
        if (ld == null) {
            return;
        }
        ld.DY();
    }

    @Override // android.app.Activity
    public void onRestart() {
        tD tDVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null || (tDVar = lxb.LD) == null) {
            return;
        }
        if (this.ebl && !tDVar.eXY() && !TextUtils.isEmpty(tD.Lxb(this, tDVar))) {
            finish();
        }
        if (tDVar.eXY()) {
            tDVar.JXs(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld;
        super.onResume();
        Sfi.Lxb("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.LD == null || (ld = this.lk) == null) {
            return;
        }
        ld.kqm();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        lxb.Ld = true;
        lxb.foI.LD(this.ZU);
        if (Sfi()) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
            lxb2.nJ.Lxb(lxb2.LD.FV());
        }
        this.LD.BcA.IeN();
        this.LD.hg.HD();
        this.LD.CSn.NXR();
        if (this.lk.LD()) {
            this.LD.eK.Lxb(this.lk);
            this.LD.eK.Lxb(false, this, this.sLN != 0);
        }
        this.sLN++;
        ebl();
        com.bytedance.sdk.openadsdk.component.reward.view.OY oy = this.LD.id;
        if (oy != null) {
            oy.ebl();
        }
        this.LD.foI.Lxb(this.ZU);
        this.lk.tD();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (lxb.NXR.get()) {
            this.LD.LD.OY(true);
        }
        if (this.NXR.get()) {
            this.LD.LD.Xp();
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(this.LD, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Sfi.Lxb("BVA", "onStart ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb == null) {
            return;
        }
        lxb.hg.hg();
        com.bytedance.sdk.openadsdk.utils.lk.Lxb(this, this.LD.LD);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Sfi.Lxb("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk;
        if (ld == null) {
            return;
        }
        ld.Sfi();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        JVA jva;
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb != null && (jva = lxb.KPU) != null) {
            jva.LD(z);
            this.LD.KPU.lk(z);
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
        if (lxb2 != null) {
            com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = lxb2.bG;
            if (ld instanceof com.bytedance.sdk.openadsdk.component.reward.LD.lc) {
                ((com.bytedance.sdk.openadsdk.component.reward.LD.lc) ld).LD(z);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void sLN() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void Lxb(Bundle bundle) {
    }

    private void Lxb(tD tDVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = new com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb(this, this.ZU, tDVar, this, 0);
        this.LD = lxb;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(lxb, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Lxb(intent);
            tDVar.Lxb(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.LD.LXE) {
            Lxb();
        }
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ldLxb = ebl.Lxb(this.LD);
        this.lk = ldLxb;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
        lxb2.bG = ldLxb;
        NXR.Lxb(lxb2);
        Objects.toString(this.lk);
    }

    public void Lxb(boolean z, int i) {
        Lxb(z, false, i);
    }

    public void Lxb(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk;
        if (ld == null) {
            return;
        }
        ld.Lxb(z, z2, false, i);
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.lk;
        if (ld == null) {
            return;
        }
        ld.Lxb(message);
    }
}
