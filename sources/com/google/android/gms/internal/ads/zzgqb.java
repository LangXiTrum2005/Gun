package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgqb extends zzgxr implements zzgzd {
    private static final zzgqb zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgwj zze = zzgwj.zzb;
    private zzgqh zzf;

    static {
        zzgqb zzgqbVar = new zzgqb();
        zza = zzgqbVar;
        zzgxr.zzbZ(zzgqb.class, zzgqbVar);
    }

    private zzgqb() {
    }

    public static zzgpz zzb() {
        return (zzgpz) zza.zzaZ();
    }

    public static zzgqb zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgqb) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static zzgzk zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgqb zzgqbVar, zzgqh zzgqhVar) {
        zzgqhVar.getClass();
        zzgqbVar.zzf = zzgqhVar;
        zzgqbVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgqb();
        }
        zzgqa zzgqaVar = null;
        if (iOrdinal == 4) {
            return new zzgpz(zzgqaVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgqb.class) {
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

    public final zzgqh zzf() {
        zzgqh zzgqhVar = this.zzf;
        return zzgqhVar == null ? zzgqh.zzd() : zzgqhVar;
    }

    public final zzgwj zzg() {
        return this.zze;
    }
}
