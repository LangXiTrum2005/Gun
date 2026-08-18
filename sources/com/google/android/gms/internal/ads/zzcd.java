package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcd {
    public static final zzcd zza = new zzcd(0, 0, 1.0f);

    @IntRange(from = 0)
    public final int zzb;

    @IntRange(from = 0)
    public final int zzc;

    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzcd(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzb == zzcdVar.zzb && this.zzc == zzcdVar.zzc && this.zzd == zzcdVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE;
        float f = this.zzd;
        return Float.floatToRawIntBits(f) + (((i * 31) + this.zzc) * 31);
    }
}
