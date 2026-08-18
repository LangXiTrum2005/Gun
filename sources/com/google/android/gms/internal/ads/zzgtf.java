package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtf extends zzgxr implements zzgzd {
    private static final zzgtf zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgti zze;

    static {
        zzgtf zzgtfVar = new zzgtf();
        zza = zzgtfVar;
        zzgxr.zzbZ(zzgtf.class, zzgtfVar);
    }

    private zzgtf() {
    }

    public static zzgtd zzb() {
        return (zzgtd) zza.zzaZ();
    }

    public static zzgtf zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgtf) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static zzgzk zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgtf zzgtfVar, zzgti zzgtiVar) {
        zzgtiVar.getClass();
        zzgtfVar.zze = zzgtiVar;
        zzgtfVar.zzc |= 1;
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
            return new zzgtf();
        }
        zzgte zzgteVar = null;
        if (iOrdinal == 4) {
            return new zzgtd(zzgteVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgtf.class) {
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

    public final zzgti zzf() {
        zzgti zzgtiVar = this.zze;
        return zzgtiVar == null ? zzgti.zzc() : zzgtiVar;
    }
}
