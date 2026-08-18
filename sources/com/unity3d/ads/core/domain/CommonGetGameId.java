package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetGameId implements GetGameId {
    private final SessionRepository sessionRepository;

    public CommonGetGameId(SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetGameId
    public String invoke() {
        return this.sessionRepository.getGameId();
    }
}
