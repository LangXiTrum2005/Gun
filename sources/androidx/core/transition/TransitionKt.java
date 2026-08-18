package androidx.core.transition;

import android.transition.Transition;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionKt {

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$5, reason: invalid class name */
    public static final class AnonymousClass5 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C5033xf0.f5238a;
        }
    }

    public static final Transition.TransitionListener addListener(Transition transition, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2766Sw interfaceC2766Sw2, InterfaceC2766Sw interfaceC2766Sw3, InterfaceC2766Sw interfaceC2766Sw4, InterfaceC2766Sw interfaceC2766Sw5) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(interfaceC2766Sw, interfaceC2766Sw4, interfaceC2766Sw5, interfaceC2766Sw3, interfaceC2766Sw2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2766Sw interfaceC2766Sw2, InterfaceC2766Sw interfaceC2766Sw3, InterfaceC2766Sw interfaceC2766Sw4, InterfaceC2766Sw interfaceC2766Sw5, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC2766Sw = AnonymousClass1.INSTANCE;
        }
        if ((i & 2) != 0) {
            interfaceC2766Sw2 = AnonymousClass2.INSTANCE;
        }
        InterfaceC2766Sw interfaceC2766Sw6 = interfaceC2766Sw2;
        if ((i & 4) != 0) {
            interfaceC2766Sw3 = AnonymousClass3.INSTANCE;
        }
        InterfaceC2766Sw interfaceC2766Sw7 = interfaceC2766Sw3;
        if ((i & 8) != 0) {
            interfaceC2766Sw4 = AnonymousClass4.INSTANCE;
        }
        if ((i & 16) != 0) {
            interfaceC2766Sw5 = AnonymousClass5.INSTANCE;
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(interfaceC2766Sw, interfaceC2766Sw4, interfaceC2766Sw5, interfaceC2766Sw7, interfaceC2766Sw6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final InterfaceC2766Sw interfaceC2766Sw) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                interfaceC2766Sw.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final InterfaceC2766Sw interfaceC2766Sw) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                interfaceC2766Sw.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final InterfaceC2766Sw interfaceC2766Sw) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                interfaceC2766Sw.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final InterfaceC2766Sw interfaceC2766Sw) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                interfaceC2766Sw.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final InterfaceC2766Sw interfaceC2766Sw) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                interfaceC2766Sw.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
