package com.google.android.material.transition;

import androidx.transition.Transition;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Od0;

/* JADX INFO: loaded from: classes3.dex */
abstract class TransitionListenerAdapter implements Transition.TransitionListener {
    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z) {
        Od0.a(this, transition, z);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final /* synthetic */ void onTransitionStart(Transition transition, boolean z) {
        Od0.b(this, transition, z);
    }
}
