package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjc implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzftt.zzc("true", str) && !zzftt.zzc("false", str)) {
                return;
            }
            zzfrb.zza(zzcexVar.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
