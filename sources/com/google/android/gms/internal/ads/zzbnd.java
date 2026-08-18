package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnd implements zzbjp {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbnr zzb;
    final /* synthetic */ zzbmn zzc;
    final /* synthetic */ zzbns zzd;

    public zzbnd(zzbns zzbnsVar, long j, zzbnr zzbnrVar, zzbmn zzbmnVar) {
        this.zza = j;
        this.zzb = zzbnrVar;
        this.zzc = zzbmnVar;
        this.zzd = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zza) + " ms.");
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.zzd.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzbmn zzbmnVar = this.zzc;
                zzbmnVar.zzq("/log", zzbjo.zzg);
                zzbmnVar.zzq("/result", zzbjo.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
