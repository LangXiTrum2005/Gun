package com.unity3d.services.core.request.metrics;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.properties.InitializationStatusReader;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3987lk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    private final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    private final HttpClient httpClient;
    private final String metricEndPoint;
    private final String metricSampleRate;
    private final InterfaceC4514rk scope;
    private final String sessionToken;

    /* JADX INFO: renamed from: com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {65}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ List<Metric> $metrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Metric> list, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$metrics = list;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return MetricSender.this.new AnonymousClass1(this.$metrics, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            Object objExecute;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                String string = new JSONObject(new MetricsContainer(MetricSender.this.metricSampleRate, MetricSender.this.commonTags, this.$metrics, MetricSender.this.sessionToken).toMap()).toString();
                AbstractC2995aW.p(string, "JSONObject(container.toMap()).toString()");
                String metricEndPoint = MetricSender.this.getMetricEndPoint();
                if (metricEndPoint == null) {
                    metricEndPoint = "";
                }
                HttpRequest httpRequest = new HttpRequest(metricEndPoint, null, RequestType.POST, string, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131058, null);
                HttpClient httpClient = MetricSender.this.httpClient;
                this.label = 1;
                objExecute = httpClient.execute(httpRequest, this);
                if (objExecute == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                objExecute = obj;
            }
            HttpResponse httpResponse = (HttpResponse) objExecute;
            if (httpResponse.getStatusCode() / 100 == 2) {
                DeviceLog.debug("Metric " + this.$metrics + " sent to " + MetricSender.this.getMetricEndPoint());
            } else {
                DeviceLog.debug("Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode());
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        AbstractC2995aW.q(configuration, "configuration");
        AbstractC2995aW.q(initializationStatusReader, "initializationStatusReader");
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        double metricSampleRate = configuration.getMetricSampleRate();
        if (Double.isNaN(metricSampleRate)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        this.metricSampleRate = String.valueOf(metricSampleRate > 2.147483647E9d ? Integer.MAX_VALUE : metricSampleRate < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(metricSampleRate));
        this.sessionToken = configuration.getSessionToken();
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClient = (HttpClient) getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(HttpClient.class));
        this.scope = WD.a(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String str, String str2, Map<String, String> map) {
        AbstractC2995aW.q(str, NotificationCompat.CATEGORY_EVENT);
        AbstractC2995aW.q(map, "tags");
        if (str.length() == 0) {
            DeviceLog.debug("Metric event not sent due to being null or empty: ".concat(str));
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
    public void sendMetrics(List<Metric> list) {
        AbstractC2995aW.q(list, "metrics");
        if (list.isEmpty()) {
            DeviceLog.debug("Metrics event not send due to being empty");
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (metricEndPoint != null && !AbstractC3089ba0.v0(metricEndPoint)) {
            WD.D(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(C3987lk.f4661a, list), 0, new AnonymousClass1(list, null), 2);
            return;
        }
        DeviceLog.debug("Metrics: " + list + " was not sent to null or empty endpoint: " + getMetricEndPoint());
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
