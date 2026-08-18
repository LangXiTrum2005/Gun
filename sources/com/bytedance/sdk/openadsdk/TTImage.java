package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes2.dex */
public class TTImage {
    private final int LD;
    private final int Lxb;
    private double ZU;
    private final String lk;

    public TTImage(int i, int i2, String str, double d) {
        this.Lxb = i;
        this.LD = i2;
        this.lk = str;
        this.ZU = d;
    }

    public double getDuration() {
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

    public boolean isValid() {
        String str;
        return this.Lxb > 0 && this.LD > 0 && (str = this.lk) != null && str.length() > 0;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
    }
}
