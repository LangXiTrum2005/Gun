package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDataRefreshResponseKt {
    public static final AdDataRefreshResponseKt INSTANCE = new AdDataRefreshResponseKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ AdDataRefreshResponseOuterClass.AdDataRefreshResponse _build() {
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponseBuild = this._builder.build();
            AbstractC2995aW.p(adDataRefreshResponseBuild, "_builder.build()");
            return adDataRefreshResponseBuild;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            AbstractC2995aW.p(adData, "_builder.getAdData()");
            return adData;
        }

        public final ByteString getAdDataRefreshToken() {
            ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
            AbstractC2995aW.p(adDataRefreshToken, "_builder.getAdDataRefreshToken()");
            return adDataRefreshToken;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            AbstractC2995aW.p(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return AdDataRefreshResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final ByteString getTrackingToken() {
            ByteString trackingToken = this._builder.getTrackingToken();
            AbstractC2995aW.p(trackingToken, "_builder.getTrackingToken()");
            return trackingToken;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setAdData(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdData(byteString);
        }

        public final void setAdDataRefreshToken(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdDataRefreshToken(byteString);
        }

        public final void setAdDataVersion(int i) {
            this._builder.setAdDataVersion(i);
        }

        public final void setError(ErrorOuterClass.Error error) {
            AbstractC2995aW.q(error, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setError(error);
        }

        public final void setTrackingToken(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTrackingToken(byteString);
        }

        private Dsl(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private AdDataRefreshResponseKt() {
    }
}
