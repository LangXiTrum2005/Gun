package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsp extends zzgxr implements zzgzd {
    private static final zzgsp zza;
    private static volatile zzgzk zzb;
    private String zzc = "";
    private zzgwj zzd = zzgwj.zzb;
    private int zze;

    static {
        zzgsp zzgspVar = new zzgsp();
        zza = zzgspVar;
        zzgxr.zzbZ(zzgsp.class, zzgspVar);
    }

    private zzgsp() {
    }

    public static zzgsn zza() {
        return (zzgsn) zza.zzaZ();
    }

    public static zzgsn zzb(zzgsp zzgspVar) {
        return (zzgsn) zza.zzba(zzgspVar);
    }

    public static zzgsp zzd() {
        return zza;
    }

    public static zzgsp zzf(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
        return (zzgsp) zzgxr.zzbx(zza, bArr, zzgxbVar);
    }

    public static /* synthetic */ void zzk(zzgsp zzgspVar, String str) {
        str.getClass();
        zzgspVar.zzc = str;
    }

    public static /* synthetic */ void zzl(zzgsp zzgspVar, zzgwj zzgwjVar) {
        zzgwjVar.getClass();
        zzgspVar.zzd = zzgwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgsp();
        }
        zzgso zzgsoVar = null;
        if (iOrdinal == 4) {
            return new zzgsn(zzgsoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgsp.class) {
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

    public final zzgtp zzg() {
        zzgtp zzgtpVarZzb = zzgtp.zzb(this.zze);
        return zzgtpVarZzb == null ? zzgtp.UNRECOGNIZED : zzgtpVarZzb;
    }

    public final zzgwj zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
