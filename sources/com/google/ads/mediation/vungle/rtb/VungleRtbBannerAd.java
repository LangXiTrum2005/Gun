package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.mediation.VungleInterstitialAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3810jj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Di0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ei0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8;

/* JADX INFO: loaded from: classes2.dex */
public class VungleRtbBannerAd implements MediationBannerAd, O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationBannerAdConfiguration f795a;
    public final MediationAdLoadCallback b;
    public MediationBannerAdCallback c;
    public Di0 d;
    public RelativeLayout e;
    public final VungleFactory f;

    public VungleRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.f795a = mediationBannerAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.f = vungleFactory;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdClicked(@NonNull X8 x8) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.c.onAdOpened();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToLoad(@NonNull X8 x8, @NonNull Ei0 ei0) {
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        adError.toString();
        this.b.onFailure(adError);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToPlay(@NonNull X8 x8, @NonNull Ei0 ei0) {
        VungleMediationAdapter.getAdError(ei0).toString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdImpression(@NonNull X8 x8) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLeftApplication(@NonNull X8 x8) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLoaded(@NonNull X8 x8) {
        this.c = (MediationBannerAdCallback) this.b.onSuccess(this);
    }

    public void render() {
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.f795a;
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        boolean zIsEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            Context context = mediationBannerAdConfiguration.getContext();
            AdSize adSize = mediationBannerAdConfiguration.getAdSize();
            VungleInitializer.getInstance().initialize(string, context, new C3810jj0(this, context, string2, adSize, VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(adSize, string2), mediationBannerAdConfiguration.getBidResponse(), mediationBannerAdConfiguration.getWatermark()));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdEnd(@NonNull X8 x8) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdStart(@NonNull X8 x8) {
    }
}
