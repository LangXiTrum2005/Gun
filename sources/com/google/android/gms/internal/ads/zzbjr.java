package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjr implements zzbjp {
    private final zzbjs zza;

    public zzbjr(zzbjs zzbjsVar) {
        this.zza = zzbjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to parse float", e);
        }
        this.zza.zzc(zEquals);
        this.zza.zzb(zEquals2, f);
        zzcexVar.zzay(zEquals);
    }
}
