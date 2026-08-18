package com.google.ads.mediation.mintegral.waterfall;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralWaterfallBannerAd extends MintegralBannerAd {
    public MintegralWaterfallBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        super(mediationBannerAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralBannerAd
    public void loadAd() {
        BannerSize mintegralBannerSizeFromAdMobAdSize = MintegralBannerAd.getMintegralBannerSizeFromAdMobAdSize(this.adConfiguration.getAdSize(), this.adConfiguration.getContext());
        if (mintegralBannerSizeFromAdMobAdSize == null) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(102, "The requested banner size: " + this.adConfiguration.getAdSize() + " is not supported by Mintegral SDK.");
            adErrorCreateAdapterError.toString();
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
            return;
        }
        String string = this.adConfiguration.getServerParameters().getString(MintegralConstants.AD_UNIT_ID);
        String string2 = this.adConfiguration.getServerParameters().getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(this.adConfiguration.getContext());
        this.mbBannerView = mBBannerView;
        mBBannerView.init(mintegralBannerSizeFromAdMobAdSize, string2, string);
        this.mbBannerView.setLayoutParams(new FrameLayout.LayoutParams(MintegralUtils.convertDipToPixel(this.adConfiguration.getContext(), mintegralBannerSizeFromAdMobAdSize.getWidth()), MintegralUtils.convertDipToPixel(this.adConfiguration.getContext(), mintegralBannerSizeFromAdMobAdSize.getHeight())));
        this.mbBannerView.setBannerAdListener(this);
        this.mbBannerView.load();
    }
}
