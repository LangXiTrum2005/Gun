package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
final class zzbdp extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbdq zzb;

    public zzbdp(zzbdq zzbdqVar, String str) {
        this.zza = str;
        this.zzb = zzbdqVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbdq zzbdqVar = this.zzb;
            zzbdqVar.zzg.postMessage(zzbdqVar.zzc(this.zza, str).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbdq zzbdqVar = this.zzb;
            zzbdqVar.zzg.postMessage(zzbdqVar.zzd(this.zza, query).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
