package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4748uQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3086bY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3217cz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4660tQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4397qQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public final class RepeatOnLifecycleKt {

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {Input.Keys.SEARCH}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC3567gx $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        @InterfaceC2314Bl(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ InterfaceC4514rk $$this$coroutineScope;
            final /* synthetic */ InterfaceC3567gx $block;
            final /* synthetic */ Lifecycle.State $state;
            final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC4514rk interfaceC4514rk, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = interfaceC4514rk;
                this.$block = interfaceC3567gx;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x009f  */
            /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) throws Throwable {
                C3086bY c3086bY;
                C3086bY c3086bY2;
                InterfaceC5000xE interfaceC5000xE;
                LifecycleEventObserver lifecycleEventObserver;
                InterfaceC5000xE interfaceC5000xE2;
                LifecycleEventObserver lifecycleEventObserver2;
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                C5033xf0 c5033xf0 = C5033xf0.f5238a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3086bY2 = (C3086bY) this.L$1;
                    c3086bY = (C3086bY) this.L$0;
                    try {
                        AbstractC3375el.b0(obj);
                        interfaceC5000xE2 = (InterfaceC5000xE) c3086bY.f4172a;
                        if (interfaceC5000xE2 != null) {
                            interfaceC5000xE2.a(null);
                        }
                        lifecycleEventObserver2 = (LifecycleEventObserver) c3086bY2.f4172a;
                        if (lifecycleEventObserver2 != null) {
                            this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                        }
                        return c5033xf0;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC5000xE = (InterfaceC5000xE) c3086bY.f4172a;
                        if (interfaceC5000xE != null) {
                            interfaceC5000xE.a(null);
                        }
                        lifecycleEventObserver = (LifecycleEventObserver) c3086bY2.f4172a;
                        if (lifecycleEventObserver != null) {
                            this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                        }
                        throw th;
                    }
                }
                AbstractC3375el.b0(obj);
                if (this.$this_repeatOnLifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    return c5033xf0;
                }
                final C3086bY c3086bY3 = new C3086bY();
                C3086bY c3086bY4 = new C3086bY();
                try {
                    Lifecycle.State state = this.$state;
                    Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                    final InterfaceC4514rk interfaceC4514rk = this.$$this$coroutineScope;
                    final InterfaceC3567gx interfaceC3567gx = this.$block;
                    this.L$0 = c3086bY3;
                    this.L$1 = c3086bY4;
                    this.L$2 = state;
                    this.L$3 = lifecycle;
                    this.L$4 = interfaceC4514rk;
                    this.L$5 = interfaceC3567gx;
                    this.label = 1;
                    final C2798Uc c2798Uc = new C2798Uc(1, WD.w(this));
                    c2798Uc.t();
                    Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                    final Lifecycle.Event eventUpTo = companion.upTo(state);
                    final Lifecycle.Event eventDownFrom = companion.downFrom(state);
                    final C4660tQ c4660tQA = AbstractC4748uQ.a();
                    LifecycleEventObserver lifecycleEventObserver3 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                        @InterfaceC2314Bl(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
                        public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
                            final /* synthetic */ InterfaceC3567gx $block;
                            final /* synthetic */ InterfaceC4397qQ $mutex;
                            Object L$0;
                            Object L$1;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(InterfaceC4397qQ interfaceC4397qQ, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
                                super(2, interfaceC2857Wj);
                                this.$mutex = interfaceC4397qQ;
                                this.$block = interfaceC3567gx;
                            }

                            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
                            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                                return new AnonymousClass1(this.$mutex, this.$block, interfaceC2857Wj);
                            }

                            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
                            public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                                return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
                            }

                            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                InterfaceC3567gx interfaceC3567gx;
                                C4660tQ c4660tQ;
                                InterfaceC4397qQ interfaceC4397qQ;
                                InterfaceC4397qQ interfaceC4397qQ2;
                                Throwable th;
                                InterfaceC4397qQ interfaceC4397qQ3;
                                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                                int i = this.label;
                                try {
                                    if (i == 0) {
                                        AbstractC3375el.b0(obj);
                                        InterfaceC4397qQ interfaceC4397qQ4 = this.$mutex;
                                        interfaceC3567gx = this.$block;
                                        this.L$0 = interfaceC4397qQ4;
                                        this.L$1 = interfaceC3567gx;
                                        this.label = 1;
                                        c4660tQ = (C4660tQ) interfaceC4397qQ4;
                                        if (c4660tQ.d(null, this) == enumC4602sk) {
                                            interfaceC4397qQ = c4660tQ;
                                            return enumC4602sk;
                                        }
                                    } else {
                                        if (i != 1) {
                                            if (i != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            interfaceC4397qQ2 = (InterfaceC4397qQ) this.L$0;
                                            try {
                                                AbstractC3375el.b0(obj);
                                                interfaceC4397qQ3 = interfaceC4397qQ2;
                                                ((C4660tQ) interfaceC4397qQ3).e(null);
                                                return C5033xf0.f5238a;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                ((C4660tQ) interfaceC4397qQ2).e(null);
                                                throw th;
                                            }
                                        }
                                        interfaceC3567gx = (InterfaceC3567gx) this.L$1;
                                        InterfaceC4397qQ interfaceC4397qQ5 = (InterfaceC4397qQ) this.L$0;
                                        AbstractC3375el.b0(obj);
                                        interfaceC4397qQ = interfaceC4397qQ5;
                                    }
                                    interfaceC4397qQ = c4660tQ;
                                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(interfaceC3567gx, null);
                                    this.L$0 = interfaceC4397qQ;
                                    this.L$1 = null;
                                    this.label = 2;
                                    if (WD.m(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == enumC4602sk) {
                                        return enumC4602sk;
                                    }
                                    interfaceC4397qQ3 = interfaceC4397qQ;
                                    ((C4660tQ) interfaceC4397qQ3).e(null);
                                    return C5033xf0.f5238a;
                                } catch (Throwable th3) {
                                    interfaceC4397qQ2 = interfaceC4397qQ;
                                    th = th3;
                                    ((C4660tQ) interfaceC4397qQ2).e(null);
                                    throw th;
                                }
                            }
                        }

                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            AbstractC2995aW.q(lifecycleOwner, "<anonymous parameter 0>");
                            AbstractC2995aW.q(event, NotificationCompat.CATEGORY_EVENT);
                            if (event == eventUpTo) {
                                c3086bY3.f4172a = WD.D(interfaceC4514rk, null, 0, new AnonymousClass1(c4660tQA, interfaceC3567gx, null), 3);
                                return;
                            }
                            if (event == eventDownFrom) {
                                InterfaceC5000xE interfaceC5000xE3 = (InterfaceC5000xE) c3086bY3.f4172a;
                                if (interfaceC5000xE3 != null) {
                                    interfaceC5000xE3.a(null);
                                }
                                c3086bY3.f4172a = null;
                            }
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                c2798Uc.resumeWith(C5033xf0.f5238a);
                            }
                        }
                    };
                    c3086bY4.f4172a = lifecycleEventObserver3;
                    lifecycle.addObserver(lifecycleEventObserver3);
                    if (c2798Uc.s() == enumC4602sk) {
                        return enumC4602sk;
                    }
                    c3086bY = c3086bY3;
                    c3086bY2 = c3086bY4;
                    interfaceC5000xE2 = (InterfaceC5000xE) c3086bY.f4172a;
                    if (interfaceC5000xE2 != null) {
                        interfaceC5000xE2.a(null);
                    }
                    lifecycleEventObserver2 = (LifecycleEventObserver) c3086bY2.f4172a;
                    if (lifecycleEventObserver2 != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
                    }
                    return c5033xf0;
                } catch (Throwable th2) {
                    th = th2;
                    c3086bY = c3086bY3;
                    c3086bY2 = c3086bY4;
                    interfaceC5000xE = (InterfaceC5000xE) c3086bY.f4172a;
                    if (interfaceC5000xE != null) {
                        interfaceC5000xE.a(null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) c3086bY2.f4172a;
                    if (lifecycleEventObserver != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Lifecycle lifecycle, Lifecycle.State state, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = interfaceC3567gx;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC2857Wj);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass3) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                C2627Nn c2627Nn = AbstractC4437qp.f4904a;
                C3217cz c3217cz = ((C3217cz) TL.f3768a).d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, interfaceC4514rk, this.$block, null);
                this.label = 1;
                if (WD.X(anonymousClass1, c3217cz, this) == enumC4602sk) {
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

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        Object objM;
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        Lifecycle.State currentState = lifecycle.getCurrentState();
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        return (currentState != state2 && (objM = WD.m(new AnonymousClass3(lifecycle, state, interfaceC3567gx, null), interfaceC2857Wj)) == EnumC4602sk.f4993a) ? objM : c5033xf0;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, interfaceC3567gx, interfaceC2857Wj);
        return objRepeatOnLifecycle == EnumC4602sk.f4993a ? objRepeatOnLifecycle : C5033xf0.f5238a;
    }
}
