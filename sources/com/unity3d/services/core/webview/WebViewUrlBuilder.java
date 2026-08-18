package com.unity3d.services.core.webview;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder sbO = DM.o("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl()));
        sbO.append(buildQueryParam("version", configuration.getWebViewVersion()));
        StringBuilder sbO2 = DM.o(sbO.toString());
        sbO2.append(buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
        this._urlWithQueryString = DM.h(str, sbO2.toString());
    }

    private String buildQueryParam(String str, String str2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (str2 == null) {
            return "";
        }
        try {
            return "&" + str + "=" + URLEncoder.encode(str2, C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            DeviceLog.exception("Unsupported charset when encoding " + str, e);
            return "";
        }
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
