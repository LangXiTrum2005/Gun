package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializeStateCreate extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    public static final class Params implements BaseParams {
        private final Configuration config;
        private final String webViewData;

        public Params(Configuration configuration, String str) {
            AbstractC2995aW.q(configuration, "config");
            AbstractC2995aW.q(str, "webViewData");
            this.config = configuration;
            this.webViewData = str;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            if ((i & 2) != 0) {
                str = params.webViewData;
            }
            return params.copy(configuration, str);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final String component2() {
            return this.webViewData;
        }

        public final Params copy(Configuration configuration, String str) {
            AbstractC2995aW.q(configuration, "config");
            AbstractC2995aW.q(str, "webViewData");
            return new Params(configuration, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return AbstractC2995aW.i(this.config, params.config) && AbstractC2995aW.i(this.webViewData, params.webViewData);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewData() {
            return this.webViewData;
        }

        public int hashCode() {
            return this.webViewData.hashCode() + (this.config.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Params(config=");
            sb.append(this.config);
            sb.append(", webViewData=");
            return DM.l(sb, this.webViewData, ')');
        }
    }

    public InitializeStateCreate(ISDKDispatchers iSDKDispatchers) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(Params params, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeStateCreate$doWork$1 initializeStateCreate$doWork$1;
        if (interfaceC2857Wj instanceof InitializeStateCreate$doWork$1) {
            initializeStateCreate$doWork$1 = (InitializeStateCreate$doWork$1) interfaceC2857Wj;
            int i = initializeStateCreate$doWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initializeStateCreate$doWork$1.label = i - Integer.MIN_VALUE;
            } else {
                initializeStateCreate$doWork$1 = new InitializeStateCreate$doWork$1(this, interfaceC2857Wj);
            }
        } else {
            initializeStateCreate$doWork$1 = new InitializeStateCreate$doWork$1(this, interfaceC2857Wj);
        }
        Object objX = initializeStateCreate$doWork$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = initializeStateCreate$doWork$1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objX);
            AbstractC3899kk abstractC3899kk = this.dispatchers.getDefault();
            InitializeStateCreate$doWork$2 initializeStateCreate$doWork$2 = new InitializeStateCreate$doWork$2(params, null);
            initializeStateCreate$doWork$1.label = 1;
            objX = WD.X(initializeStateCreate$doWork$2, abstractC3899kk, initializeStateCreate$doWork$1);
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
        return getMetricNameForInitializeTask("create_web_view");
    }
}
