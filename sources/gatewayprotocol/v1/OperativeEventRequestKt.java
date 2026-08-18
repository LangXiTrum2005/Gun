package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class OperativeEventRequestKt {
    public static final OperativeEventRequestKt INSTANCE = new OperativeEventRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final OperativeEventRequestOuterClass.OperativeEventRequest.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ OperativeEventRequestOuterClass.OperativeEventRequest _build() {
            OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequestBuild = this._builder.build();
            AbstractC2995aW.p(operativeEventRequestBuild, "_builder.build()");
            return operativeEventRequestBuild;
        }

        public final void clearAdditionalData() {
            this._builder.clearAdditionalData();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSid() {
            this._builder.clearSid();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final ByteString getAdditionalData() {
            ByteString additionalData = this._builder.getAdditionalData();
            AbstractC2995aW.p(additionalData, "_builder.getAdditionalData()");
            return additionalData;
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

        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            AbstractC2995aW.p(eventId, "_builder.getEventId()");
            return eventId;
        }

        public final OperativeEventRequestOuterClass.OperativeEventType getEventType() {
            OperativeEventRequestOuterClass.OperativeEventType eventType = this._builder.getEventType();
            AbstractC2995aW.p(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            AbstractC2995aW.p(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            AbstractC2995aW.p(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final String getSid() {
            String sid = this._builder.getSid();
            AbstractC2995aW.p(sid, "_builder.getSid()");
            return sid;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            AbstractC2995aW.p(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final ByteString getTrackingToken() {
            ByteString trackingToken = this._builder.getTrackingToken();
            AbstractC2995aW.p(trackingToken, "_builder.getTrackingToken()");
            return trackingToken;
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

        public final void setAdditionalData(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdditionalData(byteString);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            AbstractC2995aW.q(campaignState, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCampaignState(campaignState);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            AbstractC2995aW.q(dynamicDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setEventId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setEventId(byteString);
        }

        public final void setEventType(OperativeEventRequestOuterClass.OperativeEventType operativeEventType) {
            AbstractC2995aW.q(operativeEventType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setEventType(operativeEventType);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            AbstractC2995aW.q(sessionCounters, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setSid(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSid(str);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            AbstractC2995aW.q(staticDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        public final void setTrackingToken(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTrackingToken(byteString);
        }

        private Dsl(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private OperativeEventRequestKt() {
    }
}
