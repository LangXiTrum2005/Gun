package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgty extends zzgxr implements zzgzd {
    private static final zzgty zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgub zze;

    static {
        zzgty zzgtyVar = new zzgty();
        zza = zzgtyVar;
        zzgxr.zzbZ(zzgty.class, zzgtyVar);
    }

    private zzgty() {
    }

    public static zzgtw zzb() {
        return (zzgtw) zza.zzaZ();
    }

    public static zzgty zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgty) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static /* synthetic */ void zzg(zzgty zzgtyVar, zzgub zzgubVar) {
        zzgubVar.getClass();
        zzgtyVar.zze = zzgubVar;
        zzgtyVar.zzc |= 1;
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
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgty();
        }
        zzgtx zzgtxVar = null;
        if (iOrdinal == 4) {
            return new zzgtw(zzgtxVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgty.class) {
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
}
