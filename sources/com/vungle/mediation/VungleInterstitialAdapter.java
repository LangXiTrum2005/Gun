package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3018aj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3105bi0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3573h1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Di0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zi0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class VungleInterstitialAdapter extends VungleMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private Di0 bannerAdView;
    private RelativeLayout bannerLayout;
    private OD interstitialAd;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;

    @NonNull
    public static C3105bi0 getVungleBannerAdSizeFromGoogleAdSize(AdSize adSize, String str) {
        C3105bi0 validAdSizeFromSize = C3105bi0.getValidAdSizeFromSize(adSize.getWidth(), adSize.getHeight(), str);
        adSize.toString();
        Objects.toString(validAdSizeFromSize);
        return validAdSizeFromSize;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        hashCode();
        return this.bannerLayout;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        hashCode();
        if (this.bannerAdView != null) {
            this.bannerLayout.removeAllViews();
            this.bannerAdView.finishAd();
            this.bannerAdView = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        VungleInitializer.getInstance().updateCoppaStatus(mediationAdRequest.taggedForChildDirectedTreatment());
        String string2 = bundle.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationBannerListener.onAdFailedToLoad(this, adError2);
        } else {
            C3105bi0 vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(adSize, string2);
            hashCode();
            VungleInitializer.getInstance().initialize(string, context, new C3018aj0(this, context, adSize, vungleBannerAdSizeFromGoogleAdSize, string2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        String string2 = bundle.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationInterstitialListener.onAdFailedToLoad(this, adError2);
        } else {
            VungleInitializer.getInstance().updateCoppaStatus(mediationAdRequest.taggedForChildDirectedTreatment());
            C3573h1 c3573h1 = new C3573h1();
            if (bundle2 != null && bundle2.containsKey(VungleConstants.KEY_ORIENTATION)) {
                c3573h1.setAdOrientation(bundle2.getInt(VungleConstants.KEY_ORIENTATION, 2));
            }
            VungleInitializer.getInstance().initialize(string, context, new Zi0(this, context, string2, c3573h1, mediationInterstitialListener));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        OD od = this.interstitialAd;
        if (od != null) {
            od.play(null);
        }
    }
}
