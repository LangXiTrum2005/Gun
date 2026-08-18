package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabw {
    public static final zzabw zza = new zzabw(-3, C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzabw(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzabw zzd(long j, long j2) {
        return new zzabw(-1, j, j2);
    }

    public static zzabw zze(long j) {
        return new zzabw(0, C.TIME_UNSET, j);
    }

    public static zzabw zzf(long j, long j2) {
        return new zzabw(-2, j, j2);
    }
}
