package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.ads.mediation.mintegral.MintegralConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpr {

    @Nullable
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;

    @Nullable
    private JSONObject zze;
    private final Map zza = new ConcurrentHashMap();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzdpr(Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze() {
        JSONObject jSONObjectZzf;
        Map map;
        try {
            this.zzd = true;
            zzbzg zzbzgVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
            if (zzbzgVarZzg != null && (jSONObjectZzf = zzbzgVarZzg.zzf()) != null) {
                this.zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzef)).booleanValue() ? jSONObjectZzf.optJSONObject("common_settings") : null;
                this.zze = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString(MintegralConstants.AD_UNIT_ID);
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.zza.containsKey(strOptString2)) {
                                    map = (Map) this.zza.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.zza.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @CheckForNull
    public final JSONObject zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzef)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    @CheckForNull
    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzed)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zze();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzee)).booleanValue()) {
                zzg();
            }
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strZza = zzdpt.zza(this.zze, str, str2);
        if (strZza != null) {
            return (JSONObject) map.get(strZza);
        }
        return null;
    }

    public final void zzd() {
        zzg();
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
    }

    public final /* synthetic */ void zzf() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
    }
}
