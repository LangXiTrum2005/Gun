package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzghs
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzghw.zzd((zzghr) zzgekVar);
            }
        }, zzghr.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzght
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzghw.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzghu
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzghw.zzc((zzghm) zzgdxVar, zzgeoVar);
            }
        }, zzghm.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzghv
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzghw.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzghm zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgtl zzgtlVarZzd = zzgtl.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgtlVarZzd.zza() == 0) {
                return zzghm.zza(zzf(zzgtlVarZzd.zzf(), zzgnhVar.zzc()), zzgnhVar.zzf());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zzgtlVarZzd)));
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzghr zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            return zzf(zzgto.zzf(zzgniVar.zzc().zzh(), zzgxb.zza()), zzgniVar.zzc().zzg());
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzghm zzghmVar, zzgeo zzgeoVar) {
        zzgtj zzgtjVarZzb = zzgtl.zzb();
        zzgtjVarZzb.zza(zzg(zzghmVar.zzb()));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgtl) zzgtjVarZzb.zzbr()).zzaN(), zzgsj.REMOTE, zzh(zzghmVar.zzb().zzc()), zzghmVar.zzd());
    }

    public static /* synthetic */ zzgni zzd(zzghr zzghrVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzgsnVarZza.zzc(zzg(zzghrVar).zzaN());
        zzgsnVarZza.zza(zzh(zzghrVar.zzc()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzghr zzf(zzgto zzgtoVar, zzgtp zzgtpVar) throws GeneralSecurityException {
        zzgho zzghoVar;
        zzghp zzghpVar;
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb(zzgtoVar.zza().zzi());
        zzgsnVarZza.zzc(zzgtoVar.zza().zzh());
        zzgsnVarZza.zza(zzgtp.RAW);
        zzgek zzgekVarZza = zzgeq.zza(((zzgsp) zzgsnVarZza.zzbr()).zzaV());
        if (zzgekVarZza instanceof zzggf) {
            zzghoVar = zzgho.zza;
        } else if (zzgekVarZza instanceof zzggw) {
            zzghoVar = zzgho.zzc;
        } else if (zzgekVarZza instanceof zzgir) {
            zzghoVar = zzgho.zzb;
        } else if (zzgekVarZza instanceof zzgfk) {
            zzghoVar = zzgho.zzd;
        } else if (zzgekVarZza instanceof zzgfu) {
            zzghoVar = zzgho.zze;
        } else {
            if (!(zzgekVarZza instanceof zzggq)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzgekVarZza.toString()));
            }
            zzghoVar = zzgho.zzf;
        }
        zzghn zzghnVar = new zzghn(null);
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            zzghpVar = zzghp.zza;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
            }
            zzghpVar = zzghp.zzb;
        }
        zzghnVar.zzd(zzghpVar);
        zzghnVar.zzc(zzgtoVar.zzg());
        zzghnVar.zza((zzgeu) zzgekVarZza);
        zzghnVar.zzb(zzghoVar);
        return zzghnVar.zze();
    }

    private static zzgto zzg(zzghr zzghrVar) throws GeneralSecurityException {
        try {
            zzgsp zzgspVarZzf = zzgsp.zzf(zzgeq.zzb(zzghrVar.zzb()), zzgxb.zza());
            zzgtm zzgtmVarZzb = zzgto.zzb();
            zzgtmVarZzb.zzb(zzghrVar.zzd());
            zzgtmVarZzb.zza(zzgspVarZzf);
            return (zzgto) zzgtmVarZzb.zzbr();
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzgtp zzh(zzghp zzghpVar) throws GeneralSecurityException {
        if (zzghp.zza.equals(zzghpVar)) {
            return zzgtp.TINK;
        }
        if (zzghp.zzb.equals(zzghpVar)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzghpVar)));
    }
}
