package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfij extends zzgxr implements zzgzd {
    private static final zzfij zza;
    private static volatile zzgzk zzb;
    private zzgyd zzc = zzgxr.zzbK();

    static {
        zzfij zzfijVar = new zzfij();
        zza = zzfijVar;
        zzgxr.zzbZ(zzfij.class, zzfijVar);
    }

    private zzfij() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfig.class});
        }
        if (iOrdinal == 3) {
            return new zzfij();
        }
        zzfii zzfiiVar = null;
        if (iOrdinal == 4) {
            return new zzfih(zzfiiVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzfij.class) {
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
