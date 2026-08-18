package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzfnz implements zzfoa {
    private static final zzasy zza;

    static {
        zzasc zzascVarZza = zzasy.zza();
        zzascVarZza.zzx(ExifInterface.LONGITUDE_EAST);
        zza = (zzasy) zzascVarZza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final zzasy zza() {
        return zza;
    }
}
