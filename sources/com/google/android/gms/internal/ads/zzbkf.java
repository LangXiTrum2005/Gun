package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbkf implements zzbjp {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbke zzbkeVar = (zzbke) this.zzb.remove(str);
                if (zzbkeVar == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    zzbkeVar.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    zzbkeVar.zzb(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbkeVar.zzb(jSONObject);
                } catch (JSONException e) {
                    zzbkeVar.zza(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AI zzb(zzbmw zzbmwVar, String str, JSONObject jSONObject) {
        zzcab zzcabVar = new zzcab();
        com.google.android.gms.ads.internal.zzv.zzq();
        String string = UUID.randomUUID().toString();
        zzc(string, new zzbkd(this, zzcabVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbmwVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzcabVar.zzd(e);
        }
        return zzcabVar;
    }

    public final void zzc(String str, zzbke zzbkeVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbkeVar);
        }
    }
}
