package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdhf implements zzher {
    private final zzdhd zza;

    public zzdhf(zzdhd zzdhdVar) {
        this.zza = zzdhdVar;
    }

    public static JSONObject zza(zzdhd zzdhdVar) {
        JSONObject jSONObjectZzb = zzdhdVar.zzb();
        zzhez.zzb(jSONObjectZzb);
        return jSONObjectZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        return zza(this.zza);
    }

    public final JSONObject zzc() {
        return zza(this.zza);
    }
}
