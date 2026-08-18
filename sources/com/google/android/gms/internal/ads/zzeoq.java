package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeoq implements zzetq {

    @Nullable
    private final JSONObject zza;

    @Nullable
    private final JSONObject zzb;

    public zzeoq(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.zza = jSONObject;
        this.zzb = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = this.zzb;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (jSONObject != null) {
            zzcuvVar.zzb.putString("fwd_common_cld", jSONObject.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        JSONObject jSONObject = this.zza;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.zzb;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
