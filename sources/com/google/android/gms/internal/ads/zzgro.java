package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgro extends zzgxr implements zzgzd {
    private static final zzgro zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd = zzgwj.zzb;

    static {
        zzgro zzgroVar = new zzgro();
        zza = zzgroVar;
        zzgxr.zzbZ(zzgro.class, zzgroVar);
    }

    private zzgro() {
    }

    public static zzgrm zzb() {
        return (zzgrm) zza.zzaZ();
    }

    public static zzgro zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgro) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static zzgzk zzg() {
        return zza.zzbN();
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
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzgro();
        }
        zzgrn zzgrnVar = null;
        if (iOrdinal == 4) {
            return new zzgrm(zzgrnVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgro.class) {
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

    public final zzgwj zzf() {
        return this.zzd;
    }
}
