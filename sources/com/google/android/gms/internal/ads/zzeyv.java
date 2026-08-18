package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyv implements zzezf {
    private final zzezf zza;

    @Nullable
    private zzcuz zzb;

    public zzeyv(zzezf zzezfVar) {
        this.zza = zzezfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    @Nullable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zzb;
    }

    public final synchronized AI zzb(zzezg zzezgVar, zzeze zzezeVar, @Nullable zzcuz zzcuzVar) {
        zzbvk zzbvkVar;
        this.zzb = zzcuzVar;
        if (zzcuzVar == null || (zzbvkVar = zzezgVar.zza) == null) {
            return ((zzeyu) this.zza).zzb(zzezgVar, zzezeVar, zzcuzVar);
        }
        zzcsd zzcsdVarZzb = zzcuzVar.zzb();
        return zzcsdVarZzb.zzh(zzcsdVarZzb.zzj(zzgch.zzh(zzbvkVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ AI zzc(zzezg zzezgVar, zzeze zzezeVar, @Nullable Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }
}
