package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgqe extends zzgxr implements zzgzd {
    private static final zzgqe zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgqh zze;

    static {
        zzgqe zzgqeVar = new zzgqe();
        zza = zzgqeVar;
        zzgxr.zzbZ(zzgqe.class, zzgqeVar);
    }

    private zzgqe() {
    }

    public static zzgqc zzb() {
        return (zzgqc) zza.zzaZ();
    }

    public static zzgqe zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgqe) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static /* synthetic */ void zzh(zzgqe zzgqeVar, zzgqh zzgqhVar) {
        zzgqhVar.getClass();
        zzgqeVar.zze = zzgqhVar;
        zzgqeVar.zzc |= 1;
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
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgqe();
        }
        zzgqd zzgqdVar = null;
        if (iOrdinal == 4) {
            return new zzgqc(zzgqdVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgqe.class) {
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
        zzgqh zzgqhVar = this.zze;
        return zzgqhVar == null ? zzgqh.zzd() : zzgqhVar;
    }
}
