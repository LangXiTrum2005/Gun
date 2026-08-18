package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtl extends zzgxr implements zzgzd {
    private static final zzgtl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgto zze;

    static {
        zzgtl zzgtlVar = new zzgtl();
        zza = zzgtlVar;
        zzgxr.zzbZ(zzgtl.class, zzgtlVar);
    }

    private zzgtl() {
    }

    public static zzgtj zzb() {
        return (zzgtj) zza.zzaZ();
    }

    public static zzgtl zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgtl) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static zzgzk zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgtl zzgtlVar, zzgto zzgtoVar) {
        zzgtoVar.getClass();
        zzgtlVar.zze = zzgtoVar;
        zzgtlVar.zzc |= 1;
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
            return new zzgtl();
        }
        zzgtk zzgtkVar = null;
        if (iOrdinal == 4) {
            return new zzgtj(zzgtkVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgtl.class) {
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

    public final zzgto zzf() {
        zzgto zzgtoVar = this.zze;
        return zzgtoVar == null ? zzgto.zzd() : zzgtoVar;
    }
}
