package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzdwz;
import com.google.android.gms.internal.ads.zzdyi;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.android.gms.internal.ads.zzgch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbi implements zzgbo {
    private final Executor zza;
    private final zzdwz zzb;

    public zzbi(Executor executor, zzdwz zzdwzVar) {
        this.zza = executor;
        this.zzb = zzdwzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* bridge */ /* synthetic */ AI zza(Object obj) throws Exception {
        final zzbvk zzbvkVar = (zzbvk) obj;
        return zzgch.zzn(this.zzb.zzc(zzbvkVar), new zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj2) {
                zzdyi zzdyiVar = (zzdyi) obj2;
                zzbk zzbkVar = new zzbk(new JsonReader(new InputStreamReader(zzdyiVar.zzb())), zzdyiVar.zza());
                zzbvk zzbvkVar2 = zzbvkVar;
                try {
                    zzbkVar.zzb = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzbvkVar2.zza).toString();
                } catch (JSONException unused) {
                    zzbkVar.zzb = "{}";
                }
                if (!zzbvkVar2.zzn.isEmpty()) {
                    try {
                        zzbkVar.zzc = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzbvkVar2.zzn).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgch.zzh(zzbkVar);
            }
        }, this.zza);
    }
}
