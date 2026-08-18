package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes2.dex */
final class zzek extends zzbd {
    final /* synthetic */ zzel zza;

    public zzek(zzel zzelVar) {
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzel zzelVar = this.zza;
        zzelVar.zze.zzb(zzelVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbd, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzel zzelVar = this.zza;
        zzelVar.zze.zzb(zzelVar.zzi());
        super.onAdLoaded();
    }
}
