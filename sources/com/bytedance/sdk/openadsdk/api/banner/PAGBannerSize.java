package com.bytedance.sdk.openadsdk.api.banner;

import androidx.recyclerview.widget.ItemTouchHelper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;

/* JADX INFO: loaded from: classes2.dex */
public final class PAGBannerSize {
    private final int LD;
    private final int Lxb;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(EnumC4719u30.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.Lxb = i;
        this.LD = i2;
    }

    public int getHeight() {
        return this.LD;
    }

    public int getWidth() {
        return this.Lxb;
    }
}
