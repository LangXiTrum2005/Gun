package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqy extends IOException {
    public final int zza;

    public zzqy(Throwable th, int i) {
        super(th);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
