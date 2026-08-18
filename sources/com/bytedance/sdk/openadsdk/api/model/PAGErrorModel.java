package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes2.dex */
public class PAGErrorModel {
    private final String LD;
    private final int Lxb;

    public PAGErrorModel(int i, String str) {
        this.Lxb = i;
        this.LD = str;
    }

    public int getErrorCode() {
        return this.Lxb;
    }

    public String getErrorMessage() {
        return this.LD;
    }
}
