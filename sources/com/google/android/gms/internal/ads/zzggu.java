package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzggs
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            zzggr zzggrVar = (zzggr) zzgdxVar;
            int i = zzggu.zza;
            return zzgjp.zze() ? zzgjp.zzb(zzggrVar) : zzgup.zzb(zzggrVar);
        }
    }, zzggr.class, zzgdn.class);
    private static final zzglz zzc = new zzglz() { // from class: com.google.android.gms.internal.ads.zzggt
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) {
            int i = zzggu.zza;
            return zzggr.zza(((zzggw) zzgekVar).zzb(), zzgvp.zzc(32), num);
        }
    };
    private static final zzgdy zzd = zzgli.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgdn.class, zzgsj.SYMMETRIC, zzgru.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgju.zza;
        zzgju.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzb);
        zzgma.zzb().zzc(zzc, zzggw.class);
        zzgmg zzgmgVarZzb = zzgmg.zzb();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzggw.zzc(zzggv.zza));
        map.put("CHACHA20_POLY1305_RAW", zzggw.zzc(zzggv.zzc));
        zzgmgVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgkz.zzc().zzd(zzd, true);
    }
}
