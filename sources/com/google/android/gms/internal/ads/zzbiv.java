package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbiv implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzcex zzcexVar = (zzcex) obj;
        zzbfk zzbfkVarZzK = zzcexVar.zzK();
        if (zzbfkVarZzK == null || (jSONObjectZzb = zzbfkVarZzK.zzb()) == null) {
            zzcexVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcexVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
