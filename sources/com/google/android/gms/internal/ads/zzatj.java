package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatj extends zzgxr implements zzgzd {
    private static final zzatj zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgwj zzf = zzgwj.zzb;

    static {
        zzatj zzatjVar = new zzatj();
        zza = zzatjVar;
        zzgxr.zzbZ(zzatj.class, zzatjVar);
    }

    private zzatj() {
    }

    public static zzatj zzc() {
        return zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzgwj zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzatj();
        }
        zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new zzati(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzatj.class) {
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
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzc & 1) != 0;
    }
}
