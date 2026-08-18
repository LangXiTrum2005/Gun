package com.unity3d.services.core.di;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader;
import com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.ClearCache;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonClearCache;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SCAR_SCOPE = "scar_scope";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;
    private static final IServicesRegistry serviceRegistry;

    /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03051 extends WG implements InterfaceC2714Qw {
            public static final C03051 INSTANCE = new C03051();

            public C03051() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final Context invoke() {
                return ClientProperties.getApplicationContext();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$10, reason: invalid class name */
        public static final class AnonymousClass10 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC4514rk invoke() {
                return this.$moduleInstance.transactionCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InterfaceC4075mk) this.$this_registry.resolveService(new ServiceKey("sdk", AbstractC3263dY.a(InterfaceC4075mk.class))), (InterfaceC5000xE) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, AbstractC3263dY.a(InterfaceC5000xE.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$100, reason: invalid class name */
        public static final class AnonymousClass100 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass100 INSTANCE = new AnonymousClass100();

            public AnonymousClass100() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetHbTokenEventRequest invoke() {
                return new GetAndroidTokenEventRequest();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$101, reason: invalid class name */
        public static final class AnonymousClass101 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass101(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CommonScarEventReceiver invoke() {
                return new CommonScarEventReceiver((InterfaceC4514rk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$102, reason: invalid class name */
        public static final class AnonymousClass102 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass102(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GMAScarAdapterBridge invoke() {
                GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CommonScarEventReceiver.class))))).getBridge();
                AbstractC2995aW.p(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                return bridge;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$103, reason: invalid class name */
        public static final class AnonymousClass103 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass103(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ScarTimeHackFixer invoke() {
                return new ScarTimeHackFixer((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$104, reason: invalid class name */
        public static final class AnonymousClass104 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass104(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ScarManager invoke() {
                return new AndroidScarManager((CommonScarEventReceiver) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ScarTimeHackFixer.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$105, reason: invalid class name */
        public static final class AnonymousClass105 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass105(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final FetchSignalsAndSendUseCase invoke() {
                return new AndroidFetchSignalsAndSendUseCase((InterfaceC4514rk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ScarManager.class))), (HandleGetTokenRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HandleGetTokenRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$106, reason: invalid class name */
        public static final class AnonymousClass106 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass106(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final LoadScarAd invoke() {
                return new LoadScarAd((ScarManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ScarManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$107, reason: invalid class name */
        public static final class AnonymousClass107 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass107(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HandleGetTokenRequest invoke() {
                return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetHbTokenEventRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, AbstractC3263dY.a(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$108, reason: invalid class name */
        public static final class AnonymousClass108 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass108(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetClientInfo invoke() {
                return new AndroidGetClientInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(MediationRepository.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OmidManager.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ScarManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$109, reason: invalid class name */
        public static final class AnonymousClass109 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass109(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetInitializationCompletedRequest invoke() {
                return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$11, reason: invalid class name */
        public static final class AnonymousClass11 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC4514rk invoke() {
                return this.$moduleInstance.getTokenCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InterfaceC4075mk) this.$this_registry.resolveService(new ServiceKey("sdk", AbstractC3263dY.a(InterfaceC4075mk.class))), (InterfaceC5000xE) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, AbstractC3263dY.a(InterfaceC5000xE.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$110, reason: invalid class name */
        public static final class AnonymousClass110 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass110(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetInitializationRequest invoke() {
                return new AndroidGetInitializationRequest((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$111, reason: invalid class name */
        public static final class AnonymousClass111 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass111(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetLimitedSessionToken invoke() {
                return new AndroidGetLimitedSessionToken((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(MediationRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$112, reason: invalid class name */
        public static final class AnonymousClass112 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass112(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetOpenGLRendererInfo invoke() {
                return new AndroidGetOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$113, reason: invalid class name */
        public static final class AnonymousClass113 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass113 INSTANCE = new AnonymousClass113();

            public AnonymousClass113() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetSharedDataTimestamps invoke() {
                return new AndroidGetSharedDataTimestamps();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$114, reason: invalid class name */
        public static final class AnonymousClass114 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass114(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetUniversalRequestForPayLoad invoke() {
                return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestSharedData.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$115, reason: invalid class name */
        public static final class AnonymousClass115 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass115(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetUniversalRequestSharedData invoke() {
                return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeveloperConsentRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$116, reason: invalid class name */
        public static final class AnonymousClass116 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass116(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetCachedAsset invoke() {
                return new GetCachedAsset((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CacheRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$117, reason: invalid class name */
        public static final class AnonymousClass117 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass117(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetWebViewBridgeUseCase invoke() {
                return new CommonGetWebViewBridgeUseCase((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$118, reason: invalid class name */
        public static final class AnonymousClass118 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass118(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetRequestPolicy invoke() {
                return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$119, reason: invalid class name */
        public static final class AnonymousClass119 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass119(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetLatestWebViewConfiguration invoke() {
                return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(WebviewConfigurationDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$12, reason: invalid class name */
        public static final class AnonymousClass12 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC4514rk invoke() {
                return this.$moduleInstance.scarSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InterfaceC4075mk) this.$this_registry.resolveService(new ServiceKey("sdk", AbstractC3263dY.a(InterfaceC4075mk.class))), (InterfaceC5000xE) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, AbstractC3263dY.a(InterfaceC5000xE.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$120, reason: invalid class name */
        public static final class AnonymousClass120 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass120(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetRequestPolicy invoke() {
                return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$121, reason: invalid class name */
        public static final class AnonymousClass121 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass121(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetRequestPolicy invoke() {
                return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$122, reason: invalid class name */
        public static final class AnonymousClass122 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass122(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetPrivacyUpdateRequest invoke() {
                return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$123, reason: invalid class name */
        public static final class AnonymousClass123 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass123(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HandleGatewayInitializationResponse invoke() {
                return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (InterfaceC4514rk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$124, reason: invalid class name */
        public static final class AnonymousClass124 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass124(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HandleGatewayUniversalResponse invoke() {
                return new AndroidHandleGatewayUniversalResponse((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$125, reason: invalid class name */
        public static final class AnonymousClass125 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass125(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeBoldSDK invoke() {
                return new AndroidInitializeBoldSDK((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, AbstractC3263dY.a(GetRequestPolicy.class))), (ClearCache) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ClearCache.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SDKPropertiesManager.class))), (GetGameId) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetGameId.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$126, reason: invalid class name */
        public static final class AnonymousClass126 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass126(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final LegacyShowUseCase invoke() {
                return new LegacyShowUseCase((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (Show) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$127, reason: invalid class name */
        public static final class AnonymousClass127 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass127(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final SendPrivacyUpdateRequest invoke() {
                return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, AbstractC3263dY.a(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$128, reason: invalid class name */
        public static final class AnonymousClass128 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass128(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TriggerInitializationCompletedRequest invoke() {
                return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, AbstractC3263dY.a(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$129, reason: invalid class name */
        public static final class AnonymousClass129 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass129(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TriggerInitializeListener invoke() {
                return new TriggerInitializeListener((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$13, reason: invalid class name */
        public static final class AnonymousClass13 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC4514rk invoke() {
                return this.$moduleInstance.omidCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InterfaceC4075mk) this.$this_registry.resolveService(new ServiceKey("sdk", AbstractC3263dY.a(InterfaceC4075mk.class))), (InterfaceC5000xE) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, AbstractC3263dY.a(InterfaceC5000xE.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$130, reason: invalid class name */
        public static final class AnonymousClass130 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass130(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DiagnosticEventObserver invoke() {
                return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetDiagnosticEventBatchRequest.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(BackgroundWorker.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$131, reason: invalid class name */
        public static final class AnonymousClass131 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass131(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final EventObservers invoke() {
                return new EventObservers((OperativeEventObserver) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TransactionEventObserver.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$132, reason: invalid class name */
        public static final class AnonymousClass132 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass132(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetTransactionData invoke() {
                return new AndroidGetTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetByteStringId.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$133, reason: invalid class name */
        public static final class AnonymousClass133 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass133(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetTransactionRequest invoke() {
                return new CommonGetTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$134, reason: invalid class name */
        public static final class AnonymousClass134 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass134 INSTANCE = new AnonymousClass134();

            public AnonymousClass134() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetDiagnosticEventBatchRequest invoke() {
                return new GetDiagnosticEventBatchRequest();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$135, reason: invalid class name */
        public static final class AnonymousClass135 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass135(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetDiagnosticEventRequest invoke() {
                return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetSharedDataTimestamps.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$136, reason: invalid class name */
        public static final class AnonymousClass136 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass136(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetOperativeEventApi invoke() {
                return new GetOperativeEventApi((OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetOperativeEventRequest.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$137, reason: invalid class name */
        public static final class AnonymousClass137 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass137(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetOperativeEventRequest invoke() {
                return new GetOperativeEventRequest((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CampaignRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$138, reason: invalid class name */
        public static final class AnonymousClass138 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass138 INSTANCE = new AnonymousClass138();

            public AnonymousClass138() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HandleGatewayEventResponse invoke() {
                return new AndroidHandleGatewayEventResponse();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$139, reason: invalid class name */
        public static final class AnonymousClass139 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass139(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final OperativeEventObserver invoke() {
                return new OperativeEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(BackgroundWorker.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$14, reason: invalid class name */
        public static final class AnonymousClass14 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC5000xE invoke() {
                return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DiagnosticEventRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$140, reason: invalid class name */
        public static final class AnonymousClass140 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass140(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TransactionEventObserver invoke() {
                return new TransactionEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, AbstractC3263dY.a(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, AbstractC3263dY.a(ByteStringDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$141, reason: invalid class name */
        public static final class AnonymousClass141 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass141 INSTANCE = new AnonymousClass141();

            public AnonymousClass141() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final UniversalRequestTtlValidator invoke() {
                return new CommonUniversalRequestTtlValidator();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$142, reason: invalid class name */
        public static final class AnonymousClass142 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass142(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final UniversalRequestEventSender invoke() {
                return new UniversalRequestEventSender((GatewayClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(UniversalRequestTtlValidator.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$143, reason: invalid class name */
        public static final class AnonymousClass143 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass143(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final OmFinishSession invoke() {
                return new AndroidOmFinishSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$144, reason: invalid class name */
        public static final class AnonymousClass144 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass144(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final OmImpressionOccurred invoke() {
                return new AndroidOmImpressionOccurred((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$145, reason: invalid class name */
        public static final class AnonymousClass145 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass145(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AndroidOmInteraction invoke() {
                return new AndroidOmStartSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$146, reason: invalid class name */
        public static final class AnonymousClass146 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass146(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetOmData invoke() {
                return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OpenMeasurementRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$147, reason: invalid class name */
        public static final class AnonymousClass147 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass147(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final IsOMActivated invoke() {
                return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OpenMeasurementRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$148, reason: invalid class name */
        public static final class AnonymousClass148 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass148(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeOMSDK invoke() {
                return new AndroidInitializeOMSDK((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OpenMeasurementRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$149, reason: invalid class name */
        public static final class AnonymousClass149 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass149 INSTANCE = new AnonymousClass149();

            public AnonymousClass149() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final FlattenerRulesUseCase invoke() {
                return new DeveloperConsentFlattenerRulesUseCase();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$15, reason: invalid class name */
        public static final class AnonymousClass15 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ByteStringDataSource invoke() {
                return new AndroidLegacyConfigStoreDataSource((StorageManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(StorageManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$150, reason: invalid class name */
        public static final class AnonymousClass150 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass150 INSTANCE = new AnonymousClass150();

            public AnonymousClass150() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final FlattenerRulesUseCase invoke() {
                return new LegacyUserConsentFlattenerRulesUseCase();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$151, reason: invalid class name */
        public static final class AnonymousClass151 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass151(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final BackgroundWorker invoke() {
                return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$152, reason: invalid class name */
        public static final class AnonymousClass152 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass152(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DiagnosticEventRequestWorkModifier invoke() {
                return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(LifecycleDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$153, reason: invalid class name */
        public static final class AnonymousClass153 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass153(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GatewayClient invoke() {
                return new CommonGatewayClient((HttpClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HttpClient.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$154, reason: invalid class name */
        public static final class AnonymousClass154 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass154(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC4075mk invoke() {
                return new SDKErrorHandler((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SDKMetricsSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$155, reason: invalid class name */
        public static final class AnonymousClass155 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass155 INSTANCE = new AnonymousClass155();

            public AnonymousClass155() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TokenStorage invoke() {
                return new InMemoryTokenStorage();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$156, reason: invalid class name */
        public static final class AnonymousClass156 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass156 INSTANCE = new AnonymousClass156();

            public AnonymousClass156() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final VolumeChange invoke() {
                return new VolumeChangeContentObserver();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$157, reason: invalid class name */
        public static final class AnonymousClass157 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass157(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ConfigFileFromLocalStorage invoke() {
                return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$158, reason: invalid class name */
        public static final class AnonymousClass158 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass158(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeSDK invoke() {
                return new InitializeSDK((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateComplete.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$159, reason: invalid class name */
        public static final class AnonymousClass159 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass159(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateComplete invoke() {
                return new InitializeStateComplete((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$16, reason: invalid class name */
        public static final class AnonymousClass16 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass16(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.privacyDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$160, reason: invalid class name */
        public static final class AnonymousClass160 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass160(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateConfig invoke() {
                return new InitializeStateConfig((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateConfigWithLoader.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$161, reason: invalid class name */
        public static final class AnonymousClass161 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass161(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateConfigWithLoader invoke() {
                return new InitializeStateConfigWithLoader((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SDKMetricsSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$162, reason: invalid class name */
        public static final class AnonymousClass162 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass162(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$163, reason: invalid class name */
        public static final class AnonymousClass163 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass163(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$164, reason: invalid class name */
        public static final class AnonymousClass164 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass164(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$165, reason: invalid class name */
        public static final class AnonymousClass165 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass165(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateLoadWeb invoke() {
                return new InitializeStateLoadWeb((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(InitializeStateNetworkError.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HttpClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$166, reason: invalid class name */
        public static final class AnonymousClass166 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass166(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$167, reason: invalid class name */
        public static final class AnonymousClass167 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass167(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final StoreMonitor invoke() {
                return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(StoreExceptionHandler.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$168, reason: invalid class name */
        public static final class AnonymousClass168 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass168(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final StoreWebViewEventSender invoke() {
                return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(IEventSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$169, reason: invalid class name */
        public static final class AnonymousClass169 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass169 INSTANCE = new AnonymousClass169();

            public AnonymousClass169() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final StoreExceptionHandler invoke() {
                return new GatewayStoreExceptionHandler();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$17, reason: invalid class name */
        public static final class AnonymousClass17 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, AbstractC3263dY.a(DataStore.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$170, reason: invalid class name */
        public static final class AnonymousClass170 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass170(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final StoreEventListenerFactory invoke() {
                return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(StoreWebViewEventSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$171, reason: invalid class name */
        public static final class AnonymousClass171 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass171 INSTANCE = new AnonymousClass171();

            public AnonymousClass171() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ConfigurationReader invoke() {
                return new ConfigurationReader();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$172, reason: invalid class name */
        public static final class AnonymousClass172 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass172(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AndroidAttribution invoke() {
                return new AndroidAttribution((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$173, reason: invalid class name */
        public static final class AnonymousClass173 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass173(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AdPlayerScope invoke() {
                return new AdPlayerScope((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$174, reason: invalid class name */
        public static final class AnonymousClass174 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass174(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AndroidWebViewClient invoke() {
                return new AndroidWebViewClient((GetWebViewCacheAssetLoader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetWebViewCacheAssetLoader.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetCachedAsset.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetLatestWebViewConfiguration.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$175, reason: invalid class name */
        public static final class AnonymousClass175 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass175(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AndroidGetWebViewContainerUseCase invoke() {
                return new AndroidGetWebViewContainerUseCase((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendWebViewClientErrorDiagnostics.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$176, reason: invalid class name */
        public static final class AnonymousClass176 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass176(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final Load invoke() {
                return new AndroidLoad((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, AbstractC3263dY.a(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AdRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$177, reason: invalid class name */
        public static final class AnonymousClass177 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass177(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AwaitInitialization invoke() {
                return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$178, reason: invalid class name */
        public static final class AnonymousClass178 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass178(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetAsyncHeaderBiddingToken invoke() {
                return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$179, reason: invalid class name */
        public static final class AnonymousClass179 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass179(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetAdPlayer invoke() {
                return new CommonGetAdPlayer((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (ExecuteAdViewerRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ExecuteAdViewerRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (InterfaceC4514rk) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AdPlayerScope.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OpenMeasurementRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ScarManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$18, reason: invalid class name */
        public static final class AnonymousClass18 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass18(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.privacyFsmDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$180, reason: invalid class name */
        public static final class AnonymousClass180 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass180(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HandleGatewayAdResponse invoke() {
                return new AndroidHandleGatewayAdResponse((AdRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetAdPlayer.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$181, reason: invalid class name */
        public static final class AnonymousClass181 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass181 INSTANCE = new AnonymousClass181();

            public AnonymousClass181() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HandleInvocationsFromAdViewer invoke() {
                return new HandleInvocationsFromAdViewer();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$182, reason: invalid class name */
        public static final class AnonymousClass182 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass182(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final LegacyLoadUseCase invoke() {
                return new LegacyLoadUseCase((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (Load) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AdRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$183, reason: invalid class name */
        public static final class AnonymousClass183 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass183(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$184, reason: invalid class name */
        public static final class AnonymousClass184 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass184(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CoroutineTimer invoke() {
                return new CommonCoroutineTimer((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$185, reason: invalid class name */
        public static final class AnonymousClass185 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass185 INSTANCE = new AnonymousClass185();

            public AnonymousClass185() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final IEventSender invoke() {
                return SharedInstances.INSTANCE.getWebViewEventSender();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$186, reason: invalid class name */
        public static final class AnonymousClass186 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass186(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final SetGameId invoke() {
                return new CommonSetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$187, reason: invalid class name */
        public static final class AnonymousClass187 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass187(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetGameId invoke() {
                return new CommonGetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$188, reason: invalid class name */
        public static final class AnonymousClass188 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass188(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ValidateGameId invoke() {
                return new CommonValidateGameId((GetGameId) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetGameId.class))), (SetGameId) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SetGameId.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$189, reason: invalid class name */
        public static final class AnonymousClass189 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass189(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetWebViewCacheAssetLoader invoke() {
                return new CommonGetWebViewCacheAssetLoader((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetLatestWebViewConfiguration.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$19, reason: invalid class name */
        public static final class AnonymousClass19 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass19(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyFsmDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, AbstractC3263dY.a(DataStore.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$190, reason: invalid class name */
        public static final class AnonymousClass190 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass190(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ShouldAllowInitialization invoke() {
                return new CommonShouldAllowInitialization((AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationState.class))), (SetInitializationState) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SetInitializationState.class))), (ValidateGameId) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ValidateGameId.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$191, reason: invalid class name */
        public static final class AnonymousClass191 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass191(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CheckForGameIdAndTestModeChanges invoke() {
                return new CommonCheckForGameIdAndTestModeChanges((GetGameId) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetGameId.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AbstractC3899kk invoke() {
                return this.$moduleInstance.mainDispatcher();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$20, reason: invalid class name */
        public static final class AnonymousClass20 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$21, reason: invalid class name */
        public static final class AnonymousClass21 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, AbstractC3263dY.a(DataStore.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$22, reason: invalid class name */
        public static final class AnonymousClass22 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.glInfoDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (DataMigration) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, AbstractC3263dY.a(DataMigration.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$23, reason: invalid class name */
        public static final class AnonymousClass23 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.glInfoDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, AbstractC3263dY.a(DataStore.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$24, reason: invalid class name */
        public static final class AnonymousClass24 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass24(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
                return this.$moduleInstance.universalRequestDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$25, reason: invalid class name */
        public static final class AnonymousClass25 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.iapTransactionDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$26, reason: invalid class name */
        public static final class AnonymousClass26 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.iapTransactionDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, AbstractC3263dY.a(DataStore.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$27, reason: invalid class name */
        public static final class AnonymousClass27 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> invoke() {
                return this.$moduleInstance.webViewConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$28, reason: invalid class name */
        public static final class AnonymousClass28 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass28(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AsyncTokenStorage invoke() {
                return this.$moduleInstance.asyncTokenStorage((TokenStorage) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SDKMetricsSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$29, reason: invalid class name */
        public static final class AnonymousClass29 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass29(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final VolumeChangeMonitor invoke() {
                return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(VolumeChange.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AbstractC3899kk invoke() {
                return this.$moduleInstance.defaultDispatcher();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$30, reason: invalid class name */
        public static final class AnonymousClass30 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass30(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final JsonStorage invoke() {
                return this.$moduleInstance.publicJsonStorage();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$31, reason: invalid class name */
        public static final class AnonymousClass31 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass31(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final JsonStorage invoke() {
                return this.$moduleInstance.privateJsonStorage();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$32, reason: invalid class name */
        public static final class AnonymousClass32 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass32(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                return this.$moduleInstance.defaultNativeConfiguration();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$33, reason: invalid class name */
        public static final class AnonymousClass33 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass33(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final MeasurementsService invoke() {
                return this.$moduleInstance.measurementService((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$34, reason: invalid class name */
        public static final class AnonymousClass34 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass34(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TopicsService invoke() {
                return this.$moduleInstance.topicsService((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$35, reason: invalid class name */
        public static final class AnonymousClass35 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass35 INSTANCE = new AnonymousClass35();

            public AnonymousClass35() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CronetEngineBuilderFactory invoke() {
                return new CronetEngineBuilderFactory();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$36, reason: invalid class name */
        public static final class AnonymousClass36 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass36(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HttpClientProvider invoke() {
                return new AndroidHttpClientProvider((ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (CronetEngineBuilderFactory) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CronetEngineBuilderFactory.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37, reason: invalid class name */
        public static final class AnonymousClass37 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37$1, reason: invalid class name and collision with other inner class name */
            @InterfaceC2314Bl(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$37$1", f = "ServiceProvider.kt", l = {406}, m = "invokeSuspend")
            public static final class C03061 extends Ea0 implements InterfaceC3567gx {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03061(ServicesRegistry servicesRegistry, InterfaceC2857Wj interfaceC2857Wj) {
                    super(2, interfaceC2857Wj);
                    this.$this_registry = servicesRegistry;
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
                public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                    return new C03061(this.$this_registry, interfaceC2857Wj);
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
                public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                    return ((C03061) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
                public final Object invokeSuspend(Object obj) {
                    EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC3375el.b0(obj);
                        HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HttpClientProvider.class)));
                        this.label = 1;
                        obj = httpClientProvider.invoke(this);
                        if (obj == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass37(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HttpClient invoke() {
                return (HttpClient) WD.R(C2734Rq.f3684a, new C03061(this.$this_registry, null));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$38, reason: invalid class name */
        public static final class AnonymousClass38 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass38(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AlternativeFlowReader invoke() {
                return new AlternativeFlowReader((ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39, reason: invalid class name */
        public static final class AnonymousClass39 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass39 INSTANCE = new AnonymousClass39();

            public AnonymousClass39() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TcfDataSource invoke() {
                return new AndroidTcfDataSource();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AbstractC3899kk invoke() {
                return this.$moduleInstance.ioDispatcher();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40, reason: invalid class name */
        public static final class AnonymousClass40 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass40(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TcfRepository invoke() {
                return new AndroidTcfRepository((TcfDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TcfDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$41, reason: invalid class name */
        public static final class AnonymousClass41 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass41(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AndroidManifestIntPropertyReader invoke() {
                return new AndroidManifestIntPropertyReader((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42, reason: invalid class name */
        public static final class AnonymousClass42 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass42(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AndroidTestDataInfo invoke() {
                return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AndroidManifestIntPropertyReader.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$43, reason: invalid class name */
        public static final class AnonymousClass43 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass43(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GameServerIdReader invoke() {
                return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", AbstractC3263dY.a(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$44, reason: invalid class name */
        public static final class AnonymousClass44 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass44(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final StoreDataSource invoke() {
                return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$45, reason: invalid class name */
        public static final class AnonymousClass45 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass45 INSTANCE = new AnonymousClass45();

            public AnonymousClass45() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AnalyticsDataSource invoke() {
                return new AndroidAnalyticsDataSource();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$46, reason: invalid class name */
        public static final class AnonymousClass46 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass46(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DeveloperConsentDataSource invoke() {
                return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, AbstractC3263dY.a(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", AbstractC3263dY.a(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$47, reason: invalid class name */
        public static final class AnonymousClass47 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass47(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DynamicDeviceInfoDataSource invoke() {
                return new AndroidDynamicDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(LifecycleDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$48, reason: invalid class name */
        public static final class AnonymousClass48 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass48(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final LegacyUserConsentDataSource invoke() {
                return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, AbstractC3263dY.a(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", AbstractC3263dY.a(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$49, reason: invalid class name */
        public static final class AnonymousClass49 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass49 INSTANCE = new AnonymousClass49();

            public AnonymousClass49() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final LifecycleDataSource invoke() {
                return new AndroidLifecycleDataSource();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ISDKDispatchers invoke() {
                return this.$moduleInstance.sdkDispatchers();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$50, reason: invalid class name */
        public static final class AnonymousClass50 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass50(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CacheDataSource invoke() {
                return new AndroidLocalCacheDataSource((CreateFile) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetFileExtensionFromUrl.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$51, reason: invalid class name */
        public static final class AnonymousClass51 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass51 INSTANCE = new AnonymousClass51();

            public AnonymousClass51() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CreateFile invoke() {
                return new CommonCreateFile();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$52, reason: invalid class name */
        public static final class AnonymousClass52 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass52(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetFileExtensionFromUrl invoke() {
                return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(RemoveUrlQuery.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$53, reason: invalid class name */
        public static final class AnonymousClass53 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass53 INSTANCE = new AnonymousClass53();

            public AnonymousClass53() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final RemoveUrlQuery invoke() {
                return new AndroidRemoveUrlQuery();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$54, reason: invalid class name */
        public static final class AnonymousClass54 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass54(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final MediationDataSource invoke() {
                return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", AbstractC3263dY.a(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$55, reason: invalid class name */
        public static final class AnonymousClass55 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass55(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final PrivacyDeviceInfoDataSource invoke() {
                return new AndroidPrivacyDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$56, reason: invalid class name */
        public static final class AnonymousClass56 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass56(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CacheDataSource invoke() {
                return new AndroidRemoteCacheDataSource((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetFileExtensionFromUrl.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HttpClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$57, reason: invalid class name */
        public static final class AnonymousClass57 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass57(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final StaticDeviceInfoDataSource invoke() {
                return new AndroidStaticDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, AbstractC3263dY.a(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(StoreDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$58, reason: invalid class name */
        public static final class AnonymousClass58 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass58(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetOpenGLRendererInfo.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$59, reason: invalid class name */
        public static final class AnonymousClass59 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass59(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final UniversalRequestDataSource invoke() {
                return new UniversalRequestDataSource((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, AbstractC3263dY.a(DataStore.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final SDKMetricsSender invoke() {
                return this.$moduleInstance.sdkMetrics();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$60, reason: invalid class name */
        public static final class AnonymousClass60 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass60(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final WebviewConfigurationDataSource invoke() {
                return new WebviewConfigurationDataSource((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, AbstractC3263dY.a(DataStore.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$61, reason: invalid class name */
        public static final class AnonymousClass61 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass61 INSTANCE = new AnonymousClass61();

            public AnonymousClass61() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final OmidManager invoke() {
                return new AndroidOmidManager();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$62, reason: invalid class name */
        public static final class AnonymousClass62 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass62 INSTANCE = new AnonymousClass62();

            public AnonymousClass62() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final SDKPropertiesManager invoke() {
                return new AndroidSDKPropertiesManager();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$63, reason: invalid class name */
        public static final class AnonymousClass63 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass63 INSTANCE = new AnonymousClass63();

            public AnonymousClass63() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final StorageManager invoke() {
                return new AndroidStorageManager();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$64, reason: invalid class name */
        public static final class AnonymousClass64 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass64(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TransactionEventManager invoke() {
                return new TransactionEventManager((InterfaceC4514rk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class))), (StoreMonitor) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(StoreMonitor.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, AbstractC3263dY.a(ByteStringDataSource.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$65, reason: invalid class name */
        public static final class AnonymousClass65 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass65 INSTANCE = new AnonymousClass65();

            public AnonymousClass65() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AdRepository invoke() {
                return new AndroidAdRepository();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$66, reason: invalid class name */
        public static final class AnonymousClass66 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass66(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CacheRepository invoke() {
                return new AndroidCacheRepository((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (GetCacheDirectory) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetCacheDirectory.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey("local", AbstractC3263dY.a(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, AbstractC3263dY.a(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$67, reason: invalid class name */
        public static final class AnonymousClass67 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass67 INSTANCE = new AnonymousClass67();

            public AnonymousClass67() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetCacheDirectory invoke() {
                return new CommonGetCacheDirectory();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$68, reason: invalid class name */
        public static final class AnonymousClass68 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass68(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CampaignRepository invoke() {
                return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetSharedDataTimestamps.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$69, reason: invalid class name */
        public static final class AnonymousClass69 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass69(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DeveloperConsentRepository invoke() {
                return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeveloperConsentDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC4514rk invoke() {
                return this.$moduleInstance.initCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InterfaceC4075mk) this.$this_registry.resolveService(new ServiceKey("sdk", AbstractC3263dY.a(InterfaceC4075mk.class))), (InterfaceC5000xE) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, AbstractC3263dY.a(InterfaceC5000xE.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$70, reason: invalid class name */
        public static final class AnonymousClass70 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass70(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DeviceInfoRepository invoke() {
                return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$71, reason: invalid class name */
        public static final class AnonymousClass71 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass71(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final DiagnosticEventRepository invoke() {
                return new AndroidDiagnosticEventRepository((CoroutineTimer) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CoroutineTimer.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetDiagnosticEventRequest.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$72, reason: invalid class name */
        public static final class AnonymousClass72 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass72(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final LegacyUserConsentRepository invoke() {
                return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(LegacyUserConsentDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$73, reason: invalid class name */
        public static final class AnonymousClass73 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass73(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final MediationRepository invoke() {
                return new AndroidMediationRepository((MediationDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(MediationDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$74, reason: invalid class name */
        public static final class AnonymousClass74 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass74(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final OpenMeasurementRepository invoke() {
                return new AndroidOpenMeasurementRepository((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(OmidManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$75, reason: invalid class name */
        public static final class AnonymousClass75 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass75(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final SessionRepository invoke() {
                return new AndroidSessionRepository((ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, AbstractC3263dY.a(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, AbstractC3263dY.a(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, AbstractC3263dY.a(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, AbstractC3263dY.a(ByteStringDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(NativeConfigurationOuterClass.NativeConfiguration.class))), (AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$76, reason: invalid class name */
        public static final class AnonymousClass76 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass76 INSTANCE = new AnonymousClass76();

            public AnonymousClass76() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final TransactionEventRepository invoke() {
                return new AndroidTransactionEventRepository();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$77, reason: invalid class name */
        public static final class AnonymousClass77 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass77 INSTANCE = new AnonymousClass77();

            public AnonymousClass77() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final OperativeEventRepository invoke() {
                return new OperativeEventRepository();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$78, reason: invalid class name */
        public static final class AnonymousClass78 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass78(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ExecuteAdViewerRequest invoke() {
                return new AndroidExecuteAdViewerRequest((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(HttpClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$79, reason: invalid class name */
        public static final class AnonymousClass79 extends WG implements InterfaceC2714Qw {
            public static final AnonymousClass79 INSTANCE = new AnonymousClass79();

            public AnonymousClass79() {
                super(0);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetByteStringId invoke() {
                return new AndroidGenerateByteStringId();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC4514rk invoke() {
                return this.$moduleInstance.loadCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InterfaceC4075mk) this.$this_registry.resolveService(new ServiceKey("sdk", AbstractC3263dY.a(InterfaceC4075mk.class))), (InterfaceC5000xE) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, AbstractC3263dY.a(InterfaceC5000xE.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$80, reason: invalid class name */
        public static final class AnonymousClass80 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass80(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final HandleOpenUrl invoke() {
                return new AndroidHandleOpenUrl((Context) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$81, reason: invalid class name */
        public static final class AnonymousClass81 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass81(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final Refresh invoke() {
                return new AndroidRefresh((AbstractC3899kk) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, AbstractC3263dY.a(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$82, reason: invalid class name */
        public static final class AnonymousClass82 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass82(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final SendDiagnosticEvent invoke() {
                return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetDiagnosticEventRequest.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$83, reason: invalid class name */
        public static final class AnonymousClass83 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass83(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final SendWebViewClientErrorDiagnostics invoke() {
                return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$84, reason: invalid class name */
        public static final class AnonymousClass84 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass84(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final Show invoke() {
                return new AndroidShow((AdRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$85, reason: invalid class name */
        public static final class AnonymousClass85 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass85(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final CacheFile invoke() {
                return new CommonCacheFile((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$86, reason: invalid class name */
        public static final class AnonymousClass86 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass86(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final ClearCache invoke() {
                return new CommonClearCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$87, reason: invalid class name */
        public static final class AnonymousClass87 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass87(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetAdObject invoke() {
                return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AdRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$88, reason: invalid class name */
        public static final class AnonymousClass88 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass88(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetHeaderBiddingToken invoke() {
                return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(FetchSignalsAndSendUseCase.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$89, reason: invalid class name */
        public static final class AnonymousClass89 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass89(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final BuildHeaderBiddingToken invoke() {
                return new AndroidBuildHeaderBiddingToken((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetLimitedSessionToken.class))), (GetInitializationData) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationData.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CampaignRepository.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TcfRepository.class))), (AndroidTestDataInfo) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(AndroidTestDataInfo.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$9, reason: invalid class name */
        public static final class AnonymousClass9 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final InterfaceC4514rk invoke() {
                return this.$moduleInstance.showCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class))), (InterfaceC4075mk) this.$this_registry.resolveService(new ServiceKey("sdk", AbstractC3263dY.a(InterfaceC4075mk.class))), (InterfaceC5000xE) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, AbstractC3263dY.a(InterfaceC5000xE.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$90, reason: invalid class name */
        public static final class AnonymousClass90 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass90(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetInitializationData invoke() {
                return new AndroidGetInitializationData((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestSharedData.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$91, reason: invalid class name */
        public static final class AnonymousClass91 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass91(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetInitializationRequestPayload invoke() {
                return new AndroidGetInitializationRequestPayload((GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(LegacyUserConsentRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$92, reason: invalid class name */
        public static final class AnonymousClass92 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass92(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetInitializationState invoke() {
                return new CommonGetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SDKPropertiesManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$93, reason: invalid class name */
        public static final class AnonymousClass93 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass93(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetIsFileCache invoke() {
                return new CommonGetIsFileCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$94, reason: invalid class name */
        public static final class AnonymousClass94 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass94(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final SetInitializationState invoke() {
                return new CommonSetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SDKPropertiesManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$95, reason: invalid class name */
        public static final class AnonymousClass95 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass95(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetRequestPolicy invoke() {
                return new AndroidGetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$96, reason: invalid class name */
        public static final class AnonymousClass96 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass96(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetAdDataRefreshRequest invoke() {
                return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CampaignRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$97, reason: invalid class name */
        public static final class AnonymousClass97 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass97(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetAdPlayerConfigRequest invoke() {
                return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$98, reason: invalid class name */
        public static final class AnonymousClass98 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass98(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final AndroidGetAdPlayerContext invoke() {
                return new AndroidGetAdPlayerContext((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$99, reason: invalid class name */
        public static final class AnonymousClass99 extends WG implements InterfaceC2714Qw {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass99(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
            public final GetAdRequest invoke() {
                return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(WebviewConfigurationDataSource.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", AbstractC3263dY.a(TcfRepository.class))));
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ServicesRegistry) obj);
            return C5033xf0.f5238a;
        }

        public final void invoke(ServicesRegistry servicesRegistry) {
            AbstractC2995aW.q(servicesRegistry, "$this$registry");
            UnityAdsModule unityAdsModule = new UnityAdsModule();
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(Context.class)), AbstractC2340Cl.I(C03051.INSTANCE));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class)), AbstractC2340Cl.I(new AnonymousClass2(unityAdsModule)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class)), AbstractC2340Cl.I(new AnonymousClass3(unityAdsModule)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, AbstractC3263dY.a(AbstractC3899kk.class)), AbstractC2340Cl.I(new AnonymousClass4(unityAdsModule)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ISDKDispatchers.class)), AbstractC2340Cl.I(new AnonymousClass5(unityAdsModule)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(SDKMetricsSender.class)), AbstractC2340Cl.I(new AnonymousClass6(unityAdsModule)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class)), ServiceFactoryKt.factoryOf(new AnonymousClass7(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class)), ServiceFactoryKt.factoryOf(new AnonymousClass8(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class)), ServiceFactoryKt.factoryOf(new AnonymousClass9(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class)), ServiceFactoryKt.factoryOf(new AnonymousClass10(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class)), ServiceFactoryKt.factoryOf(new AnonymousClass11(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class)), ServiceFactoryKt.factoryOf(new AnonymousClass12(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class)), ServiceFactoryKt.factoryOf(new AnonymousClass13(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, AbstractC3263dY.a(InterfaceC5000xE.class)), ServiceFactoryKt.factoryOf(new AnonymousClass14(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, AbstractC3263dY.a(ByteStringDataSource.class)), AbstractC2340Cl.I(new AnonymousClass15(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, AbstractC3263dY.a(DataStore.class)), AbstractC2340Cl.I(new AnonymousClass16(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, AbstractC3263dY.a(ByteStringDataSource.class)), AbstractC2340Cl.I(new AnonymousClass17(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, AbstractC3263dY.a(DataStore.class)), AbstractC2340Cl.I(new AnonymousClass18(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, AbstractC3263dY.a(ByteStringDataSource.class)), AbstractC2340Cl.I(new AnonymousClass19(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, AbstractC3263dY.a(DataStore.class)), AbstractC2340Cl.I(new AnonymousClass20(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, AbstractC3263dY.a(ByteStringDataSource.class)), AbstractC2340Cl.I(new AnonymousClass21(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, AbstractC3263dY.a(DataStore.class)), AbstractC2340Cl.I(new AnonymousClass22(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, AbstractC3263dY.a(ByteStringDataSource.class)), AbstractC2340Cl.I(new AnonymousClass23(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, AbstractC3263dY.a(DataStore.class)), AbstractC2340Cl.I(new AnonymousClass24(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, AbstractC3263dY.a(DataStore.class)), AbstractC2340Cl.I(new AnonymousClass25(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, AbstractC3263dY.a(ByteStringDataSource.class)), AbstractC2340Cl.I(new AnonymousClass26(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, AbstractC3263dY.a(DataStore.class)), AbstractC2340Cl.I(new AnonymousClass27(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AsyncTokenStorage.class)), AbstractC2340Cl.I(new AnonymousClass28(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(VolumeChangeMonitor.class)), AbstractC2340Cl.I(new AnonymousClass29(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("PUBLIC", AbstractC3263dY.a(JsonStorage.class)), AbstractC2340Cl.I(new AnonymousClass30(unityAdsModule)));
            servicesRegistry.updateService(new ServiceKey("PRIVATE", AbstractC3263dY.a(JsonStorage.class)), AbstractC2340Cl.I(new AnonymousClass31(unityAdsModule)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(NativeConfigurationOuterClass.NativeConfiguration.class)), AbstractC2340Cl.I(new AnonymousClass32(unityAdsModule)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(MeasurementsService.class)), AbstractC2340Cl.I(new AnonymousClass33(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TopicsService.class)), AbstractC2340Cl.I(new AnonymousClass34(unityAdsModule, servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(CronetEngineBuilderFactory.class)), AbstractC2340Cl.I(AnonymousClass35.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HttpClientProvider.class)), AbstractC2340Cl.I(new AnonymousClass36(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HttpClient.class)), AbstractC2340Cl.I(new AnonymousClass37(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AlternativeFlowReader.class)), AbstractC2340Cl.I(new AnonymousClass38(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TcfDataSource.class)), AbstractC2340Cl.I(AnonymousClass39.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TcfRepository.class)), AbstractC2340Cl.I(new AnonymousClass40(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AndroidManifestIntPropertyReader.class)), AbstractC2340Cl.I(new AnonymousClass41(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AndroidTestDataInfo.class)), AbstractC2340Cl.I(new AnonymousClass42(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GameServerIdReader.class)), AbstractC2340Cl.I(new AnonymousClass43(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(StoreDataSource.class)), AbstractC2340Cl.I(new AnonymousClass44(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AnalyticsDataSource.class)), AbstractC2340Cl.I(AnonymousClass45.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(DeveloperConsentDataSource.class)), AbstractC2340Cl.I(new AnonymousClass46(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(DynamicDeviceInfoDataSource.class)), AbstractC2340Cl.I(new AnonymousClass47(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(LegacyUserConsentDataSource.class)), AbstractC2340Cl.I(new AnonymousClass48(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(LifecycleDataSource.class)), AbstractC2340Cl.I(AnonymousClass49.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("local", AbstractC3263dY.a(CacheDataSource.class)), AbstractC2340Cl.I(new AnonymousClass50(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(CreateFile.class)), AbstractC2340Cl.I(AnonymousClass51.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetFileExtensionFromUrl.class)), AbstractC2340Cl.I(new AnonymousClass52(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(RemoveUrlQuery.class)), AbstractC2340Cl.I(AnonymousClass53.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(MediationDataSource.class)), AbstractC2340Cl.I(new AnonymousClass54(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(PrivacyDeviceInfoDataSource.class)), AbstractC2340Cl.I(new AnonymousClass55(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, AbstractC3263dY.a(CacheDataSource.class)), AbstractC2340Cl.I(new AnonymousClass56(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(StaticDeviceInfoDataSource.class)), AbstractC2340Cl.I(new AnonymousClass57(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, AbstractC3263dY.a(DataMigration.class)), AbstractC2340Cl.I(new AnonymousClass58(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(UniversalRequestDataSource.class)), AbstractC2340Cl.I(new AnonymousClass59(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(WebviewConfigurationDataSource.class)), AbstractC2340Cl.I(new AnonymousClass60(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(OmidManager.class)), AbstractC2340Cl.I(AnonymousClass61.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(SDKPropertiesManager.class)), AbstractC2340Cl.I(AnonymousClass62.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(StorageManager.class)), AbstractC2340Cl.I(AnonymousClass63.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TransactionEventManager.class)), AbstractC2340Cl.I(new AnonymousClass64(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AdRepository.class)), AbstractC2340Cl.I(AnonymousClass65.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(CacheRepository.class)), AbstractC2340Cl.I(new AnonymousClass66(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetCacheDirectory.class)), AbstractC2340Cl.I(AnonymousClass67.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(CampaignRepository.class)), AbstractC2340Cl.I(new AnonymousClass68(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(DeveloperConsentRepository.class)), AbstractC2340Cl.I(new AnonymousClass69(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(DeviceInfoRepository.class)), AbstractC2340Cl.I(new AnonymousClass70(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(DiagnosticEventRepository.class)), AbstractC2340Cl.I(new AnonymousClass71(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(LegacyUserConsentRepository.class)), AbstractC2340Cl.I(new AnonymousClass72(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(MediationRepository.class)), AbstractC2340Cl.I(new AnonymousClass73(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(OpenMeasurementRepository.class)), AbstractC2340Cl.I(new AnonymousClass74(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(SessionRepository.class)), AbstractC2340Cl.I(new AnonymousClass75(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TransactionEventRepository.class)), AbstractC2340Cl.I(AnonymousClass76.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(OperativeEventRepository.class)), AbstractC2340Cl.I(AnonymousClass77.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ExecuteAdViewerRequest.class)), AbstractC2340Cl.I(new AnonymousClass78(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetByteStringId.class)), AbstractC2340Cl.I(AnonymousClass79.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HandleOpenUrl.class)), AbstractC2340Cl.I(new AnonymousClass80(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(Refresh.class)), AbstractC2340Cl.I(new AnonymousClass81(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(SendDiagnosticEvent.class)), AbstractC2340Cl.I(new AnonymousClass82(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(SendWebViewClientErrorDiagnostics.class)), AbstractC2340Cl.I(new AnonymousClass83(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(Show.class)), AbstractC2340Cl.I(new AnonymousClass84(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(CacheFile.class)), AbstractC2340Cl.I(new AnonymousClass85(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ClearCache.class)), AbstractC2340Cl.I(new AnonymousClass86(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetAdObject.class)), AbstractC2340Cl.I(new AnonymousClass87(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass88(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass89(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetInitializationData.class)), AbstractC2340Cl.I(new AnonymousClass90(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetInitializationRequestPayload.class)), AbstractC2340Cl.I(new AnonymousClass91(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetInitializationState.class)), AbstractC2340Cl.I(new AnonymousClass92(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetIsFileCache.class)), AbstractC2340Cl.I(new AnonymousClass93(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(SetInitializationState.class)), AbstractC2340Cl.I(new AnonymousClass94(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, AbstractC3263dY.a(GetRequestPolicy.class)), AbstractC2340Cl.I(new AnonymousClass95(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetAdDataRefreshRequest.class)), AbstractC2340Cl.I(new AnonymousClass96(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetAdPlayerConfigRequest.class)), AbstractC2340Cl.I(new AnonymousClass97(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AndroidGetAdPlayerContext.class)), AbstractC2340Cl.I(new AnonymousClass98(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetAdRequest.class)), AbstractC2340Cl.I(new AnonymousClass99(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetHbTokenEventRequest.class)), AbstractC2340Cl.I(AnonymousClass100.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(CommonScarEventReceiver.class)), AbstractC2340Cl.I(new AnonymousClass101(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GMAScarAdapterBridge.class)), AbstractC2340Cl.I(new AnonymousClass102(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ScarTimeHackFixer.class)), AbstractC2340Cl.I(new AnonymousClass103(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ScarManager.class)), AbstractC2340Cl.I(new AnonymousClass104(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(FetchSignalsAndSendUseCase.class)), AbstractC2340Cl.I(new AnonymousClass105(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(LoadScarAd.class)), AbstractC2340Cl.I(new AnonymousClass106(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HandleGetTokenRequest.class)), AbstractC2340Cl.I(new AnonymousClass107(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetClientInfo.class)), AbstractC2340Cl.I(new AnonymousClass108(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetInitializationCompletedRequest.class)), AbstractC2340Cl.I(new AnonymousClass109(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetInitializationRequest.class)), AbstractC2340Cl.I(new AnonymousClass110(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetLimitedSessionToken.class)), AbstractC2340Cl.I(new AnonymousClass111(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetOpenGLRendererInfo.class)), AbstractC2340Cl.I(new AnonymousClass112(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetSharedDataTimestamps.class)), AbstractC2340Cl.I(AnonymousClass113.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestForPayLoad.class)), AbstractC2340Cl.I(new AnonymousClass114(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetUniversalRequestSharedData.class)), AbstractC2340Cl.I(new AnonymousClass115(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetCachedAsset.class)), AbstractC2340Cl.I(new AnonymousClass116(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetWebViewBridgeUseCase.class)), AbstractC2340Cl.I(new AnonymousClass117(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, AbstractC3263dY.a(GetRequestPolicy.class)), AbstractC2340Cl.I(new AnonymousClass118(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetLatestWebViewConfiguration.class)), AbstractC2340Cl.I(new AnonymousClass119(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, AbstractC3263dY.a(GetRequestPolicy.class)), AbstractC2340Cl.I(new AnonymousClass120(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, AbstractC3263dY.a(GetRequestPolicy.class)), AbstractC2340Cl.I(new AnonymousClass121(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetPrivacyUpdateRequest.class)), AbstractC2340Cl.I(new AnonymousClass122(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HandleGatewayInitializationResponse.class)), AbstractC2340Cl.I(new AnonymousClass123(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HandleGatewayUniversalResponse.class)), AbstractC2340Cl.I(new AnonymousClass124(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeBoldSDK.class)), AbstractC2340Cl.I(new AnonymousClass125(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass126(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(SendPrivacyUpdateRequest.class)), AbstractC2340Cl.I(new AnonymousClass127(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TriggerInitializationCompletedRequest.class)), AbstractC2340Cl.I(new AnonymousClass128(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TriggerInitializeListener.class)), AbstractC2340Cl.I(new AnonymousClass129(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(DiagnosticEventObserver.class)), AbstractC2340Cl.I(new AnonymousClass130(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(EventObservers.class)), AbstractC2340Cl.I(new AnonymousClass131(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetTransactionData.class)), AbstractC2340Cl.I(new AnonymousClass132(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetTransactionRequest.class)), AbstractC2340Cl.I(new AnonymousClass133(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetDiagnosticEventBatchRequest.class)), AbstractC2340Cl.I(AnonymousClass134.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetDiagnosticEventRequest.class)), AbstractC2340Cl.I(new AnonymousClass135(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetOperativeEventApi.class)), AbstractC2340Cl.I(new AnonymousClass136(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetOperativeEventRequest.class)), AbstractC2340Cl.I(new AnonymousClass137(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HandleGatewayEventResponse.class)), AbstractC2340Cl.I(AnonymousClass138.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(OperativeEventObserver.class)), AbstractC2340Cl.I(new AnonymousClass139(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TransactionEventObserver.class)), AbstractC2340Cl.I(new AnonymousClass140(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(UniversalRequestTtlValidator.class)), AbstractC2340Cl.I(AnonymousClass141.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(UniversalRequestEventSender.class)), AbstractC2340Cl.I(new AnonymousClass142(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(OmFinishSession.class)), AbstractC2340Cl.I(new AnonymousClass143(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(OmImpressionOccurred.class)), AbstractC2340Cl.I(new AnonymousClass144(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AndroidOmInteraction.class)), AbstractC2340Cl.I(new AnonymousClass145(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetOmData.class)), AbstractC2340Cl.I(new AnonymousClass146(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(IsOMActivated.class)), AbstractC2340Cl.I(new AnonymousClass147(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeOMSDK.class)), AbstractC2340Cl.I(new AnonymousClass148(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, AbstractC3263dY.a(FlattenerRulesUseCase.class)), AbstractC2340Cl.I(AnonymousClass149.INSTANCE));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, AbstractC3263dY.a(FlattenerRulesUseCase.class)), AbstractC2340Cl.I(AnonymousClass150.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(BackgroundWorker.class)), AbstractC2340Cl.I(new AnonymousClass151(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(DiagnosticEventRequestWorkModifier.class)), AbstractC2340Cl.I(new AnonymousClass152(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GatewayClient.class)), AbstractC2340Cl.I(new AnonymousClass153(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("sdk", AbstractC3263dY.a(InterfaceC4075mk.class)), AbstractC2340Cl.I(new AnonymousClass154(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(TokenStorage.class)), AbstractC2340Cl.I(AnonymousClass155.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(VolumeChange.class)), AbstractC2340Cl.I(AnonymousClass156.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ConfigFileFromLocalStorage.class)), AbstractC2340Cl.I(new AnonymousClass157(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeSDK.class)), AbstractC2340Cl.I(new AnonymousClass158(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateComplete.class)), AbstractC2340Cl.I(new AnonymousClass159(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateConfig.class)), AbstractC2340Cl.I(new AnonymousClass160(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateConfigWithLoader.class)), AbstractC2340Cl.I(new AnonymousClass161(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateCreate.class)), AbstractC2340Cl.I(new AnonymousClass162(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateError.class)), AbstractC2340Cl.I(new AnonymousClass163(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateLoadCache.class)), AbstractC2340Cl.I(new AnonymousClass164(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateLoadWeb.class)), AbstractC2340Cl.I(new AnonymousClass165(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateReset.class)), AbstractC2340Cl.I(new AnonymousClass166(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(StoreMonitor.class)), AbstractC2340Cl.I(new AnonymousClass167(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(StoreWebViewEventSender.class)), AbstractC2340Cl.I(new AnonymousClass168(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(StoreExceptionHandler.class)), AbstractC2340Cl.I(AnonymousClass169.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(StoreEventListenerFactory.class)), AbstractC2340Cl.I(new AnonymousClass170(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ConfigurationReader.class)), AbstractC2340Cl.I(AnonymousClass171.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AndroidAttribution.class)), AbstractC2340Cl.I(new AnonymousClass172(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass173(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new AnonymousClass174(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass175(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(Load.class)), ServiceFactoryKt.factoryOf(new AnonymousClass176(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new AnonymousClass177(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass178(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass179(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new AnonymousClass180(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(AnonymousClass181.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass182(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new AnonymousClass183(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass184(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(IEventSender.class)), AbstractC2340Cl.I(AnonymousClass185.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(SetGameId.class)), AbstractC2340Cl.I(new AnonymousClass186(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetGameId.class)), AbstractC2340Cl.I(new AnonymousClass187(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ValidateGameId.class)), AbstractC2340Cl.I(new AnonymousClass188(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(GetWebViewCacheAssetLoader.class)), AbstractC2340Cl.I(new AnonymousClass189(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(ShouldAllowInitialization.class)), AbstractC2340Cl.I(new AnonymousClass190(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", AbstractC3263dY.a(CheckForGameIdAndTestModeChanges.class)), AbstractC2340Cl.I(new AnonymousClass191(servicesRegistry)));
        }
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(AnonymousClass1.INSTANCE);
    }
}
