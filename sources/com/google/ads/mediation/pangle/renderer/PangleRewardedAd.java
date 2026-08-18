package com.google.ads.mediation.pangle.renderer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm0;

/* JADX INFO: loaded from: classes2.dex */
public class PangleRewardedAd implements MediationRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f779a;
    public final MediationAdLoadCallback b;
    public final PangleInitializer c;
    public final PangleSdkWrapper d;
    public final PangleFactory e;
    public final PanglePrivacyConfig f;
    public MediationRewardedAdCallback g;
    public PAGRewardedAd h;

    public PangleRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory, @NonNull PanglePrivacyConfig panglePrivacyConfig) {
        this.f779a = mediationRewardedAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.c = pangleInitializer;
        this.d = pangleSdkWrapper;
        this.e = pangleFactory;
        this.f = panglePrivacyConfig;
    }

    public void render() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f779a;
        this.f.setCoppa(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(PangleConstants.PLACEMENT_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            adErrorCreateAdapterError.toString();
            this.b.onFailure(adErrorCreateAdapterError);
        } else {
            String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
            this.c.initialize(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new GT(this, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.h.setAdInteractionListener(new Wm0(this, 17));
        if (context instanceof Activity) {
            this.h.show((Activity) context);
        } else {
            this.h.show(null);
        }
    }
}
