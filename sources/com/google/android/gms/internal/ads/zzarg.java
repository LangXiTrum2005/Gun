package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarg extends zzgxr implements zzgzd {
    private static final zzarg zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private zzary zzi;
    private zzasb zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        zzarg zzargVar = new zzarg();
        zza = zzargVar;
        zzgxr.zzbZ(zzarg.class, zzargVar);
    }

    private zzarg() {
    }

    public static zzare zza() {
        return (zzare) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzarg zzargVar, boolean z) {
        zzargVar.zzc |= 8;
        zzargVar.zzg = z;
    }

    public static /* synthetic */ void zzh(zzarg zzargVar, String str) {
        str.getClass();
        zzargVar.zzc |= 4;
        zzargVar.zzf = str;
    }

    public final zzary zzc() {
        zzary zzaryVar = this.zzi;
        return zzaryVar == null ? zzary.zzc() : zzaryVar;
    }

    public final zzasb zzd() {
        zzasb zzasbVar = this.zzj;
        return zzasbVar == null ? zzasb.zzb() : zzasbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzarh.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzarg();
        }
        zzarf zzarfVar = null;
        if (iOrdinal == 4) {
            return new zzare(zzarfVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzarg.class) {
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

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzg;
    }
}
