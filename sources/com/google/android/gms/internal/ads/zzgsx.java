package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsx extends zzgxr implements zzgzd {
    private static final zzgsx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgyd zzd = zzgxr.zzbK();

    static {
        zzgsx zzgsxVar = new zzgsx();
        zza = zzgsxVar;
        zzgxr.zzbZ(zzgsx.class, zzgsxVar);
    }

    private zzgsx() {
    }

    public static zzgst zzc() {
        return (zzgst) zza.zzaZ();
    }

    public static zzgsx zzg(InputStream inputStream, zzgxb zzgxbVar) throws IOException {
        return (zzgsx) zzgxr.zzbu(zza, inputStream, zzgxbVar);
    }

    public static /* synthetic */ void zzi(zzgsx zzgsxVar, zzgsv zzgsvVar) {
        zzgsvVar.getClass();
        zzgyd zzgydVar = zzgsxVar.zzd;
        if (!zzgydVar.zzc()) {
            zzgsxVar.zzd = zzgxr.zzbL(zzgydVar);
        }
        zzgsxVar.zzd.add(zzgsvVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgsv zzd(int i) {
        return (zzgsv) this.zzd.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgsv.class});
        }
        if (iOrdinal == 3) {
            return new zzgsx();
        }
        zzgsw zzgswVar = null;
        if (iOrdinal == 4) {
            return new zzgst(zzgswVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzgsx.class) {
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

    public final List zzh() {
        return this.zzd;
    }
}
