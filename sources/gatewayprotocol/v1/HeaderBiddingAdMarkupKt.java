package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class HeaderBiddingAdMarkupKt {
    public static final HeaderBiddingAdMarkupKt INSTANCE = new HeaderBiddingAdMarkupKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup _build() {
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkupBuild = this._builder.build();
            AbstractC2995aW.p(headerBiddingAdMarkupBuild, "_builder.build()");
            return headerBiddingAdMarkupBuild;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            AbstractC2995aW.p(adData, "_builder.getAdData()");
            return adData;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            AbstractC2995aW.p(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final void setAdData(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdData(byteString);
        }

        public final void setAdDataVersion(int i) {
            this._builder.setAdDataVersion(i);
        }

        public final void setConfigurationToken(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setConfigurationToken(byteString);
        }

        private Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
            this._builder = builder;
        }
    }

    private HeaderBiddingAdMarkupKt() {
    }
}
