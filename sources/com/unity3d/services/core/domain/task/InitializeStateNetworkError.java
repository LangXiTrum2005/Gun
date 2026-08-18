package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializeStateNetworkError extends MetricTask<Params, C5033xf0> implements IConnectivityListener {
    private int connectedEventThreshold;
    private InterfaceC2857Wj continuation;
    private final ISDKDispatchers dispatchers;
    private long lastConnectedEventTimeMs;
    private int maximumConnectedEvents;
    private int receivedConnectedEvents;

    public static final class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration configuration) {
            AbstractC2995aW.q(configuration, "config");
            this.config = configuration;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration configuration) {
            AbstractC2995aW.q(configuration, "config");
            return new Params(configuration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && AbstractC2995aW.i(this.config, ((Params) obj).config);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateNetworkError(ISDKDispatchers iSDKDispatchers) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
        this.maximumConnectedEvents = 500;
        this.connectedEventThreshold = 10000;
    }

    private final boolean shouldHandleConnectedEvent() {
        return System.currentTimeMillis() - this.lastConnectedEventTimeMs >= ((long) this.connectedEventThreshold) && this.receivedConnectedEvents <= this.maximumConnectedEvents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListening(InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        this.continuation = interfaceC2857Wj;
        ConnectivityMonitor.addListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(Params params, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeStateNetworkError$doWork$1 initializeStateNetworkError$doWork$1;
        if (interfaceC2857Wj instanceof InitializeStateNetworkError$doWork$1) {
            initializeStateNetworkError$doWork$1 = (InitializeStateNetworkError$doWork$1) interfaceC2857Wj;
            int i = initializeStateNetworkError$doWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initializeStateNetworkError$doWork$1.label = i - Integer.MIN_VALUE;
            } else {
                initializeStateNetworkError$doWork$1 = new InitializeStateNetworkError$doWork$1(this, interfaceC2857Wj);
            }
        } else {
            initializeStateNetworkError$doWork$1 = new InitializeStateNetworkError$doWork$1(this, interfaceC2857Wj);
        }
        Object objX = initializeStateNetworkError$doWork$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = initializeStateNetworkError$doWork$1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objX);
            AbstractC3899kk abstractC3899kk = this.dispatchers.getDefault();
            InitializeStateNetworkError$doWork$2 initializeStateNetworkError$doWork$2 = new InitializeStateNetworkError$doWork$2(this, params, null);
            initializeStateNetworkError$doWork$1.label = 1;
            objX = WD.X(initializeStateNetworkError$doWork$2, abstractC3899kk, initializeStateNetworkError$doWork$1);
            if (objX == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(objX);
        }
        return ((IZ) objX).f3222a;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("error_network");
    }

    @Override // com.unity3d.services.core.connectivity.IConnectivityListener
    public void onConnected() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        this.receivedConnectedEvents++;
        DeviceLog.debug("Unity Ads init got connected event");
        if (shouldHandleConnectedEvent()) {
            InterfaceC2857Wj interfaceC2857Wj = this.continuation;
            if (interfaceC2857Wj != null) {
                interfaceC2857Wj.resumeWith(C5033xf0.f5238a);
            }
            this.continuation = null;
        }
        if (this.receivedConnectedEvents > this.maximumConnectedEvents) {
            ConnectivityMonitor.removeListener(this);
        }
        this.lastConnectedEventTimeMs = System.currentTimeMillis();
    }

    @Override // com.unity3d.services.core.connectivity.IConnectivityListener
    public void onDisconnected() {
        DeviceLog.debug("Unity Ads init got disconnected event");
    }
}
