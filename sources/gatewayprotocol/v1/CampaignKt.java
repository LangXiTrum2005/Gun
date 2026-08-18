package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class CampaignKt {
    public static final CampaignKt INSTANCE = new CampaignKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            CampaignStateOuterClass.Campaign campaignBuild = this._builder.build();
            AbstractC2995aW.p(campaignBuild, "_builder.build()");
            return campaignBuild;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            AbstractC2995aW.p(data, "_builder.getData()");
            return data;
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            AbstractC2995aW.p(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            AbstractC2995aW.p(loadTimestamp, "_builder.getLoadTimestamp()");
            return loadTimestamp;
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            AbstractC2995aW.p(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            AbstractC2995aW.p(showTimestamp, "_builder.getShowTimestamp()");
            return showTimestamp;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        public final void setData(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setData(byteString);
        }

        public final void setDataVersion(int i) {
            this._builder.setDataVersion(i);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setLoadTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            AbstractC2995aW.q(timestamps, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setLoadTimestamp(timestamps);
        }

        public final void setPlacementId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPlacementId(str);
        }

        public final void setShowTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            AbstractC2995aW.q(timestamps, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setShowTimestamp(timestamps);
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignKt() {
    }
}
