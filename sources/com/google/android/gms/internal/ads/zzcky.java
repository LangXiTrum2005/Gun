package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcky {
    private final Map zza;
    private final Map zzb;

    public zzcky(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfca zzfcaVar) throws Exception {
        for (zzfby zzfbyVar : zzfcaVar.zzb.zzc) {
            if (this.zza.containsKey(zzfbyVar.zza) && zzfbyVar.zzb != null) {
                ((zzclb) this.zza.get(zzfbyVar.zza)).zza(zzfbyVar.zzb);
            } else if (this.zzb.containsKey(zzfbyVar.zza) && zzfbyVar.zzb != null) {
                zzcla zzclaVar = (zzcla) this.zzb.get(zzfbyVar.zza);
                JSONObject jSONObject = zzfbyVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzclaVar.zza(map);
            }
        }
    }
}
