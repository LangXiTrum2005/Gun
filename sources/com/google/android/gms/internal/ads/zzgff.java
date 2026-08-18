package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgff {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgfc
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            return zzguq.zzb((zzgfb) zzgdxVar);
        }
    }, zzgfb.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgdn.class, zzgsj.SYMMETRIC, zzgqk.zzh());
    private static final zzgmb zzd = new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgfd
    };
    private static final zzglz zze = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgfe
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) throws GeneralSecurityException {
            zzgfk zzgfkVar = (zzgfk) zzgekVar;
            int i = zzgff.zza;
            if (zzgfkVar.zzb() != 16 && zzgfkVar.zzb() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzgez zzgezVar = new zzgez(null);
            zzgezVar.zzd(zzgfkVar);
            zzgezVar.zzc(num);
            zzgezVar.zza(zzgvp.zzc(zzgfkVar.zzb()));
            zzgezVar.zzb(zzgvp.zzc(zzgfkVar.zzc()));
            return zzgezVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgks.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgiw.zza;
        zzgiw.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzb);
        zzgmg zzgmgVarZzb = zzgmg.zzb();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzgie.zze);
        zzgfg zzgfgVar = new zzgfg(null);
        zzgfgVar.zza(16);
        zzgfgVar.zzc(32);
        zzgfgVar.zze(16);
        zzgfgVar.zzd(16);
        zzgfh zzgfhVar = zzgfh.zzc;
        zzgfgVar.zzb(zzgfhVar);
        zzgfi zzgfiVar = zzgfi.zzc;
        zzgfgVar.zzf(zzgfiVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzgfgVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzgie.zzf);
        zzgfg zzgfgVar2 = new zzgfg(null);
        zzgfgVar2.zza(32);
        zzgfgVar2.zzc(32);
        zzgfgVar2.zze(32);
        zzgfgVar2.zzd(16);
        zzgfgVar2.zzb(zzgfhVar);
        zzgfgVar2.zzf(zzgfiVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzgfgVar2.zzg());
        zzgmgVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgmc.zza().zzb(zzd, zzgfk.class);
        zzgma.zzb().zzc(zze, zzgfk.class);
        zzgkz.zzc().zzf(zzc, i, true);
    }
}
