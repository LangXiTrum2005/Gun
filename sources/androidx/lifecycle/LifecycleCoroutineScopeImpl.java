package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3217cz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final InterfaceC3549gk coroutineContext;
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass1 anonymousClass1 = LifecycleCoroutineScopeImpl.this.new AnonymousClass1(interfaceC2857Wj);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) interfaceC4514rk.getCoroutineContext().get(G7.e);
                if (interfaceC5000xE != null) {
                    interfaceC5000xE.a(null);
                }
            }
            return C5033xf0.f5238a;
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, InterfaceC3549gk interfaceC3549gk) {
        InterfaceC5000xE interfaceC5000xE;
        AbstractC2995aW.q(lifecycle, "lifecycle");
        AbstractC2995aW.q(interfaceC3549gk, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = interfaceC3549gk;
        if (getLifecycle$lifecycle_common().getCurrentState() != Lifecycle.State.DESTROYED || (interfaceC5000xE = (InterfaceC5000xE) getCoroutineContext().get(G7.e)) == null) {
            return;
        }
        interfaceC5000xE.a(null);
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk
    public InterfaceC3549gk getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC2995aW.q(lifecycleOwner, "source");
        AbstractC2995aW.q(event, NotificationCompat.CATEGORY_EVENT);
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) getCoroutineContext().get(G7.e);
            if (interfaceC5000xE != null) {
                interfaceC5000xE.a(null);
            }
        }
    }

    public final void register() {
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        WD.D(this, ((C3217cz) TL.f3768a).d, 0, new AnonymousClass1(null), 2);
    }
}
