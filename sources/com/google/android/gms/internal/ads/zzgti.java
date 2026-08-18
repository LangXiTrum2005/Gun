package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgti extends zzgxr implements zzgzd {
    private static final zzgti zza;
    private static volatile zzgzk zzb;
    private String zzc = "";

    static {
        zzgti zzgtiVar = new zzgti();
        zza = zzgtiVar;
        zzgxr.zzbZ(zzgti.class, zzgtiVar);
    }

    private zzgti() {
    }

    public static zzgtg zza() {
        return (zzgtg) zza.zzaZ();
    }

    public static zzgti zzc() {
        return zza;
    }

    public static zzgti zzd(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgti) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static /* synthetic */ void zzg(zzgti zzgtiVar, String str) {
        str.getClass();
        zzgtiVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgti();
        }
        zzgth zzgthVar = null;
        if (iOrdinal == 4) {
            return new zzgtg(zzgthVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgti.class) {
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
        return this.zzc;
    }
}
