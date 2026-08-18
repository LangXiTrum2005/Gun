package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzheq implements zzhfa, zzhel {
    private static final Object zza = new Object();
    private volatile zzhfa zzb;
    private volatile Object zzc = zza;

    private zzheq(zzhfa zzhfaVar) {
        this.zzb = zzhfaVar;
    }

    public static zzhel zza(zzhfa zzhfaVar) {
        return zzhfaVar instanceof zzhel ? (zzhel) zzhfaVar : new zzheq(zzhfaVar);
    }

    public static zzhfa zzc(zzhfa zzhfaVar) {
        return zzhfaVar instanceof zzheq ? zzhfaVar : new zzheq(zzhfaVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
