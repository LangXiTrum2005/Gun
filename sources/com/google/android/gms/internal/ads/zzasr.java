package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzasr extends zzgxr implements zzgzd {
    private static final zzasr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        zzasr zzasrVar = new zzasr();
        zza = zzasrVar;
        zzgxr.zzbZ(zzasr.class, zzasrVar);
    }

    private zzasr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", zzasg.zza, "zze"});
        }
        if (iOrdinal == 3) {
            return new zzasr();
        }
        zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new zzasq(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzasr.class) {
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
