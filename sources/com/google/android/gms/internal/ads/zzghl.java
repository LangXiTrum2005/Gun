package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzghl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzghh
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzghl.zzd((zzghg) zzgekVar);
            }
        }, zzghg.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzghi
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzghl.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzghj
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzghl.zzc((zzghe) zzgdxVar, zzgeoVar);
            }
        }, zzghe.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzghk
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzghl.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzghe zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzgtf zzgtfVarZzd = zzgtf.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgtfVarZzd.zza() == 0) {
                return zzghe.zza(zzghg.zzc(zzgtfVarZzd.zzf().zzf(), zzf(zzgnhVar.zzc())), zzgnhVar.zzf());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzgtfVarZzd)));
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzghg zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            return zzghg.zzc(zzgti.zzd(zzgniVar.zzc().zzh(), zzgxb.zza()).zzf(), zzf(zzgniVar.zzc().zzg()));
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzghe zzgheVar, zzgeo zzgeoVar) {
        zzgtd zzgtdVarZzb = zzgtf.zzb();
        zzgtg zzgtgVarZza = zzgti.zza();
        zzgtgVarZza.zza(zzgheVar.zzb().zzd());
        zzgtdVarZzb.zza((zzgti) zzgtgVarZza.zzbr());
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgtf) zzgtdVarZzb.zzbr()).zzaN(), zzgsj.REMOTE, zzg(zzgheVar.zzb().zzb()), zzgheVar.zzd());
    }

    public static /* synthetic */ zzgni zzd(zzghg zzghgVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzgtg zzgtgVarZza = zzgti.zza();
        zzgtgVarZza.zza(zzghgVar.zzd());
        zzgsnVarZza.zzc(((zzgti) zzgtgVarZza.zzbr()).zzaN());
        zzgsnVarZza.zza(zzg(zzghgVar.zzb()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzghf zzf(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzghf.zza;
        }
        if (iOrdinal == 3) {
            return zzghf.zzb;
        }
        throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
    }

    private static zzgtp zzg(zzghf zzghfVar) throws GeneralSecurityException {
        if (zzghf.zza.equals(zzghfVar)) {
            return zzgtp.TINK;
        }
        if (zzghf.zzb.equals(zzghfVar)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghfVar.toString()));
    }
}
