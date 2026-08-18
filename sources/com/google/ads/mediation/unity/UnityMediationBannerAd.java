package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pf0;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class UnityMediationBannerAd implements MediationBannerAd, BannerView.IListener {
    static final String ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID = "Unity Ads initialization failed for game ID '%s' with error message: %s";
    static final String ERROR_MSG_NO_MATCHING_AD_SIZE = "There is no matching Unity Ads ad size for Google ad size: ";
    private String bannerPlacementId;
    private String gameId;

    @Nullable
    private MediationBannerAdCallback mediationBannerAdCallback;
    private final MediationBannerAdConfiguration mediationBannerAdConfiguration;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationBannerAdLoadCallback;
    private final Hf0 unityAdsLoader;
    private final Kf0 unityBannerViewFactory;

    @Nullable
    private Lf0 unityBannerViewWrapper;
    private final UnityInitializer unityInitializer;

    public UnityMediationBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull UnityInitializer unityInitializer, @NonNull Kf0 kf0, @NonNull Hf0 hf0) {
        this.mediationBannerAdConfiguration = mediationBannerAdConfiguration;
        this.mediationBannerAdLoadCallback = mediationAdLoadCallback;
        this.unityBannerViewFactory = kf0;
        this.unityInitializer = unityInitializer;
        this.unityAdsLoader = hf0;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.unityBannerViewWrapper.f3366a;
    }

    public void loadAd() {
        Context context = this.mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = this.mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = this.mediationBannerAdConfiguration.getAdSize();
        this.gameId = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string = serverParameters.getString("zoneId");
        this.bannerPlacementId = string;
        if (!UnityAdsAdapterUtils.areValidIds(this.gameId, string)) {
            AdError adError = new AdError(101, "Missing or invalid server parameters.", "com.google.ads.mediation.unity");
            adError.toString();
            this.mediationBannerAdLoadCallback.onFailure(adError);
            return;
        }
        if (!(context instanceof Activity)) {
            AdError adError2 = new AdError(105, "Unity Ads requires an Activity context to load ads.", "com.google.ads.mediation.unity");
            adError2.toString();
            this.mediationBannerAdLoadCallback.onFailure(adError2);
            return;
        }
        Activity activity = (Activity) context;
        UnityBannerSize unityBannerSize = UnityAdsAdapterUtils.getUnityBannerSize(context, adSize);
        if (unityBannerSize != null) {
            this.unityInitializer.initializeUnityAds(context, this.gameId, new Pf0(this, context, activity, unityBannerSize, this.mediationBannerAdConfiguration.getBidResponse()));
            return;
        }
        AdError adError3 = new AdError(110, ERROR_MSG_NO_MATCHING_AD_SIZE + adSize, "com.google.ads.mediation.unity");
        adError3.toString();
        this.mediationBannerAdLoadCallback.onFailure(adError3);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerClick(BannerView bannerView) {
        new StringBuilder("Unity Ads banner ad was clicked for placement ID: ").append(bannerView.getPlacementId());
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.reportAdClicked();
        this.mediationBannerAdCallback.onAdOpened();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        AdError adErrorA = UnityAdsAdapterUtils.a(UnityAdsAdapterUtils.e(bannerErrorInfo), bannerErrorInfo.errorMessage);
        adErrorA.toString();
        this.mediationBannerAdLoadCallback.onFailure(adErrorA);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLeftApplication(BannerView bannerView) {
        new StringBuilder("Unity Ads banner ad left application for placement ID: ").append(bannerView.getPlacementId());
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLoaded(BannerView bannerView) {
        new StringBuilder("Unity Ads finished loading banner ad for placement ID: ").append(bannerView.getPlacementId());
        this.mediationBannerAdCallback = this.mediationBannerAdLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerShown(BannerView bannerView) {
        new StringBuilder("Unity Ads banner ad was shown for placement ID: ").append(bannerView.getPlacementId());
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
