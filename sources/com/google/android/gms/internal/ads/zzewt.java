package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzewt implements zzgcd {
    final /* synthetic */ zzelc zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfgw zzc;
    final /* synthetic */ zzewu zzd;
    final /* synthetic */ zzeww zze;

    public zzewt(zzeww zzewwVar, zzelc zzelcVar, zzfhh zzfhhVar, zzfgw zzfgwVar, zzewu zzewuVar) {
        this.zza = zzelcVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfgwVar;
        this.zzd = zzewuVar;
        this.zze = zzewwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfhh zzfhhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzcnw zzcnwVar = (zzcnw) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcnwVar == null ? zzfdk.zzb(th, null) : zzcnwVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (zzcnwVar != null) {
                    zzcnwVar.zzc().zzdz(zzeVarZzb);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
                        this.zze.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzews
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zze.zzd.zzdz(zzeVarZzb);
                            }
                        });
                    }
                } else {
                    this.zze.zzd.zzdz(zzeVarZzb);
                    ((zzcnw) this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzh();
                }
                zzfdg.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                    zzfhk zzfhkVar = this.zze.zzh;
                    zzfgw zzfgwVar = this.zzc;
                    zzfgwVar.zza(zzeVarZzb);
                    zzfgwVar.zzh(th);
                    zzfgwVar.zzg(false);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                } else {
                    zzfhhVar.zzc(zzeVarZzb);
                    zzfgw zzfgwVar2 = this.zzc;
                    zzfgwVar2.zzh(th);
                    zzfgwVar2.zzg(false);
                    zzfhhVar.zza(zzfgwVar2);
                    zzfhhVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhh zzfhhVar;
        zzcqz zzcqzVar = (zzcqz) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
                    zzcqzVar.zzo().zzb(this.zze.zzd);
                }
                this.zza.zzb(zzcqzVar);
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                    zzfhk zzfhkVar = this.zze.zzh;
                    zzfgw zzfgwVar = this.zzc;
                    zzfgwVar.zzb(zzcqzVar.zzq().zzb);
                    zzfgwVar.zzd(zzcqzVar.zzm().zzg());
                    zzfgwVar.zzg(true);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                } else {
                    zzfhhVar.zzg(zzcqzVar.zzq().zzb);
                    zzfhhVar.zze(zzcqzVar.zzm().zzg());
                    zzfgw zzfgwVar2 = this.zzc;
                    zzfgwVar2.zzg(true);
                    zzfhhVar.zza(zzfgwVar2);
                    zzfhhVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
