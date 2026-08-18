package com.google.ads.mediation.mintegral.waterfall;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralSplashAdWrapper;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralAppOpenAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralWaterfallAppOpenAd extends MintegralAppOpenAd {
    public MintegralWaterfallAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        super(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralAppOpenAd
    public void loadAd() {
        Bundle serverParameters = this.adConfiguration.getServerParameters();
        String string = serverParameters.getString(MintegralConstants.AD_UNIT_ID);
        String string2 = serverParameters.getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        MintegralSplashAdWrapper mintegralSplashAdWrapperCreateSplashAdWrapper = MintegralFactory.createSplashAdWrapper();
        this.splashAdWrapper = mintegralSplashAdWrapperCreateSplashAdWrapper;
        mintegralSplashAdWrapperCreateSplashAdWrapper.createAd(string2, string);
        this.splashAdWrapper.setSplashLoadListener(this);
        this.splashAdWrapper.setSplashShowListener(this);
        this.splashAdWrapper.preLoad();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        Activity activity = (Activity) context;
        if (this.splashAdWrapper != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.splashAdWrapper.show(relativeLayout);
        }
    }
}
