package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzcdb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcde zzd;

    public zzcdb(zzcde zzcdeVar, String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = zzcdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapV = AbstractC3950lJ.v(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        mapV.put("src", this.zza);
        mapV.put("cachedSrc", this.zzb);
        mapV.put("totalBytes", Integer.toString(this.zzc));
        zzcde.zze(this.zzd, "onPrecacheEvent", mapV);
    }
}
