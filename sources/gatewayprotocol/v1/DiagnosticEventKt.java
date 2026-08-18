package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticEventKt {
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEventBuild = this._builder.build();
            AbstractC2995aW.p(diagnosticEventBuild, "_builder.build()");
            return diagnosticEventBuild;
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
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

        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            AbstractC2995aW.q(dslMap, "<this>");
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            AbstractC2995aW.q(dslMap, "<this>");
            this._builder.clearStringTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = this._builder.getAdType();
            AbstractC2995aW.p(adType, "_builder.getAdType()");
            return adType;
        }

        public final String getCustomEventType() {
            String customEventType = this._builder.getCustomEventType();
            AbstractC2995aW.p(customEventType, "_builder.getCustomEventType()");
            return customEventType;
        }

        public final int getEventId() {
            return this._builder.getEventId();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            DiagnosticEventRequestOuterClass.DiagnosticEventType eventType = this._builder.getEventType();
            AbstractC2995aW.p(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            AbstractC2995aW.p(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final /* synthetic */ DslMap getIntTagsMap() {
            Map<String, Integer> intTagsMap = this._builder.getIntTagsMap();
            AbstractC2995aW.p(intTagsMap, "_builder.getIntTagsMap()");
            return new DslMap(intTagsMap);
        }

        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            AbstractC2995aW.p(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final /* synthetic */ DslMap getStringTagsMap() {
            Map<String, String> stringTagsMap = this._builder.getStringTagsMap();
            AbstractC2995aW.p(stringTagsMap, "_builder.getStringTagsMap()");
            return new DslMap(stringTagsMap);
        }

        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            AbstractC2995aW.p(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(map, "map");
            this._builder.putAllIntTags(map);
        }

        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(map, "map");
            this._builder.putAllStringTags(map);
        }

        public final void putIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String str, int i) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            this._builder.putIntTags(str, i);
        }

        public final void putStringTags(DslMap<String, String, StringTagsProxy> dslMap, String str, String str2) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            AbstractC2995aW.q(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.putStringTags(str, str2);
        }

        public final /* synthetic */ void removeIntTags(DslMap dslMap, String str) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            this._builder.removeIntTags(str);
        }

        public final /* synthetic */ void removeStringTags(DslMap dslMap, String str) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            this._builder.removeStringTags(str);
        }

        public final void setAdType(DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
            AbstractC2995aW.q(diagnosticAdType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdType(diagnosticAdType);
        }

        public final void setCustomEventType(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCustomEventType(str);
        }

        public final void setEventId(int i) {
            this._builder.setEventId(i);
        }

        public final void setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            AbstractC2995aW.q(diagnosticEventType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setEventType(diagnosticEventType);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final /* synthetic */ void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String str, int i) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            putIntTags(dslMap, str, i);
        }

        public final void setIsHeaderBidding(boolean z) {
            this._builder.setIsHeaderBidding(z);
        }

        public final void setPlacementId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPlacementId(str);
        }

        public final /* synthetic */ void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String str, String str2) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            AbstractC2995aW.q(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            putStringTags(dslMap, str, str2);
        }

        public final void setTimeValue(double d) {
            this._builder.setTimeValue(d);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            AbstractC2995aW.q(timestamps, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTimestamps(timestamps);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventKt() {
    }
}
