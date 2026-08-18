package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.umeng.analytics.pro.bc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbox {
    public final List zza;
    public final String zzb;

    @Nullable
    public final String zzc;

    public zzbox(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(bc.aC);
        if (jSONObjectOptJSONObject != null) {
            com.google.android.gms.ads.internal.zzv.zzh();
            zzboz.zza(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.zzb = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzv.zzh();
        zzboz.zza(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
