package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class HeaderBiddingTokenKt {
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingTokenBuild = this._builder.build();
            AbstractC2995aW.p(headerBiddingTokenBuild, "_builder.build()");
            return headerBiddingTokenBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
        }

        public final InitializationResponseOuterClass.AdFormat getAdFormat() {
            InitializationResponseOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            AbstractC2995aW.p(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            AbstractC2995aW.p(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            AbstractC2995aW.p(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            AbstractC2995aW.p(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final InitializationDataOuterClass.InitializationData getInitializationData() {
            InitializationDataOuterClass.InitializationData initializationData = this._builder.getInitializationData();
            AbstractC2995aW.p(initializationData, "_builder.getInitializationData()");
            return initializationData;
        }

        public final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(dsl._builder);
        }

        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
            AbstractC2995aW.p(limitedSessionToken, "_builder.getLimitedSessionToken()");
            return limitedSessionToken;
        }

        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(dsl._builder);
        }

        public final PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this._builder.getPii();
            AbstractC2995aW.p(pii, "_builder.getPii()");
            return pii;
        }

        public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            AbstractC2995aW.p(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            AbstractC2995aW.p(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
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

        public final TestDataOuterClass.TestData getTestData() {
            TestDataOuterClass.TestData testData = this._builder.getTestData();
            AbstractC2995aW.p(testData, "_builder.getTestData()");
            return testData;
        }

        public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTestDataOrNull(dsl._builder);
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            AbstractC2995aW.p(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = this._builder.getTokenCounters();
            AbstractC2995aW.p(tokenCounters, "_builder.getTokenCounters()");
            return tokenCounters;
        }

        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(dsl._builder);
        }

        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            AbstractC2995aW.p(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
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

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
        }

        public final void setAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
            AbstractC2995aW.q(adFormat, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdFormat(adFormat);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            AbstractC2995aW.q(campaignState, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCampaignState(campaignState);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            AbstractC2995aW.q(clientInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setClientInfo(clientInfo);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            AbstractC2995aW.q(dynamicDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setInitializationData(InitializationDataOuterClass.InitializationData initializationData) {
            AbstractC2995aW.q(initializationData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setInitializationData(initializationData);
        }

        public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            AbstractC2995aW.q(limitedSessionToken, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setLimitedSessionToken(limitedSessionToken);
        }

        public final void setPii(PiiOuterClass.Pii pii) {
            AbstractC2995aW.q(pii, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPii(pii);
        }

        public final void setScarSignalsCollected(boolean z) {
            this._builder.setScarSignalsCollected(z);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            AbstractC2995aW.q(sessionCounters, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setSessionToken(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSessionToken(byteString);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            AbstractC2995aW.q(staticDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        public final void setTcf(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTcf(byteString);
        }

        public final void setTestData(TestDataOuterClass.TestData testData) {
            AbstractC2995aW.q(testData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTestData(testData);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            AbstractC2995aW.q(timestamps, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTimestamps(timestamps);
        }

        public final void setTokenCounters(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters) {
            AbstractC2995aW.q(tokenCounters, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTokenCounters(tokenCounters);
        }

        public final void setTokenId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTokenId(byteString);
        }

        public final void setTokenNumber(int i) {
            this._builder.setTokenNumber(i);
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }
    }

    private HeaderBiddingTokenKt() {
    }
}
