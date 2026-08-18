package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationDataKt {
    public static final InitializationDataKt INSTANCE = new InitializationDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationDataOuterClass.InitializationData.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationDataOuterClass.InitializationData.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(InitializationDataOuterClass.InitializationData.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ InitializationDataOuterClass.InitializationData _build() {
            InitializationDataOuterClass.InitializationData initializationDataBuild = this._builder.build();
            AbstractC2995aW.p(initializationDataBuild, "_builder.build()");
            return initializationDataBuild;
        }

        public final void clearInitializationRequest() {
            this._builder.clearInitializationRequest();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
            AbstractC2995aW.p(initializationRequest, "_builder.getInitializationRequest()");
            return initializationRequest;
        }

        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return InitializationDataKtKt.getInitializationRequestOrNull(dsl._builder);
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            AbstractC2995aW.p(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return InitializationDataKtKt.getSharedDataOrNull(dsl._builder);
        }

        public final boolean hasInitializationRequest() {
            return this._builder.hasInitializationRequest();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            AbstractC2995aW.q(initializationRequest, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setInitializationRequest(initializationRequest);
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            AbstractC2995aW.q(sharedData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSharedData(sharedData);
        }

        private Dsl(InitializationDataOuterClass.InitializationData.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationDataKt() {
    }
}
