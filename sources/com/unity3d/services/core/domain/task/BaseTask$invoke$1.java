package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
public final class BaseTask$invoke$1<P extends BaseParams, R> extends AbstractC2883Xj {
    int label;
    /* synthetic */ Object result;

    public BaseTask$invoke$1(InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM82invokegIAlus = BaseTask.DefaultImpls.m82invokegIAlus(null, null, this);
        return objM82invokegIAlus == EnumC4602sk.f4993a ? objM82invokegIAlus : new IZ(objM82invokegIAlus);
    }
}
