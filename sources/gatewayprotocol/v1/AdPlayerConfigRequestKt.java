package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AdPlayerConfigRequestKt {
    public static final AdPlayerConfigRequestKt INSTANCE = new AdPlayerConfigRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build() {
            AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequestBuild = this._builder.build();
            AbstractC2995aW.p(adPlayerConfigRequestBuild, "_builder.build()");
            return adPlayerConfigRequestBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final InitializationResponseOuterClass.AdFormat getAdFormat() {
            InitializationResponseOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            AbstractC2995aW.p(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            AbstractC2995aW.p(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            AbstractC2995aW.p(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            AbstractC2995aW.p(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        public final void setAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
            AbstractC2995aW.q(adFormat, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdFormat(adFormat);
        }

        public final void setConfigurationToken(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setConfigurationToken(byteString);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setPlacementId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPlacementId(str);
        }

        public final void setWebviewVersion(int i) {
            this._builder.setWebviewVersion(i);
        }

        private Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdPlayerConfigRequestKt() {
    }
}
