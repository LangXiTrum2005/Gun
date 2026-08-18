package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.NXR;

/* JADX INFO: loaded from: classes2.dex */
public class TTAdActivity extends TTBaseActivity {
    private LD Lxb;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LD ld = this.Lxb;
        if (ld != null) {
            ld.Lxb((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        LD ld = this.Lxb;
        if (ld == null) {
            super.onBackPressed();
        } else {
            ld.ZU();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxbLk = aH.Lxb().lk();
        com.bytedance.sdk.openadsdk.Lxb.lk.LD ldZU = aH.Lxb().ZU();
        tD tDVarLxb = com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.NXR.ZU.LD) null);
        if (tDVarLxb == null) {
            finish();
            return;
        }
        LD ld = new LD(this, tDVarLxb);
        this.Lxb = ld;
        ld.Lxb(this, bundle, lxbLk, ldZU);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LD ld = this.Lxb;
        if (ld != null) {
            ld.JXs(this);
        }
        aH.Lxb().Lxb((com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb) null);
        aH.Lxb().Lxb((com.bytedance.sdk.openadsdk.Lxb.lk.LD) null);
        NXR.Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LD ld = this.Lxb;
        if (ld != null) {
            ld.lk(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LD ld = this.Lxb;
        if (ld != null) {
            ld.LD(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        LD ld = this.Lxb;
        if (ld != null) {
            ld.Lxb(this, bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        LD ld = this.Lxb;
        if (ld != null) {
            ld.Lxb(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        LD ld = this.Lxb;
        if (ld != null) {
            ld.ZU(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        LD ld = this.Lxb;
        if (ld != null) {
            ld.Lxb(z);
        }
    }
}
