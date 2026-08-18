package com.unity3d.ads.adplayer;

import com.unity3d.services.core.device.Storage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4008m;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3987lk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 extends AbstractC4008m implements InterfaceC4075mk {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(C3987lk c3987lk, WebViewAdPlayer webViewAdPlayer) {
        super(c3987lk);
        this.this$0 = webViewAdPlayer;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk
    public void handleException(InterfaceC3549gk interfaceC3549gk, Throwable th) {
        Storage.Companion.removeStorageEventCallback(this.this$0.storageEventCallback);
    }
}
