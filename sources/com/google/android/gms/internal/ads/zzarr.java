package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarr extends zzgxr implements zzgzd {
    private static final zzarr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd = 2;

    static {
        zzarr zzarrVar = new zzarr();
        zza = zzarrVar;
        zzgxr.zzbZ(zzarr.class, zzarrVar);
    }

    private zzarr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", zzars.zza});
        }
        if (iOrdinal == 3) {
            return new zzarr();
        }
        zzarv zzarvVar = null;
        if (iOrdinal == 4) {
            return new zzarq(zzarvVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzarr.class) {
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
