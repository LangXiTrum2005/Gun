package com.google.ads.mediation.mintegral.mediation;

import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralNativeAdListener extends NativeAdWithCodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MintegralNativeAd f761a;
    protected MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> adLoadCallback;
    protected MediationNativeAdCallback nativeCallback;

    public MintegralNativeAdListener(@NonNull MintegralNativeAd mintegralNativeAd) {
        this.f761a = mintegralNativeAd;
        this.adLoadCallback = mintegralNativeAd.adLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.nativeCallback.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public void onAdLoadErrorWithCode(int i, String str) {
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        adErrorCreateSdkError.toString();
        this.adLoadCallback.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i) {
        if (list == null || list.size() == 0) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(104, "Mintegral SDK failed to return a native ad.");
            adErrorCreateAdapterError.toString();
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            Campaign campaign = list.get(0);
            MintegralNativeAd mintegralNativeAd = this.f761a;
            mintegralNativeAd.mapNativeAd(campaign);
            this.nativeCallback = this.adLoadCallback.onSuccess(mintegralNativeAd);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i) {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }
}
