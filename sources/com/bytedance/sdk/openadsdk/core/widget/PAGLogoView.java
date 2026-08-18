package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class PAGLogoView extends LinearLayout {
    public PAGLogoView(Context context) {
        this(context, null);
    }

    private void initView(Context context) {
        le.lk(context, 1.0f);
        int iLk = le.lk(context, 2.0f);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(le.lk(context, 14.0f), le.lk(context, 6.0f));
        layoutParams.leftMargin = iLk;
        zu.setLayoutParams(layoutParams);
        zu.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(context, "tt_ad_logo"));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = iLk;
        layoutParams2.rightMargin = iLk;
        oy.setLayoutParams(layoutParams2);
        oy.setText(com.bytedance.sdk.component.utils.tD.Lxb(context, "tt_logo_en"));
        oy.setTextSize(1, 8.0f);
        oy.setGravity(17);
        oy.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(zu);
        addView(oy);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iLk);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = le.lk(getContext(), 12.0f);
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.JXs.QAg.Lxb(this, layoutParams));
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    @RequiresApi(api = 21)
    public PAGLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }
}
