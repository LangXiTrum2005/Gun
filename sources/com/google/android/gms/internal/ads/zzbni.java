package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzbni implements zzcad {
    final /* synthetic */ zzbnr zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzbns zzc;

    public zzbni(zzbns zzbnsVar, zzbnr zzbnrVar, zzfgw zzfgwVar) {
        this.zza = zzbnrVar;
        this.zzb = zzfgwVar;
        this.zzc = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcad
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                this.zzc.zzi = 1;
                com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzb();
                if (((Boolean) zzbee.zzd.zze()).booleanValue()) {
                    zzbns zzbnsVar = this.zzc;
                    if (zzbnsVar.zze != null) {
                        zzfhk zzfhkVar = zzbnsVar.zze;
                        zzfgw zzfgwVar = this.zzb;
                        zzfgwVar.zzc("Failed loading new engine");
                        zzfgwVar.zzg(false);
                        zzfhkVar.zzb(zzfgwVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
