package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzggx
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) {
            zzghe zzgheVar = (zzghe) zzgdxVar;
            int i = zzggz.zza;
            return zzgkc.zzc(zzgei.zza(zzgheVar.zzb().zzd()).zzb(), zzgheVar.zzc());
        }
    }, zzghe.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgdn.class, zzgsj.REMOTE, zzgtf.zzg());
    private static final zzglz zzd = new zzglz() { // from class: com.google.android.gms.internal.ads.zzggy
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) {
            return zzghe.zza((zzghg) zzgekVar, num);
        }
    };

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = zzghl.zza;
        zzghl.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzb);
        zzgma.zzb().zzc(zzd, zzghg.class);
        zzgkz.zzc().zzd(zzc, true);
    }
}
