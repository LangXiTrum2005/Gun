package com.unity3d.services.ads.measurements;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.umeng.analytics.pro.f;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2495Ik;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4714u1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class MeasurementsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final MeasurementManager measurementManager;

    public MeasurementsService(Context context, ISDKDispatchers iSDKDispatchers, IEventSender iEventSender) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(iEventSender, "eventSender");
        this.dispatchers = iSDKDispatchers;
        this.eventSender = iEventSender;
        this.measurementManager = getMeasurementManager(context);
    }

    private final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return AbstractC4714u1.p(context.getSystemService(AbstractC2495Ik.t()));
        }
        return null;
    }

    public final void checkAvailability() {
        if (Device.getApiLevel() < 33) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_API_BELOW_33);
            return;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXTENSION_BELOW_4);
            return;
        }
        if (this.measurementManager == null) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_MANAGER_NULL);
        } else if (AdServicesState.isAdServicesStateEnabled()) {
            this.measurementManager.getMeasurementApiStatus(WD.f(this.dispatchers.getDefault()), new MeasurementsStatusReceiver(this.eventSender));
        } else {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_AD_SERVICES_DISABLED);
        }
    }

    public final void registerClick(String str, InputEvent inputEvent) {
        AbstractC2995aW.q(str, "url");
        AbstractC2995aW.q(inputEvent, "inputEvent");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerSource(Uri.parse(str), inputEvent, WD.f(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementsEvents.CLICK_SUCCESSFUL, MeasurementsEvents.CLICK_ERROR));
        }
    }

    public final void registerView(String str) {
        AbstractC2995aW.q(str, "url");
        MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerSource(Uri.parse(str), null, WD.f(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementsEvents.VIEW_SUCCESSFUL, MeasurementsEvents.VIEW_ERROR));
        }
    }
}
