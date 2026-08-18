package com.unity3d.services.core.domain.task;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeStateError", f = "InitializeStateError.kt", l = {27}, m = "doWork-gIAlu-s")
public final class InitializeStateError$doWork$1 extends AbstractC2883Xj {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$1(InitializeStateError initializeStateError, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.this$0 = initializeStateError;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM92doWorkgIAlus = this.this$0.mo80doWorkgIAlus((InitializeStateError.Params) null, (InterfaceC2857Wj) this);
        return objM92doWorkgIAlus == EnumC4602sk.f4993a ? objM92doWorkgIAlus : new IZ(objM92doWorkgIAlus);
    }
}
