package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.common.lc;

/* JADX INFO: loaded from: classes2.dex */
public interface PAGLoadListener<Ad> extends lc {
    @MainThread
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.lc
    @MainThread
    void onError(int i, String str);
}
