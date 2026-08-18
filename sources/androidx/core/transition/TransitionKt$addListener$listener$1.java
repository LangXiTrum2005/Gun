package androidx.core.transition;

import android.transition.Transition;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ InterfaceC2766Sw $onCancel;
    final /* synthetic */ InterfaceC2766Sw $onEnd;
    final /* synthetic */ InterfaceC2766Sw $onPause;
    final /* synthetic */ InterfaceC2766Sw $onResume;
    final /* synthetic */ InterfaceC2766Sw $onStart;

    public TransitionKt$addListener$listener$1(InterfaceC2766Sw interfaceC2766Sw, InterfaceC2766Sw interfaceC2766Sw2, InterfaceC2766Sw interfaceC2766Sw3, InterfaceC2766Sw interfaceC2766Sw4, InterfaceC2766Sw interfaceC2766Sw5) {
        this.$onEnd = interfaceC2766Sw;
        this.$onResume = interfaceC2766Sw2;
        this.$onPause = interfaceC2766Sw3;
        this.$onCancel = interfaceC2766Sw4;
        this.$onStart = interfaceC2766Sw5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        this.$onStart.invoke(transition);
    }
}
