package com.google.ads.mediation.pangle.renderer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5015xT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;

/* JADX INFO: loaded from: classes2.dex */
public class PangleAppOpenAd implements MediationAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationAppOpenAdConfiguration f774a;
    public final MediationAdLoadCallback b;
    public final PangleInitializer c;
    public final PangleSdkWrapper d;
    public final PangleFactory e;
    public final PanglePrivacyConfig f;
    public MediationAppOpenAdCallback g;
    public PAGAppOpenAd h;

    public PangleAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, @NonNull PangleInitializer pangleInitializer, @NonNull PangleSdkWrapper pangleSdkWrapper, @NonNull PangleFactory pangleFactory, @NonNull PanglePrivacyConfig panglePrivacyConfig) {
        this.f774a = mediationAppOpenAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.c = pangleInitializer;
        this.d = pangleSdkWrapper;
        this.e = pangleFactory;
        this.f = panglePrivacyConfig;
    }

    public void render() {
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = this.f774a;
        this.f.setCoppa(mediationAppOpenAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString(PangleConstants.PLACEMENT_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            adErrorCreateAdapterError.toString();
            this.b.onFailure(adErrorCreateAdapterError);
        } else {
            String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
            this.c.initialize(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new C5015xT(this, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        this.h.setAdInteractionListener(new NN(this, 16));
        if (context instanceof Activity) {
            this.h.show((Activity) context);
        } else {
            this.h.show(null);
        }
    }
}
