package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.data.manager.ScarManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class LoadScarAd {
    private final ScarManager scarManager;

    public LoadScarAd(ScarManager scarManager) {
        AbstractC2995aW.q(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, int i, InterfaceC2857Wj interfaceC2857Wj) {
        Object objLoadAd;
        boolean zI = AbstractC2995aW.i(str, "banner");
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        return (!zI && (objLoadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i, interfaceC2857Wj)) == EnumC4602sk.f4993a) ? objLoadAd : c5033xf0;
    }
}
