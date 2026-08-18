package com.unity3d.services.core.di;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        interfaceC2766Sw.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
