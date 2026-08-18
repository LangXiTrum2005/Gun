package com.google.ads.mediation.pangle.renderer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm0;

/* JADX INFO: loaded from: classes2.dex */
public class PangleInterstitialAd implements MediationInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f776a;
    public final MediationAdLoadCallback b;
    public final PangleInitializer c;
    public final PangleSdkWrapper d;
    public final PangleFactory e;
    public final PanglePrivacyConfig f;
    public MediationInterstitialAdCallback g;
    public PAGInterstitialAd h;

    public PangleInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory, @NonNull PanglePrivacyConfig panglePrivacyConfig) {
        this.f776a = mediationInterstitialAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.c = pangleInitializer;
        this.d = pangleSdkWrapper;
        this.e = pangleFactory;
        this.f = panglePrivacyConfig;
    }

    public void render() {
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.f776a;
        this.f.setCoppa(mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(PangleConstants.PLACEMENT_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            adErrorCreateAdapterError.toString();
            this.b.onFailure(adErrorCreateAdapterError);
        } else {
            String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
            this.c.initialize(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new BT(this, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.h.setAdInteractionListener(new Wm0(this, 16));
        if (context instanceof Activity) {
            this.h.show((Activity) context);
        } else {
            this.h.show(null);
        }
    }
}
