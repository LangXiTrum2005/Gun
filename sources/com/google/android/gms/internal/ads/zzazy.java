package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazy extends zzbaf {

    @Nullable
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzazy(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzd(zzbad zzbadVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzazz(zzbadVar, this.zzb));
        }
    }
}
