package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonSetGameId implements SetGameId {
    private final SessionRepository sessionRepository;

    public CommonSetGameId(SessionRepository sessionRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.SetGameId
    public void invoke(String str) {
        this.sessionRepository.setGameId(str);
    }
}
