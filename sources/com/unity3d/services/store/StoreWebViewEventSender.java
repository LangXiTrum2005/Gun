package com.unity3d.services.store;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class StoreWebViewEventSender {
    private final IEventSender eventSender;

    public StoreWebViewEventSender(IEventSender iEventSender) {
        AbstractC2995aW.q(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public final void send(StoreEvent storeEvent, Object... objArr) {
        AbstractC2995aW.q(storeEvent, NotificationCompat.CATEGORY_EVENT);
        AbstractC2995aW.q(objArr, "params");
        this.eventSender.sendEvent(WebViewEventCategory.STORE, storeEvent, Arrays.copyOf(objArr, objArr.length));
    }
}
