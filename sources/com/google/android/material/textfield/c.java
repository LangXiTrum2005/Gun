package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f827a;
    public final /* synthetic */ EndIconDelegate b;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i) {
        this.f827a = i;
        this.b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f827a;
        EndIconDelegate endIconDelegate = this.b;
        switch (i) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$getAlphaAnimator$3(valueAnimator);
                break;
            case 1:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$getScaleAnimator$4(valueAnimator);
                break;
            default:
                ((DropdownMenuEndIconDelegate) endIconDelegate).lambda$getAlphaAnimator$6(valueAnimator);
                break;
        }
    }
}
