package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzguh extends zzgxr implements zzgzd {
    private static final zzguh zza;
    private static volatile zzgzk zzb;
    private int zzc;

    static {
        zzguh zzguhVar = new zzguh();
        zza = zzguhVar;
        zzgxr.zzbZ(zzguh.class, zzguhVar);
    }

    private zzguh() {
    }

    public static zzguh zzc() {
        return zza;
    }

    public static zzguh zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzguh) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
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
            return new zzguh();
        }
        zzgug zzgugVar = null;
        if (iOrdinal == 4) {
            return new zzguf(zzgugVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzguh.class) {
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
