package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.google.ads.mediation.facebook.rtb.FacebookRtbBannerAd;
import com.google.ads.mediation.facebook.rtb.FacebookRtbInterstitialAd;
import com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4528rt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4616st;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetaFactory f750a = new MetaFactory();

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    @NonNull
    public static AdError getAdError(com.facebook.ads.AdError adError) {
        return new AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    @Nullable
    public static String getPlacementID(@NonNull Bundle bundle) {
        String string = bundle.getString("placement_id");
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(@NonNull MediationAdConfiguration mediationAdConfiguration) {
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = FacebookSdkWrapper.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
        sb.append(sdkVersion);
        sb.append(".Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String adapterVersion = FacebookAdapterUtils.getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
        }
        StringBuilder sb = new StringBuilder("Unexpected adapter version format: ");
        sb.append(adapterVersion);
        sb.append(".Returning 0.0.0 for adapter version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String placementID = getPlacementID(it.next().getServerParameters());
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (arrayList.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed("Initialization failed. No placement IDs found.");
            return;
        }
        if (C4528rt.d == null) {
            C4528rt.d = new C4528rt();
        }
        C4528rt c4528rt = C4528rt.d;
        C4616st c4616st = new C4616st(initializationCompleteCallback);
        if (c4528rt.f4952a) {
            c4528rt.c.add(c4616st);
            return;
        }
        if (c4528rt.b) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        c4528rt.f4952a = true;
        if (c4528rt == null) {
            C4528rt.d = new C4528rt();
        }
        C4528rt.d.c.add(c4616st);
        AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.19.0.0").withPlacementIds(arrayList).withInitListener(c4528rt).initialize();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new FacebookRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.f750a).render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new FacebookRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.f750a).render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        new FacebookRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.f750a).render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new FacebookRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f750a).render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new FacebookRewardedInterstitialAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f750a).render();
    }
}
