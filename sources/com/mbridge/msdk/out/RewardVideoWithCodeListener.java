package com.mbridge.msdk.out;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.util.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RewardVideoWithCodeListener implements RewardVideoListener {
    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, a.b(PathInterpolatorCompat.MAX_NUM_POINTS, str), str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str);

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        onVideoLoadFailWithCode(mBridgeIds, a.a(PathInterpolatorCompat.MAX_NUM_POINTS, str), str);
    }

    public abstract void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str);
}
