package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MediationUtils {
    protected static final double MIN_HEIGHT_RATIO = 0.7d;
    protected static final double MIN_WIDTH_RATIO = 0.5d;

    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x003a A[SYNTHETIC] */
    @Nullable
    public static AdSize findClosestSize(@NonNull Context context, @NonNull AdSize adSize, @NonNull List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.zzh() && !adSize.zzi()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f), Math.round(adSize.getHeightInPixels(context) / f));
            }
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    double d = ((double) width) * MIN_WIDTH_RATIO;
                    double d2 = width2;
                    int height2 = adSize3.getHeight();
                    if (d <= d2 && width >= width2) {
                        if (adSize.zzi()) {
                            int iZza = adSize.zza();
                            if (((Integer) zzbe.zzc().zza(zzbcl.zzhL)).intValue() <= width2) {
                                if (((Integer) zzbe.zzc().zza(zzbcl.zzhM)).intValue() <= height2 && iZza >= height2) {
                                    if (adSize2 != null) {
                                        if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                        }
                                    }
                                    adSize2 = adSize3;
                                }
                            }
                        } else if (adSize.zzh()) {
                            if (adSize.zzb() >= height2) {
                                if (adSize2 != null) {
                                    if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                    }
                                }
                                adSize2 = adSize3;
                            }
                        } else if (((double) height) * MIN_HEIGHT_RATIO <= height2 && height >= height2) {
                            if (adSize2 != null) {
                                if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                }
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
