package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(StoreEvent storeEvent, int i, Exception exc) throws Exception {
        AbstractC2995aW.q(storeEvent, "storeEvent");
        AbstractC2995aW.q(exc, "exception");
        throw exc;
    }
}
