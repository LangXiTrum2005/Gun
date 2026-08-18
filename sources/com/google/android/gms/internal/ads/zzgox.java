package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgox {
    static {
        int i = zzgts.zza;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgpd.zzd();
        zzgoj.zzd();
        zzgor.zza(true);
        if (zzgkt.zzb()) {
            return;
        }
        zzgob.zzd(true);
    }
}
