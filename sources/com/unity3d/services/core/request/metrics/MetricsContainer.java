package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MetricsContainer {
    public static final Companion Companion = new Companion(null);
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final String apiLevel;
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final String gameId;
    private final String metricSampleRate;
    private final List<Metric> metrics;
    private final String sTkn;
    private final String shSid;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    public MetricsContainer(String str, MetricCommonTags metricCommonTags, List<Metric> list, String str2) {
        AbstractC2995aW.q(str, "metricSampleRate");
        AbstractC2995aW.q(metricCommonTags, "commonTags");
        AbstractC2995aW.q(list, "metrics");
        this.metricSampleRate = str;
        this.commonTags = metricCommonTags;
        this.metrics = list;
        this.sTkn = str2;
        this.shSid = Session.Default.getId();
        this.apiLevel = String.valueOf(Device.getApiLevel());
        this.deviceModel = Device.getModel();
        this.deviceName = Device.getDevice();
        this.deviceManufacturer = Device.getManufacturer();
        this.gameId = ClientProperties.getGameId();
    }

    public final Map<String, Object> toMap() {
        List<Metric> list = this.metrics;
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Metric) it.next()).toMap());
        }
        C2985aM c2985aMW = AbstractC3375el.w();
        c2985aMW.put(METRIC_CONTAINER_SAMPLE_RATE, this.metricSampleRate);
        c2985aMW.put(METRICS_CONTAINER, arrayList);
        c2985aMW.put("t", this.commonTags.toMap());
        c2985aMW.put(METRIC_CONTAINER_SHARED_SESSION_ID, this.shSid);
        c2985aMW.put(METRIC_CONTAINER_API_LEVEL, this.apiLevel);
        String str = this.sTkn;
        if (str != null) {
            c2985aMW.put(METRIC_CONTAINER_SESSION_TOKEN, str);
        }
        String str2 = this.deviceModel;
        if (str2 != null) {
            c2985aMW.put(METRIC_CONTAINER_DEVICE_MODEL, str2);
        }
        String str3 = this.deviceName;
        if (str3 != null) {
            c2985aMW.put(METRIC_CONTAINER_DEVICE_NAME, str3);
        }
        String str4 = this.deviceManufacturer;
        if (str4 != null) {
            c2985aMW.put(METRIC_CONTAINER_DEVICE_MAKE, str4);
        }
        String str5 = this.gameId;
        if (str5 != null) {
            c2985aMW.put("gameId", str5);
        }
        return AbstractC3375el.g(c2985aMW);
    }
}
