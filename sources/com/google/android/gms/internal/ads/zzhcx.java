package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhcx extends zzgxr implements zzgzd {
    private static final zzhcx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgwj zzf;
    private zzgwj zzg;

    static {
        zzhcx zzhcxVar = new zzhcx();
        zza = zzhcxVar;
        zzgxr.zzbZ(zzhcx.class, zzhcxVar);
    }

    private zzhcx() {
        zzgwj zzgwjVar = zzgwj.zzb;
        this.zzf = zzgwjVar;
        this.zzg = zzgwjVar;
    }

    public static zzhcv zzc() {
        return (zzhcv) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhcx zzhcxVar, zzgwj zzgwjVar) {
        zzgwjVar.getClass();
        zzhcxVar.zzc |= 4;
        zzhcxVar.zzf = zzgwjVar;
    }

    public static /* synthetic */ void zzg(zzhcx zzhcxVar, String str) {
        zzhcxVar.zzc |= 2;
        zzhcxVar.zze = "image/png";
    }

    public static /* synthetic */ void zzh(zzhcx zzhcxVar, int i) {
        zzhcxVar.zzd = 1;
        zzhcxVar.zzc = 1 | zzhcxVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhcw.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzhcx();
        }
        zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new zzhcv(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzhcx.class) {
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
