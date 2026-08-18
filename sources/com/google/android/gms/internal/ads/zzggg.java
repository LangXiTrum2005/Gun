package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggg {

    @Nullable
    private zzggq zza = null;

    @Nullable
    private zzgvp zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzggg() {
    }

    public final zzggg zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggg zzb(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzggg zzc(zzggq zzggqVar) {
        this.zza = zzggqVar;
        return this;
    }

    public final zzggi zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zzgvoVarZzb;
        zzggq zzggqVar = this.zza;
        if (zzggqVar == null || (zzgvpVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzggqVar.zzb() != zzgvpVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzggqVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzggo.zzc) {
            zzgvoVarZzb = zzgml.zza;
        } else if (this.zza.zzd() == zzggo.zzb) {
            zzgvoVarZzb = zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzggo.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzgvoVarZzb = zzgml.zzb(this.zzc.intValue());
        }
        return new zzggi(this.zza, this.zzb, zzgvoVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzggg(zzggh zzgghVar) {
    }
}
