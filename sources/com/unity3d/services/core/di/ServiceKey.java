package com.unity3d.services.core.di;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3156cG;

/* JADX INFO: loaded from: classes4.dex */
public final class ServiceKey {
    private final InterfaceC3156cG instanceClass;
    private final String named;

    public ServiceKey(String str, InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC3156cG, "instanceClass");
        this.named = str;
        this.instanceClass = interfaceC3156cG;
    }

    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, InterfaceC3156cG interfaceC3156cG, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i & 2) != 0) {
            interfaceC3156cG = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, interfaceC3156cG);
    }

    public final String component1() {
        return this.named;
    }

    public final InterfaceC3156cG component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String str, InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC3156cG, "instanceClass");
        return new ServiceKey(str, interfaceC3156cG);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        return AbstractC2995aW.i(this.named, serviceKey.named) && AbstractC2995aW.i(this.instanceClass, serviceKey.instanceClass);
    }

    public final InterfaceC3156cG getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ ServiceKey(String str, InterfaceC3156cG interfaceC3156cG, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? "" : str, interfaceC3156cG);
    }
}
