package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleOwner;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;

/* JADX INFO: loaded from: classes.dex */
@MainThread
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, final InterfaceC5000xE interfaceC5000xE) {
        AbstractC2995aW.q(lifecycle, "lifecycle");
        AbstractC2995aW.q(state, "minState");
        AbstractC2995aW.q(dispatchQueue, "dispatchQueue");
        AbstractC2995aW.q(interfaceC5000xE, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uH
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f5072a, interfaceC5000xE, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            interfaceC5000xE.a(null);
            finish();
        }
    }

    private final void handleDestroy(InterfaceC5000xE interfaceC5000xE) {
        interfaceC5000xE.a(null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController lifecycleController, InterfaceC5000xE interfaceC5000xE, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC2995aW.q(lifecycleController, "this$0");
        AbstractC2995aW.q(interfaceC5000xE, "$parentJob");
        AbstractC2995aW.q(lifecycleOwner, "source");
        AbstractC2995aW.q(event, "<anonymous parameter 1>");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            interfaceC5000xE.a(null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState) < 0) {
            lifecycleController.dispatchQueue.pause();
        } else {
            lifecycleController.dispatchQueue.resume();
        }
    }

    @MainThread
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
