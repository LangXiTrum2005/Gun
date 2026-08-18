package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Df0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class UnityAdapter extends UnityMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private WeakReference<Activity> activityWeakReference;
    private UnityBannerAd bannerAd;
    private UnityInterstitialEventAdapter eventAdapter;
    private MediationInterstitialListener mediationInterstitialListener;
    private String objectId;
    private String placementId;
    private final IUnityAdsLoadListener unityLoadListener = new a(this);
    private final IUnityAdsShowListener unityShowListener = new b(this);

    private void sendAdFailedToLoad(int i, String str) {
        AdError adErrorA = UnityAdsAdapterUtils.a(i, str);
        adErrorA.toString();
        MediationInterstitialListener mediationInterstitialListener = this.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdFailedToLoad(this, adErrorA);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.bannerAd.getBannerView();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        this.mediationInterstitialListener = null;
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UnityBannerAd unityBannerAd = new UnityBannerAd();
        this.bannerAd = unityBannerAd;
        unityBannerAd.requestBannerAd(context, mediationBannerListener, bundle, adSize, mediationAdRequest, bundle2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        this.mediationInterstitialListener = mediationInterstitialListener;
        this.eventAdapter = new UnityInterstitialEventAdapter(mediationInterstitialListener, this);
        String string = bundle.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = bundle.getString("zoneId");
        this.placementId = string2;
        if (!UnityAdsAdapterUtils.areValidIds(string, string2)) {
            sendAdFailedToLoad(101, "Missing or invalid server parameters.");
            return;
        }
        if (!(context instanceof Activity)) {
            sendAdFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
            return;
        }
        this.activityWeakReference = new WeakReference<>((Activity) context);
        UnityInitializer.a().initializeUnityAds(context, string, new Df0(this, string));
        UnityAdsAdapterUtils.setCoppa(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), context);
        this.objectId = UUID.randomUUID().toString();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(this.objectId);
        UnityAds.load(this.placementId, unityAdsLoadOptions, this.unityLoadListener);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        WeakReference<Activity> weakReference = this.activityWeakReference;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
            return;
        }
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        unityAdsShowOptions.setObjectId(this.objectId);
        UnityAds.show(activity, this.placementId, unityAdsShowOptions, this.unityShowListener);
    }
}
