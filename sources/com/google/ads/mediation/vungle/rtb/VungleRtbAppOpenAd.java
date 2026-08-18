package com.google.ads.mediation.vungle.rtb;

import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.renderers.VungleAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3573h1;

/* JADX INFO: loaded from: classes2.dex */
public final class VungleRtbAppOpenAd extends VungleAppOpenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        super(mediationAppOpenAdConfiguration, mediationAdLoadCallback, vungleFactory);
        AbstractC2995aW.q(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        AbstractC2995aW.q(mediationAdLoadCallback, "mediationAdLoadCallback");
        AbstractC2995aW.q(vungleFactory, "vungleFactory");
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleAppOpenAd
    public String getAdMarkup(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        AbstractC2995aW.q(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        AbstractC2995aW.p(bidResponse, "mediationAppOpenAdConfiguration.bidResponse");
        return bidResponse;
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleAppOpenAd
    public void maybeAddWatermarkToVungleAdConfig(C3573h1 c3573h1, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        AbstractC2995aW.q(c3573h1, "adConfig");
        AbstractC2995aW.q(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        AbstractC2995aW.p(watermark, "mediationAppOpenAdConfiguration.watermark");
        if (watermark.length() > 0) {
            c3573h1.setWatermark(watermark);
        }
    }
}
