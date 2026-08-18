package com.unity3d.services.core.domain.task;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeStateConfig", f = "InitializeStateConfig.kt", l = {24}, m = "doWork-gIAlu-s")
public final class InitializeStateConfig$doWork$1 extends AbstractC2883Xj {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$1(InitializeStateConfig initializeStateConfig, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.this$0 = initializeStateConfig;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM88doWorkgIAlus = this.this$0.mo80doWorkgIAlus((InitializeStateConfig.Params) null, (InterfaceC2857Wj) this);
        return objM88doWorkgIAlus == EnumC4602sk.f4993a ? objM88doWorkgIAlus : new IZ(objM88doWorkgIAlus);
    }
}
