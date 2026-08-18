package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class UniversalRequestKt {
    public static final UniversalRequestKt INSTANCE = new UniversalRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest _build() {
            UniversalRequestOuterClass.UniversalRequest universalRequestBuild = this._builder.build();
            AbstractC2995aW.p(universalRequestBuild, "_builder.build()");
            return universalRequestBuild;
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            UniversalRequestOuterClass.UniversalRequest.Payload payload = this._builder.getPayload();
            AbstractC2995aW.p(payload, "_builder.getPayload()");
            return payload;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            AbstractC2995aW.p(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setPayload(UniversalRequestOuterClass.UniversalRequest.Payload payload) {
            AbstractC2995aW.q(payload, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPayload(payload);
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            AbstractC2995aW.q(sharedData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSharedData(sharedData);
        }

        private Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }
    }

    public static final class PayloadKt {
        public static final PayloadKt INSTANCE = new PayloadKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    AbstractC2995aW.q(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, AbstractC2471Hm abstractC2471Hm) {
                this(builder);
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                UniversalRequestOuterClass.UniversalRequest.Payload payloadBuild = this._builder.build();
                AbstractC2995aW.p(payloadBuild, "_builder.build()");
                return payloadBuild;
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            public final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = this._builder.getAdDataRefreshRequest();
                AbstractC2995aW.p(adDataRefreshRequest, "_builder.getAdDataRefreshRequest()");
                return adDataRefreshRequest;
            }

            public final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = this._builder.getAdPlayerConfigRequest();
                AbstractC2995aW.p(adPlayerConfigRequest, "_builder.getAdPlayerConfigRequest()");
                return adPlayerConfigRequest;
            }

            public final AdRequestOuterClass.AdRequest getAdRequest() {
                AdRequestOuterClass.AdRequest adRequest = this._builder.getAdRequest();
                AbstractC2995aW.p(adRequest, "_builder.getAdRequest()");
                return adRequest;
            }

            public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = this._builder.getDiagnosticEventRequest();
                AbstractC2995aW.p(diagnosticEventRequest, "_builder.getDiagnosticEventRequest()");
                return diagnosticEventRequest;
            }

            public final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = this._builder.getGetTokenEventRequest();
                AbstractC2995aW.p(getTokenEventRequest, "_builder.getGetTokenEventRequest()");
                return getTokenEventRequest;
            }

            public final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest = this._builder.getInitializationCompletedEventRequest();
                AbstractC2995aW.p(initializationCompletedEventRequest, "_builder.getInitializationCompletedEventRequest()");
                return initializationCompletedEventRequest;
            }

            public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
                AbstractC2995aW.p(initializationRequest, "_builder.getInitializationRequest()");
                return initializationRequest;
            }

            public final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEvent = this._builder.getOperativeEvent();
                AbstractC2995aW.p(operativeEvent, "_builder.getOperativeEvent()");
                return operativeEvent;
            }

            public final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = this._builder.getPrivacyUpdateRequest();
                AbstractC2995aW.p(privacyUpdateRequest, "_builder.getPrivacyUpdateRequest()");
                return privacyUpdateRequest;
            }

            public final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = this._builder.getTransactionEventRequest();
                AbstractC2995aW.p(transactionEventRequest, "_builder.getTransactionEventRequest()");
                return transactionEventRequest;
            }

            public final UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueCase = this._builder.getValueCase();
                AbstractC2995aW.p(valueCase, "_builder.getValueCase()");
                return valueCase;
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            public final void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                AbstractC2995aW.q(adDataRefreshRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAdDataRefreshRequest(adDataRefreshRequest);
            }

            public final void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                AbstractC2995aW.q(adPlayerConfigRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAdPlayerConfigRequest(adPlayerConfigRequest);
            }

            public final void setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                AbstractC2995aW.q(adRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAdRequest(adRequest);
            }

            public final void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                AbstractC2995aW.q(diagnosticEventRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setDiagnosticEventRequest(diagnosticEventRequest);
            }

            public final void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                AbstractC2995aW.q(getTokenEventRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setGetTokenEventRequest(getTokenEventRequest);
            }

            public final void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                AbstractC2995aW.q(initializationCompletedEventRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setInitializationCompletedEventRequest(initializationCompletedEventRequest);
            }

            public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                AbstractC2995aW.q(initializationRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setInitializationRequest(initializationRequest);
            }

            public final void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                AbstractC2995aW.q(operativeEventRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setOperativeEvent(operativeEventRequest);
            }

            public final void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                AbstractC2995aW.q(privacyUpdateRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setPrivacyUpdateRequest(privacyUpdateRequest);
            }

            public final void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                AbstractC2995aW.q(transactionEventRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setTransactionEventRequest(transactionEventRequest);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }
        }

        private PayloadKt() {
        }
    }

    public static final class SharedDataKt {
        public static final SharedDataKt INSTANCE = new SharedDataKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    AbstractC2995aW.q(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, AbstractC2471Hm abstractC2471Hm) {
                this(builder);
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                UniversalRequestOuterClass.UniversalRequest.SharedData sharedDataBuild = this._builder.build();
                AbstractC2995aW.p(sharedDataBuild, "_builder.build()");
                return sharedDataBuild;
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            public final Timestamp getAppStartTime() {
                Timestamp appStartTime = this._builder.getAppStartTime();
                AbstractC2995aW.p(appStartTime, "_builder.getAppStartTime()");
                return appStartTime;
            }

            public final ByteString getCurrentState() {
                ByteString currentState = this._builder.getCurrentState();
                AbstractC2995aW.p(currentState, "_builder.getCurrentState()");
                return currentState;
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this._builder.getDeveloperConsent();
                AbstractC2995aW.p(developerConsent, "_builder.getDeveloperConsent()");
                return developerConsent;
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(Dsl dsl) {
                AbstractC2995aW.q(dsl, "<this>");
                return UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
                AbstractC2995aW.p(limitedSessionToken, "_builder.getLimitedSessionToken()");
                return limitedSessionToken;
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
                AbstractC2995aW.q(dsl, "<this>");
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }

            public final PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this._builder.getPii();
                AbstractC2995aW.p(pii, "_builder.getPii()");
                return pii;
            }

            public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
                AbstractC2995aW.q(dsl, "<this>");
                return UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            public final Timestamp getSdkStartTime() {
                Timestamp sdkStartTime = this._builder.getSdkStartTime();
                AbstractC2995aW.p(sdkStartTime, "_builder.getSdkStartTime()");
                return sdkStartTime;
            }

            public final ByteString getSessionToken() {
                ByteString sessionToken = this._builder.getSessionToken();
                AbstractC2995aW.p(sessionToken, "_builder.getSessionToken()");
                return sessionToken;
            }

            public final TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this._builder.getTestData();
                AbstractC2995aW.p(testData, "_builder.getTestData()");
                return testData;
            }

            public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
                AbstractC2995aW.q(dsl, "<this>");
                return UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            public final TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
                AbstractC2995aW.p(timestamps, "_builder.getTimestamps()");
                return timestamps;
            }

            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            public final void setAppStartTime(Timestamp timestamp) {
                AbstractC2995aW.q(timestamp, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAppStartTime(timestamp);
            }

            public final void setCurrentState(ByteString byteString) {
                AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setCurrentState(byteString);
            }

            public final void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                AbstractC2995aW.q(developerConsent, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setDeveloperConsent(developerConsent);
            }

            public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                AbstractC2995aW.q(limitedSessionToken, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setLimitedSessionToken(limitedSessionToken);
            }

            public final void setPii(PiiOuterClass.Pii pii) {
                AbstractC2995aW.q(pii, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setPii(pii);
            }

            public final void setSdkStartTime(Timestamp timestamp) {
                AbstractC2995aW.q(timestamp, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setSdkStartTime(timestamp);
            }

            public final void setSessionToken(ByteString byteString) {
                AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setSessionToken(byteString);
            }

            public final void setTestData(TestDataOuterClass.TestData testData) {
                AbstractC2995aW.q(testData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setTestData(testData);
            }

            public final void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                AbstractC2995aW.q(timestamps, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setTimestamps(timestamps);
            }

            public final void setWebviewVersion(int i) {
                this._builder.setWebviewVersion(i);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }
        }

        private SharedDataKt() {
        }
    }

    private UniversalRequestKt() {
    }

    /* JADX INFO: renamed from: -initializepayload, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.Payload m153initializepayload(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    /* JADX INFO: renamed from: -initializesharedData, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.SharedData m154initializesharedData(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        SharedDataKt.Dsl.Companion companion = SharedDataKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        SharedDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
