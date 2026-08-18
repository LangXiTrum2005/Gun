package com.google.ads.mediation.mintegral;

import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface MintegralSplashAdWrapper {
    void createAd(String str, String str2);

    void onDestroy();

    void preLoad();

    void preLoadByToken(String str);

    void setExtraInfo(JSONObject jSONObject);

    void setSplashLoadListener(MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener);

    void setSplashShowListener(MBSplashShowListener mBSplashShowListener);

    void show(ViewGroup viewGroup);

    void show(ViewGroup viewGroup, String str);
}
