package com.unity3d.services.banners;

import android.content.Context;
import com.umeng.analytics.pro.f;
import com.unity3d.services.core.misc.ViewUtilities;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;

/* JADX INFO: loaded from: classes4.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;
    public static final Companion Companion = new Companion(null);
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);
    private static final UnityBannerSize standard = new UnityBannerSize(EnumC4719u30.WEBVIEW_ERROR_VALUE, 50);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final UnityBannerSize getDynamicSize(Context context) {
            AbstractC2995aW.q(context, f.X);
            int iU = AbstractC3375el.U(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            if (iU >= getLeaderboard().getWidth()) {
                return getLeaderboard();
            }
            return iU >= getIabStandard().getWidth() ? getIabStandard() : getStandard();
        }

        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }
    }

    public UnityBannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static final UnityBannerSize getDynamicSize(Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
