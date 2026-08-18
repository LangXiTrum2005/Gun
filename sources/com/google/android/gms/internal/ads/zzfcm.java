package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcm {
    private final JSONObject zza;

    public zzfcm(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Nullable
    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        return this.zza.optBoolean((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfh), true);
    }

    public final int zzc() {
        int iOptInt = this.zza.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
