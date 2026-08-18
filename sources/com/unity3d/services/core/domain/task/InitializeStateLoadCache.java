package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializeStateLoadCache extends MetricTask<Params, LoadCacheResult> {
    private final ISDKDispatchers dispatchers;

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

    public InitializeStateLoadCache(ISDKDispatchers iSDKDispatchers) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getWebViewData() {
        try {
            return Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
        } catch (Exception e) {
            DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(Params params, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeStateLoadCache$doWork$1 initializeStateLoadCache$doWork$1;
        if (interfaceC2857Wj instanceof InitializeStateLoadCache$doWork$1) {
            initializeStateLoadCache$doWork$1 = (InitializeStateLoadCache$doWork$1) interfaceC2857Wj;
            int i = initializeStateLoadCache$doWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initializeStateLoadCache$doWork$1.label = i - Integer.MIN_VALUE;
            } else {
                initializeStateLoadCache$doWork$1 = new InitializeStateLoadCache$doWork$1(this, interfaceC2857Wj);
            }
        } else {
            initializeStateLoadCache$doWork$1 = new InitializeStateLoadCache$doWork$1(this, interfaceC2857Wj);
        }
        Object objX = initializeStateLoadCache$doWork$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = initializeStateLoadCache$doWork$1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objX);
            AbstractC3899kk abstractC3899kk = this.dispatchers.getDefault();
            InitializeStateLoadCache$doWork$2 initializeStateLoadCache$doWork$2 = new InitializeStateLoadCache$doWork$2(this, params, null);
            initializeStateLoadCache$doWork$1.label = 1;
            objX = WD.X(initializeStateLoadCache$doWork$2, abstractC3899kk, initializeStateLoadCache$doWork$1);
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
        return getMetricNameForInitializeTask("read_local_webview");
    }

    public static final class LoadCacheResult {
        private final boolean hasHashMismatch;
        private final String webViewData;

        public /* synthetic */ LoadCacheResult(boolean z, String str, int i, AbstractC2471Hm abstractC2471Hm) {
            this(z, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ LoadCacheResult copy$default(LoadCacheResult loadCacheResult, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadCacheResult.hasHashMismatch;
            }
            if ((i & 2) != 0) {
                str = loadCacheResult.webViewData;
            }
            return loadCacheResult.copy(z, str);
        }

        public final boolean component1() {
            return this.hasHashMismatch;
        }

        public final String component2() {
            return this.webViewData;
        }

        public final LoadCacheResult copy(boolean z, String str) {
            return new LoadCacheResult(z, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadCacheResult)) {
                return false;
            }
            LoadCacheResult loadCacheResult = (LoadCacheResult) obj;
            return this.hasHashMismatch == loadCacheResult.hasHashMismatch && AbstractC2995aW.i(this.webViewData, loadCacheResult.webViewData);
        }

        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        public final String getWebViewData() {
            return this.webViewData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.hasHashMismatch;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.webViewData;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LoadCacheResult(hasHashMismatch=");
            sb.append(this.hasHashMismatch);
            sb.append(", webViewData=");
            return DM.l(sb, this.webViewData, ')');
        }

        public LoadCacheResult(boolean z, String str) {
            this.hasHashMismatch = z;
            this.webViewData = str;
        }
    }
}
