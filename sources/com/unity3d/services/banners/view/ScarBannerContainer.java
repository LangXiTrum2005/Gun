package com.unity3d.services.banners.view;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.Utilities;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC2928Zc;

/* JADX INFO: loaded from: classes4.dex */
public class ScarBannerContainer extends RelativeLayout {
    private String _bannerAdId;

    public ScarBannerContainer(Context context, String str) {
        super(context);
        this._bannerAdId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$destroy$0(ScarBannerContainer scarBannerContainer) {
        scarBannerContainer.removeAllViews();
        ViewParent parent = scarBannerContainer.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(scarBannerContainer);
        }
    }

    public void destroy() {
        Utilities.runOnUiThread(new RunnableC2928Zc(this, 25));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BannerBridge.didAttachScarBanner(this._bannerAdId);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BannerBridge.didDetachScarBanner(this._bannerAdId);
    }
}
