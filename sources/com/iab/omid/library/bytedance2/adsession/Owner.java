package com.iab.omid.library.bytedance2.adsession;

import com.efs.sdk.base.Constants;

/* JADX INFO: loaded from: classes3.dex */
public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(Constants.CP_NONE);

    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
