package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgnr {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgnr(zzgnn zzgnnVar, zzgnq zzgnqVar) {
        this.zza = new HashMap(zzgnnVar.zza);
        this.zzb = new HashMap(zzgnnVar.zzb);
        this.zzc = new HashMap(zzgnnVar.zzc);
        this.zzd = new HashMap(zzgnnVar.zzd);
    }

    public final zzgdx zza(zzgnm zzgnmVar, @Nullable zzgeo zzgeoVar) throws GeneralSecurityException {
        zzgno zzgnoVar = new zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null);
        if (this.zzb.containsKey(zzgnoVar)) {
            return ((zzgld) this.zzb.get(zzgnoVar)).zza(zzgnmVar, zzgeoVar);
        }
        throw new GeneralSecurityException(DM.B("No Key Parser for requested key type ", zzgnoVar.toString(), " available"));
    }

    public final zzgek zzb(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgno zzgnoVar = new zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null);
        if (this.zzd.containsKey(zzgnoVar)) {
            return ((zzgmp) this.zzd.get(zzgnoVar)).zza(zzgnmVar);
        }
        throw new GeneralSecurityException(DM.B("No Parameters Parser for requested key type ", zzgnoVar.toString(), " available"));
    }

    public final zzgnm zzc(zzgdx zzgdxVar, Class cls, @Nullable zzgeo zzgeoVar) throws GeneralSecurityException {
        zzgnp zzgnpVar = new zzgnp(zzgdxVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgnpVar)) {
            return ((zzglh) this.zza.get(zzgnpVar)).zza(zzgdxVar, zzgeoVar);
        }
        throw new GeneralSecurityException(DM.B("No Key serializer for ", zzgnpVar.toString(), " available"));
    }

    public final zzgnm zzd(zzgek zzgekVar, Class cls) throws GeneralSecurityException {
        zzgnp zzgnpVar = new zzgnp(zzgekVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgnpVar)) {
            return ((zzgmt) this.zzc.get(zzgnpVar)).zza(zzgekVar);
        }
        throw new GeneralSecurityException(DM.B("No Key Format serializer for ", zzgnpVar.toString(), " available"));
    }

    public final boolean zzi(zzgnm zzgnmVar) {
        return this.zzb.containsKey(new zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null));
    }

    public final boolean zzj(zzgnm zzgnmVar) {
        return this.zzd.containsKey(new zzgno(zzgnmVar.getClass(), zzgnmVar.zzd(), null));
    }
}
