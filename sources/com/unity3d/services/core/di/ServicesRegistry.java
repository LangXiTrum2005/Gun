package com.unity3d.services.core.di;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3156cG;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, InterfaceC3069bH> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, InterfaceC2714Qw interfaceC2714Qw, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC2714Qw, "instance");
        AbstractC2995aW.w0();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.w0();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.w0();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String str, InterfaceC2714Qw interfaceC2714Qw, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC2714Qw, "instance");
        AbstractC2995aW.w0();
        throw null;
    }

    public final <T> ServiceKey factory(String str, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC2714Qw, "instance");
        AbstractC2995aW.w0();
        throw null;
    }

    public final <T> T get(String str) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.w0();
        throw null;
    }

    public final <T> T getOrNull(String str) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.w0();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(String str, InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC3156cG, "instance");
        return (T) resolveService(new ServiceKey(str, interfaceC3156cG));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public Map<ServiceKey, InterfaceC3069bH> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(ServiceKey serviceKey) {
        AbstractC2995aW.q(serviceKey, "key");
        InterfaceC3069bH interfaceC3069bH = getServices().get(serviceKey);
        if (interfaceC3069bH != null) {
            return (T) interfaceC3069bH.getValue();
        }
        throw new IllegalStateException("No service instance found for " + serviceKey);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey serviceKey) {
        AbstractC2995aW.q(serviceKey, "key");
        InterfaceC3069bH interfaceC3069bH = getServices().get(serviceKey);
        if (interfaceC3069bH == null) {
            return null;
        }
        return (T) interfaceC3069bH.getValue();
    }

    public final <T> ServiceKey single(String str, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC2714Qw, "instance");
        AbstractC2995aW.w0();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(ServiceKey serviceKey, InterfaceC3069bH interfaceC3069bH) {
        AbstractC2995aW.q(serviceKey, "key");
        AbstractC2995aW.q(interfaceC3069bH, "instance");
        if (!getServices().containsKey(serviceKey)) {
            this._services.put(serviceKey, interfaceC3069bH);
        } else {
            throw new IllegalStateException(("Cannot have multiple identical services: " + serviceKey).toString());
        }
    }
}
