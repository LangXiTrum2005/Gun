package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes2.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize Lxb;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.Lxb = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.Lxb;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.Lxb = pAGBannerSize;
    }
}
