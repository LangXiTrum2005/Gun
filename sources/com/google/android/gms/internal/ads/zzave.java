package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzave extends zzatq {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzave() {
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }

    public zzave(String str) {
        HashMap mapZza = zzatq.zza(str);
        if (mapZza != null) {
            this.zza = (Long) mapZza.get(0);
            this.zzb = (Long) mapZza.get(1);
            this.zzc = (Long) mapZza.get(2);
        }
    }
}
