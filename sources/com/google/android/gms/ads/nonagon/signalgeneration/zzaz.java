package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbyy;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaz {
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final zzbyy zzc;

    public /* synthetic */ zzaz(zzax zzaxVar, zzay zzayVar) {
        this.zza = zzaxVar.zza;
        this.zzb = zzaxVar.zzb;
        this.zzc = zzaxVar.zzc;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final zzbbq.zza.EnumC0136zza zza() {
        byte b;
        switch (this.zza) {
            case "NATIVE":
                b = 2;
                break;
            case "INTERSTITIAL":
                b = 1;
                break;
            case "REWARDED":
                b = 3;
                break;
            case "BANNER":
                b = 0;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return zzbbq.zza.EnumC0136zza.BANNER;
        }
        if (b == 1) {
            return zzbbq.zza.EnumC0136zza.INTERSTITIAL;
        }
        if (b != 2) {
            return b != 3 ? zzbbq.zza.EnumC0136zza.AD_INITIATER_UNSPECIFIED : zzbbq.zza.EnumC0136zza.REWARD_BASED_VIDEO_AD;
        }
        return zzbbq.zza.EnumC0136zza.AD_LOADER;
    }

    @Nullable
    public final zzbyy zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    @Nullable
    public final String zzd() {
        return this.zzb;
    }

    public final Set zze() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
