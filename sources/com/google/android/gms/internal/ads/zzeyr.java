package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyr implements zzezf {
    private final zzfdw zza;
    private final Executor zzb;
    private final zzgcd zzc = new zzeyp(this);

    public zzeyr(zzfdw zzfdwVar, Executor executor) {
        this.zza = zzfdwVar;
        this.zzb = executor;
    }

    public final /* synthetic */ AI zza(zzcuz zzcuzVar, zzeyz zzeyzVar) throws Exception {
        zzfdw zzfdwVar = this.zza;
        zzfeg zzfegVar = zzeyzVar.zzb;
        zzbvk zzbvkVar = zzeyzVar.zza;
        zzfef zzfefVarZzb = zzfdwVar.zzb(zzfegVar);
        if (zzfefVarZzb != null && zzbvkVar != null) {
            zzgch.zzr(zzcuzVar.zzb().zzg(zzbvkVar), this.zzc, this.zzb);
        }
        return zzgch.zzh(new zzeyq(zzfegVar, zzbvkVar, zzfefVarZzb));
    }

    public final AI zzb(zzezg zzezgVar, zzeze zzezeVar, final zzcuz zzcuzVar) {
        return (zzgby) zzgch.zze((zzgby) zzgch.zzn(zzgby.zzu(new zzezb(this.zza, zzcuzVar, this.zzb).zzc()), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzeyn
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zza(zzcuzVar, (zzeyz) obj);
            }
        }, this.zzb), Exception.class, new zzeyo(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ AI zzc(zzezg zzezgVar, zzeze zzezeVar, Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
