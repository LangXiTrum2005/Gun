package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DV implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC0884Lz A00;

    public DV(ViewOnClickListenerC0884Lz viewOnClickListenerC0884Lz) {
        this.A00 = viewOnClickListenerC0884Lz;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.A06();
        if (this.A00.A04 <= 0) {
            return;
        }
        this.A00.A05.postDelayed(this.A00.A07, this.A00.A04);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
