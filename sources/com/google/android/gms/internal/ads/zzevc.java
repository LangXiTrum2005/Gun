package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevc implements zzetq {

    @Nullable
    @VisibleForTesting
    final String zza;

    @VisibleForTesting
    final int zzb;

    public zzevc(@Nullable String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbs.zzg(jSONObject, "pii");
            jSONObjectZzg.put("pvid", this.zza);
            jSONObjectZzg.put("pvid_s", this.zzb);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
