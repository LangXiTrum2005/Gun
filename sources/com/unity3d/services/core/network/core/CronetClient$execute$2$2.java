package com.unity3d.services.core.network.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class CronetClient$execute$2$2 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ UrlRequest $req;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$2(UrlRequest urlRequest) {
        super(1);
        this.$req = urlRequest;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C5033xf0.f5238a;
    }

    public final void invoke(Throwable th) {
        this.$req.cancel();
    }
}
