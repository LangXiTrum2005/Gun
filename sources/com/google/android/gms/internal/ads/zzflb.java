package com.google.android.gms.internal.ads;

import com.efs.sdk.base.Constants;

/* JADX INFO: loaded from: classes3.dex */
public enum zzflb {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(Constants.CP_NONE);

    private final String zze;

    zzflb(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
