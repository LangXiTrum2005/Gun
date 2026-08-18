package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgfo
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            return zzgum.zzb((zzgfn) zzgdxVar);
        }
    }, zzgfn.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgdn.class, zzgsj.SYMMETRIC, zzgqz.zzh());
    private static final zzglz zzd = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgfp
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) throws GeneralSecurityException {
            zzgfu zzgfuVar = (zzgfu) zzgekVar;
            int i = zzgfq.zza;
            if (zzgfuVar.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzgfl zzgflVar = new zzgfl(null);
            zzgflVar.zzc(zzgfuVar);
            zzgflVar.zza(num);
            zzgflVar.zzb(zzgvp.zzc(zzgfuVar.zzc()));
            return zzgflVar.zzd();
        }
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = zzgjb.zza;
        zzgjb.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzb);
        zzgmg zzgmgVarZzb = zzgmg.zzb();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzgie.zzc);
        zzgfr zzgfrVar = new zzgfr(null);
        zzgfrVar.zza(16);
        zzgfrVar.zzb(16);
        zzgfrVar.zzc(16);
        zzgfs zzgfsVar = zzgfs.zzc;
        zzgfrVar.zzd(zzgfsVar);
        map.put("AES128_EAX_RAW", zzgfrVar.zze());
        map.put("AES256_EAX", zzgie.zzd);
        zzgfr zzgfrVar2 = new zzgfr(null);
        zzgfrVar2.zza(16);
        zzgfrVar2.zzb(32);
        zzgfrVar2.zzc(16);
        zzgfrVar2.zzd(zzgfsVar);
        map.put("AES256_EAX_RAW", zzgfrVar2.zze());
        zzgmgVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgma.zzb().zzc(zzd, zzgfu.class);
        zzgkz.zzc().zzd(zzc, true);
    }
}
