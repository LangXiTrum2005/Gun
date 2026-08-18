package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializeStateConfig extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;
    private final InitializeStateConfigWithLoader initializeStateConfigWithLoader;

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

    public InitializeStateConfig(ISDKDispatchers iSDKDispatchers, InitializeStateConfigWithLoader initializeStateConfigWithLoader) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(initializeStateConfigWithLoader, "initializeStateConfigWithLoader");
        this.dispatchers = iSDKDispatchers;
        this.initializeStateConfigWithLoader = initializeStateConfigWithLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(Params params, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeStateConfig$doWork$1 initializeStateConfig$doWork$1;
        if (interfaceC2857Wj instanceof InitializeStateConfig$doWork$1) {
            initializeStateConfig$doWork$1 = (InitializeStateConfig$doWork$1) interfaceC2857Wj;
            int i = initializeStateConfig$doWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initializeStateConfig$doWork$1.label = i - Integer.MIN_VALUE;
            } else {
                initializeStateConfig$doWork$1 = new InitializeStateConfig$doWork$1(this, interfaceC2857Wj);
            }
        } else {
            initializeStateConfig$doWork$1 = new InitializeStateConfig$doWork$1(this, interfaceC2857Wj);
        }
        Object objX = initializeStateConfig$doWork$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = initializeStateConfig$doWork$1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objX);
            AbstractC3899kk abstractC3899kk = this.dispatchers.getDefault();
            InitializeStateConfig$doWork$2 initializeStateConfig$doWork$2 = new InitializeStateConfig$doWork$2(params, this, null);
            initializeStateConfig$doWork$1.label = 1;
            objX = WD.X(initializeStateConfig$doWork$2, abstractC3899kk, initializeStateConfig$doWork$1);
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
        return getMetricNameForInitializeTask("config_fetch");
    }
}
