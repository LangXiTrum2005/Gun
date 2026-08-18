package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzcda implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcde zzj;

    public zzcda(zzcde zzcdeVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
        this.zzj = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapV = AbstractC3950lJ.v(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapV.put("src", this.zza);
        mapV.put("cachedSrc", this.zzb);
        mapV.put("bytesLoaded", Integer.toString(this.zzc));
        mapV.put("totalBytes", Integer.toString(this.zzd));
        mapV.put("bufferedDuration", Long.toString(this.zze));
        mapV.put("totalDuration", Long.toString(this.zzf));
        mapV.put("cacheReady", true != this.zzg ? "0" : "1");
        mapV.put("playerCount", Integer.toString(this.zzh));
        mapV.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcde.zze(this.zzj, "onPrecacheEvent", mapV);
    }
}
