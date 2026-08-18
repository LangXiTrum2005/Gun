package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgei {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgeh zza(String str) throws GeneralSecurityException {
        for (zzgeh zzgehVar : zza) {
            if (zzgehVar.zza()) {
                return zzgehVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
