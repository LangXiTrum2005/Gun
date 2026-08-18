package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgok {

    @Nullable
    private zzgow zza = null;

    @Nullable
    private zzgvp zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgok() {
    }

    public final zzgok zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgok zzb(zzgvp zzgvpVar) {
        this.zzb = zzgvpVar;
        return this;
    }

    public final zzgok zzc(zzgow zzgowVar) {
        this.zza = zzgowVar;
        return this;
    }

    public final zzgom zzd() throws GeneralSecurityException {
        zzgvp zzgvpVar;
        zzgvo zzgvoVarZza;
        zzgow zzgowVar = this.zza;
        if (zzgowVar == null || (zzgvpVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgowVar.zzc() != zzgvpVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgowVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgou.zzd) {
            zzgvoVarZza = zzgml.zza;
        } else if (this.zza.zzg() == zzgou.zzc || this.zza.zzg() == zzgou.zzb) {
            zzgvoVarZza = zzgml.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzg() != zzgou.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzgvoVarZza = zzgml.zzb(this.zzc.intValue());
        }
        return new zzgom(this.zza, this.zzb, zzgvoVarZza, this.zzc, null);
    }

    public /* synthetic */ zzgok(zzgol zzgolVar) {
    }
}
