package androidx.core.animation;

import android.animation.Animator;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatorKt {

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addPauseListener$1, reason: invalid class name and case insensitive filesystem */
    public static final class C03091 extends WG implements InterfaceC2766Sw {
        public static final C03091 INSTANCE = new C03091();

        public C03091() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addPauseListener$2, reason: invalid class name and case insensitive filesystem */
    public static final class C03102 extends WG implements InterfaceC2766Sw {
        public static final C03102 INSTANCE = new C03102();

        public C03102() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C5033xf0.f5238a;
        }
    }

    public static final Animator.AnimatorListener addListener(Animator animator, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2766Sw interfaceC2766Sw2, InterfaceC2766Sw interfaceC2766Sw3, InterfaceC2766Sw interfaceC2766Sw4) {
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(interfaceC2766Sw4, interfaceC2766Sw, interfaceC2766Sw3, interfaceC2766Sw2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2766Sw interfaceC2766Sw2, InterfaceC2766Sw interfaceC2766Sw3, InterfaceC2766Sw interfaceC2766Sw4, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC2766Sw = AnonymousClass1.INSTANCE;
        }
        if ((i & 2) != 0) {
            interfaceC2766Sw2 = AnonymousClass2.INSTANCE;
        }
        if ((i & 4) != 0) {
            interfaceC2766Sw3 = AnonymousClass3.INSTANCE;
        }
        if ((i & 8) != 0) {
            interfaceC2766Sw4 = AnonymousClass4.INSTANCE;
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(interfaceC2766Sw4, interfaceC2766Sw, interfaceC2766Sw3, interfaceC2766Sw2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final InterfaceC2766Sw interfaceC2766Sw, final InterfaceC2766Sw interfaceC2766Sw2) {
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                interfaceC2766Sw2.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                interfaceC2766Sw.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2766Sw interfaceC2766Sw2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC2766Sw = C03091.INSTANCE;
        }
        if ((i & 2) != 0) {
            interfaceC2766Sw2 = C03102.INSTANCE;
        }
        return addPauseListener(animator, interfaceC2766Sw, interfaceC2766Sw2);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final InterfaceC2766Sw interfaceC2766Sw) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                interfaceC2766Sw.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final InterfaceC2766Sw interfaceC2766Sw) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                interfaceC2766Sw.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, InterfaceC2766Sw interfaceC2766Sw) {
        return addPauseListener$default(animator, null, interfaceC2766Sw, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final InterfaceC2766Sw interfaceC2766Sw) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                interfaceC2766Sw.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, InterfaceC2766Sw interfaceC2766Sw) {
        return addPauseListener$default(animator, interfaceC2766Sw, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final InterfaceC2766Sw interfaceC2766Sw) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                interfaceC2766Sw.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
