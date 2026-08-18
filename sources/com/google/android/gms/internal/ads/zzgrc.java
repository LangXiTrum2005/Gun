package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgrc extends zzgxr implements zzgzd {
    private static final zzgrc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgrf zzd;
    private int zze;

    static {
        zzgrc zzgrcVar = new zzgrc();
        zza = zzgrcVar;
        zzgxr.zzbZ(zzgrc.class, zzgrcVar);
    }

    private zzgrc() {
    }

    public static zzgra zzb() {
        return (zzgra) zza.zzaZ();
    }

    public static zzgrc zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgrc) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static /* synthetic */ void zzh(zzgrc zzgrcVar, zzgrf zzgrfVar) {
        zzgrfVar.getClass();
        zzgrcVar.zzd = zzgrfVar;
        zzgrcVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgrc();
        }
        zzgrb zzgrbVar = null;
        if (iOrdinal == 4) {
            return new zzgra(zzgrbVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgrc.class) {
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

    public final zzgrf zzf() {
        zzgrf zzgrfVar = this.zzd;
        return zzgrfVar == null ? zzgrf.zzd() : zzgrfVar;
    }
}
