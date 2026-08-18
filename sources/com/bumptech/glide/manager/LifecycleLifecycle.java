package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4651tH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tg0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC4651tH, LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f219a = new HashSet();
    public final Lifecycle b;

    public LifecycleLifecycle(Lifecycle lifecycle) {
        this.b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4651tH
    public final void l(InterfaceC4827vH interfaceC4827vH) {
        this.f219a.remove(interfaceC4827vH);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Tg0.e(this.f219a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4827vH) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Tg0.e(this.f219a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4827vH) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Tg0.e(this.f219a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4827vH) it.next()).onStop();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4651tH
    public final void s(InterfaceC4827vH interfaceC4827vH) {
        this.f219a.add(interfaceC4827vH);
        Lifecycle lifecycle = this.b;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            interfaceC4827vH.onDestroy();
        } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            interfaceC4827vH.onStart();
        } else {
            interfaceC4827vH.onStop();
        }
    }
}
