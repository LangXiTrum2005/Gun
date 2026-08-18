package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdlu {
    private final Executor zza;
    private final zzdlp zzb;

    public zzdlu(Executor executor, zzdlp zzdlpVar) {
        this.zza = executor;
        this.zzb = zzdlpVar;
    }

    public final AI zza(JSONObject jSONObject, String str) {
        AI aiZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgch.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                aiZzh = zzgch.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    aiZzh = zzgch.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    aiZzh = TypedValues.Custom.S_STRING.equals(strOptString2) ? zzgch.zzh(new zzdlt(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgch.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzdlr
                        @Override // com.google.android.gms.internal.ads.zzfuc
                        public final Object apply(Object obj) {
                            return new zzdlt(strOptString, (zzbfj) obj);
                        }
                    }, this.zza) : zzgch.zzh(null);
                }
            }
            arrayList.add(aiZzh);
        }
        return zzgch.zzm(zzgch.zzd(arrayList), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdlt zzdltVar : (List) obj) {
                    if (zzdltVar != null) {
                        arrayList2.add(zzdltVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
