package com.google.android.gms.internal.ads;

import com.umeng.analytics.pro.f;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class zzhem {
    final LinkedHashMap zza;

    public zzhem(int i) {
        this.zza = zzheo.zzb(i);
    }

    public final zzhem zza(Object obj, zzhfa zzhfaVar) {
        zzhez.zza(obj, "key");
        zzhez.zza(zzhfaVar, f.M);
        this.zza.put(obj, zzhfaVar);
        return this;
    }
}
