package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jf0;

/* JADX INFO: loaded from: classes2.dex */
public class UnityBannerEventAdapter implements IUnityEventAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationBannerListener f787a;
    public final MediationBannerAdapter b;

    public UnityBannerEventAdapter(MediationBannerListener mediationBannerListener, MediationBannerAdapter mediationBannerAdapter) {
        this.f787a = mediationBannerListener;
        this.b = mediationBannerAdapter;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        MediationBannerListener mediationBannerListener = this.f787a;
        if (mediationBannerListener == null) {
            return;
        }
        int i = Jf0.f3275a[adEvent.ordinal()];
        MediationBannerAdapter mediationBannerAdapter = this.b;
        if (i == 1) {
            mediationBannerListener.onAdLoaded(mediationBannerAdapter);
            return;
        }
        if (i == 2) {
            mediationBannerListener.onAdOpened(mediationBannerAdapter);
            return;
        }
        if (i == 3) {
            mediationBannerListener.onAdClicked(mediationBannerAdapter);
        } else if (i == 4) {
            mediationBannerListener.onAdClosed(mediationBannerAdapter);
        } else {
            if (i != 5) {
                return;
            }
            mediationBannerListener.onAdLeftApplication(mediationBannerAdapter);
        }
    }
}
