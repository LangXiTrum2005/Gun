package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgfy
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            return zzgun.zzb((zzgfx) zzgdxVar);
        }
    }, zzgfx.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgdn.class, zzgsj.SYMMETRIC, zzgri.zzg());
    private static final zzgmb zzd = new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgfz
    };
    private static final zzglz zze = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgga
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) throws GeneralSecurityException {
            zzggf zzggfVar = (zzggf) zzgekVar;
            int i = zzggb.zza;
            if (zzggfVar.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzgfv zzgfvVar = new zzgfv(null);
            zzgfvVar.zzc(zzggfVar);
            zzgfvVar.zza(num);
            zzgfvVar.zzb(zzgvp.zzc(zzggfVar.zzb()));
            return zzgfvVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgks.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgji.zza;
        zzgji.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzb);
        zzgmg zzgmgVarZzb = zzgmg.zzb();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzgie.zza);
        zzggc zzggcVar = new zzggc(null);
        zzggcVar.zza(12);
        zzggcVar.zzb(16);
        zzggcVar.zzc(16);
        zzggd zzggdVar = zzggd.zzc;
        zzggcVar.zzd(zzggdVar);
        map.put("AES128_GCM_RAW", zzggcVar.zze());
        map.put("AES256_GCM", zzgie.zzb);
        zzggc zzggcVar2 = new zzggc(null);
        zzggcVar2.zza(12);
        zzggcVar2.zzb(32);
        zzggcVar2.zzc(16);
        zzggcVar2.zzd(zzggdVar);
        map.put("AES256_GCM_RAW", zzggcVar2.zze());
        zzgmgVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgmc.zza().zzb(zzd, zzggf.class);
        zzgma.zzb().zzc(zze, zzggf.class);
        zzgkz.zzc().zzf(zzc, i, true);
    }
}
