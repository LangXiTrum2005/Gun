package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.ClientInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidMediationRepository$mediationProvider$1 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final ClientInfoOuterClass.MediationProvider invoke() {
        ClientInfoOuterClass.MediationProvider mediationProvider;
        String name = this.this$0.getName();
        if (name != null) {
            if (AbstractC3089ba0.N0(name, "AppLovinSdk_", false)) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else if (AbstractC3089ba0.o0(name, "AdMob")) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
            } else if (AbstractC3089ba0.o0(name, "MAX")) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else {
                mediationProvider = AbstractC3089ba0.o0(name, "ironSource") ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            }
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
