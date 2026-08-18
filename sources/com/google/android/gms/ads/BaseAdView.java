package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbuh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseAdView extends ViewGroup {
    protected final zzel zza;

    public BaseAdView(@NonNull Context context, int i) {
        super(context);
        this.zza = new zzel(this, i);
    }

    public void destroy() {
        zzbcl.zza(getContext());
        if (((Boolean) zzbej.zze.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkX)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzk();
                        } catch (IllegalStateException e) {
                            zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzk();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.zza.zza();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    @NonNull
    public String getAdUnitId() {
        return this.zza.zzj();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isCollapsible() {
        return this.zza.zzA();
    }

    public boolean isLoading() {
        return this.zza.zzB();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull final AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(getContext());
        if (((Boolean) zzbej.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzm(adRequest.zza);
                        } catch (IllegalStateException e) {
                            zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest.zza);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzo.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        zzbcl.zza(getContext());
        if (((Boolean) zzbej.zzg.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkY)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzn();
                        } catch (IllegalStateException e) {
                            zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        zzbcl.zza(getContext());
        if (((Boolean) zzbej.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkW)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzp();
                        } catch (IllegalStateException e) {
                            zzbuh.zza(baseAdView.getContext()).zzh(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@NonNull AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == 0) {
            this.zza.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.zza.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new zzel(this, attributeSet, false, i);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zza = new zzel(this, attributeSet, false, i2);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.zza = new zzel(this, attributeSet, z, i2);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new zzel(this, attributeSet, z);
    }
}
