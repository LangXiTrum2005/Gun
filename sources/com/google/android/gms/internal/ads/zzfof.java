package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfof extends zzgxr implements zzgzd {
    private static final zzfof zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgxz zzd = zzgxr.zzbG();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfof zzfofVar = new zzfof();
        zza = zzfofVar;
        zzgxr.zzbZ(zzfof.class, zzfofVar);
    }

    private zzfof() {
    }

    public static zzfod zza() {
        return (zzfod) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfof zzfofVar, String str) {
        str.getClass();
        zzfofVar.zzc |= 1;
        zzfofVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfof zzfofVar, int i) {
        zzgxz zzgxzVar = zzfofVar.zzd;
        if (!zzgxzVar.zzc()) {
            zzfofVar.zzd = zzgxr.zzbH(zzgxzVar);
        }
        zzfofVar.zzd.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfoc.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzfof();
        }
        zzfoe zzfoeVar = null;
        if (iOrdinal == 4) {
            return new zzfod(zzfoeVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzfof.class) {
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
