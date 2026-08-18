package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgqn extends zzgxr implements zzgzd {
    private static final zzgqn zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgqt zzd;
    private zzgse zze;

    static {
        zzgqn zzgqnVar = new zzgqn();
        zza = zzgqnVar;
        zzgxr.zzbZ(zzgqn.class, zzgqnVar);
    }

    private zzgqn() {
    }

    public static zzgql zza() {
        return (zzgql) zza.zzaZ();
    }

    public static zzgqn zzc(zzgwj zzgwjVar, zzgxb zzgxbVar) throws zzgyg {
        return (zzgqn) zzgxr.zzbr(zza, zzgwjVar, zzgxbVar);
    }

    public static /* synthetic */ void zzg(zzgqn zzgqnVar, zzgqt zzgqtVar) {
        zzgqtVar.getClass();
        zzgqnVar.zzd = zzgqtVar;
        zzgqnVar.zzc |= 1;
    }

    public static /* synthetic */ void zzh(zzgqn zzgqnVar, zzgse zzgseVar) {
        zzgseVar.getClass();
        zzgqnVar.zze = zzgseVar;
        zzgqnVar.zzc |= 2;
    }

    public final zzgqt zzd() {
        zzgqt zzgqtVar = this.zzd;
        return zzgqtVar == null ? zzgqt.zzd() : zzgqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgqn();
        }
        zzgqm zzgqmVar = null;
        if (iOrdinal == 4) {
            return new zzgql(zzgqmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgqn.class) {
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

    public final zzgse zzf() {
        zzgse zzgseVar = this.zze;
        return zzgseVar == null ? zzgse.zzf() : zzgseVar;
    }
}
