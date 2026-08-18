package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class GetTokenEventRequestKt {
    public static final GetTokenEventRequestKt INSTANCE = new GetTokenEventRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequestBuild = this._builder.build();
            AbstractC2995aW.p(getTokenEventRequestBuild, "_builder.build()");
            return getTokenEventRequestBuild;
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final ByteString getBanner() {
            ByteString banner = this._builder.getBanner();
            AbstractC2995aW.p(banner, "_builder.getBanner()");
            return banner;
        }

        public final ByteString getInterstitial() {
            ByteString interstitial = this._builder.getInterstitial();
            AbstractC2995aW.p(interstitial, "_builder.getInterstitial()");
            return interstitial;
        }

        public final ByteString getRewarded() {
            ByteString rewarded = this._builder.getRewarded();
            AbstractC2995aW.p(rewarded, "_builder.getRewarded()");
            return rewarded;
        }

        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            AbstractC2995aW.p(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        public final void setBanner(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setBanner(byteString);
        }

        public final void setInterstitial(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setInterstitial(byteString);
        }

        public final void setRewarded(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setRewarded(byteString);
        }

        public final void setTokenId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTokenId(byteString);
        }

        private Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private GetTokenEventRequestKt() {
    }
}
