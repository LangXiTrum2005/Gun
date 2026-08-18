package com.google.ads.mediation.mintegral.rtb;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralAppOpenAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralRtbAppOpenAd extends MintegralAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f762a;

    public MintegralRtbAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        super(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralAppOpenAd
    public void loadAd() {
        Bundle serverParameters = this.adConfiguration.getServerParameters();
        String string = serverParameters.getString(MintegralConstants.AD_UNIT_ID);
        String string2 = serverParameters.getString("placement_id");
        String bidResponse = this.adConfiguration.getBidResponse();
        this.f762a = bidResponse;
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        this.splashAdWrapper = MintegralFactory.createSplashAdWrapper();
        String watermark = this.adConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, watermark);
                this.splashAdWrapper.setExtraInfo(jSONObject);
            } catch (JSONException unused) {
            }
        }
        this.splashAdWrapper.createAd(string2, string);
        this.splashAdWrapper.setSplashLoadListener(this);
        this.splashAdWrapper.setSplashShowListener(this);
        this.splashAdWrapper.preLoadByToken(this.f762a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        Activity activity = (Activity) context;
        if (this.splashAdWrapper != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.splashAdWrapper.show(relativeLayout, this.f762a);
        }
    }
}
