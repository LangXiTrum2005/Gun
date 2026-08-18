package com.unity3d.services.core.cache;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class CacheEventSender implements Serializable {
    private final IEventSender eventSender;

    public CacheEventSender(IEventSender iEventSender) {
        AbstractC2995aW.q(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public final boolean sendEvent(CacheEvent cacheEvent, Object... objArr) {
        AbstractC2995aW.q(cacheEvent, "eventId");
        AbstractC2995aW.q(objArr, "params");
        return this.eventSender.sendEvent(WebViewEventCategory.CACHE, cacheEvent, Arrays.copyOf(objArr, objArr.length));
    }
}
