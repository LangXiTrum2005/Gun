package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzasb extends zzgxr implements zzgzd {
    public static final /* synthetic */ int zza = 0;
    private static final zzasb zzb;
    private static volatile zzgzk zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        zzasb zzasbVar = new zzasb();
        zzb = zzasbVar;
        zzgxr.zzbZ(zzasb.class, zzasbVar);
    }

    private zzasb() {
    }

    public static zzasb zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzasb();
        }
        zzasa zzasaVar = null;
        if (iOrdinal == 4) {
            return new zzarz(zzasaVar);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzc;
        if (zzgxmVar == null) {
            synchronized (zzasb.class) {
                try {
                    zzgxmVar = zzc;
                    if (zzgxmVar == null) {
                        zzgxmVar = new zzgxm(zzb);
                        zzc = zzgxmVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxmVar;
    }
}
