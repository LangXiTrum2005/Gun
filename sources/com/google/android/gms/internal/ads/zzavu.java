package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzavu extends zzatq {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzavu() {
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }

    public zzavu(String str) {
        HashMap mapZza = zzatq.zza(str);
        if (mapZza != null) {
            this.zza = (Long) mapZza.get(0);
            this.zzb = (Boolean) mapZza.get(1);
            this.zzc = (Boolean) mapZza.get(2);
        }
    }
}
