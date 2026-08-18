package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyu implements zzezf {

    @Nullable
    private zzcuz zza;

    @Override // com.google.android.gms.internal.ads.zzezf
    @Nullable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zza;
    }

    public final synchronized AI zzb(zzezg zzezgVar, zzeze zzezeVar, @Nullable zzcuz zzcuzVar) {
        zzcsd zzcsdVarZzb;
        try {
            if (zzcuzVar != null) {
                this.zza = zzcuzVar;
            } else {
                this.zza = (zzcuz) zzezeVar.zza(zzezgVar.zzb).zzh();
            }
            zzcsdVarZzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzcsdVarZzb.zzh(zzcsdVarZzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ AI zzc(zzezg zzezgVar, zzeze zzezeVar, @Nullable Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }
}
