package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {}, m = "invokeSuspend")
public final class AndroidSessionRepository$persistedNativeConfiguration$1 extends Ea0 implements InterfaceC3655hx {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public AndroidSessionRepository$persistedNativeConfiguration$1(InterfaceC2857Wj interfaceC2857Wj) {
        super(3, interfaceC2857Wj);
    }

    public final Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(interfaceC2857Wj);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(obj);
        return new C4839vT((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, Boolean.valueOf(this.Z$0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((NativeConfigurationOuterClass.NativeConfiguration) obj, ((Boolean) obj2).booleanValue(), (InterfaceC2857Wj) obj3);
    }
}
