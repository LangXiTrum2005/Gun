package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzccz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcde zzk;

    public zzccz(zzcde zzcdeVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = z;
        this.zzi = i;
        this.zzj = i2;
        this.zzk = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapV = AbstractC3950lJ.v(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapV.put("src", this.zza);
        mapV.put("cachedSrc", this.zzb);
        mapV.put("bufferedDuration", Long.toString(this.zzc));
        mapV.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue()) {
            mapV.put("qoeLoadedBytes", Long.toString(this.zze));
            mapV.put("qoeCachedBytes", Long.toString(this.zzf));
            mapV.put("totalBytes", Long.toString(this.zzg));
            mapV.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
        }
        mapV.put("cacheReady", true != this.zzh ? "0" : "1");
        mapV.put("playerCount", Integer.toString(this.zzi));
        mapV.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcde.zze(this.zzk, "onPrecacheEvent", mapV);
    }
}
