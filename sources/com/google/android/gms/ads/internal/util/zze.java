package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes2.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {
    public static void zza(String str) {
        if (!zzc() || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : com.google.android.gms.ads.internal.util.client.zzo.zza.zzd(str)) {
        }
    }

    public static void zzb(String str, Throwable th) {
        zzc();
    }

    public static boolean zzc() {
        return com.google.android.gms.ads.internal.util.client.zzo.zzm(2) && ((Boolean) zzben.zza.zze()).booleanValue();
    }
}
