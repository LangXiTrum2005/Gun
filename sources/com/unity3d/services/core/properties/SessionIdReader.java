package com.unity3d.services.core.properties;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionIdReader {
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    private static final String sessionId = AbstractC5044xl.f("randomUUID().toString()");

    private SessionIdReader() {
    }

    public final String getSessionId() {
        return sessionId;
    }
}
