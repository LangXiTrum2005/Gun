package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3573h1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3898kj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ei0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8;

/* JADX INFO: loaded from: classes2.dex */
public class VungleRtbInterstitialAd implements MediationInterstitialAd, RD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f796a;
    public final MediationAdLoadCallback b;
    public MediationInterstitialAdCallback c;
    public OD d;
    public final VungleFactory e;

    public VungleRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.f796a = mediationInterstitialAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.e = vungleFactory;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdClicked(@NonNull X8 x8) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdEnd(@NonNull X8 x8) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToLoad(@NonNull X8 x8, @NonNull Ei0 ei0) {
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        adError.toString();
        this.b.onFailure(adError);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToPlay(@NonNull X8 x8, @NonNull Ei0 ei0) {
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        adError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdImpression(@NonNull X8 x8) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLeftApplication(@NonNull X8 x8) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLoaded(@NonNull X8 x8) {
        this.c = (MediationInterstitialAdCallback) this.b.onSuccess(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdStart(@NonNull X8 x8) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    public void render() {
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.f796a;
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        boolean zIsEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        C3573h1 c3573h1CreateAdConfig = this.e.createAdConfig();
        if (mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            c3573h1CreateAdConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            c3573h1CreateAdConfig.setWatermark(watermark);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string, context, new C3898kj0(this, context, string2, c3573h1CreateAdConfig, bidResponse));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        OD od = this.d;
        if (od != null) {
            od.play(context);
        } else if (this.c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            this.c.onAdFailedToShow(adError);
        }
    }
}
