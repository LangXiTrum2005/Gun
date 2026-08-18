package com.google.ads.mediation.mintegral.rtb;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralRtbInterstitialAd extends MintegralInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MintegralBidNewInterstitialAdWrapper f763a;

    public MintegralRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd
    public void loadAd() {
        String string = this.adConfiguration.getServerParameters().getString(MintegralConstants.AD_UNIT_ID);
        String string2 = this.adConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = this.adConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        MintegralBidNewInterstitialAdWrapper mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler = MintegralFactory.createBidInterstitialHandler();
        this.f763a = mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler;
        mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler.createAd(this.adConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, this.adConfiguration.getWatermark());
            this.f763a.setExtraInfo(jSONObject);
        } catch (JSONException unused) {
        }
        this.f763a.setInterstitialVideoListener(this);
        this.f763a.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f763a.playVideoMute(MintegralUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()) ? 1 : 2);
        this.f763a.showFromBid();
    }
}
