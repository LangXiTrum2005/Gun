package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfv {

    @Nullable
    private zzggf zza = null;

    @Nullable
    private zzgvp zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgfv() {
    }

    public final zzgfv zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfv zzb(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgfv zzc(zzggf zzggfVar) {
        this.zza = zzggfVar;
        return this;
    }

    public final zzgfx zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zzgvoVarZzb;
        zzggf zzggfVar = this.zza;
        if (zzggfVar == null || (zzgvpVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzggfVar.zzb() != zzgvpVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzggfVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzggd.zzc) {
            zzgvoVarZzb = zzgml.zza;
        } else if (this.zza.zzd() == zzggd.zzb) {
            zzgvoVarZzb = zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzggd.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzgvoVarZzb = zzgml.zzb(this.zzc.intValue());
        }
        return new zzgfx(this.zza, this.zzb, zzgvoVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgfv(zzgfw zzgfwVar) {
    }
}
