package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsv extends zzgxr implements zzgzd {
    private static final zzgsv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgsl zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgsv zzgsvVar = new zzgsv();
        zza = zzgsvVar;
        zzgxr.zzbZ(zzgsv.class, zzgsvVar);
    }

    private zzgsv() {
    }

    public static zzgsu zzc() {
        return (zzgsu) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzgsv zzgsvVar, zzgsl zzgslVar) {
        zzgslVar.getClass();
        zzgsvVar.zzd = zzgslVar;
        zzgsvVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgsl zzb() {
        zzgsl zzgslVar = this.zzd;
        return zzgslVar == null ? zzgsl.zzd() : zzgslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzgsv();
        }
        zzgsw zzgswVar = null;
        if (iOrdinal == 4) {
            return new zzgsu(zzgswVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgsv.class) {
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

    public final zzgtp zzf() {
        zzgtp zzgtpVarZzb = zzgtp.zzb(this.zzg);
        return zzgtpVarZzb == null ? zzgtp.UNRECOGNIZED : zzgtpVarZzb;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
