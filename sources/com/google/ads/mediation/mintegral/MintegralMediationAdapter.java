package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbAppOpenAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbBannerAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbInterstitialAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbNativeAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbRewardedAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallAppOpenAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallBannerAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallInterstitialAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallNativeAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
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
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC5099yP;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralMediationAdapter extends RtbAdapter {
    public static final String TAG = "MintegralMediationAdapter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static MBridgeSDKImpl f759a;

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidManager.getBuyerUid(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = MintegralUtils.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("_");
        if (strArrSplit.length > 1) {
            String[] strArrSplit2 = strArrSplit[1].split("\\.");
            if (strArrSplit2.length >= 3) {
                return new VersionInfo(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]), Integer.parseInt(strArrSplit2[2]));
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
        sb.append(sdkVersion);
        sb.append(". Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String adapterVersion = MintegralUtils.getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
        }
        StringBuilder sb = new StringBuilder("Unexpected adapter version format: ");
        sb.append(adapterVersion);
        sb.append(". Returning 0.0.0 for adapter version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            Bundle serverParameters = it.next().getServerParameters();
            String string = serverParameters.getString("app_id");
            String string2 = serverParameters.getString("app_key");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                hashSet2.add(string2);
            }
        }
        int size = hashSet.size();
        int size2 = hashSet2.size();
        if (size <= 0 || size2 <= 0) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(101, "Missing or invalid App ID or App Key configured for this ad source instance in the AdMob or Ad Manager UI");
            adErrorCreateAdapterError.toString();
            initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        String str2 = (String) hashSet2.iterator().next();
        if (size > 1) {
            String.format("Found multiple app IDs in %s. Using %s to initialize Mintegral SDK.", hashSet, str);
        }
        if (size2 > 1) {
            String.format("Found multiple App Keys in %s. Using %s to initialize Mintegral SDK.", hashSet2, str2);
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        f759a = mBridgeSDK;
        Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(str, str2);
        try {
            Aa aa = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa, "Y+H6DFttYrPQYcIBiQKwJQKQYrN=");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        new Thread(new RunnableC5099yP(this, mBConfigurationMap, context, initializationCompleteCallback, 0)).start();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        new MintegralWaterfallAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new MintegralWaterfallBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new MintegralWaterfallInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        new MintegralWaterfallNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new MintegralWaterfallRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        new MintegralRtbAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new MintegralRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new MintegralRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        new MintegralRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback).loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new MintegralRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback).loadAd();
    }
}
