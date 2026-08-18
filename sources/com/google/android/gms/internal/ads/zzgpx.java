package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgpx implements zzgej {
    private zzgpx(zzgej zzgejVar, zzgtp zzgtpVar, byte[] bArr) {
    }

    public static zzgej zza(zzglk zzglkVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzgnh zzgnhVarZza = zzglkVar.zza(zzgdw.zza());
        zzgsi zzgsiVarZza = zzgsl.zza();
        zzgsiVarZza.zzb(zzgnhVarZza.zzg());
        zzgsiVarZza.zzc(zzgnhVarZza.zze());
        zzgsiVarZza.zza(zzgnhVarZza.zzb());
        zzgej zzgejVar = (zzgej) zzgen.zzb((zzgsl) zzgsiVarZza.zzbr(), zzgej.class);
        zzgtp zzgtpVarZzc = zzgnhVarZza.zzc();
        int iOrdinal = zzgtpVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgml.zzb(zzglkVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgml.zza(zzglkVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzgml.zza(zzglkVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzgml.zza.zzc();
        }
        return new zzgpx(zzgejVar, zzgtpVarZzc, bArrZzc);
    }
}
