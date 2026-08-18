package com.unity3d.ads.network.mapper;

import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
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
    private static final NY generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            Pattern pattern = RO.c;
            return NY.create(C3887ke.u("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            Pattern pattern2 = RO.c;
            return NY.create(C3887ke.u("text/plain;charset=utf-8"), ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new C3770jF(7, 0);
    }

    private static final C4447qz generateOkHttpHeaders(HttpRequest httpRequest) {
        C5036xh c5036xh = new C5036xh();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            c5036xh.a(entry.getKey(), AbstractC2853Wf.l0(entry.getValue(), ",", null, null, null, 62));
        }
        return c5036xh.e();
    }

    public static final HY toOkHttpRequest(HttpRequest httpRequest) {
        AbstractC2995aW.q(httpRequest, "<this>");
        GY gy = new GY();
        gy.g(AbstractC3089ba0.E0("/", AbstractC3089ba0.W0(httpRequest.getBaseURL(), '/') + '/' + AbstractC3089ba0.W0(httpRequest.getPath(), '/')));
        gy.e(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody()));
        gy.d(generateOkHttpHeaders(httpRequest));
        return gy.b();
    }
}
