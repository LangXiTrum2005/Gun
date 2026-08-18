package com.unity3d.ads.network.model;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str) {
        this(str, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        AbstractC2995aW.q(str, "baseURL");
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3, int i4) {
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(str3, "scheme");
        return new HttpRequest(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return AbstractC2995aW.i(this.baseURL, httpRequest.baseURL) && AbstractC2995aW.i(this.path, httpRequest.path) && this.method == httpRequest.method && AbstractC2995aW.i(this.body, httpRequest.body) && AbstractC2995aW.i(this.headers, httpRequest.headers) && AbstractC2995aW.i(this.parameters, httpRequest.parameters) && AbstractC2995aW.i(this.scheme, httpRequest.scheme) && AbstractC2995aW.i(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int iD = DM.d(this.scheme, (this.parameters.hashCode() + ((this.headers.hashCode() + ((this.body.hashCode() + ((this.method.hashCode() + DM.d(this.path, this.baseURL.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31, 31);
        Integer num = this.port;
        return ((((((((iD + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest(baseURL=");
        sb.append(this.baseURL);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", parameters=");
        sb.append(this.parameters);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", port=");
        sb.append(this.port);
        sb.append(", connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", readTimeout=");
        sb.append(this.readTimeout);
        sb.append(", writeTimeout=");
        sb.append(this.writeTimeout);
        sb.append(", callTimeout=");
        return DM.k(sb, this.callTimeout, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody) {
        this(str, str2, requestType, httpBody, null, null, null, null, 0, 0, 0, 0, 4080, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, httpBody, map, null, null, null, 0, 0, 0, 0, 4064, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, httpBody, map, map2, null, null, 0, 0, 0, 0, 4032, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3) {
        this(str, str2, requestType, httpBody, map, map2, str3, null, 0, 0, 0, 0, 3968, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, 0, 0, 0, 0, 3840, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, 0, 0, 0, 3584, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, 0, 0, 3072, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, i3, 0, 2048, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, AbstractC2471Hm abstractC2471Hm) {
        String str4 = (i5 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i5 & 4) != 0 ? RequestType.GET : requestType;
        HttpBody httpBody2 = (i5 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody;
        int i6 = i5 & 16;
        Map map3 = C2838Vq.f3896a;
        this(str, str4, requestType2, httpBody2, i6 != 0 ? map3 : map, (i5 & 32) == 0 ? map2 : map3, (i5 & 64) != 0 ? "https" : str3, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? 30000 : i, (i5 & 512) != 0 ? 30000 : i2, (i5 & 1024) != 0 ? 30000 : i3, (i5 & 2048) == 0 ? i4 : 30000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3, int i4) {
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(httpBody, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(str3, "scheme");
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = httpBody;
        this.headers = map;
        this.parameters = map2;
        this.scheme = str3;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
    }
}
