package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzbcs {
    public static boolean zza(@Nullable zzbda zzbdaVar, @Nullable zzbcx zzbcxVar, String... strArr) {
        if (zzbcxVar == null) {
            return false;
        }
        zzbdaVar.zze(zzbcxVar, com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), strArr);
        return true;
    }
}
