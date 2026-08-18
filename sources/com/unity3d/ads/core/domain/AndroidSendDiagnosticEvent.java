package com.unity3d.ads.core.domain;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest) {
        AbstractC2995aW.q(diagnosticEventRepository, "diagnosticEventRepository");
        AbstractC2995aW.q(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(String str, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject) {
        AbstractC2995aW.q(str, NotificationCompat.CATEGORY_EVENT);
        Boolean boolValueOf = adObject != null ? Boolean.valueOf(adObject.isHeaderBidding()) : null;
        ByteString opportunityId = adObject != null ? adObject.getOpportunityId() : null;
        String placementId = adObject != null ? adObject.getPlacementId() : null;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = adObject != null ? adObject.getAdType() : null;
        LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        if (adObject != null && adObject.isScarAd()) {
            linkedHashMap.put("scar", "true");
        }
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(str, linkedHashMap, map2, d, boolValueOf, opportunityId, placementId, adType));
    }
}
