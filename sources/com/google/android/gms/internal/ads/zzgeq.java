package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgeq {
    public static zzgek zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgsp zzgspVarZzf = zzgsp.zzf(bArr, zzgxb.zza());
            zzgmk zzgmkVarZzc = zzgmk.zzc();
            zzgni zzgniVarZza = zzgni.zza(zzgspVarZzf);
            return !zzgmkVarZzc.zzk(zzgniVarZza) ? new zzgll(zzgniVarZza) : zzgmkVarZzc.zzb(zzgniVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzgek zzgekVar) throws GeneralSecurityException {
        return ((zzgni) zzgmk.zzc().zze(zzgekVar, zzgni.class)).zzc().zzaV();
    }
}
