package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzfwt extends zzfwh {
    final /* synthetic */ zzfww zza;
    private final Object zzb;
    private int zzc;

    public zzfwt(zzfww zzfwwVar, int i) {
        this.zza = zzfwwVar;
        this.zzb = zzfww.zzg(zzfwwVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfuk.zza(this.zzb, zzfww.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfww.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfww zzfwwVar = this.zza;
        Object objZzj = zzfww.zzj(zzfwwVar, i);
        zzfww.zzn(zzfwwVar, this.zzc, obj);
        return objZzj;
    }
}
