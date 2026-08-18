package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtv extends zzgxr implements zzgzd {
    private static final zzgtv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgub zze;
    private zzgwj zzf = zzgwj.zzb;

    static {
        zzgtv zzgtvVar = new zzgtv();
        zza = zzgtvVar;
        zzgxr.zzbZ(zzgtv.class, zzgtvVar);
    }

    private zzgtv() {
    }

    public static zzgtt zzb() {
        return (zzgtt) zza.zzaZ();
    }

    public static zzgtv zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgtv) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static /* synthetic */ void zzi(zzgtv zzgtvVar, zzgub zzgubVar) {
        zzgubVar.getClass();
        zzgtvVar.zze = zzgubVar;
        zzgtvVar.zzc |= 1;
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
            return new zzgtv();
        }
        zzgtu zzgtuVar = null;
        if (iOrdinal == 4) {
            return new zzgtt(zzgtuVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgtv.class) {
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

    public final zzgub zzf() {
        zzgub zzgubVar = this.zze;
        return zzgubVar == null ? zzgub.zzd() : zzgubVar;
    }

    public final zzgwj zzg() {
        return this.zzf;
    }
}
