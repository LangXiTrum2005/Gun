package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhbc extends zzgxr implements zzgzd {
    private static final zzhbc zza;
    private static volatile zzgzk zzb;
    private zzgyd zzc = zzgxr.zzbK();

    static {
        zzhbc zzhbcVar = new zzhbc();
        zza = zzhbcVar;
        zzgxr.zzbZ(zzhbc.class, zzhbcVar);
    }

    private zzhbc() {
    }

    public static zzhbb zzc() {
        return (zzhbb) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhbc zzhbcVar, zzhba zzhbaVar) {
        zzhbaVar.getClass();
        zzgyd zzgydVar = zzhbcVar.zzc;
        if (!zzgydVar.zzc()) {
            zzhbcVar.zzc = zzgxr.zzbL(zzgydVar);
        }
        zzhbcVar.zzc.add(zzhbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhba.class});
        }
        if (iOrdinal == 3) {
            return new zzhbc();
        }
        zzhbd zzhbdVar = null;
        if (iOrdinal == 4) {
            return new zzhbb(zzhbdVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzhbc.class) {
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
