package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhbh extends zzgxr implements zzgzd {
    private static final zzhbh zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgwj zzf = zzgwj.zzb;

    static {
        zzhbh zzhbhVar = new zzhbh();
        zza = zzhbhVar;
        zzgxr.zzbZ(zzhbh.class, zzhbhVar);
    }

    private zzhbh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhbg.zza, "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhbh();
        }
        zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new zzhbf(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzhbh.class) {
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
