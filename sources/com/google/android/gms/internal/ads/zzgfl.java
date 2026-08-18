package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfl {

    @Nullable
    private zzgfu zza = null;

    @Nullable
    private zzgvp zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgfl() {
    }

    public final zzgfl zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfl zzb(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgfl zzc(zzgfu zzgfuVar) {
        this.zza = zzgfuVar;
        return this;
    }

    public final zzgfn zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zzgvoVarZzb;
        zzgfu zzgfuVar = this.zza;
        if (zzgfuVar == null || (zzgvpVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfuVar.zzc() != zzgvpVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgfuVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgfs.zzc) {
            zzgvoVarZzb = zzgml.zza;
        } else if (this.zza.zze() == zzgfs.zzb) {
            zzgvoVarZzb = zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzgfs.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzgvoVarZzb = zzgml.zzb(this.zzc.intValue());
        }
        return new zzgfn(this.zza, this.zzb, zzgvoVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgfl(zzgfm zzgfmVar) {
    }
}
