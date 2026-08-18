package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgpw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgkx zzc;
    private static final zzgkx zzd;
    private static final zzgmt zze;
    private static final zzgmp zzf;
    private static final zzglh zzg;
    private static final zzgld zzh;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgvoVarZzb;
        zzgkv zzgkvVarZza = zzgkx.zza();
        zzgkvVarZza.zza(zzgtp.RAW, zzgou.zzd);
        zzgkvVarZza.zza(zzgtp.TINK, zzgou.zza);
        zzgkvVarZza.zza(zzgtp.LEGACY, zzgou.zzc);
        zzgkvVarZza.zza(zzgtp.CRUNCHY, zzgou.zzb);
        zzc = zzgkvVarZza.zzb();
        zzgkv zzgkvVarZza2 = zzgkx.zza();
        zzgkvVarZza2.zza(zzgry.SHA1, zzgot.zza);
        zzgkvVarZza2.zza(zzgry.SHA224, zzgot.zzb);
        zzgkvVarZza2.zza(zzgry.SHA256, zzgot.zzc);
        zzgkvVarZza2.zza(zzgry.SHA384, zzgot.zzd);
        zzgkvVarZza2.zza(zzgry.SHA512, zzgot.zze);
        zzd = zzgkvVarZza2.zzb();
        zze = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgps
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgpw.zzb((zzgow) zzgekVar);
            }
        }, zzgow.class, zzgni.class);
        zzf = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgpt
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgpw.zzd((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zzg = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgpu
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgpw.zza((zzgom) zzgdxVar, zzgeoVar);
            }
        }, zzgom.class, zzgnh.class);
        zzh = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgpv
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgpw.zzc((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzgnh zza(zzgom zzgomVar, zzgeo zzgeoVar) {
        zzgrz zzgrzVarZzb = zzgsb.zzb();
        zzgrzVarZzb.zzb(zzf(zzgomVar.zzb()));
        byte[] bArrZzd = zzgomVar.zzd().zzd(zzgeoVar);
        zzgrzVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgsb) zzgrzVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, (zzgtp) zzc.zzb(zzgomVar.zzb().zzg()), zzgomVar.zze());
    }

    public static /* synthetic */ zzgni zzb(zzgow zzgowVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgsc zzgscVarZzc = zzgse.zzc();
        zzgscVarZzc.zzb(zzf(zzgowVar));
        zzgscVarZzc.zza(zzgowVar.zzc());
        zzgsnVarZza.zzc(((zzgse) zzgscVarZzc.zzbr()).zzaN());
        zzgsnVarZza.zza((zzgtp) zzc.zzb(zzgowVar.zzg()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static /* synthetic */ zzgom zzc(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgsb zzgsbVarZzf = zzgsb.zzf(zzgnhVar.zze(), zzgxb.zza());
            if (zzgsbVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgos zzgosVarZze = zzgow.zze();
            zzgosVarZze.zzb(zzgsbVarZzf.zzh().zzd());
            zzgosVarZze.zzc(zzgsbVarZzf.zzg().zza());
            zzgosVarZze.zza((zzgot) zzd.zzc(zzgsbVarZzf.zzg().zzb()));
            zzgosVarZze.zzd((zzgou) zzc.zzc(zzgnhVar.zzc()));
            zzgow zzgowVarZze = zzgosVarZze.zze();
            zzgok zzgokVarZza = zzgom.zza();
            zzgokVarZza.zzc(zzgowVarZze);
            zzgokVarZza.zzb(zzgvp.zzb(zzgsbVarZzf.zzh().zzA(), zzgeoVar));
            zzgokVarZza.zza(zzgnhVar.zzf());
            return zzgokVarZza.zzd();
        } catch (zzgyg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgow zzd(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            zzgse zzgseVarZzg = zzgse.zzg(zzgniVar.zzc().zzh(), zzgxb.zza());
            if (zzgseVarZzg.zzb() != 0) {
                throw new GeneralSecurityException(AbstractC3950lJ.p("Parsing HmacParameters failed: unknown Version ", zzgseVarZzg.zzb()));
            }
            zzgos zzgosVarZze = zzgow.zze();
            zzgosVarZze.zzb(zzgseVarZzg.zza());
            zzgosVarZze.zzc(zzgseVarZzg.zzh().zza());
            zzgosVarZze.zza((zzgot) zzd.zzc(zzgseVarZzg.zzh().zzb()));
            zzgosVarZze.zzd((zzgou) zzc.zzc(zzgniVar.zzc().zzg()));
            return zzgosVarZze.zze();
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zze);
        zzgmkVar.zzh(zzf);
        zzgmkVar.zzg(zzg);
        zzgmkVar.zzf(zzh);
    }

    private static zzgsh zzf(zzgow zzgowVar) throws GeneralSecurityException {
        zzgsf zzgsfVarZzc = zzgsh.zzc();
        zzgsfVarZzc.zzb(zzgowVar.zzb());
        zzgsfVarZzc.zza((zzgry) zzd.zzb(zzgowVar.zzf()));
        return (zzgsh) zzgsfVarZzc.zzbr();
    }
}
