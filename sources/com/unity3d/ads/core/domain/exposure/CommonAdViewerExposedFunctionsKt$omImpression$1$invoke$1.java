package com.unity3d.ads.core.domain.exposure;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1", f = "CommonAdViewerExposedFunctions.kt", l = {349}, m = "invoke")
public final class CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 extends AbstractC2883Xj {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt.C22421 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(CommonAdViewerExposedFunctionsKt.C22421 c22421, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.this$0 = c22421;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (InterfaceC2857Wj) this);
    }
}
