package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgju {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgjq
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgju.zzd((zzggw) zzgekVar);
            }
        }, zzggw.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgjr
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgju.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgju.zzc((zzggr) zzgdxVar, zzgeoVar);
            }
        }, zzggr.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgju.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzggr zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgru zzgruVarZzd = zzgru.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgruVarZzd.zza() == 0) {
                return zzggr.zza(zzf(zzgnhVar.zzc()), zzgvp.zzb(zzgruVarZzd.zzf().zzA(), zzgeoVar), zzgnhVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzggw zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            zzgrx.zzc(zzgniVar.zzc().zzh(), zzgxb.zza());
            return zzggw.zzc(zzf(zzgniVar.zzc().zzg()));
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzggr zzggrVar, zzgeo zzgeoVar) {
        zzgrs zzgrsVarZzb = zzgru.zzb();
        byte[] bArrZzd = zzggrVar.zzd().zzd(zzgeoVar);
        zzgrsVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgru) zzgrsVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzggrVar.zzb().zzb()), zzggrVar.zze());
    }

    public static /* synthetic */ zzgni zzd(zzggw zzggwVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzgsnVarZza.zzc(zzgrx.zzb().zzaN());
        zzgsnVarZza.zza(zzg(zzggwVar.zzb()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzggv zzf(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzggv.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzggv.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
            }
        }
        return zzggv.zzb;
    }

    private static zzgtp zzg(zzggv zzggvVar) throws GeneralSecurityException {
        if (zzggv.zza.equals(zzggvVar)) {
            return zzgtp.TINK;
        }
        if (zzggv.zzb.equals(zzggvVar)) {
            return zzgtp.CRUNCHY;
        }
        if (zzggv.zzc.equals(zzggvVar)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzggvVar.toString()));
    }
}
