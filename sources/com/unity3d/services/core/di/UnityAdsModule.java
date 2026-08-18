package com.unity3d.services.core.di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4251ok;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class UnityAdsModule {

    /* JADX INFO: renamed from: com.unity3d.services.core.di.UnityAdsModule$glInfoDataStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_GL_INFO);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.di.UnityAdsModule$provideByteStringDataStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22631 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $dataStoreFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22631(Context context, String str) {
            super(0);
            this.$context = context;
            this.$dataStoreFile = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, this.$dataStoreFile);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.di.UnityAdsModule$universalRequestDataStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22641 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22641(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.di.UnityAdsModule$webViewConfigurationDataStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22651 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22651(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
        }
    }

    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        dsl_create.setRetryWaitBase(500);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(2500);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(30000);
        dsl_create.setReadTimeoutMs(30000);
        dsl_create.setWriteTimeoutMs(30000);
        dsl_create.setOverallTimeoutMs(30000);
        return dsl_create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(Context context, AbstractC3899kk abstractC3899kk, String str) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, null, WD.a(abstractC3899kk.plus(AbstractC3375el.c())), new C22631(context, str), 4, null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize".toString());
        }
        Storage storage = StorageManager.getStorage(storageType);
        AbstractC2995aW.p(storage, "getStorage(storageType)");
        return storage;
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        AbstractC2995aW.p(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final AsyncTokenStorage asyncTokenStorage(TokenStorage tokenStorage, SDKMetricsSender sDKMetricsSender) {
        AbstractC2995aW.q(tokenStorage, "tokenStorage");
        AbstractC2995aW.q(sDKMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sDKMetricsSender, tokenStorage);
    }

    public final ByteStringDataSource auidDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final AbstractC3899kk defaultDispatcher() {
        return AbstractC4437qp.f4904a;
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        return dsl_create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(Context context, AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        return provideByteStringDataStore(context, abstractC3899kk, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final InterfaceC4514rk getTokenCoroutineScope(ISDKDispatchers iSDKDispatchers, InterfaceC4075mk interfaceC4075mk, InterfaceC5000xE interfaceC5000xE) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(interfaceC4075mk, "errorHandler");
        AbstractC2995aW.q(interfaceC5000xE, "parentJob");
        return WD.a(interfaceC5000xE.plus(iSDKDispatchers.getDefault()).plus(new C4251ok(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(interfaceC4075mk));
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(Context context, AbstractC3899kk abstractC3899kk, DataMigration<ByteStringStoreOuterClass.ByteStringStore> dataMigration) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        AbstractC2995aW.q(dataMigration, "fetchGLInfo");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, AbstractC2340Cl.J(dataMigration), WD.a(abstractC3899kk.plus(AbstractC3375el.c())), new AnonymousClass1(context), 2, null);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(Context context, AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        return provideByteStringDataStore(context, abstractC3899kk, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final ByteStringDataSource idfiDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final InterfaceC4514rk initCoroutineScope(ISDKDispatchers iSDKDispatchers, InterfaceC4075mk interfaceC4075mk, InterfaceC5000xE interfaceC5000xE) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(interfaceC4075mk, "errorHandler");
        AbstractC2995aW.q(interfaceC5000xE, "parentJob");
        return WD.a(interfaceC5000xE.plus(iSDKDispatchers.getDefault()).plus(new C4251ok(ServiceProvider.NAMED_INIT_SCOPE)).plus(interfaceC4075mk));
    }

    public final AbstractC3899kk ioDispatcher() {
        return AbstractC4437qp.b;
    }

    public final InterfaceC4514rk loadCoroutineScope(ISDKDispatchers iSDKDispatchers, InterfaceC4075mk interfaceC4075mk, InterfaceC5000xE interfaceC5000xE) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(interfaceC4075mk, "errorHandler");
        AbstractC2995aW.q(interfaceC5000xE, "parentJob");
        return WD.a(interfaceC5000xE.plus(iSDKDispatchers.getDefault()).plus(new C4251ok(ServiceProvider.NAMED_LOAD_SCOPE)).plus(interfaceC4075mk));
    }

    public final AbstractC3899kk mainDispatcher() {
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        return TL.f3768a;
    }

    public final MeasurementsService measurementService(Context context, ISDKDispatchers iSDKDispatchers) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        return new MeasurementsService(context, iSDKDispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(Context context, AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        return provideByteStringDataStore(context, abstractC3899kk, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final InterfaceC4514rk omidCoroutineScope(ISDKDispatchers iSDKDispatchers, InterfaceC4075mk interfaceC4075mk, InterfaceC5000xE interfaceC5000xE) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(interfaceC4075mk, "errorHandler");
        AbstractC2995aW.q(interfaceC5000xE, "parentJob");
        return WD.a(interfaceC5000xE.plus(iSDKDispatchers.getDefault()).plus(new C4251ok(ServiceProvider.NAMED_OMID_SCOPE)).plus(interfaceC4075mk));
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(Context context, AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        return provideByteStringDataStore(context, abstractC3899kk, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(Context context, AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        return provideByteStringDataStore(context, abstractC3899kk, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final InterfaceC5000xE publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        AbstractC2995aW.q(diagnosticEventRepository, "diagnosticEventRepository");
        CE ceA = AbstractC2995aW.a();
        ceA.p(new UnityAdsModule$publicApiJob$1$1(diagnosticEventRepository));
        return ceA;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final InterfaceC4514rk scarSignalsCoroutineScope(ISDKDispatchers iSDKDispatchers, InterfaceC4075mk interfaceC4075mk, InterfaceC5000xE interfaceC5000xE) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(interfaceC4075mk, "errorHandler");
        AbstractC2995aW.q(interfaceC5000xE, "parentJob");
        return WD.a(interfaceC5000xE.plus(iSDKDispatchers.getDefault()).plus(new C4251ok(ServiceProvider.NAMED_SCAR_SCOPE)).plus(interfaceC4075mk));
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        AbstractC2995aW.p(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    public final InterfaceC4514rk showCoroutineScope(ISDKDispatchers iSDKDispatchers, InterfaceC4075mk interfaceC4075mk, InterfaceC5000xE interfaceC5000xE) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(interfaceC4075mk, "errorHandler");
        AbstractC2995aW.q(interfaceC5000xE, "parentJob");
        return WD.a(interfaceC5000xE.plus(iSDKDispatchers.getDefault()).plus(new C4251ok(ServiceProvider.NAMED_SHOW_SCOPE)).plus(interfaceC4075mk));
    }

    public final TopicsService topicsService(Context context, ISDKDispatchers iSDKDispatchers) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        return new TopicsService(context, iSDKDispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final InterfaceC4514rk transactionCoroutineScope(ISDKDispatchers iSDKDispatchers, InterfaceC4075mk interfaceC4075mk, InterfaceC5000xE interfaceC5000xE) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(interfaceC4075mk, "errorHandler");
        AbstractC2995aW.q(interfaceC5000xE, "parentJob");
        return WD.a(interfaceC5000xE.plus(iSDKDispatchers.getDefault()).plus(new C4251ok(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(interfaceC4075mk));
    }

    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestDataStore(Context context, AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new UniversalRequestStoreSerializer(), null, null, WD.a(abstractC3899kk.plus(AbstractC3375el.c())), new C22641(context), 4, null);
    }

    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        AbstractC2995aW.q(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(Context context, AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new WebViewConfigurationStoreSerializer(), null, null, WD.a(abstractC3899kk.plus(AbstractC3375el.c())), new C22651(context), 4, null);
    }

    public final ByteStringDataSource iapTransactionDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyFsmDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource glInfoDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        AbstractC2995aW.q(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
