package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgpo {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgpk
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgpo.zzb((zzgof) zzgekVar);
            }
        }, zzgof.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgpl
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgpo.zzd((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgpm
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgpo.zza((zzgnx) zzgdxVar, zzgeoVar);
            }
        }, zzgnx.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgpn
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgpo.zzc((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzgnh zza(zzgnx zzgnxVar, zzgeo zzgeoVar) {
        zzgpz zzgpzVarZzb = zzgqb.zzb();
        zzgpzVarZzb.zzb(zzg(zzgnxVar.zzb()));
        byte[] bArrZzd = zzgnxVar.zzd().zzd(zzgeoVar);
        zzgpzVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgqb) zzgpzVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzh(zzgnxVar.zzb().zzf()), zzgnxVar.zze());
    }

    public static /* synthetic */ zzgni zzb(zzgof zzgofVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgqc zzgqcVarZzb = zzgqe.zzb();
        zzgqcVarZzb.zzb(zzg(zzgofVar));
        zzgqcVarZzb.zza(zzgofVar.zzc());
        zzgsnVarZza.zzc(((zzgqe) zzgqcVarZzb.zzbr()).zzaN());
        zzgsnVarZza.zza(zzh(zzgofVar.zzf()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static /* synthetic */ zzgnx zzc(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgqb zzgqbVarZzd = zzgqb.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgqbVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgoc zzgocVarZze = zzgof.zze();
            zzgocVarZze.zza(zzgqbVarZzd.zzg().zzd());
            zzgocVarZze.zzb(zzgqbVarZzd.zzf().zza());
            zzgocVarZze.zzc(zzf(zzgnhVar.zzc()));
            zzgof zzgofVarZzd = zzgocVarZze.zzd();
            zzgnv zzgnvVarZza = zzgnx.zza();
            zzgnvVarZza.zzc(zzgofVarZzd);
            zzgnvVarZza.zza(zzgvp.zzb(zzgqbVarZzd.zzg().zzA(), zzgeoVar));
            zzgnvVarZza.zzb(zzgnhVar.zzf());
            return zzgnvVarZza.zzd();
        } catch (zzgyg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgof zzd(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            zzgqe zzgqeVarZzd = zzgqe.zzd(zzgniVar.zzc().zzh(), zzgxb.zza());
            zzgoc zzgocVarZze = zzgof.zze();
            zzgocVarZze.zza(zzgqeVarZzd.zza());
            zzgocVarZze.zzb(zzgqeVarZzd.zzf().zza());
            zzgocVarZze.zzc(zzf(zzgniVar.zzc().zzg()));
            return zzgocVarZze.zzd();
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgod zzf(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzgod.zza;
        }
        if (iOrdinal == 2) {
            return zzgod.zzc;
        }
        if (iOrdinal == 3) {
            return zzgod.zzd;
        }
        if (iOrdinal == 4) {
            return zzgod.zzb;
        }
        throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
    }

    private static zzgqh zzg(zzgof zzgofVar) {
        zzgqf zzgqfVarZzb = zzgqh.zzb();
        zzgqfVarZzb.zza(zzgofVar.zzb());
        return (zzgqh) zzgqfVarZzb.zzbr();
    }

    private static zzgtp zzh(zzgod zzgodVar) throws GeneralSecurityException {
        if (zzgod.zza.equals(zzgodVar)) {
            return zzgtp.TINK;
        }
        if (zzgod.zzb.equals(zzgodVar)) {
            return zzgtp.CRUNCHY;
        }
        if (zzgod.zzd.equals(zzgodVar)) {
            return zzgtp.RAW;
        }
        if (zzgod.zzc.equals(zzgodVar)) {
            return zzgtp.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgodVar)));
    }
}
