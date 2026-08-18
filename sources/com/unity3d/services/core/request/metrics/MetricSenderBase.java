package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MetricSenderBase implements SDKMetricsSender {
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(InitializationStatusReader initializationStatusReader) {
        AbstractC2995aW.q(initializationStatusReader, "_initStatusReader");
        this._initStatusReader = initializationStatusReader;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String str) {
        SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetricWithInitState(Metric metric) {
        AbstractC2995aW.q(metric, "metric");
        Map mapO = AbstractC3375el.O(new C4839vT("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState())));
        Map<String, String> tags = metric.getTags();
        AbstractC2995aW.q(tags, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(tags);
        linkedHashMap.putAll(mapO);
        sendMetric(Metric.copy$default(metric, null, null, linkedHashMap, 3, null));
    }
}
