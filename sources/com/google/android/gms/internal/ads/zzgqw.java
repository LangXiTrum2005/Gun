package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgqw extends zzgxr implements zzgzd {
    private static final zzgqw zza;
    private static volatile zzgzk zzb;
    private int zzc;

    static {
        zzgqw zzgqwVar = new zzgqw();
        zza = zzgqwVar;
        zzgxr.zzbZ(zzgqw.class, zzgqwVar);
    }

    private zzgqw() {
    }

    public static zzgqu zzb() {
        return (zzgqu) zza.zzaZ();
    }

    public static zzgqw zzd() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgqw();
        }
        zzgqv zzgqvVar = null;
        if (iOrdinal == 4) {
            return new zzgqu(zzgqvVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgqw.class) {
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
