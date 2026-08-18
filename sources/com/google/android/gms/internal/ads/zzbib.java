package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;

/* JADX INFO: loaded from: classes3.dex */
final class zzbib implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zzb;
    final /* synthetic */ zzbic zzc;

    public zzbib(zzbic zzbicVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbyVar;
        this.zzc = zzbicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zza.zzb(this.zzb)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not bind.");
            return;
        }
        zzbic zzbicVar = this.zzc;
        zzbicVar.zza.onAdManagerAdViewLoaded(this.zza);
    }
}
