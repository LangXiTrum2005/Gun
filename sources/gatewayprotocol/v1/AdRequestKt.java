package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AdRequestKt {
    public static final AdRequestKt INSTANCE = new AdRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdRequestOuterClass.AdRequest.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.AdRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(AdRequestOuterClass.AdRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ AdRequestOuterClass.AdRequest _build() {
            AdRequestOuterClass.AdRequest adRequestBuild = this._builder.build();
            AbstractC2995aW.p(adRequestBuild, "_builder.build()");
            return adRequestBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdRequestType() {
            this._builder.clearAdRequestType();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearRequestImpressionConfiguration() {
            this._builder.clearRequestImpressionConfiguration();
        }

        public final void clearScarSignal() {
            this._builder.clearScarSignal();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final InitializationResponseOuterClass.AdFormat getAdFormat() {
            InitializationResponseOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            AbstractC2995aW.p(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final AdRequestOuterClass.AdRequestType getAdRequestType() {
            AdRequestOuterClass.AdRequestType adRequestType = this._builder.getAdRequestType();
            AbstractC2995aW.p(adRequestType, "_builder.getAdRequestType()");
            return adRequestType;
        }

        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            AbstractC2995aW.p(bannerSize, "_builder.getBannerSize()");
            return bannerSize;
        }

        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return AdRequestKtKt.getBannerSizeOrNull(dsl._builder);
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            AbstractC2995aW.p(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            AbstractC2995aW.p(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
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

        public final boolean getRequestImpressionConfiguration() {
            return this._builder.getRequestImpressionConfiguration();
        }

        public final ByteString getScarSignal() {
            ByteString scarSignal = this._builder.getScarSignal();
            AbstractC2995aW.p(scarSignal, "_builder.getScarSignal()");
            return scarSignal;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            AbstractC2995aW.p(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            AbstractC2995aW.p(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            AbstractC2995aW.p(tcf, "_builder.getTcf()");
            return tcf;
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdRequestType() {
            return this._builder.hasAdRequestType();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        public final void setAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
            AbstractC2995aW.q(adFormat, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdRequestType(AdRequestOuterClass.AdRequestType adRequestType) {
            AbstractC2995aW.q(adRequestType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdRequestType(adRequestType);
        }

        public final void setBannerSize(AdRequestOuterClass.BannerSize bannerSize) {
            AbstractC2995aW.q(bannerSize, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setBannerSize(bannerSize);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            AbstractC2995aW.q(campaignState, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCampaignState(campaignState);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            AbstractC2995aW.q(dynamicDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setPlacementId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPlacementId(str);
        }

        public final void setRequestImpressionConfiguration(boolean z) {
            this._builder.setRequestImpressionConfiguration(z);
        }

        public final void setScarSignal(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setScarSignal(byteString);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            AbstractC2995aW.q(sessionCounters, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            AbstractC2995aW.q(staticDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        public final void setTcf(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTcf(byteString);
        }

        public final void setWebviewVersion(int i) {
            this._builder.setWebviewVersion(i);
        }

        private Dsl(AdRequestOuterClass.AdRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdRequestKt() {
    }
}
