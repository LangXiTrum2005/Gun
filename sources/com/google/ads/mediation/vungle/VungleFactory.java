package com.google.ads.mediation.vungle;

import android.content.Context;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3105bi0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3573h1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Di0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZZ;

/* JADX INFO: loaded from: classes2.dex */
public final class VungleFactory {
    public final C3573h1 createAdConfig() {
        return new C3573h1();
    }

    public final Di0 createBannerAd(Context context, String str, C3105bi0 c3105bi0) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3105bi0, "adSize");
        return new Di0(context, str, c3105bi0);
    }

    public final OD createInterstitialAd(Context context, String str, C3573h1 c3573h1) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3573h1, "adConfig");
        return new OD(context, str, c3573h1);
    }

    public final PQ createNativeAd(Context context, String str) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        return new PQ(context, str);
    }

    public final ZZ createRewardedAd(Context context, String str, C3573h1 c3573h1) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3573h1, "adConfig");
        return new ZZ(context, str, c3573h1);
    }
}
