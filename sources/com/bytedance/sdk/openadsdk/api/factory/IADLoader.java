package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.lc;

/* JADX INFO: loaded from: classes2.dex */
public interface IADLoader<R extends PAGRequest, L extends lc> {
    void loadAd(String str, R r, L l);
}
