package androidx.lifecycle;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3217cz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcherKt {

    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC3567gx $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = interfaceC3567gx;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC2857Wj);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    AbstractC3375el.b0(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            }
            AbstractC3375el.b0(obj);
            InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) ((InterfaceC4514rk) this.L$0).getCoroutineContext().get(G7.e);
            if (interfaceC5000xE == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC5000xE);
            try {
                InterfaceC3567gx interfaceC3567gx = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = WD.X(interfaceC3567gx, pausingDispatcher, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }
    }

    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        return whenCreated(lifecycleOwner.getLifecycle(), interfaceC3567gx, interfaceC2857Wj);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        return whenResumed(lifecycleOwner.getLifecycle(), interfaceC3567gx, interfaceC2857Wj);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        return whenStarted(lifecycleOwner.getLifecycle(), interfaceC3567gx, interfaceC2857Wj);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        return WD.X(new AnonymousClass2(lifecycle, state, interfaceC3567gx, null), ((C3217cz) TL.f3768a).d, interfaceC2857Wj);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, interfaceC3567gx, interfaceC2857Wj);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, interfaceC3567gx, interfaceC2857Wj);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, interfaceC3567gx, interfaceC2857Wj);
    }
}
