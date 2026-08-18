package com.google.ads.mediation.mintegral;

import android.content.Context;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface MintegralBidNewInterstitialAdWrapper {
    void createAd(Context context, String str, String str2);

    void loadFromBid(String str);

    void playVideoMute(int i);

    void setExtraInfo(JSONObject jSONObject);

    void setInterstitialVideoListener(NewInterstitialWithCodeListener newInterstitialWithCodeListener);

    void showFromBid();
}
