package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsh extends zzgxr implements zzgzd {
    private static final zzgsh zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        zzgsh zzgshVar = new zzgsh();
        zza = zzgshVar;
        zzgxr.zzbZ(zzgsh.class, zzgshVar);
    }

    private zzgsh() {
    }

    public static zzgsf zzc() {
        return (zzgsf) zza.zzaZ();
    }

    public static zzgsh zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgry zzb() {
        zzgry zzgryVar;
        int i = this.zzc;
        if (i == 0) {
            zzgryVar = zzgry.UNKNOWN_HASH;
        } else if (i == 1) {
            zzgryVar = zzgry.SHA1;
        } else if (i == 2) {
            zzgryVar = zzgry.SHA384;
        } else if (i == 3) {
            zzgryVar = zzgry.SHA256;
        } else if (i != 4) {
            zzgryVar = i != 5 ? null : zzgry.SHA224;
        } else {
            zzgryVar = zzgry.SHA512;
        }
        return zzgryVar == null ? zzgry.UNRECOGNIZED : zzgryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzgsh();
        }
        zzgsg zzgsgVar = null;
        if (iOrdinal == 4) {
            return new zzgsf(zzgsgVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgsh.class) {
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
