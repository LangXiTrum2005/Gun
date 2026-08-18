package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbos implements zzgbo {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final AI zzb;

    public zzbos(AI ai, String str, zzbnz zzbnzVar, zzbny zzbnyVar) {
        this.zzb = ai;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final AI zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final AI zzb(final Object obj) {
        return zzgch.zzn(this.zzb, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzboq
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj2) {
                return this.zza.zzc(obj, (zzbnt) obj2);
            }
        }, zzbzw.zzg);
    }

    public final /* synthetic */ AI zzc(Object obj, zzbnt zzbntVar) throws Exception {
        zzcab zzcabVar = new zzcab();
        com.google.android.gms.ads.internal.zzv.zzq();
        String string = UUID.randomUUID().toString();
        zzbjo.zzo.zzc(string, new zzbor(this, zzcabVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbntVar.zzl(this.zza, jSONObject);
        return zzcabVar;
    }
}
