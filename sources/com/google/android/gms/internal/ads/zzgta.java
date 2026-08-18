package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgta extends zzgxr implements zzgzd {
    private static final zzgta zza;
    private static volatile zzgzk zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgta zzgtaVar = new zzgta();
        zza = zzgtaVar;
        zzgxr.zzbZ(zzgta.class, zzgtaVar);
    }

    private zzgta() {
    }

    public static zzgsz zza() {
        return (zzgsz) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzgta zzgtaVar, String str) {
        str.getClass();
        zzgtaVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgta();
        }
        zzgtb zzgtbVar = null;
        if (iOrdinal == 4) {
            return new zzgsz(zzgtbVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgta.class) {
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
