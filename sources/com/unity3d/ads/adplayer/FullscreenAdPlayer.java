package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes3.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    public static final class DefaultImpls {
        @CallSuper
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, InterfaceC2857Wj interfaceC2857Wj) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, interfaceC2857Wj);
            return objDestroy == EnumC4602sk.f4993a ? objDestroy : C5033xf0.f5238a;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            AbstractC2995aW.q(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
