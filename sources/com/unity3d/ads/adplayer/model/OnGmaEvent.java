package com.unity3d.ads.adplayer.model;

import com.unity3d.scar.adapter.common.GMAEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class OnGmaEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnGmaEvent(GMAEvent gMAEvent) {
        AbstractC2995aW.q(gMAEvent, "gmaEvent");
        this.category = "GMA";
        this.name = gMAEvent.name();
        this.parameters = new Object[0];
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
