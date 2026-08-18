package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwc extends zzbq {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;

    @Nullable
    private final zzar zzf;

    @Nullable
    private final zzal zzg;

    static {
        zzaf zzafVar = new zzaf();
        zzafVar.zza("SinglePeriodTimeline");
        zzafVar.zzb(Uri.EMPTY);
        zzafVar.zzc();
    }

    public zzwc(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, zzar zzarVar, @Nullable zzal zzalVar) {
        this.zzc = j4;
        this.zzd = j5;
        this.zze = z;
        zzarVar.getClass();
        this.zzf = zzarVar;
        this.zzg = zzalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int i, zzbo zzboVar, boolean z) {
        zzcw.zza(i, 0, 1);
        zzboVar.zzi(null, z ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbp zze(int i, zzbp zzbpVar, long j) {
        zzcw.zza(i, 0, 1);
        Object obj = zzbp.zza;
        zzar zzarVar = this.zzf;
        long j2 = this.zzd;
        zzbpVar.zza(obj, zzarVar, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.zze, false, this.zzg, 0L, j2, 0, 0, 0L);
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final Object zzf(int i) {
        zzcw.zza(i, 0, 1);
        return zzb;
    }
}
