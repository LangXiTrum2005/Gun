package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfigFileFromLocalStorage extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    public static final class Params implements BaseParams {
        private final Configuration defaultConfiguration;

        public Params() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }

        public /* synthetic */ Params(Configuration configuration, int i, AbstractC2471Hm abstractC2471Hm) {
            this((i & 1) != 0 ? new Configuration() : configuration);
        }

        public Params(Configuration configuration) {
            AbstractC2995aW.q(configuration, "defaultConfiguration");
            this.defaultConfiguration = configuration;
        }
    }

    public ConfigFileFromLocalStorage(ISDKDispatchers iSDKDispatchers) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(Params params, InterfaceC2857Wj interfaceC2857Wj) {
        ConfigFileFromLocalStorage$doWork$1 configFileFromLocalStorage$doWork$1;
        if (interfaceC2857Wj instanceof ConfigFileFromLocalStorage$doWork$1) {
            configFileFromLocalStorage$doWork$1 = (ConfigFileFromLocalStorage$doWork$1) interfaceC2857Wj;
            int i = configFileFromLocalStorage$doWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                configFileFromLocalStorage$doWork$1.label = i - Integer.MIN_VALUE;
            } else {
                configFileFromLocalStorage$doWork$1 = new ConfigFileFromLocalStorage$doWork$1(this, interfaceC2857Wj);
            }
        } else {
            configFileFromLocalStorage$doWork$1 = new ConfigFileFromLocalStorage$doWork$1(this, interfaceC2857Wj);
        }
        Object objX = configFileFromLocalStorage$doWork$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = configFileFromLocalStorage$doWork$1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objX);
            AbstractC3899kk io = this.dispatchers.getIo();
            ConfigFileFromLocalStorage$doWork$2 configFileFromLocalStorage$doWork$2 = new ConfigFileFromLocalStorage$doWork$2(params, null);
            configFileFromLocalStorage$doWork$1.label = 1;
            objX = WD.X(configFileFromLocalStorage$doWork$2, io, configFileFromLocalStorage$doWork$1);
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
        return getMetricNameForInitializeTask("read_local_config");
    }
}
