package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4637t60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    public static final class Companion {
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC4221oQ broadcastEventChannel = AbstractC4637t60.b(0, 7);

        private Companion() {
        }

        public final InterfaceC4221oQ getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    public static final class DefaultImpls {
        @CallSuper
        public static Object destroy(AdPlayer adPlayer, InterfaceC2857Wj interfaceC2857Wj) {
            WD.i(adPlayer.getScope());
            return C5033xf0.f5238a;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            AbstractC2995aW.q(showOptions, "showOptions");
            throw new RR();
        }
    }

    @CallSuper
    Object destroy(InterfaceC2857Wj interfaceC2857Wj);

    void dispatchShowCompleted();

    InterfaceC4443qv getOnLoadEvent();

    InterfaceC4443qv getOnScarEvent();

    InterfaceC4443qv getOnShowEvent();

    InterfaceC4514rk getScope();

    InterfaceC4443qv getUpdateCampaignState();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj);

    Object onBroadcastEvent(String str, InterfaceC2857Wj interfaceC2857Wj);

    Object requestShow(Map<String, ? extends Object> map, InterfaceC2857Wj interfaceC2857Wj);

    Object sendActivityDestroyed(InterfaceC2857Wj interfaceC2857Wj);

    Object sendFocusChange(boolean z, InterfaceC2857Wj interfaceC2857Wj);

    Object sendGmaEvent(GMAEvent gMAEvent, InterfaceC2857Wj interfaceC2857Wj);

    Object sendMuteChange(boolean z, InterfaceC2857Wj interfaceC2857Wj);

    Object sendPrivacyFsmChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj);

    Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, InterfaceC2857Wj interfaceC2857Wj);

    Object sendUserConsentChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj);

    Object sendVisibilityChange(boolean z, InterfaceC2857Wj interfaceC2857Wj);

    Object sendVolumeChange(double d, InterfaceC2857Wj interfaceC2857Wj);

    void show(ShowOptions showOptions);
}
