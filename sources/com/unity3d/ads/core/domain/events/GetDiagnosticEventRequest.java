package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        AbstractC2995aW.q(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(String str, Map<String, String> map, Map<String, Integer> map2, Double d, Boolean bool, ByteString byteString, String str2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
        AbstractC2995aW.q(str, "eventName");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        dsl_create.setTimestamps(this.getSharedDataTimestamps.invoke());
        dsl_create.setCustomEventType(str);
        if (map != null) {
            dsl_create.putAllStringTags(dsl_create.getStringTagsMap(), map);
        }
        if (map2 != null) {
            dsl_create.putAllIntTags(dsl_create.getIntTagsMap(), map2);
        }
        if (d != null) {
            dsl_create.setTimeValue(d.doubleValue());
        }
        if (bool != null) {
            dsl_create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            dsl_create.setImpressionOpportunityId(byteString);
        }
        if (str2 != null) {
            dsl_create.setPlacementId(str2);
        }
        if (diagnosticAdType != null) {
            dsl_create.setAdType(diagnosticAdType);
        }
        return dsl_create._build();
    }
}
