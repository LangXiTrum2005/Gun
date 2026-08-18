package com.mbridge.msdk.newinterstitial.out;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.util.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NewInterstitialWithCodeListener implements NewInterstitialListener {
    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        onResourceLoadFailWithCode(mBridgeIds, a.a(PathInterpolatorCompat.MAX_NUM_POINTS, str), str);
    }

    public abstract void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str);

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, a.b(PathInterpolatorCompat.MAX_NUM_POINTS, str), str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str);
}
