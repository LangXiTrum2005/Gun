package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3217cz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2, reason: invalid class name */
    public static final class AnonymousClass2 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ InterfaceC2714Qw $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC2714Qw interfaceC2714Qw) {
            super(0);
            this.$block = interfaceC2714Qw;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z, AbstractC3899kk abstractC3899kk, final InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        final C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        final ?? r7 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Object objV;
                AbstractC2995aW.q(lifecycleOwner, "source");
                AbstractC2995aW.q(event, NotificationCompat.CATEGORY_EVENT);
                if (event != Lifecycle.Event.Companion.upTo(state)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        c2798Uc.resumeWith(AbstractC3375el.v(new LifecycleDestroyedException()));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                InterfaceC2772Tc interfaceC2772Tc = c2798Uc;
                try {
                    objV = interfaceC2714Qw.invoke();
                } catch (Throwable th) {
                    objV = AbstractC3375el.v(th);
                }
                interfaceC2772Tc.resumeWith(objV);
            }
        };
        if (z) {
            abstractC3899kk.dispatch(C2734Rq.f3684a, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(r7);
                }
            });
        } else {
            lifecycle.addObserver(r7);
        }
        c2798Uc.n(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(abstractC3899kk, lifecycle, r7));
        return c2798Uc.s();
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC2714Qw.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC2714Qw.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC2714Qw.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC2714Qw.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return interfaceC2714Qw.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC2714Qw.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC2714Qw.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
        boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return interfaceC2714Qw.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
            boolean zIsDispatchNeeded = c3217cz.isDispatchNeeded(interfaceC2857Wj.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return interfaceC2714Qw.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, c3217cz, new AnonymousClass2(interfaceC2714Qw), interfaceC2857Wj);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
