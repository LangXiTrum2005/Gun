package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class MeasurementsStatusReceiver implements OutcomeReceiver<Integer, Exception> {
    private final IEventSender eventSender;

    public MeasurementsStatusReceiver(IEventSender iEventSender) {
        AbstractC2995aW.q(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    @Override // android.os.OutcomeReceiver
    public /* bridge */ /* synthetic */ void onResult(Integer num) {
        onResult(num.intValue());
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Exception exc) {
        AbstractC2995aW.q(exc, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXCEPTION, exc.toString());
    }

    public void onResult(int i) {
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.AVAILABLE, Integer.valueOf(i));
    }
}
