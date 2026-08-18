package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgii {
    private static final zzglz zza = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgig
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) {
            return zzgif.zza((zzgik) zzgekVar, zzgvp.zzc(32), num);
        }
    };
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgih
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            return zzgke.zzb((zzgif) zzgdxVar);
        }
    }, zzgif.class, zzgdn.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzgkj.zza;
        zzgkj.zze(zzgmk.zzc());
        zzgmg zzgmgVarZzb = zzgmg.zzb();
        HashMap map = new HashMap();
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzgie.zzg);
        zzgmgVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgmh.zza().zze(zzb);
        zzgma.zzb().zzc(zza, zzgik.class);
    }
}
