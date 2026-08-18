package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializeSDK extends MetricTask<EmptyParams, C5033xf0> {
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final ISDKDispatchers dispatchers;
    private final InitializeStateComplete initializeStateComplete;
    private final InitializeStateConfig initializeStateConfig;
    private final InitializeStateCreate initializeStateCreate;
    private final InitializeStateError initializeStateError;
    private final InitializeStateLoadCache initializeStateLoadCache;
    private final InitializeStateLoadWeb initializeStateLoadWeb;
    private final InitializeStateReset initializeStateReset;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {111}, m = "handleInitializationException")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitializeSDK.this.handleInitializationException(null, this);
        }
    }

    public InitializeSDK(ISDKDispatchers iSDKDispatchers, ConfigFileFromLocalStorage configFileFromLocalStorage, InitializeStateReset initializeStateReset, InitializeStateError initializeStateError, InitializeStateConfig initializeStateConfig, InitializeStateCreate initializeStateCreate, InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadWeb initializeStateLoadWeb, InitializeStateComplete initializeStateComplete) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(configFileFromLocalStorage, "configFileFromLocalStorage");
        AbstractC2995aW.q(initializeStateReset, "initializeStateReset");
        AbstractC2995aW.q(initializeStateError, "initializeStateError");
        AbstractC2995aW.q(initializeStateConfig, "initializeStateConfig");
        AbstractC2995aW.q(initializeStateCreate, "initializeStateCreate");
        AbstractC2995aW.q(initializeStateLoadCache, "initializeStateLoadCache");
        AbstractC2995aW.q(initializeStateLoadWeb, "initializeStateLoadWeb");
        AbstractC2995aW.q(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = iSDKDispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: executeErrorState-BWLJW6A, reason: not valid java name */
    public final Object m85executeErrorStateBWLJW6A(ErrorState errorState, Throwable th, Configuration configuration, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeSDK$executeErrorState$1 initializeSDK$executeErrorState$1;
        if (interfaceC2857Wj instanceof InitializeSDK$executeErrorState$1) {
            initializeSDK$executeErrorState$1 = (InitializeSDK$executeErrorState$1) interfaceC2857Wj;
            int i = initializeSDK$executeErrorState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initializeSDK$executeErrorState$1.label = i - Integer.MIN_VALUE;
            } else {
                initializeSDK$executeErrorState$1 = new InitializeSDK$executeErrorState$1(this, interfaceC2857Wj);
            }
        } else {
            initializeSDK$executeErrorState$1 = new InitializeSDK$executeErrorState$1(this, interfaceC2857Wj);
        }
        Object obj = initializeSDK$executeErrorState$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = initializeSDK$executeErrorState$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            return ((IZ) obj).f3222a;
        }
        AbstractC3375el.b0(obj);
        InitializeStateError initializeStateError = this.initializeStateError;
        InitializeStateError.Params params = new InitializeStateError.Params(errorState, new Exception(th != null ? th.getMessage() : null), configuration);
        initializeSDK$executeErrorState$1.label = 1;
        Object objMo81invokegIAlus = initializeStateError.mo81invokegIAlus(params, initializeSDK$executeErrorState$1);
        return objMo81invokegIAlus == enumC4602sk ? enumC4602sk : objMo81invokegIAlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleInitializationException(InitializationException initializationException, InterfaceC2857Wj interfaceC2857Wj) throws InitializationException {
        AnonymousClass1 anonymousClass1;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        Object obj = anonymousClass1.result;
        Object obj2 = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InitializationException initializationException2 = (InitializationException) anonymousClass1.L$0;
            AbstractC3375el.b0(obj);
            ((IZ) obj).getClass();
            throw initializationException2;
        }
        AbstractC3375el.b0(obj);
        ErrorState errorState = initializationException.getErrorState();
        Throwable originalException = initializationException.getOriginalException();
        Configuration config = initializationException.getConfig();
        anonymousClass1.L$0 = initializationException;
        anonymousClass1.label = 1;
        if (m85executeErrorStateBWLJW6A(errorState, originalException, config, anonymousClass1) == obj2) {
            return obj2;
        }
        throw initializationException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(EmptyParams emptyParams, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeSDK$doWork$1 initializeSDK$doWork$1;
        if (interfaceC2857Wj instanceof InitializeSDK$doWork$1) {
            initializeSDK$doWork$1 = (InitializeSDK$doWork$1) interfaceC2857Wj;
            int i = initializeSDK$doWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initializeSDK$doWork$1.label = i - Integer.MIN_VALUE;
            } else {
                initializeSDK$doWork$1 = new InitializeSDK$doWork$1(this, interfaceC2857Wj);
            }
        } else {
            initializeSDK$doWork$1 = new InitializeSDK$doWork$1(this, interfaceC2857Wj);
        }
        Object objX = initializeSDK$doWork$1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = initializeSDK$doWork$1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objX);
            AbstractC3899kk abstractC3899kk = this.dispatchers.getDefault();
            InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this, null);
            initializeSDK$doWork$1.label = 1;
            objX = WD.X(initializeSDK$doWork$2, abstractC3899kk, initializeSDK$doWork$1);
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
        return getMetricNameForInitializeTask(MobileAdsBridgeBase.initializeMethodName);
    }
}
