package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzasv extends zzgxr implements zzgzd {
    private static final zzasv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzasv zzasvVar = new zzasv();
        zza = zzasvVar;
        zzgxr.zzbZ(zzasv.class, zzasvVar);
    }

    private zzasv() {
    }

    public static zzasu zza() {
        return (zzasu) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasv zzasvVar) {
        zzasvVar.zzc &= -9;
        zzasvVar.zzg = -1L;
    }

    public static /* synthetic */ void zzd(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 8;
        zzasvVar.zzg = j;
    }

    public static /* synthetic */ void zzf(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 32;
        zzasvVar.zzi = j;
    }

    public static /* synthetic */ void zzg(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 4096;
        zzasvVar.zzp = j;
    }

    public static /* synthetic */ void zzh(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 512;
        zzasvVar.zzm = j;
    }

    public static /* synthetic */ void zzi(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 2048;
        zzasvVar.zzo = j;
    }

    public static /* synthetic */ void zzj(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 4;
        zzasvVar.zzf = j;
    }

    public static /* synthetic */ void zzk(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 16;
        zzasvVar.zzh = j;
    }

    public static /* synthetic */ void zzl(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 128;
        zzasvVar.zzk = j;
    }

    public static /* synthetic */ void zzm(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 131072;
        zzasvVar.zzy = j;
    }

    public static /* synthetic */ void zzn(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 1;
        zzasvVar.zzd = j;
    }

    public static /* synthetic */ void zzo(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 262144;
        zzasvVar.zzz = j;
    }

    public static /* synthetic */ void zzp(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 2;
        zzasvVar.zze = j;
    }

    public static /* synthetic */ void zzq(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 256;
        zzasvVar.zzl = j;
    }

    public static /* synthetic */ void zzr(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 32768;
        zzasvVar.zzw = j;
    }

    public static /* synthetic */ void zzs(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 65536;
        zzasvVar.zzx = j;
    }

    public static /* synthetic */ void zzt(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 8192;
        zzasvVar.zzu = j;
    }

    public static /* synthetic */ void zzu(zzasv zzasvVar, long j) {
        zzasvVar.zzc |= 16384;
        zzasvVar.zzv = j;
    }

    public static /* synthetic */ void zzv(zzasv zzasvVar, int i) {
        zzasvVar.zzn = i - 1;
        zzasvVar.zzc |= 1024;
    }

    public static /* synthetic */ void zzw(zzasv zzasvVar, int i) {
        zzasvVar.zzj = i - 1;
        zzasvVar.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzgxx zzgxxVar = zzate.zza;
            return zzgxr.zzbQ(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgxxVar, "zzk", "zzl", "zzm", "zzn", zzgxxVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        if (iOrdinal == 3) {
            return new zzasv();
        }
        zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new zzasu(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzasv.class) {
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
