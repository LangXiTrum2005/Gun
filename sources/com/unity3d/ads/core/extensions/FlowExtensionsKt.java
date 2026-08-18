package com.unity3d.ads.core.extensions;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3007ae;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5024xb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y2;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowExtensionsKt {

    /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ boolean $active;
        final /* synthetic */ InterfaceC3567gx $block;
        final /* synthetic */ InterfaceC4443qv $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
        public static final class C03011 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ VV $$this$channelFlow;
            final /* synthetic */ InterfaceC4443qv $this_timeoutAfter;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03011(InterfaceC4443qv interfaceC4443qv, VV vv, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.$this_timeoutAfter = interfaceC4443qv;
                this.$$this$channelFlow = vv;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new C03011(this.$this_timeoutAfter, this.$$this$channelFlow, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                return ((C03011) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    InterfaceC4443qv interfaceC4443qv = this.$this_timeoutAfter;
                    final VV vv = this.$$this$channelFlow;
                    InterfaceC4530rv interfaceC4530rv = new InterfaceC4530rv() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
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
                ((UV) this.$$this$channelFlow).q(null);
                return C5033xf0.f5238a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        public /* synthetic */ class AnonymousClass2 extends Y2 implements InterfaceC2714Qw {
            public AnonymousClass2(Object obj) {
                super(0, obj, VV.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public /* bridge */ /* synthetic */ Object invoke() {
                m77invoke();
                return C5033xf0.f5238a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m77invoke() {
                ((UV) ((VV) this.receiver)).q(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, boolean z, InterfaceC3567gx interfaceC3567gx, InterfaceC4443qv interfaceC4443qv, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$timeoutMillis = j;
            this.$active = z;
            this.$block = interfaceC3567gx;
            this.$this_timeoutAfter = interfaceC4443qv;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, interfaceC2857Wj);
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
            if (i != 0) {
                if (i == 1) {
                    vv = (VV) this.L$0;
                    AbstractC3375el.b0(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                return C5033xf0.f5238a;
            }
            AbstractC3375el.b0(obj);
            vv = (VV) this.L$0;
            WD.D(vv, null, 0, new C03011(this.$this_timeoutAfter, vv, null), 3);
            long j = this.$timeoutMillis;
            this.L$0 = vv;
            this.label = 1;
            if (AbstractC2995aW.v(j, this) == enumC4602sk) {
                return enumC4602sk;
            }
            if (this.$active) {
                InterfaceC3567gx interfaceC3567gx = this.$block;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(vv);
                this.L$0 = null;
                this.label = 2;
                if (interfaceC3567gx.invoke(anonymousClass2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            return C5033xf0.f5238a;
        }
    }

    public static final <T> InterfaceC4443qv timeoutAfter(InterfaceC4443qv interfaceC4443qv, long j, boolean z, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC4443qv, "<this>");
        AbstractC2995aW.q(interfaceC3567gx, "block");
        return new C3007ae(new AnonymousClass1(j, z, interfaceC3567gx, interfaceC4443qv, null), C2734Rq.f3684a, -2, EnumC5024xb.f5229a);
    }

    public static /* synthetic */ InterfaceC4443qv timeoutAfter$default(InterfaceC4443qv interfaceC4443qv, long j, boolean z, InterfaceC3567gx interfaceC3567gx, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(interfaceC4443qv, j, z, interfaceC3567gx);
    }
}
