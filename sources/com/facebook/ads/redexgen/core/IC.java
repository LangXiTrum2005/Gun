package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IC extends LinearLayout {
    public static final int A00 = (int) (CP.A02 * 32.0f);
    public static final int A01 = (int) (CP.A02 * 8.0f);

    public IC(C1828k1 c1828k1, NativeAd nativeAd, AW aw, C0709Ff c0709Ff, AdOptionsView adOptionsView) {
        super(c1828k1);
        setOrientation(0);
        c0709Ff.setFullCircleCorners(true);
        LinearLayout.LayoutParams iconViewParams = new LinearLayout.LayoutParams(A00, A00);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(c0709Ff, iconViewParams);
        TextView textView = new TextView(c1828k1);
        aw.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView sponsoredTextView = new TextView(c1828k1);
        aw.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c1828k1);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams iconViewParams2 = new LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        LinearLayout.LayoutParams textContainerParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        LinearLayout.LayoutParams textContainerParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        ViewGroup.LayoutParams textContainerParams3 = new LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
