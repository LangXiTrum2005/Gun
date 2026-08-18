package com.unity3d.services.core.device;

import android.util.SparseArray;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class VolumeChangeMonitor {
    private final IEventSender eventSender;
    private final VolumeChange volumeChange;
    private final SparseArray<VolumeChangeListener> volumeChangeListeners;

    public VolumeChangeMonitor(IEventSender iEventSender, VolumeChange volumeChange) {
        AbstractC2995aW.q(iEventSender, "eventSender");
        AbstractC2995aW.q(volumeChange, "volumeChange");
        this.eventSender = iEventSender;
        this.volumeChange = volumeChange;
        this.volumeChangeListeners = new SparseArray<>();
    }

    public final void registerVolumeChangeListener(final int i) {
        if (this.volumeChangeListeners.get(i) == null) {
            VolumeChangeListener volumeChangeListener = new VolumeChangeListener() { // from class: com.unity3d.services.core.device.VolumeChangeMonitor$registerVolumeChangeListener$listener$1
                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public int getStreamType() {
                    return i;
                }

                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public void onVolumeChanged(int i2) {
                    this.this$0.eventSender.sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i2), Integer.valueOf(Device.getStreamMaxVolume(i)));
                }
            };
            this.volumeChangeListeners.append(i, volumeChangeListener);
            this.volumeChange.registerListener(volumeChangeListener);
        }
    }

    public final void unregisterVolumeChangeListener(int i) {
        if (this.volumeChangeListeners.get(i) != null) {
            VolumeChangeListener volumeChangeListener = this.volumeChangeListeners.get(i);
            VolumeChange volumeChange = this.volumeChange;
            AbstractC2995aW.p(volumeChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            volumeChange.unregisterListener(volumeChangeListener);
            this.volumeChangeListeners.remove(i);
        }
    }
}
