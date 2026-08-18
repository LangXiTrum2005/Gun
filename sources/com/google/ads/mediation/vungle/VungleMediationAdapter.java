package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.ads.mediation.vungle.rtb.VungleRtbAppOpenAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd;
import com.google.ads.mediation.vungle.waterfall.VungleWaterfallAppOpenAd;
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
import com.google.android.gms.ads.rewarded.RewardItem;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3573h1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ei0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZZ;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, InterfaceC3043b00 {
    public static final int ERROR_CANNOT_GET_BID_TOKEN = 108;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.ads";
    private C3573h1 adConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private ZZ rewardedAd;
    private VungleRtbAppOpenAd rtbAppOpenAd;
    private VungleRtbBannerAd rtbBannerAd;
    private VungleRtbInterstitialAd rtbInterstitialAd;
    private VungleRtbNativeAd rtbNativeAd;
    private VungleRtbRewardedAd rtbRewardedAd;
    private VungleRtbRewardedAd rtbRewardedInterstitialAd;
    private String userId;
    private final VungleFactory vungleFactory = new VungleFactory();
    private VungleWaterfallAppOpenAd waterfallAppOpenAd;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public static class VungleReward implements RewardItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f790a;
        public final int b;

        public VungleReward(String str, int i) {
            this.f790a = str;
            this.b = i;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public int getAmount() {
            return this.b;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        @NonNull
        public String getType() {
            return this.f790a;
        }
    }

    @NonNull
    public static AdError getAdError(@NonNull Ei0 ei0) {
        return new AdError(ei0.getCode(), ei0.getErrorMessage(), VUNGLE_SDK_ERROR_DOMAIN);
    }

    public static String getAdapterVersion() {
        return "7.4.3.0";
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        String biddingToken = VungleSdkWrapper.delegate.getBiddingToken(rtbSignalData.getContext());
        if (!TextUtils.isEmpty(biddingToken)) {
            signalCallbacks.onSuccess(biddingToken);
            return;
        }
        AdError adError = new AdError(108, "Liftoff Monetize returned an empty bid token.", ERROR_DOMAIN);
        adError.toString();
        signalCallbacks.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = VungleSdkWrapper.delegate.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        StringBuilder sb = new StringBuilder("Unexpected SDK version format: ");
        sb.append(sdkVersion);
        sb.append(". Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String adapterVersion = getAdapterVersion();
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
        if (VungleSdkWrapper.delegate.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", "appid", hashSet, str);
            }
            VungleInitializer.getInstance().initialize(str, context, new a(initializationCompleteCallback));
            return;
        }
        if (initializationCompleteCallback != null) {
            AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
            adError.toString();
            initializationCompleteCallback.onInitializationFailed(adError.toString());
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment());
        VungleWaterfallAppOpenAd vungleWaterfallAppOpenAd = new VungleWaterfallAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.waterfallAppOpenAd = vungleWaterfallAppOpenAd;
        vungleWaterfallAppOpenAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationNativeAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbNativeAd vungleRtbNativeAd = new VungleRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.userId = mediationExtras.getString(VungleConstants.KEY_USER_ID);
        }
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.adConfig = this.vungleFactory.createAdConfig();
        if (mediationExtras != null && mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            this.adConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        Context context = mediationRewardedAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string, context, new b(this, context, string2));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbAppOpenAd vungleRtbAppOpenAd = new VungleRtbAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbAppOpenAd = vungleRtbAppOpenAd;
        vungleRtbAppOpenAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationBannerAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbBannerAd vungleRtbBannerAd = new VungleRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbBannerAd = vungleRtbBannerAd;
        vungleRtbBannerAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbInterstitialAd vungleRtbInterstitialAd = new VungleRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbInterstitialAd = vungleRtbInterstitialAd;
        vungleRtbInterstitialAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationNativeAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbNativeAd vungleRtbNativeAd = new VungleRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbRewardedAd vungleRtbRewardedAd = new VungleRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        VungleRtbRewardedAd vungleRtbRewardedAd = new VungleRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedInterstitialAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdClicked(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdEnd(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToLoad(@NonNull X8 x8, @NonNull Ei0 ei0) {
        AdError adError = getAdError(ei0);
        adError.toString();
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToPlay(@NonNull X8 x8, @NonNull Ei0 ei0) {
        AdError adError = getAdError(ei0);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdImpression(@NonNull X8 x8) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLoaded(@NonNull X8 x8) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00
    public void onAdRewarded(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward(new VungleReward("vungle", 1));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdStart(@NonNull X8 x8) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        ZZ zz = this.rewardedAd;
        if (zz != null) {
            zz.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            AdError adError = new AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN);
            adError.toString();
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3043b00, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLeftApplication(@NonNull X8 x8) {
    }
}
