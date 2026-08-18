package com.unity3d.services.core.di;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;

/* JADX INFO: loaded from: classes4.dex */
public final class ServiceFactoryKt {
    public static final <T> InterfaceC3069bH factoryOf(InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(interfaceC2714Qw, "initializer");
        return new Factory(interfaceC2714Qw);
    }
}
