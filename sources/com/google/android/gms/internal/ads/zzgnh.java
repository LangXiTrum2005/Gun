package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgnh implements zzgnm {
    private final String zza;
    private final zzgvo zzb;
    private final zzgwj zzc;
    private final zzgsj zzd;
    private final zzgtp zze;

    @Nullable
    private final Integer zzf;

    private zzgnh(String str, zzgvo zzgvoVar, zzgwj zzgwjVar, zzgsj zzgsjVar, zzgtp zzgtpVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzgvoVar;
        this.zzc = zzgwjVar;
        this.zzd = zzgsjVar;
        this.zze = zzgtpVar;
        this.zzf = num;
    }

    public static zzgnh zza(String str, zzgwj zzgwjVar, zzgsj zzgsjVar, zzgtp zzgtpVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzgtpVar == zzgtp.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgnh(str, zzgnu.zza(str), zzgwjVar, zzgsjVar, zzgtpVar, num);
    }

    public final zzgsj zzb() {
        return this.zzd;
    }

    public final zzgtp zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final zzgvo zzd() {
        return this.zzb;
    }

    public final zzgwj zze() {
        return this.zzc;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
