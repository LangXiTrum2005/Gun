package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgix
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgjb.zzd((zzgfu) zzgekVar);
            }
        }, zzgfu.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgiy
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgjb.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgiz
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgjb.zzc((zzgfn) zzgdxVar, zzgeoVar);
            }
        }, zzgfn.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgja
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgjb.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzgfn zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgqz zzgqzVarZzd = zzgqz.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgqzVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfr zzgfrVarZzd = zzgfu.zzd();
            zzgfrVarZzd.zzb(zzgqzVarZzd.zzg().zzd());
            zzgfrVarZzd.zza(zzgqzVarZzd.zzf().zza());
            zzgfrVarZzd.zzc(16);
            zzgfrVarZzd.zzd(zzf(zzgnhVar.zzc()));
            zzgfu zzgfuVarZze = zzgfrVarZzd.zze();
            zzgfl zzgflVarZza = zzgfn.zza();
            zzgflVarZza.zzc(zzgfuVarZze);
            zzgflVarZza.zzb(zzgvp.zzb(zzgqzVarZzd.zzg().zzA(), zzgeoVar));
            zzgflVarZza.zza(zzgnhVar.zzf());
            return zzgflVarZza.zzd();
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzgfu zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            zzgrc zzgrcVarZzd = zzgrc.zzd(zzgniVar.zzc().zzh(), zzgxb.zza());
            zzgfr zzgfrVarZzd = zzgfu.zzd();
            zzgfrVarZzd.zzb(zzgrcVarZzd.zza());
            zzgfrVarZzd.zza(zzgrcVarZzd.zzf().zza());
            zzgfrVarZzd.zzc(16);
            zzgfrVarZzd.zzd(zzf(zzgniVar.zzc().zzg()));
            return zzgfrVarZzd.zze();
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgfn zzgfnVar, zzgeo zzgeoVar) {
        zzgqx zzgqxVarZzb = zzgqz.zzb();
        zzgqxVarZzb.zzb(zzg(zzgfnVar.zzb()));
        byte[] bArrZzd = zzgfnVar.zzd().zzd(zzgeoVar);
        zzgqxVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgqz) zzgqxVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzh(zzgfnVar.zzb().zze()), zzgfnVar.zze());
    }

    public static /* synthetic */ zzgni zzd(zzgfu zzgfuVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgra zzgraVarZzb = zzgrc.zzb();
        zzgraVarZzb.zzb(zzg(zzgfuVar));
        zzgraVarZzb.zza(zzgfuVar.zzc());
        zzgsnVarZza.zzc(((zzgrc) zzgraVarZzb.zzbr()).zzaN());
        zzgsnVarZza.zza(zzh(zzgfuVar.zze()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgfs zzf(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzgfs.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgfs.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
            }
        }
        return zzgfs.zzb;
    }

    private static zzgrf zzg(zzgfu zzgfuVar) throws GeneralSecurityException {
        zzgrd zzgrdVarZzb = zzgrf.zzb();
        zzgrdVarZzb.zza(zzgfuVar.zzb());
        return (zzgrf) zzgrdVarZzb.zzbr();
    }

    private static zzgtp zzh(zzgfs zzgfsVar) throws GeneralSecurityException {
        if (zzgfs.zza.equals(zzgfsVar)) {
            return zzgtp.TINK;
        }
        if (zzgfs.zzb.equals(zzgfsVar)) {
            return zzgtp.CRUNCHY;
        }
        if (zzgfs.zzc.equals(zzgfsVar)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgfsVar)));
    }
}
