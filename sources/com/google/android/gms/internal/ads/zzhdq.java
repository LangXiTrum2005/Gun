package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhdq extends zzgxr implements zzgzd {
    private static final zzhdq zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzgxz zzf = zzgxr.zzbG();
    private zzgyd zzh = zzgxr.zzbK();
    private zzgwj zzi = zzgwj.zzb;

    static {
        zzhdq zzhdqVar = new zzhdq();
        zza = zzhdqVar;
        zzgxr.zzbZ(zzhdq.class, zzhdqVar);
    }

    private zzhdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhdo.class, "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzhdq();
        }
        zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new zzhdp(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzhdq.class) {
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
