package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzexz implements zzgcd {
    final /* synthetic */ zzfhh zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzcpq zzc;
    final /* synthetic */ zzeya zzd;

    public zzexz(zzeya zzeyaVar, zzfhh zzfhhVar, zzfgw zzfgwVar, zzcpq zzcpqVar) {
        this.zza = zzfhhVar;
        this.zzb = zzfgwVar;
        this.zzc = zzcpqVar;
        this.zzd = zzeyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfhh zzfhhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        synchronized (this.zzd) {
            try {
                com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzc.zzd().zza(th);
                this.zzd.zzn = zzeVarZza;
                this.zzc.zzf().zzdz(zzeVarZza);
                zzfdg.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
                zzeya zzeyaVar = this.zzd;
                if (zzeyaVar.zzm) {
                    zzeyaVar.zzt();
                    zzeya zzeyaVar2 = this.zzd;
                    zzeyaVar2.zzh.zzd(zzeyaVar2.zzj.zzc());
                }
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zza) == null) {
                    zzfhk zzfhkVar = this.zzd.zzi;
                    zzfgw zzfgwVar = this.zzb;
                    zzfgwVar.zza(zzeVarZza);
                    zzfgwVar.zzh(th);
                    zzfgwVar.zzg(false);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                } else {
                    zzfhhVar.zzc(zzeVarZza);
                    zzfgw zzfgwVar2 = this.zzb;
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
        zzcom zzcomVar = (zzcom) obj;
        synchronized (this.zzd) {
            try {
                zzeya zzeyaVar = this.zzd;
                if (zzeyaVar.zzm) {
                    zzeyaVar.zzq();
                }
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zza) == null) {
                    zzfhk zzfhkVar = this.zzd.zzi;
                    zzfgw zzfgwVar = this.zzb;
                    zzfgwVar.zzb(zzcomVar.zzq().zzb);
                    zzfgwVar.zzd(zzcomVar.zzm().zzg());
                    zzfgwVar.zzg(true);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                } else {
                    zzfhhVar.zzg(zzcomVar.zzq().zzb);
                    zzfhhVar.zze(zzcomVar.zzm().zzg());
                    zzfgw zzfgwVar2 = this.zzb;
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
