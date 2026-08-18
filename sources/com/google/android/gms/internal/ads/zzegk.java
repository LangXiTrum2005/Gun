package com.google.android.gms.internal.ads;

import android.os.Bundle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegk extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzeiw zzc;
    private final zzdbm zzd;
    private final zzegq zze;
    private final zzedb zzf;

    public zzegk(zzcgx zzcgxVar, zzcva zzcvaVar, zzeiw zzeiwVar, zzdbm zzdbmVar, zzegq zzegqVar, zzedb zzedbVar) {
        this.zza = zzcgxVar;
        this.zzb = zzcvaVar;
        this.zzc = zzeiwVar;
        this.zzd = zzdbmVar;
        this.zze = zzegqVar;
        this.zzf = zzedbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegf
    public final AI zzc(zzfcj zzfcjVar, Bundle bundle, zzfbo zzfboVar, zzfca zzfcaVar) {
        zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzk(zzfcjVar);
        zzcvaVar.zzg(bundle);
        zzcvaVar.zzh(new zzcut(zzfcaVar, zzfboVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzcgx zzcgxVar = this.zza;
        zzcva zzcvaVar2 = this.zzb;
        zzdft zzdftVarZzg = zzcgxVar.zzg();
        zzdftVarZzg.zze(zzcvaVar2.zzl());
        zzdftVarZzg.zzd(this.zzd);
        zzdftVarZzg.zzc(this.zzc);
        zzcsd zzcsdVarZza = zzdftVarZzg.zzf().zza();
        return zzcsdVarZza.zzh(zzcsdVarZza.zzi());
    }
}
