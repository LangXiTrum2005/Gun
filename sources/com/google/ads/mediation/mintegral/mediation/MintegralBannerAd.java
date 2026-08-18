package com.google.ads.mediation.mintegral.mediation;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.out.BannerAdWithCodeListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MintegralBannerAd extends BannerAdWithCodeListener implements MediationBannerAd {
    protected MediationBannerAdConfiguration adConfiguration;
    protected final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> adLoadCallback;
    protected MediationBannerAdCallback bannerAdCallback;
    protected MBBannerView mbBannerView;

    public MintegralBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationBannerAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
    }

    @Nullable
    public static BannerSize getMintegralBannerSizeFromAdMobAdSize(@NonNull AdSize adSize, @NonNull Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(EnumC4719u30.WEBVIEW_ERROR_VALUE, 50));
        arrayList.add(new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
        arrayList.add(new AdSize(728, 90));
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            return null;
        }
        BannerSize bannerSize = adSizeFindClosestSize.equals(AdSize.BANNER) ? new BannerSize(4, 0, 0) : null;
        if (adSizeFindClosestSize.equals(AdSize.MEDIUM_RECTANGLE)) {
            bannerSize = new BannerSize(2, 0, 0);
        }
        if (adSizeFindClosestSize.equals(AdSize.LEADERBOARD)) {
            bannerSize = new BannerSize(3, adSizeFindClosestSize.getWidth(), 0);
        }
        return bannerSize == null ? new BannerSize(5, adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight()) : bannerSize;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void closeFullScreen(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.mbBannerView;
    }

    public abstract void loadAd();

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onClick(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onCloseBanner(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLeaveApp(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str) {
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        adErrorCreateSdkError.toString();
        this.adLoadCallback.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds) {
        MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback = this.adLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.bannerAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLogImpression(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void showFullScreen(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }
}
