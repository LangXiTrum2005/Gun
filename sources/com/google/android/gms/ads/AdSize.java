package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.badlogic.gdx.Input;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;

/* JADX INFO: loaded from: classes2.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    @NonNull
    public static final AdSize BANNER = new AdSize(EnumC4719u30.WEBVIEW_ERROR_VALUE, 50, "320x50_mb");

    @NonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");

    @NonNull
    public static final AdSize LARGE_BANNER = new AdSize(EnumC4719u30.WEBVIEW_ERROR_VALUE, 100, "320x100_as");

    @NonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");

    @NonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");

    @NonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(Input.Keys.NUMPAD_ENTER, 600, "160x600_as");

    @NonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");

    @NonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");

    @NonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");

    @NonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    @NonNull
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i, int i2) {
        this(i, i2, AbstractC3888ke0.j(i == -1 ? "FULL" : String.valueOf(i), "x", i2 == -2 ? "AUTO" : String.valueOf(i2), "_as"));
    }

    @NonNull
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 0);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    @NonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (iZza == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    @Deprecated
    public static AdSize getCurrentOrientationInterscrollerAdSize(@NonNull Context context, int i) {
        return zzj(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0));
    }

    @NonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = i2;
        adSize.zzf = true;
        if (i2 < 32) {
            zzo.zzj("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    @NonNull
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 2);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    @NonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    @Deprecated
    public static AdSize getLandscapeInterscrollerAdSize(@NonNull Context context, int i) {
        return zzj(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2));
    }

    @NonNull
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@NonNull Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 1);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    @NonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@NonNull Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    @NonNull
    @Deprecated
    public static AdSize getPortraitInterscrollerAdSize(@NonNull Context context, int i) {
        return zzj(i, com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1));
    }

    private static AdSize zzj(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzi = i2;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(@NonNull Context context) {
        int i = this.zzc;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzs.zza(context.getResources().getDisplayMetrics());
        }
        zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i);
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(@NonNull Context context) {
        int i = this.zzb;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            zzbc.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzs> creator = zzs.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @NonNull
    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i) {
        this.zzg = i;
    }

    public final void zzd(int i) {
        this.zzi = i;
    }

    public final void zze(boolean z) {
        this.zzf = true;
    }

    public final void zzf(boolean z) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("Invalid width for AdSize: ", i));
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("Invalid height for AdSize: ", i2));
        }
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
    }
}
