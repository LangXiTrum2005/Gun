package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetInitializationState implements GetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sDKPropertiesManager) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(sDKPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sDKPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.GetInitializationState
    public InitializationState invoke(boolean z) {
        return z ? InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState()) : this.sessionRepository.getInitializationState();
    }
}
