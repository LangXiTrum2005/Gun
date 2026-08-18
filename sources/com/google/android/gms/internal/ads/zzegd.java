package com.google.android.gms.internal.ads;

import android.os.Bundle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegd extends zzegf {
    private final zzcgx zza;
    private final zzdgl zzb;
    private final zzcva zzc;
    private final zzdbm zzd;
    private final zzegq zze;
    private final zzedb zzf;

    public zzegd(zzcgx zzcgxVar, zzdgl zzdglVar, zzcva zzcvaVar, zzdbm zzdbmVar, zzegq zzegqVar, zzedb zzedbVar) {
        this.zza = zzcgxVar;
        this.zzb = zzdglVar;
        this.zzc = zzcvaVar;
        this.zzd = zzdbmVar;
        this.zze = zzegqVar;
        this.zzf = zzedbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegf
    public final AI zzc(zzfcj zzfcjVar, Bundle bundle, zzfbo zzfboVar, zzfca zzfcaVar) {
        zzcva zzcvaVar = this.zzc;
        zzcvaVar.zzk(zzfcjVar);
        zzcvaVar.zzg(bundle);
        zzcvaVar.zzh(new zzcut(zzfcaVar, zzfboVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzc.zze(this.zzf);
        }
        zzcgx zzcgxVar = this.zza;
        zzcva zzcvaVar2 = this.zzc;
        zzdgp zzdgpVarZzh = zzcgxVar.zzh();
        zzdgpVarZzh.zzf(zzcvaVar2.zzl());
        zzdgpVarZzh.zze(this.zzd);
        zzdgpVarZzh.zzd(this.zzb);
        zzdgpVarZzh.zzc(new zzcoj(null));
        zzcsd zzcsdVarZza = zzdgpVarZzh.zzg().zza();
        return zzcsdVarZza.zzh(zzcsdVarZza.zzi());
    }
}
