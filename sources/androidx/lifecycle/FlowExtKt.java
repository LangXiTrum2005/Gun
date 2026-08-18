package androidx.lifecycle;

import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2642Oc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5024xb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VV;

/* JADX INFO: loaded from: classes.dex */
public final class FlowExtKt {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {Input.Keys.MUTE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ InterfaceC4443qv $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC2314Bl(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        public static final class C00031 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ VV $$this$callbackFlow;
            final /* synthetic */ InterfaceC4443qv $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00031(InterfaceC4443qv interfaceC4443qv, VV vv, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.$this_flowWithLifecycle = interfaceC4443qv;
                this.$$this$callbackFlow = vv;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new C00031(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                return ((C00031) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    InterfaceC4443qv interfaceC4443qv = this.$this_flowWithLifecycle;
                    final VV vv = this.$$this$callbackFlow;
                    InterfaceC4530rv interfaceC4530rv = new InterfaceC4530rv() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                        public final Object emit(T t, InterfaceC2857Wj interfaceC2857Wj) {
                            Object objG = ((UV) vv).d.g(t, interfaceC2857Wj);
                            return objG == EnumC4602sk.f4993a ? objG : C5033xf0.f5238a;
                        }
                    };
                    this.label = 1;
                    if (interfaceC4443qv.collect(interfaceC4530rv, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                return C5033xf0.f5238a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC4443qv interfaceC4443qv, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = interfaceC4443qv;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC2857Wj);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(VV vv, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(vv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            VV vv;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                VV vv2 = (VV) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C00031 c00031 = new C00031(this.$this_flowWithLifecycle, vv2, null);
                this.L$0 = vv2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c00031, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                vv = vv2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vv = (VV) this.L$0;
                AbstractC3375el.b0(obj);
            }
            ((UV) vv).q(null);
            return C5033xf0.f5238a;
        }
    }

    public static final <T> InterfaceC4443qv flowWithLifecycle(InterfaceC4443qv interfaceC4443qv, Lifecycle lifecycle, Lifecycle.State state) {
        AbstractC2995aW.q(interfaceC4443qv, "<this>");
        AbstractC2995aW.q(lifecycle, "lifecycle");
        AbstractC2995aW.q(state, "minActiveState");
        return new C2642Oc(new AnonymousClass1(lifecycle, state, interfaceC4443qv, null), C2734Rq.f3684a, -2, EnumC5024xb.f5229a);
    }

    public static /* synthetic */ InterfaceC4443qv flowWithLifecycle$default(InterfaceC4443qv interfaceC4443qv, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC4443qv, lifecycle, state);
    }
}
