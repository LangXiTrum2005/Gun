package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MF extends C1857kU {
    public IB A00;

    public final void A06(C1828k1 c1828k1, NativeBannerAd nativeBannerAd, AW aw, NativeAdLayout nativeAdLayout) {
        MediaView mediaView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        aw.A09(adOptionsView, 20);
        this.A00 = new C1369cT(c1828k1, nativeBannerAd, aw, C1744ie.A0L(nativeBannerAd.getInternalNativeAd()).A18(), mediaView, adOptionsView);
        D3.A0K(nativeAdLayout, aw.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
        contentParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), contentParams);
    }

    @Override // com.facebook.ads.redexgen.core.C05026m, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
