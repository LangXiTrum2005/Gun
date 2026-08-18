package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes2.dex */
public class PAGRewardItem {
    private final String LD;
    private final int Lxb;

    public PAGRewardItem(int i, String str) {
        this.Lxb = i;
        this.LD = str;
    }

    public int getRewardAmount() {
        return this.Lxb;
    }

    public String getRewardName() {
        return this.LD;
    }
}
