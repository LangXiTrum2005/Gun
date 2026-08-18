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
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3573h1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4162nj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ei0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZZ;

/* JADX INFO: loaded from: classes2.dex */
public class VungleRtbRewardedAd implements MediationRewardedAd, InterfaceC3043b00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f798a;
    public final MediationAdLoadCallback b;
    public MediationRewardedAdCallback c;
    public ZZ d;
    public final VungleFactory e;

    public VungleRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.f798a = mediationRewardedAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.e = vungleFactory;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdClicked(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdEnd(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToLoad(@NonNull X8 x8, @NonNull Ei0 ei0) {
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        adError.toString();
        this.b.onFailure(adError);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToPlay(@NonNull X8 x8, @NonNull Ei0 ei0) {
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdImpression(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.c.reportAdImpression();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLoaded(@NonNull X8 x8) {
        this.c = (MediationRewardedAdCallback) this.b.onSuccess(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00
    public void onAdRewarded(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.c.onUserEarnedReward(new VungleMediationAdapter.VungleReward("vungle", 1));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdStart(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    public void render() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f798a;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString(VungleConstants.KEY_USER_ID);
        String string2 = serverParameters.getString("appid");
        boolean zIsEmpty = TextUtils.isEmpty(string2);
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        C3573h1 c3573h1CreateAdConfig = this.e.createAdConfig();
        if (mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            c3573h1CreateAdConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            c3573h1CreateAdConfig.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string2, context, new C4162nj0(this, context, string3, c3573h1CreateAdConfig, string, bidResponse));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        ZZ zz = this.d;
        if (zz != null) {
            zz.play(context);
        } else if (this.c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            this.c.onAdFailedToShow(adError);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLeftApplication(@NonNull X8 x8) {
    }
}
