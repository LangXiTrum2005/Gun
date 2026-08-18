package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender sDKMetricsSender, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        AbstractC2995aW.q(sDKMetricsSender, "_original");
        AbstractC2995aW.q(initializationStatusReader, "initializationStatusReader");
        this._original = sDKMetricsSender;
        this._queue = new LinkedBlockingQueue<>();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String str, String str2, Map<String, String> map) {
        AbstractC2995aW.q(str, NotificationCompat.CATEGORY_EVENT);
        AbstractC2995aW.q(map, "tags");
        if (str.length() == 0) {
            DeviceLog.debug("Metric event not sent due to being empty: ".concat(str));
        } else {
            sendMetrics(AbstractC2340Cl.J(new Metric(str, str2, map)));
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        AbstractC2995aW.q(metric, "metric");
        sendMetrics(AbstractC2340Cl.J(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(List<Metric> list) {
        AbstractC2995aW.q(list, "metrics");
        this._queue.addAll(list);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(C2812Uq.f3846a);
    }

    public final void updateOriginal(SDKMetricsSender sDKMetricsSender) {
        AbstractC2995aW.q(sDKMetricsSender, "metrics");
        this._original = sDKMetricsSender;
    }
}
