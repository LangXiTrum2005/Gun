package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DW implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC0884Lz A00;

    public DW(ViewOnClickListenerC0884Lz viewOnClickListenerC0884Lz) {
        this.A00 = viewOnClickListenerC0884Lz;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((C1701hu) this.A00).A07.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
