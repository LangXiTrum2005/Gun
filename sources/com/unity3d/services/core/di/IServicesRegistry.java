package com.unity3d.services.core.di;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3156cG;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface IServicesRegistry {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, InterfaceC3156cG interfaceC3156cG, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, interfaceC3156cG);
        }
    }

    <T> T getService(String str, InterfaceC3156cG interfaceC3156cG);

    Map<ServiceKey, InterfaceC3069bH> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, InterfaceC3069bH interfaceC3069bH);
}
