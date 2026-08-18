package com.google.ads.mediation.mintegral.waterfall;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBRewardVideoHandler;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralWaterfallRewardedAd extends MintegralRewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MBRewardVideoHandler f768a;

    public MintegralWaterfallRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd
    public void loadAd() {
        String string = this.adConfiguration.getServerParameters().getString(MintegralConstants.AD_UNIT_ID);
        String string2 = this.adConfiguration.getServerParameters().getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        MBRewardVideoHandler mBRewardVideoHandler = new MBRewardVideoHandler(this.adConfiguration.getContext(), string2, string);
        this.f768a = mBRewardVideoHandler;
        mBRewardVideoHandler.setRewardVideoListener(this);
        this.f768a.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.f768a.playVideoMute(MintegralUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()) ? 1 : 2);
        this.f768a.show();
    }
}
