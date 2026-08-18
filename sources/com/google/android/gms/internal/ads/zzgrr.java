package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgrr extends zzgxr implements zzgzd {
    private static final zzgrr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        zzgrr zzgrrVar = new zzgrr();
        zza = zzgrrVar;
        zzgxr.zzbZ(zzgrr.class, zzgrrVar);
    }

    private zzgrr() {
    }

    public static zzgrp zzc() {
        return (zzgrp) zza.zzaZ();
    }

    public static zzgrr zzf(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgrr) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgrr();
        }
        zzgrq zzgrqVar = null;
        if (iOrdinal == 4) {
            return new zzgrp(zzgrqVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgrr.class) {
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
