package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbp {
    public static final Object zza = new Object();
    private static final zzar zzp;

    @Nullable
    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;

    @Nullable
    public zzal zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzar zzd = zzp;

    static {
        zzaf zzafVar = new zzaf();
        zzafVar.zza("androidx.media3.common.Timeline");
        zzafVar.zzb(Uri.EMPTY);
        zzp = zzafVar.zzc();
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbp.class.equals(obj.getClass())) {
            zzbp zzbpVar = (zzbp) obj;
            if (Objects.equals(this.zzb, zzbpVar.zzb) && Objects.equals(this.zzd, zzbpVar.zzd) && Objects.equals(this.zzj, zzbpVar.zzj) && this.zze == zzbpVar.zze && this.zzf == zzbpVar.zzf && this.zzg == zzbpVar.zzg && this.zzh == zzbpVar.zzh && this.zzi == zzbpVar.zzi && this.zzk == zzbpVar.zzk && this.zzm == zzbpVar.zzm && this.zzn == zzbpVar.zzn && this.zzo == zzbpVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zzb.hashCode() + EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.zzd.hashCode();
        zzal zzalVar = this.zzj;
        int iHashCode2 = ((iHashCode * 961) + (zzalVar == null ? 0 : zzalVar.hashCode())) * 31;
        long j = this.zze;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.zzf;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.zzg;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j4 = this.zzm;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbp zza(Object obj, @Nullable zzar zzarVar, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable zzal zzalVar, long j4, long j5, int i, int i2, long j6) {
        this.zzb = obj;
        this.zzd = zzarVar == null ? zzp : zzarVar;
        this.zzc = null;
        this.zze = C.TIME_UNSET;
        this.zzf = C.TIME_UNSET;
        this.zzg = C.TIME_UNSET;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzalVar;
        this.zzl = 0L;
        this.zzm = j5;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
