package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzgzm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzm zzb = new zzgzm();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzgzw zzc = new zzgyu();

    private zzgzm() {
    }

    public static zzgzm zza() {
        return zzb;
    }

    public final zzgzv zzb(Class cls) {
        zzgye.zzc(cls, "messageType");
        zzgzv zzgzvVarZza = (zzgzv) this.zzd.get(cls);
        if (zzgzvVarZza == null) {
            zzgzvVarZza = this.zzc.zza(cls);
            zzgye.zzc(cls, "messageType");
            zzgzv zzgzvVar = (zzgzv) this.zzd.putIfAbsent(cls, zzgzvVarZza);
            if (zzgzvVar != null) {
                return zzgzvVar;
            }
        }
        return zzgzvVarZza;
    }
}
