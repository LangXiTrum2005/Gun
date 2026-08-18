package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbiu implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        zzcex zzcexVar = (zzcex) obj;
        zzbfk zzbfkVarZzK = zzcexVar.zzK();
        if (zzbfkVarZzK == null || (jSONObjectZza = zzbfkVarZzK.zza()) == null) {
            zzcexVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcexVar.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
