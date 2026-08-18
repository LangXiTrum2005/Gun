package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgqq extends zzgxr implements zzgzd {
    private static final zzgqq zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgqw zze;
    private zzgwj zzf = zzgwj.zzb;

    static {
        zzgqq zzgqqVar = new zzgqq();
        zza = zzgqqVar;
        zzgxr.zzbZ(zzgqq.class, zzgqqVar);
    }

    private zzgqq() {
    }

    public static zzgqo zzb() {
        return (zzgqo) zza.zzaZ();
    }

    public static zzgqq zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgqq zzgqqVar, zzgqw zzgqwVar) {
        zzgqwVar.getClass();
        zzgqqVar.zze = zzgqwVar;
        zzgqqVar.zzc |= 1;
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
            return zzgxr.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgqq();
        }
        zzgqp zzgqpVar = null;
        if (iOrdinal == 4) {
            return new zzgqo(zzgqpVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgqq.class) {
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

    public final zzgqw zzf() {
        zzgqw zzgqwVar = this.zze;
        return zzgqwVar == null ? zzgqw.zzd() : zzgqwVar;
    }

    public final zzgwj zzg() {
        return this.zzf;
    }
}
