package com.google.ads.mediation.pangle;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;

/* JADX INFO: loaded from: classes2.dex */
public class PangleFactory {
    public PAGAppOpenRequest createPagAppOpenRequest() {
        return new PAGAppOpenRequest();
    }

    public PAGBannerRequest createPagBannerRequest(PAGBannerSize pAGBannerSize) {
        return new PAGBannerRequest(pAGBannerSize);
    }

    public PAGInterstitialRequest createPagInterstitialRequest() {
        return new PAGInterstitialRequest();
    }

    public PAGNativeRequest createPagNativeRequest() {
        return new PAGNativeRequest();
    }

    public PAGRewardedRequest createPagRewardedRequest() {
        return new PAGRewardedRequest();
    }
}
