package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes3.dex */
final class zzdvn extends RewardedAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdvs zzc;

    public zzdvn(zzdvs zzdvsVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdvsVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        this.zzc.zzm(zzdvs.zzl(loadAdError), this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(@NonNull RewardedAd rewardedAd) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, rewardedAd, str);
    }
}
