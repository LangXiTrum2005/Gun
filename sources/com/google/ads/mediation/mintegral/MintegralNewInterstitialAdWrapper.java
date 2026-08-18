package com.google.ads.mediation.mintegral;

import android.content.Context;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;

/* JADX INFO: loaded from: classes2.dex */
public interface MintegralNewInterstitialAdWrapper {
    void createAd(Context context, String str, String str2);

    void load();

    void playVideoMute(int i);

    void setInterstitialVideoListener(NewInterstitialWithCodeListener newInterstitialWithCodeListener);

    void show();
}
