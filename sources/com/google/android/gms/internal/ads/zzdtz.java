package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzdtz extends zzblq {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfgw zzd;
    final /* synthetic */ zzcab zze;
    final /* synthetic */ zzdua zzf;

    public zzdtz(zzdua zzduaVar, Object obj, String str, long j, zzfgw zzfgwVar, zzcab zzcabVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfgwVar;
        this.zze = zzcabVar;
        this.zzf = zzduaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfhk zzfhkVar = this.zzf.zzp;
            zzfgw zzfgwVar = this.zzd;
            zzfgwVar.zzc(str);
            zzfgwVar.zzg(false);
            zzfhkVar.zzb(zzfgwVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfhk zzfhkVar = this.zzf.zzp;
            zzfgw zzfgwVar = this.zzd;
            zzfgwVar.zzg(true);
            zzfhkVar.zzb(zzfgwVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
