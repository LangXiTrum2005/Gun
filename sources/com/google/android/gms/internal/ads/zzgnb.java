package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgnb {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgnb(zzgmy zzgmyVar, zzgna zzgnaVar) {
        this.zza = new HashMap(zzgmyVar.zza);
        this.zzb = new HashMap(zzgmyVar.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgng) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(DM.B("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzgdx zzgdxVar, Class cls) throws GeneralSecurityException {
        zzgmz zzgmzVar = new zzgmz(zzgdxVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgmzVar)) {
            return ((zzgmx) this.zza.get(zzgmzVar)).zza(zzgdxVar);
        }
        throw new GeneralSecurityException(DM.B("No PrimitiveConstructor for ", zzgmzVar.toString(), " available"));
    }

    public final Object zzc(zzgnf zzgnfVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzgng zzgngVar = (zzgng) this.zzb.get(cls);
        if (zzgnfVar.zzd().equals(zzgngVar.zza()) && zzgngVar.zza().equals(zzgnfVar.zzd())) {
            return zzgngVar.zzc(zzgnfVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
