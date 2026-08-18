package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhbp extends zzgxr implements zzgzd {
    private static final zzhbp zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhbp zzhbpVar = new zzhbp();
        zza = zzhbpVar;
        zzgxr.zzbZ(zzhbp.class, zzhbpVar);
    }

    private zzhbp() {
    }

    public static zzhbo zzc() {
        return (zzhbo) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhbp zzhbpVar, String str) {
        zzhbpVar.zzc |= 1;
        zzhbpVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhbp();
        }
        zzhdx zzhdxVar = null;
        if (iOrdinal == 4) {
            return new zzhbo(zzhdxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzhbp.class) {
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
