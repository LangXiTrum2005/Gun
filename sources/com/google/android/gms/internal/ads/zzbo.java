package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbo {

    @Nullable
    public Object zza;

    @Nullable
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbo.class.equals(obj.getClass())) {
            zzbo zzboVar = (zzbo) obj;
            if (Objects.equals(this.zza, zzboVar.zza) && Objects.equals(this.zzb, zzboVar.zzb) && this.zzc == zzboVar.zzc && this.zzd == zzboVar.zzd && this.zzf == zzboVar.zzf && Objects.equals(this.zzg, zzboVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j = this.zzd;
        return this.zzg.hashCode() + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final int zza(int i) {
        return this.zzg.zza(i).zzb;
    }

    public final int zzb() {
        int i = this.zzg.zzb;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zze(int i) {
        return this.zzg.zza(i).zza(-1);
    }

    public final long zzf(int i, int i2) {
        zza zzaVarZza = this.zzg.zza(i);
        return zzaVarZza.zzb != -1 ? zzaVarZza.zzf[i2] : C.TIME_UNSET;
    }

    public final long zzg(int i) {
        long j = this.zzg.zza(i).zza;
        return 0L;
    }

    public final long zzh() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final zzbo zzi(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, zzb zzbVar, boolean z) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z;
        return this;
    }

    public final boolean zzj(int i) {
        zzb();
        if (i != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final boolean zzk(int i) {
        boolean z = this.zzg.zza(i).zzh;
        return false;
    }
}
