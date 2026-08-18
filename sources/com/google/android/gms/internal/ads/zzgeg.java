package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgeg {
    private final zzgsx zza;
    private final List zzb;
    private final zzglo zzc;

    public /* synthetic */ zzgeg(zzgsx zzgsxVar, List list, zzglo zzgloVar, zzgef zzgefVar) {
        this.zza = zzgsxVar;
        this.zzb = list;
        this.zzc = zzgloVar;
    }

    public static final zzgeg zza(zzgsx zzgsxVar) throws GeneralSecurityException {
        zzh(zzgsxVar);
        return new zzgeg(zzgsxVar, zzg(zzgsxVar));
    }

    public static final zzgeg zzb(zzgek zzgekVar) throws GeneralSecurityException {
        zzged zzgedVar = new zzged();
        zzgeb zzgebVar = new zzgeb(zzgekVar, null);
        zzgebVar.zzd();
        zzgebVar.zzc();
        zzgedVar.zza(zzgebVar);
        return zzgedVar.zzb();
    }

    private final Object zzf(zzgky zzgkyVar, Class cls, Class cls2) throws GeneralSecurityException {
        int i = zzger.zza;
        zzgsx zzgsxVar = this.zza;
        int iZzb = zzgsxVar.zzb();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgsv zzgsvVar : zzgsxVar.zzh()) {
            if (zzgsvVar.zzk() == 3) {
                if (!zzgsvVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgsvVar.zza())));
                }
                if (zzgsvVar.zzf() == zzgtp.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgsvVar.zza())));
                }
                if (zzgsvVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgsvVar.zza())));
                }
                if (zzgsvVar.zza() == iZzb) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgsvVar.zzb().zzb() == zzgsj.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgnc zzgncVarZzb = zzgnf.zzb(cls2);
        zzgncVarZzb.zzc(this.zzc);
        for (int i3 = 0; i3 < this.zzb.size(); i3++) {
            zzgsv zzgsvVarZzd = this.zza.zzd(i3);
            if (zzgsvVarZzd.zzk() == 3) {
                zzgee zzgeeVar = (zzgee) this.zzb.get(i3);
                if (zzgeeVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + zzgsvVarZzd.zzb().zzg() + " failed, unable to get primitive");
                }
                zzgdx zzgdxVarZza = zzgeeVar.zza();
                try {
                    Object objZzb = zzgkyVar.zzb(zzgdxVarZza, cls2);
                    if (zzgsvVarZzd.zza() == this.zza.zzb()) {
                        zzgncVarZzb.zzb(objZzb, zzgdxVarZza, zzgsvVarZzd);
                    } else {
                        zzgncVarZzb.zza(objZzb, zzgdxVarZza, zzgsvVarZzd);
                    }
                } catch (GeneralSecurityException e) {
                    throw new GeneralSecurityException(AbstractC5044xl.n("Unable to get primitive ", cls2.toString(), " for key of type ", zzgsvVarZzd.zzb().zzg(), ", see https://developers.google.com/tink/faq/registration_errors"), e);
                }
            }
        }
        return zzgkyVar.zzc(zzgncVarZzb.zzd(), cls);
    }

    private static List zzg(zzgsx zzgsxVar) {
        zzgdz zzgdzVar;
        ArrayList arrayList = new ArrayList(zzgsxVar.zza());
        for (zzgsv zzgsvVar : zzgsxVar.zzh()) {
            int iZza = zzgsvVar.zza();
            try {
                zzgnh zzgnhVarZza = zzgnh.zza(zzgsvVar.zzb().zzg(), zzgsvVar.zzb().zzf(), zzgsvVar.zzb().zzb(), zzgsvVar.zzf(), zzgsvVar.zzf() == zzgtp.RAW ? null : Integer.valueOf(zzgsvVar.zza()));
                zzgmk zzgmkVarZzc = zzgmk.zzc();
                zzgeo zzgeoVarZza = zzgeo.zza();
                zzgdx zzglkVar = !zzgmkVarZzc.zzj(zzgnhVarZza) ? new zzglk(zzgnhVarZza, zzgeoVarZza) : zzgmkVarZzc.zza(zzgnhVarZza, zzgeoVarZza);
                int iZzk = zzgsvVar.zzk() - 2;
                if (iZzk == 1) {
                    zzgdzVar = zzgdz.zza;
                } else if (iZzk == 2) {
                    zzgdzVar = zzgdz.zzb;
                } else {
                    if (iZzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzgdzVar = zzgdz.zzc;
                }
                arrayList.add(new zzgee(zzglkVar, zzgdzVar, iZza, iZza == zzgsxVar.zzb(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(zzgsx zzgsxVar) throws GeneralSecurityException {
        if (zzgsxVar == null || zzgsxVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i = zzger.zza;
        zzgsy zzgsyVarZza = zzgtc.zza();
        zzgsx zzgsxVar = this.zza;
        zzgsyVarZza.zzb(zzgsxVar.zzb());
        for (zzgsv zzgsvVar : zzgsxVar.zzh()) {
            zzgsz zzgszVarZza = zzgta.zza();
            zzgszVarZza.zzc(zzgsvVar.zzb().zzg());
            zzgszVarZza.zzd(zzgsvVar.zzk());
            zzgszVarZza.zzb(zzgsvVar.zzf());
            zzgszVarZza.zza(zzgsvVar.zza());
            zzgsyVarZza.zza((zzgta) zzgszVarZza.zzbr());
        }
        return ((zzgtc) zzgsyVarZza.zzbr()).toString();
    }

    public final zzgsx zzc() {
        return this.zza;
    }

    public final Object zzd(zzgdr zzgdrVar, Class cls) throws GeneralSecurityException {
        zzgky zzgkyVar = (zzgky) zzgdrVar;
        Class clsZza = zzgkyVar.zza(cls);
        if (clsZza != null) {
            return zzf(zzgkyVar, cls, clsZza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private zzgeg(zzgsx zzgsxVar, List list) {
        this.zza = zzgsxVar;
        this.zzb = list;
        this.zzc = zzglo.zza;
    }
}
