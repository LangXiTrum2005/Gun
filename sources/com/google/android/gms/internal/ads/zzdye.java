package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdye implements zzdyg {
    private final Map zza;
    private final zzgcs zzb;
    private final zzcyo zzc;

    public zzdye(Map map, zzgcs zzgcsVar, zzcyo zzcyoVar) {
        this.zza = map;
        this.zzb = zzgcsVar;
        this.zzc = zzcyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyg
    public final AI zzb(final zzbvk zzbvkVar) {
        this.zzc.zzdl(zzbvkVar);
        AI aiZzg = zzgch.zzg(new zzdvy(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzic)).split(",")) {
            final zzhfj zzhfjVar = (zzhfj) this.zza.get(str.trim());
            if (zzhfjVar != null) {
                aiZzg = zzgch.zzf(aiZzg, zzdvy.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyc
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final AI zza(Object obj) {
                        return ((zzdyg) zzhfjVar.zzb()).zzb(zzbvkVar);
                    }
                }, this.zzb);
            }
        }
        zzgch.zzr(aiZzg, new zzdyd(this), zzbzw.zzg);
        return aiZzg;
    }
}
