package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sf0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class UnityRewardedAd implements MediationRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f783a;
    public final MediationAdLoadCallback b;
    public final UnityInitializer c;
    public final Hf0 d;
    public MediationRewardedAdCallback e;
    public String f;
    public String g;
    public final Qf0 h = new Qf0(this);
    public final Rf0 i = new Rf0(this);

    public UnityRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull UnityInitializer unityInitializer, @NonNull Hf0 hf0) {
        this.f783a = mediationRewardedAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.c = unityInitializer;
        this.d = hf0;
    }

    public void loadAd() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f783a;
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = serverParameters.getString("zoneId");
        if (UnityAdsAdapterUtils.areValidIds(string, string2)) {
            this.c.initializeUnityAds(context, string, new Sf0(this, context, string, string2, mediationRewardedAdConfiguration.getBidResponse()));
        } else {
            AdError adError = new AdError(101, "Missing or invalid server parameters.", "com.google.ads.mediation.unity");
            adError.toString();
            this.b.onFailure(adError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (context instanceof Activity) {
            String str = this.g;
            this.d.getClass();
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(str);
            unityAdsShowOptions.set(MBridgeConstans.EXTRA_KEY_WM, this.f783a.getWatermark());
            UnityAds.show((Activity) context, this.f, unityAdsShowOptions, this.i);
            return;
        }
        AdError adError = new AdError(105, "Unity Ads requires an Activity context to load ads.", "com.google.ads.mediation.unity");
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
