package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfbt {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfbt(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
        this.zzd = jSONObjectZzi;
        this.zza = jSONObjectZzi.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.zzb = jSONObjectZzi.optString("ad_base_url", null);
        this.zzc = jSONObjectZzi.optJSONObject("ad_json");
    }
}
