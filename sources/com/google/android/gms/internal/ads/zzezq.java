package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzezq implements zzgcd {
    final /* synthetic */ zzelc zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfgw zzc;
    final /* synthetic */ zzdfu zzd;
    final /* synthetic */ zzezr zze;

    public zzezq(zzezr zzezrVar, zzelc zzelcVar, zzfhh zzfhhVar, zzfgw zzfgwVar, zzdfu zzdfuVar) {
        this.zza = zzelcVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfgwVar;
        this.zzd = zzdfuVar;
        this.zze = zzezrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfhh zzfhhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                this.zzd.zzb().zzdz(zzeVarZza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzib)).booleanValue()) {
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezm
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdz(zzeVarZza);
                        }
                    });
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezn
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzdz(zzeVarZza);
                        }
                    });
                }
                zzfdg.zzb(zzeVarZza.zza, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                    zzfhk zzfhkVar = this.zze.zzg;
                    zzfgw zzfgwVar = this.zzc;
                    zzfgwVar.zza(zzeVarZza);
                    zzfgwVar.zzh(th);
                    zzfgwVar.zzg(false);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                } else {
                    zzfhhVar.zzc(zzeVarZza);
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
        zzdeq zzdeqVar = (zzdeq) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                zzbcc zzbccVar = zzbcl.zzib;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                    zzczz zzczzVarZzo = zzdeqVar.zzo();
                    zzczzVarZzo.zza(this.zze.zzd);
                    zzczzVarZzo.zzd(this.zze.zze);
                }
                this.zza.zzb(zzdeqVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezo
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzs();
                        }
                    });
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezp
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzs();
                        }
                    });
                }
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                    zzfhk zzfhkVar = this.zze.zzg;
                    zzfgw zzfgwVar = this.zzc;
                    zzfgwVar.zzb(zzdeqVar.zzq().zzb);
                    zzfgwVar.zzd(zzdeqVar.zzm().zzg());
                    zzfgwVar.zzg(true);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                } else {
                    zzfhhVar.zzg(zzdeqVar.zzq().zzb);
                    zzfhhVar.zze(zzdeqVar.zzm().zzg());
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
