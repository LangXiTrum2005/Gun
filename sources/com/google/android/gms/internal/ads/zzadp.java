package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadp implements zzadm {
    public zzadp(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzadn zzadnVar = new zzadn(j, 0L);
        return new zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
