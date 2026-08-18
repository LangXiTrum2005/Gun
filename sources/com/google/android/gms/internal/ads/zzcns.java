package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcns implements zzher {
    private final zzhfj zza;

    public zzcns(zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcrq) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
