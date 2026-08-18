package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzdta {

    @Nullable
    private Long zza;
    private final String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private Integer zzd;

    @Nullable
    private String zze;

    @Nullable
    private Integer zzf;

    public /* synthetic */ zzdta(String str, zzdtb zzdtbVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdta zzdtaVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjQ);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtaVar.zza);
            jSONObject.put("eventCategory", zzdtaVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdtaVar.zzc);
            jSONObject.putOpt("errorCode", zzdtaVar.zzd);
            jSONObject.putOpt("rewardType", zzdtaVar.zze);
            jSONObject.putOpt("rewardAmount", zzdtaVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
        return AbstractC3888ke0.j(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
