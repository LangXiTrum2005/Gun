package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjn implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        if (map.keySet().contains("start")) {
            zzcexVar.zzax(true);
        }
        if (map.keySet().contains("stop")) {
            zzcexVar.zzax(false);
        }
    }
}
