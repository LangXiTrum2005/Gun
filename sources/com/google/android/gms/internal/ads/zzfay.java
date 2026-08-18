package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzfay implements zzgcd {
    final /* synthetic */ zzelc zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfgw zzc;
    final /* synthetic */ zzfaz zzd;
    final /* synthetic */ zzfbb zze;

    public zzfay(zzfbb zzfbbVar, zzelc zzelcVar, zzfhh zzfhhVar, zzfgw zzfgwVar, zzfaz zzfazVar) {
        this.zza = zzelcVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfgwVar;
        this.zzd = zzfazVar;
        this.zze = zzfbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzfhh zzfhhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzdof zzdofVar = (zzdof) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdofVar == null ? zzfdk.zzb(th, null) : zzdofVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                if (zzdofVar != null) {
                    zzdofVar.zza().zzdz(zzeVarZzb);
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaw
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdz(zzeVarZzb);
                        }
                    });
                } else {
                    this.zze.zzd.zzdz(zzeVarZzb);
                    this.zze.zzk(this.zzd).zzh().zzb().zzc().zzh();
                }
                zzfdg.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                    zzfhk zzfhkVar = this.zze.zzg;
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
        zzdoa zzdoaVar = (zzdoa) obj;
        synchronized (this.zze) {
            try {
                zzdoaVar.zzo().zzd(this.zze.zzd);
                this.zza.zzb(zzdoaVar);
                zzfbb zzfbbVar = this.zze;
                Executor executor = zzfbbVar.zzb;
                final zzfar zzfarVar = zzfbbVar.zzd;
                Objects.requireNonNull(zzfarVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfax
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfarVar.zzs();
                    }
                });
                this.zze.zzd.onAdMetadataChanged();
                if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzfhhVar = this.zzb) == null) {
                    zzfhk zzfhkVar = this.zze.zzg;
                    zzfgw zzfgwVar = this.zzc;
                    zzfgwVar.zzb(zzdoaVar.zzq().zzb);
                    zzfgwVar.zzd(zzdoaVar.zzm().zzg());
                    zzfgwVar.zzg(true);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                } else {
                    zzfhhVar.zzg(zzdoaVar.zzq().zzb);
                    zzfhhVar.zze(zzdoaVar.zzm().zzg());
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
