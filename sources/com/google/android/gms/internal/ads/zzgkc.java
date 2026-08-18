package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkc implements zzgdn {
    private final zzgdn zza;
    private final byte[] zzb;

    private zzgkc(zzgdn zzgdnVar, byte[] bArr) {
        this.zza = zzgdnVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgdn zzb(zzglk zzglkVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzgnh zzgnhVarZza = zzglkVar.zza(zzgdw.zza());
        zzgsi zzgsiVarZza = zzgsl.zza();
        zzgsiVarZza.zzb(zzgnhVarZza.zzg());
        zzgsiVarZza.zzc(zzgnhVarZza.zze());
        zzgsiVarZza.zza(zzgnhVarZza.zzb());
        zzgdn zzgdnVar = (zzgdn) zzgen.zzb((zzgsl) zzgsiVarZza.zzbr(), zzgdn.class);
        zzgtp zzgtpVarZzc = zzgnhVarZza.zzc();
        int iOrdinal = zzgtpVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgml.zzb(zzglkVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgml.zza(zzglkVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzgtpVarZzc)));
            }
            bArrZzc = zzgml.zza(zzglkVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzgml.zza.zzc();
        }
        return new zzgkc(zzgdnVar, bArrZzc);
    }

    public static zzgdn zzc(zzgdn zzgdnVar, zzgvo zzgvoVar) {
        return new zzgkc(zzgdnVar, zzgvoVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgnu.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
