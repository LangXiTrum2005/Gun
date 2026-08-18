package com.mbridge.msdk.mbbid.common;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1408a;
    private String b;
    private String c;

    public c(String str, String str2) {
        this.f1408a = str;
        this.b = str2;
    }

    public String getmFloorPrice() {
        return this.c;
    }

    public String getmPlacementId() {
        return this.f1408a;
    }

    public String getmUnitId() {
        return this.b;
    }

    public void setmFloorPrice(String str) {
        this.c = str;
    }

    public void setmPlacementId(String str) {
        this.f1408a = str;
    }

    public void setmUnitId(String str) {
        this.b = str;
    }

    public c(String str, String str2, String str3) {
        this.f1408a = str;
        this.b = str2;
        this.c = str3;
    }
}
