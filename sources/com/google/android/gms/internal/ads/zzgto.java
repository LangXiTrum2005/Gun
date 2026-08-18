package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgto extends zzgxr implements zzgzd {
    private static final zzgto zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private zzgsp zze;

    static {
        zzgto zzgtoVar = new zzgto();
        zza = zzgtoVar;
        zzgxr.zzbZ(zzgto.class, zzgtoVar);
    }

    private zzgto() {
    }

    public static zzgtm zzb() {
        return (zzgtm) zza.zzaZ();
    }

    public static zzgto zzd() {
        return zza;
    }

    public static zzgto zzf(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgto) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static /* synthetic */ void zzh(zzgto zzgtoVar, zzgsp zzgspVar) {
        zzgspVar.getClass();
        zzgtoVar.zze = zzgspVar;
        zzgtoVar.zzc |= 1;
    }

    public static /* synthetic */ void zzi(zzgto zzgtoVar, String str) {
        str.getClass();
        zzgtoVar.zzd = str;
    }

    public final zzgsp zza() {
        zzgsp zzgspVar = this.zze;
        return zzgspVar == null ? zzgsp.zzd() : zzgspVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgto();
        }
        zzgtn zzgtnVar = null;
        if (iOrdinal == 4) {
            return new zzgtm(zzgtnVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgto.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}
