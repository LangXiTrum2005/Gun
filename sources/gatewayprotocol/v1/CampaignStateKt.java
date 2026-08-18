package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CampaignStateKt {
    public static final CampaignStateKt INSTANCE = new CampaignStateKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.CampaignState.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.CampaignState.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class LoadedCampaignsProxy extends DslProxy {
            private LoadedCampaignsProxy() {
            }
        }

        public static final class ShownCampaignsProxy extends DslProxy {
            private ShownCampaignsProxy() {
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.CampaignState.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.CampaignState _build() {
            CampaignStateOuterClass.CampaignState campaignStateBuild = this._builder.build();
            AbstractC2995aW.p(campaignStateBuild, "_builder.build()");
            return campaignStateBuild;
        }

        public final /* synthetic */ void addAllLoadedCampaigns(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllLoadedCampaigns(iterable);
        }

        public final /* synthetic */ void addAllShownCampaigns(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllShownCampaigns(iterable);
        }

        public final /* synthetic */ void addLoadedCampaigns(DslList dslList, CampaignStateOuterClass.Campaign campaign) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(campaign, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addLoadedCampaigns(campaign);
        }

        public final /* synthetic */ void addShownCampaigns(DslList dslList, CampaignStateOuterClass.Campaign campaign) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(campaign, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addShownCampaigns(campaign);
        }

        public final /* synthetic */ void clearLoadedCampaigns(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearLoadedCampaigns();
        }

        public final /* synthetic */ void clearShownCampaigns(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearShownCampaigns();
        }

        public final /* synthetic */ DslList getLoadedCampaigns() {
            List<CampaignStateOuterClass.Campaign> loadedCampaignsList = this._builder.getLoadedCampaignsList();
            AbstractC2995aW.p(loadedCampaignsList, "_builder.getLoadedCampaignsList()");
            return new DslList(loadedCampaignsList);
        }

        public final /* synthetic */ DslList getShownCampaigns() {
            List<CampaignStateOuterClass.Campaign> shownCampaignsList = this._builder.getShownCampaignsList();
            AbstractC2995aW.p(shownCampaignsList, "_builder.getShownCampaignsList()");
            return new DslList(shownCampaignsList);
        }

        public final /* synthetic */ void plusAssignAllLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllLoadedCampaigns(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllShownCampaigns(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, CampaignStateOuterClass.Campaign campaign) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(campaign, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addLoadedCampaigns(dslList, campaign);
        }

        public final /* synthetic */ void plusAssignShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, CampaignStateOuterClass.Campaign campaign) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(campaign, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addShownCampaigns(dslList, campaign);
        }

        public final /* synthetic */ void setLoadedCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign campaign) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(campaign, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setLoadedCampaigns(i, campaign);
        }

        public final /* synthetic */ void setShownCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign campaign) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(campaign, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setShownCampaigns(i, campaign);
        }

        private Dsl(CampaignStateOuterClass.CampaignState.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignStateKt() {
    }
}
