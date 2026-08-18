package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C8 {
    public static AdError A00(C0597Ag c0597Ag) {
        if (c0597Ag.A03().isPublicError()) {
            return new AdError(c0597Ag.A03().getErrorCode(), c0597Ag.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
