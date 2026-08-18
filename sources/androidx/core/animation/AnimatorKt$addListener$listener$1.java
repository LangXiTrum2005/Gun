package androidx.core.animation;

import android.animation.Animator;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ InterfaceC2766Sw $onCancel;
    final /* synthetic */ InterfaceC2766Sw $onEnd;
    final /* synthetic */ InterfaceC2766Sw $onRepeat;
    final /* synthetic */ InterfaceC2766Sw $onStart;

    public AnimatorKt$addListener$listener$1(InterfaceC2766Sw interfaceC2766Sw, InterfaceC2766Sw interfaceC2766Sw2, InterfaceC2766Sw interfaceC2766Sw3, InterfaceC2766Sw interfaceC2766Sw4) {
        this.$onRepeat = interfaceC2766Sw;
        this.$onEnd = interfaceC2766Sw2;
        this.$onCancel = interfaceC2766Sw3;
        this.$onStart = interfaceC2766Sw4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.$onStart.invoke(animator);
    }
}
