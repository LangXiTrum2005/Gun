package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbst;

/* JADX INFO: loaded from: classes2.dex */
public class AdLoader {
    private final zzr zza;
    private final Context zzb;
    private final zzbr zzc;

    public static class Builder {
        private final Context zza;
        private final zzbu zzb;

        public Builder(@NonNull Context context, @NonNull String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            zzbu zzbuVarZzd = zzbc.zza().zzd(context, str, new zzbpa());
            this.zza = context2;
            this.zzb = zzbuVarZzd;
        }

        @NonNull
        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzr.zza);
            } catch (RemoteException e) {
                zzo.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.zza, new zzfi().zzc(), zzr.zza);
            }
        }

        @NonNull
        public Builder forAdManagerAdView(@NonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @NonNull AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzj(new zzbic(onAdManagerAdViewLoadedListener), new zzs(this.zza, adSizeArr));
            } catch (RemoteException e) {
                zzo.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }

        @NonNull
        public Builder forCustomFormatAd(@NonNull String str, @NonNull NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbsr zzbsrVar = new zzbsr(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbsrVar.zzb(), zzbsrVar.zza());
            } catch (RemoteException e) {
                zzo.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @NonNull
        public Builder forNativeAd(@NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbst(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzo.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @NonNull
        public Builder withAdListener(@NonNull AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                zzo.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        @NonNull
        public Builder withAdManagerAdViewOptions(@NonNull AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @NonNull
        public Builder withNativeAdOptions(@NonNull NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfl(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        @Deprecated
        public final Builder zza(String str, com.google.android.gms.ads.formats.zzg zzgVar, @Nullable com.google.android.gms.ads.formats.zzf zzfVar) {
            zzbia zzbiaVar = new zzbia(zzgVar, zzfVar);
            try {
                this.zzb.zzh(str, zzbiaVar.zzd(), zzbiaVar.zzc());
            } catch (RemoteException e) {
                zzo.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @Deprecated
        public final Builder zzb(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.zzb.zzk(new zzbid(zziVar));
            } catch (RemoteException e) {
                zzo.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzc(@NonNull com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfl(nativeAdOptions));
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public AdLoader(Context context, zzbr zzbrVar, zzr zzrVar) {
        this.zzb = context;
        this.zzc = zzbrVar;
        this.zza = zzrVar;
    }

    private final void zzb(final zzei zzeiVar) {
        zzbcl.zza(this.zzb);
        if (((Boolean) zzbej.zzc.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zza(zzeiVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzeiVar));
        } catch (RemoteException e) {
            zzo.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e) {
            zzo.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAds(@NonNull AdRequest adRequest, int i) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza), i);
        } catch (RemoteException e) {
            zzo.zzh("Failed to load ads.", e);
        }
    }

    public final /* synthetic */ void zza(zzei zzeiVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzeiVar));
        } catch (RemoteException e) {
            zzo.zzh("Failed to load ad.", e);
        }
    }

    public void loadAd(@NonNull AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
