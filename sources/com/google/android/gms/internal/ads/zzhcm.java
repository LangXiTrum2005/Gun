package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzhcm extends zzgxr implements zzgzd {
    private static final zzhcm zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzhcl zze;
    private zzhcl zzf;

    static {
        zzhcm zzhcmVar = new zzhcm();
        zza = zzhcmVar;
        zzgxr.zzbZ(zzhcm.class, zzhcmVar);
    }

    private zzhcm() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhcj.zza, "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhcm();
        }
        zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new zzhci(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzhcm.class) {
                try {
                    zzgxmVar = zzb;
                    if (zzgxmVar == null) {
                        zzgxmVar = new zzgxm(zza);
                        zzb = zzgxmVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxmVar;
    }
}
