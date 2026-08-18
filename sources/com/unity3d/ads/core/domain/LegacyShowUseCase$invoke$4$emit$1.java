package com.unity3d.ads.core.domain;

import com.badlogic.gdx.Input;
import com.unity3d.ads.core.data.model.ShowEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", l = {Input.Keys.NUMPAD_DOT, Input.Keys.NUMPAD_COMMA, Input.Keys.NUMPAD_ENTER, Input.Keys.NUMPAD_LEFT_PAREN, 167}, m = "emit")
public final class LegacyShowUseCase$invoke$4$emit$1 extends AbstractC2883Xj {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase.AnonymousClass4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase.AnonymousClass4<? super T> anonymousClass4, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.this$0 = anonymousClass4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (InterfaceC2857Wj) this);
    }
}
