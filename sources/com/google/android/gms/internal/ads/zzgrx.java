package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgrx extends zzgxr implements zzgzd {
    private static final zzgrx zza;
    private static volatile zzgzk zzb;

    static {
        zzgrx zzgrxVar = new zzgrx();
        zza = zzgrxVar;
        zzgxr.zzbZ(zzgrx.class, zzgrxVar);
    }

    private zzgrx() {
    }

    public static zzgrx zzb() {
        return zza;
    }

    public static zzgrx zzc(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgrx) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        zzgrw zzgrwVar = null;
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzgrx();
        }
        if (iOrdinal == 4) {
            return new zzgrv(zzgrwVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgrx.class) {
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
