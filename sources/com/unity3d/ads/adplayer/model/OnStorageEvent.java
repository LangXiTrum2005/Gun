package com.unity3d.ads.adplayer.model;

import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class OnStorageEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnStorageEvent(StorageEvent storageEvent, StorageManager.StorageType storageType, Object obj) {
        AbstractC2995aW.q(storageEvent, "eventType");
        AbstractC2995aW.q(storageType, "storageType");
        this.category = "STORAGE";
        this.name = storageEvent.name();
        this.parameters = new Object[]{storageType.name(), obj};
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
