package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfoj extends zzgxr implements zzgzd {
    private static final zzfoj zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfof zzg;

    static {
        zzfoj zzfojVar = new zzfoj();
        zza = zzfojVar;
        zzgxr.zzbZ(zzfoj.class, zzfojVar);
    }

    private zzfoj() {
    }

    public static zzfog zza() {
        return (zzfog) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfoj zzfojVar, String str) {
        str.getClass();
        zzfojVar.zzc |= 2;
        zzfojVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfoj zzfojVar, zzfof zzfofVar) {
        zzfofVar.getClass();
        zzfojVar.zzg = zzfofVar;
        zzfojVar.zzc |= 8;
    }

    public static /* synthetic */ void zzf(zzfoj zzfojVar, int i) {
        zzfojVar.zzd = 1;
        zzfojVar.zzc = 1 | zzfojVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfoh.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzfoj();
        }
        zzfoi zzfoiVar = null;
        if (iOrdinal == 4) {
            return new zzfog(zzfoiVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzfoj.class) {
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
