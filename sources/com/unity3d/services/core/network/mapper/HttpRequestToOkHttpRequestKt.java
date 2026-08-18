package com.unity3d.services.core.network.mapper;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3887ke;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4447qz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5036xh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RO;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final NY generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            Pattern pattern = RO.c;
            NY nyCreate = NY.create(C3887ke.u("text/plain;charset=utf-8"), (byte[]) obj);
            AbstractC2995aW.p(nyCreate, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return nyCreate;
        }
        if (obj instanceof String) {
            Pattern pattern2 = RO.c;
            NY nyCreate2 = NY.create(C3887ke.u("text/plain;charset=utf-8"), (String) obj);
            AbstractC2995aW.p(nyCreate2, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return nyCreate2;
        }
        Pattern pattern3 = RO.c;
        NY nyCreate3 = NY.create(C3887ke.u("text/plain;charset=utf-8"), "");
        AbstractC2995aW.p(nyCreate3, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return nyCreate3;
    }

    private static final C4447qz generateOkHttpHeaders(HttpRequest httpRequest) {
        C5036xh c5036xh = new C5036xh();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            c5036xh.a(entry.getKey(), AbstractC2853Wf.l0(entry.getValue(), ",", null, null, null, 62));
        }
        return c5036xh.e();
    }

    private static final NY generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            Pattern pattern = RO.c;
            NY nyCreate = NY.create(C3887ke.u(CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj);
            AbstractC2995aW.p(nyCreate, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return nyCreate;
        }
        if (obj instanceof String) {
            Pattern pattern2 = RO.c;
            NY nyCreate2 = NY.create(C3887ke.u(CommonGatewayClient.HEADER_PROTOBUF), (String) obj);
            AbstractC2995aW.p(nyCreate2, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return nyCreate2;
        }
        Pattern pattern3 = RO.c;
        NY nyCreate3 = NY.create(C3887ke.u(CommonGatewayClient.HEADER_PROTOBUF), "");
        AbstractC2995aW.p(nyCreate3, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return nyCreate3;
    }

    public static final HY toOkHttpProtoRequest(HttpRequest httpRequest) {
        AbstractC2995aW.q(httpRequest, "<this>");
        GY gy = new GY();
        gy.g(AbstractC3089ba0.E0("/", AbstractC3089ba0.W0(httpRequest.getBaseURL(), '/') + '/' + AbstractC3089ba0.W0(httpRequest.getPath(), '/')));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        gy.e(string, body != null ? generateOkHttpProtobufBody(body) : null);
        gy.d(generateOkHttpHeaders(httpRequest));
        return gy.b();
    }

    public static final HY toOkHttpRequest(HttpRequest httpRequest) {
        AbstractC2995aW.q(httpRequest, "<this>");
        GY gy = new GY();
        gy.g(AbstractC3089ba0.E0("/", AbstractC3089ba0.W0(httpRequest.getBaseURL(), '/') + '/' + AbstractC3089ba0.W0(httpRequest.getPath(), '/')));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        gy.e(string, body != null ? generateOkHttpBody(body) : null);
        gy.d(generateOkHttpHeaders(httpRequest));
        return gy.b();
    }
}
