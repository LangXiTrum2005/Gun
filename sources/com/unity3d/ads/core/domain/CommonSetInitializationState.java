package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonSetInitializationState implements SetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sDKPropertiesManager) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(sDKPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sDKPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(InitializationState initializationState, boolean z) {
        AbstractC2995aW.q(initializationState, "state");
        if (z) {
            this.sdkPropertiesManager.setInitializeState(InitializationStateKt.toLegacy(initializationState));
        } else {
            this.sessionRepository.setInitializationState(initializationState);
        }
    }
}
