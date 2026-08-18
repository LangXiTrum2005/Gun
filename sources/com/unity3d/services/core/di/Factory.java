package com.unity3d.services.core.di;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;

/* JADX INFO: loaded from: classes4.dex */
final class Factory<T> implements InterfaceC3069bH {
    private final InterfaceC2714Qw initializer;

    public Factory(InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(interfaceC2714Qw, "initializer");
        this.initializer = interfaceC2714Qw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    public boolean isInitialized() {
        return false;
    }
}
