package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmy {
    private final Map zza;
    private final Map zzb;

    private zzgmy() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgmy zza(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (zzgmxVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgmz zzgmzVar = new zzgmz(zzgmxVar.zzc(), zzgmxVar.zzd(), null);
        if (this.zza.containsKey(zzgmzVar)) {
            zzgmx zzgmxVar2 = (zzgmx) this.zza.get(zzgmzVar);
            if (!zzgmxVar2.equals(zzgmxVar) || !zzgmxVar.equals(zzgmxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgmzVar.toString()));
            }
        } else {
            this.zza.put(zzgmzVar, zzgmxVar);
        }
        return this;
    }

    public final zzgmy zzb(zzgng zzgngVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzgngVar.zzb();
        if (map.containsKey(clsZzb)) {
            zzgng zzgngVar2 = (zzgng) this.zzb.get(clsZzb);
            if (!zzgngVar2.equals(zzgngVar) || !zzgngVar.equals(zzgngVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzgngVar);
        }
        return this;
    }

    public /* synthetic */ zzgmy(zzgna zzgnaVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgmy(zzgnb zzgnbVar, zzgna zzgnaVar) {
        this.zza = new HashMap(zzgnbVar.zza);
        this.zzb = new HashMap(zzgnbVar.zzb);
    }
}
