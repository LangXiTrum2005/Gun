package com.unity3d.services.core.network.model;

import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.data.model.OperationType;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
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
        this(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        AbstractC2995aW.q(str, "baseURL");
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
        AbstractC2995aW.q(operationType, "operationType");
        return new HttpRequest(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, operationType, file, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return AbstractC2995aW.i(this.baseURL, httpRequest.baseURL) && AbstractC2995aW.i(this.path, httpRequest.path) && this.method == httpRequest.method && AbstractC2995aW.i(this.body, httpRequest.body) && AbstractC2995aW.i(this.headers, httpRequest.headers) && AbstractC2995aW.i(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && AbstractC2995aW.i(this.scheme, httpRequest.scheme) && AbstractC2995aW.i(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && AbstractC2995aW.i(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    public int hashCode() {
        int iHashCode = (this.method.hashCode() + DM.d(this.path, this.baseURL.hashCode() * 31, 31)) * 31;
        Object obj = this.body;
        int iD = DM.d(this.scheme, (this.bodyType.hashCode() + ((this.parameters.hashCode() + ((this.headers.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        Integer num = this.port;
        int iHashCode2 = (((((((((iD + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout) * 31;
        boolean z = this.isProtobuf;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode3 = (this.operationType.hashCode() + ((iHashCode2 + r2) * 31)) * 31;
        File file = this.downloadDestination;
        return ((iHashCode3 + (file != null ? file.hashCode() : 0)) * 31) + this.priority;
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
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
        sb.append(", bodyType=");
        sb.append(this.bodyType);
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
        sb.append(this.callTimeout);
        sb.append(", isProtobuf=");
        sb.append(this.isProtobuf);
        sb.append(", operationType=");
        sb.append(this.operationType);
        sb.append(", downloadDestination=");
        sb.append(this.downloadDestination);
        sb.append(", priority=");
        return DM.k(sb, this.priority, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj) {
        this(str, str2, requestType, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, obj, map, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, obj, map, map2, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType) {
        this(str, str2, requestType, obj, map, map2, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, 0, 0, 0, false, null, null, 0, 130048, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, 0, 0, false, null, null, 0, 129024, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, 0, false, null, null, 0, 126976, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, false, null, null, 0, 122880, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, null, null, 0, 114688, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, operationType, null, 0, 98304, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
        AbstractC2995aW.q(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, operationType, file, 0, 65536, null);
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
        AbstractC2995aW.q(operationType, "operationType");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, AbstractC2471Hm abstractC2471Hm) {
        String str4 = (i6 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i6 & 4) != 0 ? RequestType.GET : requestType;
        Object obj2 = (i6 & 8) != 0 ? null : obj;
        int i7 = i6 & 16;
        Map map3 = C2838Vq.f3896a;
        this(str, str4, requestType2, obj2, i7 != 0 ? map3 : map, (i6 & 32) == 0 ? map2 : map3, (i6 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i6 & 128) != 0 ? "https" : str3, (i6 & 256) != 0 ? null : num, (i6 & 512) != 0 ? 30000 : i, (i6 & 1024) != 0 ? 30000 : i2, (i6 & 2048) != 0 ? 30000 : i3, (i6 & 4096) == 0 ? i4 : 30000, (i6 & 8192) != 0 ? false : z, (i6 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i6 & 32768) != 0 ? null : file, (i6 & 65536) == 0 ? i5 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        AbstractC2995aW.q(str, "baseURL");
        AbstractC2995aW.q(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        AbstractC2995aW.q(requestType, "method");
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(map2, "parameters");
        AbstractC2995aW.q(bodyType, "bodyType");
        AbstractC2995aW.q(str3, "scheme");
        AbstractC2995aW.q(operationType, "operationType");
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = obj;
        this.headers = map;
        this.parameters = map2;
        this.bodyType = bodyType;
        this.scheme = str3;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
        this.isProtobuf = z;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i5;
    }
}
