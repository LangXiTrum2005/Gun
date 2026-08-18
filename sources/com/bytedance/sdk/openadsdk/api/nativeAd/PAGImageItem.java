package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes2.dex */
public class PAGImageItem {
    private final int LD;
    private final int Lxb;
    private float ZU;
    private final String lk;

    public PAGImageItem(int i, int i2, String str, float f) {
        this.Lxb = i;
        this.LD = i2;
        this.lk = str;
        this.ZU = f;
    }

    public float getDuration() {
        return this.ZU;
    }

    public int getHeight() {
        return this.Lxb;
    }

    public String getImageUrl() {
        return this.lk;
    }

    public int getWidth() {
        return this.LD;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, 0.0f);
    }
}
