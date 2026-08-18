package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgdy zzb = zzgli.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgdn.class, zzgsj.SYMMETRIC, zzgtl.zzg());
    private static final zzglz zzc = new zzglz() { // from class: com.google.android.gms.internal.ads.zzghb
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) {
            return zzghm.zza((zzghr) zzgekVar, num);
        }
    };
    private static final zzgmx zzd = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzghc
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdx zzgdxVar) throws GeneralSecurityException {
            zzghm zzghmVar = (zzghm) zzgdxVar;
            int i = zzghd.zza;
            String strZzd = zzghmVar.zzb().zzd();
            zzgeu zzgeuVarZzb = zzghmVar.zzb().zzb();
            zzgdn zzgdnVarZzb = zzgei.zza(strZzd).zzb();
            int i2 = zzgha.zza;
            try {
                return zzgkc.zzc(new zzgha(zzgsp.zzf(zzgeq.zzb(zzgeuVarZzb), zzgxb.zza()), zzgdnVarZzb), zzghmVar.zzc());
            } catch (zzgyg e) {
                throw new GeneralSecurityException(e);
            }
        }
    }, zzghm.class, zzgdn.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i = zzghw.zza;
        zzghw.zze(zzgmk.zzc());
        zzgma.zzb().zzc(zzc, zzghr.class);
        zzgmh.zza().zze(zzd);
        zzgkz.zzc().zzd(zzb, true);
    }
}
