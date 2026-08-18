package com.unity3d.ads.network.model;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpResponse {
    private final Object body;
    private final Map<String, Object> headers;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj) {
        this(obj, 0, null, null, 14, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i, map, str);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, Object> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final HttpResponse copy(Object obj, int i, Map<String, ? extends Object> map, String str) {
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(str, "urlString");
        return new HttpResponse(obj, i, map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return AbstractC2995aW.i(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && AbstractC2995aW.i(this.headers, httpResponse.headers) && AbstractC2995aW.i(this.urlString, httpResponse.urlString);
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return this.urlString.hashCode() + ((this.headers.hashCode() + (((this.body.hashCode() * 31) + this.statusCode) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(body=");
        sb.append(this.body);
        sb.append(", statusCode=");
        sb.append(this.statusCode);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", urlString=");
        return DM.l(sb, this.urlString, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i) {
        this(obj, i, null, null, 12, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends Object> map) {
        this(obj, i, map, null, 8, null);
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, int i2, AbstractC2471Hm abstractC2471Hm) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? C2838Vq.f3896a : map, (i2 & 8) != 0 ? "" : str);
    }

    public HttpResponse(Object obj, int i, Map<String, ? extends Object> map, String str) {
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        AbstractC2995aW.q(map, "headers");
        AbstractC2995aW.q(str, "urlString");
        this.body = obj;
        this.statusCode = i;
        this.headers = map;
        this.urlString = str;
    }
}
