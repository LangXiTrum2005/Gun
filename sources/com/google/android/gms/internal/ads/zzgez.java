package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgez {

    @Nullable
    private zzgfk zza = null;

    @Nullable
    private zzgvp zzb = null;

    @Nullable
    private zzgvp zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzgez() {
    }

    public final zzgez zza(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgez zzb(zzgvp zzgvpVar) {
        this.zzc = zzgvpVar;
        return this;
    }

    public final zzgez zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgez zzd(zzgfk zzgfkVar) {
        this.zza = zzgfkVar;
        return this;
    }

    public final zzgfb zze() throws GeneralSecurityException {
        zzgvo zzgvoVarZzb;
        zzgfk zzgfkVar = this.zza;
        if (zzgfkVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgvp zzgvpVar = this.zzb;
        if (zzgvpVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzgfkVar.zzb() != zzgvpVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzgfkVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzh() == zzgfi.zzc) {
            zzgvoVarZzb = zzgml.zza;
        } else if (this.zza.zzh() == zzgfi.zzb) {
            zzgvoVarZzb = zzgml.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzh() != zzgfi.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
            }
            zzgvoVarZzb = zzgml.zzb(this.zzd.intValue());
        }
        return new zzgfb(this.zza, this.zzb, this.zzc, zzgvoVarZzb, this.zzd, null);
    }

    public /* synthetic */ zzgez(zzgfa zzgfaVar) {
    }
}
