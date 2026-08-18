package com.unity3d.services.core.domain;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;

/* JADX INFO: loaded from: classes4.dex */
public final class SDKDispatchers implements ISDKDispatchers {
    private final AbstractC3899kk io = AbstractC4437qp.b;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final AbstractC3899kk f0default = AbstractC4437qp.f4904a;
    private final AbstractC3899kk main = TL.f3768a;

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public AbstractC3899kk getDefault() {
        return this.f0default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public AbstractC3899kk getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public AbstractC3899kk getMain() {
        return this.main;
    }
}
