package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcll implements zzclb {
    private final zzduv zza;

    public zzcll(zzduv zzduvVar) {
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjd)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
