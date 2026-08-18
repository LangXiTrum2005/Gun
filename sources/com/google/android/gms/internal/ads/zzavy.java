package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzavy extends zzatq {
    public Long zza;
    public Long zzb;

    public zzavy() {
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        return map;
    }

    public zzavy(String str) {
        HashMap mapZza = zzatq.zza(str);
        if (mapZza != null) {
            this.zza = (Long) mapZza.get(0);
            this.zzb = (Long) mapZza.get(1);
        }
    }
}
