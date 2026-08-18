package com.google.ads.mediation.pangle.renderer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5191zT;

/* JADX INFO: loaded from: classes2.dex */
public class PangleBannerAd implements MediationBannerAd, PAGBannerAdInteractionListener {

    @VisibleForTesting
    public static final String ERROR_MESSAGE_BANNER_SIZE_MISMATCH = "Failed to request banner ad from Pangle. Invalid banner size.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationBannerAdConfiguration f775a;
    public final MediationAdLoadCallback b;
    public final PangleInitializer c;
    public final PangleSdkWrapper d;
    public final PangleFactory e;
    public final PanglePrivacyConfig f;
    public MediationBannerAdCallback g;
    public FrameLayout h;

    public PangleBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull PangleInitializer pangleInitializer, @NonNull PangleSdkWrapper pangleSdkWrapper, @NonNull PangleFactory pangleFactory, @NonNull PanglePrivacyConfig panglePrivacyConfig) {
        this.f775a = mediationBannerAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.c = pangleInitializer;
        this.d = pangleSdkWrapper;
        this.e = pangleFactory;
        this.f = panglePrivacyConfig;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.h;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public void render() {
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.f775a;
        this.f.setCoppa(mediationBannerAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString(PangleConstants.PLACEMENT_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            adErrorCreateAdapterError.toString();
            this.b.onFailure(adErrorCreateAdapterError);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            this.c.initialize(context, serverParameters.getString("appid"), new C5191zT(this, context, bidResponse, string));
        }
    }
}
