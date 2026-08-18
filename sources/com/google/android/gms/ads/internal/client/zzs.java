package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final int zzb;

    @SafeParcelable.Field(id = 4)
    public final int zzc;

    @SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @SafeParcelable.Field(id = 6)
    public final int zze;

    @SafeParcelable.Field(id = 7)
    public final int zzf;

    @SafeParcelable.Field(id = 8)
    public final zzs[] zzg;

    @SafeParcelable.Field(id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(id = 11)
    public boolean zzj;

    @SafeParcelable.Field(id = 12)
    public boolean zzk;

    @SafeParcelable.Field(id = 13)
    public boolean zzl;

    @SafeParcelable.Field(id = 14)
    public boolean zzm;

    @SafeParcelable.Field(id = 15)
    public boolean zzn;

    @SafeParcelable.Field(id = 16)
    public boolean zzo;

    public zzs() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    public static zzs zzb() {
        return new zzs("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzs zzc() {
        return new zzs("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzs zzd() {
        return new zzs("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    private static int zze(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzs(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    public zzs(Context context, AdSize[] adSizeArr) {
        int height;
        int i;
        int iZze;
        String str;
        int dimensionPixelSize;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        boolean zZzh = com.google.android.gms.ads.zzc.zzh(adSize);
        this.zzo = zZzh;
        if (zIsFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zza(adSize);
            this.zzb = height;
        } else if (zZzh) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzb(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z = this.zze == -1;
        boolean z2 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            zzbc.zzb();
            if (context.getResources().getConfiguration().orientation == 2) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    zzbc.zzb();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i2 = displayMetrics3.heightPixels;
                        int i3 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i4 = displayMetrics3.heightPixels;
                        int i5 = displayMetrics3.widthPixels;
                        if (i4 == i2 && i5 == i3) {
                            int i6 = displayMetrics.widthPixels;
                            zzbc.zzb();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i6 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.zzf = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.zzf = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.zzf = dimensionPixelSize;
                }
            } else {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.zzf = dimensionPixelSize;
            }
            double d = dimensionPixelSize / displayMetrics.density;
            i = (int) d;
            if (d - ((double) i) >= 0.01d) {
                i++;
            }
        } else {
            i = this.zze;
            zzbc.zzb();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzp(displayMetrics, this.zze);
        }
        if (z2) {
            iZze = zze(displayMetrics);
        } else {
            iZze = this.zzb;
        }
        zzbc.zzb();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzp(displayMetrics, iZze);
        if (z || z2) {
            this.zza = i + "x" + iZze + "_as";
        } else {
            if (this.zzn || this.zzo) {
                str = this.zze + "x" + this.zzb + "_as";
            } else if (zIsFluid) {
                str = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = str;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzs[length];
            for (int i7 = 0; i7 < adSizeArr.length; i7++) {
                this.zzg[i7] = new zzs(context, adSizeArr[i7]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) zzs[] zzsVarArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4, @SafeParcelable.Param(id = 12) boolean z5, @SafeParcelable.Param(id = 13) boolean z6, @SafeParcelable.Param(id = 14) boolean z7, @SafeParcelable.Param(id = 15) boolean z8, @SafeParcelable.Param(id = 16) boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzsVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }
}
