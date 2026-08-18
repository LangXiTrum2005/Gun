package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.ads.mediation.pangle.renderer.PangleAppOpenAd;
import com.google.ads.mediation.pangle.renderer.PangleBannerAd;
import com.google.ads.mediation.pangle.renderer.PangleInterstitialAd;
import com.google.ads.mediation.pangle.renderer.PangleNativeAd;
import com.google.ads.mediation.pangle.renderer.PangleRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3692iN;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";
    public static int e = -1;
    public static int f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PangleInitializer f771a = PangleInitializer.getInstance();
    public final PangleSdkWrapper b;
    public final PangleFactory c;
    public final PanglePrivacyConfig d;

    public PangleMediationAdapter() {
        PangleSdkWrapper pangleSdkWrapper = new PangleSdkWrapper();
        this.b = pangleSdkWrapper;
        this.c = new PangleFactory();
        this.d = new PanglePrivacyConfig(pangleSdkWrapper);
    }

    public static int getDoNotSell() {
        return f;
    }

    public static int getGDPRConsent() {
        return e;
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i) {
        new PangleSdkWrapper();
        if (i == 0 || i == 1 || i == -1) {
            if (PAGSdk.isInitSuccess()) {
                PAGConfig.setDoNotSell(i);
            }
            f = i;
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i) {
        new PangleSdkWrapper();
        if (i == 1 || i == 0 || i == -1) {
            if (PAGSdk.isInitSuccess()) {
                PAGConfig.setGDPRConsent(i);
            }
            e = i;
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        PangleSdkWrapper pangleSdkWrapper = this.b;
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            String string = networkExtras.getString("user_data", "");
            pangleSdkWrapper.getClass();
            PAGConfig.setUserData(string);
        }
        C3692iN c3692iN = new C3692iN(this, signalCallbacks, 19);
        pangleSdkWrapper.getClass();
        PAGSdk.getBiddingToken(c3692iN);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        this.b.getClass();
        String sDKVersion = PAGSdk.getSDKVersion();
        String[] strArrSplit = sDKVersion.split("\\.");
        if (strArrSplit.length < 3) {
            StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
            sb.append(sDKVersion);
            sb.append(". Returning 0.0.0 for SDK version.");
            return new VersionInfo(0, 0, 0);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i3 = (i3 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new VersionInfo(i, i2, i3);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = BuildConfig.ADAPTER_VERSION.split("\\.");
        if (strArrSplit.length < 4) {
            return new VersionInfo(0, 0, 0);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100);
        if (strArrSplit.length >= 5) {
            i3 = (i3 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new VersionInfo(i, i2, i3);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Missing or invalid App ID.");
            adErrorCreateAdapterError.toString();
            initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str);
            }
            this.d.setCoppa(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            this.f771a.initialize(context, str, new a(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        PangleFactory pangleFactory = this.c;
        pangleFactory.getClass();
        new PangleAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback, this.f771a, this.b, pangleFactory, this.d).render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        PangleFactory pangleFactory = this.c;
        pangleFactory.getClass();
        new PangleBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.f771a, this.b, pangleFactory, this.d).render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        PangleFactory pangleFactory = this.c;
        pangleFactory.getClass();
        new PangleInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.f771a, this.b, pangleFactory, this.d).render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        PangleFactory pangleFactory = this.c;
        pangleFactory.getClass();
        new PangleNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.f771a, this.b, pangleFactory, this.d).render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        PangleFactory pangleFactory = this.c;
        pangleFactory.getClass();
        new PangleRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.f771a, this.b, pangleFactory, this.d).render();
    }
}
