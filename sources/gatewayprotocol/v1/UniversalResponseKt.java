package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class UniversalResponseKt {
    public static final UniversalResponseKt INSTANCE = new UniversalResponseKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalResponseOuterClass.UniversalResponse.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalResponseOuterClass.UniversalResponse.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(UniversalResponseOuterClass.UniversalResponse.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ UniversalResponseOuterClass.UniversalResponse _build() {
            UniversalResponseOuterClass.UniversalResponse universalResponseBuild = this._builder.build();
            AbstractC2995aW.p(universalResponseBuild, "_builder.build()");
            return universalResponseBuild;
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearMutableData() {
            this._builder.clearMutableData();
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            AbstractC2995aW.p(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return UniversalResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final MutableDataOuterClass.MutableData getMutableData() {
            MutableDataOuterClass.MutableData mutableData = this._builder.getMutableData();
            AbstractC2995aW.p(mutableData, "_builder.getMutableData()");
            return mutableData;
        }

        public final MutableDataOuterClass.MutableData getMutableDataOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return UniversalResponseKtKt.getMutableDataOrNull(dsl._builder);
        }

        public final UniversalResponseOuterClass.UniversalResponse.Payload getPayload() {
            UniversalResponseOuterClass.UniversalResponse.Payload payload = this._builder.getPayload();
            AbstractC2995aW.p(payload, "_builder.getPayload()");
            return payload;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasMutableData() {
            return this._builder.hasMutableData();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final void setError(ErrorOuterClass.Error error) {
            AbstractC2995aW.q(error, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setError(error);
        }

        public final void setMutableData(MutableDataOuterClass.MutableData mutableData) {
            AbstractC2995aW.q(mutableData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setMutableData(mutableData);
        }

        public final void setPayload(UniversalResponseOuterClass.UniversalResponse.Payload payload) {
            AbstractC2995aW.q(payload, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPayload(payload);
        }

        private Dsl(UniversalResponseOuterClass.UniversalResponse.Builder builder) {
            this._builder = builder;
        }
    }

    public static final class PayloadKt {
        public static final PayloadKt INSTANCE = new PayloadKt();

        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalResponseOuterClass.UniversalResponse.Payload.Builder _builder;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                    AbstractC2995aW.q(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public /* synthetic */ Dsl(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder, AbstractC2471Hm abstractC2471Hm) {
                this(builder);
            }

            public final /* synthetic */ UniversalResponseOuterClass.UniversalResponse.Payload _build() {
                UniversalResponseOuterClass.UniversalResponse.Payload payloadBuild = this._builder.build();
                AbstractC2995aW.p(payloadBuild, "_builder.build()");
                return payloadBuild;
            }

            public final void clearAdDataRefreshResponse() {
                this._builder.clearAdDataRefreshResponse();
            }

            public final void clearAdPlayerConfigResponse() {
                this._builder.clearAdPlayerConfigResponse();
            }

            public final void clearAdResponse() {
                this._builder.clearAdResponse();
            }

            public final void clearInitializationResponse() {
                this._builder.clearInitializationResponse();
            }

            public final void clearPrivacyUpdateResponse() {
                this._builder.clearPrivacyUpdateResponse();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            public final AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = this._builder.getAdDataRefreshResponse();
                AbstractC2995aW.p(adDataRefreshResponse, "_builder.getAdDataRefreshResponse()");
                return adDataRefreshResponse;
            }

            public final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = this._builder.getAdPlayerConfigResponse();
                AbstractC2995aW.p(adPlayerConfigResponse, "_builder.getAdPlayerConfigResponse()");
                return adPlayerConfigResponse;
            }

            public final AdResponseOuterClass.AdResponse getAdResponse() {
                AdResponseOuterClass.AdResponse adResponse = this._builder.getAdResponse();
                AbstractC2995aW.p(adResponse, "_builder.getAdResponse()");
                return adResponse;
            }

            public final InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                InitializationResponseOuterClass.InitializationResponse initializationResponse = this._builder.getInitializationResponse();
                AbstractC2995aW.p(initializationResponse, "_builder.getInitializationResponse()");
                return initializationResponse;
            }

            public final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = this._builder.getPrivacyUpdateResponse();
                AbstractC2995aW.p(privacyUpdateResponse, "_builder.getPrivacyUpdateResponse()");
                return privacyUpdateResponse;
            }

            public final UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase getValueCase() {
                UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase valueCase = this._builder.getValueCase();
                AbstractC2995aW.p(valueCase, "_builder.getValueCase()");
                return valueCase;
            }

            public final boolean hasAdDataRefreshResponse() {
                return this._builder.hasAdDataRefreshResponse();
            }

            public final boolean hasAdPlayerConfigResponse() {
                return this._builder.hasAdPlayerConfigResponse();
            }

            public final boolean hasAdResponse() {
                return this._builder.hasAdResponse();
            }

            public final boolean hasInitializationResponse() {
                return this._builder.hasInitializationResponse();
            }

            public final boolean hasPrivacyUpdateResponse() {
                return this._builder.hasPrivacyUpdateResponse();
            }

            public final void setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                AbstractC2995aW.q(adDataRefreshResponse, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAdDataRefreshResponse(adDataRefreshResponse);
            }

            public final void setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                AbstractC2995aW.q(adPlayerConfigResponse, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAdPlayerConfigResponse(adPlayerConfigResponse);
            }

            public final void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                AbstractC2995aW.q(adResponse, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setAdResponse(adResponse);
            }

            public final void setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                AbstractC2995aW.q(initializationResponse, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setInitializationResponse(initializationResponse);
            }

            public final void setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                AbstractC2995aW.q(privacyUpdateResponse, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this._builder.setPrivacyUpdateResponse(privacyUpdateResponse);
            }

            private Dsl(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                this._builder = builder;
            }
        }

        private PayloadKt() {
        }
    }

    private UniversalResponseKt() {
    }

    /* JADX INFO: renamed from: -initializepayload, reason: not valid java name */
    public final UniversalResponseOuterClass.UniversalResponse.Payload m156initializepayload(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.Companion;
        UniversalResponseOuterClass.UniversalResponse.Payload.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.Payload.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
