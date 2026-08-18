package com.unity3d.ads.adplayer.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class OnUserConsentChangeEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnUserConsentChangeEvent(String str) {
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.category = "ADVIEWER";
        this.name = "ON_USER_CONSENT_CHANGE";
        this.parameters = new Object[]{str};
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
