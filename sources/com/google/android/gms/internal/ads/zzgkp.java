package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgkl
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgkp.zzd((zzgir) zzgekVar);
            }
        }, zzgir.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgkm
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgkp.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgkp.zzc((zzgil) zzgdxVar, zzgeoVar);
            }
        }, zzgil.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgko
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgkp.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzgil zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgue zzgueVarZzd = zzgue.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgueVarZzd.zza() == 0) {
                return zzgil.zza(zzf(zzgnhVar.zzc()), zzgvp.zzb(zzgueVarZzd.zzf().zzA(), zzgeoVar), zzgnhVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgir zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            if (zzguh.zzd(zzgniVar.zzc().zzh(), zzgxb.zza()).zza() == 0) {
                return zzgir.zzc(zzf(zzgniVar.zzc().zzg()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgil zzgilVar, zzgeo zzgeoVar) {
        zzguc zzgucVarZzb = zzgue.zzb();
        byte[] bArrZzd = zzgilVar.zzd().zzd(zzgeoVar);
        zzgucVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgue) zzgucVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzgilVar.zzb().zzb()), zzgilVar.zze());
    }

    public static /* synthetic */ zzgni zzd(zzgir zzgirVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgsnVarZza.zzc(zzguh.zzc().zzaN());
        zzgsnVarZza.zza(zzg(zzgirVar.zzb()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgiq zzf(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzgiq.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgiq.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
            }
        }
        return zzgiq.zzb;
    }

    private static zzgtp zzg(zzgiq zzgiqVar) throws GeneralSecurityException {
        if (zzgiq.zza.equals(zzgiqVar)) {
            return zzgtp.TINK;
        }
        if (zzgiq.zzb.equals(zzgiqVar)) {
            return zzgtp.CRUNCHY;
        }
        if (zzgiq.zzc.equals(zzgiqVar)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgiqVar.toString()));
    }
}
