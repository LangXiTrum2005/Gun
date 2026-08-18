package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzelj implements zzgcd {
    final /* synthetic */ zzelc zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfgw zzc;
    final /* synthetic */ zzdgq zzd;
    final /* synthetic */ zzelk zze;

    public zzelj(zzelk zzelkVar, zzelc zzelcVar, zzfhh zzfhhVar, zzfgw zzfgwVar, zzdgq zzdgqVar) {
        this.zza = zzelcVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfgwVar;
        this.zzd = zzdgqVar;
        this.zze = zzelkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfhh zzfhhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdz(zzeVarZza);
        this.zze.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeli
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze.zzd.zza().zzdz(zzeVarZza);
            }
        });
        zzfdg.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbee.zzc.zze()).booleanValue() && (zzfhhVar = this.zzb) != null) {
            zzfhhVar.zzc(zzeVarZza);
            zzfgw zzfgwVar = this.zzc;
            zzfgwVar.zzh(th);
            zzfgwVar.zzg(false);
            zzfhhVar.zza(zzfgwVar);
            zzfhhVar.zzh();
            return;
        }
        zzelk zzelkVar = this.zze;
        zzfgw zzfgwVar2 = this.zzc;
        zzfhk zzfhkVar = zzelkVar.zze;
        zzfgwVar2.zza(zzeVarZza);
        zzfgwVar2.zzh(th);
        zzfgwVar2.zzg(false);
        zzfhkVar.zzb(zzfgwVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhh zzfhhVar;
        zzcqz zzcqzVar = (zzcqz) obj;
        synchronized (this.zze) {
            try {
                zzcqzVar.zzo().zza(this.zze.zzd.zzd());
                this.zza.zzb(zzcqzVar);
                this.zze.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzb().zzs();
                    }
                });
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                    zzfhk zzfhkVar = this.zze.zze;
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
