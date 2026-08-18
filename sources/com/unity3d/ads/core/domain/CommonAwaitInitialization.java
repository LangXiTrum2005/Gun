package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonAwaitInitialization implements AwaitInitialization {
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", f = "CommonAwaitInitialization.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return CommonAwaitInitialization.this.new AnonymousClass2(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                final InterfaceC4443qv observeInitializationState = CommonAwaitInitialization.this.sessionRepository.getObserveInitializationState();
                InterfaceC4443qv interfaceC4443qv = new InterfaceC4443qv() { // from class: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                        final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2", f = "CommonAwaitInitialization.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC2883Xj {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
                                super(interfaceC2857Wj);
                            }

                            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC4530rv interfaceC4530rv) {
                            this.$this_unsafeFlow = interfaceC4530rv;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                        public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC2857Wj instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
                            }
                            Object obj2 = anonymousClass1.result;
                            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                AbstractC3375el.b0(obj2);
                                InterfaceC4530rv interfaceC4530rv = this.$this_unsafeFlow;
                                InitializationState initializationState = (InitializationState) obj;
                                if (initializationState == InitializationState.INITIALIZED || initializationState == InitializationState.FAILED) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC4530rv.emit(obj, anonymousClass1) == enumC4602sk) {
                                        return enumC4602sk;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC3375el.b0(obj2);
                            }
                            return C5033xf0.f5238a;
                        }
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
                    public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                        Object objCollect = observeInitializationState.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                        return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
                    }
                };
                this.label = 1;
                obj = AbstractC3375el.y(interfaceC4443qv, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return obj;
        }
    }

    public CommonAwaitInitialization(SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.AwaitInitialization
    public Object invoke(long j, InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC2995aW.F0(j, new AnonymousClass2(null), interfaceC2857Wj);
    }
}
