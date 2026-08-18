package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxi extends zzbwv {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbxj zzb;

    public zzbxi(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbxj zzbxjVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        zzbxj zzbxjVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbxjVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbxjVar);
    }
}
