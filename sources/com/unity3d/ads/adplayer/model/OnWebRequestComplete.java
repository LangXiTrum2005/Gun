package com.unity3d.ads.adplayer.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OnWebRequestComplete implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnWebRequestComplete(List<? extends Object> list) {
        AbstractC2995aW.q(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.category = "REQUEST";
        this.name = "COMPLETE";
        this.parameters = list.toArray(new Object[0]);
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
