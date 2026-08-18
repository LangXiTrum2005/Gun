package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.MetaFactory;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class FacebookRtbInterstitialAd implements MediationInterstitialAd, InterstitialAdExtendedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f753a;
    public final MediationAdLoadCallback b;
    public InterstitialAd c;
    public MediationInterstitialAdCallback d;
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean f = new AtomicBoolean();
    public final MetaFactory g;

    public FacebookRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, MetaFactory metaFactory) {
        this.f753a = mediationInterstitialAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.g = metaFactory;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.d.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        this.d = (MediationInterstitialAdCallback) this.b.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getMessage();
        if (!this.e.get()) {
            this.b.onFailure(adError2);
            return;
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f.getAndSet(true) || (mediationInterstitialAdCallback = this.d) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f.getAndSet(true) || (mediationInterstitialAdCallback = this.d) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    public void render() {
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.f753a;
        String placementID = FacebookMediationAdapter.getPlacementID(mediationInterstitialAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty. ", "com.google.ads.mediation.facebook");
            adError.getMessage();
            this.b.onFailure(adError);
        } else {
            FacebookMediationAdapter.setMixedAudience(mediationInterstitialAdConfiguration);
            this.c = this.g.createInterstitialAd(mediationInterstitialAdConfiguration.getContext(), placementID);
            if (!TextUtils.isEmpty(mediationInterstitialAdConfiguration.getWatermark())) {
                this.c.setExtraHints(new ExtraHints.Builder().mediationData(mediationInterstitialAdConfiguration.getWatermark()).build());
            }
            InterstitialAd interstitialAd = this.c;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(mediationInterstitialAdConfiguration.getBidResponse()).withAdListener(this).build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.e.set(true);
        if (this.c.show()) {
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", "com.google.ads.mediation.facebook");
        adError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }
}
