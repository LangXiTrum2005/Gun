package com.unity3d.services.core.request.metrics;

import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface SDKMetricsSender {

    public static final class DefaultImpls {
        public static void sendEvent(SDKMetricsSender sDKMetricsSender, String str) {
            AbstractC2995aW.q(str, NotificationCompat.CATEGORY_EVENT);
            sendEvent$default(sDKMetricsSender, str, null, null, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendEvent$default(SDKMetricsSender sDKMetricsSender, String str, String str2, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                map = C2838Vq.f3896a;
            }
            sDKMetricsSender.sendEvent(str, str2, map);
        }
    }

    String getMetricEndPoint();

    void sendEvent(String str);

    void sendEvent(String str, String str2, Map<String, String> map);

    void sendMetric(Metric metric);

    void sendMetricWithInitState(Metric metric);

    void sendMetrics(List<Metric> list);
}
