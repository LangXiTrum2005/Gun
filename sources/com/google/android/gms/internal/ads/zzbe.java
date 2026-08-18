package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbe {
    public static final zzbe zza = new zzbe(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbe(@FloatRange(from = 0.0d, fromInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        zzcw.zzd(f > 0.0f);
        zzcw.zzd(f2 > 0.0f);
        this.zzb = f;
        this.zzc = f2;
        this.zzd = Math.round(f * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbe.class == obj.getClass()) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzb == zzbeVar.zzb && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToRawIntBits = Float.floatToRawIntBits(this.zzb) + 527;
        return Float.floatToRawIntBits(this.zzc) + (iFloatToRawIntBits * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzb), Float.valueOf(this.zzc));
    }

    public final long zza(long j) {
        return j * ((long) this.zzd);
    }
}
