package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgli implements zzgdy {
    final String zza;
    final Class zzb;
    final zzgsj zzc;

    public zzgli(String str, Class cls, zzgsj zzgsjVar, zzgzk zzgzkVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgsjVar;
    }

    public static zzgdy zzd(String str, Class cls, zzgsj zzgsjVar, zzgzk zzgzkVar) {
        return new zzgli(str, cls, zzgsjVar, zzgzkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final zzgsl zza(zzgwj zzgwjVar) throws GeneralSecurityException {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb(this.zza);
        zzgsnVarZza.zzc(zzgwjVar);
        zzgsnVarZza.zza(zzgtp.RAW);
        zzgnh zzgnhVar = (zzgnh) zzgmk.zzc().zzd(zzgma.zzb().zza(zzgmk.zzc().zzb(zzgni.zza((zzgsp) zzgsnVarZza.zzbr())), null), zzgnh.class, zzgdw.zza());
        zzgsi zzgsiVarZza = zzgsl.zza();
        zzgsiVarZza.zzb(zzgnhVar.zzg());
        zzgsiVarZza.zzc(zzgnhVar.zze());
        zzgsiVarZza.zza(zzgnhVar.zzb());
        return (zzgsl) zzgsiVarZza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgdy
    public final Object zzc(zzgwj zzgwjVar) throws GeneralSecurityException {
        return zzgmh.zza().zzc(zzgmk.zzc().zza(zzgnh.zza(this.zza, zzgwjVar, this.zzc, zzgtp.RAW, null), zzgdw.zza()), this.zzb);
    }
}
