package com.unity3d.ads.core.domain;

import com.badlogic.gdx.Input;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5203zc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z90;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final ClearCache clearCache;
    private final AbstractC3899kk defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, EnumC4719u30.JSON_ENCODE_ERROR_VALUE, 121}, m = "initializationSuccess")
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
            return AndroidInitializeBoldSDK.this.initializationSuccess(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {63, Input.Keys.AT}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $source;
        int I$0;
        long J$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {64, 66, Input.Keys.GRAVE, Input.Keys.MINUS}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ boolean $isRetry;
            final /* synthetic */ String $source;
            int label;
            final /* synthetic */ AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.this$0 = androidInitializeBoldSDK;
                this.$source = str;
                this.$isRetry = z;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0071 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x007e A[RETURN] */
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) throws InitializationException {
                AndroidInitializeBoldSDK androidInitializeBoldSDK;
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC3375el.b0(obj);
                    } else if (i == 2) {
                        AbstractC3375el.b0(obj);
                        RequestPolicy requestPolicyInvoke = this.this$0.getRequestPolicy.invoke();
                        GatewayClient gatewayClient = this.this$0.gatewayClient;
                        OperationType operationType = OperationType.INITIALIZATION;
                        this.label = 3;
                        obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) obj, requestPolicyInvoke, operationType, this, 1, null);
                        if (obj == enumC4602sk) {
                            return enumC4602sk;
                        }
                        androidInitializeBoldSDK = this.this$0;
                        this.label = 4;
                        if (androidInitializeBoldSDK.handleResponse((UniversalResponseOuterClass.UniversalResponse) obj, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else if (i == 3) {
                        AbstractC3375el.b0(obj);
                        androidInitializeBoldSDK = this.this$0;
                        this.label = 4;
                        if (androidInitializeBoldSDK.handleResponse((UniversalResponseOuterClass.UniversalResponse) obj, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj);
                    }
                    return C5033xf0.f5238a;
                }
                AbstractC3375el.b0(obj);
                AndroidInitializeBoldSDK androidInitializeBoldSDK2 = this.this$0;
                String str = this.$source;
                boolean z = this.$isRetry;
                this.label = 1;
                if (androidInitializeBoldSDK2.initializationStart(str, z, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                this.this$0.checkCanInitialize();
                GetInitializationRequest getInitializationRequest = this.this$0.getInitializeRequest;
                this.label = 2;
                obj = getInitializationRequest.invoke(this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                RequestPolicy requestPolicyInvoke2 = this.this$0.getRequestPolicy.invoke();
                GatewayClient gatewayClient2 = this.this$0.gatewayClient;
                OperationType operationType2 = OperationType.INITIALIZATION;
                this.label = 3;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (UniversalRequestOuterClass.UniversalRequest) obj, requestPolicyInvoke2, operationType2, this, 1, null);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                androidInitializeBoldSDK = this.this$0;
                this.label = 4;
                if (androidInitializeBoldSDK.handleResponse((UniversalResponseOuterClass.UniversalResponse) obj, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                return C5033xf0.f5238a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$source = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidInitializeBoldSDK.this.new AnonymousClass2(this.$source, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String, long] */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            long jA;
            ?? r6;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            try {
                if (i != 0) {
                    if (i == 1) {
                        int i2 = this.I$0;
                        jA = this.J$0;
                        AbstractC3375el.b0(obj);
                        i = i2;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj);
                    }
                }
                AbstractC3375el.b0(obj);
                jA = IP.a();
                ?? r1 = !AndroidInitializeBoldSDK.this.sessionRepository.isFirstInitAttempt();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidInitializeBoldSDK.this, this.$source, r1, null);
                this.J$0 = jA;
                this.I$0 = r1;
                this.label = 1;
                i = r1;
                if (AbstractC2995aW.E0(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, anonymousClass1, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                AndroidInitializeBoldSDK androidInitializeBoldSDK = AndroidInitializeBoldSDK.this;
                Bc0 bc0 = new Bc0(jA);
                r6 = this.$source;
                boolean z = i != 0;
                this.label = 2;
                return androidInitializeBoldSDK.initializationSuccess(bc0, r6, z, this) == enumC4602sk ? enumC4602sk : c5033xf0;
            } catch (Exception e) {
                AndroidInitializeBoldSDK.this.initializationFailure(new Bc0(r6), InitializationException.Companion.parseFrom(e), this.$source, i != 0);
                return c5033xf0;
            }
        }
    }

    public AndroidInitializeBoldSDK(AbstractC3899kk abstractC3899kk, InitializeOMSDK initializeOMSDK, GetInitializationRequest getInitializationRequest, GetRequestPolicy getRequestPolicy, ClearCache clearCache, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, ConfigurationReader configurationReader, SDKPropertiesManager sDKPropertiesManager, GetGameId getGameId) {
        AbstractC2995aW.q(abstractC3899kk, "defaultDispatcher");
        AbstractC2995aW.q(initializeOMSDK, "initializeOM");
        AbstractC2995aW.q(getInitializationRequest, "getInitializeRequest");
        AbstractC2995aW.q(getRequestPolicy, "getRequestPolicy");
        AbstractC2995aW.q(clearCache, "clearCache");
        AbstractC2995aW.q(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        AbstractC2995aW.q(gatewayClient, "gatewayClient");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(eventObservers, "eventObservers");
        AbstractC2995aW.q(triggerInitializeListener, "triggerInitializeListener");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(diagnosticEventRepository, "diagnosticEventRepository");
        AbstractC2995aW.q(storageManager, "storageManager");
        AbstractC2995aW.q(configurationReader, "legacyConfigurationReader");
        AbstractC2995aW.q(sDKPropertiesManager, "sdkPropertiesManager");
        AbstractC2995aW.q(getGameId, "getGameId");
        this.defaultDispatcher = abstractC3899kk;
        this.initializeOM = initializeOMSDK;
        this.getInitializeRequest = getInitializationRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.clearCache = clearCache;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = configurationReader;
        this.sdkPropertiesManager = sDKPropertiesManager;
        this.getGameId = getGameId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() throws InitializationException {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        String strInvoke = this.getGameId.invoke();
        if ((strInvoke != null ? Z90.i0(strInvoke) : null) == null) {
            throw new InitializationException(DM.B("gameId \"", strInvoke, "\" should be a number."), null, "invalid_game_id", strInvoke, 2, null);
        }
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z) {
        C2985aM c2985aMW = AbstractC3375el.w();
        c2985aMW.put("operation", OperationType.INITIALIZATION.toString());
        c2985aMW.put("reason", initializationException.getReason());
        c2985aMW.put("source", str);
        c2985aMW.put("is_retry", String.valueOf(z));
        if (initializationException.getReasonDebug() != null) {
            c2985aMW.put("reason_debug", initializationException.getReasonDebug());
        }
        return AbstractC3375el.g(c2985aMW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, InterfaceC2857Wj interfaceC2857Wj) throws InitializationException {
        if (universalResponse.hasError()) {
            this.sessionRepository.setShouldInitialize(false);
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
        }
        if (!universalResponse.hasPayload()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        if (!universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
        }
        HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        AbstractC2995aW.p(initializationResponse, "response.payload.initializationResponse");
        Object objInvoke = handleGatewayInitializationResponse.invoke(initializationResponse, interfaceC2857Wj);
        return objInvoke == EnumC4602sk.f4993a ? objInvoke : C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(InterfaceC5203zc0 interfaceC5203zc0, InitializationException initializationException, String str, boolean z) {
        DeviceLog.debug("Unity Ads Initialization Failure: " + initializationException.getMessage());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), getTags(initializationException, str, z), null, null, 24, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        DeviceLog.debug("Unity Ads Initialization Start");
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, U5.u0(new C4839vT("source", str), new C4839vT("is_retry", String.valueOf(z))), null, null, 26, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object objInvoke = this.eventObservers.invoke(interfaceC2857Wj);
        return objInvoke == EnumC4602sk.f4993a ? objInvoke : C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object initializationSuccess(InterfaceC5203zc0 interfaceC5203zc0, String str, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidInitializeBoldSDK androidInitializeBoldSDK;
        SessionRepository sessionRepository;
        AndroidInitializeBoldSDK androidInitializeBoldSDK2;
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
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                androidInitializeBoldSDK = (AndroidInitializeBoldSDK) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            } else if (i2 == 2) {
                androidInitializeBoldSDK = (AndroidInitializeBoldSDK) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
                sessionRepository = androidInitializeBoldSDK.sessionRepository;
                anonymousClass1.L$0 = androidInitializeBoldSDK;
                anonymousClass1.label = 3;
                if (sessionRepository.persistNativeConfiguration(anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
                androidInitializeBoldSDK2 = androidInitializeBoldSDK;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidInitializeBoldSDK2 = (AndroidInitializeBoldSDK) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            }
            androidInitializeBoldSDK2.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
            androidInitializeBoldSDK2.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
            androidInitializeBoldSDK2.sdkPropertiesManager.setInitialized(true);
            androidInitializeBoldSDK2.triggerInitializeListener.success();
            androidInitializeBoldSDK2.setupDiagnosticEvents();
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        DeviceLog.debug("Unity Ads Initialization Success");
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_success_time", new Double(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), U5.u0(new C4839vT("source", str), new C4839vT("is_retry", String.valueOf(z))), null, null, 24, null);
        this.storageManager.hasInitialized();
        InitializeOMSDK initializeOMSDK = this.initializeOM;
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (initializeOMSDK.invoke(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        androidInitializeBoldSDK = this;
        ClearCache clearCache = androidInitializeBoldSDK.clearCache;
        anonymousClass1.L$0 = androidInitializeBoldSDK;
        anonymousClass1.label = 2;
        if (clearCache.invoke(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        sessionRepository = androidInitializeBoldSDK.sessionRepository;
        anonymousClass1.L$0 = androidInitializeBoldSDK;
        anonymousClass1.label = 3;
        if (sessionRepository.persistNativeConfiguration(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        androidInitializeBoldSDK2 = androidInitializeBoldSDK;
        androidInitializeBoldSDK2.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
        androidInitializeBoldSDK2.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
        androidInitializeBoldSDK2.sdkPropertiesManager.setInitialized(true);
        androidInitializeBoldSDK2.triggerInitializeListener.success();
        androidInitializeBoldSDK2.setupDiagnosticEvents();
        return C5033xf0.f5238a;
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        AbstractC2995aW.p(diagnosticEvents, "config");
        diagnosticEventRepository.configure(diagnosticEvents);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, InterfaceC2857Wj interfaceC2857Wj) {
        Object objX = WD.X(new AnonymousClass2(str, null), this.defaultDispatcher, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }
}
