package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public interface GatewayClient {

    public static final class DefaultImpls {
        public static /* synthetic */ Object request$default(GatewayClient gatewayClient, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i & 1) != 0) {
                str = UnityAdsConstants.DefaultUrls.GATEWAY_URL;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                operationType = OperationType.UNKNOWN;
            }
            return gatewayClient.request(str2, universalRequest, requestPolicy, operationType, interfaceC2857Wj);
        }
    }

    Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, InterfaceC2857Wj interfaceC2857Wj);
}
