package com.unity3d.services.ads.topics;

import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.ext.SdkExtensions;
import com.umeng.analytics.pro.f;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wc0;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class TopicsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final TopicsManager topicsManager;

    public TopicsService(Context context, ISDKDispatchers iSDKDispatchers, IEventSender iEventSender) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(iEventSender, "eventSender");
        this.dispatchers = iSDKDispatchers;
        this.eventSender = iEventSender;
        this.topicsManager = getTopicsManager(context);
    }

    private final TopicsManager getTopicsManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return Wc0.c(context.getSystemService(SM.q()));
        }
        return null;
    }

    public final TopicsStatus checkAvailability() {
        if (Device.getApiLevel() < 33) {
            return TopicsStatus.ERROR_API_BELOW_33;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return TopicsStatus.ERROR_EXTENSION_BELOW_4;
        }
        if (this.topicsManager == null) {
            return TopicsStatus.ERROR_TOPICSMANAGER_NULL;
        }
        return !AdServicesState.isAdServicesStateEnabled() ? TopicsStatus.ERROR_AD_SERVICES_DISABLED : TopicsStatus.TOPICS_AVAILABLE;
    }

    public final void getTopics(String str, boolean z) {
        AbstractC2995aW.q(str, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        GetTopicsRequest getTopicsRequestBuild = SM.j().setAdsSdkName(str).setShouldRecordObservation(z).build();
        AbstractC2995aW.p(getTopicsRequestBuild, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                topicsManager.getTopics(getTopicsRequestBuild, WD.f(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (Exception e) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e.toString());
            DeviceLog.debug("Failed to get topics with error: " + e);
        }
    }
}
