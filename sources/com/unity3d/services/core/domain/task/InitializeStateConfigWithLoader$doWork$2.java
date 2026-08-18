package com.unity3d.services.core.domain.task;

import com.badlogic.gdx.Input;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationLoader;
import com.unity3d.services.core.configuration.ConfigurationRequestFactory;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.configuration.PrivacyConfigurationLoader;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3086bY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {Input.Keys.ALT_RIGHT, 101, 109}, m = "invokeSuspend")
public final class InitializeStateConfigWithLoader$doWork$2 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, interfaceC2857Wj);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x019e A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #7 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:60:0x01cb, B:66:0x01fc, B:54:0x0198, B:56:0x019e, B:61:0x01d5, B:62:0x01e7, B:53:0x0193, B:41:0x0155, B:43:0x0159, B:63:0x01e8, B:64:0x01f5, B:65:0x01f6, B:40:0x0150, B:27:0x0082), top: B:88:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d5 A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #7 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:60:0x01cb, B:66:0x01fc, B:54:0x0198, B:56:0x019e, B:61:0x01d5, B:62:0x01e7, B:53:0x0193, B:41:0x0155, B:43:0x0159, B:63:0x01e8, B:64:0x01f5, B:65:0x01f6, B:40:0x0150, B:27:0x0082), top: B:88:0x000d }] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Throwable thA;
        C3086bY c3086bY;
        InitializeStateConfigWithLoader.Params params;
        C3086bY c3086bY2;
        InitializeStateConfigWithLoader.Params params2;
        C3086bY c3086bY3;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        Object objV2;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader2;
        InitializeStateConfigWithLoader.Params params3;
        C3086bY c3086bY4;
        Configuration configuration;
        C3086bY c3086bY5;
        C3086bY c3086bY6;
        Object objMo81invokegIAlus;
        Object objV3;
        C3086bY c3086bY7;
        C3086bY c3086bY8;
        C3086bY c3086bY9;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader3;
        InitializeStateConfigWithLoader.Params params4;
        AbstractC3899kk io;
        InitializeStateConfigWithLoader$doWork$2$1$1 initializeStateConfigWithLoader$doWork$2$1$1;
        C3086bY c3086bY10;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    c3086bY2 = (C3086bY) this.L$4;
                    c3086bY3 = (C3086bY) this.L$3;
                    params2 = (InitializeStateConfigWithLoader.Params) this.L$2;
                    initializeStateConfigWithLoader = (InitializeStateConfigWithLoader) this.L$1;
                    try {
                        AbstractC3375el.b0(obj);
                    } catch (Throwable th) {
                        th = th;
                        objV2 = AbstractC3375el.v(th);
                    }
                } else if (i == 2) {
                    c3086bY2 = (C3086bY) this.L$4;
                    c3086bY6 = (C3086bY) this.L$3;
                    c3086bY4 = (C3086bY) this.L$2;
                    params3 = (InitializeStateConfigWithLoader.Params) this.L$1;
                    initializeStateConfigWithLoader2 = (InitializeStateConfigWithLoader) this.L$0;
                    try {
                        AbstractC3375el.b0(obj);
                        objMo81invokegIAlus = ((IZ) obj).f3222a;
                        objV3 = new IZ(objMo81invokegIAlus);
                    } catch (Throwable th2) {
                        th = th2;
                        objV3 = AbstractC3375el.v(th);
                    }
                    c3086bY7 = c3086bY2;
                    c3086bY8 = c3086bY6;
                    c3086bY9 = c3086bY4;
                    initializeStateConfigWithLoader3 = initializeStateConfigWithLoader2;
                    params4 = params3;
                    if (!(objV3 instanceof HZ)) {
                        throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params4.getConfig());
                    }
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    io = initializeStateConfigWithLoader3.dispatchers.getIo();
                    initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(c3086bY9, c3086bY8, initializeStateConfigWithLoader3, params4, null);
                    this.L$0 = c3086bY8;
                    this.L$1 = c3086bY7;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (WD.X(initializeStateConfigWithLoader$doWork$2$1$1, io, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    c3086bY10 = c3086bY8;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3086bY7 = (C3086bY) this.L$1;
                    c3086bY10 = (C3086bY) this.L$0;
                    AbstractC3375el.b0(obj);
                }
                configuration = (Configuration) c3086bY10.f4172a;
                C3086bY c3086bY11 = c3086bY10;
                c3086bY2 = c3086bY7;
                c3086bY5 = c3086bY11;
                c3086bY2.f4172a = configuration;
                objV = (Configuration) c3086bY5.f4172a;
                if (!(!(objV instanceof HZ)) && (thA = IZ.a(objV)) != null) {
                    objV = AbstractC3375el.v(thA);
                }
                return new IZ(objV);
            }
            AbstractC3375el.b0(obj);
            InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.L$0;
            InitializeStateConfigWithLoader initializeStateConfigWithLoader4 = this.this$0;
            InitializeStateConfigWithLoader.Params params5 = this.$params;
            PrivacyConfigStorage privacyConfigStorage = PrivacyConfigStorage.getInstance();
            DeviceInfoDataFactory deviceInfoDataFactory = new DeviceInfoDataFactory(initializeStateConfigWithLoader4.sdkMetricsSender);
            C3086bY c3086bY12 = new C3086bY();
            ConfigurationLoader configurationLoader = new ConfigurationLoader(new ConfigurationRequestFactory(params5.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.TOKEN)), initializeStateConfigWithLoader4.sdkMetricsSender, (HttpClient) initializeStateConfigWithLoader4.getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(HttpClient.class)));
            c3086bY12.f4172a = configurationLoader;
            c3086bY12.f4172a = new PrivacyConfigurationLoader(configurationLoader, new ConfigurationRequestFactory(params5.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.PRIVACY)), privacyConfigStorage, (HttpClient) initializeStateConfigWithLoader4.getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(HttpClient.class)));
            C3086bY c3086bY13 = new C3086bY();
            c3086bY13.f4172a = new Configuration();
            try {
                int maxRetries = params5.getConfig().getMaxRetries();
                double retryScalingFactor = params5.getConfig().getRetryScalingFactor();
                long retryDelay = params5.getConfig().getRetryDelay();
                InitializationException initializationException = new InitializationException(ErrorState.NetworkConfigRequest, new Exception(), params5.getConfig());
                InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(initializeStateConfigWithLoader4, c3086bY12, c3086bY13, null);
                this.L$0 = interfaceC4514rk;
                this.L$1 = initializeStateConfigWithLoader4;
                this.L$2 = params5;
                this.L$3 = c3086bY12;
                this.L$4 = c3086bY13;
                this.label = 1;
                c3086bY = c3086bY12;
                params = params5;
                try {
                    if (TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateConfigWithLoader$doWork$2$1$configResult$1$1, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    c3086bY2 = c3086bY13;
                    params2 = params;
                    c3086bY3 = c3086bY;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader4;
                } catch (Throwable th3) {
                    th = th3;
                    c3086bY2 = c3086bY13;
                    params2 = params;
                    c3086bY3 = c3086bY;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader4;
                    objV2 = AbstractC3375el.v(th);
                }
            } catch (Throwable th4) {
                th = th4;
                c3086bY = c3086bY12;
                params = params5;
            }
            objV2 = C5033xf0.f5238a;
            initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
            params3 = params2;
            c3086bY4 = c3086bY3;
            if (objV2 instanceof HZ) {
                Throwable thA2 = IZ.a(objV2);
                if (thA2 instanceof AbortRetryException) {
                    throw new InitializationException(ErrorState.NetworkConfigRequest, (Exception) thA2, params3.getConfig());
                }
                try {
                    InitializeStateNetworkError initializeStateNetworkError = initializeStateConfigWithLoader2.initializeStateNetworkError;
                    InitializeStateNetworkError.Params params6 = new InitializeStateNetworkError.Params(params3.getConfig());
                    this.L$0 = initializeStateConfigWithLoader2;
                    this.L$1 = params3;
                    this.L$2 = c3086bY4;
                    this.L$3 = c3086bY2;
                    this.L$4 = c3086bY2;
                    this.label = 2;
                    objMo81invokegIAlus = initializeStateNetworkError.mo81invokegIAlus(params6, this);
                    if (objMo81invokegIAlus == enumC4602sk) {
                        return enumC4602sk;
                    }
                    c3086bY6 = c3086bY2;
                    objV3 = new IZ(objMo81invokegIAlus);
                    c3086bY7 = c3086bY2;
                    c3086bY8 = c3086bY6;
                    c3086bY9 = c3086bY4;
                    initializeStateConfigWithLoader3 = initializeStateConfigWithLoader2;
                    params4 = params3;
                    if (!(objV3 instanceof HZ)) {
                        throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params4.getConfig());
                    }
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    io = initializeStateConfigWithLoader3.dispatchers.getIo();
                    initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(c3086bY9, c3086bY8, initializeStateConfigWithLoader3, params4, null);
                    this.L$0 = c3086bY8;
                    this.L$1 = c3086bY7;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (WD.X(initializeStateConfigWithLoader$doWork$2$1$1, io, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    c3086bY10 = c3086bY8;
                    configuration = (Configuration) c3086bY10.f4172a;
                    C3086bY c3086bY14 = c3086bY10;
                    c3086bY2 = c3086bY7;
                    c3086bY5 = c3086bY14;
                } catch (Throwable th5) {
                    th = th5;
                    c3086bY6 = c3086bY2;
                    objV3 = AbstractC3375el.v(th);
                }
            } else {
                configuration = (Configuration) c3086bY2.f4172a;
                c3086bY5 = c3086bY2;
            }
            c3086bY2.f4172a = configuration;
            objV = (Configuration) c3086bY5.f4172a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th6) {
            objV = AbstractC3375el.v(th6);
        }
        if (!(!(objV instanceof HZ))) {
            objV = AbstractC3375el.v(thA);
        }
        return new IZ(objV);
    }
}
