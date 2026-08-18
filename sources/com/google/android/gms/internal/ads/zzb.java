package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb {
    public static final zzb zza = new zzb(null, new zza[0], 0, C.TIME_UNSET, 0);
    private static final zza zze = new zza(0).zzb(0);
    private final zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private zzb(@Nullable Object obj, zza[] zzaVarArr, long j, long j2, int i) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzb.class == obj.getClass() && Arrays.equals(this.zzf, ((zzb) obj).zzf);
    }

    public final int hashCode() {
        int i = (int) C.TIME_UNSET;
        return Arrays.hashCode(this.zzf) + (i * 961);
    }

    public final String toString() {
        return AbstractC3888ke0.i("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zza zza(@IntRange(from = 0) int i) {
        return i < 0 ? zze : this.zzf[i];
    }

    public final boolean zzb(int i) {
        zza(-1);
        int i2 = zza.zzi;
        return false;
    }
}
