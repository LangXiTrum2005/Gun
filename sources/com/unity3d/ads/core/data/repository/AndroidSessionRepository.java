package com.unity3d.ads.core.data.repository;

import com.badlogic.gdx.Input;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4637t60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3654hw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4549s60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidSessionRepository implements SessionRepository {
    private final InterfaceC4309pQ _currentState;
    private InterfaceC4309pQ _gameId;
    private final InterfaceC4309pQ _gatewayUrl;
    private final InterfaceC4309pQ _headerBiddingTokenCounter;
    private final InterfaceC4309pQ _initializationState;
    private final InterfaceC4309pQ _isFirstInitAttempt;
    private final InterfaceC4309pQ _isTestModeEnabled;
    private InterfaceC4221oQ _onChange;
    private final InterfaceC4309pQ _sdkConfiguration;
    private final InterfaceC4309pQ _sessionCounters;
    private final InterfaceC4309pQ _sessionId;
    private final InterfaceC4309pQ _sessionToken;
    private final InterfaceC4309pQ _shouldInitialize;
    private final InterfaceC4309pQ _tokenCounters;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    private final InterfaceC4309pQ isInit;
    private final ByteStringDataSource nativeConfigDataSource;
    private final InterfaceC4286p60 onChange;
    private final InterfaceC4443qv persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;
    private final List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {42}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    InterfaceC4309pQ interfaceC4309pQ = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration from = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    AbstractC2995aW.p(from, "parseFrom(data)");
                    ((C4907w90) interfaceC4309pQ).i(from);
                }
            } catch (Exception e) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, AbstractC3375el.O(new C4839vT("debugReason", message)), null, null, 26, null);
            }
            ((C4907w90) AndroidSessionRepository.this.isInit).i(Boolean.TRUE);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Input.Keys.F20}, m = "getGatewayCache")
    public static final class C22021 extends AbstractC2883Xj {
        int label;
        /* synthetic */ Object result;

        public C22021(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Input.Keys.F23}, m = "getPrivacy")
    public static final class C22031 extends AbstractC2883Xj {
        int label;
        /* synthetic */ Object result;

        public C22031(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {199}, m = "getPrivacyFsm")
    public static final class C22041 extends AbstractC2883Xj {
        int label;
        /* synthetic */ Object result;

        public C22041(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {195, 196}, m = "setPrivacy")
    public static final class C22051 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C22051(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {201, 202}, m = "setPrivacyFsm")
    public static final class C22061 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C22061(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    public AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, AbstractC3899kk abstractC3899kk, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(byteStringDataSource, "gatewayCacheDataSource");
        AbstractC2995aW.q(byteStringDataSource2, "privacyDataSource");
        AbstractC2995aW.q(byteStringDataSource3, "fsmDataSource");
        AbstractC2995aW.q(byteStringDataSource4, "nativeConfigDataSource");
        AbstractC2995aW.q(nativeConfiguration, "defaultNativeConfiguration");
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = byteStringDataSource;
        this.privacyDataSource = byteStringDataSource2;
        this.fsmDataSource = byteStringDataSource3;
        this.nativeConfigDataSource = byteStringDataSource4;
        C4907w90 c4907w90A = AbstractC4995x90.a(nativeConfiguration);
        this._sdkConfiguration = c4907w90A;
        C4907w90 c4907w90A2 = AbstractC4995x90.a(Boolean.FALSE);
        this.isInit = c4907w90A2;
        WD.D(WD.a(abstractC3899kk), null, 0, new AnonymousClass1(sendDiagnosticEvent, null), 3);
        final C3654hw c3654hw = new C3654hw(c4907w90A, c4907w90A2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final InterfaceC4443qv interfaceC4443qv = new InterfaceC4443qv() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends AbstractC2883Xj {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
                        super(interfaceC2857Wj);
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC4530rv interfaceC4530rv) {
                    this.$this_unsafeFlow = interfaceC4530rv;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
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
                    Object obj2 = anonymousClass1.result;
                    EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        AbstractC3375el.b0(obj2);
                        InterfaceC4530rv interfaceC4530rv = this.$this_unsafeFlow;
                        if (((Boolean) ((C4839vT) obj).b).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (interfaceC4530rv.emit(obj, anonymousClass1) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj2);
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = c3654hw.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        this.persistedNativeConfiguration = new InterfaceC4443qv() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC4530rv interfaceC4530rv) {
                    this.$this_unsafeFlow = interfaceC4530rv;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
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
                    Object obj2 = anonymousClass1.result;
                    EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        AbstractC3375el.b0(obj2);
                        InterfaceC4530rv interfaceC4530rv = this.$this_unsafeFlow;
                        Object obj3 = ((C4839vT) obj).f5132a;
                        anonymousClass1.label = 1;
                        if (interfaceC4530rv.emit(obj3, anonymousClass1) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj2);
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = interfaceC4443qv.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        this.scarEligibleFormats = new ArrayList();
        C4549s60 c4549s60B = AbstractC4637t60.b(0, 7);
        this._onChange = c4549s60B;
        this.onChange = new BX(c4549s60B);
        String gameId = ClientProperties.getGameId();
        this._gameId = AbstractC4995x90.a(gameId != null ? gameId : null);
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC2995aW.p(uuidRandomUUID, "randomUUID()");
        this._sessionId = AbstractC4995x90.a(ProtobufExtensionsKt.toByteString(uuidRandomUUID));
        this._isTestModeEnabled = AbstractC4995x90.a(Boolean.valueOf(SdkProperties.isTestMode()));
        SessionCountersOuterClass.SessionCounters sessionCountersBuild = SessionCountersOuterClass.SessionCounters.newBuilder().build();
        AbstractC2995aW.p(sessionCountersBuild, "newBuilder().build()");
        this._sessionCounters = AbstractC4995x90.a(sessionCountersBuild);
        this._tokenCounters = AbstractC4995x90.a(new TokenCounters(0, 0, 0));
        ByteString byteString = ByteString.EMPTY;
        AbstractC2995aW.p(byteString, "EMPTY");
        this._sessionToken = AbstractC4995x90.a(byteString);
        this._currentState = AbstractC4995x90.a(byteString);
        this._gatewayUrl = AbstractC4995x90.a(UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = AbstractC4995x90.a(InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = AbstractC4995x90.a(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = AbstractC4995x90.a(bool);
        this._isFirstInitAttempt = AbstractC4995x90.a(bool);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        AbstractC2995aW.p(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGameId() {
        C4907w90 c4907w90;
        Object value;
        String gameId;
        InterfaceC4309pQ interfaceC4309pQ = this._gameId;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!c4907w90.h(value, gameId));
        return gameId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getGatewayCache(InterfaceC2857Wj interfaceC2857Wj) {
        C22021 c22021;
        if (interfaceC2857Wj instanceof C22021) {
            c22021 = (C22021) interfaceC2857Wj;
            int i = c22021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22021.label = i - Integer.MIN_VALUE;
            } else {
                c22021 = new C22021(interfaceC2857Wj);
            }
        } else {
            c22021 = new C22021(interfaceC2857Wj);
        }
        Object obj = c22021.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c22021.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            ByteStringDataSource byteStringDataSource = this.gatewayCacheDataSource;
            c22021.label = 1;
            obj = byteStringDataSource.get(c22021);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        AbstractC2995aW.p(data, "gatewayCacheDataSource.get().data");
        return data;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getGatewayState() {
        return (ByteString) ((C4907w90) this._currentState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGatewayUrl() {
        return (String) ((C4907w90) this._gatewayUrl).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        C4907w90 c4907w90;
        Object value;
        Number number;
        InterfaceC4309pQ interfaceC4309pQ = this._headerBiddingTokenCounter;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            number = (Number) value;
        } while (!c4907w90.h(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationState getInitializationState() {
        return (InitializationState) ((C4907w90) this._initializationState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        if (((Boolean) ((C4907w90) this.isInit).getValue()).booleanValue()) {
            return (NativeConfigurationOuterClass.NativeConfiguration) ((C4907w90) this._sdkConfiguration).getValue();
        }
        return (NativeConfigurationOuterClass.NativeConfiguration) WD.R(C2734Rq.f3684a, new AndroidSessionRepository$nativeConfiguration$1(this, null));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InterfaceC4443qv getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InterfaceC4286p60 getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getPrivacy(InterfaceC2857Wj interfaceC2857Wj) {
        C22031 c22031;
        if (interfaceC2857Wj instanceof C22031) {
            c22031 = (C22031) interfaceC2857Wj;
            int i = c22031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22031.label = i - Integer.MIN_VALUE;
            } else {
                c22031 = new C22031(interfaceC2857Wj);
            }
        } else {
            c22031 = new C22031(interfaceC2857Wj);
        }
        Object obj = c22031.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c22031.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            ByteStringDataSource byteStringDataSource = this.privacyDataSource;
            c22031.label = 1;
            obj = byteStringDataSource.get(c22031);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        AbstractC2995aW.p(data, "privacyDataSource.get().data");
        return data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getPrivacyFsm(InterfaceC2857Wj interfaceC2857Wj) {
        C22041 c22041;
        if (interfaceC2857Wj instanceof C22041) {
            c22041 = (C22041) interfaceC2857Wj;
            int i = c22041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22041.label = i - Integer.MIN_VALUE;
            } else {
                c22041 = new C22041(interfaceC2857Wj);
            }
        } else {
            c22041 = new C22041(interfaceC2857Wj);
        }
        Object obj = c22041.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c22041.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            ByteStringDataSource byteStringDataSource = this.fsmDataSource;
            c22041.label = 1;
            obj = byteStringDataSource.get(c22041);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        AbstractC2995aW.p(data, "fsmDataSource.get().data");
        return data;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public List<InitializationResponseOuterClass.AdFormat> getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) ((C4907w90) this._sessionCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionId() {
        return (ByteString) ((C4907w90) this._sessionId).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionToken() {
        return (ByteString) ((C4907w90) this._sessionToken).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean) ((C4907w90) this._shouldInitialize).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public TokenCounters getTokenCounters() {
        return (TokenCounters) ((C4907w90) this._tokenCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        C4907w90 c4907w90;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC4309pQ interfaceC4309pQ = this._sessionCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC2995aW.p(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerImpressions(dsl_create.getBannerImpressions() + 1);
        } while (!c4907w90.h(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        C4907w90 c4907w90;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC4309pQ interfaceC4309pQ = this._sessionCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC2995aW.p(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerRequestsAdm(dsl_create.getBannerRequestsAdm() + 1);
        } while (!c4907w90.h(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        C4907w90 c4907w90;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC4309pQ interfaceC4309pQ = this._sessionCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC2995aW.p(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerLoadRequests(dsl_create.getBannerLoadRequests() + 1);
        } while (!c4907w90.h(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        C4907w90 c4907w90;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC4309pQ interfaceC4309pQ = this._sessionCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC2995aW.p(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequestsAdm(dsl_create.getLoadRequestsAdm() + 1);
        } while (!c4907w90.h(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        C4907w90 c4907w90;
        Object value;
        SessionCountersKt.Dsl dsl_create;
        InterfaceC4309pQ interfaceC4309pQ = this._sessionCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            AbstractC2995aW.p(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequests(dsl_create.getLoadRequests() + 1);
        } while (!c4907w90.h(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        C4907w90 c4907w90;
        Object value;
        TokenCounters tokenCounters;
        InterfaceC4309pQ interfaceC4309pQ = this._tokenCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!c4907w90.h(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        C4907w90 c4907w90;
        Object value;
        TokenCounters tokenCounters;
        InterfaceC4309pQ interfaceC4309pQ = this._tokenCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!c4907w90.h(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        C4907w90 c4907w90;
        Object value;
        TokenCounters tokenCounters;
        InterfaceC4309pQ interfaceC4309pQ = this._tokenCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!c4907w90.h(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        C4907w90 c4907w90;
        Object value;
        Boolean bool;
        InterfaceC4309pQ interfaceC4309pQ = this._isFirstInitAttempt;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!c4907w90.h(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        C4907w90 c4907w90;
        Object value;
        boolean zIsTestMode;
        InterfaceC4309pQ interfaceC4309pQ = this._isTestModeEnabled;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            ((Boolean) value).getClass();
            zIsTestMode = SdkProperties.isTestMode();
        } while (!c4907w90.h(value, Boolean.valueOf(zIsTestMode)));
        return zIsTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object persistNativeConfiguration(InterfaceC2857Wj interfaceC2857Wj) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        AbstractC2995aW.p(byteString, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(byteString, interfaceC2857Wj);
        return obj == EnumC4602sk.f4993a ? obj : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        C4907w90 c4907w90;
        Object value;
        InterfaceC4309pQ interfaceC4309pQ = this._tokenCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, new TokenCounters(0, 0, 0)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(String str) {
        C4907w90 c4907w90;
        Object value;
        InterfaceC4309pQ interfaceC4309pQ = this._gameId;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            ClientProperties.setGameId(str);
        } while (!c4907w90.h(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setGatewayCache(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        Object obj = this.gatewayCacheDataSource.set(byteString, interfaceC2857Wj);
        return obj == EnumC4602sk.f4993a ? obj : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(ByteString byteString) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4309pQ interfaceC4309pQ = this._currentState;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(String str) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4309pQ interfaceC4309pQ = this._gatewayUrl;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(InitializationState initializationState) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(initializationState, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4309pQ interfaceC4309pQ = this._initializationState;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, initializationState));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(nativeConfiguration, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4309pQ interfaceC4309pQ = this._sdkConfiguration;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, nativeConfiguration));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setPrivacy(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        C22051 c22051;
        AndroidSessionRepository androidSessionRepository;
        if (interfaceC2857Wj instanceof C22051) {
            c22051 = (C22051) interfaceC2857Wj;
            int i = c22051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22051.label = i - Integer.MIN_VALUE;
            } else {
                c22051 = new C22051(interfaceC2857Wj);
            }
        } else {
            c22051 = new C22051(interfaceC2857Wj);
        }
        Object obj = c22051.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c22051.label;
        if (i2 != 0) {
            if (i2 == 1) {
                byteString = (ByteString) c22051.L$1;
                androidSessionRepository = (AndroidSessionRepository) c22051.L$0;
                AbstractC3375el.b0(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        ByteStringDataSource byteStringDataSource = this.privacyDataSource;
        c22051.L$0 = this;
        c22051.L$1 = byteString;
        c22051.label = 1;
        if (byteStringDataSource.set(byteString, c22051) == enumC4602sk) {
            return enumC4602sk;
        }
        androidSessionRepository = this;
        InterfaceC4221oQ interfaceC4221oQ = androidSessionRepository._onChange;
        SessionChange.UserConsentChange userConsentChange = new SessionChange.UserConsentChange(byteString);
        c22051.L$0 = null;
        c22051.L$1 = null;
        c22051.label = 2;
        if (interfaceC4221oQ.emit(userConsentChange, c22051) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setPrivacyFsm(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        C22061 c22061;
        AndroidSessionRepository androidSessionRepository;
        if (interfaceC2857Wj instanceof C22061) {
            c22061 = (C22061) interfaceC2857Wj;
            int i = c22061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22061.label = i - Integer.MIN_VALUE;
            } else {
                c22061 = new C22061(interfaceC2857Wj);
            }
        } else {
            c22061 = new C22061(interfaceC2857Wj);
        }
        Object obj = c22061.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c22061.label;
        if (i2 != 0) {
            if (i2 == 1) {
                byteString = (ByteString) c22061.L$1;
                androidSessionRepository = (AndroidSessionRepository) c22061.L$0;
                AbstractC3375el.b0(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        ByteStringDataSource byteStringDataSource = this.fsmDataSource;
        c22061.L$0 = this;
        c22061.L$1 = byteString;
        c22061.label = 1;
        if (byteStringDataSource.set(byteString, c22061) == enumC4602sk) {
            return enumC4602sk;
        }
        androidSessionRepository = this;
        InterfaceC4221oQ interfaceC4221oQ = androidSessionRepository._onChange;
        SessionChange.PrivacyFsmChange privacyFsmChange = new SessionChange.PrivacyFsmChange(byteString);
        c22061.L$0 = null;
        c22061.L$1 = null;
        c22061.label = 2;
        if (interfaceC4221oQ.emit(privacyFsmChange, c22061) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(sessionCounters, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4309pQ interfaceC4309pQ = this._sessionCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, sessionCounters));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(ByteString byteString) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4309pQ interfaceC4309pQ = this._sessionToken;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        C4907w90 c4907w90;
        Object value;
        InterfaceC4309pQ interfaceC4309pQ = this._shouldInitialize;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            ((Boolean) value).getClass();
        } while (!c4907w90.h(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(TokenCounters tokenCounters) {
        C4907w90 c4907w90;
        Object value;
        AbstractC2995aW.q(tokenCounters, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC4309pQ interfaceC4309pQ = this._tokenCounters;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, tokenCounters));
    }
}
