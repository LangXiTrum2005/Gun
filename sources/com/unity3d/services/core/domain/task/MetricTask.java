package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3086bY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MetricTask<P extends BaseParams, R> implements BaseTask<P, R> {
    private long duration;
    private String taskStatus = "unknown";

    private final void captureMetric(Object obj) {
        this.taskStatus = (obj instanceof HZ) ^ true ? "success" : "failure";
        sendMetric();
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final Map<String, String> getMetricTagsForState() {
        Map<String, String> retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        AbstractC2995aW.p(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(SDKMetricsSender.class));
    }

    private final int getStatePrefixLength() {
        return 15;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-gIAlu-s$suspendImpl, reason: not valid java name */
    public static Object m98invokegIAlus$suspendImpl(MetricTask<? super P, R> metricTask, P p, InterfaceC2857Wj interfaceC2857Wj) {
        MetricTask$invoke$1 metricTask$invoke$1;
        long jNanoTime;
        MetricTask<? super P, R> metricTask2;
        C3086bY c3086bY;
        TimeUnit timeUnit;
        Object obj;
        C3086bY c3086bY2;
        if (interfaceC2857Wj instanceof MetricTask$invoke$1) {
            metricTask$invoke$1 = (MetricTask$invoke$1) interfaceC2857Wj;
            int i = metricTask$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metricTask$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                metricTask$invoke$1 = new MetricTask$invoke$1(metricTask, interfaceC2857Wj);
            }
        } else {
            metricTask$invoke$1 = new MetricTask$invoke$1(metricTask, interfaceC2857Wj);
        }
        Object obj2 = metricTask$invoke$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = metricTask$invoke$1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj2);
            C3086bY c3086bY3 = new C3086bY();
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            jNanoTime = System.nanoTime();
            metricTask$invoke$1.L$0 = metricTask;
            metricTask$invoke$1.L$1 = c3086bY3;
            metricTask$invoke$1.L$2 = c3086bY3;
            metricTask$invoke$1.L$3 = metricTask;
            metricTask$invoke$1.L$4 = timeUnit2;
            metricTask$invoke$1.J$0 = jNanoTime;
            metricTask$invoke$1.label = 1;
            Object objM82invokegIAlus = BaseTask.DefaultImpls.m82invokegIAlus(metricTask, p, metricTask$invoke$1);
            if (objM82invokegIAlus == enumC4602sk) {
                return enumC4602sk;
            }
            metricTask2 = metricTask;
            c3086bY = c3086bY3;
            timeUnit = timeUnit2;
            obj = objM82invokegIAlus;
            c3086bY2 = c3086bY;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = metricTask$invoke$1.J$0;
            timeUnit = (TimeUnit) metricTask$invoke$1.L$4;
            MetricTask<? super P, R> metricTask3 = (MetricTask) metricTask$invoke$1.L$3;
            c3086bY = (C3086bY) metricTask$invoke$1.L$2;
            C3086bY c3086bY4 = (C3086bY) metricTask$invoke$1.L$1;
            metricTask2 = (MetricTask) metricTask$invoke$1.L$0;
            AbstractC3375el.b0(obj2);
            obj = ((IZ) obj2).f3222a;
            metricTask = metricTask3;
            c3086bY2 = c3086bY4;
            jNanoTime = j;
        }
        c3086bY.f4172a = obj;
        ((MetricTask) metricTask).duration = timeUnit.toMillis(System.nanoTime() - jNanoTime);
        metricTask2.captureMetric(c3086bY2.f4172a);
        return c3086bY2.f4172a;
    }

    private final void sendMetric() {
        String metricName = getMetricName();
        if (metricName == null || metricName.length() == 0) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    public final long getDuration() {
        return this.duration;
    }

    public String getMetricName() {
        return null;
    }

    public final String getMetricNameForInitializeTask(String str) {
        AbstractC2995aW.q(str, "name");
        StringBuilder sb = new StringBuilder("native_");
        sb.append(str);
        sb.append("_task_");
        return DM.m(sb, this.taskStatus, "_time");
    }

    public final String getMetricNameForTask(Object obj) {
        AbstractC2995aW.q(obj, "task");
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        String strSubstring = simpleName.substring(getStatePrefixLength());
        AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return AbstractC5044xl.p(new StringBuilder(lowerCase.length() + 13), "native_", lowerCase, "_state");
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: invoke-gIAlu-s */
    public Object mo81invokegIAlus(P p, InterfaceC2857Wj interfaceC2857Wj) {
        return m98invokegIAlus$suspendImpl(this, p, interfaceC2857Wj);
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setTaskStatus(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.taskStatus = str;
    }
}
