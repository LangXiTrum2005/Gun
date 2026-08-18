package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nf0;

/* JADX INFO: loaded from: classes2.dex */
public class UnityInterstitialEventAdapter implements IUnityEventAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterstitialListener f788a;
    public final MediationInterstitialAdapter b;

    public UnityInterstitialEventAdapter(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f788a = mediationInterstitialListener;
        this.b = mediationInterstitialAdapter;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        MediationInterstitialListener mediationInterstitialListener = this.f788a;
        if (mediationInterstitialListener == null) {
            return;
        }
        int i = Nf0.f3467a[adEvent.ordinal()];
        MediationInterstitialAdapter mediationInterstitialAdapter = this.b;
        if (i == 1) {
            mediationInterstitialListener.onAdLoaded(mediationInterstitialAdapter);
            return;
        }
        if (i == 2) {
            mediationInterstitialListener.onAdOpened(mediationInterstitialAdapter);
            return;
        }
        if (i == 3) {
            mediationInterstitialListener.onAdClicked(mediationInterstitialAdapter);
        } else if (i == 4) {
            mediationInterstitialListener.onAdClosed(mediationInterstitialAdapter);
        } else {
            if (i != 5) {
                return;
            }
            mediationInterstitialListener.onAdLeftApplication(mediationInterstitialAdapter);
        }
    }
}
