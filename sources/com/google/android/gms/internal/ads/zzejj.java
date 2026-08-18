package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.ads.mediation.mintegral.MintegralConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejj {

    @GuardedBy("this")
    private final Map zza = new HashMap();

    @GuardedBy("this")
    private final Map zzb = new HashMap();

    @GuardedBy("this")
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;

    @Nullable
    private JSONObject zzg;

    public zzejj(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzfxq zzh(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc())) {
                boolean zMatches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdn), str);
                boolean zMatches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdo), str);
                if (zMatches) {
                    map = new HashMap(this.zze);
                } else if (zMatches2) {
                    map = new HashMap(this.zzd);
                }
                return zzfxq.zzc(map);
            }
            return zzfxq.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) arrayList2.get(i2);
                        zzg(str2);
                        if (((zzejl) this.zza.get(str2)) != null) {
                            arrayList.add(new zzejl(str2, str, bundleZzo));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    private final synchronized void zzk() {
        JSONObject jSONObjectZzf;
        try {
            if (!((Boolean) zzber.zzb.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbU)).booleanValue() && (jSONObjectZzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf()) != null) {
                    try {
                        JSONArray jSONArray = jSONObjectZzf.getJSONArray("adapter_settings");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String strOptString = jSONObject.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                                    boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject2.optString("platform");
                                    zzejn zzejnVar = new zzejn(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.zzd.put(strOptString, zzejnVar);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.zze.put(strOptString, zzejnVar);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.zzc.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.zzc.put(str, map);
            List arrayList = (List) map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzm() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf();
            if (jSONObjectZzf != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                    this.zzg = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkM)).booleanValue() ? jSONObject.optString(MintegralConstants.AD_UNIT_ID, "").toLowerCase(Locale.ROOT) : jSONObject.optString(MintegralConstants.AD_UNIT_ID, "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    arrayList.addAll(zzi(jSONArrayOptJSONArray.getJSONObject(i2), strOptString));
                                }
                            }
                            zzl(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzn() {
        JSONObject jSONObjectZzf;
        if (!((Boolean) zzber.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbT)).booleanValue() && (jSONObjectZzf = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzf()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzejn(strOptString, zOptBoolean2, zOptBoolean, true, bundleZzo));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private static final Bundle zzo(@Nullable JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap map;
        try {
            Map mapZzb = zzb(str, str2);
            zzfxq zzfxqVarZzh = zzh(str2);
            map = new HashMap();
            for (Map.Entry entry : ((zzfxq) mapZzb).entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzfxqVarZzh.containsKey(str3)) {
                    zzejn zzejnVar = (zzejn) zzfxqVarZzh.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new zzejn(str3, zzejnVar.zzb, zzejnVar.zzc, zzejnVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzfzt zzfztVarZze = zzfxqVarZzh.entrySet().iterator();
            while (zzfztVarZze.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzfztVarZze.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((zzejn) entry2.getValue()).zzd) {
                    map.put(str4, (zzejn) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzejl> list = (List) map.get(str2);
                if (list == null) {
                    String strZza = zzdpt.zza(this.zzg, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkM)).booleanValue()) {
                        strZza = strZza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strZza);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzejl zzejlVar : list) {
                        String str3 = zzejlVar.zza;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzejlVar.zzb);
                    }
                    return zzfxq.zzc(map2);
                }
            }
            return zzfxq.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc())) {
            return zzfxq.zzd();
        }
        return zzfxq.zzc(this.zzb);
    }

    public final void zze() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeji
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
        this.zzf.execute(new zzejh(this));
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzejh(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new zzejl(str, "", new Bundle()));
        }
    }
}
