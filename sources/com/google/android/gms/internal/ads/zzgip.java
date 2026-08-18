package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgip {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgim
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            zzgil zzgilVar = (zzgil) zzgdxVar;
            int i = zzgip.zza;
            return zzgkk.zzc() ? zzgkk.zzb(zzgilVar) : zzgvn.zzb(zzgilVar);
        }
    }, zzgil.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgdn.class, zzgsj.SYMMETRIC, zzgue.zzg());
    private static final zzgmb zzd = new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgin
    };
    private static final zzglz zze = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgio
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) {
            int i = zzgip.zza;
            return zzgil.zza(((zzgir) zzgekVar).zzb(), zzgvp.zzc(32), num);
        }
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgkp.zza;
        zzgkp.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzb);
        zzgmg zzgmgVarZzb = zzgmg.zzb();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzgir.zzc(zzgiq.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzgir.zzc(zzgiq.zzc));
        zzgmgVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgma.zzb().zzc(zze, zzgir.class);
        zzgmc.zza().zzb(zzd, zzgir.class);
        zzgkz.zzc().zzd(zzc, true);
    }
}
