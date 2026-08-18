package com.unity3d.ads.adplayer;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes3.dex */
public final class AdPlayerScope implements InterfaceC4514rk {
    private final /* synthetic */ InterfaceC4514rk $$delegate_0;
    private final AbstractC3899kk defaultDispatcher;

    public AdPlayerScope(AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(abstractC3899kk, "defaultDispatcher");
        this.defaultDispatcher = abstractC3899kk;
        this.$$delegate_0 = WD.a(abstractC3899kk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk
    public InterfaceC3549gk getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
