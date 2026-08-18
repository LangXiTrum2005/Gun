package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpResponseKt {
    public static final boolean isSuccessful(HttpResponse httpResponse) {
        AbstractC2995aW.q(httpResponse, "<this>");
        int statusCode = httpResponse.getStatusCode();
        return 200 <= statusCode && statusCode < 300;
    }

    public static final HttpResponse toHttpResponse(UnityAdsNetworkException unityAdsNetworkException) {
        AbstractC2995aW.q(unityAdsNetworkException, "<this>");
        Integer code = unityAdsNetworkException.getCode();
        int iIntValue = code != null ? code.intValue() : 520;
        C2838Vq c2838Vq = C2838Vq.f3896a;
        String url = unityAdsNetworkException.getUrl();
        String str = url == null ? "" : url;
        String protocol = unityAdsNetworkException.getProtocol();
        String str2 = protocol == null ? "" : protocol;
        String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new HttpResponse("", iIntValue, c2838Vq, str, str2, client, 0L, 64, null);
    }
}
