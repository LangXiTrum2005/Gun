package com.unity3d.ads.adplayer;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2854Wg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3013ah;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2828Vg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3732io;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class Invocation {
    private final InterfaceC2828Vg _isHandled;
    private final InterfaceC2828Vg completableDeferred;
    private final String location;
    private final Object[] parameters;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC2766Sw {
        int label;

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(1, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public final Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$3, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", l = {23}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC2766Sw $handler;
        int label;
        final /* synthetic */ Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterfaceC2766Sw interfaceC2766Sw, Invocation invocation, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$handler = interfaceC2766Sw;
            this.this$0 = invocation;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass3(this.$handler, this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass3) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    InterfaceC2766Sw interfaceC2766Sw = this.$handler;
                    this.label = 1;
                    obj = interfaceC2766Sw.invoke(this);
                    if (obj == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                ((C2854Wg) this.this$0.completableDeferred).S(obj);
            } catch (Throwable th) {
                C2854Wg c2854Wg = (C2854Wg) this.this$0.completableDeferred;
                c2854Wg.getClass();
                c2854Wg.S(new C3013ah(false, th));
            }
            return C5033xf0.f5238a;
        }
    }

    public Invocation(String str, Object[] objArr) {
        AbstractC2995aW.q(str, "location");
        AbstractC2995aW.q(objArr, "parameters");
        this.location = str;
        this.parameters = objArr;
        this._isHandled = AbstractC3375el.b();
        this.completableDeferred = AbstractC3375el.b();
    }

    public static /* synthetic */ Object handle$default(Invocation invocation, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC2766Sw = new AnonymousClass2(null);
        }
        return invocation.handle(interfaceC2766Sw, interfaceC2857Wj);
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult(InterfaceC2857Wj interfaceC2857Wj) {
        return ((C2854Wg) this.completableDeferred).z(interfaceC2857Wj);
    }

    public final Object handle(InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        InterfaceC2828Vg interfaceC2828Vg = this._isHandled;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        ((C2854Wg) interfaceC2828Vg).S(c5033xf0);
        WD.D(WD.a(interfaceC2857Wj.getContext()), null, 0, new AnonymousClass3(interfaceC2766Sw, this, null), 3);
        return c5033xf0;
    }

    public final InterfaceC3732io isHandled() {
        return this._isHandled;
    }
}
