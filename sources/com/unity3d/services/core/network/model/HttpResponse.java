package com.unity3d.services.core.network.model;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map<String, List<String>> headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj) {
        this(obj, 0, null, null, null, null, 0L, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j) {
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(str, "urlString");
        AbstractC2995aW.q(str2, "protocol");
        AbstractC2995aW.q(str3, "client");
        return new HttpResponse(obj, i, map, str, str2, str3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return AbstractC2995aW.i(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && AbstractC2995aW.i(this.headers, httpResponse.headers) && AbstractC2995aW.i(this.urlString, httpResponse.urlString) && AbstractC2995aW.i(this.protocol, httpResponse.protocol) && AbstractC2995aW.i(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        int iD = DM.d(this.client, DM.d(this.protocol, DM.d(this.urlString, (this.headers.hashCode() + (((this.body.hashCode() * 31) + this.statusCode) * 31)) * 31, 31), 31), 31);
        long j = this.contentSize;
        return iD + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i) {
        this(obj, i, null, null, null, null, 0L, 124, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map) {
        this(obj, i, map, null, null, null, 0L, 120, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str) {
        this(obj, i, map, str, null, null, 0L, 112, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(str, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2) {
        this(obj, i, map, str, str2, null, 0L, 96, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(str, "urlString");
        AbstractC2995aW.q(str2, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3) {
        this(obj, i, map, str, str2, str3, 0L, 64, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(str, "urlString");
        AbstractC2995aW.q(str2, "protocol");
        AbstractC2995aW.q(str3, "client");
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, AbstractC2471Hm abstractC2471Hm) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? C2838Vq.f3896a : map, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "", (i2 & 32) != 0 ? "unknown" : str3, (i2 & 64) != 0 ? -1L : j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j) {
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(str, "urlString");
        AbstractC2995aW.q(str2, "protocol");
        AbstractC2995aW.q(str3, "client");
        this.body = obj;
        this.statusCode = i;
        this.headers = map;
        this.urlString = str;
        this.protocol = str2;
        this.client = str3;
        this.contentSize = j;
    }
}
