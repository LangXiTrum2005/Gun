package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonUniversalRequestTtlValidator implements UniversalRequestTtlValidator {
    @Override // com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator
    public boolean invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy) {
        AbstractC2995aW.q(universalRequest, "universalRequest");
        AbstractC2995aW.q(requestPolicy, "requestPolicy");
        return System.currentTimeMillis() - (universalRequest.getSharedData().getTimestamps().getTimestamp().getSeconds() * ((long) 1000)) < ((long) requestPolicy.getMaxDuration());
    }
}
