package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M7 extends C1857kU {
    public IB A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C1828k1 c1828k1, NativeAd nativeAd, AW aw) {
        C0709Ff c0709Ff = new C0709Ff(c1828k1);
        MediaView mediaView = new MediaView(c1828k1);
        AdOptionsView adOptionsView = new AdOptionsView(c1828k1, nativeAd, nativeAdLayout);
        aw.A09(adOptionsView, 28);
        this.A00 = new C1368cS(c1828k1, nativeAd, aw, C1744ie.A0L(nativeAd.getInternalNativeAd()).A18(), c0709Ff, mediaView, adOptionsView);
        D3.A0K(nativeAdLayout, aw.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c0709Ff, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C05026m, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
