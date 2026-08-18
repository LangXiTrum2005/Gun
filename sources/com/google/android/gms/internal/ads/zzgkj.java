package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgkf
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgkj.zzd((zzgik) zzgekVar);
            }
        }, zzgik.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgkg
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgkj.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgkh
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgkj.zzc((zzgif) zzgdxVar, zzgeoVar);
            }
        }, zzgif.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgki
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgkj.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzgif zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzgtv zzgtvVarZzd = zzgtv.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgtvVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgtvVarZzd.zzg().zzd() == 32) {
                return zzgif.zza(zzgik.zzd(zzf(zzgnhVar.zzc()), zzgtvVarZzd.zzf().zza()), zzgvp.zzb(zzgtvVarZzd.zzg().zzA(), zzgeoVar), zzgnhVar.zzf());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgik zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            zzgty zzgtyVarZzd = zzgty.zzd(zzgniVar.zzc().zzh(), zzgxb.zza());
            if (zzgtyVarZzd.zza() == 0) {
                return zzgik.zzd(zzf(zzgniVar.zzc().zzg()), zzgtyVarZzd.zzf().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgif zzgifVar, zzgeo zzgeoVar) {
        zzgtt zzgttVarZzb = zzgtv.zzb();
        byte[] bArrZzd = zzgifVar.zzd().zzd(zzgeoVar);
        zzgttVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        zzgtz zzgtzVarZzb = zzgub.zzb();
        zzgtzVarZzb.zza(zzgifVar.zzb().zzb());
        zzgttVarZzb.zzb((zzgub) zzgtzVarZzb.zzbr());
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzgtv) zzgttVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzgifVar.zzb().zzc()), zzgifVar.zze());
    }

    public static /* synthetic */ zzgni zzd(zzgik zzgikVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgtw zzgtwVarZzb = zzgty.zzb();
        zzgtz zzgtzVarZzb = zzgub.zzb();
        zzgtzVarZzb.zza(zzgikVar.zzb());
        zzgtwVarZzb.zza((zzgub) zzgtzVarZzb.zzbr());
        zzgsnVarZza.zzc(((zzgty) zzgtwVarZzb.zzbr()).zzaN());
        zzgsnVarZza.zza(zzg(zzgikVar.zzc()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgij zzf(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzgij.zza;
        }
        if (iOrdinal == 3) {
            return zzgij.zzb;
        }
        throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
    }

    private static zzgtp zzg(zzgij zzgijVar) throws GeneralSecurityException {
        if (Objects.equals(zzgijVar, zzgij.zza)) {
            return zzgtp.TINK;
        }
        if (Objects.equals(zzgijVar, zzgij.zzb)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgijVar.toString()));
    }
}
