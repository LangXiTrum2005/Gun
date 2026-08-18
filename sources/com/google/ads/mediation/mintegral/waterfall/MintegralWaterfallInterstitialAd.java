package com.google.ads.mediation.mintegral.waterfall;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralWaterfallInterstitialAd extends MintegralInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MintegralNewInterstitialAdWrapper f766a;

    public MintegralWaterfallInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd
    public void loadAd() {
        String string = this.adConfiguration.getServerParameters().getString(MintegralConstants.AD_UNIT_ID);
        String string2 = this.adConfiguration.getServerParameters().getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        MintegralNewInterstitialAdWrapper mintegralNewInterstitialAdWrapperCreateInterstitialHandler = MintegralFactory.createInterstitialHandler();
        this.f766a = mintegralNewInterstitialAdWrapperCreateInterstitialHandler;
        mintegralNewInterstitialAdWrapperCreateInterstitialHandler.createAd(this.adConfiguration.getContext(), string2, string);
        this.f766a.setInterstitialVideoListener(this);
        this.f766a.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f766a.playVideoMute(MintegralUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()) ? 1 : 2);
        this.f766a.show();
    }
}
