package com.unity3d.ads.core.utils;

import com.umeng.ccg.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2880Xg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final AbstractC3899kk dispatcher;
    private final InterfaceC2880Xg job;
    private final InterfaceC4514rk scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC2714Qw $action;
        final /* synthetic */ long $delayStartMillis;
        final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, InterfaceC2714Qw interfaceC2714Qw, long j2, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$delayStartMillis = j;
            this.$action = interfaceC2714Qw;
            this.$repeatMillis = j2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayStartMillis, this.$action, this.$repeatMillis, interfaceC2857Wj);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            InterfaceC4514rk interfaceC4514rk;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                long j = this.$delayStartMillis;
                this.L$0 = interfaceC4514rk;
                this.label = 1;
                if (AbstractC2995aW.v(j, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                AbstractC3375el.b0(obj);
            }
            while (WD.x(interfaceC4514rk)) {
                this.$action.invoke();
                long j2 = this.$repeatMillis;
                this.L$0 = interfaceC4514rk;
                this.label = 2;
                if (AbstractC2995aW.v(j2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            return C5033xf0.f5238a;
        }
    }

    public CommonCoroutineTimer(AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        this.dispatcher = abstractC3899kk;
        Ba0 ba0C = AbstractC3375el.c();
        this.job = ba0C;
        this.scope = WD.a(abstractC3899kk.plus(ba0C));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public InterfaceC5000xE start(long j, long j2, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(interfaceC2714Qw, a.w);
        return WD.D(this.scope, this.dispatcher, 0, new AnonymousClass1(j, interfaceC2714Qw, j2, null), 2);
    }
}
