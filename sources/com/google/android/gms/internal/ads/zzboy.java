package com.google.android.gms.internal.ads;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzboy {
    public final List zza;

    public zzboy(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzbox zzboxVar = new zzbox(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzboxVar.zzc);
                arrayList.add(zzboxVar);
                if (i < 0) {
                    Iterator it = zzboxVar.zza.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i = i2;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzv.zzh();
            zzboz.zza(jSONObjectOptJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            zzboz.zza(jSONObjectOptJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            zzboz.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            zzboz.zza(jSONObjectOptJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            zzboz.zza(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong(ToolBar.REFRESH, -1L);
            zzbwi.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
