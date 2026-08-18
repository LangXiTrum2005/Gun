package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final InterfaceC4309pQ isAlternativeFlowEnabled;
    private final InterfaceC4309pQ isAlternativeFlowRead;
    private final SessionRepository sessionRepository;

    public AlternativeFlowReader(ConfigurationReader configurationReader, SessionRepository sessionRepository) {
        AbstractC2995aW.q(configurationReader, "configurationReader");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        Boolean bool = Boolean.FALSE;
        this.isAlternativeFlowRead = AbstractC4995x90.a(bool);
        this.isAlternativeFlowEnabled = AbstractC4995x90.a(bool);
    }

    public final boolean invoke() throws IllegalAccessException, InvocationTargetException {
        if (!((Boolean) ((C4907w90) this.isAlternativeFlowRead).getValue()).booleanValue()) {
            ((C4907w90) this.isAlternativeFlowEnabled).i(Boolean.valueOf(this.configurationReader.getCurrentConfiguration().getExperiments().isBoldSdkNextSessionEnabled() || this.sessionRepository.getNativeConfiguration().getFeatureFlags().getBoldSdkNextSessionEnabled()));
            ((C4907w90) this.isAlternativeFlowRead).i(Boolean.TRUE);
        }
        return ((Boolean) ((C4907w90) this.isAlternativeFlowEnabled).getValue()).booleanValue();
    }
}
