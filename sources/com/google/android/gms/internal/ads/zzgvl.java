package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgvl implements zzgej {
    private static final byte[] zza = {0};
    private final zzgpy zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgvl(zzgnx zzgnxVar) throws GeneralSecurityException {
        this.zzb = new zzgvi(zzgnxVar.zzd().zzd(zzgdw.zza()));
        this.zzc = zzgnxVar.zzb().zzb();
        this.zzd = zzgnxVar.zzc().zzc();
        if (zzgnxVar.zzb().zzf().equals(zzgod.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgej zza(zzgnx zzgnxVar) throws GeneralSecurityException {
        return new zzgvl(zzgnxVar);
    }

    public static zzgej zzb(zzgom zzgomVar) throws GeneralSecurityException {
        return new zzgvl(zzgomVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzguo.zzb(this.zzd, this.zzb.zza(zzguo.zzb(bArr, bArr2), this.zzc)) : zzguo.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgvl(zzgom zzgomVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzgomVar.zzb().zzf());
        this.zzb = new zzgvk("HMAC".concat(strValueOf), new SecretKeySpec(zzgomVar.zzd().zzd(zzgdw.zza()), "HMAC"));
        this.zzc = zzgomVar.zzb().zzb();
        this.zzd = zzgomVar.zzc().zzc();
        if (zzgomVar.zzb().zzg().equals(zzgou.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgvl(zzgpy zzgpyVar, int i) throws GeneralSecurityException {
        this.zzb = zzgpyVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgpyVar.zza(new byte[0], i);
    }
}
