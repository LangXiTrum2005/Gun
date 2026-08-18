package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HA implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0851Kr A00;

    public HA(C0851Kr c0851Kr) {
        this.A00 = c0851Kr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A0a.getLayoutParams().height = num.intValue();
        this.A00.A0a.requestLayout();
    }
}
