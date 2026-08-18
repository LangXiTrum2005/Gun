package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggr extends zzget {
    private final zzggw zza;
    private final zzgvp zzb;
    private final zzgvo zzc;

    @Nullable
    private final Integer zzd;

    private zzggr(zzggw zzggwVar, zzgvp zzgvpVar, zzgvo zzgvoVar, @Nullable Integer num) {
        this.zza = zzggwVar;
        this.zzb = zzgvpVar;
        this.zzc = zzgvoVar;
        this.zzd = num;
    }

    public static zzggr zza(zzggv zzggvVar, zzgvp zzgvpVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvoVarZzb;
        zzggv zzggvVar2 = zzggv.zzc;
        if (zzggvVar != zzggvVar2 && num == null) {
            throw new GeneralSecurityException(DM.B("For given Variant ", zzggvVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzggvVar == zzggvVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgvpVar.zza() != 32) {
            throw new GeneralSecurityException(AbstractC3950lJ.p("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgvpVar.zza()));
        }
        zzggw zzggwVarZzc = zzggw.zzc(zzggvVar);
        if (zzggwVarZzc.zzb() == zzggvVar2) {
            zzgvoVarZzb = zzgml.zza;
        } else if (zzggwVarZzc.zzb() == zzggv.zzb) {
            zzgvoVarZzb = zzgml.zza(num.intValue());
        } else {
            if (zzggwVarZzc.zzb() != zzggv.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzggwVarZzc.zzb().toString()));
            }
            zzgvoVarZzb = zzgml.zzb(num.intValue());
        }
        return new zzggr(zzggwVarZzc, zzgvpVar, zzgvoVarZzb, num);
    }

    public final zzggw zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzc;
    }

    public final zzgvp zzd() {
        return this.zzb;
    }

    @Nullable
    public final Integer zze() {
        return this.zzd;
    }
}
