package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class WebRequestToHttpRequestKt {
    public static final HttpRequest toHttpRequest(WebRequest webRequest) {
        AbstractC2995aW.q(webRequest, "<this>");
        String string = webRequest.getUrl().toString();
        String requestType = webRequest.getRequestType();
        AbstractC2995aW.p(requestType, "requestType");
        RequestType requestTypeValueOf = RequestType.valueOf(requestType);
        Map<String, List<String>> headers = webRequest.getHeaders();
        byte[] body = webRequest.getBody();
        AbstractC2995aW.p(string, "toString()");
        AbstractC2995aW.p(headers, "headers");
        return new HttpRequest(string, null, requestTypeValueOf, body, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131042, null);
    }
}
