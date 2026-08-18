package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzasx extends zzgxr implements zzgzd {
    private static final zzasx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzasx zzasxVar = new zzasx();
        zza = zzasxVar;
        zzgxr.zzbZ(zzasx.class, zzasxVar);
    }

    private zzasx() {
    }

    public static zzasw zza() {
        return (zzasw) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 32;
        zzasxVar.zzi = j;
    }

    public static /* synthetic */ void zzd(zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 4;
        zzasxVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 1;
        zzasxVar.zzd = j;
    }

    public static /* synthetic */ void zzg(zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 8;
        zzasxVar.zzg = j;
    }

    public static /* synthetic */ void zzh(zzasx zzasxVar, long j) {
        zzasxVar.zzc |= 16;
        zzasxVar.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzasx();
        }
        zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new zzasw(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzasx.class) {
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
