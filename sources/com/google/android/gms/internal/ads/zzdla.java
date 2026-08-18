package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdla {
    private final zzgcs zza;
    private final zzdlp zzb;
    private final zzdlu zzc;

    public zzdla(zzgcs zzgcsVar, zzdlp zzdlpVar, zzdlu zzdluVar) {
        this.zza = zzgcsVar;
        this.zzb = zzdlpVar;
        this.zzc = zzdluVar;
    }

    public static final /* synthetic */ zzdif zzb(AI ai, AI ai2, AI ai3, AI ai4, AI ai5, JSONObject jSONObject, AI ai6, AI ai7, AI ai8, AI ai9, AI ai10) throws Exception {
        zzdif zzdifVar = (zzdif) ai.get();
        zzdifVar.zzP((List) ai2.get());
        zzdifVar.zzM((zzbfw) ai3.get());
        zzdifVar.zzQ((zzbfw) ai4.get());
        zzdifVar.zzJ((zzbfp) ai5.get());
        zzdifVar.zzS(zzdlp.zzj(jSONObject));
        zzdifVar.zzL(zzdlp.zzi(jSONObject));
        zzcex zzcexVar = (zzcex) ai6.get();
        if (zzcexVar != null) {
            zzdifVar.zzad(zzcexVar);
            zzdifVar.zzac(zzcexVar.zzF());
            zzdifVar.zzab(zzcexVar.zzq());
        }
        zzdifVar.zzd().putAll((Bundle) ai7.get());
        zzcex zzcexVar2 = (zzcex) ai8.get();
        if (zzcexVar2 != null) {
            zzdifVar.zzO(zzcexVar2);
            zzdifVar.zzae(zzcexVar2.zzF());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfl)).booleanValue() || zzc(jSONObject)) {
            zzcex zzcexVar3 = (zzcex) ai9.get();
            if (zzcexVar3 != null) {
                zzdifVar.zzT(zzcexVar3);
            }
        } else {
            zzdifVar.zzU(ai9);
            zzdifVar.zzX(new zzcab());
        }
        for (zzdlt zzdltVar : (List) ai10.get()) {
            if (zzdltVar.zza != 1) {
                zzdifVar.zzN(zzdltVar.zzb, zzdltVar.zzd);
            } else {
                zzdifVar.zzZ(zzdltVar.zzb, zzdltVar.zzc);
            }
        }
        return zzdifVar;
    }

    private static final boolean zzc(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.gms.internal.ads.zzdkw] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.google.android.gms.internal.ads.zzdkx] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.gms.internal.ads.zzdky] */
    public final AI zza(final zzfca zzfcaVar, final zzfbo zzfboVar, final JSONObject jSONObject) {
        final AI aiZzh;
        JSONObject jSONObjectOptJSONObject;
        AI aiZzh2;
        final AI aiZzb = this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdkv
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzegu {
                zzdif zzdifVar = new zzdif();
                JSONObject jSONObject2 = jSONObject;
                zzdifVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdifVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                zzfca zzfcaVar2 = zzfcaVar;
                zzdifVar.zzV(strOptString);
                zzfcj zzfcjVar = zzfcaVar2.zza.zza;
                if (!zzfcjVar.zzg.contains(Integer.toString(zzdifVar.zzc()))) {
                    throw new zzegu(1, AbstractC3950lJ.p("Invalid template ID: ", zzdifVar.zzc()));
                }
                if (zzdifVar.zzc() == 3) {
                    if (zzdifVar.zzA() == null) {
                        throw new zzegu(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfcjVar.zzh.contains(zzdifVar.zzA())) {
                        throw new zzegu(1, "Unexpected custom template id in the response.");
                    }
                }
                zzfbo zzfboVar2 = zzfboVar;
                zzdifVar.zzY(jSONObject2.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (zzfboVar2.zzM) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    strOptString2 = DM.i(com.google.android.gms.ads.internal.util.zzs.zzz(), " : ", strOptString2);
                }
                zzdifVar.zzZ("headline", strOptString2);
                zzdifVar.zzZ(TtmlNode.TAG_BODY, jSONObject2.optString(TtmlNode.TAG_BODY, null));
                zzdifVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdifVar.zzZ("store", jSONObject2.optString("store", null));
                zzdifVar.zzZ("price", jSONObject2.optString("price", null));
                zzdifVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdifVar;
            }
        });
        final AI aiZzf = this.zzb.zzf(jSONObject, "images");
        zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        zzdlp zzdlpVar = this.zzb;
        final AI aiZzg = zzdlpVar.zzg(jSONObject, "images", zzfboVar, zzfbrVar);
        final AI aiZze = zzdlpVar.zze(jSONObject, "secondary_image");
        final AI aiZze2 = zzdlpVar.zze(jSONObject, "app_icon");
        final AI aiZzd = zzdlpVar.zzd(jSONObject, "attribution");
        final AI aiZzh3 = this.zzb.zzh(jSONObject, zzfboVar, zzfcaVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmO)).booleanValue() && ((Integer) Optional.ofNullable(jSONObject.optJSONObject("video")).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdkw
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((JSONObject) obj).optJSONArray("flags");
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdkx
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        return jSONObjectOptJSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    }
                }
                return null;
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzdky
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        }).orElse(0)).intValue() == 3) {
            zzdlp zzdlpVar2 = this.zzb;
            zzcab zzcabVar = new zzcab();
            zzgch.zzr(aiZzh3, new zzdlo(zzdlpVar2, zzcabVar), zzbzw.zzf);
            aiZzh = zzcabVar;
        } else {
            aiZzh = zzgch.zzh(new Bundle());
        }
        final AI aiZza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdlp zzdlpVar3 = this.zzb;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            aiZzh2 = TextUtils.isEmpty(strOptString) ? zzgch.zzh(null) : zzgch.zzn(zzgch.zzh(null), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdle
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final AI zza(Object obj) {
                    return zzdlpVar3.zzc(strOptString, obj);
                }
            }, zzbzw.zzf);
        } else {
            aiZzh2 = zzgch.zzh(null);
        }
        final AI ai = aiZzh2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(aiZzb);
        arrayList.add(aiZzf);
        arrayList.add(aiZzg);
        arrayList.add(aiZze);
        arrayList.add(aiZze2);
        arrayList.add(aiZzd);
        arrayList.add(aiZzh3);
        arrayList.add(aiZzh);
        arrayList.add(aiZza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfl)).booleanValue() || zzc(jSONObject)) {
            arrayList.add(ai);
        }
        return zzgch.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdla.zzb(aiZzb, aiZzf, aiZze2, aiZze, aiZzd, jSONObject, aiZzh3, aiZzh, aiZzg, ai, aiZza);
            }
        }, this.zza);
    }
}
