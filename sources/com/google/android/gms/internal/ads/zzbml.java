package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzbml {
    public static void zza(zzbmm zzbmmVar, String str, Map map) {
        try {
            zzbmmVar.zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmm zzbmmVar, String str, JSONObject jSONObject) {
        StringBuilder sbR = DM.r("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(sbR.toString()));
        zzbmmVar.zza(sbR.toString());
    }

    public static void zzc(zzbmm zzbmmVar, String str, String str2) {
        zzbmmVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmm zzbmmVar, String str, JSONObject jSONObject) {
        zzbmmVar.zzb(str, jSONObject.toString());
    }
}
